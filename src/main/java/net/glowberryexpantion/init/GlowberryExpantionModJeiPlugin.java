
package net.glowberryexpantion.init;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.glowberryexpantion.jei_recipes.GlowberryRefinerRecipeTypeRecipeCategory;
import net.glowberryexpantion.jei_recipes.GlowberryRefinerRecipeTypeRecipe;
import net.glowberryexpantion.jei_recipes.EngraverRecipeTypeRecipeCategory;
import net.glowberryexpantion.jei_recipes.EngraverRecipeTypeRecipe;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.Objects;
import java.util.List;

@JeiPlugin
public class GlowberryExpantionModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<GlowberryRefinerRecipeTypeRecipe> GlowberryRefinerRecipeType_Type = new mezz.jei.api.recipe.RecipeType<>(GlowberryRefinerRecipeTypeRecipeCategory.UID, GlowberryRefinerRecipeTypeRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<EngraverRecipeTypeRecipe> EngraverRecipeType_Type = new mezz.jei.api.recipe.RecipeType<>(EngraverRecipeTypeRecipeCategory.UID, EngraverRecipeTypeRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("glowberry_expantion:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new GlowberryRefinerRecipeTypeRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new EngraverRecipeTypeRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<GlowberryRefinerRecipeTypeRecipe> GlowberryRefinerRecipeTypeRecipes = recipeManager.getAllRecipesFor(GlowberryRefinerRecipeTypeRecipe.Type.INSTANCE);
		registration.addRecipes(GlowberryRefinerRecipeType_Type, GlowberryRefinerRecipeTypeRecipes);
		List<EngraverRecipeTypeRecipe> EngraverRecipeTypeRecipes = recipeManager.getAllRecipesFor(EngraverRecipeTypeRecipe.Type.INSTANCE);
		registration.addRecipes(EngraverRecipeType_Type, EngraverRecipeTypeRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(GlowberryExpantionModBlocks.GLOWBERRY_REFINER.get().asItem()), GlowberryRefinerRecipeType_Type);
		registration.addRecipeCatalyst(new ItemStack(GlowberryExpantionModBlocks.GEM_ENGRAVER.get().asItem()), EngraverRecipeType_Type);
	}
}
