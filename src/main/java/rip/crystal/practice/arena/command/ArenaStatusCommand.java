package rip.crystal.practice.arena.command;

import rip.crystal.practice.arena.Arena;
import rip.crystal.practice.utilities.chat.CC;
import rip.crystal.api.command.BaseCommand;
import rip.crystal.api.command.Command;
import rip.crystal.api.command.CommandArgs;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;
import org.bukkit.command.CommandSender;

public class ArenaStatusCommand extends BaseCommand {

	@Command(name = "arena.status", permission = "hysteria.arena.admin", inGameOnly = false)
	@Override
	public void onCommand(CommandArgs commandArgs) {
		CommandSender sender = commandArgs.getSender();
		String[] args = commandArgs.getArgs();

		Arena arena = Arena.getByName(args[0]);
		if (arena != null) {
			sender.sendMessage(CC.RED + CC.BOLD + "Arena Status " + CC.GRAY + "(" +
					(arena.isSetup() ? CC.GREEN : CC.RED) + arena.getName() + CC.GRAY + ")");

			sender.sendMessage(CC.RED + "Cuboid Lower Location: " + CC.GREEN +
					(arena.getLowerCorner() == null ?
							StringEscapeUtils.unescapeJava("\u2717") :
							StringEscapeUtils.unescapeJava("\u2713")));

			sender.sendMessage(CC.RED + "Cuboid Upper Location: " + CC.GREEN +
					(arena.getUpperCorner() == null ?
							StringEscapeUtils.unescapeJava("\u2717") :
							StringEscapeUtils.unescapeJava("\u2713")));

			sender.sendMessage(CC.RED + "Spawn A Location: " + CC.GREEN +
					(arena.getSpawnA() == null ?
							StringEscapeUtils.unescapeJava("\u2717") :
							StringEscapeUtils.unescapeJava("\u2713")));

			sender.sendMessage(CC.RED + "Spawn B Location: " + CC.GREEN +
					(arena.getSpawnB() == null ?
							StringEscapeUtils.unescapeJava("\u2717") :
							StringEscapeUtils.unescapeJava("\u2713")));

			sender.sendMessage(CC.RED + "Kits: " + CC.GREEN + StringUtils.join(arena.getKits(), ", "));
		} else {
			sender.sendMessage(CC.RED + "An arena with that name does not exist.");
		}
	}
}
