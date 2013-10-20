package mysticworld.items;

import java.util.Random;

import mysticworld.MysticWorld;
import net.minecraft.item.Item;

public class ItemOrb extends Item {
	Random rand = new Random();

	public ItemOrb(int id) {
		super(id);
		this.setMaxStackSize(1);
		this.setMaxDamage(200);
		this.setCreativeTab(MysticWorld.MysticWorldTab);
	}
}
