package MysticWorld.Items;

import MysticWorld.MysticWorld;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.IArmorTextureProvider;

public class ItemIridiumArmor extends ItemArmor implements IArmorTextureProvider
{
	int ArmorType;
	
	String ArmorFile_1;
	String ArmorFile_2;

	public ItemIridiumArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
			
			super(par1, par2EnumArmorMaterial,par3,par4);
			this.ArmorType=par4;
			this.setCreativeTab(MysticWorld.MysticWorldTab);
			this.ArmorFile_1 = "/mods/MysticTextures/textures/armor/iridium_1.png";
			this.ArmorFile_2 = "/mods/MysticTextures/textures/armor/iridium_2.png";
		}

		@Override
		public void registerIcons(IconRegister iconRegister)
		{
			switch (ArmorType){
			case 0:
		        itemIcon = iconRegister.registerIcon("MysticTextures:HelmetIridium");
		        break;
			case 1:
				itemIcon = iconRegister.registerIcon("MysticTextures:ChestplateIridium");
		        break;
			case 2:
				itemIcon = iconRegister.registerIcon("MysticTextures:LeggingsIridium");
		        break;
			case 3:
				itemIcon = iconRegister.registerIcon("MysticTextures:BootsIridium");
		        break;
			}
		}
		
		public String getArmorTextureFile(ItemStack par1){
			if(par1.itemID == ItemHandler$1.iridiumHelmet.itemID||par1.itemID == ItemHandler$1.iridiumChestplate.itemID||par1.itemID == ItemHandler$1.iridiumBoots.itemID)
			{
				return ArmorFile_1;
			}
			if(par1.itemID == ItemHandler$1.iridiumLeggings.itemID)
			{
				return ArmorFile_2;
			}
			return ArmorFile_2;
		}
		
		@Override
		public void onArmorTickUpdate(World world, EntityPlayer player, ItemStack itemStack)
		{
			ItemStack helmet = player.getCurrentItemOrArmor(4);
			ItemStack plate = player.getCurrentItemOrArmor(3);
			ItemStack legs = player.getCurrentItemOrArmor(2);
			ItemStack boots = player.getCurrentItemOrArmor(1);
			if (helmet != null)
			{
				if(helmet.itemID == ItemHandler$1.iridiumHelmet.itemID)
				{
					player.addPotionEffect((new PotionEffect(Potion.nightVision.getId(), 200, 0)));
				}
			}
			
			if (plate != null)
			{
				if(plate.itemID == ItemHandler$1.iridiumChestplate.itemID)
				{
					player.addPotionEffect((new PotionEffect(Potion.regeneration.getId(), 200, 0)));
				}
			}

			if (legs != null)
			{
				if(legs.itemID == ItemHandler$1.iridiumLeggings.itemID)
				{
					player.addPotionEffect((new PotionEffect(Potion.moveSpeed.getId(), 200, 2)));
					player.addVelocity(0.0005, 0, 0.0005);
					player.stepHeight = 1.001F;
				}
			}
			
			if (boots != null)
			{
				if(boots.itemID == ItemHandler$1.iridiumBoots.itemID)
				{
					player.fallDistance = 0.0F;
					player.addPotionEffect((new PotionEffect(Potion.jump.getId(), 200, 2)));
				}
			}
		}
}