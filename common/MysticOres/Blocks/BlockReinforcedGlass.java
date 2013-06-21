package MysticOres.Blocks;

import java.util.Random;

import MysticOres.MysticOres;
import MysticOres.Items.ItemHandler;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;


public class BlockReinforcedGlass extends BlockBreakable
{
	Icon[] textures;

	private boolean RenderSide = false;
	
	public BlockReinforcedGlass(int par1, boolean par4) {
		super(par1, "ReinforcedGlass", Material.glass, par4);
		this.setCreativeTab(MysticOres.MysticOresTab);
		this.RenderSide = false;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister)
	{
		textures = new Icon[16];
		for(int i=0;i<8;i++)
		{
			textures[i] = iconRegister.registerIcon("MysticTextures" + ":" + "ReinforcedGlass");
		}
	}
	
	@Override
	public Icon getIcon(int side, int meta)
	{
		return textures[meta];
	}
	
	public int idDropped(int par1, Random par2Random, int par3)
	{
		return ItemHandler.GlassShard.itemID;
	}
	
	public int quantityDropped(Random par1Random)
    {
        return 1 + par1Random.nextInt(2);
    }
	
    public boolean renderAsNormalBlock()
    {
        return false;
    }
	
	public int getRenderBlockPass()
	{
	    return 0;
	}
	
	public boolean isOpaqueCube()
    {
        return false;
    }
	
	protected boolean canSilkHarvest()
    {
        return true;
    }
	
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        int var6 = par1IBlockAccess.getBlockId(par2, par3, par4);
        return !this.RenderSide && var6 == this.blockID ? false : super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, par5);
    }
	
}

