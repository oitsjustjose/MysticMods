package mysticstones;

import mysticstones.blocks.BlockPlanks;
import mysticstones.blocks.BlockReinforced;
import mysticstones.blocks.BlockStoneBricks;
import mysticstones.blocks.BlockStones;
import mysticstones.blocks.ItemPlanks;
import mysticstones.blocks.ItemReinforced;
import mysticstones.blocks.ItemStoneBricks;
import mysticstones.blocks.ItemStones;
import mysticstones.util.Config;
import mysticstones.util.Localizations;
import mysticstones.util.RecipeHandler;
import mysticstones.util.TabMysticStones;
import mysticstones.worldgen.WorldGeneratorStones;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "Mystic Stones", name = "Mystic Stones", version = "0.1")
@NetworkMod(clientSideRequired = true)
public class MysticStones {
	@Instance("Mystic Stones")
	public static MysticStones instance;
	public static Block Planks, Stones, StoneBricks, ReinforcedBricks;
	public static final CreativeTabs MysticStonesTab = new TabMysticStones("MysticStonesTab");

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Config.initialize(event.getSuggestedConfigurationFile());
		Planks = new BlockPlanks(Config.PlanksID);
		Stones = new BlockStones(Config.StonesID);
		StoneBricks = new BlockStoneBricks(Config.StoneBricksID);
		ReinforcedBricks = new BlockReinforced(Config.ReinforcedBricksID);
		GameRegistry.registerBlock(Planks, ItemPlanks.class, "Planks");
		GameRegistry.registerBlock(Stones, ItemStones.class, "Stones");
		GameRegistry.registerBlock(StoneBricks, ItemStoneBricks.class, "StoneBricks");
		GameRegistry.registerBlock(ReinforcedBricks, ItemReinforced.class, "Reinforcedbricks");
		Localizations.Initialize();
		RecipeHandler.CraftPlanks();
		RecipeHandler.CraftStoneBricks();
		RecipeHandler.CraftReinforced();
		RecipeHandler.CraftElse();
		GameRegistry.registerWorldGenerator(new WorldGeneratorStones());
	}
}
