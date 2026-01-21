package mysticstones.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mysticstones.MysticStones;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockStoneBricks extends BlockMulti {
	public BlockStoneBricks() {
		super(Material.rock);
        setHardness(2F);
        setResistance(5F);
        setBlockName("BlockMysticStoneBricks");
		setStepSound(Block.soundTypeStone);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		textures = new IIcon[MysticStones.STONEBRICK_TYPES.size()];
		for (int i = 0; i < textures.length; i++) {
			textures[i] = iconRegister.registerIcon("mysticstones:" + MysticStones.STONEBRICK_TYPES.get(i));
		}
	}
}
