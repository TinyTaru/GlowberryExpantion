package net.glowberryexpantion.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;

import net.glowberryexpantion.GlowberryExpantionMod;

public class LapisLaunchGemRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double LaunchPower = 0;
		if ((itemstack.getDamageValue() <= 31) == true) {
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(1, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
			LaunchPower = 1.5;
			entity.setDeltaMovement(new Vec3((Math.sin(entity.getYRot() * (-1) * 0.017453292) * Math.cos(entity.getXRot() * 0.017453292) * LaunchPower), (Math.sin(entity.getXRot() * 0.017453292) * (-1) * LaunchPower),
					(Math.cos(entity.getYRot() * (-1) * 0.017453292) * Math.cos(entity.getXRot() * 0.017453292) * LaunchPower)));
			GlowberryExpantionMod.queueServerWork(5, () -> {
				entity.setDeltaMovement(new Vec3(0, 0, 0));
			});
		}
	}
}
