package MysticOres.Worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import MysticOres.Blocks.BlockHandler;
import MysticOres.Lib.Rarity;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenIridium implements IWorldGenerator {
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.dimensionId)
		{	
			case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
		}
	}

	private void generateSurface(World world, Random random, int blockX, int blockZ) 
	{
		for (int i = 0; i < Rarity.IRIDIUM; i++)
		{
			int Xcoord = blockX + random.nextInt(16);
			int Ycoord = random.nextInt(12);
			int Zcoord = blockZ + random.nextInt(16);
  
			(new WorldGenMinable(BlockHandler.BlockBase.blockID, 2, 6, Block.stone.blockID)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
	}
}