package mysticores.util;

import cpw.mods.fml.common.registry.GameRegistry;
import mysticores.MysticOres;
import mysticores.blocks.BlockHandler;
import mysticores.items.Items;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import java.util.HashMap;
import java.util.Map;

public class RecipeManager {
    private static HashMap<Object,ItemStack> agateConverted = new HashMap<Object, ItemStack>();
    static{
        agateConverted.put("stone",new ItemStack(net.minecraft.init.Items.slime_ball,8));
        agateConverted.put(new ItemStack(Blocks.sand),new ItemStack(Blocks.grass,8));
        agateConverted.put(new ItemStack(net.minecraft.init.Items.reeds),new ItemStack(net.minecraft.init.Items.wheat,16));
        agateConverted.put(new ItemStack(net.minecraft.init.Items.slime_ball),new ItemStack(Blocks.cactus,32));
        agateConverted.put("shardGlass",new ItemStack(net.minecraft.init.Items.flint,8));
        agateConverted.put("plankWood",new ItemStack(Blocks.bookshelf,8));
        agateConverted.put("stickWood",new ItemStack(net.minecraft.init.Items.leather,8));
        agateConverted.put(new ItemStack(Blocks.dirt),new ItemStack(BlockHandler.BlockBase, 8, 7));
        agateConverted.put(new ItemStack(net.minecraft.init.Items.egg),new ItemStack(net.minecraft.init.Items.wheat_seeds, 32));
        agateConverted.put(new ItemStack(Blocks.gravel),new ItemStack(Blocks.coal_ore,8));
        agateConverted.put(new ItemStack(net.minecraft.init.Items.wheat_seeds),new ItemStack(Blocks.deadbush, 8));
        agateConverted.put(new ItemStack(Blocks.glass),new ItemStack(Blocks.wool,8,0));
        agateConverted.put(new ItemStack(net.minecraft.init.Items.iron_ingot),new ItemStack(Items.Resource, 16, 0));
        agateConverted.put("oreGold",new ItemStack(BlockHandler.BlockBase, 16, 7));
        agateConverted.put("cobblestone",new ItemStack(Blocks.mossy_cobblestone, 8, 0));
        agateConverted.put("treeSapling",new ItemStack(net.minecraft.init.Items.wheat_seeds,16,0));
    }
    private static HashMap<Object,ItemStack> amethystConverted = new HashMap<Object, ItemStack>();
    static{
        amethystConverted.put(new ItemStack(net.minecraft.init.Items.egg), new ItemStack(net.minecraft.init.Items.cookie, 8));
        amethystConverted.put("plankWood", new ItemStack(Blocks.noteblock, 8));
        amethystConverted.put("shardObsidian", new ItemStack(Items.Resource, 8, 4));
        amethystConverted.put("stickWood", new ItemStack(Items.Resource, 8, 13));
        amethystConverted.put(new ItemStack(Blocks.dirt), new ItemStack(Blocks.iron_ore, 8));
        amethystConverted.put(new ItemStack(Blocks.brick_block), new ItemStack(Blocks.tnt, 8));
        amethystConverted.put("treeSapling", new ItemStack(Blocks.leaves, 16));
        amethystConverted.put("oreRedstone", new ItemStack(Blocks.diamond_ore, 4));
        amethystConverted.put(new ItemStack(net.minecraft.init.Items.slime_ball), new ItemStack(net.minecraft.init.Items.cake));
        amethystConverted.put(new ItemStack(Blocks.glass), new ItemStack(Blocks.lit_pumpkin, 8));
        amethystConverted.put("shardGlass", new ItemStack(Items.Resource, 8, 12));
        amethystConverted.put("stone", new ItemStack(Blocks.monster_egg, 8));
        amethystConverted.put(new ItemStack(Blocks.lapis_block), new ItemStack(net.minecraft.init.Items.diamond, 8));
        amethystConverted.put(new ItemStack(Blocks.sand), new ItemStack(Blocks.gold_ore, 16));
        amethystConverted.put(new ItemStack(net.minecraft.init.Items.reeds), new ItemStack(net.minecraft.init.Items.book, 8));
    }
    private static HashMap<Object, ItemStack> tourmalineConverted = new HashMap<Object, ItemStack>();
    static{
        tourmalineConverted.put(new ItemStack(Blocks.sand), new ItemStack(Blocks.glass, 16));
        tourmalineConverted.put("oreCoal", new ItemStack(Blocks.lapis_ore, 8));
        tourmalineConverted.put(new ItemStack(net.minecraft.init.Items.egg), new ItemStack(net.minecraft.init.Items.sugar, 16));
        tourmalineConverted.put(new ItemStack(net.minecraft.init.Items.wheat_seeds), new ItemStack(Blocks.brown_mushroom, 8));
        tourmalineConverted.put(new ItemStack(Blocks.glass), new ItemStack(Blocks.snow_layer, 8));
        tourmalineConverted.put("stone", new ItemStack(Blocks.glass, 8));
        tourmalineConverted.put(new ItemStack(Blocks.iron_block), new ItemStack(Blocks.lapis_block, 8));
        tourmalineConverted.put("plankWood", new ItemStack(Blocks.sandstone, 16));
        tourmalineConverted.put("stickWood", new ItemStack(net.minecraft.init.Items.string, 8));
        tourmalineConverted.put(new ItemStack(Blocks.snow), new ItemStack(Blocks.ice, 8));
        tourmalineConverted.put("treeSapling", new ItemStack(net.minecraft.init.Items.reeds, 8));
        tourmalineConverted.put(new ItemStack(Blocks.dirt), new ItemStack(Blocks.snow, 8));
        tourmalineConverted.put(new ItemStack(net.minecraft.init.Items.reeds), new ItemStack(net.minecraft.init.Items.snowball, 16));
        tourmalineConverted.put(new ItemStack(net.minecraft.init.Items.slime_ball), new ItemStack(net.minecraft.init.Items.clay_ball, 16));
    }
    private static HashMap<Object, ItemStack> topazeConverted = new HashMap<Object, ItemStack>();
    static{
        topazeConverted.put("stone", new ItemStack(Blocks.sandstone, 16));
        topazeConverted.put(new ItemStack(Blocks.iron_block), new ItemStack(Blocks.gold_block, 8));
        topazeConverted.put(new ItemStack(Blocks.sand), new ItemStack(Blocks.sponge, 8));
        topazeConverted.put("oreLapis", new ItemStack(Blocks.redstone_ore, 8));
        topazeConverted.put(new ItemStack(net.minecraft.init.Items.egg), new ItemStack(net.minecraft.init.Items.feather, 32));
        topazeConverted.put(new ItemStack(net.minecraft.init.Items.wheat), new ItemStack(Blocks.red_mushroom, 8));
        topazeConverted.put(new ItemStack(Blocks.glass), new ItemStack(Blocks.glowstone, 8));
        topazeConverted.put("shardObsidian", new ItemStack(Items.Resource, 16, 11));
        topazeConverted.put("cobblestone", new ItemStack(Blocks.netherrack, 16));
        topazeConverted.put("treeSapling", new ItemStack(Blocks.log, 16));
        topazeConverted.put(new ItemStack(Blocks.dirt), new ItemStack(Blocks.iron_ore, 8));
        topazeConverted.put(new ItemStack(net.minecraft.init.Items.reeds), new ItemStack(net.minecraft.init.Items.apple, 1));
        topazeConverted.put("shardGlass", new ItemStack(net.minecraft.init.Items.arrow, 32));
        topazeConverted.put("plankWood", new ItemStack(Blocks.wooden_door, 8));
        topazeConverted.put("stickWood", new ItemStack(net.minecraft.init.Items.bone, 8));
    }
	public static void initialize() {
		recipes();
		toolRecipes();
		powderRecipes();
		smelting();
	}

