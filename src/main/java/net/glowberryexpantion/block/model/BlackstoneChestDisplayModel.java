package net.glowberryexpantion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.glowberryexpantion.block.display.BlackstoneChestDisplayItem;

public class BlackstoneChestDisplayModel extends GeoModel<BlackstoneChestDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BlackstoneChestDisplayItem animatable) {
		return new ResourceLocation("glowberry_expantion", "animations/blackstonechest.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlackstoneChestDisplayItem animatable) {
		return new ResourceLocation("glowberry_expantion", "geo/blackstonechest.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlackstoneChestDisplayItem entity) {
		return new ResourceLocation("glowberry_expantion", "textures/block/blackstone_chest_texture.png");
	}
}
