package MysticOres.Worldgen;

import MysticOres.Blocks.BlockHandler;
import MysticOres.Lib.Rarity;
import cpw.mods.fml.common.registry.GameRegistry;

public class GeneratorManager
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
		GameRegistry.registerWorldGenerator(new NetherGenMineable(BlockHandler.BlockBase.blockID, 7, Rarity.BLOODSTONE + 1));
		GameRegistry.registerWorldGenerator(new NetherGenMineable(BlockHandler.BlockBase.blockID, 8, Rarity.BLACKSOULSTONE + 1));
		GameRegistry.registerWorldGenerator(new NetherGenMineable(BlockHandler.BlockBase.blockID, 9, Rarity.BLUESOULSTONE + 1));
		GameRegistry.registerWorldGenerator(new NetherGenMineable(BlockHandler.BlockBase.blockID, 10, Rarity.REDSOULSTONE));
	}
}
