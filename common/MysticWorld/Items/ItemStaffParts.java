package MysticWorld.Items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import MysticWorld.MysticWorld;
import MysticWorld.Lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemStaffParts extends Item {

	private Icon[] icons;
	
    private static final String[] STAFF_PARTS = new String[] {"Staff", "Hilt", "Handle", "Head"};
	
	public ItemStaffParts(int id)
	{
		super(id);
        this.setHasSubtypes(true);
        this.setCreativeTab(MysticWorld.MysticWorldTab);
	}
	
    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        int meta = MathHelper.clamp_int(itemStack.getItemDamage(), 0, 5);
        return STAFF_PARTS[meta];
    }
    
	@Override
    @SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }
  
	 @Override
	 @SideOnly(Side.CLIENT)
	 public void registerIcons(IconRegister iconRegister) {
		 icons = new Icon[STAFF_PARTS.length];
		 
	     for (int i = 0; i < STAFF_PARTS.length; ++i) {
	    	 icons[i] = iconRegister.registerIcon("MysticMods:StaffPart_" + STAFF_PARTS[i]);
	     }
	 }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int meta) {
        int j = MathHelper.clamp_int(meta, 0, STAFF_PARTS.length);
        return icons[j];
    }
    
    @SideOnly(Side.CLIENT)
    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List) {
    	for (int var4 = 0; var4 < STAFF_PARTS.length; var4++){
    		par3List.add(new ItemStack(par1, 1, var4));
    	}
    }
	
}
