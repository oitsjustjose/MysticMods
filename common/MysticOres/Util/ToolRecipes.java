package mysticores.util;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class ToolRecipes {
	public static void AdvancedAxeRecipe(Item output, Object input) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "## ", "#S ", " S ", 'S', OreDictManager.INGOTS[13], '#', input));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "## ", "S# ", "S  ", 'S', OreDictManager.INGOTS[13], '#', input));
	}

	public static void AdvancedHoeRecipe(Item output, Object input) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "## ", " S ", " S ", 'S', OreDictManager.INGOTS[13], '#', input));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "## ", "S  ", "S  ", 'S', OreDictManager.INGOTS[13], '#', input));
	}

	public static void AdvancedPickaxeRecipe(Item output, Object input) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "###", " S ", " S ", 'S', OreDictManager.INGOTS[13], '#', input));
	}

	public static void AdvancedShovelRecipe(Item output, Object input) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "#", "S", "S", 'S', OreDictManager.INGOTS[13], '#', input));
	}

	public static void AdvancedSwordRecipe(Item output, Object input) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "#", "#", "S", 'S', OreDictManager.INGOTS[13], '#', input));
	}

	public static void AxeRecipe(Item output, Object input) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "## ", "#S ", " S ", 'S', "stickWood", '#', input));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "## ", "S# ", "S  ", 'S', "stickWood", '#', input));
	}

	public static void HoeRecipe(Item output, Object input) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "## ", " S ", " S ", 'S', "stickWood", '#', input));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "## ", "S  ", "S  ", 'S', "stickWood", '#', input));
	}

	public static void PickaxeRecipe(Item output, Object input) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "###", " S ", " S ", 'S', "stickWood", '#', input));
	}

	public static void ShovelRecipe(Item output, Object input) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "#", "S", "S", 'S', "stickWood", '#', input));
	}

	public static void SwordRecipe(Item output, Object input) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output), "#", "#", "S", 'S', "stickWood", '#', input));
	}
}
