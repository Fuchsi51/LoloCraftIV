
package net.foxinc.lolocraftiv.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;

@LolocraftivModElements.ModElement.Tag
public class LoloSlabBlock extends LolocraftivModElements.ModElement {

	@ObjectHolder("lolocraftiv:lolo_slab")
	public static final Block block = null;

	public LoloSlabBlock(LolocraftivModElements instance) {
		super(instance, 60);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(LoloCraftIVItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends SlabBlock {

		public CustomBlock() {
			super(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2f, 3f).setLightLevel(s -> 0));

			setRegistryName("lolo_slab");
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
			return Collections.singletonList(new ItemStack(this, state.get(TYPE) == SlabType.DOUBLE ? 2 : 1));
		}

	}

}
