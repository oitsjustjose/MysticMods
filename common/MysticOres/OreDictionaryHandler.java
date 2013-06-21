package MysticOres;

import MysticOres.Blocks.BlockHandler;
import MysticOres.Items.ItemHandler;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler
{
	public static void init()
	{
		OreDictionary.registerOre("ingotAdamantine", new ItemStack(ItemHandler.AdamantineIngot));
		OreDictionary.registerOre("ingotMithril", new ItemStack(ItemHandler.MithrilIngot));
		OreDictionary.registerOre("ingotVerdite", new ItemStack(ItemHandler.VerditeIngot));
		OreDictionary.registerOre("ingotIridium", new ItemStack(ItemHandler.IridiumIngot));
		OreDictionary.registerOre("gemTourmaline", new ItemStack(ItemHandler.TourmalineGem));
		OreDictionary.registerOre("gemTopaz", new ItemStack(ItemHandler.TopazGem));
		OreDictionary.registerOre("gemAmethyst", new ItemStack(ItemHandler.AmethystGem));
		OreDictionary.registerOre("gemAgate", new ItemStack(ItemHandler.AgateGem));
		
		OreDictionary.registerOre("oreAdamantine", new ItemStack(BlockHandler.BlockOres, 1, 0));
		OreDictionary.registerOre("oreAmethyst", new ItemStack(BlockHandler.BlockOres, 1, 1));
		OreDictionary.registerOre("oreIridium", new ItemStack(BlockHandler.BlockOres, 1, 2));
		OreDictionary.registerOre("oreMithril", new ItemStack(BlockHandler.BlockOres, 1, 3));
		OreDictionary.registerOre("oreSapphire", new ItemStack(BlockHandler.BlockOres, 1, 4));
		OreDictionary.registerOre("oreTopaz", new ItemStack(BlockHandler.BlockOres, 1, 5));
		OreDictionary.registerOre("oreVerdite", new ItemStack(BlockHandler.BlockOres, 1, 6));
		OreDictionary.registerOre("oreBloodstone", new ItemStack(BlockHandler.BlockOres, 1, 7));
		OreDictionary.registerOre("oreBlackSoulstone", new ItemStack(BlockHandler.BlockOres, 1, 8));
		OreDictionary.registerOre("oreRedSoulstone", new ItemStack(BlockHandler.BlockOres, 1, 9));
		OreDictionary.registerOre("oreBlueSoulstone", new ItemStack(BlockHandler.BlockOres, 1, 10));
	}
}
