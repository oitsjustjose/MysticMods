package MysticOres.Util;

import MysticOres.Items.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class ToolRecipes
{
	public static void SwordRecipe(Item output, ItemStack input)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output, 1),
				"#", "#", "S", 'S', "stickWood", '#', input));
	}
	
	public static void PickaxeRecipe(Item output, ItemStack input)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output, 1),
				"###", " S ", " S ", 'S', "stickWood", '#', input));
	}
	
	public static void ShovelRecipe(Item output, ItemStack input)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output, 1),
				"#", "S", "S", 'S', "stickWood", '#', input));
	}
	
	public static void AxeRecipe(Item output, ItemStack input)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output, 1),
				"## ", "#S ", " S ", 'S', "stickWood", '#', input));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output, 1),
				"## ", "S# ", "S  ", 'S', "stickWood", '#', input));
	}
	
	public static void HoeRecipe(Item output, ItemStack input)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output, 1),
				"## ", " S ", " S ", 'S', "stickWood", '#', input));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(output, 1),
				"## ", "S  ", "S  ", 'S', "stickWood", '#', input));
	}
	
	
	public static void AdvancedSwordRecipe(Item output, ItemStack input)
	{
		GameRegistry.addRecipe(new ItemStack(output, 1), new Object[] {
				"#", "#", "S", 'S', new ItemStack(Items.Resource, 1, 13), '#', input
		});
	}
	
	public static void AdvancedPickaxeRecipe(Item output, ItemStack input)
	{
		GameRegistry.addRecipe(new ItemStack(output, 1), new Object[] {
				"###", " S ", " S ", 'S', new ItemStack(Items.Resource, 1, 13), '#', input
		});
	}
	
	public static void AdvancedShovelRecipe(Item output, ItemStack input)
	{
		GameRegistry.addRecipe(new ItemStack(output, 1), new Object[] {
				"#", "S", "S", 'S', new ItemStack(Items.Resource, 1, 13), '#', input
		});
	}
	
	public static void AdvancedAxeRecipe(Item output, ItemStack input)
	{
		GameRegistry.addRecipe(new ItemStack(output, 1), new Object[] {
				"## ", "#S ", " S ", 'S', new ItemStack(Items.Resource, 1, 13), '#', input
		});
		
		GameRegistry.addRecipe(new ItemStack(output, 1), new Object[] {
				"## ", "S# ", "S  ", 'S', new ItemStack(Items.Resource, 1, 13), '#', input
		});
	}
	
	public static void AdvancedHoeRecipe(Item output, ItemStack input)
	{
		GameRegistry.addRecipe(new ItemStack(output, 1), new Object[] {
				"## ", " S ", " S ", 'S', new ItemStack(Items.Resource, 1, 13), '#', input
		});
		
		GameRegistry.addRecipe(new ItemStack(output, 1), new Object[] {
				"## ", "S  ", "S  ", 'S', new ItemStack(Items.Resource, 1, 13), '#', input
		});
	}
}
