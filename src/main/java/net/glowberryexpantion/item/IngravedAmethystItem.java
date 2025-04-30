
package net.glowberryexpantion.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.glowberryexpantion.procedures.IngravedAmethystRightclickedOnBlockProcedure;

public class IngravedAmethystItem extends Item {
	public IngravedAmethystItem() {
		super(new Item.Properties().durability(32).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		IngravedAmethystRightclickedOnBlockProcedure.execute();
		return InteractionResult.SUCCESS;
	}
}
