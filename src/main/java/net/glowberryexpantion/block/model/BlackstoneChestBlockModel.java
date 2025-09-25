package net.glowberryexpantion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.glowberryexpantion.block.entity.BlackstoneChestTileEntity;

public class BlackstoneChestBlockModel extends GeoModel<BlackstoneChestTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlackstoneChestTileEntity animatable) {
		return new ResourceLocation("glowberry_expantion", "animations/blackstonechest.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlackstoneChestTileEntity animatable) {
		return new ResourceLocation("glowberry_expantion", "geo/blackstonechest.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlackstoneChestTileEntity animatable) {
		return new ResourceLocation("glowberry_expantion", "textures/block/blackstone_chest_texture.png");
	}
}
