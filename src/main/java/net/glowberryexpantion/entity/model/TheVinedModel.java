package net.glowberryexpantion.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.glowberryexpantion.entity.TheVinedEntity;

public class TheVinedModel extends GeoModel<TheVinedEntity> {
	@Override
	public ResourceLocation getAnimationResource(TheVinedEntity entity) {
		return new ResourceLocation("glowberry_expantion", "animations/vined.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TheVinedEntity entity) {
		return new ResourceLocation("glowberry_expantion", "geo/vined.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TheVinedEntity entity) {
		return new ResourceLocation("glowberry_expantion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
