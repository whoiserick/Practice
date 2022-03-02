package rip.crystal.practice.match.task;

import rip.crystal.practice.match.Match;
import rip.crystal.practice.utilities.TaskUtil;
import com.sk89q.worldedit.EditSession;
import com.sk89q.worldedit.Vector;
import com.sk89q.worldedit.blocks.BaseBlock;
import com.sk89q.worldedit.bukkit.BukkitUtil;
import lombok.AllArgsConstructor;
import org.bukkit.Location;
import org.bukkit.block.BlockState;
import org.bukkit.scheduler.BukkitRunnable;

@AllArgsConstructor
public class MatchResetTask extends BukkitRunnable {

	private final Match match;

	@Override
	public void run() {

		/*
		Reset Placed Blocks for Build Rule
		 */

		if (match.getKit().getGameRules().isBuild() && match.getPlacedBlocks().size() > 0) {
			EditSession editSession = new EditSession(BukkitUtil.getLocalWorld(match.getArena().getSpawnA().getWorld()), 500);

			for (Location location : match.getPlacedBlocks()) {
				try {
					editSession.setBlock(
							new Vector(location.getBlockX(), location.getBlockY(), location.getZ()
							), new BaseBlock(0));
				} catch (Exception ignored) {
				}
			}

			editSession.flushQueue();

			TaskUtil.run(() -> {
				match.getPlacedBlocks().clear();
				match.getArena().setActive(false);
				cancel();
			});

		}
			/*
			Reset Changed Blocks for Build Rule
		 	*/

		if (match.getKit().getGameRules().isBuild() && match.getChangedBlocks().size() > 0) {
			EditSession editSession = new EditSession(BukkitUtil.getLocalWorld(match.getArena().getSpawnA().getWorld()), 500);
			editSession.setFastMode(true);


			for (BlockState blockState : match.getChangedBlocks()) {
				try {
					editSession.setBlock(new Vector(blockState.getLocation().getBlockX(), blockState.getLocation().getBlockY(), blockState.getLocation().getZ()
							), new BaseBlock(blockState.getTypeId(), blockState.getRawData()), EditSession.Stage.BEFORE_CHANGE);
					editSession.flushQueue();
				} catch (Exception ignored) {
				}
			}


			editSession.flushQueue();

			TaskUtil.run(() -> {
				if (match.getKit().getGameRules().isBuild()) {
					match.getChangedBlocks().clear();
					match.getArena().setActive(false);
				}

				cancel();
			});
		}  else {
			match.getArena().setActive(false);
			cancel();
		}
	}
}

