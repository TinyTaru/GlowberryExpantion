
package net.glowberryexpantion.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.InteractionResult;

import net.glowberryexpantion.procedures.GreenGlowberrysRightclickProcedure;

public class GreenGlowberrysItem extends Item {
	public GreenGlowberrysItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f).build()));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		GreenGlowberrysRightclickProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
