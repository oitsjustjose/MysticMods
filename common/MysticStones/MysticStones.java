package MysticStones;

import java.io.File;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "Mystic Stones", name = "Mystic Stones", version = "0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class MysticStones
{	
	public static Block Planks;
	public static Block Stones;
	public static Block StoneBricks;
	public static Block ReinforcedBricks;

	public static CreativeTabs MysticStonesTab = new TabMysticStones(CreativeTabs.getNextID(), "MysticStonesTab");
	
	private Configuration config;

	@EventHandler
    public void preInit(FMLPreInitializationEvent event)
	{
		Config.initialize(new File(event.getModConfigurationDirectory(), "Mystic Mods/Mystic Stones.cfg"));
        Config.save();

		Planks = new BlockPlanks(Config.PlanksID);
		Stones = new BlockStones(Config.StonesID);
		StoneBricks = new BlockStoneBricks(Config.StoneBricksID);
		ReinforcedBricks = new BlockReinforced(Config.ReinforcedBricksID);
		
		GameRegistry.registerBlock(Planks, ItemBlockPlanks.class, "Planks");
		GameRegistry.registerBlock(Stones, ItemBlockStones.class, "Stones");
		GameRegistry.registerBlock(StoneBricks, ItemBlockStoneBricks.class, "StoneBricks");
		GameRegistry.registerBlock(ReinforcedBricks, ItemBlockReinforced.class, "Reinforcedbricks");
		
		LanguageManager.init();
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
