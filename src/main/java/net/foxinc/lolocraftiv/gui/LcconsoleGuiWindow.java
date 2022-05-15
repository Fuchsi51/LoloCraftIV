
package net.foxinc.lolocraftiv.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.foxinc.lolocraftiv.LolocraftivMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class LcconsoleGuiWindow extends ContainerScreen<LcconsoleGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = LcconsoleGui.guistate;
	TextFieldWidget console;

	public LcconsoleGuiWindow(LcconsoleGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 273;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("lolocraftiv:textures/lcconsole.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
		console.render(ms, mouseX, mouseY, partialTicks);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		if (console.isFocused())
			return console.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
		console.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "LoloCraft Console", 92, 4, -16777216);
		this.font.drawString(ms, "ALPHA", 129, 13, -3407821);
		this.font.drawString(ms, "WARNING", 124, -37, -6750208);
		this.font.drawString(ms, "This is a Cheat Consol/Menu and can destroy the game experience", -27, -30, -3407872);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		console = new TextFieldWidget(this.font, this.guiLeft + 76, this.guiTop + 65, 120, 20, new StringTextComponent("test")) {
			{
				setSuggestion("test");
			}

			@Override
			public void writeText(String text) {
				super.writeText(text);
				if (getText().isEmpty())
					setSuggestion("test");
				else
					setSuggestion(null);
			}

			@Override
			public void setCursorPosition(int pos) {
				super.setCursorPosition(pos);
				if (getText().isEmpty())
					setSuggestion("test");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:console", console);
		console.setMaxStringLength(32767);
		this.children.add(this.console);
		this.addButton(new Button(this.guiLeft + -77, this.guiTop + 183, 46, 20, new StringTextComponent("YEET"), e -> {
			if (true) {
				LolocraftivMod.PACKET_HANDLER.sendToServer(new LcconsoleGui.ButtonPressedMessage(0, x, y, z));
				LcconsoleGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 272, this.guiTop + 182, 77, 20, new StringTextComponent("Close Menu"), e -> {
			if (true) {
				LolocraftivMod.PACKET_HANDLER.sendToServer(new LcconsoleGui.ButtonPressedMessage(1, x, y, z));
				LcconsoleGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
