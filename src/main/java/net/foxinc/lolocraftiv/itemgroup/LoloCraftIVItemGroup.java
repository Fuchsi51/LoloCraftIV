
package net.foxinc.lolocraftiv.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.foxinc.lolocraftiv.item.RedPickaxeItem;
import net.foxinc.lolocraftiv.LolocraftivModElements;

@LolocraftivModElements.ModElement.Tag
public class LoloCraftIVItemGroup extends LolocraftivModElements.ModElement {
	public LoloCraftIVItemGroup(LolocraftivModElements instance) {
		super(instance, 44);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tablolo_craft_iv") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RedPickaxeItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