	private static void powderRecipes() {
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.gold_ore, 2), MysticOres.INGOTS[9], "oreGold"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.iron_ore, 2), MysticOres.INGOTS[9], "oreIron"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.Resource, 2, 10), MysticOres.INGOTS[9], MysticOres.INGOTS[10]));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(net.minecraft.init.Items.gunpowder, 2), MysticOres.INGOTS[9], net.minecraft.init.Items.gunpowder));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.Resource, 2, 4), MysticOres.INGOTS[9], MysticOres.INGOTS[4]));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.coal_ore, 2), MysticOres.INGOTS[9], "oreCoal"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.iron_ore, 3), MysticOres.INGOTS[9], "oreIron"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.gold_ore, 3), MysticOres.INGOTS[9], "oreGold"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.redstone_ore, 2), MysticOres.INGOTS[9], "oreRedstone"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.lapis_ore, 2), MysticOres.INGOTS[9], "oreLapis"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.diamond_ore, 2), MysticOres.INGOTS[9], "oreDiamond"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(net.minecraft.init.Items.sugar, 18), MysticOres.INGOTS[9], net.minecraft.init.Items.sugar));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(net.minecraft.init.Items.redstone, 12), MysticOres.INGOTS[9], net.minecraft.init.Items.redstone));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(net.minecraft.init.Items.glowstone_dust, 6), MysticOres.INGOTS[9], net.minecraft.init.Items.glowstone_dust));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(net.minecraft.init.Items.gunpowder, 3), MysticOres.INGOTS[9], net.minecraft.init.Items.gunpowder));
	}

	private static void recipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.glass, 1), "##", "##", '#', MysticOres.INGOTS[11]));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.obsidian, 1), "##", "##", '#', MysticOres.INGOTS[12]));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockHandler.BlockBase, 8, 7), "XXX", "XOX", "XXX", 'X', Blocks.dirt, 'O',
				MysticOres.INGOTS[6]));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockHandler.BlockBase, 16, 7), "XXX", "XOX", "XXX", 'X', MysticOres.ORES[3], 'O',
				MysticOres.INGOTS[6]));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockHandler.BlockBase, 8, 3), "XXX", "XOX", "XXX", 'X', Blocks.dirt, 'O',
				MysticOres.INGOTS[8]));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockHandler.BlockBase, 8, 12), "###", "#D#", "###", '#', MysticOres.INGOTS[11], 'D', MysticOres.INGOTS[12]));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockHandler.BlockBase, 1, 7), "##", "##", '#', MysticOres.INGOTS[10]));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BlockHandler.BlockBase, 2, 7), MysticOres.INGOTS[9], MysticOres.ORES[7]));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BlockHandler.BlockBase, 2, 3), MysticOres.INGOTS[9], MysticOres.ORES[3]));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BlockHandler.BlockBase, 2, 0), MysticOres.INGOTS[9], MysticOres.ORES[0]));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.Resource, 2, 13), "#", "#", '#', MysticOres.INGOTS[12]));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.Resource, 1, 3), "###", "#O#", "###", '#', MysticOres.INGOTS[4], 'O', MysticOres.INGOTS[2]));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.Resource, 4, 11), Blocks.glass);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.Resource, 4, 12), Blocks.obsidian);
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.Resource, 8, 9), MysticOres.INGOTS[5], MysticOres.INGOTS[7], MysticOres.INGOTS[8], MysticOres.INGOTS[6]));
        for(Map.Entry<Object,ItemStack> entry:agateConverted.entrySet()){
            GameRegistry.addRecipe(new ShapedOreRecipe(entry.getValue(), "###", "#o#", "###", 'o', "gemAgate", '#', entry.getKey()));
        }
        for(Map.Entry<Object,ItemStack> entry:amethystConverted.entrySet()){
            GameRegistry.addRecipe(new ShapedOreRecipe(entry.getValue(), "###", "#o#", "###", 'o', "gemAmethyst", '#', entry.getKey()));
        }
        for(Map.Entry<Object,ItemStack> entry:tourmalineConverted.entrySet()){
            GameRegistry.addRecipe(new ShapedOreRecipe(entry.getValue(), "###", "#o#", "###", 'o', "gemTourmaline", '#', entry.getKey()));
        }
        for(Map.Entry<Object,ItemStack> entry:topazeConverted.entrySet()){
            GameRegistry.addRecipe(new ShapedOreRecipe(entry.getValue(), "###", "#o#", "###", 'o', "gemTopaz", '#', entry.getKey()));
        }
	}

	private static void smelting() {
        smeltBlockIntoResource(6, 0, 0.4F);
        smeltBlockIntoResource(3, 1, 0.7F);
        smeltBlockIntoResource(0, 2, 0.9F);
        smeltBlockIntoResource(2, 4, 0.4F);
        smeltBlockIntoResource(4, 5, 0.4F);
        smeltBlockIntoResource(11, 6, 0.4F);
        smeltBlockIntoResource(5, 7, 0.4F);
        smeltBlockIntoResource(1, 8, 0.4F);
        smeltBlockIntoResource(7, 10, 0.4F);
	}

    private static void smeltBlockIntoResource(int metaInput, int metaOutput, float exp){
        FurnaceRecipes.smelting().func_151394_a(new ItemStack(BlockHandler.BlockBase,1, metaInput), new ItemStack(Items.Resource, 1, metaOutput), exp);
    }

	private static void toolRecipes() {
		ToolRecipes.sword(Items.VerditeSword, MysticOres.INGOTS[0]);
		ToolRecipes.pickaxe(Items.VerditePickaxe, MysticOres.INGOTS[0]);
		ToolRecipes.shovel(Items.VerditeShovel, MysticOres.INGOTS[0]);
		ToolRecipes.axe(Items.VerditeAxe, MysticOres.INGOTS[0]);
		ToolRecipes.hoe(Items.VerditeHoe, MysticOres.INGOTS[0]);
		ToolRecipes.sword(Items.MithrilSword, MysticOres.INGOTS[1]);
		ToolRecipes.pickaxe(Items.MithrilPickaxe, MysticOres.INGOTS[1]);
		ToolRecipes.shovel(Items.MithrilShovel, MysticOres.INGOTS[1]);
		ToolRecipes.axe(Items.MithrilAxe, MysticOres.INGOTS[1]);
		ToolRecipes.hoe(Items.MithrilHoe, MysticOres.INGOTS[1]);
		ToolRecipes.advancedSword(Items.AdamantineSword, MysticOres.INGOTS[2]);
		ToolRecipes.advancedPickaxe(Items.AdamantinePickaxe, MysticOres.INGOTS[2]);
		ToolRecipes.advancedShovel(Items.AdamantineShovel, MysticOres.INGOTS[2]);
		ToolRecipes.advancedAxe(Items.AdamantineAxe, MysticOres.INGOTS[2]);
		ToolRecipes.advancedHoe(Items.AdamantineHoe, MysticOres.INGOTS[2]);
		ToolRecipes.advancedSword(Items.IridiumSword, MysticOres.INGOTS[3]);
		ToolRecipes.advancedPickaxe(Items.IridiumPickaxe, MysticOres.INGOTS[3]);
		ToolRecipes.advancedShovel(Items.IridiumShovel, MysticOres.INGOTS[3]);
		ToolRecipes.advancedAxe(Items.IridiumAxe, MysticOres.INGOTS[3]);
		ToolRecipes.advancedHoe(Items.IridiumHoe, MysticOres.INGOTS[3]);
		ToolRecipes.advancedSword(Items.IridiumSword, MysticOres.INGOTS[3]);
		ToolRecipes.advancedPickaxe(Items.IridiumPickaxe, MysticOres.INGOTS[3]);
		ToolRecipes.advancedShovel(Items.IridiumShovel, MysticOres.INGOTS[3]);
		ToolRecipes.advancedAxe(Items.IridiumAxe, MysticOres.INGOTS[3]);
		ToolRecipes.advancedHoe(Items.IridiumHoe, MysticOres.INGOTS[3]);
		ToolRecipes.advancedSword(Items.ObsidianSword, new ItemStack(Blocks.obsidian));
		ToolRecipes.advancedPickaxe(Items.ObsidianPickaxe, new ItemStack(Blocks.obsidian));
		ToolRecipes.advancedShovel(Items.ObsidianShovel, new ItemStack(Blocks.obsidian));
		ToolRecipes.advancedAxe(Items.ObsidianAxe, new ItemStack(Blocks.obsidian));
		ToolRecipes.advancedHoe(Items.ObsidianHoe, new ItemStack(Blocks.obsidian));
		ToolRecipes.advancedSword(Items.BloodstoneSword, MysticOres.ORES[7]);
		ToolRecipes.advancedPickaxe(Items.BloodstonePickaxe, MysticOres.ORES[7]);
		ToolRecipes.advancedShovel(Items.BloodstoneShovel, MysticOres.ORES[7]);
		ToolRecipes.advancedAxe(Items.BloodstoneAxe, MysticOres.ORES[7]);
		ToolRecipes.advancedHoe(Items.BloodstoneHoe, MysticOres.ORES[7]);
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.Satchel, 1), "#$#", "$%$", "#$#", '#', net.minecraft.init.Items.string, '$', MysticOres.INGOTS[9], '%', Blocks.ender_chest));
	}
}
