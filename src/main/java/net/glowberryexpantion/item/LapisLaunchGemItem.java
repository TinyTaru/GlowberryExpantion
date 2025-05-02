
package net.glowberryexpantion.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.glowberryexpantion.procedures.LapisLaunchGemRightclickedProcedure;

import java.util.List;

public class LapisLaunchGemItem extends Item {
	public LapisLaunchGemItem() {
		super(new Item.Properties().durability(32).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Can be refilled if not broken."));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		LapisLaunchGemRightclickedProcedure.execute(world, entity, ar.getObject());
		return ar;
	}
}
