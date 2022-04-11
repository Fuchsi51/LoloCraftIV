
package net.foxinc.lolocraftiv.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.foxinc.lolocraftiv.itemgroup.LoloCraftIVItemGroup;
import net.foxinc.lolocraftiv.LolocraftivModElements;

@LolocraftivModElements.ModElement.Tag
public class BadlandsAxeItem extends LolocraftivModElements.ModElement {
	@ObjectHolder("lolocraftiv:badlands_axe")
	public static final Item block = null;

	public BadlandsAxeItem(LolocraftivModElements instance) {
		super(instance, 80);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 22;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BadlandsIngotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(LoloCraftIVItemGroup.tab)) {
		}.setRegistryName("badlands_axe"));
	}
}
