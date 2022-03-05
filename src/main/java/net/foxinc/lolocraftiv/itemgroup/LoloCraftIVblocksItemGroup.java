
package net.foxinc.lolocraftiv.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.foxinc.lolocraftiv.block.RedLogBlock;
import net.foxinc.lolocraftiv.LolocraftivModElements;

@LolocraftivModElements.ModElement.Tag
public class LoloCraftIVblocksItemGroup extends LolocraftivModElements.ModElement {
	public LoloCraftIVblocksItemGroup(LolocraftivModElements instance) {
		super(instance, 67);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tablolo_craft_i_vblocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RedLogBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
