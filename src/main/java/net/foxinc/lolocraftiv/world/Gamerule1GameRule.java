package net.foxinc.lolocraftiv.world;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.world.GameRules;

import net.foxinc.lolocraftiv.LolocraftivModElements;

import java.lang.reflect.Method;

@LolocraftivModElements.ModElement.Tag
public class Gamerule1GameRule extends LolocraftivModElements.ModElement {
	public static final GameRules.RuleKey<GameRules.IntegerValue> gamerule = GameRules.register("gamerule1", GameRules.Category.PLAYER, create(0));

	public Gamerule1GameRule(LolocraftivModElements instance) {
		super(instance, 167);
	}

	public static GameRules.RuleType<GameRules.IntegerValue> create(int defaultValue) {
		try {
			Method createGameruleMethod = ObfuscationReflectionHelper.findMethod(GameRules.IntegerValue.class, "func_223559_b", int.class);
			createGameruleMethod.setAccessible(true);
			return (GameRules.RuleType<GameRules.IntegerValue>) createGameruleMethod.invoke(null, defaultValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
