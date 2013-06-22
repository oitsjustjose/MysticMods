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
		
		staffRecipe(ItemHandler$1.fireStaff, new ItemStack(ItemHandler$1.imbuedShard, 1, 0));
		staffRecipe(ItemHandler$1.waterStaff, new ItemStack(ItemHandler$1.imbuedShard, 1, 1));
		staffRecipe(ItemHandler$1.earthStaff, new ItemStack(ItemHandler$1.imbuedShard, 1, 2));
		staffRecipe(ItemHandler$1.airStaff, new ItemStack(ItemHandler$1.imbuedShard, 1, 3));
		staffRecipe(ItemHandler$1.energyStaff, new ItemStack(ItemHandler$1.imbuedShard, 1, 4));
		
		/*----------------------------------Verdite--------------------------------------*/
		GameRegistry.addRecipe(new ItemStack(ItemHandler$1.verditeHelmet), new Object[] {
			"###", "# #", '#', new ItemStack(ItemHandler.Resource, 1, 0)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler$1.verditeChestplate), new Object[] {
			"# #", "###", "###", '#', new ItemStack(ItemHandler.Resource, 1, 0)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler$1.verditeLeggings), new Object[] {
			"###", "# #", "# #", '#', new ItemStack(ItemHandler.Resource, 1, 0)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler$1.verditeBoots), new Object[] {
			"# #", "# #", '#', new ItemStack(ItemHandler.Resource, 1, 0)
		});
		
		/*----------------------------------Mithril--------------------------------------*/
		GameRegistry.addRecipe(new ItemStack(ItemHandler$1.mithrilHelmet), new Object[] {
			"###", "# #", '#', new ItemStack(ItemHandler.Resource, 1, 1)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler$1.mithrilChestplate), new Object[] {
			"# #", "###", "###", '#', new ItemStack(ItemHandler.Resource, 1, 1)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler$1.mithrilLeggings), new Object[] {
			"###", "# #", "# #", '#', new ItemStack(ItemHandler.Resource, 1, 1)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler$1.mithrilBoots), new Object[] {
			"# #", "# #", '#', new ItemStack(ItemHandler.Resource, 1, 1)
		});
		
		/*----------------------------------Adamantine--------------------------------------*/
		GameRegistry.addRecipe(new ItemStack(ItemHandler$1.adamantineHelmet), new Object[] {
			"###", "# #", '#', new ItemStack(ItemHandler.Resource, 1, 2)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler$1.adamantineChestplate), new Object[] {
			"# #", "###", "###", '#', new ItemStack(ItemHandler.Resource, 1, 2)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler$1.adamantineLeggings), new Object[] {
			"###", "# #", "# #", '#', new ItemStack(ItemHandler.Resource, 1, 2)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler$1.adamantineBoots), new Object[] {
			"# #", "# #", '#', new ItemStack(ItemHandler.Resource, 1, 2)
		});
		
		/*----------------------------------Iridium--------------------------------------*/
		GameRegistry.addRecipe(new ItemStack(ItemHandler$1.iridiumHelmet), new Object[] {
			"###", "# #", '#', new ItemStack(ItemHandler.Resource, 1, 3)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler$1.iridiumChestplate), new Object[] {
			"# #", "###", "###", '#', new ItemStack(ItemHandler.Resource, 1, 3)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler$1.iridiumLeggings), new Object[] {
			"###", "# #", "# #", '#', new ItemStack(ItemHandler.Resource, 1, 3)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler$1.iridiumBoots), new Object[] {
			"# #", "# #", '#', new ItemStack(ItemHandler.Resource, 1, 3)
		});
		
	}
	
	private static void itemSmelting(){
		
	}
	
	private static void staffRecipe(Item outputItem, ItemStack inputBlock){
		GameRegistry.addShapelessRecipe(new ItemStack(outputItem, 1), inputBlock, new ItemStack(ItemHandler$1.staffParts, 1, 0));
	}
}
