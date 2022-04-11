package net.foxinc.lolocraftiv.procedures;

import net.minecraft.world.GameType;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.foxinc.lolocraftiv.LolocraftivMod;

import java.util.Map;

public class Gm0CommandExecutedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LolocraftivMod.LOGGER.warn("Failed to load dependency entity for procedure Gm0CommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).setGameType(GameType.SURVIVAL);
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You gamemode was change to \"Survival\""), (true));
		}
	}
}
