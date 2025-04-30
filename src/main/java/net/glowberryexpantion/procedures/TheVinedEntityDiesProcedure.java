package net.glowberryexpantion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.glowberryexpantion.init.GlowberryExpantionModParticleTypes;

public class TheVinedEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (GlowberryExpantionModParticleTypes.VINED_SPORE_CLOUD.get()), x, y, z, 5, 3, 3, 3, 1);
	}
}
