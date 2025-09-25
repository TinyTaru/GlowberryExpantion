
package net.glowberryexpantion.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.glowberryexpantion.procedures.FireTrailActiveTickConditionProcedure;

public class FireTrailMobEffect extends MobEffect {
	public FireTrailMobEffect() {
		super(MobEffectCategory.NEUTRAL, -8443392);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FireTrailActiveTickConditionProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
