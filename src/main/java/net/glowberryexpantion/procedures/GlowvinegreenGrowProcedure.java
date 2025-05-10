package net.glowberryexpantion.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.glowberryexpantion.init.GlowberryExpantionModBlocks;

public class GlowvinegreenGrowProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (50 == Mth.nextDouble(RandomSource.create(), 1, 200)) {
			if (Blocks.AIR == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()) {
				if (1 == Mth.nextDouble(RandomSource.create(), 1, 2)) {
					{
						int _value = 1;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else {
					world.setBlock(BlockPos.containing(x, y - 1, z), GlowberryExpantionModBlocks.GLOWVINEGREEN.get().defaultBlockState(), 3);
				}
			} else {
				if (Blocks.CAVE_AIR == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()) {
					if (1 == Mth.nextDouble(RandomSource.create(), 1, 2)) {
						{
							int _value = 1;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else {
						world.setBlock(BlockPos.containing(x, y - 1, z), GlowberryExpantionModBlocks.GLOWVINEGREEN.get().defaultBlockState(), 3);
					}
				} else {
					{
						int _value = 1;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				}
			}
		}
	}
}
