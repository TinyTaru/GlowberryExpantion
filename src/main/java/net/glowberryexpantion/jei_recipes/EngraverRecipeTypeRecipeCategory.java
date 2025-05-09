
package net.glowberryexpantion.jei_recipes;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.glowberryexpantion.init.GlowberryExpantionModJeiPlugin;
import net.glowberryexpantion.init.GlowberryExpantionModBlocks;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class EngraverRecipeTypeRecipeCategory implements IRecipeCategory<EngraverRecipeTypeRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("glowberry_expantion", "engraver_recipe_type");
	public final static ResourceLocation TEXTURE = new ResourceLocation("glowberry_expantion", "textures/screens/jer_gui.png");
	private final IDrawable background;
	private final IDrawable icon;

	public EngraverRecipeTypeRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 86);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(GlowberryExpantionModBlocks.GEM_ENGRAVER.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<EngraverRecipeTypeRecipe> getRecipeType() {
		return GlowberryExpantionModJeiPlugin.EngraverRecipeType_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Engraver Recipe Type");
	}

	@Override
	public IDrawable getBackground() {
		return this.background;
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, EngraverRecipeTypeRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 31, 32).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 49, 32).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.INPUT, 67, 32).addIngredients(recipe.getIngredients().get(2));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 121, 32).addItemStack(recipe.getResultItem(null));
	}
}
