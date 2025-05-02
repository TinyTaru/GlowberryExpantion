package net.glowberryexpantion.procedures;

import net.minecraft.world.item.ItemStack;

public class IngravedAmethystPropertyValueProviderProcedure {
	public static double execute(ItemStack itemstack) {
		return itemstack.getDamageValue();
	}
}
