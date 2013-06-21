package MysticWorld.Blocks;

import MysticWorld.Lib.BlockIds;
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

	public static Block OreImbuedStone;
	public static Block bush;
	
	public static void init() {
		
		OreImbuedStone = new BlockImbuedStone(BlockIds.ORE_STONE_1).setUnlocalizedName(Strings.IMBUED_STONE_NAME);
		bush = new BlockBush(BlockIds.BUSH).setUnlocalizedName(Strings.BUSH_NAME);
		
		registerBlocks();
		setBlockHarvestLevels();
	}
	
	private static void registerBlocks() {
		GameRegistry.registerBlock(OreImbuedStone, ItemBlockImbuedStone.class, Strings.IMBUED_STONE_NAME);
		GameRegistry.registerBlock(bush, ItemBlockBush.class, Strings.BUSH_NAME);
		
		GameRegistry.registerWorldGenerator(new WorldGenBushes());
		GameRegistry.registerWorldGenerator(new WorldGenStones());

	}

	private static void setBlockHarvestLevels() {
		MinecraftForge.setBlockHarvestLevel(OreImbuedStone, 0, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(OreImbuedStone, 1, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(OreImbuedStone, 2, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(OreImbuedStone, 3, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(OreImbuedStone, 4, "pickaxe", 2);
	}
}
