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

public class RecipeHandler
{	
	public static void init(){
		recipes();
		blockRecipes();
		blockSmelting();
		itemRecipes();
		itemSmelting();
		mysticGemRecipes();
		mysticPowderRecipes();
	}
	
	private static void recipes()
	{
		GameRegistry.addRecipe(new ItemStack(Block.glass, 1), new Object [] {
			"##", "##", '#', ItemHandler.GlassShard
		});
		
		GameRegistry.addRecipe(new ItemStack(Block.obsidian, 1), new Object[] {
			"##", "##", '#', ItemHandler.ObsidianShard
		});
	}
	
	private static void blockRecipes(){
        GameRegistry.addRecipe(new ItemStack(BlockHandler.BlockOres, 8, 7), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.dirt, Character.valueOf('O'), ItemHandler.AgateGem
        });
        
        GameRegistry.addRecipe(new ItemStack(BlockHandler.BlockOres, 16, 7), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), new ItemStack(BlockHandler.BlockOres, 1, 3), Character.valueOf('O'), ItemHandler.AgateGem
        });
        
        GameRegistry.addRecipe(new ItemStack(BlockHandler.BlockOres, 8, 3), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.dirt, Character.valueOf('O'), ItemHandler.AmethystGem
        });
        
		GameRegistry.addRecipe(new ItemStack(BlockHandler.ReinforcedGlass, 8), new Object[] {
			"###", "#D#", "###", '#', ItemHandler.GlassShard, 'D', ItemHandler.ObsidianShard
		});
		
		GameRegistry.addRecipe(new ItemStack(BlockHandler.BlockOres, 1, 7), new Object[] {
			"##", "##", '#', ItemHandler.BloodstoneShard
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.BlockOres, 2, 7), new Object[] {
			ItemHandler.MysticPowder, new ItemStack(BlockHandler.BlockOres, 1, 7)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.BlockOres, 2, 3), new Object[] {
			ItemHandler.MysticPowder, new ItemStack(BlockHandler.BlockOres, 1, 3)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.BlockOres, 2, 0), new Object[] {
			ItemHandler.MysticPowder, new ItemStack(BlockHandler.BlockOres, 1, 0)
		});
	}
	
	private static void blockSmelting(){
		FurnaceRecipes.smelting().addSmelting(BlockHandler.BlockOres.blockID, 0, new ItemStack(ItemHandler.AdamantineIngot), 0.9F);
		FurnaceRecipes.smelting().addSmelting(BlockHandler.BlockOres.blockID, 3, new ItemStack(ItemHandler.MithrilIngot), 0.7F);
		FurnaceRecipes.smelting().addSmelting(BlockHandler.BlockOres.blockID, 6, new ItemStack(ItemHandler.VerditeIngot), 0.4F);
	}
	
	private static void itemRecipes(){        
    	GameRegistry.addRecipe(new ItemStack(ItemHandler.ObsidianRod, 2), new Object[] {
			"#", "#", '#', ItemHandler.ObsidianShard
		});
    	
		GameRegistry.addRecipe(new ItemStack(ItemHandler.IridiumIngot, 1), new Object[] {
			"###", "#O#", "###", '#', ItemHandler.IridiumNugget, 'O', ItemHandler.AdamantineIngot
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.GlassShard, 4), new Object[] {
			Block.glass
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.ObsidianShard, 4), new Object[] {
			Block.obsidian
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.MysticPowder, 8), new Object[] {
			ItemHandler.TourmalineGem, ItemHandler.TopazGem, ItemHandler.AmethystGem, ItemHandler.AgateGem
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.BloodstoneShard, 2), new Object[] {
			new ItemStack(BlockHandler.BlockOres, 1, 7)
		});		
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.VerditePickaxe, 1), new Object[] {
			"###", " S ", " S ", '#', ItemHandler.VerditeIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.VerditeSword, 1), new Object[] {
			"#", "#", "S", '#', ItemHandler.VerditeIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.VerditeShovel, 1), new Object[] {
			"#", "S", "S", '#', ItemHandler.VerditeIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.VerditeAxe, 1), new Object[] {
			"## ", "#S ", " S ", '#', ItemHandler.VerditeIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.VerditeAxe, 1), new Object[] {
			"## ", "S# ", "S  ", '#', ItemHandler.VerditeIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.VerditeHoe, 1), new Object[] {
			"## ", " S ", " S ", '#', ItemHandler.VerditeIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.VerditeHoe, 1), new Object[] {
			"## ", "S  ", "S  ", '#', ItemHandler.VerditeIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.MithrilPickaxe, 1), new Object[] {
			"###", " S ", " S ", '#', ItemHandler.MithrilIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.MithrilSword, 1), new Object[] {
			"#", "#", "S", '#', ItemHandler.MithrilIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.MithrilShovel, 1), new Object[] {
			"#", "S", "S", '#', ItemHandler.MithrilIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.MithrilAxe, 1), new Object[] {
			"## ", "#S ", " S ", '#', ItemHandler.MithrilIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.MithrilAxe, 1), new Object[] {
			"## ", "S# ", "S  ", '#', ItemHandler.MithrilIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.MithrilHoe, 1), new Object[] {
			"## ", " S ", " S ", '#', ItemHandler.MithrilIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.MithrilHoe, 1), new Object[] {
			"## ", "S  ", "S  ", '#', ItemHandler.MithrilIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.AdamantinePickaxe, 1), new Object[] {
			"###", " S ", " S ", '#', ItemHandler.AdamantineIngot, 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.AdamantineSword, 1), new Object[] {
			"#", "#", "S", '#', ItemHandler.AdamantineIngot, 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.AdamantineShovel, 1), new Object[] {
			"#", "S", "S", '#', ItemHandler.AdamantineIngot, 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.AdamantineAxe, 1), new Object[] {
			"## ", "#S ", " S ", '#', ItemHandler.AdamantineIngot, 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.AdamantineAxe, 1), new Object[] {
			"## ", "S# ", "S  ", '#', ItemHandler.AdamantineIngot, 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.AdamantineHoe, 1), new Object[] {
			"## ", " S ", " S ", '#', ItemHandler.AdamantineIngot, 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.AdamantineHoe, 1), new Object[] {
			"## ", "S  ", "S  ", '#', ItemHandler.AdamantineIngot, 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.IridiumPickaxe, 1), new Object[] {
			"###", " S ", " S ", '#', ItemHandler.IridiumIngot, 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.IridiumSword, 1), new Object[] {
			"#", "#", "S", '#', ItemHandler.IridiumIngot, 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.IridiumShovel, 1), new Object[] {
			"#", "S", "S", '#', ItemHandler.IridiumIngot, 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.IridiumAxe, 1), new Object[] {
			"## ", "#S ", " S ", '#', ItemHandler.IridiumIngot, 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.IridiumAxe, 1), new Object[] {
			"## ", "S# ", "S  ", '#', ItemHandler.IridiumIngot, 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.IridiumHoe, 1), new Object[] {
			"## ", " S ", " S ", '#', ItemHandler.IridiumIngot, 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.IridiumHoe, 1), new Object[] {
			"## ", "S  ", "S  ", '#', ItemHandler.IridiumIngot, 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.ObsidianPickaxe, 1), new Object[] {
			"###", " S ", " S ", '#', Block.obsidian, 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.ObsidianSword, 1), new Object[] {
			"#", "#", "S", '#', Block.obsidian, 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.ObsidianShovel, 1), new Object[] {
			"#", "S", "S", '#', Block.obsidian, 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.ObsidianAxe, 1), new Object[] {
			"## ", "#S ", " S ", '#', Block.obsidian, 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.ObsidianAxe, 1), new Object[] {
			"## ", "S# ", "S  ", '#', Block.obsidian, 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.ObsidianHoe, 1), new Object[] {
			"## ", " S ", " S ", '#', Block.obsidian, 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.ObsidianHoe, 1), new Object[] {
			"## ", "S  ", "S  ", '#', Block.obsidian, 'S', ItemHandler.ObsidianRod
		});		
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.BloodstonePickaxe, 1), new Object[] {
			"###", " S ", " S ", '#', new ItemStack(BlockHandler.BlockOres, 1, 7), 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.BloodstoneSword, 1), new Object[] {
			"#", "#", "S", '#', new ItemStack(BlockHandler.BlockOres, 1, 7), 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.BloodstoneShovel, 1), new Object[] {
			"#", "S", "S", '#', new ItemStack(BlockHandler.BlockOres, 1, 7), 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.BloodstoneAxe, 1), new Object[] {
			"## ", "#S ", " S ", '#', new ItemStack(BlockHandler.BlockOres, 1, 7), 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.BloodstoneAxe, 1), new Object[] {
			"## ", "S# ", "S  ", '#', new ItemStack(BlockHandler.BlockOres, 1, 7), 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.BloodstoneHoe, 1), new Object[] {
			"## ", " S ", " S ", '#', new ItemStack(BlockHandler.BlockOres, 1, 7), 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.BloodstoneHoe, 1), new Object[] {
			"## ", "S  ", "S  ", '#', new ItemStack(BlockHandler.BlockOres, 1, 7), 'S', ItemHandler.ObsidianRod
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemHandler.Satchel, 1), new Object[] {
			"#$#", "$%$", "#$#", '#', Item.silk, '$', ItemHandler.MysticPowder, '%', Block.enderChest
		});
	}
	
	private static void itemSmelting(){
		GameRegistry.addSmelting(ItemHandler.AdamantineDust.itemID, new ItemStack(ItemHandler.AdamantineIngot), 0.0F);
		GameRegistry.addSmelting(ItemHandler.MithrilDust.itemID, new ItemStack(ItemHandler.MithrilIngot), 0.0F);
		GameRegistry.addSmelting(ItemHandler.VerditeDust.itemID, new ItemStack(ItemHandler.VerditeIngot), 0.0F);
	}
	
	private static void mysticGemRecipes()
	{
        GameRegistry.addRecipe(new ItemStack(Item.slimeBall, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.stone, Character.valueOf('O'), ItemHandler.AgateGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.cobblestoneMossy, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.cobblestone, Character.valueOf('O'), ItemHandler.AgateGem
        });

        GameRegistry.addRecipe(new ItemStack(BlockGrass.grass, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.sand, Character.valueOf('O'), ItemHandler.AgateGem
        });

        GameRegistry.addRecipe(new ItemStack(Item.seeds, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.sapling, Character.valueOf('O'), ItemHandler.AgateGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.wheat, 16), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.reed, Character.valueOf('O'), ItemHandler.AgateGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.seeds, 32), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.egg, Character.valueOf('O'), ItemHandler.AgateGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.cactus, 32), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.slimeBall, Character.valueOf('O'), ItemHandler.AgateGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.oreCoal, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.gravel, Character.valueOf('O'), ItemHandler.AgateGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.flint, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), ItemHandler.GlassShard, Character.valueOf('O'), ItemHandler.AgateGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.tallGrass, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.seeds, Character.valueOf('O'), ItemHandler.AgateGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.bookShelf, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.planks, Character.valueOf('O'), ItemHandler.AgateGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.cloth, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.glass, Character.valueOf('O'), ItemHandler.AgateGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.leather, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.stick, Character.valueOf('O'), ItemHandler.AgateGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.glass, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.stone, Character.valueOf('O'), ItemHandler.TourmalineGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.ice, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.blockSnow, Character.valueOf('O'), ItemHandler.TourmalineGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.blockLapis, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.blockIron, Character.valueOf('O'), ItemHandler.TourmalineGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.reed, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.sapling, Character.valueOf('O'), ItemHandler.TourmalineGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.glass, 16), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.sand, Character.valueOf('O'), ItemHandler.TourmalineGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.blockSnow, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.dirt, Character.valueOf('O'), ItemHandler.TourmalineGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.oreLapis, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.oreCoal, Character.valueOf('O'), ItemHandler.TourmalineGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.snowball, 16), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.reed, Character.valueOf('O'), ItemHandler.TourmalineGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.sugar, 16), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.egg, Character.valueOf('O'), ItemHandler.TourmalineGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.clay, 16), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.slimeBall, Character.valueOf('O'), ItemHandler.TourmalineGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.mushroomBrown, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.seeds, Character.valueOf('O'), ItemHandler.TourmalineGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.sandStone, 16), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.planks, Character.valueOf('O'), ItemHandler.TourmalineGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.snow, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.glass, Character.valueOf('O'), ItemHandler.TourmalineGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.silk, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.stick, Character.valueOf('O'), ItemHandler.TourmalineGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.sandStone, 16), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.stone, Character.valueOf('O'), ItemHandler.TopazGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.netherrack, 16), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.cobblestone, Character.valueOf('O'), ItemHandler.TopazGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.blockGold, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.blockIron, Character.valueOf('O'), ItemHandler.TopazGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.wood, 16), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.sapling, Character.valueOf('O'), ItemHandler.TopazGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.sponge, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.sand, Character.valueOf('O'), ItemHandler.TopazGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.oreIron, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.dirt, Character.valueOf('O'), ItemHandler.TopazGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.oreRedstone, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.oreLapis, Character.valueOf('O'), ItemHandler.TopazGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.appleRed, 1), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.reed, Character.valueOf('O'), ItemHandler.TopazGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.feather, 32), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.egg, Character.valueOf('O'), ItemHandler.TopazGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.arrow, 32), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), ItemHandler.GlassShard, Character.valueOf('O'), ItemHandler.TopazGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.mushroomRed, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.seeds, Character.valueOf('O'), ItemHandler.TopazGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.doorWood, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.planks, Character.valueOf('O'), ItemHandler.TopazGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.glowStone, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.glass, Character.valueOf('O'), ItemHandler.TopazGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.bone, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.stick, Character.valueOf('O'), ItemHandler.TopazGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.blockClay, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.stone, Character.valueOf('O'), ItemHandler.AmethystGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.tnt, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.brick, Character.valueOf('O'), ItemHandler.AmethystGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.diamond, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.blockLapis, Character.valueOf('O'), ItemHandler.AmethystGem
        });
        
        GameRegistry.addRecipe(new ItemStack(BlockLeaves.leaves, 16), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.sapling, Character.valueOf('O'), ItemHandler.AmethystGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.oreGold, 16), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.sand, Character.valueOf('O'), ItemHandler.AmethystGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.oreDiamond, 4), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.oreRedstone, Character.valueOf('O'), ItemHandler.AmethystGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.book, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.reed, Character.valueOf('O'), ItemHandler.AmethystGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.cookie, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.egg, Character.valueOf('O'), ItemHandler.AmethystGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Item.cake, 1), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.slimeBall, Character.valueOf('O'), ItemHandler.AmethystGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.music, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.planks, Character.valueOf('O'), ItemHandler.AmethystGem
        });
        
        GameRegistry.addRecipe(new ItemStack(Block.pumpkinLantern, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Block.glass, Character.valueOf('O'), ItemHandler.AmethystGem
        });
        
        GameRegistry.addRecipe(new ItemStack(ItemHandler.VerditeIngot, 16), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.ingotIron, Character.valueOf('O'), ItemHandler.AgateGem
        });
        
        GameRegistry.addRecipe(new ItemStack(ItemHandler.BloodstoneShard, 16), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), ItemHandler.ObsidianShard, Character.valueOf('O'), ItemHandler.TopazGem
        });
        
        GameRegistry.addRecipe(new ItemStack(ItemHandler.IridiumNugget, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), ItemHandler.ObsidianShard, Character.valueOf('O'), ItemHandler.AmethystGem
        });
        
        GameRegistry.addRecipe(new ItemStack(ItemHandler.ObsidianShard, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), ItemHandler.GlassShard, Character.valueOf('O'), ItemHandler.AmethystGem
        });
        
        GameRegistry.addRecipe(new ItemStack(ItemHandler.ObsidianRod, 8), new Object[] {
            "XXX", "XOX", "XXX", Character.valueOf('X'), Item.stick, Character.valueOf('O'), ItemHandler.AmethystGem
        });
	}
	
	private static void mysticPowderRecipes(){
		GameRegistry.addShapelessRecipe(new ItemStack(Block.oreGold, 2), new Object[] {
			ItemHandler.MysticPowder, Block.oreGold
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Block.oreIron, 2), new Object[] {
			ItemHandler.MysticPowder, Block.oreIron
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.BloodstoneShard, 2), new Object[] {
			ItemHandler.MysticPowder, ItemHandler.BloodstoneShard
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Item.gunpowder, 2), new Object[] {
			ItemHandler.MysticPowder, Item.gunpowder
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.IridiumNugget, 2), new Object[] {
			ItemHandler.MysticPowder, ItemHandler.IridiumNugget
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Block.oreCoal, 2), new Object[] {
			ItemHandler.MysticPowder, Block.oreCoal
        });
		
        GameRegistry.addShapelessRecipe(new ItemStack(Block.oreIron, 3), new Object[] {
        	ItemHandler.MysticPowder, Block.oreIron
        });
        
        GameRegistry.addShapelessRecipe(new ItemStack(Block.oreGold, 3), new Object[] {
        	ItemHandler.MysticPowder, Block.oreGold
        });
        
        GameRegistry.addShapelessRecipe(new ItemStack(Block.oreRedstone, 2), new Object[] {
        	ItemHandler.MysticPowder, Block.oreRedstone
        });
        
        GameRegistry.addShapelessRecipe(new ItemStack(Block.oreLapis, 2), new Object[] {
        	ItemHandler.MysticPowder, Block.oreLapis
        });
        
        GameRegistry.addShapelessRecipe(new ItemStack(Block.oreDiamond, 2), new Object[] {
        	ItemHandler.MysticPowder, Block.oreDiamond
        });
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.sugar, 18), new Object[] {
        	ItemHandler.MysticPowder, Item.sugar
        });
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.redstone, 12), new Object[] {
        	ItemHandler.MysticPowder, Item.redstone
        });
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.lightStoneDust, 6), new Object[] {
        	ItemHandler.MysticPowder, Item.lightStoneDust
        });
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.gunpowder, 3), new Object[] {
        	ItemHandler.MysticPowder, Item.gunpowder
        });
	}
}
