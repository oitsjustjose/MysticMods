package mysticstones.worldgen;

import cpw.mods.fml.common.IWorldGenerator;
import mysticstones.MysticStones;
import mysticstones.util.Config;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class WorldGeneratorStones implements IWorldGenerator {
	public static final WorldGenMinable anorthosite = new WorldGenMinable(MysticStones.stones, 0, 24, Blocks.stone);
	public static final WorldGenMinable limestone = new WorldGenMinable(MysticStones.stones, 2, 48, Blocks.stone);
	public static final WorldGenMinable marble = new WorldGenMinable(MysticStones.stones, 4, 24, Blocks.stone);
	public static final WorldGenMinable migmatite = new WorldGenMinable(MysticStones.stones, 6, 48, Blocks.stone);
	public static final WorldGenMinable orthogneiss = new WorldGenMinable(MysticStones.stones, 8, 48, Blocks.stone);
	public static final WorldGenMinable slate = new WorldGenMinable(MysticStones.stones, 10, 24, Blocks.stone);
	public static final WorldGenMinable travertine = new WorldGenMinable(MysticStones.stones, 12, 24, Blocks.stone);

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if (Config.allowed.contains(world.provider.dimensionId)) {
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateSurface(World world, Random random, int blockX, int blockZ) {
		int Xcoord, Ycoord, Zcoord;
		for (int i = 0; i < Config.rare[0]; i++) {
			Xcoord = blockX + random.nextInt(16);
			Ycoord = random.nextInt(40) + 20;
			Zcoord = blockZ + random.nextInt(16);
			anorthosite.generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for (int i = 0; i < Config.rare[1]; i++) {
			Xcoord = blockX + random.nextInt(16);
			Ycoord = random.nextInt(40) + 20;
			Zcoord = blockZ + random.nextInt(16);
			limestone.generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for (int i = 0; i < Config.rare[2]; i++) {
			Xcoord = blockX + random.nextInt(16);
			Ycoord = random.nextInt(40) + 20;
			Zcoord = blockZ + random.nextInt(16);
			marble.generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for (int i = 0; i < Config.rare[3]; i++) {
			Xcoord = blockX + random.nextInt(16);
			Ycoord = random.nextInt(40) + 20;
			Zcoord = blockZ + random.nextInt(16);
			migmatite.generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for (int i = 0; i < Config.rare[4]; i++) {
			Xcoord = blockX + random.nextInt(16);
			Ycoord = random.nextInt(40) + 20;
			Zcoord = blockZ + random.nextInt(16);
			orthogneiss.generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for (int i = 0; i < Config.rare[5]; i++) {
			Xcoord = blockX + random.nextInt(16);
			Ycoord = random.nextInt(40) + 20;
			Zcoord = blockZ + random.nextInt(16);
			slate.generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for (int i = 0; i < Config.rare[6]; i++) {
			Xcoord = blockX + random.nextInt(16);
			Ycoord = random.nextInt(40) + 20;
			Zcoord = blockZ + random.nextInt(16);
			travertine.generate(world, random, Xcoord, Ycoord, Zcoord);
		}
	}
}