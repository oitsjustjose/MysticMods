package mysticstones.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockPlanks extends BlockMulti {
	public BlockPlanks(int ID) {
		super(ID, Material.wood);
		setHardness(2.5F);
		setResistance(10F);
		setUnlocalizedName("BlockMysticPlanks");
		setStepSound(Block.soundWoodFootstep);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		textures = new Icon[ItemPlanks.PLANK_TYPE.length];
		for (int i = 0; i < textures.length; i++) {
			textures[i] = iconRegister.registerIcon("MysticMods" + ":" + ItemPlanks.PLANK_TYPE[i]);
		}
	}
}
