package mysticworld.worldgen;

import mysticworld.blocks.BlockHandler;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class StonesGen extends WorldGenerator {
	@Override
	public boolean generate(World par1World, Random par2Random, int i1, int j1, int k1) {
        if (par1World.isAirBlock(i1, j1, k1) && par1World.getBlock(i1, j1 - 1, k1) == Blocks.grass && BlockHandler.oreImbuedStone.canPlaceBlockAt(par1World, i1, j1, k1)) {
            par1World.setBlock(i1, j1, k1, BlockHandler.oreImbuedStone, par2Random.nextInt(5), 2);
        }
		return true;
	}
}
