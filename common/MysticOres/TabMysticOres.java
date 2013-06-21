package MysticOres;

import MysticOres.Blocks.BlockHandler;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabMysticOres extends CreativeTabs {

	public TabMysticOres(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	public ItemStack getIconItemStack() {
	    return new ItemStack(BlockHandler.BlockOres, 1, 7);
	}

}
