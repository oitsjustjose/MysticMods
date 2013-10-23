package mysticworld.blocks;

import java.util.Random;

import mysticworld.MysticWorld;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class BlockPillarPlatform extends Block {
	public BlockPillarPlatform(int id) {
		super(id, Material.rock);
		this.setBlockUnbreakable();
		this.setResistance(6000000.0F);
		this.setTickRandomly(true);
		setCreativeTab(MysticWorld.MysticWorldTab);
		setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.15F, 1.0F);
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public void onEntityWalking(World world, int x, int y, int z, Entity entity) {
		if (this.isTowersNearby(world, x, y, z)) {
			super.onEntityWalking(world, x, y, z, entity);
		}
	}

	@Override
	public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
		double posX = x;
		double posY = y;
		double posZ = z;
		if (this.isTowersNearby(world, x, y, z)) {
			MysticWorld.proxy.fireFX(world, posX + rand.nextDouble(), posY + 0.20, posZ + rand.nextDouble(), 1.0F);
		}
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public int tickRate(World par1World) {
		return 30;
	}

	@Override
	public void updateTick(World world, int x, int y, int z, Random random) {
		if (this.isTowersNearby(world, x, y, z)) {
		}
	}

	private boolean isTowersNearby(World world, int x, int y, int z) {
		int block = BlockHandler.pillar.blockID;
		if (world.getBlockId(x - 2, y, z - 2) == block && world.getBlockId(x - 2, y, z + 2) == block && world.getBlockId(x + 2, y, z + 2) == block && world.getBlockId(x + 2, y, z - 2) == block
				&& world.getBlockId(x - 2, y + 1, z - 2) == block && world.getBlockId(x - 2, y + 1, z + 2) == block && world.getBlockId(x + 2, y + 1, z + 2) == block
				&& world.getBlockId(x + 2, y + 1, z - 2) == block && world.getBlockId(x - 2, y + 2, z - 2) == block && world.getBlockId(x - 2, y + 2, z + 2) == block
				&& world.getBlockId(x + 2, y + 2, z + 2) == block && world.getBlockId(x + 2, y + 2, z - 2) == block) {
			return true;
		}
		return false;
	}
}
