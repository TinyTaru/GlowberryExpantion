
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.glowberryexpantion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.glowberryexpantion.block.entity.GlowberryRefinerBlockEntity;
import net.glowberryexpantion.block.entity.GemEngraverBlockEntity;
import net.glowberryexpantion.GlowberryExpantionMod;

public class GlowberryExpantionModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, GlowberryExpantionMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> GLOWBERRY_REFINER = register("glowberry_refiner", GlowberryExpantionModBlocks.GLOWBERRY_REFINER, GlowberryRefinerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GEM_ENGRAVER = register("gem_engraver", GlowberryExpantionModBlocks.GEM_ENGRAVER, GemEngraverBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
