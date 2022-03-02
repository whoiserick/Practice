package rip.crystal.practice.kit.command;

import rip.crystal.practice.kit.Kit;
import rip.crystal.practice.utilities.chat.CC;
import rip.crystal.api.command.BaseCommand;
import rip.crystal.api.command.Command;
import rip.crystal.api.command.CommandArgs;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class KitToggleComand extends BaseCommand {

    @Command(name = "kit.toggle", permission = "hysteria.kit.admin")
    @Override
    public void onCommand(CommandArgs commandArgs) {
        Player player = commandArgs.getPlayer();
        String[] args = commandArgs.getArgs();

        if (args.length == 0) {
            player.sendMessage(CC.RED + "Please usage: /kit toggle (kit)");
            return;
        }

        Kit kit = Kit.getByName(args[0]);
        if (kit == null) {
            player.sendMessage(CC.RED + "This kit doesn't exist.");
            return;
        }

        kit.setEnabled(!kit.isEnabled());
        kit.save();
        player.sendMessage(ChatColor.GREEN + "Kit is now " + (kit.isEnabled() ? "enabled" : "disabled"));
    }
}