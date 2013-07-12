package MysticOres.Blocks;

import static net.minecraftforge.common.ForgeDirection.DOWN;
import static net.minecraftforge.common.ForgeDirection.UP;

import java.util.List;
import java.util.Random;

import MysticOres.MysticOres;
import MysticOres.Items.ItemHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.BlockFarmland;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.BlockHopper;
import net.minecraft.block.BlockPoweredOre;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBase extends BlockBreakable {
	
	Icon[] textures;
	
	private boolean RenderSide = false;

	public BlockBase(int ID)
	{
		super(ID, "BlockOres", Material.rock, true);
		setCreativeTab(MysticOres.MysticOresTab);
		setResistance(2000F);
		this.RenderSide = false;
	}
	
	
	@Override
	public float getBlockHardness(World world, int x, int y, int z)
	{
		int damageValue = world.getBlockMetadata(x, y, z);
     	if(damageValue == 12)
    	{
     		return 4.5F;
    	}
     	else return 3.0F;
	}

    @Override
    public int getLightValue(IBlockAccess world, int x, int y, int z)
    {
    	int damageValue = world.getBlockMetadata(x, y, z);
     	if(damageValue == 2 || damageValue == 3)
    	{
     		return 7;
    	}
     	else return 0;
      }
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister)
	{
		textures = new Icon[16];

		for (int i = 0; i < 13; i++)
		{
			textures[i] = iconRegister.registerIcon("MysticTextures" + ":" + ItemBlockBase.BLOCK_NAMES[i]);
		}
	}
	
	@Override
	public Icon getIcon(int side, int meta)
	{
		return textures[meta];
	}
	
	
	public int idDropped(int par1, Random par2Random, int par3)
	{
        switch(par1){
        case 1:return ItemHandler.Resource.itemID;
        case 2:return ItemHandler.Resource.itemID;
        case 4:return ItemHandler.Resource.itemID;
        case 5:return ItemHandler.Resource.itemID;
        case 7:return ItemHandler.Resource.itemID;
        case 8:return this.BlackSoulstoneDrops(par1, par2Random, par3);
        case 9:return this.BlueSoulstoneDrops(par1, par2Random, par3);
        case 10:return this.RedSoulstoneDrops(par1, par2Random, par3);
        case 11:return ItemHandler.Resource.itemID;
        case 12:return ItemHandler.Resource.itemID;
        default:return blockID;
        }
    }
	
	@Override
	public int damageDropped(int j) {
		switch(j){
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
	
	@Override
    public int quantityDropped(int meta, int fortune, Random random)
    {
        switch(meta){
        case 2:return random.nextInt(5) + 1;
        case 7:return random.nextInt(3) + 1;
        case 8:return random.nextInt(4) + 1;
        case 9:return random.nextInt(4) + 1;
        case 10:return random.nextInt(4) + 1;
        case 12:return random.nextInt(5) + 1;
        default:return 1;
        }
    }
    
    protected boolean canSilkHarvest()
    {
        return true;
    }

    public int BlackSoulstoneDrops(int par1, Random par2Random, int par3)
    {
    	int w = par2Random.nextInt(3);
		if (w == 0)
		{
			return Item.coal.itemID;
		}
		if (w == 1)
		{
			return Item.gunpowder.itemID;
		}
		else
		{
			return Item.sugar.itemID;
		}
		
    }
    
    public int RedSoulstoneDrops(int par1, Random par2Random, int par3)
    {
    	for(int i=0;i<3;i++)
    	{
    		
    	}
    	int w = par2Random.nextInt(3);
        if (w == 0)
        {
                return Item.glowstone.itemID;
        }
        if (w == 1)
        {
                return Item.gunpowder.itemID;
        }

        if (w == 2)
        {
        	return Item.redstone.itemID;
        }

        if (w==3)
        {
        	return Block.obsidian.blockID;
        }

        else
        {
                return Item.gunpowder.itemID;
        }           
    }
    
    public int BlueSoulstoneDrops(int par1, Random par2Random, int par3)
    {
    	int w = par2Random.nextInt(5);
        if (w == 1)
        {
            return Item.diamond.itemID;
        }
        if (w == 2)
        {
        	return Block.obsidian.blockID;
        }
        if (w == 3)
        {
        	return Item.gunpowder.itemID;
        }
        if (w==4)
        {
        	return Item.glowstone.itemID;
        }
        else
        {
                return Item.emerald.itemID;
        }                
    }
      
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
		for(int meta=0; meta<13; meta++)
		{
			list.add(new ItemStack(i,1,meta));
		}
	}
	
	 public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
	    {
	        int meta = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
	        int blockID = par1IBlockAccess.getBlockId(par2, par3, par4);
	        
	        if(meta == 12 && blockID == this.blockID)
	        {
	        	return false;
	        }
	        else return true;
	    }
	 
	 public int getRenderBlockPass()
		{
		    return 0;
		}
	 
	 public boolean renderAsNormalBlock()
	    {
	        return false;
	    }
	 
	 public boolean isBlockNormalCube(World world, int x, int y, int z)
	    {
	        return true;
	    }
	 
	  public boolean isBlockSolidOnSide(World world, int x, int y, int z, ForgeDirection side)
	  	{
		  int meta = world.getBlockMetadata(x, y, z);
	        
		  if(meta == 12)
		  {
			  return false;
		  }
		  else return true;
	    }
}
