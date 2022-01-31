
package net.foxinc.lolocraftiv.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.foxinc.lolocraftiv.item.RedArmorItem;
import net.foxinc.lolocraftiv.LolocraftivModElements;

@LolocraftivModElements.ModElement.Tag
public class LoloCraftIVArmorItemGroup extends LolocraftivModElements.ModElement {
	public LoloCraftIVArmorItemGroup(LolocraftivModElements instance) {
		super(instance, 61);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tablolo_craft_iv_armor") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RedArmorItem.body);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
