package MysticOres;

import MysticOres.Blocks.BlockHandler;
import MysticOres.Items.ItemHandler;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LanguageManager
{
	public static void init()
	{				
		LanguageRegistry.instance().addName(new ItemStack(BlockHandler.BlockBase, 1, 0), "Adamantine");
		LanguageRegistry.instance().addName(new ItemStack(BlockHandler.BlockBase, 1, 1), "Amethyst Ore");
		LanguageRegistry.instance().addName(new ItemStack(BlockHandler.BlockBase, 1, 2), "Iridium Ore");
		LanguageRegistry.instance().addName(new ItemStack(BlockHandler.BlockBase, 1, 3), "Mithril Ore");
		LanguageRegistry.instance().addName(new ItemStack(BlockHandler.BlockBase, 1, 4), "Tourmaline Ore");
		LanguageRegistry.instance().addName(new ItemStack(BlockHandler.BlockBase, 1, 5), "Topaz Ore");
		LanguageRegistry.instance().addName(new ItemStack(BlockHandler.BlockBase, 1, 6), "Verdite Ore");
		LanguageRegistry.instance().addName(new ItemStack(BlockHandler.BlockBase, 1, 7), "Bloodstone");
		LanguageRegistry.instance().addName(new ItemStack(BlockHandler.BlockBase, 1, 8), "Black Soulstone");
		LanguageRegistry.instance().addName(new ItemStack(BlockHandler.BlockBase, 1, 9), "Blue Soulstone");
		LanguageRegistry.instance().addName(new ItemStack(BlockHandler.BlockBase, 1, 10), "Red Soulstone");
		LanguageRegistry.instance().addName(new ItemStack(BlockHandler.BlockBase, 1, 11), "Agate Ore");
		LanguageRegistry.instance().addName(new ItemStack(BlockHandler.BlockBase, 1, 12), "Reinforced Glass");

		
		LanguageRegistry.instance().addName(new ItemStack(ItemHandler.Resource, 1, 0), "Verdite Ingot");
		LanguageRegistry.instance().addName(new ItemStack(ItemHandler.Resource, 1, 1), "Mithril Ingot");
		LanguageRegistry.instance().addName(new ItemStack(ItemHandler.Resource, 1, 2), "Adamantine Ingot");
		LanguageRegistry.instance().addName(new ItemStack(ItemHandler.Resource, 1, 3), "Iridium Ingot");
		LanguageRegistry.instance().addName(new ItemStack(ItemHandler.Resource, 1, 4), "Iridium Nugget");
		LanguageRegistry.instance().addName(new ItemStack(ItemHandler.Resource, 1, 5), "Tourmaline Gemstone");
		LanguageRegistry.instance().addName(new ItemStack(ItemHandler.Resource, 1, 6), "Agate Gemstone");
		LanguageRegistry.instance().addName(new ItemStack(ItemHandler.Resource, 1, 7), "Topaz Gemstone");
		LanguageRegistry.instance().addName(new ItemStack(ItemHandler.Resource, 1, 8), "Amethyst Gemstone");
		LanguageRegistry.instance().addName(new ItemStack(ItemHandler.Resource, 1, 9), "Mystic Powder");
		LanguageRegistry.instance().addName(new ItemStack(ItemHandler.Resource, 1, 10), "Bloodstone Shard");
		LanguageRegistry.instance().addName(new ItemStack(ItemHandler.Resource, 1, 11), "Glass Shard");
		LanguageRegistry.instance().addName(new ItemStack(ItemHandler.Resource, 1, 12), "Obsidian Shard");
		LanguageRegistry.instance().addName(new ItemStack(ItemHandler.Resource, 1, 13), "Obsidian Rod");
		
		LanguageRegistry.instance().addName(ItemHandler.AdamantineSword, "Adamantine Sword");
		LanguageRegistry.instance().addName(ItemHandler.MithrilSword, "Mithril Sword");
		LanguageRegistry.instance().addName(ItemHandler.VerditeSword, "Verdite Sword");
		LanguageRegistry.instance().addName(ItemHandler.IridiumSword, "Iridium Sword");
		LanguageRegistry.instance().addName(ItemHandler.ObsidianSword, "Obsidian Sword");
		LanguageRegistry.instance().addName(ItemHandler.BloodstoneSword, "Bloodstone Sword");
		LanguageRegistry.instance().addName(ItemHandler.AdamantinePickaxe, "Adamantine Pickaxe");
		LanguageRegistry.instance().addName(ItemHandler.MithrilPickaxe, "Mithril Pickaxe");
		LanguageRegistry.instance().addName(ItemHandler.VerditePickaxe, "Verdite Pickaxe");
		LanguageRegistry.instance().addName(ItemHandler.IridiumPickaxe, "Iridium Pickaxe");
		LanguageRegistry.instance().addName(ItemHandler.ObsidianPickaxe, "Obsidian Pickaxe");
		LanguageRegistry.instance().addName(ItemHandler.BloodstonePickaxe, "Bloodstone Pickaxe");
		LanguageRegistry.instance().addName(ItemHandler.AdamantineShovel, "Adamantine Shovel");
		LanguageRegistry.instance().addName(ItemHandler.MithrilShovel, "Mithril Shovel");
		LanguageRegistry.instance().addName(ItemHandler.VerditeShovel, "Verdite Shovel");
		LanguageRegistry.instance().addName(ItemHandler.IridiumShovel, "Iridium Shovel");
		LanguageRegistry.instance().addName(ItemHandler.ObsidianShovel, "Obsidian Shovel");
		LanguageRegistry.instance().addName(ItemHandler.BloodstoneShovel, "Bloodstone Shovel");
		LanguageRegistry.instance().addName(ItemHandler.AdamantineAxe, "Adamantine Axe");
		LanguageRegistry.instance().addName(ItemHandler.MithrilAxe, "Mithril Axe");
		LanguageRegistry.instance().addName(ItemHandler.VerditeAxe, "Verdite Axe");
		LanguageRegistry.instance().addName(ItemHandler.IridiumAxe, "Iridium Axe");
		LanguageRegistry.instance().addName(ItemHandler.ObsidianAxe, "Obsidian Axe");
		LanguageRegistry.instance().addName(ItemHandler.BloodstoneAxe, "Bloodstone Axe");
		LanguageRegistry.instance().addName(ItemHandler.AdamantineHoe, "Adamantine Hoe");
		LanguageRegistry.instance().addName(ItemHandler.MithrilHoe, "Mithril Hoe");
		LanguageRegistry.instance().addName(ItemHandler.VerditeHoe, "Verdite Hoe");
		LanguageRegistry.instance().addName(ItemHandler.IridiumHoe, "Iridium Hoe");
		LanguageRegistry.instance().addName(ItemHandler.Satchel, "Magical Bag");
		LanguageRegistry.instance().addName(ItemHandler.BloodstoneHoe, "Bloodstone Hoe");
		LanguageRegistry.instance().addName(ItemHandler.ObsidianHoe, "Obsidian Hoe");
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.MysticOresTab", "en_US", "Mystic Ores!");                                                         
	}
}
