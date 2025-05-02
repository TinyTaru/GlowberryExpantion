
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.glowberryexpantion.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.glowberryexpantion.client.particle.VinedSporeCloudParticle;
import net.glowberryexpantion.client.particle.PupleGlowParticleParticle;
import net.glowberryexpantion.client.particle.GlowingLeatherParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GlowberryExpantionModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(GlowberryExpantionModParticleTypes.VINED_SPORE_CLOUD.get(), VinedSporeCloudParticle::provider);
		event.registerSpriteSet(GlowberryExpantionModParticleTypes.GLOWING_LEATHER_PARTICLE.get(), GlowingLeatherParticleParticle::provider);
		event.registerSpriteSet(GlowberryExpantionModParticleTypes.PUPLE_GLOW_PARTICLE.get(), PupleGlowParticleParticle::provider);
	}
}
