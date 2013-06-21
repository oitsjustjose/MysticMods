package MysticOres;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class Config
{
	public static Configuration config;
	
	public static int AdamantineSwordID;
	public static int AdamantinePickaxeID;
	public static int AdamantineShovelID;
	public static int AdamantineAxeID;
	public static int AdamantineHoeID;
	public static int AdamantineIngotID;
	public static int BloodstoneSwordID;
	public static int BloodstonePickaxeID;
	public static int BloodstoneShovelID;
	public static int BloodstoneAxeID;
	public static int BloodstoneHoeID;
	public static int BloodstoneShardID;
	public static int TopazGemID;
	public static int TourmalineGemID;
	public static int AmethystGemID;
	public static int AgateGemID;
	public static int MysticPowderID;
	public static int IridiumSwordID;
	public static int IridiumPickaxeID;
	public static int IridiumShovelID;
	public static int IridiumAxeID;
	public static int IridiumHoeID;
	public static int IridiumIngotID;
	public static int IridiumNuggetID;
	public static int MithrilSwordID;
	public static int MithrilPickaxeID;
	public static int MithrilShovelID;
	public static int MithrilAxeID;
	public static int MithrilHoeID;
	public static int MithrilIngotID;
	public static int ObsidianSwordID;
	public static int ObsidianPickaxeID;
	public static int ObsidianShovelID;
	public static int ObsidianAxeID;
	public static int ObsidianHoeID;
	public static int ObsidianShardID;
	public static int ObsidianRodID;
	public static int VerditeSwordID;
	public static int VerditePickaxeID;
	public static int VerditeShovelID;
	public static int VerditeAxeID;
	public static int VerditeHoeID;
	public static int VerditeIngotID;
	public static int GlassShardID;
	public static int SatchelID;
	
	public static int AdamantineDustID;
	public static int MithrilDustID;
	public static int VerditeDustID;

	public static int ReinforcedGlassID;
	public static int BlockOresID;
	
	public static int AgateRarity;
	public static int AmethystRarity;
	public static int TopazRarity;
	public static int TourmalineRarity;
	
	
	public static int VerditeRarity;
	public static int MithrilRarity;
	public static int IridiumRarity;
	public static int AdamantineRarity;
	
	public static boolean DustsEnabled;
	
	public static void initialize(File file)
	{
		config = new Configuration(file);
		
		AdamantineSwordID = config.getItem("Adamantine Sword ID", 15000).getInt();
        AdamantinePickaxeID = config.getItem("Adamantine Pickaxe ID", 15001).getInt();
        AdamantineShovelID = config.getItem("Adamantine Shovel ID", 15002).getInt();
        AdamantineAxeID = config.getItem("Adamantine Axe ID", 15003).getInt();
        AdamantineHoeID = config.getItem("Adamantine Hoe ID", 15004).getInt();
        AdamantineIngotID = config.getItem("Adamantine Ingot ID", 15005).getInt();
        BloodstoneSwordID = config.getItem("Bloodstone Sword ID", 15006).getInt();
        BloodstonePickaxeID = config.getItem("Bloodstone Pickaxe ID", 15007).getInt();
        BloodstoneShovelID = config.getItem("Bloodstone Shovel ID", 15008).getInt();
        BloodstoneAxeID = config.getItem("Bloodstone Axe ID", 15009).getInt();
        BloodstoneHoeID = config.getItem("Bloodstone Hoe ID", 15010).getInt();
        BloodstoneShardID = config.getItem("Bloodstone Shard ID", 15011).getInt();
        TopazGemID = config.getItem("Topaz ID", 15012).getInt();
        TourmalineGemID = config.getItem("Tourmaline ID", 15013).getInt();
        AmethystGemID = config.getItem("Amethyst ID", 15014).getInt();
        MysticPowderID = config.getItem("Mystic Powder ID", 15015).getInt();
        IridiumSwordID = config.getItem("Iridium Sword ID", 15016).getInt();
        IridiumPickaxeID = config.getItem("Iridium Pickaxe ID", 15017).getInt();
        IridiumShovelID = config.getItem("Iridium Shovel ID", 15018).getInt();
        IridiumAxeID = config.getItem("Iridium Axe ID", 15019).getInt();
        IridiumHoeID = config.getItem("Iridium Hoe ID", 15020).getInt();
        IridiumIngotID = config.getItem("Iridium Ingot ID", 15021).getInt();
        IridiumNuggetID = config.getItem("Iridium Nugget ID", 15022).getInt();
        MithrilSwordID = config.getItem("Mithril Sword ID", 15023).getInt();
        MithrilPickaxeID = config.getItem("Mithril Pickaxe ID", 15024).getInt();
        MithrilShovelID = config.getItem("Mithril Shovel ID", 15025).getInt();
        MithrilAxeID = config.getItem("Mithril Axe ID", 15026).getInt();
        MithrilHoeID = config.getItem("Mithril Hoe ID", 15027).getInt();
        MithrilIngotID = config.getItem("Mithril Ingot ID", 15028).getInt();
        ObsidianSwordID = config.getItem("Obsidian Sword ID", 15029).getInt();
        ObsidianPickaxeID = config.getItem("Obsidian Pickaxe ID", 15030).getInt();
        ObsidianShovelID = config.getItem("Obsidian Shovel ID", 15031).getInt();
        ObsidianAxeID = config.getItem("Obsidian Axe ID", 15032).getInt();
        ObsidianHoeID = config.getItem("Obsidian Hoe ID", 15033).getInt();
        ObsidianShardID = config.getItem("Obsidian Shard ID", 15034).getInt();
        ObsidianRodID = config.getItem("Obsidian Rod ID", 15035).getInt();
        VerditeSwordID = config.getItem("Verdite Sword ID", 15036).getInt();
        VerditePickaxeID = config.getItem("Verdite Pickaxe ID", 15037).getInt();
        VerditeShovelID = config.getItem("Verdite Shovel ID", 15038).getInt();
        VerditeAxeID = config.getItem("Verdite Axe ID", 15039).getInt();
        VerditeHoeID = config.getItem("Verdite Hoe ID", 15040).getInt();
        VerditeIngotID = config.getItem("Verdite Ingot ID", 15041).getInt();
        GlassShardID = config.getItem("Glass Shard ID", 15042).getInt();
        AdamantineDustID = config.getItem("Adamantine Dust ID", 15043).getInt();
        MithrilDustID = config.getItem("Mithril Dust ID", 15044).getInt();
        VerditeDustID = config.getItem("Verdite Dust ID", 15045).getInt();
        AgateGemID = config.getItem("Agate ID", 15046).getInt();
        SatchelID = config.getItem("Satchel ID", 15047).getInt();
        
        DustsEnabled = config.get("General", "Enable Recipes for IC2/Thermal Expansion?", true).getBoolean(DustsEnabled);
        
        BlockOresID = config.getBlock("Ore IDs", 500).getInt();
        ReinforcedGlassID = config.getBlock("Reinforced Glass ID", 501).getInt();
        
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