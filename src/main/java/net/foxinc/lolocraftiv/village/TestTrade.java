
package net.foxinc.lolocraftiv.village;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicTrade;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.entity.merchant.villager.VillagerProfession;

import net.foxinc.lolocraftiv.item.RedcoalItem;
import net.foxinc.lolocraftiv.item.RedSwordItem;
import net.foxinc.lolocraftiv.item.RedPickaxeItem;
import net.foxinc.lolocraftiv.item.RedIngotItem;
import net.foxinc.lolocraftiv.item.RedArmorItem;
import net.foxinc.lolocraftiv.item.BobweaponmunItem;
import net.foxinc.lolocraftiv.item.BadlandsSwordItem;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class TestTrade {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			trades.get(5).add(new BasicTrade(new ItemStack(RedIngotItem.block), new ItemStack(RedSwordItem.block), 1, 5, 0.05f));
			trades.get(1).add(new BasicTrade(new ItemStack(RedcoalItem.block), new ItemStack(BobweaponmunItem.block, (int) (20)), 40, 6, 0.05f));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			trades.get(3).add(new BasicTrade(new ItemStack(RedIngotItem.block, (int) (2)), new ItemStack(RedPickaxeItem.block), 1, 10, 0.05f));
			trades.get(4).add(new BasicTrade(new ItemStack(RedIngotItem.block, (int) (10)), new ItemStack(BadlandsSwordItem.block), 1, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			trades.get(1).add(new BasicTrade(new ItemStack(RedIngotItem.block, (int) (6)), new ItemStack(RedArmorItem.body), 1, 5, 0.05f));
		}
	}
}
