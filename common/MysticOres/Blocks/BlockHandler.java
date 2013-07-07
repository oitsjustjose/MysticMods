package MysticOres.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import MysticOres.ConfigurationManager;
import MysticOres.MysticOres;
import MysticOres.Items.ItemHandler;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.MinecraftForge;

public class BlockHandler {

	public static Block BlockBase;
	
	public static void init() {
		BlockBase = new BlockBase(ConfigurationManager.BlockBaseID).setStepSound(Block.soundStoneFootstep);
		
		registerBlocks();
		setBlockHarvestLevels();
	}
	
	private static void registerBlocks() {
		GameRegistry.registerBlock(BlockBase, ItemBlockBase.class, "Base Blocks");
	}
	
	private static void setBlockHarvestLevels() {
		MinecraftForge.setBlockHarvestLevel(BlockBase, 0, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(BlockBase, 1, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockBase, 2, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(BlockBase, 3, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockBase, 4, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockBase, 5, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockBase, 6, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(BlockBase, 7, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockBase, 8, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockBase, 9, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockBase, 10, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockBase, 11, "pickaxe", 2);
	}
	
}
