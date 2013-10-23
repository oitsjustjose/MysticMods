package mysticstones.blocks;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mysticstones.MysticStones;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class BlockMulti extends Block {
	Icon[] textures;

	public BlockMulti(int par1, Material par2Material) {
		super(par1, par2Material);
		setCreativeTab(MysticStones.MysticStonesTab);
	}

	@Override
	public int damageDropped(int j) {
		return j;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		return textures[meta];
	}

	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
		int id = idPicked(world, x, y, z);
		if (id == 0) {
			return null;
		}
		Item item = Item.itemsList[id];
		if (item == null) {
			return null;
		}
		return new ItemStack(id, 1, getDamageValue(world, x, y, z));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int i, CreativeTabs tab, List list) {
		for (int j = 0; j < textures.length; j++) {
			list.add(new ItemStack(i, 1, j));
		}
	}
}
