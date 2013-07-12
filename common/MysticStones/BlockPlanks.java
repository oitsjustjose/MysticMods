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

public class BlockPlanks extends Block {
	
	Icon[] textures;

	public BlockPlanks(int ID) {
		super(ID, Material.wood);
		setHardness(2.5F);
		setResistance(10F);
		setCreativeTab(MysticStones.MysticStonesTab);
		setUnlocalizedName("BlockMysticPlanks");
		setStepSound(Block.soundWoodFootstep);
	}
	
	@Override
	public int damageDropped(int j) 
	{
		return j;
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

		for (int i = 0; i < 7; i++)
		{
			textures[i] = iconRegister.registerIcon("MysticTextures" + ":" + ItemBlockPlanks.PLANK_TYPE[i]);
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
	}
	
	
}
