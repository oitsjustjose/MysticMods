package mysticstones.util;

import mysticstones.MysticStones;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabMysticStones extends CreativeTabs {
	public TabMysticStones(int par1, String par2Str) {
		super(par1, par2Str);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(MysticStones.ReinforcedBricks, 1, 4);
	}
}
