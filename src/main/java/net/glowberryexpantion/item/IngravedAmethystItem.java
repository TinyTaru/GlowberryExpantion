
package net.glowberryexpantion.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import net.glowberryexpantion.procedures.IngravedAmethystRightclickedOnBlockProcedure;

import java.util.List;

public class IngravedAmethystItem extends Item {
	public IngravedAmethystItem() {
		super(new Item.Properties().durability(32).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Don't click on the ceiling"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		IngravedAmethystRightclickedOnBlockProcedure.execute(context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
