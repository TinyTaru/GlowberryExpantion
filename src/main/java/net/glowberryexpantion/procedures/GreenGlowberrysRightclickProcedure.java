package net.glowberryexpantion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.BlockPos;

import net.glowberryexpantion.init.GlowberryExpantionModBlocks;

public class GreenGlowberrysRightclickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.isEmptyBlock(BlockPos.containing(x, y - 1, z)) == true) {
			world.setBlock(BlockPos.containing(x, y - 1, z), GlowberryExpantionModBlocks.GLOWVINEGREEN.get().defaultBlockState(), 3);
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).copy();
				_setstack.setCount((int) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}
}
