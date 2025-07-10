
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.glowberryexpantion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.glowberryexpantion.potion.RadianceMobEffect;
import net.glowberryexpantion.GlowberryExpantionMod;

public class GlowberryExpantionModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, GlowberryExpantionMod.MODID);
	public static final RegistryObject<MobEffect> RADIANCE = REGISTRY.register("radiance", () -> new RadianceMobEffect());
}
