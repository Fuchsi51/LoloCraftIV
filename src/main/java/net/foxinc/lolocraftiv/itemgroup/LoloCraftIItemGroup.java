
package net.foxinc.lolocraftiv.itemgroup;

@LolocraftivModElements.ModElement.Tag
public class LoloCraftIItemGroup extends LolocraftivModElements.ModElement {

	public LoloCraftIItemGroup(LolocraftivModElements instance) {
		super(instance, 75);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tablolo_craft_i") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RedSwordItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;

}
