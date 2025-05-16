package net.glowberryexpantion.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.glowberryexpantion.entity.TheVinedEntity;

import java.util.Comparator;

public class VinedDisplayProcedure {
	public static Entity execute(LevelAccessor world, double x, double y, double z) {
		Entity Vined = null;
		return (Entity) world.getEntitiesOfClass(TheVinedEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).stream().sorted(new Object() {
			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
			}
		}.compareDistOf(x, y, z)).findFirst().orElse(null);
	}
}
