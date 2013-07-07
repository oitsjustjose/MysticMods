package MysticStones;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LanguageManager
{
	public static void init()
	{
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.Stones, 1, 0), "Smooth Anorthosite");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.Stones, 1, 1), "Anorthosite");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.Stones, 1, 2), "Smooth Limestone");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.Stones, 1, 3), "Limestone");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.Stones, 1, 4), "Smooth Marble");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.Stones, 1, 5), "Marble");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.Stones, 1, 6), "Smooth Migmatite");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.Stones, 1, 7), "Migmatite");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.Stones, 1, 8), "Smooth Orthogneiss");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.Stones, 1, 9), "Orthogneiss");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.Stones, 1, 10), "Smooth Slate");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.Stones, 1, 11), "Slate");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.Stones, 1, 12), "Smooth Travertine");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.Stones, 1, 13), "Travertine");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.StoneBricks, 1, 0), "Anorthosite Bricks");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.StoneBricks, 1, 1), "Limestone Bricks");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.StoneBricks, 1, 2), "Marble Bricks");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.StoneBricks, 1, 3), "Migmatite Bricks");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.StoneBricks, 1, 4), "Orthogneiss Bricks");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.StoneBricks, 1, 5), "Slate Bricks");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.StoneBricks, 1, 6), "Travertine Bricks");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.Planks, 1, 0), "Purple Planks");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.Planks, 1, 1), "Green Planks");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.Planks, 1, 2), "Black Planks");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.Planks, 1, 3), "Orange Planks");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.Planks, 1, 4), "Red Planks");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.Planks, 1, 5), "Blue Planks");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.Planks, 1, 6), "Yellow Planks");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.ReinforcedBricks, 1, 0), "Reinforced Mithril Bricks");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.ReinforcedBricks, 1, 1), "Reinforced Verdite Bricks");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.ReinforcedBricks, 1, 2), "Reinforced Iridium Bricks");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.ReinforcedBricks, 1, 3), "Reinforced Adamantine Bricks");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.ReinforcedBricks, 1, 4), "Reinforced Tourmaline Bricks");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.ReinforcedBricks, 1, 5), "Reinforced Topaz Bricks");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.ReinforcedBricks, 1, 6), "Reinforced Amethyst Bricks");
		LanguageRegistry.instance().addName(new ItemStack(MysticStones.ReinforcedBricks, 1, 7), "Reinforced Agate Bricks");
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.MysticStonesTab", "en_US", "Mystic Stones!");
	}
}
