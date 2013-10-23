package mysticruins;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenMystic implements IWorldGenerator {
	public static final WorldGenerator ruin = new StructureRuin();
	public static final WorldGenerator ruin1 = new StructureRuin$1();
	public static final WorldGenerator dungeon = new StructureMysticDungeon();

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if (Config.ruinAllowId.contains(world.provider.dimensionId)) {
			generateRuins(world, random, chunkX * 16, chunkZ * 16);
		}
		if (Config.dungeonAllowId.contains(world.provider.dimensionId)) {
			generateDungeon(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateDungeon(World world, Random random, int blockX, int blockZ) {
		for (int i = 0; i < Config.DunRarity; i++) {
			int Xcoord1 = blockX + random.nextInt(16) + 8;
			int Ycoord1 = random.nextInt(9) + 28;
			int Zcoord1 = blockZ + random.nextInt(16) + 8;
			dungeon.generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		}
	}

	private void generateRuins(World world, Random random, int blockX, int blockZ) {
		for (int i = 0; i < Config.RuinRarity; i++) {
			int Xcoord1 = blockX + random.nextInt(16) + 8;
			int Ycoord1 = random.nextInt(11) + 60;
			int Zcoord1 = blockZ + random.nextInt(16) + 8;
			ruin.generate(world, random, Xcoord1, Ycoord1, Zcoord1);
			ruin1.generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		}
	}
}