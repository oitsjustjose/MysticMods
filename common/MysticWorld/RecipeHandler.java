package MysticWorld;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import MysticOres.Items.ItemHandler;
import MysticWorld.Blocks.BlockHandler;
import MysticWorld.Items.ItemHandler$1;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHandler {

	public static void init(){
		itemRecipes();
		itemSmelting();
	}

	private static void itemRecipes(){

		//Staff Hilt Recipe
		GameRegistry.addRecipe(new ItemStack(ItemHandler$1.staffParts, 1, 1), new Object[] {
			" # ", "#$#", " # ", '#', Item.ingotGold, '$', Item.diamond
		});
		
		//Staff Handle Recipe
		GameRegistry.addRecipe(new ItemStack(ItemHandler$1.staffParts, 1, 2), new Object[] {
			"#", "$", "S", '#', Item.goldNugget, '$', Item.stick, 'S', Item.dyePowder
		});
		
		//Staff Topper Recipe
		GameRegistry.addRecipe(new ItemStack(ItemHandler$1.staffParts, 1, 3), new Object[] {
			" # ", "#$#", " # ", '#', Item.ingotGold, '$', Item.netherStar
		});
		
		//Staff Recipe
		GameRegistry.addRecipe(new ItemStack(ItemHandler$1.staffParts, 1, 0), new Object[] {
			"  #", " X ", "Y  ", '#', new ItemStack(ItemHandler$1.staffParts, 1, 3), 'X', new ItemStack(ItemHandler$1.staffParts, 1, 2), 'Y', new ItemStack(ItemHandler$1.staffParts, 1, 1)
		});
		
		//Orb Recipes
		orbRecipe(ItemHandler$1.fireOrb, new ItemStack(ItemHandler$1.imbuedShard, 1, 0));
		orbRecipe(ItemHandler$1.waterOrb, new ItemStack(ItemHandler$1.imbuedShard, 1, 1));
		orbRecipe(ItemHandler$1.earthOrb, new ItemStack(ItemHandler$1.imbuedShard, 1, 2));
		orbRecipe(ItemHandler$1.airOrb, new ItemStack(ItemHandler$1.imbuedShard, 1, 3));
		orbRecipe(ItemHandler$1.energyOrb, new ItemStack(ItemHandler$1.imbuedShard, 1, 4));
		
		//Staff Recipes
		staffRecipe(ItemHandler$1.fireStaff, new ItemStack(ItemHandler$1.fireOrb));
		staffRecipe(ItemHandler$1.waterStaff, new ItemStack(ItemHandler$1.waterOrb));
		staffRecipe(ItemHandler$1.earthStaff, new ItemStack(ItemHandler$1.earthOrb));
		staffRecipe(ItemHandler$1.airStaff, new ItemStack(ItemHandler$1.airOrb));
		staffRecipe(ItemHandler$1.energyStaff, new ItemStack(ItemHandler$1.energyOrb));
		
		//Verdite Armor
		helmetRecipe(ItemHandler$1.verditeHelmet, new ItemStack(ItemHandler.Resource, 1, 0));
		chestplateRecipe(ItemHandler$1.verditeChestplate, new ItemStack(ItemHandler.Resource, 1, 0));
		leggingsRecipe(ItemHandler$1.verditeLeggings, new ItemStack(ItemHandler.Resource, 1, 0));
		bootsRecipe(ItemHandler$1.verditeBoots, new ItemStack(ItemHandler.Resource, 1, 0));
		
		//Mithril Armor
		helmetRecipe(ItemHandler$1.mithrilHelmet, new ItemStack(ItemHandler.Resource, 1, 1));
		chestplateRecipe(ItemHandler$1.mithrilChestplate, new ItemStack(ItemHandler.Resource, 1, 1));
		leggingsRecipe(ItemHandler$1.mithrilLeggings, new ItemStack(ItemHandler.Resource, 1, 1));
		bootsRecipe(ItemHandler$1.mithrilBoots, new ItemStack(ItemHandler.Resource, 1, 1));
		
		//Adamantine Armor
		helmetRecipe(ItemHandler$1.adamantineHelmet, new ItemStack(ItemHandler.Resource, 1, 2));
		chestplateRecipe(ItemHandler$1.adamantineChestplate, new ItemStack(ItemHandler.Resource, 1, 2));
		leggingsRecipe(ItemHandler$1.adamantineLeggings, new ItemStack(ItemHandler.Resource, 1, 2));
		bootsRecipe(ItemHandler$1.adamantineBoots, new ItemStack(ItemHandler.Resource, 1, 2));
		
		//Iridium Armor
		helmetRecipe(ItemHandler$1.iridiumHelmet, new ItemStack(ItemHandler.Resource, 1, 3));
		chestplateRecipe(ItemHandler$1.iridiumChestplate, new ItemStack(ItemHandler.Resource, 1, 3));
		leggingsRecipe(ItemHandler$1.iridiumLeggings, new ItemStack(ItemHandler.Resource, 1, 3));
		bootsRecipe(ItemHandler$1.iridiumBoots, new ItemStack(ItemHandler.Resource, 1, 3));
	}
	
	private static void itemSmelting(){
		
	}
	
	private static void staffRecipe(Item output, ItemStack input){
		GameRegistry.addShapelessRecipe(new ItemStack(output, 1), input, new ItemStack(ItemHandler$1.staffParts, 1, 0));
	}
	
	private static void orbRecipe(Item output, ItemStack input){
		GameRegistry.addRecipe(new ItemStack(output, 1), new Object[] {
			"##", "##", '#', input
		});
	}
	
	private static void helmetRecipe(Item output, ItemStack input){
		GameRegistry.addRecipe(new ItemStack(output, 1), new Object[] {
			"###", "# #", '#', input
		});
	}
	
	private static void chestplateRecipe(Item output, ItemStack input){
		GameRegistry.addRecipe(new ItemStack(output, 1), new Object[] {
			"# #", "###", "###", '#', input
		});
	}
	
	private static void leggingsRecipe(Item output, ItemStack input){
		GameRegistry.addRecipe(new ItemStack(output, 1), new Object[] {
			"###", "# #", "# #", '#', input
		});
	}
	
	private static void bootsRecipe(Item output, ItemStack input){
		GameRegistry.addRecipe(new ItemStack(output, 1), new Object[] {
			"# #", "# #", '#', input
		});
	}
	
}
