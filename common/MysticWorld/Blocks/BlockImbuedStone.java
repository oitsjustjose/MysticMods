package mysticworld.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mysticworld.MysticWorld;
import mysticworld.items.ItemHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class BlockImbuedStone extends Block {
	IIcon[] textures;

	public BlockImbuedStone() {
		super(Material.rock);
        setHardness(0.5F);
        setResistance(5F);
		setCreativeTab(MysticWorld.MysticWorldTab);
        setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.125F, 0.75F);
        setLightLevel(0.625f);
	}

	@Override
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
		return World.doesBlockHaveSolidTopSurface(par1World, par2, par3 - 1, par4);
	}

	@Override
	public int damageDropped(int j) {
		return j;
	}

	@Override
	public int getDamageValue(World par1World, int par2, int par3, int par4) {
		return par1World.getBlockMetadata(par2, par3, par4);
	}

	@Override
    @SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return textures[meta];
	}

	@Override
    @SideOnly(Side.CLIENT)
	public void getSubBlocks(Item i, CreativeTabs tab, List list) {
		for (int j = 0; j < 5; j++) {
			list.add(new ItemStack(i, 1, j));
		}
	}

	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3) {
		return ItemHandler.imbuedShard;
	}

	@Override
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta) {
		this.dropXpOnBlockBreak(world, x, y, z, xpDropAmount(meta));
	}

	@Override
	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, Block par5) {
		boolean flag = false;
		if (!World.doesBlockHaveSolidTopSurface(par1World, par2, par3 - 1, par4) && !BlockFence.func_149825_a(par1World.getBlock(par2, par3 - 1, par4))) {
			flag = true;
		}
		if (flag) {
			this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
			par1World.setBlockToAir(par2, par3, par4);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		textures = new IIcon[16];
		for (int i = 0; i < 5; i++) {
			textures[i] = iconRegister.registerIcon("mysticworld:" + BlockHandler.IMBUED_STONE_TYPE.get(i).substring(11) + " Imbued Stone");
		}
	}

    @Override
    public boolean renderAsNormalBlock(){
        return false;
    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

	public int xpDropAmount(int j) {
		return 5;
	}
}