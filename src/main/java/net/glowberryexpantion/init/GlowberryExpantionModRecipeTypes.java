package net.glowberryexpantion.init;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.world.item.crafting.RecipeSerializer;

import net.glowberryexpantion.jei_recipes.GlowberryRefinerRecipeTypeRecipe;
import net.glowberryexpantion.jei_recipes.EngraverRecipeTypeRecipe;
import net.glowberryexpantion.GlowberryExpantionMod;

@Mod.EventBusSubscriber(modid = GlowberryExpantionMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GlowberryExpantionModRecipeTypes {
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, "glowberry_expantion");

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		event.enqueueWork(() -> {
			SERIALIZERS.register(bus);
			SERIALIZERS.register("glowberry_refiner_recipe_type", () -> GlowberryRefinerRecipeTypeRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("engraver_recipe_type", () -> EngraverRecipeTypeRecipe.Serializer.INSTANCE);
		});
	}
}
