
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.glowberryexpantion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.glowberryexpantion.GlowberryExpantionMod;

public class GlowberryExpantionModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, GlowberryExpantionMod.MODID);
	public static final RegistryObject<PaintingVariant> LUSH_PANTING = REGISTRY.register("lush_panting", () -> new PaintingVariant(16, 32));
}
