package MysticOres.Items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import MysticOres.Config;
import MysticOres.MysticOres;
import MysticOres.Blocks.BlockHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemHandler {
	public static Item AdamantineSword;
	public static Item AdamantinePickaxe;
	public static Item AdamantineShovel;
	public static Item AdamantineAxe;
	public static Item AdamantineHoe;
	public static Item AdamantineIngot;
	
	public static Item BloodstoneSword;
	public static Item BloodstonePickaxe;
	public static Item BloodstoneShovel;
	public static Item BloodstoneAxe;
	public static Item BloodstoneHoe;
	public static Item BloodstoneShard;
	
	public static Item TopazGem;
	public static Item TourmalineGem;
	public static Item AmethystGem;
	public static Item AgateGem;
	
	public static Item MysticPowder;
	
	public static Item IridiumSword;
	public static Item IridiumPickaxe;
	public static Item IridiumShovel;
	public static Item IridiumAxe;
	public static Item IridiumHoe;
	public static Item IridiumIngot;
	public static Item IridiumNugget;
	
	public static Item MithrilSword;
	public static Item MithrilPickaxe;
	public static Item MithrilShovel;
	public static Item MithrilAxe;
	public static Item MithrilHoe;
	public static Item MithrilIngot;
	
	public static Item ObsidianSword;
	public static Item ObsidianPickaxe;
	public static Item ObsidianShovel;
	public static Item ObsidianAxe;
	public static Item ObsidianHoe;
	public static Item ObsidianShard;
	public static Item ObsidianRod;
	
	public static Item VerditeSword;
	public static Item VerditePickaxe;
	public static Item VerditeShovel;
	public static Item VerditeAxe;
	public static Item VerditeHoe;
	public static Item VerditeIngot;
	
	public static Item GlassShard;
	
	public static Item Satchel;
	
	public static Item AdamantineDust;
	public static Item MithrilDust;
	public static Item VerditeDust;
	
	public static void init(){
		AdamantineIngot = new ItemBase(Config.AdamantineIngotID).setUnlocalizedName("AdamantineIngot");
		MithrilIngot = new ItemBase(Config.MithrilIngotID).setUnlocalizedName("MithrilIngot");
		IridiumIngot = new ItemBase(Config.IridiumIngotID).setUnlocalizedName("IridiumIngot");
		
		ObsidianShard = new ItemBase(Config.ObsidianShardID).setUnlocalizedName("ObsidianShard");
		BloodstoneShard = new ItemBase(Config.BloodstoneShardID).setUnlocalizedName("BloodstoneShard");
		
		TopazGem = new ItemBase(Config.TopazGemID).setUnlocalizedName("TopazGem");
		TourmalineGem = new ItemBase(Config.TourmalineGemID).setUnlocalizedName("TourmalineGem");
		AmethystGem = new ItemBase(Config.AmethystGemID).setUnlocalizedName("AmethystGem");

		IridiumNugget = new ItemBase(Config.IridiumNuggetID).setUnlocalizedName("IridiumNugget");
		GlassShard = new ItemBase(Config.GlassShardID).setUnlocalizedName("GlassShard");
		VerditeIngot = new ItemBase(Config.VerditeIngotID).setUnlocalizedName("VerditeIngot");
		
		AdamantineSword = new ItemSwords(Config.AdamantineSwordID, EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineSword");
		VerditeSword = new ItemSwords(Config.VerditeSwordID, EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeSword");
		MithrilSword = new ItemSwords(Config.MithrilSwordID, EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilSword");
		IridiumSword = new ItemSwords(Config.IridiumSwordID, EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumSword");
		ObsidianSword = new ItemSwords(Config.ObsidianSwordID, EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianSword");
		BloodstoneSword = new ItemSwords(Config.BloodstoneSwordID, EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneSword");
		
		AdamantinePickaxe = new ItemPickaxes(Config.AdamantinePickaxeID, EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantinePickaxe");
		VerditePickaxe = new ItemPickaxes(Config.VerditePickaxeID, EnumTools.verditeToolMaterial).setUnlocalizedName("VerditePickaxe");
		MithrilPickaxe = new ItemPickaxes(Config.MithrilPickaxeID, EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilPickaxe");
		IridiumPickaxe = new ItemPickaxes(Config.IridiumPickaxeID, EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumPickaxe");
		ObsidianPickaxe = new ItemPickaxes(Config.ObsidianPickaxeID, EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianPickaxe");
		BloodstonePickaxe = new ItemPickaxes(Config.BloodstonePickaxeID, EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstonePickaxe");
		
		AdamantineShovel = new ItemShovels(Config.AdamantineShovelID, EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineShovel");
		VerditeShovel = new ItemShovels(Config.VerditeShovelID, EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeShovel");
		MithrilShovel = new ItemShovels(Config.MithrilShovelID, EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilShovel");
		IridiumShovel = new ItemShovels(Config.IridiumShovelID, EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumShovel");
		ObsidianShovel = new ItemShovels(Config.ObsidianShovelID, EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianShovel");
		BloodstoneShovel = new ItemShovels(Config.BloodstoneShovelID, EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneShovel");
		
		AdamantineAxe = new ItemAxes(Config.AdamantineAxeID, EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineAxe");
		VerditeAxe = new ItemAxes(Config.VerditeAxeID, EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeAxe");
		MithrilAxe = new ItemAxes(Config.MithrilAxeID, EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilAxe");
		IridiumAxe = new ItemAxes(Config.IridiumAxeID, EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumAxe");
		ObsidianAxe = new ItemAxes(Config.ObsidianAxeID, EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianAxe");
		BloodstoneAxe = new ItemAxes(Config.BloodstoneAxeID, EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneAxe");
		
		AdamantineHoe = new ItemHoes(Config.AdamantineHoeID, EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineHoe");
		VerditeHoe = new ItemHoes(Config.VerditeHoeID, EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeHoe");
		MithrilHoe = new ItemHoes(Config.MithrilHoeID, EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilHoe");
		IridiumHoe = new ItemHoes(Config.IridiumHoeID, EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumHoe");
		ObsidianHoe = new ItemHoes(Config.ObsidianHoeID, EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianHoe");
		BloodstoneHoe = new ItemHoes(Config.BloodstoneHoeID, EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneHoe");		
		
		AdamantineDust = new ItemBase(Config.AdamantineDustID).setUnlocalizedName("AdamantineDust");
		MithrilDust = new ItemBase(Config.MithrilDustID).setUnlocalizedName("MithrilDust");
		VerditeDust = new ItemBase(Config.VerditeDustID).setUnlocalizedName("VerditeDust");
		AgateGem = new ItemBase(Config.AgateGemID).setUnlocalizedName("AgateGem");
		
		ObsidianRod = new ItemBase(Config.ObsidianRodID).setUnlocalizedName("ObsidianRod");

		MysticPowder = new ItemBase(Config.MysticPowderID).setUnlocalizedName("MysticPowder");
		
		Satchel = new ItemSatchel(Config.SatchelID).setUnlocalizedName("Satchel"); 
	}
}
