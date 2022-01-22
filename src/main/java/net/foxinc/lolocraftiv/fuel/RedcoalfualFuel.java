
package net.foxinc.lolocraftiv.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.foxinc.lolocraftiv.item.RedcoalItem;

@Mod.EventBusSubscriber
public class RedcoalfualFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == RedcoalItem.block)
			event.setBurnTime(3000);
	}
}
