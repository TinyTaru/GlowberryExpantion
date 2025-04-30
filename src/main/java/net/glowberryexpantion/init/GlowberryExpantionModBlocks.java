
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.glowberryexpantion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.glowberryexpantion.block.GlowvineblueBlock;
import net.glowberryexpantion.block.GlowberryRefinerBlock;
import net.glowberryexpantion.block.GlowberryLanternBlock;
import net.glowberryexpantion.block.GlowberryCakeBlock;
import net.glowberryexpantion.block.GemEngraverBlock;
import net.glowberryexpantion.GlowberryExpantionMod;

public class GlowberryExpantionModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GlowberryExpantionMod.MODID);
	public static final RegistryObject<Block> GLOWVINEBLUE = REGISTRY.register("glowvineblue", () -> new GlowvineblueBlock());
	public static final RegistryObject<Block> GLOWBERRY_REFINER = REGISTRY.register("glowberry_refiner", () -> new GlowberryRefinerBlock());
	public static final RegistryObject<Block> GEM_ENGRAVER = REGISTRY.register("gem_engraver", () -> new GemEngraverBlock());
	public static final RegistryObject<Block> GLOWBERRY_CAKE = REGISTRY.register("glowberry_cake", () -> new GlowberryCakeBlock());
	public static final RegistryObject<Block> GLOWBERRY_LANTERN = REGISTRY.register("glowberry_lantern", () -> new GlowberryLanternBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
