
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.glowberryexpantion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.glowberryexpantion.GlowberryExpantionMod;

public class GlowberryExpantionModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, GlowberryExpantionMod.MODID);
	public static final RegistryObject<SoundEvent> ENGRAVED_GEM_USE = REGISTRY.register("engraved_gem_use", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("glowberry_expantion", "engraved_gem_use")));
	public static final RegistryObject<SoundEvent> ENGRAVER_USE = REGISTRY.register("engraver_use", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("glowberry_expantion", "engraver_use")));
}
