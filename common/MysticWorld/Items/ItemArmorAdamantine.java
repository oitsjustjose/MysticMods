package MysticWorld.Items;

import MysticWorld.MysticWorld;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorAdamantine extends ItemArmor
{
	int ArmorType;
	
	String ArmorFile_1;
	String ArmorFile_2;

	public ItemArmorAdamantine(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
			super(par1, par2EnumArmorMaterial,par3,par4);
			this.ArmorType=par4;
			this.setMaxDamage(3000);
			this.setCreativeTab(MysticWorld.MysticWorldTab);
			this.ArmorFile_1 = "/MysticTextures/textures/armor/adamantine_1.png";
			this.ArmorFile_2 = "/MysticTextures/textures/armor/adamantine_2.png";
		}

		@Override
		public void registerIcons(IconRegister iconRegister)
		{
			switch (ArmorType){
			case 0:
		        itemIcon = iconRegister.registerIcon("MysticTextures:AdamantineArmor_0");
		        break;
			case 1:
				itemIcon = iconRegister.registerIcon("MysticTextures:AdamantineArmor_1");
		        break;
			case 2:
				itemIcon = iconRegister.registerIcon("MysticTextures:AdamantineArmor_2");
		        break;
			case 3:
				itemIcon = iconRegister.registerIcon("MysticTextures:AdamantineArmor_3");
		        break;
			}
		}
		
		 public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
		  {
		    int suffix = this.armorType == 2 ? 2 : 1;

		    return "MysticTextures:textures" + "/models/armor/Adamantine_layer_" + suffix + ".png";
		  }
}
