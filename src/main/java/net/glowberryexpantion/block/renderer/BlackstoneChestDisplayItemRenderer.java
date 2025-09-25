package net.glowberryexpantion.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.glowberryexpantion.block.model.BlackstoneChestDisplayModel;
import net.glowberryexpantion.block.display.BlackstoneChestDisplayItem;

public class BlackstoneChestDisplayItemRenderer extends GeoItemRenderer<BlackstoneChestDisplayItem> {
	public BlackstoneChestDisplayItemRenderer() {
		super(new BlackstoneChestDisplayModel());
	}

	@Override
	public RenderType getRenderType(BlackstoneChestDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
