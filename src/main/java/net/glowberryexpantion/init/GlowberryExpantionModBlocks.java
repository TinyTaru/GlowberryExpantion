
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.glowberryexpantion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.glowberryexpantion.block.GlowvinepurpleBlock;
import net.glowberryexpantion.block.GlowvinegreenBlock;
import net.glowberryexpantion.block.GlowvineblueBlock;
import net.glowberryexpantion.block.GlowingChiseledStoneBlock;
import net.glowberryexpantion.block.GlowingChiseledDeepslateBlock;
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
	public static final RegistryObject<Block> GLOWING_CHISELED_STONE = REGISTRY.register("glowing_chiseled_stone", () -> new GlowingChiseledStoneBlock());
	public static final RegistryObject<Block> GLOWVINEPURPLE = REGISTRY.register("glowvinepurple", () -> new GlowvinepurpleBlock());
	public static final RegistryObject<Block> GLOWING_CHISELED_DEEPSLATE = REGISTRY.register("glowing_chiseled_deepslate", () -> new GlowingChiseledDeepslateBlock());
	public static final RegistryObject<Block> GLOWVINEGREEN = REGISTRY.register("glowvinegreen", () -> new GlowvinegreenBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
