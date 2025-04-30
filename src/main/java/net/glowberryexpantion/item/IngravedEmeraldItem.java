
package net.glowberryexpantion.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.glowberryexpantion.procedures.IngravedEmeraldRightclickedOnBlockProcedure;

public class IngravedEmeraldItem extends Item {
	public IngravedEmeraldItem() {
		super(new Item.Properties().durability(45).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		IngravedEmeraldRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
