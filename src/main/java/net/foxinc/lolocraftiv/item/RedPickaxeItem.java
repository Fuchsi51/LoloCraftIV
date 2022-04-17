
package net.foxinc.lolocraftiv.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.foxinc.lolocraftiv.itemgroup.LoloCraftIVtoolsItemGroup;
import net.foxinc.lolocraftiv.LolocraftivModElements;

@LolocraftivModElements.ModElement.Tag
public class RedPickaxeItem extends LolocraftivModElements.ModElement {
	@ObjectHolder("lolocraftiv:red_pickaxe")
	public static final Item block = null;

	public RedPickaxeItem(LolocraftivModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 355;
			}

			public float getEfficiency() {
				return 11f;
			}

			public float getAttackDamage() {
				return 0f;
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
		}.setRegistryName("red_pickaxe"));
	}
}
