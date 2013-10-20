package mysticworld.util;

import mysticworld.items.ItemHandler$1;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabMysticWorld extends CreativeTabs {
	public TabMysticWorld(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(ItemHandler$1.earthStaff, 1);
	}
}