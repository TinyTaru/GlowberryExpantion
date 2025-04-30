package net.glowberryexpantion.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.glowberryexpantion.init.GlowberryExpantionModParticleTypes;
import net.glowberryexpantion.GlowberryExpantionMod;

import java.util.List;
import java.util.Comparator;

public class TheVinedEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double particleRadius = 0;
		double particleAmount = 0;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (GlowberryExpantionModParticleTypes.VINED_SPORE_CLOUD.get()), x, y, z, 300, 3, 3, 3, 0.1);
		GlowberryExpantionMod.queueServerWork(10, () -> {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (GlowberryExpantionModParticleTypes.VINED_SPORE_CLOUD.get()), x, y, z, 300, 3, 3, 3, 0.1);
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"summon minecraft:area_effect_cloud ~ ~ ~ {Radius:5,Duration:30,Effects:[{Id:19,Amplifier:0,Duration:120}]}");
				}
			}
		});
	}
}
