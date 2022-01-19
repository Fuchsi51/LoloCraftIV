
package net.foxinc.lolocraftiv.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.foxinc.lolocraftiv.itemgroup.LoloCraftIVItemGroup;
import net.foxinc.lolocraftiv.LolocraftivModElements;

import java.util.List;

@LolocraftivModElements.ModElement.Tag
public class RedpowderItem extends LolocraftivModElements.ModElement {
	@ObjectHolder("lolocraftiv:redpowder")
	public static final Item block = null;

	public RedpowderItem(LolocraftivModElements instance) {
		super(instance, 54);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(LoloCraftIVItemGroup.tab).maxStackSize(64).rarity(Rarity.EPIC));
			setRegistryName("redpowder");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Red powder. Can use to Craft the Red Potion"));
		}
	}
}
