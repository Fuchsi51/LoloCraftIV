
package net.foxinc.lolocraftiv.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.foxinc.lolocraftiv.entity.BobyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BobyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BobyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcustom_model(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("lolocraftiv:textures/bob.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelcustom_model extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer headwear;
		private final ModelRenderer headwear2;
		private final ModelRenderer rotation;
		private final ModelRenderer nose;
		private final ModelRenderer body;
		private final ModelRenderer bodywear;
		private final ModelRenderer arms;
		private final ModelRenderer arms_rotation;
		private final ModelRenderer arms_flipped;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;
		private final ModelRenderer bb_main;

		public Modelcustom_model() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);
			headwear = new ModelRenderer(this);
			headwear.setRotationPoint(0.0F, 0.0F, 0.0F);
			headwear.setTextureOffset(32, 0).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.5F, false);
			headwear2 = new ModelRenderer(this);
			headwear2.setRotationPoint(0.0F, 0.0F, 0.0F);
			rotation = new ModelRenderer(this);
			rotation.setRotationPoint(0.0F, 0.0F, 0.0F);
			headwear2.addChild(rotation);
			setRotationAngle(rotation, -1.5708F, 0.0F, 0.0F);
			nose = new ModelRenderer(this);
			nose.setRotationPoint(0.0F, 3.0F, -5.0F);
			setRotationAngle(nose, -1.6144F, 0.0F, 0.0F);
			nose.setTextureOffset(34, 58).addBox(-2.0F, -1.0F, -6.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(16, 20).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, 0.0F, false);
			bodywear = new ModelRenderer(this);
			bodywear.setRotationPoint(0.0F, 0.0F, 0.0F);
			bodywear.setTextureOffset(0, 38).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, 0.25F, false);
			arms = new ModelRenderer(this);
			arms.setRotationPoint(0.0F, 3.5F, 0.3F);
			arms_rotation = new ModelRenderer(this);
			arms_rotation.setRotationPoint(0.0F, -2.0F, 0.05F);
			arms.addChild(arms_rotation);
			setRotationAngle(arms_rotation, -0.7505F, 0.0F, 0.0F);
			arms_rotation.setTextureOffset(44, 22).addBox(-8.0F, 0.0F, -2.05F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			arms_rotation.setTextureOffset(40, 38).addBox(-4.0F, 4.0F, -2.05F, 8.0F, 4.0F, 4.0F, 0.0F, false);
			arms_flipped = new ModelRenderer(this);
			arms_flipped.setRotationPoint(0.0F, 24.0F, 0.0F);
			arms_rotation.addChild(arms_flipped);
			arms_flipped.setTextureOffset(44, 22).addBox(4.0F, -24.0F, -2.05F, 4.0F, 8.0F, 4.0F, 0.0F, true);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(2.0F, 12.0F, 0.0F);
			right_leg.setTextureOffset(0, 22).addBox(-6.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(-2.0F, 12.0F, 0.0F);
			left_leg.setTextureOffset(0, 22).addBox(2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.setTextureOffset(28, 61).addBox(2.0F, -36.5F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bb_main.setTextureOffset(28, 61).addBox(-4.0F, -36.5F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			headwear.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			headwear2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			nose.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			bodywear.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			arms.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}

}
