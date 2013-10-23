package mysticores.worldgen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;

public class NetherGenMineable implements IWorldGenerator {
	private WorldGenerator helper;

	public NetherGenMineable(int blockId, int numBlocks) {
		helper = new NetherGenHelper(blockId, numBlocks);
	}

	public NetherGenMineable(int blockId, int meta, int numBlocks) {
		helper = new NetherGenHelper(blockId, meta, numBlocks);
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.isHellWorld)
			generateNether(world, random, chunkX * 16, chunkZ * 16);
	}

	private void generateNether(World world, Random random, int i, int j) {
		for (int j1 = 0; j1 < 50; j1++) {
			int Xcoordinate = i + random.nextInt(16);
			int Zcoordinate = j + random.nextInt(16);
			int Ycoordinate = random.nextInt(256);
			helper.generate(world, random, Xcoordinate, Ycoordinate, Zcoordinate);
		}
	}
}