package MysticStones.Util;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class Config
{
	public static Configuration config;
	
	public static int PlanksID;
	public static int StonesID;
	public static int StoneBricksID;
	public static int ReinforcedBricksID;
	
	public static boolean Rare;
	
	public static void initialize(File file)
	{
		config = new Configuration(file);
		
		PlanksID = config.getBlock("Plank IDs", 509).getInt();
        StonesID = config.getBlock("Stone IDs", 510).getInt();
        StoneBricksID = config.getBlock("Stone Brick IDs", 511).getInt();
        ReinforcedBricksID = config.getBlock("Reinforced Brick IDs", 512).getInt();
        Rare = config.get("General", "Increase the Rarity of Stones?", false).getBoolean(Rare);
        
		config.save();
  }

  public static void save()
  {
    config.save();
  }
}