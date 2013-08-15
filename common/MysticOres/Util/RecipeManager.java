package MysticOres.Util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.ShapedOreRecipe;
import MysticOres.Blocks.BlockHandler;
import MysticOres.Items.ItemHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeManager
{	
	public static void Initialize()
	{
		Recipes();
		ToolRecipes();
		PowderRecipes();
		Smelting();
	}
	
	private static void Recipes()
	{
		GameRegistry.addRecipe(new ItemStack(Block.glass, 1), new Object [] {
			"##", "##", '#', new ItemStack(ItemHandler.Resource, 1, 11)
		});
		
		GameRegistry.addRecipe(new ItemStack(Block.obsidian, 1), new Object[] {
			"##", "##", '#', new ItemStack(ItemHandler.Resource, 1, 12)
		});
	
        GameRegistry.addRecipe(new ItemStack(BlockHandler.BlockBase, 8, 7), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.dirt, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 6)
        });
        
        GameRegistry.addRecipe(new ItemStack(BlockHandler.BlockBase, 16, 7), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), new ItemStack(BlockHandler.BlockBase, 1, 3), Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 6)
        });
        
        GameRegistry.addRecipe(new ItemStack(BlockHandler.BlockBase, 8, 3), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.dirt, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 8)
        });
        
		GameRegistry.addRecipe(new ItemStack(BlockHandler.BlockBase, 8, 12), new Object[] {
			"###", "#D#", "###", '#', new ItemStack(ItemHandler.Resource, 1, 11), 'D', new ItemStack(ItemHandler.Resource, 1, 12)
		});
		
		GameRegistry.addRecipe(new ItemStack(BlockHandler.BlockBase, 1, 7), new Object[] {
			"##", "##", '#', new ItemStack(ItemHandler.Resource, 1, 10)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.BlockBase, 2, 7), new Object[] {
			new ItemStack(ItemHandler.Resource, 1, 9), new ItemStack(BlockHandler.BlockBase, 1, 7)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.BlockBase, 2, 3), new Object[] {
			new ItemStack(ItemHandler.Resource, 1, 9), new ItemStack(BlockHandler.BlockBase, 1, 3)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.BlockBase, 2, 0), new Object[] {
			new ItemStack(ItemHandler.Resource, 1, 9), new ItemStack(BlockHandler.BlockBase, 1, 0)
		});

    	GameRegistry.addRecipe(new ItemStack(ItemHandler.Resource, 2, 13), new Object[] {
			"#", "#", '#', new ItemStack(ItemHandler.Resource, 1, 12)
		});
    	
		GameRegistry.addRecipe(new ItemStack(ItemHandler.Resource, 1, 3), new Object[] {
			"###", "#O#", "###", '#', new ItemStack(ItemHandler.Resource, 1, 4), 'O', new ItemStack(ItemHandler.Resource, 1, 2)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.Resource, 4, 11), new Object[] {
			Block.glass
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.Resource, 4, 12), new Object[] {
			Block.obsidian
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.Resource, 8, 9), new Object[] {
			new ItemStack(ItemHandler.Resource, 1, 5), new ItemStack(ItemHandler.Resource, 1, 7), new ItemStack(ItemHandler.Resource, 1, 8), new ItemStack(ItemHandler.Resource, 1, 6)
		});		
	}
	
	private static void ToolRecipes()
	{
		ToolRecipes.SwordRecipe(ItemHandler.VerditeSword, new ItemStack(ItemHandler.Resource, 1, 0));
		ToolRecipes.PickaxeRecipe(ItemHandler.VerditePickaxe, new ItemStack(ItemHandler.Resource, 1, 0));
		ToolRecipes.ShovelRecipe(ItemHandler.VerditeShovel, new ItemStack(ItemHandler.Resource, 1, 0));
		ToolRecipes.AxeRecipe(ItemHandler.VerditeAxe, new ItemStack(ItemHandler.Resource, 1, 0));
		ToolRecipes.HoeRecipe(ItemHandler.VerditeHoe, new ItemStack(ItemHandler.Resource, 1, 0));
		
		ToolRecipes.SwordRecipe(ItemHandler.MithrilSword, new ItemStack(ItemHandler.Resource, 1, 1));
		ToolRecipes.PickaxeRecipe(ItemHandler.MithrilPickaxe, new ItemStack(ItemHandler.Resource, 1, 1));
		ToolRecipes.ShovelRecipe(ItemHandler.MithrilShovel, new ItemStack(ItemHandler.Resource, 1, 1));
		ToolRecipes.AxeRecipe(ItemHandler.MithrilAxe, new ItemStack(ItemHandler.Resource, 1, 1));
		ToolRecipes.HoeRecipe(ItemHandler.MithrilHoe, new ItemStack(ItemHandler.Resource, 1, 1));
		
		ToolRecipes.AdvancedSwordRecipe(ItemHandler.AdamantineSword, new ItemStack(ItemHandler.Resource, 1, 2));
		ToolRecipes.AdvancedPickaxeRecipe(ItemHandler.AdamantinePickaxe, new ItemStack(ItemHandler.Resource, 1, 2));
		ToolRecipes.AdvancedShovelRecipe(ItemHandler.AdamantineShovel, new ItemStack(ItemHandler.Resource, 1, 2));
		ToolRecipes.AdvancedAxeRecipe(ItemHandler.AdamantineAxe, new ItemStack(ItemHandler.Resource, 1, 2));
		ToolRecipes.AdvancedHoeRecipe(ItemHandler.AdamantineHoe, new ItemStack(ItemHandler.Resource, 1, 2));

		ToolRecipes.AdvancedSwordRecipe(ItemHandler.IridiumSword, new ItemStack(ItemHandler.Resource, 1, 3));
		ToolRecipes.AdvancedPickaxeRecipe(ItemHandler.IridiumPickaxe, new ItemStack(ItemHandler.Resource, 1, 3));
		ToolRecipes.AdvancedShovelRecipe(ItemHandler.IridiumShovel, new ItemStack(ItemHandler.Resource, 1, 3));
		ToolRecipes.AdvancedAxeRecipe(ItemHandler.IridiumAxe, new ItemStack(ItemHandler.Resource, 1, 3));
		ToolRecipes.AdvancedHoeRecipe(ItemHandler.IridiumHoe, new ItemStack(ItemHandler.Resource, 1, 3));
		
		ToolRecipes.AdvancedSwordRecipe(ItemHandler.IridiumSword, new ItemStack(ItemHandler.Resource, 1, 3));
		ToolRecipes.AdvancedPickaxeRecipe(ItemHandler.IridiumPickaxe, new ItemStack(ItemHandler.Resource, 1, 3));
		ToolRecipes.AdvancedShovelRecipe(ItemHandler.IridiumShovel, new ItemStack(ItemHandler.Resource, 1, 3));
		ToolRecipes.AdvancedAxeRecipe(ItemHandler.IridiumAxe, new ItemStack(ItemHandler.Resource, 1, 3));
		ToolRecipes.AdvancedHoeRecipe(ItemHandler.IridiumHoe, new ItemStack(ItemHandler.Resource, 1, 3));

		ToolRecipes.AdvancedSwordRecipe(ItemHandler.ObsidianSword, new ItemStack(Block.obsidian));
		ToolRecipes.AdvancedPickaxeRecipe(ItemHandler.ObsidianPickaxe, new ItemStack(Block.obsidian));
		ToolRecipes.AdvancedShovelRecipe(ItemHandler.ObsidianShovel, new ItemStack(Block.obsidian));
		ToolRecipes.AdvancedAxeRecipe(ItemHandler.ObsidianAxe, new ItemStack(Block.obsidian));
		ToolRecipes.AdvancedHoeRecipe(ItemHandler.ObsidianHoe, new ItemStack(Block.obsidian));		

		ToolRecipes.AdvancedSwordRecipe(ItemHandler.BloodstoneSword, new ItemStack(BlockHandler.BlockBase, 1, 7));
		ToolRecipes.AdvancedPickaxeRecipe(ItemHandler.BloodstonePickaxe, new ItemStack(BlockHandler.BlockBase, 1, 7));
		ToolRecipes.AdvancedShovelRecipe(ItemHandler.BloodstoneShovel, new ItemStack(BlockHandler.BlockBase, 1, 7));
		ToolRecipes.AdvancedAxeRecipe(ItemHandler.BloodstoneAxe, new ItemStack(BlockHandler.BlockBase, 1, 7));
		ToolRecipes.AdvancedHoeRecipe(ItemHandler.BloodstoneHoe, new ItemStack(BlockHandler.BlockBase, 1, 7));		
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.Satchel, 1), new Object[] {
			"#$#", "$%$", "#$#", '#', Item.silk, '$', new ItemStack(ItemHandler.Resource, 1, 9), '%', Block.enderChest
		});
	}

	private static void PowderRecipes()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(Block.oreGold, 2), new Object[] {
			new ItemStack(ItemHandler.Resource, 1, 9), Block.oreGold
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Block.oreIron, 2), new Object[] {
			new ItemStack(ItemHandler.Resource, 1, 9), Block.oreIron
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.Resource, 2, 10), new Object[] {
			new ItemStack(ItemHandler.Resource, 1, 9), new ItemStack(ItemHandler.Resource, 1, 10)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Item.gunpowder, 2), new Object[] {
			new ItemStack(ItemHandler.Resource, 1, 9), Item.gunpowder
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.Resource, 2, 4), new Object[] {
			new ItemStack(ItemHandler.Resource, 1, 9), new ItemStack(ItemHandler.Resource, 1, 4)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Block.oreCoal, 2), new Object[] {
			new ItemStack(ItemHandler.Resource, 1, 9), Block.oreCoal
        });
		
        GameRegistry.addShapelessRecipe(new ItemStack(Block.oreIron, 3), new Object[] {
        	new ItemStack(ItemHandler.Resource, 1, 9), Block.oreIron
        });
        
        GameRegistry.addShapelessRecipe(new ItemStack(Block.oreGold, 3), new Object[] {
        	new ItemStack(ItemHandler.Resource, 1, 9), Block.oreGold
        });
        
        GameRegistry.addShapelessRecipe(new ItemStack(Block.oreRedstone, 2), new Object[] {
        	new ItemStack(ItemHandler.Resource, 1, 9), Block.oreRedstone
        });
        
        GameRegistry.addShapelessRecipe(new ItemStack(Block.oreLapis, 2), new Object[] {
        	new ItemStack(ItemHandler.Resource, 1, 9), Block.oreLapis
        });
        
        GameRegistry.addShapelessRecipe(new ItemStack(Block.oreDiamond, 2), new Object[] {
        	new ItemStack(ItemHandler.Resource, 1, 9), Block.oreDiamond
        });
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.sugar, 18), new Object[] {
        	new ItemStack(ItemHandler.Resource, 1, 9), Item.sugar
        });
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.redstone, 12), new Object[] {
        	new ItemStack(ItemHandler.Resource, 1, 9), Item.redstone
        });
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.glowstone, 6), new Object[] {
        	new ItemStack(ItemHandler.Resource, 1, 9), Item.glowstone
        });
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.gunpowder, 3), new Object[] {
        	new ItemStack(ItemHandler.Resource, 1, 9), Item.gunpowder
        });
	}
	
	private static void Smelting()
	{
		FurnaceRecipes.smelting().addSmelting(BlockHandler.BlockBase.blockID, 0, new ItemStack(ItemHandler.Resource, 1, 2), 0.9F);
		FurnaceRecipes.smelting().addSmelting(BlockHandler.BlockBase.blockID, 3, new ItemStack(ItemHandler.Resource, 1, 1), 0.7F);
		FurnaceRecipes.smelting().addSmelting(BlockHandler.BlockBase.blockID, 6, new ItemStack(ItemHandler.Resource, 1, 0), 0.4F);
		FurnaceRecipes.smelting().addSmelting(BlockHandler.BlockBase.blockID, 1, new ItemStack(ItemHandler.Resource, 1, 8), 0.4F);
		FurnaceRecipes.smelting().addSmelting(BlockHandler.BlockBase.blockID, 2, new ItemStack(ItemHandler.Resource, 1, 4), 0.4F);
		FurnaceRecipes.smelting().addSmelting(BlockHandler.BlockBase.blockID, 4, new ItemStack(ItemHandler.Resource, 1, 5), 0.4F);
		FurnaceRecipes.smelting().addSmelting(BlockHandler.BlockBase.blockID, 5, new ItemStack(ItemHandler.Resource, 1, 7), 0.4F);
		FurnaceRecipes.smelting().addSmelting(BlockHandler.BlockBase.blockID, 7, new ItemStack(ItemHandler.Resource, 1, 10), 0.4F);
		FurnaceRecipes.smelting().addSmelting(BlockHandler.BlockBase.blockID, 11, new ItemStack(ItemHandler.Resource, 1, 6), 0.4F);
	}
}
