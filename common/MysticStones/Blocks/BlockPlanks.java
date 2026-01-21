package mysticstones.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mysticstones.MysticStones;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockPlanks extends BlockMulti {
	public BlockPlanks() {
		super(Material.wood);
        setHardness(2.5F);
        setResistance(10F);
        setBlockName("BlockMysticPlanks");
		setStepSound(Block.soundTypeWood);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		textures = new IIcon[MysticStones.PLANK_TYPE.size()];
		for (int i = 0; i < textures.length; i++) {
			textures[i] = iconRegister.registerIcon("mysticstones:" + MysticStones.PLANK_TYPE.get(i));
		}
	}
}
