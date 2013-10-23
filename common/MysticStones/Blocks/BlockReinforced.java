package mysticstones.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockReinforced extends BlockMulti {
	public BlockReinforced(int ID) {
		super(ID, Material.iron);
		setHardness(4F);
		setResistance(2000F);
		setUnlocalizedName("BlockMysticReinforcedBrick");
		setStepSound(Block.soundMetalFootstep);
	}

	@Override
	public boolean isBeaconBase(World worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		textures = new Icon[ItemReinforced.BRICK_TYPE.length];
		for (int i = 0; i < textures.length; i++) {
			textures[i] = iconRegister.registerIcon("MysticMods" + ":" + ItemReinforced.BRICK_TYPE[i] + " Bricks");
		}
	}
}
