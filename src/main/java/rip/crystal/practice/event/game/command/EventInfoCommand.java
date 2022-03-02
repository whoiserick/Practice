package rip.crystal.practice.event.game.command;

import rip.crystal.practice.event.game.EventGame;
import rip.crystal.practice.event.impl.sumo.SumoEvent;
import rip.crystal.practice.utilities.chat.CC;
import rip.crystal.api.command.BaseCommand;
import rip.crystal.api.command.Command;
import rip.crystal.api.command.CommandArgs;
import org.bukkit.entity.Player;

public class EventInfoCommand extends BaseCommand {

	@Command(name = "event.info")
	@Override
	public void onCommand(CommandArgs commandArgs) {
		Player player = commandArgs.getPlayer();

		if (EventGame.getActiveGame() == null) {
			player.sendMessage(CC.RED + "There is no active event.");
			return;
		}

		EventGame game = EventGame.getActiveGame();

		player.sendMessage(CC.translate("&7(*) &c&lEvent &7(*)"));
		player.sendMessage(CC.RED + "Player Limit: " + CC.WHITE + game.getMaximumPlayers());
		player.sendMessage(CC.RED + "Event Type: " + CC.WHITE + game.getEvent().getName());
		player.sendMessage(CC.RED + "Players: " + CC.WHITE + game.getRemainingPlayers());
		player.sendMessage(CC.RED + "State: " + CC.WHITE + game.getGameState().getReadable());

		if (game.getEvent() instanceof SumoEvent) {
			player.sendMessage(CC.RED + "Round: " + CC.WHITE + game.getGameLogic().getRoundNumber());
		}
	}
}
