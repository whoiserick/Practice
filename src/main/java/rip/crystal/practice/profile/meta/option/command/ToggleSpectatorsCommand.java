package rip.crystal.practice.profile.meta.option.command;

import rip.crystal.practice.Locale;
import rip.crystal.practice.profile.Profile;
import rip.crystal.practice.utilities.MessageFormat;
import rip.crystal.api.command.BaseCommand;
import rip.crystal.api.command.Command;
import rip.crystal.api.command.CommandArgs;
import org.bukkit.entity.Player;

public class ToggleSpectatorsCommand extends BaseCommand {

    @Command(name = "togglespectators", aliases = {"togglespecs", "tgs"})
    @Override
    public void onCommand(CommandArgs commandArgs) {
        Player player = commandArgs.getPlayer();
        Profile profile = Profile.get(player.getUniqueId());
        profile.getOptions().allowSpectators(!profile.getOptions().allowSpectators());

        if (profile.getOptions().allowSpectators()) {
            new MessageFormat(Locale.OPTIONS_SPECTATORS_ENABLED
                    .format(profile.getLocale()))
                    .send(player);
        } else {
            new MessageFormat(Locale.OPTIONS_SPECTATORS_DISABLED
                    .format(profile.getLocale()))
                    .send(player);
        }
    }
}
