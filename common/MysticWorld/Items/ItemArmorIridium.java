package mysticworld.items;

import mysticworld.MysticWorld;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemArmorIridium extends ItemArmor {
	int ArmorType;
	String ArmorFile_1;
	String ArmorFile_2;

	public ItemArmorIridium(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		this.ArmorType = par4;
		this.setMaxDamage(4000);
		this.setCreativeTab(MysticWorld.MysticWorldTab);
		this.ArmorFile_1 = "/assets/MysticMods/textures/armor/iridium_1.png";
		this.ArmorFile_2 = "/assets/MysticMods/textures/armor/iridium_2.png";
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		int suffix = this.armorType == 2 ? 2 : 1;
		return "MysticMods:textures" + "/models/armor/Iridium_layer_" + suffix + ".png";
	}

	@Override
	public void onArmorTickUpdate(World world, EntityPlayer player, ItemStack itemStack) {
		ItemStack helmet = player.getCurrentItemOrArmor(4);
		ItemStack plate = player.getCurrentItemOrArmor(3);
		ItemStack legs = player.getCurrentItemOrArmor(2);
		ItemStack boots = player.getCurrentItemOrArmor(1);
		if (helmet != null) {
			if (helmet.itemID == ItemHandler.iridiumHelmet.itemID) {
				player.addPotionEffect((new PotionEffect(Potion.nightVision.getId(), 200, 0)));
			}
		}
		if (plate != null) {
			if (plate.itemID == ItemHandler.iridiumChestplate.itemID) {
				player.addPotionEffect((new PotionEffect(Potion.regeneration.getId(), 200, 0)));
			}
		}
		if (legs != null) {
			if (legs.itemID == ItemHandler.iridiumLeggings.itemID) {
				player.addPotionEffect((new PotionEffect(Potion.moveSpeed.getId(), 200, 2)));
				player.addVelocity(0.0005, 0, 0.0005);
				player.stepHeight = 1.001F;
			}
		}
		if (boots != null) {
			if (boots.itemID == ItemHandler.iridiumBoots.itemID) {
				player.fallDistance = 0.0F;
				player.addPotionEffect((new PotionEffect(Potion.jump.getId(), 200, 2)));
			}
		}
	}

	@Override
	public void registerIcons(IconRegister iconRegister) {
		switch (ArmorType) {
		case 0:
			itemIcon = iconRegister.registerIcon("MysticMods:IridiumArmor_0");
			break;
		case 1:
			itemIcon = iconRegister.registerIcon("MysticMods:IridiumArmor_1");
			break;
		case 2:
			itemIcon = iconRegister.registerIcon("MysticMods:IridiumArmor_2");
			break;
		case 3:
			itemIcon = iconRegister.registerIcon("MysticMods:IridiumArmor_3");
			break;
		}
	}
}