
package net.foxinc.lolocraftiv.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;

@LolocraftivModElements.ModElement.Tag
public class LoloButtonBlock extends LolocraftivModElements.ModElement {

	@ObjectHolder("lolocraftiv:lolo_button")
	public static final Block block = null;

	public LoloButtonBlock(LolocraftivModElements instance) {
		super(instance, 64);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(LoloCraftIVItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends WoodButtonBlock {

		public CustomBlock() {
			super(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2f, 3f).setLightLevel(s -> 0));

			setRegistryName("lolo_button");
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 5;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
