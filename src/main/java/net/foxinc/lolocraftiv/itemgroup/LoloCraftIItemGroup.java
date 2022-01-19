
package net.foxinc.lolocraftiv.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.foxinc.lolocraftiv.item.RedpowderItem;
import net.foxinc.lolocraftiv.LolocraftivModElements;

@LolocraftivModElements.ModElement.Tag
public class LoloCraftIItemGroup extends LolocraftivModElements.ModElement {
	public LoloCraftIItemGroup(LolocraftivModElements instance) {
		super(instance, 75);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tablolo_craft_i") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RedpowderItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
