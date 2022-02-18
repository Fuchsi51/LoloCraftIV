package net.foxinc.lolocraftiv.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraft.client.Minecraft;

import net.foxinc.lolocraftiv.item.BobweaponItem;

@OnlyIn(Dist.CLIENT)
public class BobweaponRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BobweaponItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
