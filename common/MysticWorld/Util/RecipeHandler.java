package mysticworld.util;

import cpw.mods.fml.common.registry.GameRegistry;
import mysticores.items.Items;
import mysticworld.items.ItemHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipeHandler {
	public static void init() {
		itemRecipes();
		itemSmelting();
	}

	private static void bootsRecipe(Item output, ItemStack input) {
		GameRegistry.addRecipe(new ItemStack(output), "# #", "# #", '#', input);
	}

	private static void chestplateRecipe(Item output, ItemStack input) {
		GameRegistry.addRecipe(new ItemStack(output), "# #", "###", "###", '#', input);
	}

	private static void helmetRecipe(Item output, ItemStack input) {
		GameRegistry.addRecipe(new ItemStack(output), "###", "# #", '#', input);
	}

	private static void itemRecipes() {
		//Staff Hilt Recipe
		GameRegistry.addRecipe(new ItemStack(ItemHandler.staffParts, 1, 1), " # ", "#$#", " # ", '#', net.minecraft.init.Items.gold_ingot, '$', net.minecraft.init.Items.diamond);
		//Staff Handle Recipe
		GameRegistry.addRecipe(new ItemStack(ItemHandler.staffParts, 1, 2), "#", "$", "S", '#', net.minecraft.init.Items.gold_nugget, '$', net.minecraft.init.Items.stick, 'S', net.minecraft.init.Items.dye);
		//Staff Topper Recipe
		GameRegistry.addRecipe(new ItemStack(ItemHandler.staffParts, 1, 3), " # ", "#$#", " # ", '#', net.minecraft.init.Items.gold_ingot, '$', net.minecraft.init.Items.nether_star);
		//Staff Recipe
		GameRegistry.addRecipe(new ItemStack(ItemHandler.staffParts, 1, 0), "  #", " X ", "Y  ", '#', new ItemStack(ItemHandler.staffParts, 1, 3), 'X',
				new ItemStack(ItemHandler.staffParts, 1, 2), 'Y', new ItemStack(ItemHandler.staffParts, 1, 1));
		//Orb Recipes
		orbRecipe(ItemHandler.fireOrb, new ItemStack(ItemHandler.imbuedShard, 1, 0));
		orbRecipe(ItemHandler.waterOrb, new ItemStack(ItemHandler.imbuedShard, 1, 1));
		orbRecipe(ItemHandler.earthOrb, new ItemStack(ItemHandler.imbuedShard, 1, 2));
		orbRecipe(ItemHandler.airOrb, new ItemStack(ItemHandler.imbuedShard, 1, 3));
		orbRecipe(ItemHandler.energyOrb, new ItemStack(ItemHandler.imbuedShard, 1, 4));
		//Staff Recipes
		staffRecipe(ItemHandler.fireStaff, new ItemStack(ItemHandler.fireOrb));
		staffRecipe(ItemHandler.waterStaff, new ItemStack(ItemHandler.waterOrb));
		staffRecipe(ItemHandler.earthStaff, new ItemStack(ItemHandler.earthOrb));
		staffRecipe(ItemHandler.airStaff, new ItemStack(ItemHandler.airOrb));
		staffRecipe(ItemHandler.energyStaff, new ItemStack(ItemHandler.energyOrb));
		//Verdite Armor
		helmetRecipe(ItemHandler.verditeHelmet, new ItemStack(Items.Resource, 1, 0));
		chestplateRecipe(ItemHandler.verditeChestplate, new ItemStack(Items.Resource, 1, 0));
		leggingsRecipe(ItemHandler.verditeLeggings, new ItemStack(Items.Resource, 1, 0));
		bootsRecipe(ItemHandler.verditeBoots, new ItemStack(Items.Resource, 1, 0));
		//Mithril Armor
		helmetRecipe(ItemHandler.mithrilHelmet, new ItemStack(Items.Resource, 1, 1));
		chestplateRecipe(ItemHandler.mithrilChestplate, new ItemStack(Items.Resource, 1, 1));
		leggingsRecipe(ItemHandler.mithrilLeggings, new ItemStack(Items.Resource, 1, 1));
		bootsRecipe(ItemHandler.mithrilBoots, new ItemStack(Items.Resource, 1, 1));
		//Adamantine Armor
		helmetRecipe(ItemHandler.adamantineHelmet, new ItemStack(Items.Resource, 1, 2));
		chestplateRecipe(ItemHandler.adamantineChestplate, new ItemStack(Items.Resource, 1, 2));
		leggingsRecipe(ItemHandler.adamantineLeggings, new ItemStack(Items.Resource, 1, 2));
		bootsRecipe(ItemHandler.adamantineBoots, new ItemStack(Items.Resource, 1, 2));
		//Iridium Armor
		helmetRecipe(ItemHandler.iridiumHelmet, new ItemStack(Items.Resource, 1, 3));
		chestplateRecipe(ItemHandler.iridiumChestplate, new ItemStack(Items.Resource, 1, 3));
		leggingsRecipe(ItemHandler.iridiumLeggings, new ItemStack(Items.Resource, 1, 3));
		bootsRecipe(ItemHandler.iridiumBoots, new ItemStack(Items.Resource, 1, 3));
	}

	private static void itemSmelting() {
		GameRegistry.addSmelting(ItemHandler.imbuedShard, new ItemStack(ItemHandler.voidShard), 0.5f);
	}

	private static void leggingsRecipe(Item output, ItemStack input) {
		GameRegistry.addRecipe(new ItemStack(output), "###", "# #", "# #", '#', input);
	}

	private static void orbRecipe(Item output, ItemStack input) {
		GameRegistry.addRecipe(new ItemStack(output), "##", "##", '#', input);
	}

	private static void staffRecipe(Item output, ItemStack input) {
		GameRegistry.addShapelessRecipe(new ItemStack(output), input, new ItemStack(ItemHandler.staffParts, 1, 0));
	}
}
