
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.glowberryexpantion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import net.glowberryexpantion.procedures.IngravedAmethystPropertyValueProviderProcedure;
import net.glowberryexpantion.item.PurpleGlowberrysItem;
import net.glowberryexpantion.item.MortarAndPestleItem;
import net.glowberryexpantion.item.LapisLaunchGemItem;
import net.glowberryexpantion.item.LapisLaunchGemEmptyItem;
import net.glowberryexpantion.item.IngravedEmeraldItem;
import net.glowberryexpantion.item.IngravedDiamondItem;
import net.glowberryexpantion.item.IngravedAmethystItem;
import net.glowberryexpantion.item.GlowingLeatherItem;
import net.glowberryexpantion.item.GlowberrypieItem;
import net.glowberryexpantion.item.GlowBerryExtractItem;
import net.glowberryexpantion.item.ChiselItem;
import net.glowberryexpantion.item.BlueGlowberrysItem;
import net.glowberryexpantion.item.BlueGlowberryExtractItem;
import net.glowberryexpantion.GlowberryExpantionMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GlowberryExpantionModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GlowberryExpantionMod.MODID);
	public static final RegistryObject<Item> GLOWVINEBLUE = block(GlowberryExpantionModBlocks.GLOWVINEBLUE);
	public static final RegistryObject<Item> BLUE_GLOWBERRYS = REGISTRY.register("blue_glowberrys", () -> new BlueGlowberrysItem());
	public static final RegistryObject<Item> BLUE_GLOWBERRY_EXTRACT = REGISTRY.register("blue_glowberry_extract", () -> new BlueGlowberryExtractItem());
	public static final RegistryObject<Item> GLOWBERRY_REFINER = block(GlowberryExpantionModBlocks.GLOWBERRY_REFINER);
	public static final RegistryObject<Item> MORTAR_AND_PESTLE = REGISTRY.register("mortar_and_pestle", () -> new MortarAndPestleItem());
	public static final RegistryObject<Item> GLOW_BERRY_EXTRACT = REGISTRY.register("glow_berry_extract", () -> new GlowBerryExtractItem());
	public static final RegistryObject<Item> LAPIS_LAUNCH_GEM = REGISTRY.register("lapis_launch_gem", () -> new LapisLaunchGemItem());
	public static final RegistryObject<Item> LAPIS_LAUNCH_GEM_EMPTY = REGISTRY.register("lapis_launch_gem_empty", () -> new LapisLaunchGemEmptyItem());
	public static final RegistryObject<Item> GLOWING_LEATHER_HELMET = REGISTRY.register("glowing_leather_helmet", () -> new GlowingLeatherItem.Helmet());
	public static final RegistryObject<Item> GLOWING_LEATHER_CHESTPLATE = REGISTRY.register("glowing_leather_chestplate", () -> new GlowingLeatherItem.Chestplate());
	public static final RegistryObject<Item> GLOWING_LEATHER_BOOTS = REGISTRY.register("glowing_leather_boots", () -> new GlowingLeatherItem.Boots());
	public static final RegistryObject<Item> THE_VINED_SPAWN_EGG = REGISTRY.register("the_vined_spawn_egg", () -> new ForgeSpawnEggItem(GlowberryExpantionModEntities.THE_VINED, -16724992, -3407668, new Item.Properties()));
	public static final RegistryObject<Item> INGRAVED_AMETHYST = REGISTRY.register("ingraved_amethyst", () -> new IngravedAmethystItem());
	public static final RegistryObject<Item> GEM_ENGRAVER = block(GlowberryExpantionModBlocks.GEM_ENGRAVER);
	public static final RegistryObject<Item> INGRAVED_EMERALD = REGISTRY.register("ingraved_emerald", () -> new IngravedEmeraldItem());
	public static final RegistryObject<Item> INGRAVED_DIAMOND = REGISTRY.register("ingraved_diamond", () -> new IngravedDiamondItem());
	public static final RegistryObject<Item> CHISEL = REGISTRY.register("chisel", () -> new ChiselItem());
	public static final RegistryObject<Item> GLOWBERRYPIE = REGISTRY.register("glowberrypie", () -> new GlowberrypieItem());
	public static final RegistryObject<Item> GLOWBERRY_CAKE = block(GlowberryExpantionModBlocks.GLOWBERRY_CAKE);
	public static final RegistryObject<Item> GLOWBERRY_LANTERN = block(GlowberryExpantionModBlocks.GLOWBERRY_LANTERN);
	public static final RegistryObject<Item> PURPLE_GLOWBERRYS = REGISTRY.register("purple_glowberrys", () -> new PurpleGlowberrysItem());
	public static final RegistryObject<Item> GLOWING_CHISELED_STONE = block(GlowberryExpantionModBlocks.GLOWING_CHISELED_STONE);
	public static final RegistryObject<Item> GLOWVINEPURPLE = block(GlowberryExpantionModBlocks.GLOWVINEPURPLE);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(LAPIS_LAUNCH_GEM.get(), new ResourceLocation("glowberry_expantion:lapis_launch_gem_glowlevel"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) IngravedAmethystPropertyValueProviderProcedure.execute(itemStackToRender));
			ItemProperties.register(INGRAVED_AMETHYST.get(), new ResourceLocation("glowberry_expantion:ingraved_amethyst_isglowing"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) IngravedAmethystPropertyValueProviderProcedure.execute(itemStackToRender));
			ItemProperties.register(INGRAVED_DIAMOND.get(), new ResourceLocation("glowberry_expantion:ingraved_diamond_glow_level"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) IngravedAmethystPropertyValueProviderProcedure.execute(itemStackToRender));
		});
	}
}
