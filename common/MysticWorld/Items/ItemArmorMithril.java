package mysticworld.items;

import mysticworld.MysticWorld;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorMithril extends ItemArmor {
	int ArmorType;
	String ArmorFile_1;
	String ArmorFile_2;

	public ItemArmorMithril(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		this.ArmorType = par4;
		this.setMaxDamage(500);
		this.setCreativeTab(MysticWorld.MysticWorldTab);
		this.ArmorFile_1 = "/assets/MysticMods/textures/armor/mithril_1.png";
		this.ArmorFile_2 = "/assets/MysticMods/textures/armor/mithril_2.png";
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		int suffix = this.armorType == 2 ? 2 : 1;
		return "MysticMods:textures" + "/models/armor/Mithril_layer_" + suffix + ".png";
	}

	@Override
	public void registerIcons(IconRegister iconRegister) {
		switch (ArmorType) {
		case 0:
			itemIcon = iconRegister.registerIcon("MysticMods:MithrilArmor_0");
			break;
		case 1:
			itemIcon = iconRegister.registerIcon("MysticMods:MithrilArmor_1");
			break;
		case 2:
			itemIcon = iconRegister.registerIcon("MysticMods:MithrilArmor_2");
			break;
		case 3:
			itemIcon = iconRegister.registerIcon("MysticMods:MithrilArmor_3");
			break;
		}
	}
}
