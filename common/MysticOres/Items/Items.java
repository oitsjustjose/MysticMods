package mysticores.items;

import cpw.mods.fml.common.registry.GameRegistry;
import mysticores.MysticOres;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

import java.lang.reflect.Field;

public class Items {
	public static Item VerditeSword, VerditePickaxe, VerditeShovel, VerditeAxe, VerditeHoe;
	public static Item MithrilSword, MithrilPickaxe, MithrilShovel, MithrilAxe, MithrilHoe;
	public static Item AdamantineSword, AdamantinePickaxe, AdamantineShovel, AdamantineAxe, AdamantineHoe;
	public static Item IridiumSword, IridiumPickaxe, IridiumShovel, IridiumAxe, IridiumHoe;
	public static Item BloodstoneSword, BloodstonePickaxe, BloodstoneShovel, BloodstoneAxe, BloodstoneHoe;
	public static Item ObsidianSword, ObsidianPickaxe, ObsidianShovel, ObsidianAxe, ObsidianHoe;
	public static Item Resource;
	public static Item Satchel;

	public static void initialize() {
		Resource = new ItemResource().setUnlocalizedName("Resources");
		VerditeSword = new ItemSword(EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeSword");
		VerditePickaxe = new ItemPick(EnumTools.verditeToolMaterial).setUnlocalizedName("VerditePickaxe");
		VerditeShovel = new ItemSpade(EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeShovel");
		VerditeAxe = new ItemHatchet(EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeAxe");
		VerditeHoe = new ItemHoe(EnumTools.verditeToolMaterial).setUnlocalizedName("VerditeHoe");
		MithrilSword = new ItemSword(EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilSword");
		MithrilPickaxe = new ItemPick(EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilPickaxe");
		MithrilShovel = new ItemSpade(EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilShovel");
		MithrilAxe = new ItemHatchet(EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilAxe");
		MithrilHoe = new ItemHoe(EnumTools.mithrilToolMaterial).setUnlocalizedName("MithrilHoe");
		AdamantineSword = new ItemSword(EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineSword");
		AdamantinePickaxe = new ItemPick(EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantinePickaxe");
		AdamantineShovel = new ItemSpade(EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineShovel");
		AdamantineAxe = new ItemHatchet(EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineAxe");
		AdamantineHoe = new ItemHoe(EnumTools.adamantineToolMaterial).setUnlocalizedName("AdamantineHoe");
		IridiumSword = new ItemSword(EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumSword");
		IridiumPickaxe = new ItemPick(EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumPickaxe");
		IridiumShovel = new ItemSpade(EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumShovel");
		IridiumAxe = new ItemHatchet(EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumAxe");
		IridiumHoe = new ItemHoe(EnumTools.iridiumToolMaterial).setUnlocalizedName("IridiumHoe");
		BloodstoneSword = new ItemSword(EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneSword");
		BloodstonePickaxe = new ItemPick(EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstonePickaxe");
		BloodstoneShovel = new ItemSpade(EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneShovel");
		BloodstoneAxe = new ItemHatchet(EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneAxe");
		BloodstoneHoe = new ItemHoe(EnumTools.bloodstoneToolMaterial).setUnlocalizedName("BloodstoneHoe");
		ObsidianSword = new ItemSword(EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianSword");
		ObsidianPickaxe = new ItemPick(EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianPickaxe");
		ObsidianShovel = new ItemSpade(EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianShovel");
		ObsidianAxe = new ItemHatchet(EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianAxe");
		ObsidianHoe = new ItemHoe(EnumTools.obsidianToolMaterial).setUnlocalizedName("ObsidianHoe");
		Satchel = new ItemSatchel().setMaxStackSize(1).setUnlocalizedName("Satchel");
		try {
			for(Field f:Items.class.getFields()){
				Item it = (Item) f.get(null);
                it.setCreativeTab(MysticOres.MysticOresTab);
                String reg = it.getUnlocalizedName().substring(5);
                it.setTextureName("mysticores:"+reg);
				GameRegistry.registerItem(it,reg);
			}
		} catch (Exception e) {
		}
	}
}
