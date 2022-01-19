
package net.foxinc.lolocraftiv.potion;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RedpotionPotion {

	@ObjectHolder("lolocraftiv:redpotion")
	public static final Potion potionType = null;

	@SubscribeEvent
	public static void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}

	public static class PotionCustom extends Potion {

		public PotionCustom() {
			super(new EffectInstance(RedtrankPotionEffect.potion, 3600, 0, false, true));
			setRegistryName("redpotion");
		}

	}
}