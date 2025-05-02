
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.glowberryexpantion.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.glowberryexpantion.client.renderer.TheVinedRenderer;
import net.glowberryexpantion.client.renderer.PurpleOrbRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GlowberryExpantionModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(GlowberryExpantionModEntities.THE_VINED.get(), TheVinedRenderer::new);
		event.registerEntityRenderer(GlowberryExpantionModEntities.PURPLE_ORB.get(), PurpleOrbRenderer::new);
	}
}
