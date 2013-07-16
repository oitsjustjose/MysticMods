package MysticWorld.Blocks;

import MysticWorld.MysticWorld;
import MysticWorld.TileEntity.TileEntityPillarInsert;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockPillarInsert extends BlockContainer {

	public BlockPillarInsert(int id) 
	{
		super(id, Material.rock);
		this.setBlockUnbreakable();
		this.setResistance(6000000.0F);
		setCreativeTab(MysticWorld.MysticWorldTab);
		setBlockBounds(0.15F, 0.0F, 0.15F, 0.85F, 1.0F, 0.85F);
	}

	@Override
	public boolean shouldSideBeRendered(IBlockAccess blockAccess, int x, int y, int z, int i)
	{
		return false;
	}
	
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	@Override
    public int getRenderType()
    {
        return -1;
    }
	
	@Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }
	
	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityPillarInsert();
	}
	
}

