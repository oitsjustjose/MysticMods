package MysticWorld.Blocks;

import MysticWorld.MysticWorld;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPillarTower extends Block {

	public BlockPillarTower(int id) {
		super(id, Material.rock);
		setBlockUnbreakable();
		setResistance(6000000.0F);
		setCreativeTab(MysticWorld.MysticWorldTab);
		setBlockBounds(0.15F, 0.0F, 0.15F, 0.85F, 1.0F, 0.85F);
	}
	
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
	public boolean isOpaqueCube()
    {
        return false;
    }

}
