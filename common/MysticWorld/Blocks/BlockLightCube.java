package MysticWorld.Blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import MysticWorld.MysticWorld;
import MysticWorld.Items.ItemHandler$1;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockLightCube extends Block {

	public BlockLightCube(int id) {
		super(id, Material.circuits);
		setBlockBounds(0.25F, 0.25F, 0.25F, 0.75F, 0.75F, 0.75F);
		setLightValue(1.0F);
		this.setTickRandomly(true);
	}
    
	@Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
	@Override
    protected boolean canSilkHarvest()
    {
        return true;
    }
    
	@Override
	public boolean isOpaqueCube()
    {
        return false;
    }
	
	@Override
	public int idDropped(int par1, Random par2Random, int par3)
    {
		return 0;
    }   
	
	@Override
	public void randomDisplayTick(World world, int x, int y, int z, Random random)
    {
		MysticWorld.proxy.lightCubeFX(world, (double)x + random.nextDouble(), (double)y + 0.75D, (double)z + random.nextDouble(), 0.0D, 0.0D, 0.0D, 1.0F);
		MysticWorld.proxy.lightCubeFX(world, (double)x + random.nextDouble(), (double)y + 0.75D, (double)z + random.nextDouble(), 0.0D, 0.0D, 0.0D, 1.0F);
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister)
	{
		this.blockIcon = iconRegister.registerIcon("MysticMods" + ":" + "lightCube");
	}
}
