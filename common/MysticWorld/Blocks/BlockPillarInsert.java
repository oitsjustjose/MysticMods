package mysticworld.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mysticworld.MysticWorld;
import mysticworld.tiles.TileEntityPillarInsert;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockPillarInsert extends Block {
	public static int RENDER_PILLAR_INSERT;

	public BlockPillarInsert() {
		super(Material.rock);
		this.setBlockUnbreakable();
		this.setResistance(6000000.0F);
		this.setCreativeTab(MysticWorld.MysticWorldTab);
        setBlockBounds(0.125F, 0.0F, 0.125F, 0.875F, 1.0F, 0.875F);
	}

    @Override
    public boolean hasTileEntity(int i){
        return true;
    }

	@Override
	public TileEntity createTileEntity(World world, int i) {
		return new TileEntityPillarInsert();
	}

	@Override
    @SideOnly(Side.CLIENT)
	public int getRenderBlockPass() {
		return 1;
	}

	@Override
	public int getRenderType() {
		return RENDER_PILLAR_INSERT;
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int par6, float par7, float par8, float par9) {
		if (!world.isRemote) {
			if (Items.ender_pearl == entityPlayer.inventory.getCurrentItem().getItem()) {
				TileEntity te = world.getTileEntity(x, y, z);
			}
		}
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister) {
	}

	@Override
    public boolean renderAsNormalBlock(){
        return false;
    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

	@Override
    @SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockAccess blockAccess, int x, int y, int z, int i) {
		return false;
	}
}
