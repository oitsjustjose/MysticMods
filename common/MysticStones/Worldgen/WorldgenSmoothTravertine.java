package mysticstones.worldgen;

import java.util.Random;

import mysticstones.MysticStones;
import mysticstones.util.Config;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldgenSmoothTravertine implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateSurface(World world, Random random, int blockX, int blockZ) {
		for (int i = 0; Config.Rare ? i < 2 : i < 3; i++) {
			int Xcoord = blockX + random.nextInt(16);
			int Ycoord = random.nextInt(40) + 20;
			int Zcoord = blockZ + random.nextInt(16);
			new WorldGenMinable(MysticStones.Stones.blockID, 12, 24, Block.stone.blockID).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
	}
}