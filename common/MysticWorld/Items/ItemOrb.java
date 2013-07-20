package MysticWorld.Items;

import java.util.Random;

import MysticWorld.MysticWorld;
import net.minecraft.item.Item;

public class ItemOrb extends Item {

	Random rand = new Random();
	
	public ItemOrb(int id) 
	{
		super(id);
        this.setMaxStackSize(1);
        this.setMaxDamage(200);
		this.setCreativeTab(MysticWorld.MysticWorldTab);
	}

}
