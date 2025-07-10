
package net.glowberryexpantion.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GlowstoneCrystalItem extends Item {
	public GlowstoneCrystalItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
	}
}
