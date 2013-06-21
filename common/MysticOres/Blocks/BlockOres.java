package MysticOres.Blocks;

import java.util.List;
import java.util.Random;

import MysticOres.MysticOres;
import MysticOres.Items.ItemHandler;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockOres extends Block {
	
	Icon[] textures;
	
	public BlockOres(int ID) {
		super(ID, Material.rock);
		setHardness(3F);
		setResistance(5F);
		setCreativeTab(MysticOres.MysticOresTab);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		textures = new Icon[16];

		for (int i = 0; i < 12; i++)
		{
			textures[i] = iconRegister.registerIcon("MysticTextures" + ":" + "MysticOre_" + i);
		}
	}
	
	@Override
	public Icon getIcon(int side, int meta) {
		return textures[meta];
	}
	
	public int idDropped(int par1, Random par2Random, int par3) {
        switch(par1){
        case 1:return ItemHandler.AmethystGem.itemID;
        case 2:return ItemHandler.IridiumNugget.itemID;
        case 4:return ItemHandler.TourmalineGem.itemID;
        case 5:return ItemHandler.TopazGem.itemID;
        case 7:return ItemHandler.BloodstoneShard.itemID;
        case 8:return this.BlackSoulstoneDrops(par1, par2Random, par3);
        case 9:return this.BlueSoulstoneDrops(par1, par2Random, par3);
        case 10:return this.RedSoulstoneDrops(par1, par2Random, par3);
        case 11:return ItemHandler.AgateGem.itemID;
        default:return blockID;
        }
    }
	
	@Override
	public int damageDropped(int j) {
		switch(j){
		case 1:return 0;
		case 2:return 0;
		case 4:return 0;
		case 5:return 0;
		case 7:return 0;
		case 8:return 0;
		case 9:return 0;
		case 10:return 0;
		case 11:return 0;
		default: return j;
		}
	}
	
	public int xpDropAmount(int j) {
		switch(j){
		case 1:return 6;
		case 2:return 6;
		case 4:return 6;
		case 5:return 6;
		case 7:return 6;
		case 8:return 6;
		case 9:return 6;
		case 10:return 6;
		case 11:return 6;
		default: return 0;
		}
	}

	
    protected boolean canSilkHarvest()
    {
        return true;
    }
    
    public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta)
    {
    	this.dropXpOnBlockBreak(world, x, y, z, xpDropAmount(meta));
    }
    
    public int BlackSoulstoneDrops(int par1, Random par2Random, int par3)
    {
    	int w = par2Random.nextInt(6);
		if (w == 0)
		{
			return Item.coal.itemID;
		}
		if (w == 1)
		{
			return Item.gunpowder.itemID;
		}
		if (w == 2)
		{
			return ItemHandler.ObsidianShard.itemID;
		}
		if (w == 3)
		{
			return ItemHandler.GlassShard.itemID;
		}
		else
		{
			return ItemHandler.ObsidianShard.itemID;
		}
    }
    
    public int RedSoulstoneDrops(int par1, Random par2Random, int par3)
    {
    	int w = par2Random.nextInt(6);
        if (w == 0)
        {
                return Item.lightStoneDust.itemID;
        }
        if (w == 1)
        {
                return Item.gunpowder.itemID;
        }
        if (w == 2)
        {
                return ItemHandler.ObsidianShard.itemID;
        }
        if (w == 3)
        {
                return ItemHandler.GlassShard.itemID;
        }
        if (w == 4)
        {
        	return Item.redstone.itemID;
        }
        if (w == 5)
        {
            return ItemHandler.MysticPowder.itemID;
        }
        if (w==6)
        {
        	return Block.obsidian.blockID;
        }
        if (w==7)
        {
        	return ItemHandler.ObsidianShard.itemID;
        }
        else
        {
                return blockID;
        }           
    }
    
    public int BlueSoulstoneDrops(int par1, Random par2Random, int par3)
    {
    	int w = par2Random.nextInt(6);
        if (w == 0)
        {
                return ItemHandler.AgateGem.itemID;
        }
        if (w == 1)
        {
                return ItemHandler.TourmalineGem.itemID;
        }
        if (w == 2)
        {
                return ItemHandler.TopazGem.itemID;
        }
        if (w == 3)
        {
                return ItemHandler.AmethystGem.itemID;
        }
        if (w == 4)
        {
        	return ItemHandler.IridiumNugget.itemID;
        }
        if (w == 5)
        {
            return Item.diamond.itemID;
        }
        if (w == 6)
        {
        	return Block.obsidian.blockID;
        }
        if (w == 7)
        {
        	return Item.gunpowder.itemID;
        }
        if (w==8)
        {
        	return Item.lightStoneDust.itemID;
        }
        else
        {
                return blockID;
        }                
    }
    
  
    
	//meta specific stuff
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return this.blockID;
    }
    
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z)
	{
		int meta = world.getBlockMetadata(x, y, z);
		
		return new ItemStack(this, 1, meta);
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
	}
}
