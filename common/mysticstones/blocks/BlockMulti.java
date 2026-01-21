package mysticstones.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mysticstones.MysticStones;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import java.util.List;

public class BlockMulti extends Block {
	IIcon[] textures;

	public BlockMulti(Material par2Material) {
		super(par2Material);
		setCreativeTab(MysticStones.MysticStonesTab);
	}

	@Override
	public int damageDropped(int j) {
		return j;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return textures[meta];
	}

	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
		Item item = getItem(world, x, y, z);
		if (item == null) {
			return null;
		}
		return new ItemStack(item, 1, getDamageValue(world, x, y, z));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item i, CreativeTabs tab, List list) {
		for (int j = 0; j < textures.length; j++) {
			list.add(new ItemStack(i, 1, j));
		}
	}
}
