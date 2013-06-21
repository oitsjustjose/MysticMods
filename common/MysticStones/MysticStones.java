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

	
	@PreInit
    public void preInit(FMLPreInitializationEvent event)
	{
		Config.initialize(new File(event.getModConfigurationDirectory(), "Mystic Mods/Mystic Stones.cfg"));
        Config.save();
    }
	
	@Init
	public void load(FMLInitializationEvent event)
	{

		Planks = new BlockPlanks(Config.PlanksID).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("ColoredPlanks");
		Stones = new BlockStones(Config.StonesID).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("MysticStones");
		StoneBricks = new BlockStoneBricks(Config.StoneBricksID).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("MysticStoneBricks");
		ReinforcedBricks = new BlockReinforced(Config.ReinforcedBricksID).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("ReinforcedBricks");
		
		GameRegistry.registerBlock(Planks, ItemBlockPlanks.class, "Planks");
		GameRegistry.registerBlock(Stones, ItemBlockStones.class, "Stones");
		GameRegistry.registerBlock(StoneBricks, ItemBlockStoneBricks.class, "StoneBricks");
		GameRegistry.registerBlock(ReinforcedBricks, ItemBlockReinforced.class, "Reinforcedbricks");
		
		
		RecipeHandler.CraftPlanks();
		RecipeHandler.CraftStoneBricks();
		RecipeHandler.CraftElse();
		RecipeHandler.CraftReinforced();
		
		LanguageRegistry.instance().addName(new ItemStack(Stones, 1, 0), "Smooth Anorthosite");
		LanguageRegistry.instance().addName(new ItemStack(Stones, 1, 1), "Anorthosite");
		LanguageRegistry.instance().addName(new ItemStack(Stones, 1, 2), "Smooth Limestone");
		LanguageRegistry.instance().addName(new ItemStack(Stones, 1, 3), "Limestone");
		LanguageRegistry.instance().addName(new ItemStack(Stones, 1, 4), "Smooth Marble");
		LanguageRegistry.instance().addName(new ItemStack(Stones, 1, 5), "Marble");
		LanguageRegistry.instance().addName(new ItemStack(Stones, 1, 6), "Smooth Migmatite");
		LanguageRegistry.instance().addName(new ItemStack(Stones, 1, 7), "Migmatite");
		LanguageRegistry.instance().addName(new ItemStack(Stones, 1, 8), "Smooth Orthogneiss");
		LanguageRegistry.instance().addName(new ItemStack(Stones, 1, 9), "Orthogneiss");
		LanguageRegistry.instance().addName(new ItemStack(Stones, 1, 10), "Smooth Slate");
		LanguageRegistry.instance().addName(new ItemStack(Stones, 1, 11), "Slate");
		LanguageRegistry.instance().addName(new ItemStack(Stones, 1, 12), "Smooth Travertine");
		LanguageRegistry.instance().addName(new ItemStack(Stones, 1, 13), "Travertine");
		LanguageRegistry.instance().addName(new ItemStack(StoneBricks, 1, 0), "Anorthosite Bricks");
		LanguageRegistry.instance().addName(new ItemStack(StoneBricks, 1, 1), "Limestone Bricks");
		LanguageRegistry.instance().addName(new ItemStack(StoneBricks, 1, 2), "Marble Bricks");
		LanguageRegistry.instance().addName(new ItemStack(StoneBricks, 1, 3), "Migmatite Bricks");
		LanguageRegistry.instance().addName(new ItemStack(StoneBricks, 1, 4), "Orthogneiss Bricks");
		LanguageRegistry.instance().addName(new ItemStack(StoneBricks, 1, 5), "Slate Bricks");
		LanguageRegistry.instance().addName(new ItemStack(StoneBricks, 1, 6), "Travertine Bricks");
		LanguageRegistry.instance().addName(new ItemStack(Planks, 1, 0), "Purple Planks");
		LanguageRegistry.instance().addName(new ItemStack(Planks, 1, 1), "Green Planks");
		LanguageRegistry.instance().addName(new ItemStack(Planks, 1, 2), "Black Planks");
		LanguageRegistry.instance().addName(new ItemStack(Planks, 1, 3), "Orange Planks");
		LanguageRegistry.instance().addName(new ItemStack(Planks, 1, 4), "Red Planks");
		LanguageRegistry.instance().addName(new ItemStack(Planks, 1, 5), "Blue Planks");
		LanguageRegistry.instance().addName(new ItemStack(Planks, 1, 6), "Yellow Planks");
		LanguageRegistry.instance().addName(new ItemStack(ReinforcedBricks, 1, 0), "Reinforced Mithril Bricks");
		LanguageRegistry.instance().addName(new ItemStack(ReinforcedBricks, 1, 1), "Reinforced Verdite Bricks");
		LanguageRegistry.instance().addName(new ItemStack(ReinforcedBricks, 1, 2), "Reinforced Iridium Bricks");
		LanguageRegistry.instance().addName(new ItemStack(ReinforcedBricks, 1, 3), "Reinforced Adamantine Bricks");
		LanguageRegistry.instance().addName(new ItemStack(ReinforcedBricks, 1, 4), "Reinforced Tourmaline Bricks");
		LanguageRegistry.instance().addName(new ItemStack(ReinforcedBricks, 1, 5), "Reinforced Topaz Bricks");
		LanguageRegistry.instance().addName(new ItemStack(ReinforcedBricks, 1, 6), "Reinforced Amethyst Bricks");
		LanguageRegistry.instance().addName(new ItemStack(ReinforcedBricks, 1, 7), "Reinforced Agate Bricks");
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.MysticStonesTab", "en_US", "Mystic Stones!");
		
		GameRegistry.registerWorldGenerator(new WorldgenSmoothAnorthosite());
		GameRegistry.registerWorldGenerator(new WorldgenSmoothLimestone());
		GameRegistry.registerWorldGenerator(new WorldgenSmoothMarble());
		GameRegistry.registerWorldGenerator(new WorldgenSmoothMigmatite());
		GameRegistry.registerWorldGenerator(new WorldgenSmoothOrthogneiss());
		GameRegistry.registerWorldGenerator(new WorldgenSmoothSlate());
		GameRegistry.registerWorldGenerator(new WorldgenSmoothTravertine());
		
	}
	@PostInit
    public void postInit(FMLPostInitializationEvent event) 
	{
        
    }
}
