package mysticworld.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mysticworld.MysticWorld;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

import java.util.Random;

public class BlockPlatform extends Block {
	public BlockPlatform() {
		super(Material.rock);
		setBlockUnbreakable();
		setResistance(6000000.0F);
		setTickRandomly(true);
		setCreativeTab(MysticWorld.MysticWorldTab);
        setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.15F, 1.0F);
	}

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

    @Override
    public boolean renderAsNormalBlock(){
        return false;
    }

	@Override
    @SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
		double posX = x;
		double posY = y;
		double posZ = z;
		if (this.isTowersNearby(world, x, y, z)) {
			MysticWorld.proxy.fireFX(world, posX + rand.nextDouble(), posY + 0.20, posZ + rand.nextDouble(), 1.0F);
			if (rand.nextInt(3) == 0) {
				world.spawnParticle("enchantmenttable", x + 0.5D, y + 1.0D, z + 0.5D, x - 2 - x + rand.nextFloat() - 0.5D, y + 2 - y - rand.nextFloat() - 1.0F, z - 2 - z + rand.nextFloat() - 0.5D);
				world.spawnParticle("enchantmenttable", x + 0.5D, y + 1.0D, z + 0.5D, x - 2 - x + rand.nextFloat() - 0.5D, y + 2 - y - rand.nextFloat() - 1.0F, z + 2 - z + rand.nextFloat() - 0.5D);
				world.spawnParticle("enchantmenttable", x + 0.5D, y + 1.0D, z + 0.5D, x + 2 - x + rand.nextFloat() - 0.5D, y + 2 - y - rand.nextFloat() - 1.0F, z + 2 - z + rand.nextFloat() - 0.5D);
				world.spawnParticle("enchantmenttable", x + 0.5D, y + 1.0D, z + 0.5D, x + 2 - x + rand.nextFloat() - 0.5D, y + 2 - y - rand.nextFloat() - 1.0F, z - 2 - z + rand.nextFloat() - 0.5D);
			}
		}
	}

	@Override
	public int tickRate(World par1World) {
		return 30;
	}

	@Override
	public void updateTick(World world, int x, int y, int z, Random random) {
	}

	private boolean isTowersNearby(World world, int x, int y, int z) {
		Block pillar = BlockHandler.pillar;
		Block insert = BlockHandler.pillarInsert;
		if (world.getBlock(x - 2, y, z - 2) == pillar && world.getBlock(x - 2, y, z + 2) == pillar && world.getBlock(x + 2, y, z + 2) == pillar && world.getBlock(x + 2, y, z - 2) == pillar
				&& world.getBlock(x - 2, y + 1, z - 2) == insert && world.getBlock(x - 2, y + 1, z + 2) == insert && world.getBlock(x + 2, y + 1, z + 2) == insert
				&& world.getBlock(x + 2, y + 1, z - 2) == insert && world.getBlock(x - 2, y + 2, z - 2) == pillar && world.getBlock(x - 2, y + 2, z + 2) == pillar
				&& world.getBlock(x + 2, y + 2, z + 2) == pillar && world.getBlock(x + 2, y + 2, z - 2) == pillar) {
			return true;
		}
		return false;
	}
}
