package mysticworld.util;

import mysticworld.items.ItemHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabMysticWorld extends CreativeTabs {
	public TabMysticWorld(String par2Str) {
		super(par2Str);
	}

	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(ItemHandler.earthStaff, 1);
	}
}