package rip.crystal.practice.arena.menu;

import rip.crystal.practice.utilities.menu.Button;
import rip.crystal.practice.utilities.menu.Menu;
import org.bukkit.entity.Player;

import java.util.Map;

public class SelectArenaMenu extends Menu {

	@Override
	public String getTitle(Player player) {
		return "&9Select Arena";
	}

	@Override
	public Map<Integer, Button> getButtons(Player player) {
		return super.getButtons();
	}

}
