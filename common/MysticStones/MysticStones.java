package mysticstones;

import java.io.File;

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
import mysticstones.worldgen.WorldgenSmoothAnorthosite;
import mysticstones.worldgen.WorldgenSmoothLimestone;
import mysticstones.worldgen.WorldgenSmoothMarble;
import mysticstones.worldgen.WorldgenSmoothMigmatite;
import mysticstones.worldgen.WorldgenSmoothOrthogneiss;
import mysticstones.worldgen.WorldgenSmoothSlate;
import mysticstones.worldgen.WorldgenSmoothTravertine;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "Mystic Stones", name = "Mystic Stones", version = "0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MysticStones {
	@Instance("Mystic Stones")
	public static MysticStones instance;
	public static Block Planks;
	public static Block Stones;
	public static Block StoneBricks;
	public static Block ReinforcedBricks;
	public static CreativeTabs MysticStonesTab = new TabMysticStones(CreativeTabs.getNextID(), "MysticStonesTab");
	private Configuration config;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Config.initialize(new File(event.getModConfigurationDirectory(), "Mystic Mods/Mystic Stones.cfg"));
		Config.save();
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
		RecipeHandler.CraftElse();
		RecipeHandler.CraftReinforced();
		GameRegistry.registerWorldGenerator(new WorldgenSmoothAnorthosite());
		GameRegistry.registerWorldGenerator(new WorldgenSmoothLimestone());
		GameRegistry.registerWorldGenerator(new WorldgenSmoothMarble());
		GameRegistry.registerWorldGenerator(new WorldgenSmoothMigmatite());
		GameRegistry.registerWorldGenerator(new WorldgenSmoothOrthogneiss());
		GameRegistry.registerWorldGenerator(new WorldgenSmoothSlate());
		GameRegistry.registerWorldGenerator(new WorldgenSmoothTravertine());
	}
}
