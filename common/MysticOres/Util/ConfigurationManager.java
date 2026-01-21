package mysticores.util;

import mysticores.MysticOres;
import mysticores.lib.Rarity;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationManager {
	public static void initialize(File file) {
		Configuration config = new Configuration(file);
        MysticOres.instance.ENABLE = config.get("General", "Enable", true).getBoolean();
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