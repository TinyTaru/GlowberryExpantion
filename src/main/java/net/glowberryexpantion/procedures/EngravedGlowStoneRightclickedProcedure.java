package net.glowberryexpantion.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.glowberryexpantion.init.GlowberryExpantionModMobEffects;

public class EngravedGlowStoneRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(GlowberryExpantionModMobEffects.RADIANCE.get(), 600, 1));
	}
}
