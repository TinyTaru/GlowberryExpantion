
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.glowberryexpantion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.glowberryexpantion.GlowberryExpantionMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GlowberryExpantionModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GlowberryExpantionMod.MODID);
	public static final RegistryObject<CreativeModeTab> GLOWBERRY_EXPANTION = REGISTRY.register("glowberry_expantion",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.glowberry_expantion.glowberry_expantion")).icon(() -> new ItemStack(GlowberryExpantionModItems.BLUE_GLOWBERRYS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GlowberryExpantionModItems.BLUE_GLOWBERRYS.get());
				tabData.accept(GlowberryExpantionModItems.BLUE_GLOWBERRY_EXTRACT.get());
				tabData.accept(GlowberryExpantionModBlocks.GLOWBERRY_REFINER.get().asItem());
				tabData.accept(GlowberryExpantionModItems.MORTAR_AND_PESTLE.get());
				tabData.accept(GlowberryExpantionModItems.GLOW_BERRY_EXTRACT.get());
				tabData.accept(GlowberryExpantionModItems.LAPIS_LAUNCH_GEM.get());
				tabData.accept(GlowberryExpantionModItems.GLOWING_LEATHER_HELMET.get());
				tabData.accept(GlowberryExpantionModItems.GLOWING_LEATHER_CHESTPLATE.get());
				tabData.accept(GlowberryExpantionModItems.GLOWING_LEATHER_BOOTS.get());
				tabData.accept(GlowberryExpantionModItems.THE_VINED_SPAWN_EGG.get());
				tabData.accept(GlowberryExpantionModItems.INGRAVED_AMETHYST.get());
				tabData.accept(GlowberryExpantionModBlocks.GEM_ENGRAVER.get().asItem());
				tabData.accept(GlowberryExpantionModItems.INGRAVED_EMERALD.get());
				tabData.accept(GlowberryExpantionModItems.INGRAVED_DIAMOND.get());
				tabData.accept(GlowberryExpantionModItems.CHISEL.get());
				tabData.accept(GlowberryExpantionModItems.GLOWBERRYPIE.get());
				tabData.accept(GlowberryExpantionModBlocks.GLOWBERRY_CAKE.get().asItem());
				tabData.accept(GlowberryExpantionModBlocks.GLOWBERRY_LANTERN.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(GlowberryExpantionModBlocks.GLOWBERRY_REFINER.get().asItem());
			tabData.accept(GlowberryExpantionModBlocks.GEM_ENGRAVER.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(GlowberryExpantionModItems.GLOWING_LEATHER_HELMET.get());
			tabData.accept(GlowberryExpantionModItems.GLOWING_LEATHER_CHESTPLATE.get());
			tabData.accept(GlowberryExpantionModItems.GLOWING_LEATHER_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(GlowberryExpantionModItems.BLUE_GLOWBERRYS.get());
		}
	}
}
