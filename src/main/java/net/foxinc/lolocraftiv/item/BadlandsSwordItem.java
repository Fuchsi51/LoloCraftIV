
package net.foxinc.lolocraftiv.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.foxinc.lolocraftiv.itemgroup.LoloCraftIVtoolsItemGroup;
import net.foxinc.lolocraftiv.LolocraftivModElements;

@LolocraftivModElements.ModElement.Tag
public class BadlandsSwordItem extends LolocraftivModElements.ModElement {
	@ObjectHolder("lolocraftiv:badlands_sword")
	public static final Item block = null;

	public BadlandsSwordItem(LolocraftivModElements instance) {
		super(instance, 81);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 5f;
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
		}, 3, -2f, new Item.Properties().group(LoloCraftIVtoolsItemGroup.tab)) {
		}.setRegistryName("badlands_sword"));
	}
}
