package net.glowberryexpantion.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.glowberryexpantion.world.inventory.HomePageMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class HomePageScreen extends AbstractContainerScreen<HomePageMenu> {
	private final static HashMap<String, Object> guistate = HomePageMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_engraved_gem_icon;

	public HomePageScreen(HomePageMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("glowberry_expantion:textures/screens/home_page.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 99 && mouseX < leftPos + 123 && mouseY > topPos + -76 && mouseY < topPos + -52)
			guiGraphics.renderTooltip(font, Component.translatable("gui.glowberry_expantion.home_page.tooltip_engraved_gems"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("glowberry_expantion:textures/screens/page_home.png"), this.leftPos + -154, this.topPos + -101, 0, 0, 304, 192, 304, 192);

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
		imagebutton_engraved_gem_icon = new ImageButton(this.leftPos + 95, this.topPos + -80, 32, 32, 0, 0, 32, new ResourceLocation("glowberry_expantion:textures/screens/atlas/imagebutton_engraved_gem_icon.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_engraved_gem_icon", imagebutton_engraved_gem_icon);
		this.addRenderableWidget(imagebutton_engraved_gem_icon);
	}
}
