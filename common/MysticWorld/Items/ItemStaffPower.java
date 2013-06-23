package MysticWorld.Items;

import java.util.List;

import MysticWorld.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;

public class ItemStaffPower extends Item {
	
	private Icon[] icons;
	
    private static final String[] CHARGE_NAMES = new String[] { "Fire", "Water", "Earth", "Air", "Energy"};

	public ItemStaffPower(int id)
	{
		super(id);
        this.setHasSubtypes(true);
        this.setCreativeTab(null);
        maxStackSize = 64;
	}
	
    @Override
    public String getUnlocalizedName(ItemStack itemStack) {

        int meta = MathHelper.clamp_int(itemStack.getItemDamage(), 0, 5);
        return super.getUnlocalizedName() + CHARGE_NAMES[meta];
    }
  
	 @Override
	 @SideOnly(Side.CLIENT)
	 public void registerIcons(IconRegister iconRegister)
	 {
		 icons = new Icon[CHARGE_NAMES.length];
		 
	     for (int i = 0; i < CHARGE_NAMES.length; ++i) {
	            icons[i] = iconRegister.registerIcon("MysticTextures" + ":" + CHARGE_NAMES[i] + " Charge");
	        }
	    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int meta) {

        int j = MathHelper.clamp_int(meta, 0, 5);
        return icons[j];
    }
}

