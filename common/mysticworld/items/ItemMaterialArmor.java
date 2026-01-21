package mysticworld.items;

import mysticworld.MysticWorld;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemMaterialArmor extends ItemArmor{
    public ItemMaterialArmor(ArmorMaterial par2EnumArmorMaterial, int par4) {
        super(par2EnumArmorMaterial, 0, par4);
        this.setCreativeTab(MysticWorld.MysticWorldTab);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer) {
        int suffix = this.armorType == 2 ? 2 : 1;
        return "mysticworld:textures/models/armor/"+getArmorMaterial().name()+"_layer_" + suffix + ".png";
    }

    @Override
    public void registerIcons(IIconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon("mysticworld:"+getArmorMaterial().name()+"Armor_" + armorType);
    }
}
