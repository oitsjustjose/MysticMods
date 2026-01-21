package mysticstones.util;

import cpw.mods.fml.common.registry.GameRegistry;
import mysticstones.MysticStones;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class RecipeHandler {
	public static final String[] MATERIALS = { "ingotMithril", "ingotVerdite", "ingotIridium", "ingotAdamantine", "gemTourmaline", "gemTopaz", "gemAmethyst", "gemAgate" };
	public static final String[] STONES = { "anorthositeSmooth", "Anorthosite", "limestoneSmooth", "limestone", "marbleSmooth", "marble", "migmatiteSmooth", "migmatite", "orthogneissSmooth",
			"orthogneiss", "slateSmooth", "slate", "travertineSmooth", "travertine" };

	public static void craftElse() {
		//smelting
		for (int i = 1; i < 14; i += 2) {
			FurnaceRecipes.smelting().func_151394_a(new ItemStack(MysticStones.stones, 1, i), new ItemStack(MysticStones.stones, 1, i - 1), 0.1F);
		}
	}

	public static void craftPlanks() {
		for (int i = 0; i < 7; i++) {
			ItemStack stack = new ItemStack(MysticStones.planks, 1, i);
			OreDictionary.registerOre("plankWood", stack);
			OreDictionary.registerOre(STONES[2 * i], new ItemStack(MysticStones.stones, 1, 2 * i));
			OreDictionary.registerOre(STONES[2 * i + 1], new ItemStack(MysticStones.stones, 1, 2 * i + 1));
			GameRegistry.addRecipe(new ShapelessOreRecipe(stack, "plankWood", STONES[2 * i]));
			GameRegistry.addRecipe(new ShapelessOreRecipe(stack, "plankWood", STONES[2 * i + 1]));
		}
	}

	public static void craftReinforced() {
        for (int i = 0; i < MATERIALS.length; i++) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MysticStones.reinforcedBricks, 1, i), true, "#$#", "$$$", "#$#", '$', MATERIALS[i], '#', "stone"));
        }
	}

	public static void craftStoneBricks() {
		for (int i = 0; i < 7; i++) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MysticStones.stoneBricks, 4, i), "##", "##", '#', STONES[2 * i]));
		}
	}
}
