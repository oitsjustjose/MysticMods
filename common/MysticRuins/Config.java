package mysticruins;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.minecraftforge.common.Configuration;

public class Config {
	public static Configuration config;
	public static int RuinRarity;
	public static int DunRarity;
	public static List<Integer> ruinAllowId = new ArrayList();
	public static List<Integer> dungeonAllowId = new ArrayList();

	public static void initialize(File file) {
		config = new Configuration(file);
		config.load();
		RuinRarity = config.get("General", "Ruin Rarity", 2).getInt();
		DunRarity = config.get("General", "Mystic Dungeon Rarity", 1).getInt();
		String[] ID = config.get("General", "Ruin allowed dimension id", "0,").getString().split(",");
		for (String txt : ID) {
			try {
				ruinAllowId.add(Integer.parseInt(txt.trim()));
			} catch (NumberFormatException e) {
			}
		}
		ID = config.get("General", "Dungeon allowed dimension id", "0,").getString().split(",");
		for (String txt : ID) {
			try {
				dungeonAllowId.add(Integer.parseInt(txt.trim()));
			} catch (NumberFormatException e) {
			}
		}
		config.save();
	}
}