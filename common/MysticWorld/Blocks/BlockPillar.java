package mysticworld.blocks;

import mysticworld.MysticWorld;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPillar extends Block {
	public BlockPillar() {
		super(Material.rock);
        setBlockUnbreakable();
        setResistance(6000000.0F);
		setCreativeTab(MysticWorld.MysticWorldTab);
        setBlockBounds(0.15F, 0.0F, 0.15F, 0.85F, 1.0F, 0.85F);
	}

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

    @Override
    public boolean renderAsNormalBlock(){
        return false;
    }
}
