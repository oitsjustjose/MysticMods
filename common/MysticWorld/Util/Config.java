package mysticworld.util;

import mysticworld.MysticWorld;
import mysticworld.lib.Booleans;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class Config {
	public static void initialize(File file) {
        Configuration config = new Configuration(file);
        MysticWorld.instance.ENABLE = config.get("General", "Enable", true).getBoolean();
		//Boolean Configurations
        Booleans.ENABLE_IMBUED_STONE_GEN = config.get("World Generation", "Enable Imbued Stones Generation", true).getBoolean();
		Booleans.ENABLE_BUSH_GEN = config.get("World Generation", "Enable Bush Generation", true).getBoolean();
		Booleans.ENABLE_GLACIER_GEN = config.get("World Generation", "Enable Glacier Biome", true).getBoolean();
		Booleans.ENABLE_JUNGLE_REWRITE = config.get("World Generation", "Enable Vanilla Jungle Biome Modification", true).getBoolean();
		Booleans.ENABLE_MOUNTAIN_GEN = config.get("World Generation", "Enable Mountain Biome", true).getBoolean();
		Booleans.ENABLE_STEPPE_GEN = config.get("World Generation", "Enable Steppe Biome", true).getBoolean();
		Booleans.ENABLE_TUNDRA_GEN = config.get("World Generation", "Enable Tundra Biome", true).getBoolean();
		config.save();
	}
}