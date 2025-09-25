package net.glowberryexpantion.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class FireTrailActiveTickConditionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.isEmptyBlock(BlockPos.containing(x, y, z)) || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GRASS) && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.FIRE.defaultBlockState(), 3);
		}
	}
}
