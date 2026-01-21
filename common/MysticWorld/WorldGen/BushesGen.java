package mysticworld.worldgen;

import mysticworld.blocks.BlockHandler;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class BushesGen extends WorldGenerator {
	@Override
	public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5) {
		int bushType = par2Random.nextInt(12);
		for (int l = 0; l < 20; ++l) {
			int i1 = par3 + par2Random.nextInt(8) - par2Random.nextInt(8);
			int j1 = par4 + par2Random.nextInt(4) - par2Random.nextInt(4);
			int k1 = par5 + par2Random.nextInt(8) - par2Random.nextInt(8);
			if (par1World.isAirBlock(i1, j1, k1) && par1World.getBlock(i1, j1 - 1, k1) == Blocks.grass && BlockHandler.bush.canPlaceBlockAt(par1World, i1, j1, k1)) {
				par1World.setBlock(i1, j1, k1, BlockHandler.bush, bushType, 2);
			}
		}
		return true;
	}
}
