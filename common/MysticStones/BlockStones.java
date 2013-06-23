package MysticStones;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockStones extends Block {
	
	Icon[] textures;

	public BlockStones(int ID) {
		super(ID, Material.rock);
		setHardness(1F);
		setResistance(5F);
		setCreativeTab(MysticStones.MysticStonesTab);
	}
	
	@Override
	public int damageDropped(int j) 
	{
		switch(j)
		{
		case 0:return 1;
		case 2:return 3;
		case 4:return 5;
		case 6:return 7;
		case 8:return 9;
		case 10:return 11;
		case 12:return 13;
		default:return j;
		}
	}
	
	protected boolean canSilkHarvest()
	{
		return true;
	}
	
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z)
	{
		int meta = world.getBlockMetadata(x, y, z);
		
		return new ItemStack(this, 1, meta);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister)
	{
		textures = new Icon[16];

		for (int i = 0; i < 14; i++)
		{
			textures[i] = iconRegister.registerIcon("MysticTextures" + ":" + ItemBlockStones.STONE_TYPES[i]);
		}
	}
	
	@Override
	public Icon getIcon(int side, int meta)
	{
		return textures[meta];
	}
	
	public void getSubBlocks(int i,CreativeTabs tab, List list)
	{
		list.add(new ItemStack(i,1,0));
		list.add(new ItemStack(i,1,1));
		list.add(new ItemStack(i,1,2));
		list.add(new ItemStack(i,1,3));
		list.add(new ItemStack(i,1,4));
		list.add(new ItemStack(i,1,5));
		list.add(new ItemStack(i,1,6));
		list.add(new ItemStack(i,1,7));
		list.add(new ItemStack(i,1,8));
		list.add(new ItemStack(i,1,9));
		list.add(new ItemStack(i,1,10));
		list.add(new ItemStack(i,1,11));
		list.add(new ItemStack(i,1,12));
		list.add(new ItemStack(i,1,13));
	}
}
