package mysticores.items;

import mysticores.lib.ItemID;
import net.minecraft.item.Item;

public class Items {
	public static Item VerditeSword;
	public static Item VerditePickaxe;
	public static Item VerditeShovel;
	public static Item VerditeAxe;
	public static Item VerditeHoe;
	public static Item MithrilSword;
	public static Item MithrilPickaxe;
	public static Item MithrilShovel;
	public static Item MithrilAxe;
	public static Item MithrilHoe;
	public static Item AdamantineSword;
	public static Item AdamantinePickaxe;
	public static Item AdamantineShovel;
	public static Item AdamantineAxe;
	public static Item AdamantineHoe;
	public static Item IridiumSword;
	public static Item IridiumPickaxe;
	public static Item IridiumShovel;
	public static Item IridiumAxe;
	public static Item IridiumHoe;
	public static Item BloodstoneSword;
	public static Item BloodstonePickaxe;
	public static Item BloodstoneShovel;
	public static Item BloodstoneAxe;
	public static Item BloodstoneHoe;
	public static Item ObsidianSword;
	public static Item ObsidianPickaxe;
	public static Item ObsidianShovel;
	public static Item ObsidianAxe;
	public static Item ObsidianHoe;
	public static Item Resource;
	public static Item Satchel;

	public static void initialize() {
		Resource = new ItemResource(ItemID.RESOURCES);
		VerditeSword = new ItemSwords(ItemID.VERDITESWORD, EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeSword");
		VerditePickaxe = new ItemPickaxes(ItemID.VERDITEPICKAXE, EnumTools.verditeToolMaterial).setUnlocalizedName("VerditePickaxe");
		VerditeShovel = new ItemShovels(ItemID.VERDITESHOVEL, EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeShovel");
		VerditeAxe = new ItemAxes(ItemID.VERDITEAXE, EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeAxe");
		VerditeHoe = new ItemHoes(ItemID.VERDITEHOE, EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeHoe");
		MithrilSword = new ItemSwords(ItemID.MITHRILSWORD, EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilSword");
		MithrilPickaxe = new ItemPickaxes(ItemID.MITHRILPICKAXE, EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilPickaxe");
		MithrilShovel = new ItemShovels(ItemID.MITHRILSHOVEL, EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilShovel");
		MithrilAxe = new ItemAxes(ItemID.MITHRILAXE, EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilAxe");
		MithrilHoe = new ItemHoes(ItemID.MITHRILHOE, EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilHoe");
		AdamantineSword = new ItemSwords(ItemID.ADAMANTINESWORD, EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineSword");
		AdamantinePickaxe = new ItemPickaxes(ItemID.ADAMANTINEPICKAXE, EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantinePickaxe");
		AdamantineShovel = new ItemShovels(ItemID.ADAMANTINESHOVEL, EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineShovel");
		AdamantineAxe = new ItemAxes(ItemID.ADAMANTINEAXE, EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineAxe");
		AdamantineHoe = new ItemHoes(ItemID.ADAMANTINEHOE, EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineHoe");
		IridiumSword = new ItemSwords(ItemID.IRIDIUMSWORD, EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumSword");
		IridiumPickaxe = new ItemPickaxes(ItemID.IRIDIUMPICKAXE, EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumPickaxe");
		IridiumShovel = new ItemShovels(ItemID.IRIDIUMSHOVEL, EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumShovel");
		IridiumAxe = new ItemAxes(ItemID.IRIDIUMAXE, EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumAxe");
		IridiumHoe = new ItemHoes(ItemID.IRIDIUMHOE, EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumHoe");
		BloodstoneSword = new ItemSwords(ItemID.BLOODSTONESWORD, EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneSword");
		BloodstonePickaxe = new ItemPickaxes(ItemID.BLOODSTONEPICKAXE, EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstonePickaxe");
		BloodstoneShovel = new ItemShovels(ItemID.BLOODSTONESHOVEL, EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneShovel");
		BloodstoneAxe = new ItemAxes(ItemID.BLOODSTONEAXE, EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneAxe");
		BloodstoneHoe = new ItemHoes(ItemID.BLOODSTONEHOE, EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneHoe");
		ObsidianSword = new ItemSwords(ItemID.OBSIDIANSWORD, EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianSword");
		ObsidianPickaxe = new ItemPickaxes(ItemID.OBSIDIANPICKAXE, EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianPickaxe");
		ObsidianShovel = new ItemShovels(ItemID.OBSIDIANSHOVEL, EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianShovel");
		ObsidianAxe = new ItemAxes(ItemID.OBSIDIANAXE, EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianAxe");
		ObsidianHoe = new ItemHoes(ItemID.OBSIDIANHOE, EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianHoe");
		Satchel = new ItemSatchel(ItemID.SATCHEL).setUnlocalizedName("Satchel");
	}
}
