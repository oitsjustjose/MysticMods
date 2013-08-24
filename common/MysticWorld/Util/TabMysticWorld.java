package MysticWorld.Util;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import MysticWorld.Items.ItemHandler$1;

public class TabMysticWorld extends CreativeTabs {

	public TabMysticWorld(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	public ItemStack getIconItemStack() {
	    return new ItemStack(ItemHandler$1.earthStaff, 1);
	}

}