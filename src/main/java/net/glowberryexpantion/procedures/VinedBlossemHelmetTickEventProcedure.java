package net.glowberryexpantion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class VinedBlossemHelmetTickEventProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() > 0.7) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SPORE_BLOSSOM_AIR, x, (y + 2), z, 1, 1, 1, 1, 1);
		}
	}
}
