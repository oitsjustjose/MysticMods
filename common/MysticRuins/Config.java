package mysticruins;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class Config
{
	public static Configuration config;
	public static int RuinRarity;
	public static int DunRarity;
	
	public static void initialize(File file)
	{
		config = new Configuration(file);
        RuinRarity = config.get("General", "Ruin Rarity", 2).getInt();
        DunRarity = config.get("General", "Mystic Dungeon Rarity", 1).getInt();
		config.save();
  }

  public static void save()
  {
    config.save();
  }
}