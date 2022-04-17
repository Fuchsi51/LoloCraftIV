
package net.foxinc.lolocraftiv.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.foxinc.lolocraftiv.itemgroup.LoloCraftIVtoolsItemGroup;
import net.foxinc.lolocraftiv.LolocraftivModElements;

@LolocraftivModElements.ModElement.Tag
public class RedAxeItem extends LolocraftivModElements.ModElement {
	@ObjectHolder("lolocraftiv:red_axe")
	public static final Item block = null;

	public RedAxeItem(LolocraftivModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 355;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 22;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RedIngotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(LoloCraftIVtoolsItemGroup.tab)) {
		}.setRegistryName("red_axe"));
	}
}
