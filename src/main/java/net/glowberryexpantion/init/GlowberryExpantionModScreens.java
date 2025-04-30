
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.glowberryexpantion.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.glowberryexpantion.client.gui.RefinerGUIScreen;
import net.glowberryexpantion.client.gui.GemEngraverGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GlowberryExpantionModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(GlowberryExpantionModMenus.REFINER_GUI.get(), RefinerGUIScreen::new);
			MenuScreens.register(GlowberryExpantionModMenus.GEM_ENGRAVER_GUI.get(), GemEngraverGUIScreen::new);
		});
	}
}
