package mysticworld.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemArmorIridium extends ItemMaterialArmor {
	public ItemArmorIridium(ArmorMaterial par2EnumArmorMaterial, int par4) {
		super(par2EnumArmorMaterial, par4);
		this.setMaxDamage(4000);
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		ItemStack helmet = player.getEquipmentInSlot(4);
		if (helmet != null) {
			if (helmet.getItem() == ItemHandler.iridiumHelmet) {
				player.addPotionEffect((new PotionEffect(Potion.nightVision.getId(), 210, 0)));
			}
		}
        ItemStack plate = player.getEquipmentInSlot(3);
		if (plate != null) {
			if (plate.getItem() == ItemHandler.iridiumChestplate) {
				player.addPotionEffect((new PotionEffect(Potion.regeneration.getId(), 200, 0)));
			}
		}
        ItemStack legs = player.getEquipmentInSlot(2);
		if (legs != null) {
			if (legs.getItem() == ItemHandler.iridiumLeggings) {
				player.addPotionEffect((new PotionEffect(Potion.moveSpeed.getId(), 200, 2)));
				player.addVelocity(0.0005, 0, 0.0005);
				player.stepHeight = 1.001F;
			}
		}
        ItemStack boots = player.getEquipmentInSlot(1);
		if (boots != null) {
			if (boots.getItem() == ItemHandler.iridiumBoots) {
				player.fallDistance = 0.0F;
				player.addPotionEffect((new PotionEffect(Potion.jump.getId(), 200, 2)));
			}
		}
	}
}