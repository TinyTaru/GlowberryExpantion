
package net.glowberryexpantion.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IgnoreItem extends Item {
	public IgnoreItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
