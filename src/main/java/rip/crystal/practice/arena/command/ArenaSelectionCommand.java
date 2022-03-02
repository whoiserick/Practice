package rip.crystal.practice.arena.command;

import rip.crystal.practice.arena.selection.Selection;
import rip.crystal.api.command.BaseCommand;
import rip.crystal.api.command.Command;
import rip.crystal.api.command.CommandArgs;
import org.bukkit.entity.Player;

public class ArenaSelectionCommand extends BaseCommand {

	@Command(name = "arena.wand", aliases = {"arena.selection"}, permission = "hysteria.arena.admin")
	@Override
	public void onCommand(CommandArgs commandArgs) {
		Player player = commandArgs.getPlayer();

		if (player.getInventory().first(Selection.SELECTION_WAND) != -1) {
			player.getInventory().remove(Selection.SELECTION_WAND);
		} else {
			player.getInventory().addItem(Selection.SELECTION_WAND);
		}

		player.updateInventory();
	}
}
