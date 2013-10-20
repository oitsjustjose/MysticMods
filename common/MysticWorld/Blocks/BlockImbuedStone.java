package mysticworld.blocks;

import java.util.List;
import java.util.Random;

import mysticworld.MysticWorld;
import mysticworld.items.ItemHandler$1;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockImbuedStone extends Block {
	Icon[] textures;

	public BlockImbuedStone(int ID) {
		super(ID, Material.rock);
		setHardness(0.5F);
		setResistance(5F);
		setCreativeTab(MysticWorld.MysticWorldTab);
		setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.125F, 0.75F);
		setLightValue(0.625f);
	}

	@Override
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
		return par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4);
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
	public Icon getIcon(int side, int meta) {
		return textures[meta];
	}

	@Override
	public void getSubBlocks(int i, CreativeTabs tab, List list) {
		for (int j = 0; j < 5; j++) {
			list.add(new ItemStack(i, 1, j));
		}
	}

	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		return ItemHandler$1.imbuedShard.itemID;
	}

	@Override
	public int idPicked(World par1World, int par2, int par3, int par4) {
		return blockID;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta) {
		this.dropXpOnBlockBreak(world, x, y, z, xpDropAmount(meta));
	}

	@Override
	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5) {
		boolean flag = false;
		if (!par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4) && !BlockFence.isIdAFence(par1World.getBlockId(par2, par3 - 1, par4))) {
			flag = true;
		}
		if (flag) {
			this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
			par1World.setBlockToAir(par2, par3, par4);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		textures = new Icon[16];
		for (int i = 0; i < 5; i++) {
			textures[i] = iconRegister.registerIcon("MysticMods" + ":" + ItemImbuedStone.IMBUED_STONE_TYPE[i] + " Imbued Stone");
		}
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	public int xpDropAmount(int j) {
		return 5;
	}

	@Override
	protected boolean canSilkHarvest() {
		return true;
	}
}