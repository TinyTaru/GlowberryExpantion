package net.glowberryexpantion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BlueGlowberrySpawnAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude() && world.isEmptyBlock(BlockPos.containing(x, y - 1, z))) {
			return true;
		}
		return true;
	}
}
