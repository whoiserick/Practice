package rip.crystal.practice.profile.modmode.commands;

import rip.crystal.practice.profile.Profile;
import rip.crystal.practice.profile.ProfileState;
import rip.crystal.practice.profile.modmode.Modmode;
import rip.crystal.api.command.BaseCommand;
import rip.crystal.api.command.Command;
import rip.crystal.api.command.CommandArgs;
import org.bukkit.entity.Player;

public class StaffModeCommand extends BaseCommand {

    @Command(name = "staffmode", aliases = {"staff", "mod", "h"}, permission = "hysteria.staffmode")
    @Override
    public void onCommand(CommandArgs commandArgs) {
        Player player = commandArgs.getPlayer();
        Profile profile = Profile.get(player.getUniqueId());

        if(profile.getState() == ProfileState.EVENT || profile.getState() == ProfileState.FIGHTING || profile.getState() == ProfileState.SPECTATING || profile.getState() == ProfileState.QUEUEING || profile.getState() == ProfileState.FFA) {
            return;
        }

        if (profile.getState() == ProfileState.STAFF_MODE) Modmode.remove(player);
        else Modmode.add(player);
    }
}
