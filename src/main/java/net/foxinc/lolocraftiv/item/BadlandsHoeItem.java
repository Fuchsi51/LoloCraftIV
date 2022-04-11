
package net.foxinc.lolocraftiv.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.foxinc.lolocraftiv.itemgroup.LoloCraftIVItemGroup;
import net.foxinc.lolocraftiv.LolocraftivModElements;

@LolocraftivModElements.ModElement.Tag
public class BadlandsHoeItem extends LolocraftivModElements.ModElement {
	@ObjectHolder("lolocraftiv:badlands_hoe")
	public static final Item block = null;

	public BadlandsHoeItem(LolocraftivModElements instance) {
		super(instance, 83);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BadlandsIngotItem.block));
			}
		}, 0, -3f, new Item.Properties().group(LoloCraftIVItemGroup.tab)) {
		}.setRegistryName("badlands_hoe"));
	}
}
