package mysticores.util;

import mysticores.blocks.BlockHandler;
import mysticores.items.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictManager {
	public static void Initialize() {
		OreDictionary.registerOre("ingotAdamantine", new ItemStack(Items.Resource, 1, 2));
		OreDictionary.registerOre("ingotMithril", new ItemStack(Items.Resource, 1, 1));
		OreDictionary.registerOre("ingotVerdite", new ItemStack(Items.Resource, 1, 0));
		OreDictionary.registerOre("ingotIridium", new ItemStack(Items.Resource, 1, 3));
		OreDictionary.registerOre("fuelIridium", new ItemStack(Items.Resource, 1, 4));
		OreDictionary.registerOre("gemTourmaline", new ItemStack(Items.Resource, 1, 5));
		OreDictionary.registerOre("gemTopaz", new ItemStack(Items.Resource, 1, 7));
		OreDictionary.registerOre("gemAmethyst", new ItemStack(Items.Resource, 1, 8));
		OreDictionary.registerOre("gemAgate", new ItemStack(Items.Resource, 1, 6));
		OreDictionary.registerOre("oreAdamantine", new ItemStack(BlockHandler.BlockBase, 1, 0));
		OreDictionary.registerOre("oreAmethyst", new ItemStack(BlockHandler.BlockBase, 1, 1));
		OreDictionary.registerOre("oreIridium", new ItemStack(BlockHandler.BlockBase, 1, 2));
		OreDictionary.registerOre("oreMithril", new ItemStack(BlockHandler.BlockBase, 1, 3));
		OreDictionary.registerOre("oreSapphire", new ItemStack(BlockHandler.BlockBase, 1, 4));
		OreDictionary.registerOre("oreTopaz", new ItemStack(BlockHandler.BlockBase, 1, 5));
		OreDictionary.registerOre("oreVerdite", new ItemStack(BlockHandler.BlockBase, 1, 6));
		OreDictionary.registerOre("oreBloodstone", new ItemStack(BlockHandler.BlockBase, 1, 7));
		OreDictionary.registerOre("oreBlackSoulstone", new ItemStack(BlockHandler.BlockBase, 1, 8));
		OreDictionary.registerOre("oreBlueSoulstone", new ItemStack(BlockHandler.BlockBase, 1, 9));
		OreDictionary.registerOre("oreRedSoulstone", new ItemStack(BlockHandler.BlockBase, 1, 10));
	}
}
