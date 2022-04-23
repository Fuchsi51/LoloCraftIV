
package net.foxinc.lolocraftiv.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.block.BlockState;

import net.foxinc.lolocraftiv.procedures.BadlandsPickaxeWennLebewesenMitWerkzeugGeschlagenWirdProcedure;
import net.foxinc.lolocraftiv.procedures.BadlandsPickaxeWennBlockMitWerkzeugZerstortWirdProcedure;
import net.foxinc.lolocraftiv.itemgroup.LoloCraftIVtoolsItemGroup;
import net.foxinc.lolocraftiv.LolocraftivModElements;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

@LolocraftivModElements.ModElement.Tag
public class BadlandsPickaxeItem extends LolocraftivModElements.ModElement {
	@ObjectHolder("lolocraftiv:badlands_pickaxe")
	public static final Item block = null;

	public BadlandsPickaxeItem(LolocraftivModElements instance) {
		super(instance, 79);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 255;
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
		}, 1, -3f, new Item.Properties().group(LoloCraftIVtoolsItemGroup.tab)) {
			@Override
			public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
				ActionResult<ItemStack> retval = super.onItemRightClick(world, entity, hand);
				ItemStack itemstack = retval.getResult();
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();

				BadlandsPickaxeWennLebewesenMitWerkzeugGeschlagenWirdProcedure
						.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
								(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				return retval;
			}

			@Override
			public boolean onBlockDestroyed(ItemStack itemstack, World world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
				boolean retval = super.onBlockDestroyed(itemstack, world, blockstate, pos, entity);
				int x = pos.getX();
				int y = pos.getY();
				int z = pos.getZ();

				BadlandsPickaxeWennBlockMitWerkzeugZerstortWirdProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				return retval;
			}
		}.setRegistryName("badlands_pickaxe"));
	}
}
