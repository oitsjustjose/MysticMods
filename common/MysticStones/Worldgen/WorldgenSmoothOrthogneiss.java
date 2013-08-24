package MysticStones.Worldgen;

import java.util.Random;

import MysticStones.MysticStones;
import MysticStones.Util.Config;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldgenSmoothOrthogneiss implements IWorldGenerator 
{
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.dimensionId)
		{
		case 0:generateSurface(world, random, chunkX*16, chunkZ*16);
		}
	}
	
	private void generateSurface(World world, Random random, int blockX, int blockZ)
	{
		for(int i=0; Config.Rare ? i<3 : i<2; i++)
		{
			int Xcoord = blockX + random.nextInt(16);
			int Ycoord = random.nextInt(40) + 20;
			int Zcoord = blockZ + random.nextInt(16);
			new WorldGenMinable(MysticStones.Stones.blockID, 8, 48, Block.stone.blockID).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
	}
}