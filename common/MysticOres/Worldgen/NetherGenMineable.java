package MysticOres.Worldgen;

import java.util.Random;


import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import cpw.mods.fml.common.IWorldGenerator;

public class NetherGenMineable implements IWorldGenerator
{

	private int minableBlockId;
	private int minableBlockMeta = 0;
	private int numberOfBlocks;

	public NetherGenMineable(int blockId, int numBlocks)
	{
		this.minableBlockId = blockId;
		this.numberOfBlocks = numBlocks;
	}

	public NetherGenMineable(int blockId, int meta, int numBlocks)
	{
		this(blockId, numBlocks);
		minableBlockMeta = meta;
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		if (world.provider.isHellWorld)
			generateNether(world, random, chunkX * 16, chunkZ * 16);
	}

	private void generateNether(World world, Random random, int i, int j)
	{
		for (int j1 = 0; j1 < 50; j1++)
		{
			int Xcoordinate = i + random.nextInt(16);
			int Zcoordinate = j + random.nextInt(16);
			int Ycoordinate = random.nextInt(256);
			new NetherGenHelper(minableBlockId, minableBlockMeta, numberOfBlocks).generate(world, random, Xcoordinate, Ycoordinate, Zcoordinate);
		}

	}

}