package net.glowberryexpantion.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.glowberryexpantion.item.VinedBlossemItem;

public class VinedBlossemModel extends GeoModel<VinedBlossemItem> {
	@Override
	public ResourceLocation getAnimationResource(VinedBlossemItem object) {
		return new ResourceLocation("glowberry_expantion", "animations/vined_hat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(VinedBlossemItem object) {
		return new ResourceLocation("glowberry_expantion", "geo/vined_hat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(VinedBlossemItem object) {
		return new ResourceLocation("glowberry_expantion", "textures/item/the_vined.png");
	}
}
