package mysticworld.items;

import mysticworld.MysticWorld;
import mysticworld.lib.ItemIds;
import mysticworld.lib.Strings;
import net.minecraft.item.Item;

public class ItemHandler {
	public static Item staffParts;
	public static Item imbuedShard;
	public static Item fireStaff;
	public static Item waterStaff;
	public static Item earthStaff;
	public static Item airStaff;
	public static Item energyStaff;
	public static Item fireStaffPower;
	public static Item waterStaffPower;
	public static Item earthStaffPower;
	public static Item airStaffPower;
	public static Item energyStaffPower;
	public static Item staffPower;
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
		staffParts = new ItemStaffParts(ItemIds.STAFF_PARTS);
		imbuedShard = new ItemImbuedShard(ItemIds.IMBUED_SHARD);
		bushFruit = new ItemBushFruit(ItemIds.BUSH_FRUIT, 2);
		fireStaff = new ItemStaffFire(ItemIds.FIRE_STAFF).setUnlocalizedName(Strings.FIRE_STAFF_NAME);
		waterStaff = new ItemStaffWater(ItemIds.WATER_STAFF).setUnlocalizedName(Strings.WATER_STAFF_NAME);
		earthStaff = new ItemStaffEarth(ItemIds.EARTH_STAFF).setUnlocalizedName(Strings.EARTH_STAFF_NAME);
		airStaff = new ItemStaffAir(ItemIds.AIR_STAFF).setUnlocalizedName(Strings.AIR_STAFF_NAME);
		energyStaff = new ItemStaffEnegy(ItemIds.ENERGY_STAFF).setUnlocalizedName(Strings.ENERGY_STAFF_NAME);
		staffPower = new ItemStaffPower(ItemIds.STAFF_POWER);
		fireOrb = new ItemOrbFire(ItemIds.FIRE_ORB).setUnlocalizedName(Strings.FIRE_ORB_NAME);
		waterOrb = new ItemOrbWater(ItemIds.WATER_ORB).setUnlocalizedName(Strings.WATER_ORB_NAME);
		earthOrb = new ItemOrbEarth(ItemIds.EARTH_ORB).setUnlocalizedName(Strings.EARTH_ORB_NAME);
		airOrb = new ItemOrbAir(ItemIds.AIR_ORB).setUnlocalizedName(Strings.AIR_ORB_NAME);
		energyOrb = new ItemOrbEnergy(ItemIds.ENERGY_ORB).setUnlocalizedName(Strings.ENERGY_ORB_NAME);
		verditeHelmet = new ItemArmorVerdite(ItemIds.VERDITE_HELMET, EnumArmor.Verdite, MysticWorld.proxy.addArmor(EnumArmor.Verdite.name()), 0).setUnlocalizedName(Strings.VERDITE_HELMET_NAME);
		verditeChestplate = new ItemArmorVerdite(ItemIds.VERDITE_CHESTPLATE, EnumArmor.Verdite, MysticWorld.proxy.addArmor(EnumArmor.Verdite.name()), 1)
				.setUnlocalizedName(Strings.VERDITE_CHESTPLATE_NAME);
		verditeLeggings = new ItemArmorVerdite(ItemIds.VERDITE_LEGGINGS, EnumArmor.Verdite, MysticWorld.proxy.addArmor(EnumArmor.Verdite.name()), 2).setUnlocalizedName(Strings.VERDITE_LEGGINGS_NAME);
		verditeBoots = new ItemArmorVerdite(ItemIds.VERDITE_BOOTS, EnumArmor.Verdite, MysticWorld.proxy.addArmor(EnumArmor.Verdite.name()), 3).setUnlocalizedName(Strings.VERDITE_BOOTS_NAME);
		mithrilHelmet = new ItemArmorMithril(ItemIds.MITHRIL_HELMET, EnumArmor.Mithril, MysticWorld.proxy.addArmor(EnumArmor.Mithril.name()), 0).setUnlocalizedName(Strings.MITHRIL_HELMET_NAME);
		mithrilChestplate = new ItemArmorMithril(ItemIds.MITHRIL_CHESTPLATE, EnumArmor.Mithril, MysticWorld.proxy.addArmor(EnumArmor.Mithril.name()), 1)
				.setUnlocalizedName(Strings.MITHRIL_CHESTPLATE_NAME);
		mithrilLeggings = new ItemArmorMithril(ItemIds.MITHRIL_LEGGINGS, EnumArmor.Mithril, MysticWorld.proxy.addArmor(EnumArmor.Mithril.name()), 2).setUnlocalizedName(Strings.MITHRIL_LEGGINGS_NAME);
		mithrilBoots = new ItemArmorMithril(ItemIds.MITHRIL_BOOTS, EnumArmor.Mithril, MysticWorld.proxy.addArmor(EnumArmor.Mithril.name()), 3).setUnlocalizedName(Strings.MITHRIL_BOOTS_NAME);
		adamantineHelmet = new ItemArmorAdamantine(ItemIds.ADAMANTINE_HELMET, EnumArmor.Adamantine, MysticWorld.proxy.addArmor(EnumArmor.Adamantine.name()), 0)
				.setUnlocalizedName(Strings.ADAMANTINE_HELMET_NAME);
		adamantineChestplate = new ItemArmorAdamantine(ItemIds.ADAMANTINE_CHESTPLATE, EnumArmor.Adamantine, MysticWorld.proxy.addArmor(EnumArmor.Adamantine.name()), 1)
				.setUnlocalizedName(Strings.ADAMANTINE_CHESTPLATE_NAME);
		adamantineLeggings = new ItemArmorAdamantine(ItemIds.ADAMANTINE_LEGGINGS, EnumArmor.Adamantine, MysticWorld.proxy.addArmor(EnumArmor.Adamantine.name()), 2)
				.setUnlocalizedName(Strings.ADAMANTINE_LEGGINGS_NAME);
		adamantineBoots = new ItemArmorAdamantine(ItemIds.ADAMANTINE_BOOTS, EnumArmor.Adamantine, MysticWorld.proxy.addArmor(EnumArmor.Adamantine.name()), 3)
				.setUnlocalizedName(Strings.ADAMANTINE_BOOTS_NAME);
		iridiumHelmet = new ItemArmorIridium(ItemIds.IRIDIUM_HELMET, EnumArmor.Iridium, MysticWorld.proxy.addArmor(EnumArmor.Iridium.name()), 0).setUnlocalizedName(Strings.IRIDIUM_HELMET_NAME);
		iridiumChestplate = new ItemArmorIridium(ItemIds.IRIDIUM_CHESTPLATE, EnumArmor.Iridium, MysticWorld.proxy.addArmor(EnumArmor.Iridium.name()), 1)
				.setUnlocalizedName(Strings.IRIDIUM_CHESTPLATE_NAME);
		iridiumLeggings = new ItemArmorIridium(ItemIds.IRIDIUM_LEGGINGS, EnumArmor.Iridium, MysticWorld.proxy.addArmor(EnumArmor.Iridium.name()), 2).setUnlocalizedName(Strings.IRIDIUM_LEGGINGS_NAME);
		iridiumBoots = new ItemArmorIridium(ItemIds.IRIDIUM_BOOTS, EnumArmor.Iridium, MysticWorld.proxy.addArmor(EnumArmor.Iridium.name()), 3).setUnlocalizedName(Strings.IRIDIUM_BOOTS_NAME);
		voidShard = new ItemVoidShard(ItemIds.VOID_SHARD).setUnlocalizedName(Strings.VOID_SHARD_NAME);
	}
}
