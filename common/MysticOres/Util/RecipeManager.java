package MysticOres.Util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.ShapedOreRecipe;
import MysticOres.Blocks.BlockHandler;
import MysticOres.Items.Items;
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
			"##", "##", '#', new ItemStack(Items.Resource, 1, 11)
		});
		
		GameRegistry.addRecipe(new ItemStack(Block.obsidian, 1), new Object[] {
			"##", "##", '#', new ItemStack(Items.Resource, 1, 12)
		});
	
        GameRegistry.addRecipe(new ItemStack(BlockHandler.BlockBase, 8, 7), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.dirt, Character.valueOf('O'), new ItemStack(Items.Resource, 1, 6)
        });
        
        GameRegistry.addRecipe(new ItemStack(BlockHandler.BlockBase, 16, 7), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), new ItemStack(BlockHandler.BlockBase, 1, 3), Character.valueOf('O'), new ItemStack(Items.Resource, 1, 6)
        });
        
        GameRegistry.addRecipe(new ItemStack(BlockHandler.BlockBase, 8, 3), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.dirt, Character.valueOf('O'), new ItemStack(Items.Resource, 1, 8)
        });
        
		GameRegistry.addRecipe(new ItemStack(BlockHandler.BlockBase, 8, 12), new Object[] {
			"###", "#D#", "###", '#', new ItemStack(Items.Resource, 1, 11), 'D', new ItemStack(Items.Resource, 1, 12)
		});
		
		GameRegistry.addRecipe(new ItemStack(BlockHandler.BlockBase, 1, 7), new Object[] {
			"##", "##", '#', new ItemStack(Items.Resource, 1, 10)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.BlockBase, 2, 7), new Object[] {
			new ItemStack(Items.Resource, 1, 9), new ItemStack(BlockHandler.BlockBase, 1, 7)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.BlockBase, 2, 3), new Object[] {
			new ItemStack(Items.Resource, 1, 9), new ItemStack(BlockHandler.BlockBase, 1, 3)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.BlockBase, 2, 0), new Object[] {
			new ItemStack(Items.Resource, 1, 9), new ItemStack(BlockHandler.BlockBase, 1, 0)
		});

    	GameRegistry.addRecipe(new ItemStack(Items.Resource, 2, 13), new Object[] {
			"#", "#", '#', new ItemStack(Items.Resource, 1, 12)
		});
    	
		GameRegistry.addRecipe(new ItemStack(Items.Resource, 1, 3), new Object[] {
			"###", "#O#", "###", '#', new ItemStack(Items.Resource, 1, 4), 'O', new ItemStack(Items.Resource, 1, 2)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.Resource, 4, 11), new Object[] {
			Block.glass
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.Resource, 4, 12), new Object[] {
			Block.obsidian
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.Resource, 8, 9), new Object[] {
			new ItemStack(Items.Resource, 1, 5), new ItemStack(Items.Resource, 1, 7), new ItemStack(Items.Resource, 1, 8), new ItemStack(Items.Resource, 1, 6)
		});		
	}
	
	private static void ToolRecipes()
	{
		ToolRecipes.SwordRecipe(Items.VerditeSword, new ItemStack(Items.Resource, 1, 0));
		ToolRecipes.PickaxeRecipe(Items.VerditePickaxe, new ItemStack(Items.Resource, 1, 0));
		ToolRecipes.ShovelRecipe(Items.VerditeShovel, new ItemStack(Items.Resource, 1, 0));
		ToolRecipes.AxeRecipe(Items.VerditeAxe, new ItemStack(Items.Resource, 1, 0));
		ToolRecipes.HoeRecipe(Items.VerditeHoe, new ItemStack(Items.Resource, 1, 0));
		
		ToolRecipes.SwordRecipe(Items.MithrilSword, new ItemStack(Items.Resource, 1, 1));
		ToolRecipes.PickaxeRecipe(Items.MithrilPickaxe, new ItemStack(Items.Resource, 1, 1));
		ToolRecipes.ShovelRecipe(Items.MithrilShovel, new ItemStack(Items.Resource, 1, 1));
		ToolRecipes.AxeRecipe(Items.MithrilAxe, new ItemStack(Items.Resource, 1, 1));
		ToolRecipes.HoeRecipe(Items.MithrilHoe, new ItemStack(Items.Resource, 1, 1));
		
		ToolRecipes.AdvancedSwordRecipe(Items.AdamantineSword, new ItemStack(Items.Resource, 1, 2));
		ToolRecipes.AdvancedPickaxeRecipe(Items.AdamantinePickaxe, new ItemStack(Items.Resource, 1, 2));
		ToolRecipes.AdvancedShovelRecipe(Items.AdamantineShovel, new ItemStack(Items.Resource, 1, 2));
		ToolRecipes.AdvancedAxeRecipe(Items.AdamantineAxe, new ItemStack(Items.Resource, 1, 2));
		ToolRecipes.AdvancedHoeRecipe(Items.AdamantineHoe, new ItemStack(Items.Resource, 1, 2));

		ToolRecipes.AdvancedSwordRecipe(Items.IridiumSword, new ItemStack(Items.Resource, 1, 3));
		ToolRecipes.AdvancedPickaxeRecipe(Items.IridiumPickaxe, new ItemStack(Items.Resource, 1, 3));
		ToolRecipes.AdvancedShovelRecipe(Items.IridiumShovel, new ItemStack(Items.Resource, 1, 3));
		ToolRecipes.AdvancedAxeRecipe(Items.IridiumAxe, new ItemStack(Items.Resource, 1, 3));
		ToolRecipes.AdvancedHoeRecipe(Items.IridiumHoe, new ItemStack(Items.Resource, 1, 3));
		
		ToolRecipes.AdvancedSwordRecipe(Items.IridiumSword, new ItemStack(Items.Resource, 1, 3));
		ToolRecipes.AdvancedPickaxeRecipe(Items.IridiumPickaxe, new ItemStack(Items.Resource, 1, 3));
		ToolRecipes.AdvancedShovelRecipe(Items.IridiumShovel, new ItemStack(Items.Resource, 1, 3));
		ToolRecipes.AdvancedAxeRecipe(Items.IridiumAxe, new ItemStack(Items.Resource, 1, 3));
		ToolRecipes.AdvancedHoeRecipe(Items.IridiumHoe, new ItemStack(Items.Resource, 1, 3));

		ToolRecipes.AdvancedSwordRecipe(Items.ObsidianSword, new ItemStack(Block.obsidian));
		ToolRecipes.AdvancedPickaxeRecipe(Items.ObsidianPickaxe, new ItemStack(Block.obsidian));
		ToolRecipes.AdvancedShovelRecipe(Items.ObsidianShovel, new ItemStack(Block.obsidian));
		ToolRecipes.AdvancedAxeRecipe(Items.ObsidianAxe, new ItemStack(Block.obsidian));
		ToolRecipes.AdvancedHoeRecipe(Items.ObsidianHoe, new ItemStack(Block.obsidian));		

		ToolRecipes.AdvancedSwordRecipe(Items.BloodstoneSword, new ItemStack(BlockHandler.BlockBase, 1, 7));
		ToolRecipes.AdvancedPickaxeRecipe(Items.BloodstonePickaxe, new ItemStack(BlockHandler.BlockBase, 1, 7));
		ToolRecipes.AdvancedShovelRecipe(Items.BloodstoneShovel, new ItemStack(BlockHandler.BlockBase, 1, 7));
		ToolRecipes.AdvancedAxeRecipe(Items.BloodstoneAxe, new ItemStack(BlockHandler.BlockBase, 1, 7));
		ToolRecipes.AdvancedHoeRecipe(Items.BloodstoneHoe, new ItemStack(BlockHandler.BlockBase, 1, 7));		
		
		GameRegistry.addRecipe(new ItemStack(Items.Satchel, 1), new Object[] {
			"#$#", "$%$", "#$#", '#', Item.silk, '$', new ItemStack(Items.Resource, 1, 9), '%', Block.enderChest
		});
	}

	private static void PowderRecipes()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(Block.oreGold, 2), new Object[] {
			new ItemStack(Items.Resource, 1, 9), Block.oreGold
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Block.oreIron, 2), new Object[] {
			new ItemStack(Items.Resource, 1, 9), Block.oreIron
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.Resource, 2, 10), new Object[] {
			new ItemStack(Items.Resource, 1, 9), new ItemStack(Items.Resource, 1, 10)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Item.gunpowder, 2), new Object[] {
			new ItemStack(Items.Resource, 1, 9), Item.gunpowder
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.Resource, 2, 4), new Object[] {
			new ItemStack(Items.Resource, 1, 9), new ItemStack(Items.Resource, 1, 4)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Block.oreCoal, 2), new Object[] {
			new ItemStack(Items.Resource, 1, 9), Block.oreCoal
        });
		
        GameRegistry.addShapelessRecipe(new ItemStack(Block.oreIron, 3), new Object[] {
        	new ItemStack(Items.Resource, 1, 9), Block.oreIron
        });
        
        GameRegistry.addShapelessRecipe(new ItemStack(Block.oreGold, 3), new Object[] {
        	new ItemStack(Items.Resource, 1, 9), Block.oreGold
        });
        
        GameRegistry.addShapelessRecipe(new ItemStack(Block.oreRedstone, 2), new Object[] {
        	new ItemStack(Items.Resource, 1, 9), Block.oreRedstone
        });
        
        GameRegistry.addShapelessRecipe(new ItemStack(Block.oreLapis, 2), new Object[] {
        	new ItemStack(Items.Resource, 1, 9), Block.oreLapis
        });
        
        GameRegistry.addShapelessRecipe(new ItemStack(Block.oreDiamond, 2), new Object[] {
        	new ItemStack(Items.Resource, 1, 9), Block.oreDiamond
        });
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.sugar, 18), new Object[] {
        	new ItemStack(Items.Resource, 1, 9), Item.sugar
        });
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.redstone, 12), new Object[] {
        	new ItemStack(Items.Resource, 1, 9), Item.redstone
        });
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.glowstone, 6), new Object[] {
        	new ItemStack(Items.Resource, 1, 9), Item.glowstone
        });
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.gunpowder, 3), new Object[] {
        	new ItemStack(Items.Resource, 1, 9), Item.gunpowder
        });
	}
	
	private static void Smelting()
	{
		FurnaceRecipes.smelting().addSmelting(BlockHandler.BlockBase.blockID, 0, new ItemStack(Items.Resource, 1, 2), 0.9F);
		FurnaceRecipes.smelting().addSmelting(BlockHandler.BlockBase.blockID, 3, new ItemStack(Items.Resource, 1, 1), 0.7F);
		FurnaceRecipes.smelting().addSmelting(BlockHandler.BlockBase.blockID, 6, new ItemStack(Items.Resource, 1, 0), 0.4F);
		FurnaceRecipes.smelting().addSmelting(BlockHandler.BlockBase.blockID, 1, new ItemStack(Items.Resource, 1, 8), 0.4F);
		FurnaceRecipes.smelting().addSmelting(BlockHandler.BlockBase.blockID, 2, new ItemStack(Items.Resource, 1, 4), 0.4F);
		FurnaceRecipes.smelting().addSmelting(BlockHandler.BlockBase.blockID, 4, new ItemStack(Items.Resource, 1, 5), 0.4F);
		FurnaceRecipes.smelting().addSmelting(BlockHandler.BlockBase.blockID, 5, new ItemStack(Items.Resource, 1, 7), 0.4F);
		FurnaceRecipes.smelting().addSmelting(BlockHandler.BlockBase.blockID, 7, new ItemStack(Items.Resource, 1, 10), 0.4F);
		FurnaceRecipes.smelting().addSmelting(BlockHandler.BlockBase.blockID, 11, new ItemStack(Items.Resource, 1, 6), 0.4F);
	}
}
