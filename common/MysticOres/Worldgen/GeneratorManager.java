package mysticores.worldgen;

import mysticores.blocks.BlockHandler;
import mysticores.lib.Rarity;
import cpw.mods.fml.common.registry.GameRegistry;

public class GeneratorManager {
	public static void initialize() {
		GameRegistry.registerWorldGenerator(new WorldGenOres());
		GameRegistry.registerWorldGenerator(new NetherGenMineable(BlockHandler.BlockBase.blockID, 7, Rarity.BLOODSTONE + 1));
		GameRegistry.registerWorldGenerator(new NetherGenMineable(BlockHandler.BlockBase.blockID, 8, Rarity.BLACKSOULSTONE + 1));
		GameRegistry.registerWorldGenerator(new NetherGenMineable(BlockHandler.BlockBase.blockID, 9, Rarity.BLUESOULSTONE + 1));
		GameRegistry.registerWorldGenerator(new NetherGenMineable(BlockHandler.BlockBase.blockID, 10, Rarity.REDSOULSTONE));
	}
}
