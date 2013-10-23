package mysticstones.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockStoneBricks extends BlockMulti {
	public BlockStoneBricks(int ID) {
		super(ID, Material.rock);
		setHardness(2F);
		setResistance(5F);
		setUnlocalizedName("BlockMysticStoneBricks");
		setStepSound(Block.soundStoneFootstep);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		textures = new Icon[ItemStoneBricks.STONEBRICK_TYPES.length];
		for (int i = 0; i < textures.length; i++) {
			textures[i] = iconRegister.registerIcon("MysticMods" + ":" + ItemStoneBricks.STONEBRICK_TYPES[i]);
		}
	}
}
