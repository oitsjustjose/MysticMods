package mysticstones.util;

import mysticstones.MysticStones;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHandler {
	public static void CraftElse() {
		if (Loader.isModLoaded("Mystic Ores") == true) {
			CraftingManager.getInstance().getRecipeList()
					.add(new ShapedOreRecipe(new ItemStack(MysticStones.ReinforcedBricks, 1, 0), true, new Object[] { "#$#", "$$$", "#$#", '$', "ingotMithril", '#', Block.stone }));
			CraftingManager.getInstance().getRecipeList()
					.add(new ShapedOreRecipe(new ItemStack(MysticStones.ReinforcedBricks, 1, 1), true, new Object[] { "#$#", "$$$", "#$#", '$', "ingotVerdite", '#', Block.stone }));
			CraftingManager.getInstance().getRecipeList()
					.add(new ShapedOreRecipe(new ItemStack(MysticStones.ReinforcedBricks, 1, 2), true, new Object[] { "#$#", "$$$", "#$#", '$', "ingotIridium", '#', Block.stone }));
			CraftingManager.getInstance().getRecipeList()
					.add(new ShapedOreRecipe(new ItemStack(MysticStones.ReinforcedBricks, 1, 3), true, new Object[] { "#$#", "$$$", "#$#", '$', "ingotAdamantine", '#', Block.stone }));
			CraftingManager.getInstance().getRecipeList()
					.add(new ShapedOreRecipe(new ItemStack(MysticStones.ReinforcedBricks, 1, 4), true, new Object[] { "#$#", "$$$", "#$#", '$', "gemTourmaline", '#', Block.stone }));
			CraftingManager.getInstance().getRecipeList()
					.add(new ShapedOreRecipe(new ItemStack(MysticStones.ReinforcedBricks, 1, 5), true, new Object[] { "#$#", "$$$", "#$#", '$', "gemTopaz", '#', Block.stone }));
			CraftingManager.getInstance().getRecipeList()
					.add(new ShapedOreRecipe(new ItemStack(MysticStones.ReinforcedBricks, 1, 6), true, new Object[] { "#$#", "$$$", "#$#", '$', "gemAmethyst", '#', Block.stone }));
			CraftingManager.getInstance().getRecipeList()
					.add(new ShapedOreRecipe(new ItemStack(MysticStones.ReinforcedBricks, 1, 7), true, new Object[] { "#$#", "$$$", "#$#", '$', "gemAgate", '#', Block.stone }));
		}
		//smelting
		FurnaceRecipes.smelting().addSmelting(MysticStones.Stones.blockID, 1, new ItemStack(MysticStones.Stones, 1, 0), 0.1F);
		FurnaceRecipes.smelting().addSmelting(MysticStones.Stones.blockID, 3, new ItemStack(MysticStones.Stones, 1, 2), 0.1F);
		FurnaceRecipes.smelting().addSmelting(MysticStones.Stones.blockID, 5, new ItemStack(MysticStones.Stones, 1, 4), 0.1F);
		FurnaceRecipes.smelting().addSmelting(MysticStones.Stones.blockID, 7, new ItemStack(MysticStones.Stones, 1, 6), 0.1F);
		FurnaceRecipes.smelting().addSmelting(MysticStones.Stones.blockID, 9, new ItemStack(MysticStones.Stones, 1, 8), 0.1F);
		FurnaceRecipes.smelting().addSmelting(MysticStones.Stones.blockID, 11, new ItemStack(MysticStones.Stones, 1, 10), 0.1F);
		FurnaceRecipes.smelting().addSmelting(MysticStones.Stones.blockID, 13, new ItemStack(MysticStones.Stones, 1, 12), 0.1F);
		for (int i = 0; i < 7; i++) {
			OreDictionary.registerOre("plankWood", new ItemStack(MysticStones.Planks, 1, i));
		}
	}

	public static void CraftPlanks() {
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(MysticStones.Planks, 1, 0), new Object[] { "plankWood", new ItemStack(MysticStones.Stones, 1, 0) }));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(MysticStones.Planks, 1, 0), new Object[] { "plankWood", new ItemStack(MysticStones.Stones, 1, 1) }));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(MysticStones.Planks, 1, 1), new Object[] { "plankWood", new ItemStack(MysticStones.Stones, 1, 2) }));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(MysticStones.Planks, 1, 1), new Object[] { "plankWood", new ItemStack(MysticStones.Stones, 1, 3) }));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(MysticStones.Planks, 1, 2), new Object[] { "plankWood", new ItemStack(MysticStones.Stones, 1, 4) }));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(MysticStones.Planks, 1, 2), new Object[] { "plankWood", new ItemStack(MysticStones.Stones, 1, 5) }));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(MysticStones.Planks, 1, 3), new Object[] { "plankWood", new ItemStack(MysticStones.Stones, 1, 6) }));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(MysticStones.Planks, 1, 3), new Object[] { "plankWood", new ItemStack(MysticStones.Stones, 1, 7) }));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(MysticStones.Planks, 1, 4), new Object[] { "plankWood", new ItemStack(MysticStones.Stones, 1, 8) }));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(MysticStones.Planks, 1, 4), new Object[] { "plankWood", new ItemStack(MysticStones.Stones, 1, 9) }));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(MysticStones.Planks, 1, 5), new Object[] { "plankWood", new ItemStack(MysticStones.Stones, 1, 10) }));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(MysticStones.Planks, 1, 5), new Object[] { "plankWood", new ItemStack(MysticStones.Stones, 1, 11) }));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(MysticStones.Planks, 1, 6), new Object[] { "plankWood", new ItemStack(MysticStones.Stones, 1, 12) }));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(MysticStones.Planks, 1, 6), new Object[] { "plankWood", new ItemStack(MysticStones.Stones, 1, 13) }));
	}

	public static void CraftReinforced() {
		if (Loader.isModLoaded("MysticOres")) {
			CraftingManager
					.getInstance()
					.getRecipeList()
					.add(new ShapedOreRecipe(new ItemStack(MysticStones.ReinforcedBricks, 1, 0), new Object[] { "X#X", "###", "X#X", Character.valueOf('#'), "ingotMithril", Character.valueOf('X'),
							Block.stone }));
			CraftingManager
					.getInstance()
					.getRecipeList()
					.add(new ShapedOreRecipe(new ItemStack(MysticStones.ReinforcedBricks, 1, 1), new Object[] { "X#X", "###", "X#X", Character.valueOf('#'), "ingotVerdite", Character.valueOf('X'),
							Block.stone }));
			CraftingManager
					.getInstance()
					.getRecipeList()
					.add(new ShapedOreRecipe(new ItemStack(MysticStones.ReinforcedBricks, 1, 2), new Object[] { "X#X", "###", "X#X", Character.valueOf('#'), "ingotIridium", Character.valueOf('X'),
							Block.stone }));
			CraftingManager
					.getInstance()
					.getRecipeList()
					.add(new ShapedOreRecipe(new ItemStack(MysticStones.ReinforcedBricks, 1, 3), new Object[] { "X#X", "###", "X#X", Character.valueOf('#'), "ingotAdamantine", Character.valueOf('X'),
							Block.stone }));
			CraftingManager
					.getInstance()
					.getRecipeList()
					.add(new ShapedOreRecipe(new ItemStack(MysticStones.ReinforcedBricks, 1, 4), new Object[] { "X#X", "###", "X#X", Character.valueOf('#'), "gemTourmaline", Character.valueOf('X'),
							Block.stone }));
			CraftingManager
					.getInstance()
					.getRecipeList()
					.add(new ShapedOreRecipe(new ItemStack(MysticStones.ReinforcedBricks, 1, 5), new Object[] { "X#X", "###", "X#X", Character.valueOf('#'), "gemTopaz", Character.valueOf('X'),
							Block.stone }));
			CraftingManager
					.getInstance()
					.getRecipeList()
					.add(new ShapedOreRecipe(new ItemStack(MysticStones.ReinforcedBricks, 1, 6), new Object[] { "X#X", "###", "X#X", Character.valueOf('#'), "gemAmethyst", Character.valueOf('X'),
							Block.stone }));
			CraftingManager
					.getInstance()
					.getRecipeList()
					.add(new ShapedOreRecipe(new ItemStack(MysticStones.ReinforcedBricks, 1, 7), new Object[] { "X#X", "###", "X#X", Character.valueOf('#'), "gemAgate", Character.valueOf('X'),
							Block.stone }));
		}
	}

	public static void CraftStoneBricks() {
		GameRegistry.addRecipe(new ItemStack(MysticStones.StoneBricks, 4, 0), new Object[] { "##", "##", '#', new ItemStack(MysticStones.Stones, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(MysticStones.StoneBricks, 4, 1), new Object[] { "##", "##", '#', new ItemStack(MysticStones.Stones, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(MysticStones.StoneBricks, 4, 2), new Object[] { "##", "##", '#', new ItemStack(MysticStones.Stones, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(MysticStones.StoneBricks, 4, 3), new Object[] { "##", "##", '#', new ItemStack(MysticStones.Stones, 1, 6) });
		GameRegistry.addRecipe(new ItemStack(MysticStones.StoneBricks, 4, 4), new Object[] { "##", "##", '#', new ItemStack(MysticStones.Stones, 1, 8) });
		GameRegistry.addRecipe(new ItemStack(MysticStones.StoneBricks, 4, 5), new Object[] { "##", "##", '#', new ItemStack(MysticStones.Stones, 1, 10) });
		GameRegistry.addRecipe(new ItemStack(MysticStones.StoneBricks, 4, 6), new Object[] { "##", "##", '#', new ItemStack(MysticStones.Stones, 1, 12) });
	}
}
