package net.glowberryexpantion.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.glowberryexpantion.init.GlowberryExpantionModBlocks;

public class RadianceOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z))) {
			world.setBlock(BlockPos.containing(x, y + 1, z), GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get()) {
			world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get()) {
			world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get()) {
			world.setBlock(BlockPos.containing(x - 1, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get()) {
			world.setBlock(BlockPos.containing(x, y, z - 1), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).getBlock() == GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get()) {
			world.setBlock(BlockPos.containing(x - 1, y, z - 1), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).getBlock() == GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get()) {
			world.setBlock(BlockPos.containing(x + 1, y, z + 1), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).getBlock() == GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get()) {
			world.setBlock(BlockPos.containing(x - 1, y, z + 1), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).getBlock() == GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get()) {
			world.setBlock(BlockPos.containing(x + 1, y, z - 1), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 2, z + 1))).getBlock() == GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get()) {
			world.setBlock(BlockPos.containing(x, y + 2, z + 1), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y + 2, z))).getBlock() == GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get()) {
			world.setBlock(BlockPos.containing(x + 1, y + 2, z), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y + 2, z))).getBlock() == GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get()) {
			world.setBlock(BlockPos.containing(x - 1, y + 2, z), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 2, z - 1))).getBlock() == GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get()) {
			world.setBlock(BlockPos.containing(x, y + 2, z - 1), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y + 2, z - 1))).getBlock() == GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get()) {
			world.setBlock(BlockPos.containing(x - 1, y + 2, z - 1), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y + 2, z + 1))).getBlock() == GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get()) {
			world.setBlock(BlockPos.containing(x + 1, y + 2, z + 1), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y + 2, z + 1))).getBlock() == GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get()) {
			world.setBlock(BlockPos.containing(x - 1, y + 2, z + 1), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y + 2, z - 1))).getBlock() == GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get()) {
			world.setBlock(BlockPos.containing(x + 1, y + 2, z - 1), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get()) {
			world.setBlock(BlockPos.containing(x, y + 1, z + 1), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get()) {
			world.setBlock(BlockPos.containing(x + 1, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get()) {
			world.setBlock(BlockPos.containing(x - 1, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get()) {
			world.setBlock(BlockPos.containing(x, y + 1, z + 1), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z - 1))).getBlock() == GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get()) {
			world.setBlock(BlockPos.containing(x - 1, y + 1, z - 1), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z + 1))).getBlock() == GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get()) {
			world.setBlock(BlockPos.containing(x + 1, y + 1, z + 1), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z + 1))).getBlock() == GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get()) {
			world.setBlock(BlockPos.containing(x - 1, y + 1, z + 1), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z - 1))).getBlock() == GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get()) {
			world.setBlock(BlockPos.containing(x + 1, y + 1, z - 1), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get()) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == GlowberryExpantionModBlocks.RADIANT_LIGHT_BLOCK.get()) {
			world.setBlock(BlockPos.containing(x, y + 2, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
