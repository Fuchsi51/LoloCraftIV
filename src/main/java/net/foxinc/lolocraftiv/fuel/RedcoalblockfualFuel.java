
package net.foxinc.lolocraftiv.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.foxinc.lolocraftiv.block.RedcoalBlockBlock;

@Mod.EventBusSubscriber
public class RedcoalblockfualFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == RedcoalBlockBlock.block.asItem())
			event.setBurnTime(5000);
	}
}
