package mysticstones.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockStones extends BlockMulti {
	public BlockStones(int ID) {
		super(ID, Material.rock);
		setHardness(1F);
		setResistance(5F);
		setUnlocalizedName("BlockMysticStones");
		setStepSound(Block.soundStoneFootstep);
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
	public void registerIcons(IconRegister iconRegister) {
		textures = new Icon[ItemStones.STONE_TYPES.length];
		for (int i = 0; i < textures.length; i++) {
			textures[i] = iconRegister.registerIcon("MysticMods" + ":" + ItemStones.STONE_TYPES[i]);
		}
	}

	@Override
	protected boolean canSilkHarvest() {
		return true;
	}
}
