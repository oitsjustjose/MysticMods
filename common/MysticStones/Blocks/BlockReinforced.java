package MysticStones.Blocks;

import java.util.List;
import java.util.Random;

import MysticStones.MysticStones;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockReinforced extends Block {
	
	Icon[] textures;

	public BlockReinforced(int ID) {
		super(ID, Material.iron);
		setHardness(4F);
		setResistance(2000F);
		setCreativeTab(MysticStones.MysticStonesTab);
		setUnlocalizedName("BlockMysticReinforcedBrick");
		setStepSound(Block.soundMetalFootstep);
	}
	
	@Override
	public int damageDropped(int j) 
	{
		return j;
	}
	
	 public boolean isBeaconBase(World worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ)
	    {
	        return (true);
	    }
	
	public ItemStack getPickBlock(MovingObjectPosition target,World world, int x, int y, int z)
	{
		int id = idPicked(world, x, y, z);
		
		if (id == 0)
		{
			return null;
		}
		
		Item item = Item.itemsList[id];
		if (item == null)
		{
			return null;
		}
		
		return new ItemStack(id, 1, getDamageValue(world, x, y, z));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister)
	{
		textures = new Icon[16];

		for (int i = 0; i < 8; i++)
		{
			textures[i] = iconRegister.registerIcon("MysticMods" + ":" + ItemReinforced.BRICK_TYPE[i] + " Bricks");
		}
	}
	
	@Override
	public Icon getIcon(int side, int meta)
	{
		return textures[meta];
	}

	
	public void getSubBlocks(int i,CreativeTabs tab, List list)
	{
		for(int k=0;k<8;k++)
		{
			list.add(new ItemStack(i,1,k));
		}
	}
}
