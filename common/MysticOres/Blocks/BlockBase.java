package MysticOres.Blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import MysticOres.MysticOres;
import MysticOres.Items.Items;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBase extends Block
{
	Icon[] textures;
	
	public BlockBase(int ID)
	{
		super(ID, Material.rock);
		setCreativeTab(MysticOres.MysticOresTab);
	}
	
	
	@Override
	public float getBlockHardness(World world, int x, int y, int z)
	{
		int meta = world.getBlockMetadata(x, y, z);
		if(meta == 12)
			return 4.5f;
		else
			return 3.0f;
	}
	
	@Override
    public float getExplosionResistance(Entity par1Entity, World world, int x, int y, int z, double explosionX, double explosionY, 
    		double explosionZ)
    {
		int meta = world.getBlockMetadata(x, y, z);
		if(meta == 12)
			return 2000.0f;
		else
			return 2.0f;
    }
	
	@Override
	public int getLightValue(IBlockAccess world, int x, int y, int z)
	{
		int meta = world.getBlockMetadata(x, y, z);
		if(meta == 2 || meta == 3)
			return 7;
		else
			return 0;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register)
	{
		textures = new Icon[16];
		for(int i=0;i<ItemBase.BLOCK_NAMES.length;i++)
		{
			textures[i] = register.registerIcon("MysticMods:" + ItemBase.BLOCK_NAMES[i]);
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta)
	{
		return textures[meta];
	}
	
	@Override
	public int idDropped(int par1, Random random, int par3)
	{
		switch(par1)
		{
		case 1:return Items.Resource.itemID;
		case 2:return Items.Resource.itemID;
		case 4:return Items.Resource.itemID;
		case 5:return Items.Resource.itemID;
		case 7:return Items.Resource.itemID;
		case 8:return this.BlackSoulstoneDrops(par1, random, par3);
		case 9:return this.BlueSoulstoneDrops(par1, random, par3);
		case 10:return this.RedSoulstoneDrops(par1, random, par3);
		case 11:return Items.Resource.itemID;
		case 12:return Items.Resource.itemID;
		default:return blockID;
		}
	}
	
	@Override
	public int damageDropped(int j)
	{
		switch(j)
		{
		case 1:return 8;
		case 2:return 4;
		case 4:return 5;
		case 5:return 7;
		case 7:return 10;
		case 8:return 0;
		case 9:return 0;
		case 10:return 0;
		case 11:return 6;
		case 12:return 11;
		default:return j;
		}
	}
	
	@Override
	public int quantityDropped(int meta, int fortune, Random random)
	{
		switch(meta)
		{
		case 2:return random.nextInt(5) + 1;
		case 7:return random.nextInt(3) + 1;
		case 8:return random.nextInt(4) + 1;
		case 9:return random.nextInt(4) + 1;
		case 10:return random.nextInt(4) + 1;
		case 12:return random.nextInt(5) + 1;
		default:return 1;
		}
	}
	
	@Override
	protected boolean canSilkHarvest()
	{
		return true;
	}
	
	@Override
	public int idPicked(World world, int x, int y, int z)
	{
		return this.blockID;
	}
	
	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z)
	{
		int meta = world.getBlockMetadata(x, y, z);
		return new ItemStack(this, 1, meta);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int i, CreativeTabs tab, List list)
	{
		for(int meta = 0;meta<ItemBase.BLOCK_NAMES.length; meta ++)
		{
			list.add(new ItemStack(i, 1, meta));
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int par)
	{
		int meta = world.getBlockMetadata(x, y, z);
		int blockID = world.getBlockId(x, y, z);
		if(meta == 12 && blockID == this.blockID)
			return false;
		else
			return true;
	}
	
	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}
	
	@Override
    public boolean isOpaqueCube()
    {
        return false;
    }
	
	@Override
	public boolean isBlockSolidOnSide(World world, int x, int y, int z, ForgeDirection side)
	{
		int meta = world.getBlockMetadata(x, y, z);
		if(meta == 12)
			return false;
		else
			return true;
	}
	
	public static int BlackSoulstoneDrops(int par1, Random random, int par3)
	{
		int rand = random.nextInt(2);
		switch(rand)
		{
		case 0:return Item.coal.itemID;
		case 1:return Item.gunpowder.itemID;
		default:return Item.sugar.itemID;
		}
	}
	
	public static int RedSoulstoneDrops(int par1, Random random, int par3)
	{
		int rand = random.nextInt(4);
		switch(rand)
		{
		case 0:return Item.glowstone.itemID;
		case 1:return Item.gunpowder.itemID;
		case 2:return Item.redstone.itemID;
		case 3:return Block.obsidian.blockID;
		default:return Item.blazePowder.itemID;
		}
	}
	
	public static int BlueSoulstoneDrops(int par1, Random random, int par3)
	{
		int rand = random.nextInt(5);
		switch(rand)
		{
		case 0:return Item.diamond.itemID;
		case 1:return Block.obsidian.blockID;
		case 2:return Item.gunpowder.itemID;
		case 3:return Item.glowstone.itemID;
		case 4:return Item.blazeRod.itemID;
		case 5:return Item.emerald.itemID;
		default:return Item.emerald.itemID;
		}
	}
}