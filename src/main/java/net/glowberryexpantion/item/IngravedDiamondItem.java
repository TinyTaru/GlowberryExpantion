
package net.glowberryexpantion.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import net.glowberryexpantion.procedures.IngravedDiamondRightclickedOnBlockProcedure;

import java.util.List;

public class IngravedDiamondItem extends Item {
	public IngravedDiamondItem() {
		super(new Item.Properties().durability(45).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Zap!"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		IngravedDiamondRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
