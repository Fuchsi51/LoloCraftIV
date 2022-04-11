package net.foxinc.lolocraftiv.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.foxinc.lolocraftiv.LolocraftivMod;

import java.util.Map;

public class BadlandsArmorBodyTickEventProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LolocraftivMod.LOGGER.warn("Failed to load dependency entity for procedure BadlandsArmorBodyTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HASTE, (int) 1, (int) 2, (false), (false)));
	}
}
