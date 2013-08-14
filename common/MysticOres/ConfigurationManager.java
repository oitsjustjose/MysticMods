package MysticOres;

import java.io.File;

import net.minecraftforge.common.Configuration;
import MysticOres.Lib.BlockID;
import MysticOres.Lib.ItemID;
import MysticOres.Lib.Rarity;

public class ConfigurationManager
{
	public static Configuration config;
	
	public static void initialize(File file)
	{
		config = new Configuration(file);
		
		ItemID.RESOURCES = config.getItem("Resource Items", ItemID.RESOURCES_DEFAULT).getInt();
		ItemID.VERDITESWORD = config.getItem("Tools", "Verdite Sword", ItemID.VERDITESWORD_DEFAULT).getInt();
		ItemID.VERDITEPICKAXE = config.getItem("Tools", "Verdite Pickaxe", ItemID.VERDITEPICKAXE_DEFAULT).getInt();
		ItemID.VERDITESHOVEL = config.getItem("Tools", "Verdite Shovel", ItemID.VERDITESHOVEL_DEFAULT).getInt();
		ItemID.VERDITEAXE = config.getItem("Tools", "Verdite Axe", ItemID.VERDITEAXE_DEFAULT).getInt();
		ItemID.VERDITEHOE = config.getItem("Tools", "Verdite Hoe", ItemID.VERDITEHOE_DEFAULT).getInt();
		ItemID.MITHRILSWORD = config.getItem("Tools", "Mithril Sword", ItemID.MITHRILSWORD_DEFAULT).getInt();
		ItemID.MITHRILPICKAXE = config.getItem("Tools", "Mithril Pickaxe", ItemID.MITHRILPICKAXE_DEFAULT).getInt();
		ItemID.MITHRILSHOVEL = config.getItem("Tools", "Mithril Shovel", ItemID.MITHRILSHOVEL_DEFAULT).getInt();
		ItemID.MITHRILAXE = config.getItem("Tools", "Mithril Axe", ItemID.MITHRILAXE_DEFAULT).getInt();
		ItemID.MITHRILHOE = config.getItem("Tools", "Mithril Hoe", ItemID.MITHRILHOE_DEFAULT).getInt();
		ItemID.ADAMANTINESWORD = config.getItem("Tools", "Adamantine Sword", ItemID.ADAMANTINESWORD_DEFAULT).getInt();
		ItemID.ADAMANTINEPICKAXE = config.getItem("Tools", "Adamantine Pickaxe", ItemID.ADAMANTINEPICKAXE_DEFAULT).getInt();
		ItemID.ADAMANTINESHOVEL = config.getItem("Tools", "Adamantine Shovel", ItemID.ADAMANTINESHOVEL_DEFAULT).getInt();
		ItemID.ADAMANTINEAXE = config.getItem("Tools", "Adamantine Axe", ItemID.ADAMANTINEAXE_DEFAULT).getInt();
		ItemID.ADAMANTINEHOE = config.getItem("Tools", "Adamantine Hoe", ItemID.ADAMANTINEHOE_DEFAULT).getInt();
		ItemID.IRIDIUMSWORD = config.getItem("Tools", "Iridium Sword", ItemID.IRIDIUMSWORD_DEFAULT).getInt();
		ItemID.IRIDIUMPICKAXE = config.getItem("Tools", "Iridium Pickaxe", ItemID.IRIDIUMPICKAXE_DEFAULT).getInt();
		ItemID.IRIDIUMSHOVEL = config.getItem("Tools", "Iridium Shovel", ItemID.IRIDIUMSHOVEL_DEFAULT).getInt();
		ItemID.IRIDIUMAXE = config.getItem("Tools", "Iridium Axe", ItemID.IRIDIUMAXE_DEFAULT).getInt();
		ItemID.IRIDIUMHOE = config.getItem("Tools", "Iridium Hoe", ItemID.IRIDIUMHOE_DEFAULT).getInt();
		ItemID.BLOODSTONESWORD = config.getItem("Tools", "Bloodstone Sword", ItemID.BLOODSTONESWORD_DEFAULT).getInt();
		ItemID.BLOODSTONEPICKAXE = config.getItem("Tools", "Bloodstone Pickaxe", ItemID.BLOODSTONEPICKAXE_DEFAULT).getInt();
		ItemID.BLOODSTONESHOVEL = config.getItem("Tools", "Bloodstone Shovel", ItemID.BLOODSTONESHOVEL_DEFAULT).getInt();
		ItemID.BLOODSTONEAXE = config.getItem("Tools", "Bloodstone Axe", ItemID.BLOODSTONEAXE_DEFAULT).getInt();
		ItemID.BLOODSTONEHOE = config.getItem("Tools", "Bloodstone Hoe", ItemID.BLOODSTONEHOE_DEFAULT).getInt();
		ItemID.OBSIDIANSWORD = config.getItem("Tools", "Obsidian Sword", ItemID.OBSIDIANSWORD_DEFAULT).getInt();
		ItemID.OBSIDIANPICKAXE = config.getItem("Tools", "Obsidian Pickaxe", ItemID.OBSIDIANPICKAXE_DEFAULT).getInt();
		ItemID.OBSIDIANSHOVEL = config.getItem("Tools", "Obsidian Shovel", ItemID.OBSIDIANSHOVEL_DEFAULT).getInt();
		ItemID.OBSIDIANAXE = config.getItem("Tools", "Obsidian Axe", ItemID.OBSIDIANAXE_DEFAULT).getInt();
		ItemID.OBSIDIANHOE = config.getItem("Tools", "Obsidian Hoe", ItemID.OBSIDIANHOE_DEFAULT).getInt();
		ItemID.SATCHEL = config.getItem("Satchel ID", ItemID.SATCHEL_DEFAULT).getInt();
		
        BlockID.BASEID = config.getBlock("Base Block ID", BlockID.BASEID_DEFAULT).getInt();
        
        Rarity.VERDITE = config.get("Ore Rarity", "Verdite Ore", Rarity.VERDITE_DEFAULT).getInt();
        Rarity.MITHRIL = config.get("Ore Rarity", "Mithril Ore", Rarity.MITHRIL_DEFAULT).getInt();
        Rarity.ADAMANTINE = config.get("Ore Rarity", "Adamantine Ore", Rarity.ADAMANTINE_DEFAULT).getInt();
        Rarity.IRIDIUM = config.get("Ore Rarity", "Iridium Ore", Rarity.IRIDIUM_DEFAULT).getInt();
        Rarity.AGATE = config.get("Ore Rarity", "Agate Ore", Rarity.AGATE_DEFAULT).getInt();
        Rarity.AMETHYST = config.get("Ore Rarity", "Amethyst Ore", Rarity.AMETHYST_DEFAULT).getInt();
        Rarity.TOPAZ = config.get("Ore Rarity", "Topaz Ore", Rarity.TOPAZ_DEFAULT).getInt();
        Rarity.BLOODSTONE = config.get("Nether Ore Rarity", "Bloodstone", Rarity.BLOODSTONE_DEFAULT).getInt();
        Rarity.REDSOULSTONE = config.get("Nether Ore Rarity", "Red Soulstone", Rarity.REDSOULSTONE_DEFAULT).getInt();
        Rarity.BLACKSOULSTONE = config.get("Nether Ore Rarity", "Black Soulstone", Rarity.BLACKSOULSTONE_DEFAULT).getInt();
        Rarity.BLUESOULSTONE = config.get("Nether Ore Rarity", "Blue Soulstone", Rarity.BLUESOULSTONE_DEFAULT).getInt();
        
		config.save();
  }

  public static void save()
  {
	  config.save();
  }
}