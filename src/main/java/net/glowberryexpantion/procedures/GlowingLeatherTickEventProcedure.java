package net.glowberryexpantion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.glowberryexpantion.init.GlowberryExpantionModParticleTypes;

public class GlowingLeatherTickEventProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 20, 1, true, true));
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (GlowberryExpantionModParticleTypes.GLOWING_LEATHER_PARTICLE.get()), x, y, z, 1, 0.5, 0.5, 0.5, 0.05);
	}
}
