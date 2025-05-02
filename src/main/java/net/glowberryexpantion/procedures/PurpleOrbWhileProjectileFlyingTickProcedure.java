package net.glowberryexpantion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.SimpleParticleType;

import net.glowberryexpantion.init.GlowberryExpantionModParticleTypes;
import net.glowberryexpantion.GlowberryExpantionMod;

public class PurpleOrbWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		world.addParticle((SimpleParticleType) (GlowberryExpantionModParticleTypes.PUPLE_GLOW_PARTICLE.get()), x, y, z, 0, 1, 0);
		GlowberryExpantionMod.queueServerWork(100, () -> {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		});
	}
}
