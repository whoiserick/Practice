package rip.crystal.practice.clan.commands.subcommands;

import rip.crystal.practice.Locale;
import rip.crystal.practice.clan.Clan;
import rip.crystal.practice.nametags.GxNameTag;
import rip.crystal.practice.profile.Profile;
import rip.crystal.practice.utilities.MessageFormat;
import rip.crystal.practice.utilities.TaskUtil;
import rip.crystal.api.command.BaseCommand;
import rip.crystal.api.command.Command;
import rip.crystal.api.command.CommandArgs;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class ClanCreateCommand extends BaseCommand {

    @Command(name = "clan.create")
    @Override
    public void onCommand(CommandArgs commandArgs) {
        Player player = commandArgs.getPlayer();
        String[] args = commandArgs.getArgs();

        String clanName = args[0];
        Profile profile = Profile.get(player.getUniqueId());
        if (profile.getClan() != null) {
            new MessageFormat(Locale.CLAN_ERROR_PLAYER_ALREADY_IN_CLAN
                    .format(profile.getLocale()))
                    .send(player);
            return;
        }
        String deColored = ChatColor.stripColor(clanName);
        if (Clan.getByName(deColored) != null) {
            new MessageFormat(Locale.CLAN_ERROR_ALREADY_EXIST
                    .format(profile.getLocale()))
                    .send(player);
            return;
        }
        if (deColored.length() > 5 || deColored.length() < 2) {
            new MessageFormat(Locale.CLAN_ERROR_MAX_LENGTH_NAME
                    .format(profile.getLocale()))
                    .send(player);
            return;
        }
        Clan clan = new Clan(deColored, player.getUniqueId());
        Clan.getClans().put(deColored, clan);
        profile.setClan(clan);
        clan.getMembers().add(player.getUniqueId());
        new MessageFormat(Locale.CLAN_CREATE.format(profile.getLocale()))
                .add("{name}", deColored)
                .send(player);
        //player.sendMessage(translate("&eThe " + deColored + " clan has been successfully created."));
        clan.save();
        TaskUtil.runAsync(() -> {
            GxNameTag.reloadOthersFor(player);
            GxNameTag.reloadPlayer(player);
        });
    }
}
