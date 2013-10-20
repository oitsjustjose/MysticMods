package mysticores.util;

import mysticores.blocks.BlockHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabMysticOres extends CreativeTabs {
	public TabMysticOres(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(BlockHandler.BlockBase, 1, 7);
	}
}
