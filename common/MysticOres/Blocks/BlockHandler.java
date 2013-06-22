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

	public static Block ReinforcedGlass;
	public static Block BlockOres;
	
	public static void init() {
		ReinforcedGlass = new BlockReinforcedGlass(ConfigurationManager.ReinforcedGlassID, true).setHardness(4.5F).setResistance(2000.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("Reinforced Glass");
		BlockOres = new BlockOres(ConfigurationManager.BlockOresID).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("MysticOreBlocks");
		
		registerBlocks();
		setBlockHarvestLevels();
	}
	
	private static void registerBlocks() {
		GameRegistry.registerBlock(ReinforcedGlass, "ReinforcedGlass");
		GameRegistry.registerBlock(BlockOres, ItemBlockOres.class, "OreBlocks!");
	}
	
	private static void setBlockHarvestLevels() {
		MinecraftForge.setBlockHarvestLevel(BlockOres, 0, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(BlockOres, 1, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockOres, 2, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(BlockOres, 3, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockOres, 4, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockOres, 5, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockOres, 6, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(BlockOres, 7, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockOres, 8, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockOres, 9, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockOres, 10, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BlockOres, 11, "pickaxe", 2);
	}
	
}
