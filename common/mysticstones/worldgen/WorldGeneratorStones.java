package mysticstones.worldgen;

import java.util.Random;

import mysticstones.MysticStones;
import mysticstones.util.Config;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorStones implements IWorldGenerator {
	public static final WorldGenMinable anorthosite = new WorldGenMinable(MysticStones.Stones.blockID, 0, 24, Block.stone.blockID);
	public static final WorldGenMinable limestone = new WorldGenMinable(MysticStones.Stones.blockID, 2, 48, Block.stone.blockID);
	public static final WorldGenMinable marble = new WorldGenMinable(MysticStones.Stones.blockID, 4, 24, Block.stone.blockID);
	public static final WorldGenMinable migmatite = new WorldGenMinable(MysticStones.Stones.blockID, 6, 48, Block.stone.blockID);
	public static final WorldGenMinable orthogneiss = new WorldGenMinable(MysticStones.Stones.blockID, 8, 48, Block.stone.blockID);
	public static final WorldGenMinable slate = new WorldGenMinable(MysticStones.Stones.blockID, 10, 24, Block.stone.blockID);
	public static final WorldGenMinable travertine = new WorldGenMinable(MysticStones.Stones.blockID, 12, 24, Block.stone.blockID);

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if (Config.allowed.contains(world.provider.dimensionId)) {
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateSurface(World world, Random random, int blockX, int blockZ) {
		int Xcoord, Ycoord, Zcoord;
		for (int i = 0; i < Config.Rare; i++) {
			Xcoord = blockX + random.nextInt(16);
			Ycoord = random.nextInt(40) + 20;
			Zcoord = blockZ + random.nextInt(16);
			anorthosite.generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for (int i = 0; i < Config.Rare; i++) {
			Xcoord = blockX + random.nextInt(16);
			Ycoord = random.nextInt(40) + 20;
			Zcoord = blockZ + random.nextInt(16);
			limestone.generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for (int i = 0; i < Config.Rare; i++) {
			Xcoord = blockX + random.nextInt(16);
			Ycoord = random.nextInt(40) + 20;
			Zcoord = blockZ + random.nextInt(16);
			marble.generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for (int i = 0; i < Config.Rare; i++) {
			Xcoord = blockX + random.nextInt(16);
			Ycoord = random.nextInt(40) + 20;
			Zcoord = blockZ + random.nextInt(16);
			migmatite.generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for (int i = 0; i < Config.Rare; i++) {
			Xcoord = blockX + random.nextInt(16);
			Ycoord = random.nextInt(40) + 20;
			Zcoord = blockZ + random.nextInt(16);
			orthogneiss.generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for (int i = 0; i < Config.Rare; i++) {
			Xcoord = blockX + random.nextInt(16);
			Ycoord = random.nextInt(40) + 20;
			Zcoord = blockZ + random.nextInt(16);
			slate.generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for (int i = 0; i < Config.Rare; i++) {
			Xcoord = blockX + random.nextInt(16);
			Ycoord = random.nextInt(40) + 20;
			Zcoord = blockZ + random.nextInt(16);
			travertine.generate(world, random, Xcoord, Ycoord, Zcoord);
		}
	}
}