package MysticWorld;

import java.io.File;

import MysticWorld.Lib.BlockIds;
import MysticWorld.Lib.EntityIds;
import MysticWorld.Lib.ItemIds;
import MysticWorld.Lib.Strings;

import net.minecraftforge.common.Configuration;

public class Config
{
	public static Configuration config;
	
	public static void initialize(File file)
	{
		config = new Configuration(file);
		
		//Block Configuration
		BlockIds.ORE_STONE_1 = config.getBlock(Strings.IMBUED_STONE_NAME, BlockIds.ORE_STONE_1_DEFAULT).getInt(BlockIds.ORE_STONE_1);
		BlockIds.BUSH = config.getBlock(Strings.BUSH_NAME, BlockIds.BUSH_DEFAULT).getInt(BlockIds.BUSH_DEFAULT);
		
		//Item Configuration
		
		ItemIds.IMBUED_SHARD = config.getItem(Strings.IMBUED_SHARD_NAME, ItemIds.IMBUED_SHARD_DEFAULT).getInt(ItemIds.IMBUED_SHARD_DEFAULT);
		
		ItemIds.STAFF_PARTS = config.getItem(Strings.STAFF_NAME, ItemIds.STAFF_PARTS_DEFAULT).getInt(ItemIds.STAFF_PARTS_DEFAULT);
		
		ItemIds.FIRE_STAFF = config.getItem(Strings.FIRE_STAFF_NAME, ItemIds.FIRE_STAFF_DEFAULT).getInt(ItemIds.FIRE_STAFF_DEFAULT);
		ItemIds.WATER_STAFF = config.getItem(Strings.WATER_STAFF_NAME, ItemIds.WATER_STAFF_DEFAULT).getInt(ItemIds.WATER_STAFF_DEFAULT);
		ItemIds.EARTH_STAFF = config.getItem(Strings.EARTH_STAFF_NAME, ItemIds.EARTH_STAFF_DEFAULT).getInt(ItemIds.EARTH_STAFF_DEFAULT);
		ItemIds.AIR_STAFF = config.getItem(Strings.AIR_STAFF_NAME, ItemIds.AIR_STAFF_DEFAULT).getInt(ItemIds.AIR_STAFF_DEFAULT);
		ItemIds.ENERGY_STAFF = config.getItem(Strings.ENERGY_STAFF_NAME, ItemIds.ENERGY_STAFF_DEFAULT).getInt(ItemIds.ENERGY_STAFF_DEFAULT);
		
		ItemIds.STAFF_POWER = config.getItem(Strings.POWER_STAFF_NAME, ItemIds.STAFF_POWER_DEFAULT).getInt(ItemIds.STAFF_POWER_DEFAULT);
		
		ItemIds.BUSH_FRUIT = config.getItem(Strings.BUSH_FRUIT_NAME, ItemIds.BUSH_FRUIT_DEFAULT).getInt(ItemIds.BUSH_FRUIT_DEFAULT);
		
		ItemIds.VERDITE_HELMET = config.getItem(Strings.VERDITE_HELMET_NAME, ItemIds.VERDITE_HELMET_DEFAULT).getInt(ItemIds.VERDITE_HELMET_DEFAULT);
		ItemIds.VERDITE_CHESTPLATE = config.getItem(Strings.VERDITE_CHESTPLATE_NAME, ItemIds.VERDITE_CHESTPLATE_DEFAULT).getInt(ItemIds.VERDITE_CHESTPLATE_DEFAULT);
		ItemIds.VERDITE_LEGGINGS = config.getItem(Strings.VERDITE_LEGGINGS_NAME, ItemIds.VERDITE_LEGGINGS_DEFAULT).getInt(ItemIds.VERDITE_LEGGINGS_DEFAULT);
		ItemIds.VERDITE_BOOTS = config.getItem(Strings.VERDITE_BOOTS_NAME, ItemIds.VERDITE_BOOTS_DEFAULT).getInt(ItemIds.VERDITE_BOOTS_DEFAULT);
		
		ItemIds.MITHRIL_HELMET = config.getItem(Strings.MITHRIL_HELMET_NAME, ItemIds.MITHRIL_HELMET_DEFAULT).getInt(ItemIds.MITHRIL_HELMET_DEFAULT);
		ItemIds.MITHRIL_CHESTPLATE = config.getItem(Strings.MITHRIL_CHESTPLATE_NAME, ItemIds.MITHRIL_CHESTPLATE_DEFAULT).getInt(ItemIds.MITHRIL_CHESTPLATE_DEFAULT);
		ItemIds.MITHRIL_LEGGINGS = config.getItem(Strings.MITHRIL_LEGGINGS_NAME, ItemIds.MITHRIL_LEGGINGS_DEFAULT).getInt(ItemIds.MITHRIL_LEGGINGS_DEFAULT);
		ItemIds.MITHRIL_BOOTS = config.getItem(Strings.MITHRIL_BOOTS_NAME, ItemIds.MITHRIL_BOOTS_DEFAULT).getInt(ItemIds.MITHRIL_BOOTS_DEFAULT);
		
		ItemIds.ADAMANTINE_HELMET = config.getItem(Strings.ADAMANTINE_HELMET_NAME, ItemIds.ADAMANTINE_HELMET_DEFAULT).getInt(ItemIds.ADAMANTINE_HELMET_DEFAULT);
		ItemIds.ADAMANTINE_CHESTPLATE = config.getItem(Strings.ADAMANTINE_CHESTPLATE_NAME, ItemIds.ADAMANTINE_CHESTPLATE_DEFAULT).getInt(ItemIds.ADAMANTINE_CHESTPLATE_DEFAULT);
		ItemIds.ADAMANTINE_LEGGINGS = config.getItem(Strings.ADAMANTINE_LEGGINGS_NAME, ItemIds.ADAMANTINE_LEGGINGS_DEFAULT).getInt(ItemIds.ADAMANTINE_LEGGINGS_DEFAULT);
		ItemIds.ADAMANTINE_BOOTS = config.getItem(Strings.ADAMANTINE_BOOTS_NAME, ItemIds.ADAMANTINE_BOOTS_DEFAULT).getInt(ItemIds.ADAMANTINE_BOOTS_DEFAULT);
		
		ItemIds.IRIDIUM_HELMET = config.getItem(Strings.IRIDIUM_HELMET_NAME, ItemIds.IRIDIUM_HELMET_DEFAULT).getInt(ItemIds.IRIDIUM_HELMET_DEFAULT);
		ItemIds.IRIDIUM_CHESTPLATE = config.getItem(Strings.IRIDIUM_CHESTPLATE_NAME, ItemIds.IRIDIUM_CHESTPLATE_DEFAULT).getInt(ItemIds.IRIDIUM_CHESTPLATE_DEFAULT);
		ItemIds.IRIDIUM_LEGGINGS = config.getItem(Strings.IRIDIUM_LEGGINGS_NAME, ItemIds.IRIDIUM_LEGGINGS_DEFAULT).getInt(ItemIds.IRIDIUM_LEGGINGS_DEFAULT);
		ItemIds.IRIDIUM_BOOTS = config.getItem(Strings.IRIDIUM_BOOTS_NAME, ItemIds.IRIDIUM_BOOTS_DEFAULT).getInt(ItemIds.IRIDIUM_BOOTS_DEFAULT);
		
		ItemIds.FIRE_ORB = config.getItem(Strings.FIRE_ORB_NAME, ItemIds.FIRE_ORB_DEFAULT).getInt(ItemIds.FIRE_ORB);
		ItemIds.WATER_ORB = config.getItem(Strings.WATER_ORB_NAME, ItemIds.WATER_ORB_DEFAULT).getInt(ItemIds.WATER_ORB);
		ItemIds.EARTH_ORB = config.getItem(Strings.EARTH_ORB_NAME, ItemIds.EARTH_ORB_DEFAULT).getInt(ItemIds.EARTH_ORB);
		ItemIds.AIR_ORB = config.getItem(Strings.AIR_ORB_NAME, ItemIds.AIR_ORB_DEFAULT).getInt(ItemIds.AIR_ORB);
		ItemIds.ENERGY_ORB = config.getItem(Strings.ENERGY_ORB_NAME, ItemIds.ENERGY_ORB_DEFAULT).getInt(ItemIds.ENERGY_ORB);
		
		config.save();
  }

  public static void save()
  {
    config.save();
  }
}