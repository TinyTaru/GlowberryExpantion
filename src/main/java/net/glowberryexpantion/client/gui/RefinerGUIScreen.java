package net.glowberryexpantion.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.glowberryexpantion.world.inventory.RefinerGUIMenu;
import net.glowberryexpantion.procedures.Progress7Procedure;
import net.glowberryexpantion.procedures.Progress6Procedure;
import net.glowberryexpantion.procedures.Progress5Procedure;
import net.glowberryexpantion.procedures.Progress4Procedure;
import net.glowberryexpantion.procedures.Progress3Procedure;
import net.glowberryexpantion.procedures.Progress2Procedure;
import net.glowberryexpantion.procedures.Progress1Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RefinerGUIScreen extends AbstractContainerScreen<RefinerGUIMenu> {
	private final static HashMap<String, Object> guistate = RefinerGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_progress_arrow_6;

	public RefinerGUIScreen(RefinerGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("glowberry_expantion:textures/screens/refiner_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("glowberry_expantion:textures/screens/empty_glowberry.png"), this.leftPos + 26, this.topPos + 36, 0, 0, 16, 16, 16, 16);

		if (Progress1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("glowberry_expantion:textures/screens/load_arrow.png"), this.leftPos + 102, this.topPos + 37, 0, 0, 22, 15, 22, 15);
		}

		guiGraphics.blit(new ResourceLocation("glowberry_expantion:textures/screens/gui.png"), this.leftPos + 48, this.topPos + 36, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowberry_expantion:textures/screens/empty_bottle.png"), this.leftPos + 8, this.topPos + 36, 0, 0, 16, 16, 16, 16);

		if (Progress2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("glowberry_expantion:textures/screens/progress_arrow_1.png"), this.leftPos + 102, this.topPos + 37, 0, 0, 24, 16, 24, 16);
		}
		if (Progress3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("glowberry_expantion:textures/screens/progress_arrow_3.png"), this.leftPos + 102, this.topPos + 37, 0, 0, 24, 16, 24, 16);
		}
		if (Progress4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("glowberry_expantion:textures/screens/progress_arrow_4.png"), this.leftPos + 102, this.topPos + 37, 0, 0, 24, 16, 24, 16);
		}
		if (Progress5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("glowberry_expantion:textures/screens/progress_arrow_5.png"), this.leftPos + 102, this.topPos + 37, 0, 0, 24, 16, 24, 16);
		}
		if (Progress7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("glowberry_expantion:textures/screens/burn_progress.png"), this.leftPos + 102, this.topPos + 37, 0, 0, 24, 16, 24, 16);
		}

		guiGraphics.blit(new ResourceLocation("glowberry_expantion:textures/screens/empty_pestle.png"), this.leftPos + 71, this.topPos + 36, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		imagebutton_progress_arrow_6 = new ImageButton(this.leftPos + 102, this.topPos + 37, 24, 16, 0, 0, 16, new ResourceLocation("glowberry_expantion:textures/screens/atlas/imagebutton_progress_arrow_6.png"), 24, 32, e -> {
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (Progress6Procedure.execute(world, x, y, z))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_progress_arrow_6", imagebutton_progress_arrow_6);
		this.addRenderableWidget(imagebutton_progress_arrow_6);
	}
}
