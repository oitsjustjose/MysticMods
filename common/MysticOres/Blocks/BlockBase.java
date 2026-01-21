package mysticores.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mysticores.MysticOres;
import mysticores.items.Items;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.List;
import java.util.Random;

public class BlockBase extends Block {
	IIcon[] textures;

	public BlockBase() {
		super(Material.rock);
        setCreativeTab(MysticOres.MysticOresTab);
        setHarvestLevel("pickaxe", 2);
        setHarvestLevel("pickaxe", 3, 0);
        setHarvestLevel("pickaxe", 3, 2);
        setHarvestLevel("pickaxe", 1, 6);
	}

	@Override
	public int damageDropped(int j) {
		switch (j) {
		case 1:
			return 8;
		case 2:
			return 4;
		case 4:
			return 5;
		case 5:
			return 7;
		case 7:
			return 10;
		case 8:
		case 9:
		case 10:
			return 0;
		case 11:
			return 6;
		case 12:
			return 11;
		default:
			return j;
		}
	}

	@Override
	public float getBlockHardness(World world, int x, int y, int z) {
		int meta = world.getBlockMetadata(x, y, z);
		if (meta == 12)
			return 4.5f;
		else
			return 3.0f;
	}

	@Override
	public float getExplosionResistance(Entity par1Entity, World world, int x, int y, int z, double explosionX, double explosionY, double explosionZ) {
		int meta = world.getBlockMetadata(x, y, z);
		if (meta == 12)
			return 2000.0f;
		else
			return 2.0f;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return textures[meta];
	}

	@Override
	public int getLightValue(IBlockAccess world, int x, int y, int z) {
		int meta = world.getBlockMetadata(x, y, z);
		if (meta == 2 || meta == 3)
			return 7;
		else
			return 0;
	}

	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
		int meta = world.getBlockMetadata(x, y, z);
		return new ItemStack(this, 1, meta);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item i, CreativeTabs tab, List list) {
		for (int meta = 0; meta < BlockHandler.BLOCK_NAMES.size(); meta++) {
			list.add(new ItemStack(i, 1, meta));
		}
	}

	@Override
	public Item getItemDropped(int par1, Random random, int par3) {
		switch (par1) {
		case 1:
		case 2:
		case 4:
		case 5:
		case 7:
		case 11:
		case 12:
			return Items.Resource;
		case 8:
			return BlackSoulstoneDrops(par1, random, par3);
		case 9:
			return BlueSoulstoneDrops(par1, random, par3);
		case 10:
			return RedSoulstoneDrops(par1, random, par3);
		default:
			return super.getItemDropped(par1, random, par3);
		}
	}

	@Override
	public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
		int meta = world.getBlockMetadata(x, y, z);
		if (meta == 12)
			return false;
		else
			return true;
	}

	@Override
    public boolean isOpaqueCube(){
        return false;
    }

	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
		switch (meta) {
		case 2:
			return random.nextInt(5) + 1;
		case 7:
			return random.nextInt(3) + 1;
		case 8:
			return random.nextInt(4) + 1;
		case 9:
			return random.nextInt(4) + 1;
		case 10:
			return random.nextInt(4) + 1;
		case 12:
			return random.nextInt(5) + 1;
		default:
			return 1;
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register) {
		textures = new IIcon[16];
		for (int i = 0; i < BlockHandler.BLOCK_NAMES.size(); i++) {
			textures[i] = register.registerIcon("mysticores:" + BlockHandler.BLOCK_NAMES.get(i));
		}
	}

	@Override
    public boolean renderAsNormalBlock(){
        return false;
    }

	@Override
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side) {
		int meta = world.getBlockMetadata(x, y, z);
		if (meta == 12 && world.getBlock(x, y, z) == this){
            return !(world.getBlock(x-Facing.offsetsXForSide[side], y-Facing.offsetsYForSide[side], z-Facing.offsetsZForSide[side])==this&&world.getBlockMetadata(x-Facing.offsetsXForSide[side], y-Facing.offsetsYForSide[side], z-Facing.offsetsZForSide[side])==meta);
        }else
			return true;
	}

	public static Item BlackSoulstoneDrops(int par1, Random random, int par3) {
		int rand = random.nextInt(2);
		switch (rand) {
		case 0:
			return net.minecraft.init.Items.coal;
		case 1:
			return net.minecraft.init.Items.gunpowder;
		default:
			return net.minecraft.init.Items.sugar;
		}
	}

	public static Item BlueSoulstoneDrops(int par1, Random random, int par3) {
		int rand = random.nextInt(5);
		switch (rand) {
		case 0:
			return net.minecraft.init.Items.diamond;
		case 1:
			return Item.getItemFromBlock(Blocks.obsidian);
		case 2:
			return net.minecraft.init.Items.gunpowder;
		case 3:
			return net.minecraft.init.Items.glowstone_dust;
		case 4:
			return net.minecraft.init.Items.blaze_rod;
		case 5:
		default:
			return net.minecraft.init.Items.emerald;
		}
	}

	public static Item RedSoulstoneDrops(int par1, Random random, int par3) {
		int rand = random.nextInt(4);
		switch (rand) {
		case 0:
			return net.minecraft.init.Items.glowstone_dust;
		case 1:
			return net.minecraft.init.Items.gunpowder;
		case 2:
			return net.minecraft.init.Items.redstone;
		case 3:
			return Item.getItemFromBlock(Blocks.obsidian);
		default:
			return net.minecraft.init.Items.blaze_powder;
		}
	}
}