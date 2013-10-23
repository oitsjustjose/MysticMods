package mysticstones.util;

import java.util.List;
import java.io.File;
import java.util.ArrayList;

import net.minecraftforge.common.Configuration;

public class Config {
	public static int PlanksID;
	public static int StonesID;
	public static int StoneBricksID;
	public static int ReinforcedBricksID;
	public static int Rare;
	public static List<Integer> allowed = new ArrayList();

	public static void initialize(File file) {
		Configuration config = new Configuration(file);
		config.load();
		PlanksID = config.getBlock("Plank IDs", 509).getInt();
		StonesID = config.getBlock("Stone IDs", 510).getInt();
		StoneBricksID = config.getBlock("Stone Brick IDs", 511).getInt();
		ReinforcedBricksID = config.getBlock("Reinforced Brick IDs", 512).getInt();
		Rare = config.get("Generation", "Rarity of Stones", 3).getInt();
		for (String id : config.get("Generation", "Allowed Dimension ID", "0,").getString().split(",")) {
			try {
				allowed.add(Integer.parseInt(id.trim()));
			} catch (NumberFormatException e) {
			}
		}
		config.save();
	}
}