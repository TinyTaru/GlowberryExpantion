package net.glowberryexpantion.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
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

	@Override
	public void setCustomAnimations(TheVinedEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("Head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
