package net.glowberryexpantion.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.glowberryexpantion.init.GlowberryExpantionModBlockEntities;
import net.glowberryexpantion.block.renderer.BlackstoneChestTileRenderer;
import net.glowberryexpantion.GlowberryExpantionMod;

@Mod.EventBusSubscriber(modid = GlowberryExpantionMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(GlowberryExpantionModBlockEntities.BLACKSTONE_CHEST.get(), context -> new BlackstoneChestTileRenderer());
	}
}
