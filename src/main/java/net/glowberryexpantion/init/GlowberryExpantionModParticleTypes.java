
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.glowberryexpantion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.glowberryexpantion.GlowberryExpantionMod;

public class GlowberryExpantionModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, GlowberryExpantionMod.MODID);
	public static final RegistryObject<SimpleParticleType> VINED_SPORE_CLOUD = REGISTRY.register("vined_spore_cloud", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> GLOWING_LEATHER_PARTICLE = REGISTRY.register("glowing_leather_particle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> PUPLE_GLOW_PARTICLE = REGISTRY.register("puple_glow_particle", () -> new SimpleParticleType(false));
}