/*for (BlockState blockState : match.getChangedBlocks()) {
	try {
		editSession.setBlock(new Vector(blockState.getLocation().getBlockX(), blockState.getLocation().getBlockY(), blockState.getLocation().getZ()), new BaseBlock(blockState.getTypeId(), blockState.getRawData()));
	} catch (Exception ignored) {
	}
}*/

		/*if (match.getKit().getGameRules().isBuild() && match.getPlacedBlocks().size() > 0 || match.getKit().getGameRules().isBaseRaiding() && match.getPlacedBlocks().size() > 0) {
			EditSession editSession = new EditSessionBuilder(BukkitUtil.getLocalWorld(match.getArena().getSpawnA().getWorld())).fastmode(true).allowedRegionsEverywhere().autoQueue(false).limitUnlimited().build();

			for (Location location : match.getPlacedBlocks()) {
				try {
					editSession.setBlock(new Vector(location.getBlockX(), location.getBlockY(), location.getZ()), new BaseBlock(0));
				} catch (Exception ignored) {
				}
			}

			editSession.flushQueue();

			TaskUtil.run(() -> {
				match.getPlacedBlocks().clear();
				match.getArena().setActive(false);
				cancel();
			});
		} else if (match.getKit().getGameRules().isBuild() && match.getChangedBlocks().size() > 0 || match.getKit().getGameRules().isBaseRaiding() && match.getChangedBlocks().size() > 0) {
			EditSession editSession = new EditSessionBuilder(BukkitUtil.getLocalWorld(match.getArena().getSpawnA().getWorld())).fastmode(true).allowedRegionsEverywhere().autoQueue(false).limitUnlimited().build();
			//editSession.setFastMode(true);

			for (BlockState blockState : match.getChangedBlocks()) {
				try {
					editSession.setBlock(new Vector(blockState.getLocation().getBlockX(), blockState.getLocation().getBlockY(), blockState.getLocation().getZ()), new BaseBlock(blockState.getTypeId(), blockState.getRawData()));
				} catch (Exception ignored) {
				}
			}

			editSession.flushQueue();

			TaskUtil.run(() -> {
				if (match.getKit().getGameRules().isBuild() || match.getKit().getGameRules().isBaseRaiding()) {
					match.getChangedBlocks().clear();
					match.getArena().setActive(false);
				}
				cancel();
			});
		}  else {
			match.getArena().setActive(false);
			cancel();
		}*/


		/*int count = 0;
		EditSession editSession = new EditSession(BukkitUtil.getLocalWorld(match.getArena().getSpawnA().getWorld()), 500);
		if (match.getKit().getGameRules().isBaseRaiding() || match.getKit().getGameRules().isBuild()) {
			for (BlockState blockState : match.getChangedBlocks()) {
				if (++count <= 15) {
					blockState.getBlock().setType(Material.AIR);
					try {
						editSession.setBlock(new Vector(blockState.getLocation().getBlockX(), blockState.getLocation().getBlockY(), blockState.getLocation().getZ()), new BaseBlock(blockState.getTypeId(), blockState.getRawData()));
					} catch (Exception ignored) {
					}
				}
			}
			editSession.flushQueue();
			TaskUtil.run(() -> {
				match.getChangedBlocks().clear();
				match.getArena().setActive(false);
				cancel();
			});
			for (Location location : match.getPlacedBlocks()) {
				try {
					editSession.setBlock(
							new Vector(location.getBlockX(), location.getBlockY(),
									location.getZ()
							), new BaseBlock(0));
				} catch (Exception ignored) {
				}
			}
			editSession.flushQueue();
			TaskUtil.run(() -> {
				match.getPlacedBlocks().clear();
				match.getArena().setActive(false);
				cancel();
			});
		}

		if (count < 15) {
			match.getArena().setActive(false);
			this.cancel();
		}
	}
}*/
		/*if (match.getKit().getGameRules().isBuild() && match.getPlacedBlocks().size() > 0 || match.getKit().getGameRules().isBaseRaiding() && match.getPlacedBlocks().size() > 0) {
			EditSession editSession = new EditSession(BukkitUtil.getLocalWorld(match.getArena().getSpawnA().getWorld()), 500);

			for (Location location : match.getPlacedBlocks()) {
				try {
					editSession.setBlock(
							new Vector(location.getBlockX(), location.getBlockY(),
									location.getZ()
							), new BaseBlock(0));
				} catch (Exception ignored) {
				}
			}

			editSession.flushQueue();

			TaskUtil.run(() -> {
				match.getPlacedBlocks().clear();
				match.getArena().setActive(false);
				cancel();
			});
		} else if (match.getKit().getGameRules().isBuild() && match.getChangedBlocks().size() > 0 || match.getKit().getGameRules().isBaseRaiding() && match.getChangedBlocks().size() > 0) {
			EditSession editSession = new EditSession(BukkitUtil.getLocalWorld(match.getArena().getSpawnA().getWorld()), 500);
			editSession.setFastMode(true);

			for (BlockState blockState : match.getChangedBlocks()) {
				try {
					editSession.setBlock(new Vector(blockState.getLocation().getBlockX(), blockState.getLocation().getBlockY(), blockState.getLocation().getZ()), new BaseBlock(blockState.getTypeId(), blockState.getRawData()));
				} catch (Exception ignored) {
				}
			}


			editSession.flushQueue();

			TaskUtil.run(() -> {
				if (match.getKit().getGameRules().isBuild() || match.getKit().getGameRules().isBaseRaiding()) {
					match.getChangedBlocks().clear();
					match.getArena().setActive(false);
				}

				cancel();
			});
		}  else {
			match.getArena().setActive(false);
			cancel();
		}
	}*/

