package mysticworld.items;

import cpw.mods.fml.common.registry.GameRegistry;
import mysticworld.lib.Strings;
import net.minecraft.item.Item;

import java.lang.reflect.Field;

public class ItemHandler {
	public static Item staffParts;
	public static Item imbuedShard;
	public static Item fireStaff;
	public static Item waterStaff;
	public static Item earthStaff;
	public static Item airStaff;
	public static Item energyStaff;
	public static Item fireOrb;
	public static Item waterOrb;
	public static Item earthOrb;
	public static Item airOrb;
	public static Item energyOrb;
	public static Item bushFruit;
	public static Item verditeHelmet;
	public static Item verditeChestplate;
	public static Item verditeLeggings;
	public static Item verditeBoots;
	public static Item adamantineHelmet;
	public static Item adamantineChestplate;
	public static Item adamantineLeggings;
	public static Item adamantineBoots;
	public static Item mithrilHelmet;
	public static Item mithrilChestplate;
	public static Item mithrilLeggings;
	public static Item mithrilBoots;
	public static Item iridiumHelmet;
	public static Item iridiumChestplate;
	public static Item iridiumLeggings;
	public static Item iridiumBoots;
	public static Item voidShard;

	public static void init() {
		staffParts = new ItemStaffParts().setUnlocalizedName(Strings.STAFF_PART_NAME);
		imbuedShard = new ItemImbuedShard().setUnlocalizedName(Strings.IMBUED_SHARD_NAME);
		bushFruit = new ItemBushFruit(2).setUnlocalizedName(Strings.BUSH_FRUIT_NAME);
		fireStaff = new ItemStaffFire().setUnlocalizedName(Strings.FIRE_STAFF_NAME);
		waterStaff = new ItemStaffWater().setUnlocalizedName(Strings.WATER_STAFF_NAME);
		earthStaff = new ItemStaffEarth().setUnlocalizedName(Strings.EARTH_STAFF_NAME);
		airStaff = new ItemStaffAir().setUnlocalizedName(Strings.AIR_STAFF_NAME);
		energyStaff = new ItemStaffEnegy().setUnlocalizedName(Strings.ENERGY_STAFF_NAME);
		fireOrb = new ItemOrbFire().setUnlocalizedName(Strings.FIRE_ORB_NAME);
		waterOrb = new ItemOrbWater().setUnlocalizedName(Strings.WATER_ORB_NAME);
		earthOrb = new ItemOrbEarth().setUnlocalizedName(Strings.EARTH_ORB_NAME);
		airOrb = new ItemOrbAir().setUnlocalizedName(Strings.AIR_ORB_NAME);
		energyOrb = new ItemOrbEnergy().setUnlocalizedName(Strings.ENERGY_ORB_NAME);
		verditeHelmet = new ItemMaterialArmor(EnumArmor.Verdite, 0).setUnlocalizedName(Strings.VERDITE_HELMET_NAME).setMaxDamage(262);
		verditeChestplate = new ItemMaterialArmor(EnumArmor.Verdite, 1).setUnlocalizedName(Strings.VERDITE_CHESTPLATE_NAME).setMaxDamage(262);
		verditeLeggings = new ItemMaterialArmor(EnumArmor.Verdite, 2).setUnlocalizedName(Strings.VERDITE_LEGGINGS_NAME).setMaxDamage(262);
		verditeBoots = new ItemMaterialArmor(EnumArmor.Verdite, 3).setUnlocalizedName(Strings.VERDITE_BOOTS_NAME).setMaxDamage(262);
		mithrilHelmet = new ItemMaterialArmor(EnumArmor.Mithril, 0).setUnlocalizedName(Strings.MITHRIL_HELMET_NAME).setMaxDamage(500);
		mithrilChestplate = new ItemMaterialArmor(EnumArmor.Mithril, 1).setUnlocalizedName(Strings.MITHRIL_CHESTPLATE_NAME).setMaxDamage(500);
		mithrilLeggings = new ItemMaterialArmor(EnumArmor.Mithril, 2).setUnlocalizedName(Strings.MITHRIL_LEGGINGS_NAME).setMaxDamage(500);
		mithrilBoots = new ItemMaterialArmor(EnumArmor.Mithril, 3).setUnlocalizedName(Strings.MITHRIL_BOOTS_NAME).setMaxDamage(500);
		adamantineHelmet = new ItemMaterialArmor(EnumArmor.Adamantine, 0).setUnlocalizedName(Strings.ADAMANTINE_HELMET_NAME).setMaxDamage(3000);
		adamantineChestplate = new ItemMaterialArmor(EnumArmor.Adamantine, 1).setUnlocalizedName(Strings.ADAMANTINE_CHESTPLATE_NAME).setMaxDamage(3000);
		adamantineLeggings = new ItemMaterialArmor(EnumArmor.Adamantine, 2).setUnlocalizedName(Strings.ADAMANTINE_LEGGINGS_NAME).setMaxDamage(3000);
		adamantineBoots = new ItemMaterialArmor(EnumArmor.Adamantine, 3).setUnlocalizedName(Strings.ADAMANTINE_BOOTS_NAME).setMaxDamage(3000);
		iridiumHelmet = new ItemArmorIridium(EnumArmor.Iridium, 0).setUnlocalizedName(Strings.IRIDIUM_HELMET_NAME);
		iridiumChestplate = new ItemArmorIridium(EnumArmor.Iridium, 1).setUnlocalizedName(Strings.IRIDIUM_CHESTPLATE_NAME);
		iridiumLeggings = new ItemArmorIridium(EnumArmor.Iridium, 2).setUnlocalizedName(Strings.IRIDIUM_LEGGINGS_NAME);
		iridiumBoots = new ItemArmorIridium(EnumArmor.Iridium, 3).setUnlocalizedName(Strings.IRIDIUM_BOOTS_NAME);
		voidShard = new ItemVoidShard().setUnlocalizedName(Strings.VOID_SHARD_NAME).setTextureName("mysticworld:ShardVoid");
        for(Field f:ItemHandler.class.getFields()){
            try{
                Item item = (Item)f.get(null);
                GameRegistry.registerItem(item,item.getUnlocalizedName().substring(5));
            }catch (Exception e){}
        }
	}
}
