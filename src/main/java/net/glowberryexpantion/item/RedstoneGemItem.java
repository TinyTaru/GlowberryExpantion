
package net.glowberryexpantion.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RedstoneGemItem extends Item {
	public RedstoneGemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
