package mysticworld.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mysticworld.MysticWorld;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import java.util.Random;

public class BlockLightCube extends Block {
	public BlockLightCube() {
		super(Material.circuits);
        setBlockBounds(0.25F, 0.25F, 0.25F, 0.75F, 0.75F, 0.75F);
        setLightLevel(1.0F);
		setTickRandomly(true);
	}

	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3) {
		return null;
	}

	@Override
    @SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int x, int y, int z, Random random) {
		MysticWorld.proxy.lightCubeFX(world, x + random.nextDouble(), y + 0.75D, z + random.nextDouble(), 0.0D, 0.0D, 0.0D, 1.0F);
		MysticWorld.proxy.lightCubeFX(world, x + random.nextDouble(), y + 0.75D, z + random.nextDouble(), 0.0D, 0.0D, 0.0D, 1.0F);
	}

    @Override
    public boolean renderAsNormalBlock(){
        return false;
    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }
}
