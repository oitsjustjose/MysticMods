package mysticworld.worldgen;

import cpw.mods.fml.common.IWorldGenerator;
import mysticworld.lib.Booleans;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenerators implements IWorldGenerator {
	public static final WorldGenerator bushes = new BushesGen();
    public static final WorldGenerator stones = new StonesGen();

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if(world.provider.dimensionId==0) {
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateSurface(World world, Random random, int blockX, int blockZ) {
        int Ycoord1;
        if(Booleans.ENABLE_IMBUED_STONE_GEN){
            int Xcoord1 = blockX + random.nextInt(16);
            Ycoord1 = random.nextInt(15) + 56;
            int Zcoord1 = blockZ + random.nextInt(16);
            stones.generate(world, random, Xcoord1, Ycoord1, Zcoord1);
        }
        if (Booleans.ENABLE_BUSH_GEN){
            Ycoord1 = random.nextInt(11) + 60;
            bushes.generate(world, random, blockX + 8, Ycoord1, blockZ + 8);
        }
	}
}