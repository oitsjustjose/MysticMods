package mysticstones.util;

import mysticstones.MysticStones;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHandler {
	public static final String[] MATERIALS = { "ingotMithril", "ingotVerdite", "ingotIridium", "ingotAdamantine", "gemTourmaline", "gemTopaz", "gemAmethyst", "gemAgate" };
	public static final String[] STONES = { "anorthositeSmooth", "Anorthosite", "limestoneSmooth", "limestone", "marbleSmooth", "marble", "migmatiteSmooth", "migmatite", "orthogneissSmooth",
			"orthogneiss", "slateSmooth", "slate", "travertineSmooth", "travertine" };

	public static void CraftElse() {
		//smelting
		for (int i = 1; i < 14; i += 2) {
			FurnaceRecipes.smelting().addSmelting(MysticStones.Stones.blockID, i, new ItemStack(MysticStones.Stones, 1, i - 1), 0.1F);
		}
	}

	public static void CraftPlanks() {
		for (int i = 0; i < 7; i++) {
			ItemStack stack = new ItemStack(MysticStones.Planks, 1, i);
			OreDictionary.registerOre("plankWood", stack);
			OreDictionary.registerOre(STONES[2 * i], new ItemStack(MysticStones.Stones, 1, 2 * i));
			OreDictionary.registerOre(STONES[2 * i + 1], new ItemStack(MysticStones.Stones, 1, 2 * i + 1));
			GameRegistry.addRecipe(new ShapelessOreRecipe(stack, "plankWood", STONES[2 * i]));
			GameRegistry.addRecipe(new ShapelessOreRecipe(stack, "plankWood", STONES[2 * i + 1]));
		}
	}

	public static void CraftReinforced() {
		if (Loader.isModLoaded("MysticOres")) {
			for (int i = 0; i < MATERIALS.length; i++) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MysticStones.ReinforcedBricks, 1, i), true, "#$#", "$$$", "#$#", '$', MATERIALS[i], '#', "stone"));
			}
		}
	}

	public static void CraftStoneBricks() {
		for (int i = 0; i < 7; i++) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MysticStones.StoneBricks, 4, i), "##", "##", '#', STONES[2 * i]));
		}
	}
}
