package mysticstones.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class BlockReinforced extends BlockMulti {
	public BlockReinforced() {
		super(Material.iron);
        setHardness(4F);
        setResistance(2000F);
        setBlockName("BlockMysticReinforcedBrick");
        setStepSound(Block.soundTypeMetal);
	}

	@Override
	public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		textures = new IIcon[ItemReinforced.BRICK_TYPE.size()];
		for (int i = 0; i < textures.length; i++) {
			textures[i] = iconRegister.registerIcon("mysticstones:" + ItemReinforced.BRICK_TYPE.get(i));
		}
	}
}
