
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.glowberryexpantion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.glowberryexpantion.world.inventory.RefinerGUIMenu;
import net.glowberryexpantion.world.inventory.GemEngraverGUIMenu;
import net.glowberryexpantion.GlowberryExpantionMod;

public class GlowberryExpantionModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, GlowberryExpantionMod.MODID);
	public static final RegistryObject<MenuType<RefinerGUIMenu>> REFINER_GUI = REGISTRY.register("refiner_gui", () -> IForgeMenuType.create(RefinerGUIMenu::new));
	public static final RegistryObject<MenuType<GemEngraverGUIMenu>> GEM_ENGRAVER_GUI = REGISTRY.register("gem_engraver_gui", () -> IForgeMenuType.create(GemEngraverGUIMenu::new));
}
