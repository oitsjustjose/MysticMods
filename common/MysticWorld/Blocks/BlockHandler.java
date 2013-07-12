package MysticWorld.Blocks;

import MysticWorld.Lib.BlockIds;
import MysticWorld.Lib.Booleans;
import MysticWorld.Lib.Strings;
import MysticWorld.WorldGen.StonesGen;
import MysticWorld.WorldGen.WorldGenBushes;
import MysticWorld.WorldGen.WorldGenStones;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.MinecraftForge;

public class BlockHandler {

	public static Block oreImbuedStone;
	public static Block bush;
	public static Block lightCube;
	
	public static Block pillarPlatform;
	public static Block pillarTower;
	
	public static void init() {
		oreImbuedStone = new BlockImbuedStone(BlockIds.ORE_STONE_1).setUnlocalizedName(Strings.IMBUED_STONE_NAME);
		bush = new BlockBush(BlockIds.BUSH).setUnlocalizedName(Strings.BUSH_NAME);
		lightCube = new BlockLightCube(BlockIds.LIGHT_CUBE).setUnlocalizedName(Strings.LIGHT_CUBE_NAME);
		
		pillarPlatform = new BlockPillarPlatform(614).setUnlocalizedName("pillarPlatform");
		pillarTower = new BlockPillarTower(615).setUnlocalizedName("pillarTower");
		
		registerBlocks();
		setBlockHarvestLevels();
	}
	
	private static void registerBlocks() {
		GameRegistry.registerBlock(oreImbuedStone, ItemBlockImbuedStone.class, Strings.IMBUED_STONE_NAME);
		GameRegistry.registerBlock(bush, ItemBlockBush.class, Strings.BUSH_NAME);
		GameRegistry.registerBlock(lightCube, Strings.LIGHT_CUBE_NAME);
		
		GameRegistry.registerBlock(pillarPlatform, "pillarPlatform");
		GameRegistry.registerBlock(pillarTower, "pillarTower");
	}

	private static void setBlockHarvestLevels() {
		MinecraftForge.setBlockHarvestLevel(oreImbuedStone, 0, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(oreImbuedStone, 1, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(oreImbuedStone, 2, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(oreImbuedStone, 3, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(oreImbuedStone, 4, "pickaxe", 2);
	}
}
