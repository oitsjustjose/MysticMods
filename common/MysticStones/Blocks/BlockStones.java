package mysticstones.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mysticstones.MysticStones;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class BlockStones extends BlockMulti {
	public BlockStones() {
		super(Material.rock);
        setHardness(1F);
        setResistance(5F);
        setBlockName("BlockMysticStones");
		setStepSound(Block.soundTypeStone);
	}

	@Override
	public int damageDropped(int j) {
		switch (j) {
		case 0:
			return 1;
		case 2:
			return 3;
		case 4:
			return 5;
		case 6:
			return 7;
		case 8:
			return 9;
		case 10:
			return 11;
		case 12:
			return 13;
		default:
			return j;
		}
	}

	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
		return new ItemStack(this, 1, world.getBlockMetadata(x, y, z));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		textures = new IIcon[MysticStones.STONE_TYPES.size()];
		for (int i = 0; i < textures.length; i++) {
			textures[i] = iconRegister.registerIcon("mysticstones:" + MysticStones.STONE_TYPES.get(i));
		}
	}
}
