package net.glowberryexpantion.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.glowberryexpantion.block.model.BlackstoneChestBlockModel;
import net.glowberryexpantion.block.entity.BlackstoneChestTileEntity;

public class BlackstoneChestTileRenderer extends GeoBlockRenderer<BlackstoneChestTileEntity> {
	public BlackstoneChestTileRenderer() {
		super(new BlackstoneChestBlockModel());
	}

	@Override
	public RenderType getRenderType(BlackstoneChestTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
