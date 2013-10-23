package mysticores.util;

import mysticores.blocks.BlockHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabMysticOres extends CreativeTabs {
	public TabMysticOres(String par2Str) {
		super(par2Str);
	}

	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(BlockHandler.BlockBase, 1, 7);
	}
}
