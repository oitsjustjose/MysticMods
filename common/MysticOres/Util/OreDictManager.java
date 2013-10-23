package mysticores.util;

import mysticores.blocks.BlockHandler;
import mysticores.items.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictManager {
	public static final String[] INGOTS = { "ingotVerdite", "ingotMithril", "ingotAdamantine", "ingotIridium", "fuelIridium", "gemTourmaline", "gemAgate", "gemTopaz", "gemAmethyst", "dustMystic",
			" shardBloodstone", "shardGlass", "shardObsidian", "rodObsidian" };
	public static final String[] ORES = { "oreAdamantine", "oreAmethyst", "oreIridium", "oreMithril", "oreSapphire", "oreTopaz", "oreVerdite", "oreBloodstone", "oreBlackSoulstone",
			"oreBlueSoulstone", "oreRedSoulstone", "oreAgate" };

	public static void initialize() {
		for (int i = 0; i < INGOTS.length; i++) {
			OreDictionary.registerOre(INGOTS[i], new ItemStack(Items.Resource, 1, i));
		}
		for (int i = 0; i < ORES.length; i++) {
			OreDictionary.registerOre(ORES[i], new ItemStack(BlockHandler.BlockBase, 1, i));
		}
	}
}
