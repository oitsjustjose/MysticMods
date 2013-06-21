package MysticOres.Worldgen;

import MysticOres.MysticOres;
import MysticOres.Blocks.BlockHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGenHandler
{
	public static void init()
	{
		GameRegistry.registerWorldGenerator(new WorldGenVerdite());
		GameRegistry.registerWorldGenerator(new WorldGenTopaz());
		GameRegistry.registerWorldGenerator(new WorldGenTourmaline());
		GameRegistry.registerWorldGenerator(new WorldGenMithril());
		GameRegistry.registerWorldGenerator(new WorldGenIridium());
		GameRegistry.registerWorldGenerator(new WorldGenAmethyst());
		GameRegistry.registerWorldGenerator(new WorldGenAdamantine());
		GameRegistry.registerWorldGenerator(new WorldGenAgate());
		GameRegistry.registerWorldGenerator(new WorldGenMysticNetherMinable(BlockHandler.BlockOres.blockID, 7, 1));
		GameRegistry.registerWorldGenerator(new WorldGenMysticNetherMinable(BlockHandler.BlockOres.blockID, 8, 3));
		GameRegistry.registerWorldGenerator(new WorldGenMysticNetherMinable(BlockHandler.BlockOres.blockID, 9, 2));
		GameRegistry.registerWorldGenerator(new WorldGenMysticNetherMinable(BlockHandler.BlockOres.blockID, 10, 3));
	}
}
