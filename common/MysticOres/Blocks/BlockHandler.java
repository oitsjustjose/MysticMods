package mysticores.blocks;

import mysticores.lib.BlockID;
import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockHandler {
	public static Block BlockBase;

	public static void Initialize() {
		BlockBase = new BlockBase(BlockID.BASEID).setStepSound(Block.soundStoneFootstep);
		GameRegistry.registerBlock(BlockBase, ItemBase.class, "Base Blocks");
		setBlockHarvestLevels();
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
