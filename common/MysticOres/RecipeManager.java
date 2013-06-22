package MysticOres;

import MysticOres.Blocks.BlockHandler;
import MysticOres.Items.ItemHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockLeaves;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeManager
{	
	public static void init(){
		recipes();
		blockRecipes();
		blockSmelting();
		itemRecipes();
		mysticGemRecipes();
		mysticPowderRecipes();
	}
	
	private static void recipes()
	{
		GameRegistry.addRecipe(new ItemStack(Block.glass, 1), new Object [] {
			"##", "##", '#', new ItemStack(ItemHandler.Resource, 1, 11)
		});
		
		GameRegistry.addRecipe(new ItemStack(Block.obsidian, 1), new Object[] {
			"##", "##", '#', new ItemStack(ItemHandler.Resource, 1, 12)
		});
	}
	
	private static void blockRecipes(){
        GameRegistry.addRecipe(new ItemStack(BlockHandler.BlockOres, 8, 7), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.dirt, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 6)
        });
        
        GameRegistry.addRecipe(new ItemStack(BlockHandler.BlockOres, 16, 7), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), new ItemStack(BlockHandler.BlockOres, 1, 3), Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 6)
        });
        
        GameRegistry.addRecipe(new ItemStack(BlockHandler.BlockOres, 8, 3), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.dirt, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 8)
        });
        
		GameRegistry.addRecipe(new ItemStack(BlockHandler.ReinforcedGlass, 8), new Object[] {
			"###", "#D#", "###", '#', new ItemStack(ItemHandler.Resource, 1, 11), 'D', new ItemStack(ItemHandler.Resource, 1, 12)
		});
		
		GameRegistry.addRecipe(new ItemStack(BlockHandler.BlockOres, 1, 7), new Object[] {
			"##", "##", '#', new ItemStack(ItemHandler.Resource, 1, 10)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.BlockOres, 2, 7), new Object[] {
			new ItemStack(ItemHandler.Resource, 1, 9), new ItemStack(BlockHandler.BlockOres, 1, 7)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.BlockOres, 2, 3), new Object[] {
			new ItemStack(ItemHandler.Resource, 1, 9), new ItemStack(BlockHandler.BlockOres, 1, 3)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.BlockOres, 2, 0), new Object[] {
			new ItemStack(ItemHandler.Resource, 1, 9), new ItemStack(BlockHandler.BlockOres, 1, 0)
		});
	}
	
	private static void blockSmelting(){
		FurnaceRecipes.smelting().addSmelting(BlockHandler.BlockOres.blockID, 0, new ItemStack(ItemHandler.Resource, 1, 2), 0.9F);
		FurnaceRecipes.smelting().addSmelting(BlockHandler.BlockOres.blockID, 3, new ItemStack(ItemHandler.Resource, 1, 1), 0.7F);
		FurnaceRecipes.smelting().addSmelting(BlockHandler.BlockOres.blockID, 6, new ItemStack(ItemHandler.Resource, 1, 0), 0.4F);
	}
	
	private static void itemRecipes(){        
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
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.Resource, 2, 10), new Object[] {
			new ItemStack(BlockHandler.BlockOres, 1, 7)
		});		
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.VerditePickaxe, 1), new Object[] {
			"###", " S ", " S ", '#', new ItemStack(ItemHandler.Resource, 1, 0), 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.VerditeSword, 1), new Object[] {
			"#", "#", "S", '#', new ItemStack(ItemHandler.Resource, 1, 0), 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.VerditeShovel, 1), new Object[] {
			"#", "S", "S", '#', new ItemStack(ItemHandler.Resource, 1, 0), 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.VerditeAxe, 1), new Object[] {
			"## ", "#S ", " S ", '#', new ItemStack(ItemHandler.Resource, 1, 0), 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.VerditeAxe, 1), new Object[] {
			"## ", "S# ", "S  ", '#', new ItemStack(ItemHandler.Resource, 1, 0), 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.VerditeHoe, 1), new Object[] {
			"## ", " S ", " S ", '#', new ItemStack(ItemHandler.Resource, 1, 0), 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.VerditeHoe, 1), new Object[] {
			"## ", "S  ", "S  ", '#', new ItemStack(ItemHandler.Resource, 1, 0), 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.MithrilPickaxe, 1), new Object[] {
			"###", " S ", " S ", '#', new ItemStack(ItemHandler.Resource, 1, 1), 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.MithrilSword, 1), new Object[] {
			"#", "#", "S", '#', new ItemStack(ItemHandler.Resource, 1, 1), 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.MithrilShovel, 1), new Object[] {
			"#", "S", "S", '#', new ItemStack(ItemHandler.Resource, 1, 1), 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.MithrilAxe, 1), new Object[] {
			"## ", "#S ", " S ", '#', new ItemStack(ItemHandler.Resource, 1, 1), 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.MithrilAxe, 1), new Object[] {
			"## ", "S# ", "S  ", '#', new ItemStack(ItemHandler.Resource, 1, 1), 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.MithrilHoe, 1), new Object[] {
			"## ", " S ", " S ", '#', new ItemStack(ItemHandler.Resource, 1, 1), 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.MithrilHoe, 1), new Object[] {
			"## ", "S  ", "S  ", '#', new ItemStack(ItemHandler.Resource, 1, 1), 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.AdamantinePickaxe, 1), new Object[] {
			"###", " S ", " S ", '#', new ItemStack(ItemHandler.Resource, 1, 2), 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.AdamantineSword, 1), new Object[] {
			"#", "#", "S", '#', new ItemStack(ItemHandler.Resource, 1, 2), 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.AdamantineShovel, 1), new Object[] {
			"#", "S", "S", '#', new ItemStack(ItemHandler.Resource, 1, 2), 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.AdamantineAxe, 1), new Object[] {
			"## ", "#S ", " S ", '#', new ItemStack(ItemHandler.Resource, 1, 2), 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.AdamantineAxe, 1), new Object[] {
			"## ", "S# ", "S  ", '#', new ItemStack(ItemHandler.Resource, 1, 2), 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.AdamantineHoe, 1), new Object[] {
			"## ", " S ", " S ", '#', new ItemStack(ItemHandler.Resource, 1, 2), 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.AdamantineHoe, 1), new Object[] {
			"## ", "S  ", "S  ", '#', new ItemStack(ItemHandler.Resource, 1, 2), 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.IridiumPickaxe, 1), new Object[] {
			"###", " S ", " S ", '#', new ItemStack(ItemHandler.Resource, 1, 3), 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.IridiumSword, 1), new Object[] {
			"#", "#", "S", '#', new ItemStack(ItemHandler.Resource, 1, 3), 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.IridiumShovel, 1), new Object[] {
			"#", "S", "S", '#', new ItemStack(ItemHandler.Resource, 1, 3), 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.IridiumAxe, 1), new Object[] {
			"## ", "#S ", " S ", '#', new ItemStack(ItemHandler.Resource, 1, 3), 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.IridiumAxe, 1), new Object[] {
			"## ", "S# ", "S  ", '#', new ItemStack(ItemHandler.Resource, 1, 3), 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.IridiumHoe, 1), new Object[] {
			"## ", " S ", " S ", '#', new ItemStack(ItemHandler.Resource, 1, 3), 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.IridiumHoe, 1), new Object[] {
			"## ", "S  ", "S  ", '#', new ItemStack(ItemHandler.Resource, 1, 3), 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.ObsidianPickaxe, 1), new Object[] {
			"###", " S ", " S ", '#', Block.obsidian, 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.ObsidianSword, 1), new Object[] {
			"#", "#", "S", '#', Block.obsidian, 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.ObsidianShovel, 1), new Object[] {
			"#", "S", "S", '#', Block.obsidian, 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.ObsidianAxe, 1), new Object[] {
			"## ", "#S ", " S ", '#', Block.obsidian, 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.ObsidianAxe, 1), new Object[] {
			"## ", "S# ", "S  ", '#', Block.obsidian, 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.ObsidianHoe, 1), new Object[] {
			"## ", " S ", " S ", '#', Block.obsidian, 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.ObsidianHoe, 1), new Object[] {
			"## ", "S  ", "S  ", '#', Block.obsidian, 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});		
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.BloodstonePickaxe, 1), new Object[] {
			"###", " S ", " S ", '#', new ItemStack(BlockHandler.BlockOres, 1, 7), 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.BloodstoneSword, 1), new Object[] {
			"#", "#", "S", '#', new ItemStack(BlockHandler.BlockOres, 1, 7), 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.BloodstoneShovel, 1), new Object[] {
			"#", "S", "S", '#', new ItemStack(BlockHandler.BlockOres, 1, 7), 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.BloodstoneAxe, 1), new Object[] {
			"## ", "#S ", " S ", '#', new ItemStack(BlockHandler.BlockOres, 1, 7), 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.BloodstoneAxe, 1), new Object[] {
			"## ", "S# ", "S  ", '#', new ItemStack(BlockHandler.BlockOres, 1, 7), 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.BloodstoneHoe, 1), new Object[] {
			"## ", " S ", " S ", '#', new ItemStack(BlockHandler.BlockOres, 1, 7), 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.BloodstoneHoe, 1), new Object[] {
			"## ", "S  ", "S  ", '#', new ItemStack(BlockHandler.BlockOres, 1, 7), 'S', new ItemStack(ItemHandler.Resource, 1, 13)
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.Satchel, 1), new Object[] {
			"#$#", "$%$", "#$#", '#', Item.silk, '$', new ItemStack(ItemHandler.Resource, 1, 9), '%', Block.enderChest
		});
	}
	
	
	private static void mysticGemRecipes()
	{
        GameRegistry.addRecipe(new ItemStack(Item.slimeBall, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.stone, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 6)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.cobblestoneMossy, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.cobblestone, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 6)
        });

        GameRegistry.addRecipe(new ItemStack(BlockGrass.grass, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.sand, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 6)
        });

        GameRegistry.addRecipe(new ItemStack(Item.seeds, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.sapling, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 6)
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.wheat, 16), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.reed, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 6)
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.seeds, 32), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.egg, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 6)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.cactus, 32), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.slimeBall, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 6)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.oreCoal, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.gravel, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 6)
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.flint, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), new ItemStack(ItemHandler.Resource, 1, 11), Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 6)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.tallGrass, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.seeds, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 6)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.bookShelf, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.planks, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 6)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.cloth, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.glass, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 6)
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.leather, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.stick, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 6)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.glass, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.stone, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 5)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.ice, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.blockSnow, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 5)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.blockLapis, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.blockIron, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 5)
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.reed, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.sapling, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 5)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.glass, 16), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.sand, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 5)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.blockSnow, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.dirt, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 5)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.oreLapis, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.oreCoal, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 5)
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.snowball, 16), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.reed, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 5)
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.sugar, 16), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.egg, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 5)
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.clay, 16), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.slimeBall, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 5)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.mushroomBrown, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.seeds, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 5)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.sandStone, 16), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.planks, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 5)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.snow, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.glass, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 5)
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.silk, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.stick, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 5)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.sandStone, 16), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.stone, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 7)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.netherrack, 16), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.cobblestone, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 7)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.blockGold, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.blockIron, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 7)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.wood, 16), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.sapling, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 7)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.sponge, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.sand, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 7)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.oreIron, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.dirt, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 7)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.oreRedstone, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.oreLapis, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 7)
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.appleRed, 1), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.reed, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 7)
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.feather, 32), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.egg, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 7)
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.arrow, 32), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), new ItemStack(ItemHandler.Resource, 1, 11), Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 7)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.mushroomRed, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.seeds, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 7)
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.doorWood, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.planks, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 7)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.glowStone, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.glass, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 7)
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.bone, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.stick, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 7)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.blockClay, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.stone, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 8)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.tnt, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.brick, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 8)
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.diamond, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.blockLapis, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 8)
        });
        
        GameRegistry.addRecipe(new ItemStack(BlockLeaves.leaves, 16), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.sapling, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 8)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.oreGold, 16), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.sand, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 8)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.oreDiamond, 4), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.oreRedstone, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 8)
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.book, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.reed, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 8)
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.cookie, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.egg, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 8)
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.cake, 1), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.slimeBall, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 8)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.music, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.planks, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 8)
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.pumpkinLantern, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.glass, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 8)
        });
        
        GameRegistry.addRecipe(new ItemStack(ItemHandler.Resource, 16, 0), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.ingotIron, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 6)
        });
        
        GameRegistry.addRecipe(new ItemStack(ItemHandler.Resource, 16, 10), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), new ItemStack(ItemHandler.Resource, 1, 12), Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 7)
        });
        
        GameRegistry.addRecipe(new ItemStack(ItemHandler.Resource, 8, 4), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), new ItemStack(ItemHandler.Resource, 1, 12), Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 8)
        });
        
        GameRegistry.addRecipe(new ItemStack(ItemHandler.Resource, 8, 12), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), new ItemStack(ItemHandler.Resource, 1, 11), Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 8)
        });
        
        GameRegistry.addRecipe(new ItemStack(ItemHandler.Resource, 8, 13), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.stick, Character.valueOf('O'), new ItemStack(ItemHandler.Resource, 1, 8)
        });
	}
	
	private static void mysticPowderRecipes(){
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
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.lightStoneDust, 6), new Object[] {
        	new ItemStack(ItemHandler.Resource, 1, 9), Item.lightStoneDust
        });
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.gunpowder, 3), new Object[] {
        	new ItemStack(ItemHandler.Resource, 1, 9), Item.gunpowder
        });
	}
}
