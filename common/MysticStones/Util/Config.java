package mysticstones.util;

import mysticstones.MysticStones;
import net.minecraftforge.common.config.Configuration;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Config {
	public static final String[] keys = { "anorthosite", "limestone", "marble", "migmatite", "orthogneiss", "slate", "travertine" };
	public static int[] rare = new int[keys.length];
	public static List<Integer> allowed = new ArrayList<Integer>();

	public static void initialize(File file) {
		Configuration config = new Configuration(file);
        MysticStones.ENABLE = config.get("General", "Enable", true).getBoolean(true);
		for (int i = 0; i < rare.length; i++) {
			rare[i] = config.get("Generation", "Rarity of " + keys[i], 3).getInt();
		}
		for (String id : config.get("Generation", "Allowed Dimension ID", "0,").getString().split(",")) {
			try {
				allowed.add(Integer.parseInt(id.trim()));
			} catch (NumberFormatException e) {
			}
		}
		config.save();
	}
}