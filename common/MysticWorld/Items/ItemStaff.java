package MysticWorld.Items;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import MysticWorld.MysticWorld;
import net.minecraft.item.Item;

public class ItemStaff extends Item 
{
	Random rand = new Random();
	
	public ItemStaff(int id) 
	{
		super(id);
        this.setMaxStackSize(1);
        this.setMaxDamage(200);
		this.setCreativeTab(MysticWorld.MysticWorldTab);
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }
	
}
