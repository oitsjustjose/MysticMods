package MysticOres.Items;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class IridiumFuelHandler implements IFuelHandler
{
	public int getBurnTime(ItemStack fuel) 
	{		
		if(fuel.getItemDamage() == 4)
			return 12800;
		else
			return 0;
	}
}
