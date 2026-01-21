package mysticores.util;

import cpw.mods.fml.common.registry.GameRegistry;
import mysticores.MysticOres;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ToolRecipes {
	public static void advancedAxe(Item output, Object input) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "## ", "#S ", " S ", 'S', MysticOres.INGOTS[13], '#', input));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "## ", "S# ", "S  ", 'S', MysticOres.INGOTS[13], '#', input));
	}

	public static void advancedHoe(Item output, Object input) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "## ", " S ", " S ", 'S', MysticOres.INGOTS[13], '#', input));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "## ", "S  ", "S  ", 'S', MysticOres.INGOTS[13], '#', input));
	}

	public static void advancedPickaxe(Item output, Object input) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "###", " S ", " S ", 'S', MysticOres.INGOTS[13], '#', input));
	}

	public static void advancedShovel(Item output, Object input) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "#", "S", "S", 'S', MysticOres.INGOTS[13], '#', input));
	}

	public static void advancedSword(Item output, Object input) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "#", "#", "S", 'S', MysticOres.INGOTS[13], '#', input));
	}

	public static void axe(Item output, Object input) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "## ", "#S ", " S ", 'S', "stickWood", '#', input));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "## ", "S# ", "S  ", 'S', "stickWood", '#', input));
	}

	public static void hoe(Item output, Object input) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "## ", " S ", " S ", 'S', "stickWood", '#', input));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "## ", "S  ", "S  ", 'S', "stickWood", '#', input));
	}

	public static void pickaxe(Item output, Object input) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "###", " S ", " S ", 'S', "stickWood", '#', input));
	}

	public static void shovel(Item output, Object input) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "#", "S", "S", 'S', "stickWood", '#', input));
	}

	public static void sword(Item output, Object input) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "#", "#", "S", 'S', "stickWood", '#', input));
	}
}
