package mysticworld.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mysticworld.MysticWorld;
import mysticworld.items.ItemHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;

import java.util.List;
import java.util.Random;

public class BlockBushes extends BlockBush {
	IIcon[] textures;

	public BlockBushes() {
		super(Material.leaves);
		setCreativeTab(MysticWorld.MysticWorldTab);
        setHardness(0.3F);
        setResistance(0.1F);
        setStepSound(Block.soundTypeGrass);
        setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
		int l = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
		return l == -1 ? 16777215 : par1IBlockAccess.getBiomeGenForCoords(par2, par4).getBiomeGrassColor(par2, par3, par4);
	}

	@Override
	public int damageDropped(int j) {
		return j;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getBlockColor() {
		double d0 = 0.5D;
		double d1 = 1.0D;
		return ColorizerGrass.getGrassColor(d0, d1);
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
		return AxisAlignedBB.getBoundingBox(par2 + this.getBlockBoundsMinX(), par3 + this.getBlockBoundsMinY(), par4 + this.getBlockBoundsMinZ(), par2 + this.getBlockBoundsMaxX(), par3 + this.getBlockBoundsMaxY(), par4 + this.getBlockBoundsMaxZ());
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return textures[meta];
	}

	@Override
	public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
		return EnumPlantType.Plains;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getRenderColor(int par1) {
		return par1 == -1 ? 16777215 : ColorizerFoliage.getFoliageColorBasic();
	}

	@Override
	public int getRenderType() {
		return 0;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item i, CreativeTabs tab, List list) {
		for (int j = 0; j < 12; j++) {
			list.add(new ItemStack(i, 1, j));
		}
	}

	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3) {
		return ItemHandler.bushFruit;
	}

	@Override
	public int quantityDroppedWithBonus(int par1, Random par2Random) {
		return 1 + par2Random.nextInt(par1 * 2 + 1);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		textures = new IIcon[16];
		for (int i = 0; i < 12; i++) {
			textures[i] = iconRegister.registerIcon("mysticworld:" + BlockHandler.BUSH_TYPES.get(i));
		}
	}

	@Override
	protected boolean canPlaceBlockOn(Block par1) {
		return par1 == Blocks.grass || par1 == Blocks.dirt;
	}
}
