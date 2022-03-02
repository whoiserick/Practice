package rip.crystal.practice.essentials.command.staff;

import rip.crystal.practice.utilities.chat.CC;
import rip.crystal.api.command.BaseCommand;
import rip.crystal.api.command.Command;
import rip.crystal.api.command.CommandArgs;
import org.bukkit.entity.Player;

public class NightCommand extends BaseCommand {

	@Command(name = "night", permission = "hysteria.command.night")
	@Override
	public void onCommand(CommandArgs commandArgs) {
		Player player = commandArgs.getPlayer();

		player.setPlayerTime(18000L, false);
		player.sendMessage(CC.GREEN + "It's now night time.");
	}
}