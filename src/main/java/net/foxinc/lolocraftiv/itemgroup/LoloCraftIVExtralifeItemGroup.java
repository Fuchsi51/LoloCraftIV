
package net.foxinc.lolocraftiv.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.foxinc.lolocraftiv.block.PlanktonLogBlock;
import net.foxinc.lolocraftiv.LolocraftivModElements;

@LolocraftivModElements.ModElement.Tag
public class LoloCraftIVExtralifeItemGroup extends LolocraftivModElements.ModElement {
	public LoloCraftIVExtralifeItemGroup(LolocraftivModElements instance) {
		super(instance, 200);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tablolo_craft_iv_extralife") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PlanktonLogBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
