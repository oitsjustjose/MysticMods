package MysticOres.Items;

import MysticOres.MysticOres;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemPickaxes extends ItemPickaxe
{

  public ItemPickaxes(int par1, EnumToolMaterial par2EnumToolMaterial)
 {
  super(par1, par2EnumToolMaterial);
  
  this.setCreativeTab(MysticOres.MysticOresTab);
 }
  
  @Override
  public void registerIcons(IconRegister iconRegister)
  {
           itemIcon = iconRegister.registerIcon("MysticTextures" + ":" + this.getUnlocalizedName());
  }
}
