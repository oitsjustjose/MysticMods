package mysticstones.util;

import mysticstones.MysticStones;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabMysticStones extends CreativeTabs {
	public TabMysticStones(String par2Str) {
		super(par2Str);
	}

	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(MysticStones.ReinforcedBricks, 1, 4);
	}
}
