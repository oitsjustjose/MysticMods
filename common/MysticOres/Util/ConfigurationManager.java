package mysticores.util;

import java.io.File;

import mysticores.blocks.BlockHandler;
import mysticores.lib.ItemID;
import mysticores.lib.Rarity;
import net.minecraftforge.common.Configuration;

public class ConfigurationManager {
	public static void initialize(File file) {
		Configuration config = new Configuration(file);
		ItemID.RESOURCES = config.getItem("Resource Items", ItemID.RESOURCES).getInt();
		ItemID.VERDITESWORD = config.getItem("Tools", "Verdite Sword", ItemID.VERDITESWORD).getInt();
		ItemID.VERDITEPICKAXE = config.getItem("Tools", "Verdite Pickaxe", ItemID.VERDITEPICKAXE).getInt();
		ItemID.VERDITESHOVEL = config.getItem("Tools", "Verdite Shovel", ItemID.VERDITESHOVEL).getInt();
		ItemID.VERDITEAXE = config.getItem("Tools", "Verdite Axe", ItemID.VERDITEAXE).getInt();
		ItemID.VERDITEHOE = config.getItem("Tools", "Verdite Hoe", ItemID.VERDITEHOE).getInt();
		ItemID.MITHRILSWORD = config.getItem("Tools", "Mithril Sword", ItemID.MITHRILSWORD).getInt();
		ItemID.MITHRILPICKAXE = config.getItem("Tools", "Mithril Pickaxe", ItemID.MITHRILPICKAXE).getInt();
		ItemID.MITHRILSHOVEL = config.getItem("Tools", "Mithril Shovel", ItemID.MITHRILSHOVEL).getInt();
		ItemID.MITHRILAXE = config.getItem("Tools", "Mithril Axe", ItemID.MITHRILAXE).getInt();
		ItemID.MITHRILHOE = config.getItem("Tools", "Mithril Hoe", ItemID.MITHRILHOE).getInt();
		ItemID.ADAMANTINESWORD = config.getItem("Tools", "Adamantine Sword", ItemID.ADAMANTINESWORD).getInt();
		ItemID.ADAMANTINEPICKAXE = config.getItem("Tools", "Adamantine Pickaxe", ItemID.ADAMANTINEPICKAXE).getInt();
		ItemID.ADAMANTINESHOVEL = config.getItem("Tools", "Adamantine Shovel", ItemID.ADAMANTINESHOVEL).getInt();
		ItemID.ADAMANTINEAXE = config.getItem("Tools", "Adamantine Axe", ItemID.ADAMANTINEAXE).getInt();
		ItemID.ADAMANTINEHOE = config.getItem("Tools", "Adamantine Hoe", ItemID.ADAMANTINEHOE).getInt();
		ItemID.IRIDIUMSWORD = config.getItem("Tools", "Iridium Sword", ItemID.IRIDIUMSWORD).getInt();
		ItemID.IRIDIUMPICKAXE = config.getItem("Tools", "Iridium Pickaxe", ItemID.IRIDIUMPICKAXE).getInt();
		ItemID.IRIDIUMSHOVEL = config.getItem("Tools", "Iridium Shovel", ItemID.IRIDIUMSHOVEL).getInt();
		ItemID.IRIDIUMAXE = config.getItem("Tools", "Iridium Axe", ItemID.IRIDIUMAXE).getInt();
		ItemID.IRIDIUMHOE = config.getItem("Tools", "Iridium Hoe", ItemID.IRIDIUMHOE).getInt();
		ItemID.BLOODSTONESWORD = config.getItem("Tools", "Bloodstone Sword", ItemID.BLOODSTONESWORD).getInt();
		ItemID.BLOODSTONEPICKAXE = config.getItem("Tools", "Bloodstone Pickaxe", ItemID.BLOODSTONEPICKAXE).getInt();
		ItemID.BLOODSTONESHOVEL = config.getItem("Tools", "Bloodstone Shovel", ItemID.BLOODSTONESHOVEL).getInt();
		ItemID.BLOODSTONEAXE = config.getItem("Tools", "Bloodstone Axe", ItemID.BLOODSTONEAXE).getInt();
		ItemID.BLOODSTONEHOE = config.getItem("Tools", "Bloodstone Hoe", ItemID.BLOODSTONEHOE).getInt();
		ItemID.OBSIDIANSWORD = config.getItem("Tools", "Obsidian Sword", ItemID.OBSIDIANSWORD).getInt();
		ItemID.OBSIDIANPICKAXE = config.getItem("Tools", "Obsidian Pickaxe", ItemID.OBSIDIANPICKAXE).getInt();
		ItemID.OBSIDIANSHOVEL = config.getItem("Tools", "Obsidian Shovel", ItemID.OBSIDIANSHOVEL).getInt();
		ItemID.OBSIDIANAXE = config.getItem("Tools", "Obsidian Axe", ItemID.OBSIDIANAXE).getInt();
		ItemID.OBSIDIANHOE = config.getItem("Tools", "Obsidian Hoe", ItemID.OBSIDIANHOE).getInt();
		ItemID.SATCHEL = config.getItem("Satchel ID", ItemID.SATCHEL).getInt();
		BlockHandler.BASEID = config.getBlock("Base Block ID", BlockHandler.BASEID).getInt();
		Rarity.VERDITE = config.get("Ore Rarity", "Verdite Ore", Rarity.VERDITE).getInt();
		Rarity.MITHRIL = config.get("Ore Rarity", "Mithril Ore", Rarity.MITHRIL).getInt();
		Rarity.ADAMANTINE = config.get("Ore Rarity", "Adamantine Ore", Rarity.ADAMANTINE).getInt();
		Rarity.IRIDIUM = config.get("Ore Rarity", "Iridium Ore", Rarity.IRIDIUM).getInt();
		Rarity.AGATE = config.get("Ore Rarity", "Agate Ore", Rarity.AGATE).getInt();
		Rarity.AMETHYST = config.get("Ore Rarity", "Amethyst Ore", Rarity.AMETHYST).getInt();
		Rarity.TOPAZ = config.get("Ore Rarity", "Topaz Ore", Rarity.TOPAZ).getInt();
		Rarity.BLOODSTONE = config.get("Nether Ore Rarity", "Bloodstone", Rarity.BLOODSTONE).getInt();
		Rarity.REDSOULSTONE = config.get("Nether Ore Rarity", "Red Soulstone", Rarity.REDSOULSTONE).getInt();
		Rarity.BLACKSOULSTONE = config.get("Nether Ore Rarity", "Black Soulstone", Rarity.BLACKSOULSTONE).getInt();
		Rarity.BLUESOULSTONE = config.get("Nether Ore Rarity", "Blue Soulstone", Rarity.BLUESOULSTONE).getInt();
		config.save();
	}
}