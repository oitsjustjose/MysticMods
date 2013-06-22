package MysticOres.Items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import MysticOres.ConfigurationManager;
import MysticOres.MysticOres;
import MysticOres.Blocks.BlockHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemHandler {
	public static Item AdamantineSword;
	public static Item AdamantinePickaxe;
	public static Item AdamantineShovel;
	public static Item AdamantineAxe;
	public static Item AdamantineHoe;
	
	public static Item BloodstoneSword;
	public static Item BloodstonePickaxe;
	public static Item BloodstoneShovel;
	public static Item BloodstoneAxe;
	public static Item BloodstoneHoe;
	
	public static Item IridiumSword;
	public static Item IridiumPickaxe;
	public static Item IridiumShovel;
	public static Item IridiumAxe;
	public static Item IridiumHoe;
	
	public static Item MithrilSword;
	public static Item MithrilPickaxe;
	public static Item MithrilShovel;
	public static Item MithrilAxe;
	public static Item MithrilHoe;
	
	public static Item ObsidianSword;
	public static Item ObsidianPickaxe;
	public static Item ObsidianShovel;
	public static Item ObsidianAxe;
	public static Item ObsidianHoe;
	
	public static Item VerditeSword;
	public static Item VerditePickaxe;
	public static Item VerditeShovel;
	public static Item VerditeAxe;
	public static Item VerditeHoe;
	
	public static Item Resource;
	
	public static Item Satchel;
	
	public static void init()
	{
		AdamantineSword = new ItemSwords(ConfigurationManager.AdamantineSwordID, EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineSword");
		VerditeSword = new ItemSwords(ConfigurationManager.VerditeSwordID, EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeSword");
		MithrilSword = new ItemSwords(ConfigurationManager.MithrilSwordID, EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilSword");
		IridiumSword = new ItemSwords(ConfigurationManager.IridiumSwordID, EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumSword");
		ObsidianSword = new ItemSwords(ConfigurationManager.ObsidianSwordID, EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianSword");
		BloodstoneSword = new ItemSwords(ConfigurationManager.BloodstoneSwordID, EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneSword");
		
		AdamantinePickaxe = new ItemPickaxes(ConfigurationManager.AdamantinePickaxeID, EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantinePickaxe");
		VerditePickaxe = new ItemPickaxes(ConfigurationManager.VerditePickaxeID, EnumTools.verditeToolMaterial).setUnlocalizedName("VerditePickaxe");
		MithrilPickaxe = new ItemPickaxes(ConfigurationManager.MithrilPickaxeID, EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilPickaxe");
		IridiumPickaxe = new ItemPickaxes(ConfigurationManager.IridiumPickaxeID, EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumPickaxe");
		ObsidianPickaxe = new ItemPickaxes(ConfigurationManager.ObsidianPickaxeID, EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianPickaxe");
		BloodstonePickaxe = new ItemPickaxes(ConfigurationManager.BloodstonePickaxeID, EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstonePickaxe");
		
		AdamantineShovel = new ItemShovels(ConfigurationManager.AdamantineShovelID, EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineShovel");
		VerditeShovel = new ItemShovels(ConfigurationManager.VerditeShovelID, EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeShovel");
		MithrilShovel = new ItemShovels(ConfigurationManager.MithrilShovelID, EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilShovel");
		IridiumShovel = new ItemShovels(ConfigurationManager.IridiumShovelID, EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumShovel");
		ObsidianShovel = new ItemShovels(ConfigurationManager.ObsidianShovelID, EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianShovel");
		BloodstoneShovel = new ItemShovels(ConfigurationManager.BloodstoneShovelID, EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneShovel");
		
		AdamantineAxe = new ItemAxes(ConfigurationManager.AdamantineAxeID, EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineAxe");
		VerditeAxe = new ItemAxes(ConfigurationManager.VerditeAxeID, EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeAxe");
		MithrilAxe = new ItemAxes(ConfigurationManager.MithrilAxeID, EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilAxe");
		IridiumAxe = new ItemAxes(ConfigurationManager.IridiumAxeID, EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumAxe");
		ObsidianAxe = new ItemAxes(ConfigurationManager.ObsidianAxeID, EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianAxe");
		BloodstoneAxe = new ItemAxes(ConfigurationManager.BloodstoneAxeID, EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneAxe");
		
		AdamantineHoe = new ItemHoes(ConfigurationManager.AdamantineHoeID, EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineHoe");
		VerditeHoe = new ItemHoes(ConfigurationManager.VerditeHoeID, EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeHoe");
		MithrilHoe = new ItemHoes(ConfigurationManager.MithrilHoeID, EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilHoe");
		IridiumHoe = new ItemHoes(ConfigurationManager.IridiumHoeID, EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumHoe");
		ObsidianHoe = new ItemHoes(ConfigurationManager.ObsidianHoeID, EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianHoe");
		BloodstoneHoe = new ItemHoes(ConfigurationManager.BloodstoneHoeID, EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneHoe");
		
		Resource = new ItemResource(ConfigurationManager.ResourcesID);
		
		Satchel = new ItemSatchel(ConfigurationManager.SatchelID).setUnlocalizedName("Satchel"); 
	}
}
