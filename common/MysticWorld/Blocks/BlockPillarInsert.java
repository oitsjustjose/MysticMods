package mysticworld.blocks;

import mysticworld.MysticWorld;
import mysticworld.tiles.TileEntityPillarInsert;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockPillarInsert extends BlockContainer {
	public static int RENDER_PILLAR_INSERT;

	public BlockPillarInsert(int id) {
		super(id, Material.rock);
		this.setBlockUnbreakable();
		this.setResistance(6000000.0F);
		this.setCreativeTab(MysticWorld.MysticWorldTab);
		setBlockBounds(0.125F, 0.0F, 0.125F, 0.875F, 1.0F, 0.875F);
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityPillarInsert();
	}

	@Override
	public int getRenderBlockPass() {
		return 1;
	}

	@Override
	public int getRenderType() {
		return RENDER_PILLAR_INSERT;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int par6, float par7, float par8, float par9) {
		if (!world.isRemote) {
			if (Item.enderPearl.itemID == entityPlayer.inventory.getCurrentItem().itemID) {
				TileEntity te = world.getBlockTileEntity(x, y, z);
			}
		}
		return false;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean shouldSideBeRendered(IBlockAccess blockAccess, int x, int y, int z, int i) {
		return false;
	}
}
