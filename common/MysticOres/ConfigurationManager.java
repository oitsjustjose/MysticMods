package MysticOres;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class ConfigurationManager
{
	public static Configuration config;
	
	public static int AdamantineSwordID;
	public static int AdamantinePickaxeID;
	public static int AdamantineShovelID;
	public static int AdamantineAxeID;
	public static int AdamantineHoeID;
	
	public static int BloodstoneSwordID;
	public static int BloodstonePickaxeID;
	public static int BloodstoneShovelID;
	public static int BloodstoneAxeID;
	public static int BloodstoneHoeID;
	
	public static int IridiumSwordID;
	public static int IridiumPickaxeID;
	public static int IridiumShovelID;
	public static int IridiumAxeID;
	public static int IridiumHoeID;
	
	public static int MithrilSwordID;
	public static int MithrilPickaxeID;
	public static int MithrilShovelID;
	public static int MithrilAxeID;
	public static int MithrilHoeID;
	
	public static int ObsidianSwordID;
	public static int ObsidianPickaxeID;
	public static int ObsidianShovelID;
	public static int ObsidianAxeID;
	public static int ObsidianHoeID;
	
	public static int VerditeSwordID;
	public static int VerditePickaxeID;
	public static int VerditeShovelID;
	public static int VerditeAxeID;
	public static int VerditeHoeID;
	
	public static int ResourcesID;
	
	public static int SatchelID;
	
	public static int BlockBaseID;
	
	public static int AgateRarity;
	public static int AmethystRarity;
	public static int TopazRarity;
	public static int TourmalineRarity;
	
	public static int VerditeRarity;
	public static int MithrilRarity;
	public static int IridiumRarity;
	public static int AdamantineRarity;
		
	public static void initialize(File file)
	{
		config = new Configuration(file);
		
		AdamantineSwordID = config.getItem("Tool IDs", "Adamantine Sword ID", 15000).getInt();
        AdamantinePickaxeID = config.getItem("Tool IDs", "Adamantine Pickaxe ID", 15001).getInt();
        AdamantineShovelID = config.getItem("Tool IDs", "Adamantine Shovel ID", 15002).getInt();
        AdamantineAxeID = config.getItem("Tool IDs", "Adamantine Axe ID", 15003).getInt();
        AdamantineHoeID = config.getItem("Tool IDs", "Adamantine Hoe ID", 15004).getInt();
        BloodstoneSwordID = config.getItem("Tool IDs", "Bloodstone Sword ID", 15005).getInt();
        BloodstonePickaxeID = config.getItem("Tool IDs", "Bloodstone Pickaxe ID", 15006).getInt();
        BloodstoneShovelID = config.getItem("Tool IDs", "Bloodstone Shovel ID", 15007).getInt();
        BloodstoneAxeID = config.getItem("Tool IDs", "Bloodstone Axe ID", 15008).getInt();
        BloodstoneHoeID = config.getItem("Tool IDs", "Bloodstone Hoe ID", 15009).getInt();
        IridiumSwordID = config.getItem("Tool IDs", "Iridium Sword ID", 15010).getInt();
        IridiumPickaxeID = config.getItem("Tool IDs", "Iridium Pickaxe ID", 15011).getInt();
        IridiumShovelID = config.getItem("Tool IDs", "Iridium Shovel ID", 15012).getInt();
        IridiumAxeID = config.getItem("Tool IDs", "Iridium Axe ID", 15013).getInt();
        IridiumHoeID = config.getItem("Tool IDs", "Iridium Hoe ID", 15014).getInt();
        MithrilSwordID = config.getItem("Tool IDs", "Mithril Sword ID", 15015).getInt();
        MithrilPickaxeID = config.getItem("Tool IDs", "Mithril Pickaxe ID", 15016).getInt();
        MithrilShovelID = config.getItem("Tool IDs", "Mithril Shovel ID", 15017).getInt();
        MithrilAxeID = config.getItem("Tool IDs", "Mithril Axe ID", 15018).getInt();
        MithrilHoeID = config.getItem("Tool IDs", "Mithril Hoe ID", 15019).getInt();
        ObsidianSwordID = config.getItem("Tool IDs", "Obsidian Sword ID", 15020).getInt();
        ObsidianPickaxeID = config.getItem("Tool IDs", "Obsidian Pickaxe ID", 15021).getInt();
        ObsidianShovelID = config.getItem("Tool IDs", "Obsidian Shovel ID", 15022).getInt();
        ObsidianAxeID = config.getItem("Tool IDs", "Obsidian Axe ID", 15023).getInt();
        ObsidianHoeID = config.getItem("Tool IDs", "Obsidian Hoe ID", 15024).getInt();
        VerditeSwordID = config.getItem("Tool IDs", "Verdite Sword ID", 15025).getInt();
        VerditePickaxeID = config.getItem("Tool IDs", "Verdite Pickaxe ID", 15026).getInt();
        VerditeShovelID = config.getItem("Tool IDs", "Verdite Shovel ID", 15027).getInt();
        VerditeAxeID = config.getItem("Tool IDs", "Verdite Axe ID", 15028).getInt();
        VerditeHoeID = config.getItem("Tool IDs", "Verdite Hoe ID", 15029).getInt();
        SatchelID = config.getItem("Tool IDs", "Satchel ID", 15030).getInt();
        
        ResourcesID = config.getItem("Base Resource ID", 15031).getInt();
               
        BlockBaseID = config.getBlock("Base Block ID", 500).getInt();
        
        AgateRarity = config.get("Ore Rarity", "Rarity of Agate", 3).getInt();
        AmethystRarity = config.get("Ore Rarity", "Rarity of Amethyst", 3).getInt();
        TopazRarity = config.get("Ore Rarity", "Rarity of Topaz", 3).getInt();
        TourmalineRarity = config.get("Ore Rarity", "Rarity of Tourmaline", 3).getInt();        
        VerditeRarity = config.get("Ore Rarity", "Rarity of Verdite Ore", 10).getInt();
        MithrilRarity = config.get("Ore Rarity", "Rarity of Mithril Ore", 3).getInt();
        IridiumRarity = config.get("Ore Rarity", "Rarity of Iridium Ore", 2).getInt();
        AdamantineRarity = config.get("Ore Rarity", "Rarity of Adamantine Ore", 2).getInt();
 
		config.save();
  }

  public static void save()
  {
    config.save();
  }
}