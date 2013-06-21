package MysticWorld.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemMysticWorld extends Item
{
    public ItemMysticWorld(int i)
    {
        super(i);
        maxStackSize = 64;
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }
    
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
             itemIcon = iconRegister.registerIcon("MysticTextures" + ":" + this.getUnlocalizedName());
    }
}