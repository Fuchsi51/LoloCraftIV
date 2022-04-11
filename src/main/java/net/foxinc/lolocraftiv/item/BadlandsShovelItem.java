
package net.foxinc.lolocraftiv.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.foxinc.lolocraftiv.itemgroup.LoloCraftIVItemGroup;
import net.foxinc.lolocraftiv.LolocraftivModElements;

@LolocraftivModElements.ModElement.Tag
public class BadlandsShovelItem extends LolocraftivModElements.ModElement {
	@ObjectHolder("lolocraftiv:badlands_shovel")
	public static final Item block = null;

	public BadlandsShovelItem(LolocraftivModElements instance) {
		super(instance, 82);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 75;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 22;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BadlandsIngotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(LoloCraftIVItemGroup.tab)) {
		}.setRegistryName("badlands_shovel"));
	}
}
