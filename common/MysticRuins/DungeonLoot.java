package MysticRuins;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class DungeonLoot
{
	public DungeonLoot()
	{
		addLoot();
	}
	
	public static ChestGenHooks MysticRuinChest;

	public static void addLoot ()
	{
		MysticRuinChest = new ChestGenHooks("MysticRuinChest", new WeightedRandomChestContent[0], 3, 27);
		
		MysticRuinChest.addItem(new WeightedRandomChestContent(new ItemStack(Item.ingotGold, 1, 0), 	60, 1, 1));
		MysticRuinChest.addItem(new WeightedRandomChestContent(new ItemStack(Item.diamond, 1, 0), 		100, 1, 1));
		MysticRuinChest.addItem(new WeightedRandomChestContent(new ItemStack(Item.ingotIron, 1, 0), 	30, 1, 1));
		MysticRuinChest.addItem(new WeightedRandomChestContent(new ItemStack(Item.enderPearl, 4, 0), 	20, 1, 1));
		MysticRuinChest.addItem(new WeightedRandomChestContent(new ItemStack(Item.appleRed, 3, 0), 		10, 1, 1));
		MysticRuinChest.addItem(new WeightedRandomChestContent(new ItemStack(Item.appleGold, 1, 0), 	50, 1, 1));
		MysticRuinChest.addItem(new WeightedRandomChestContent(new ItemStack(Item.emerald, 1, 0), 		200, 1, 1));
		MysticRuinChest.addItem(new WeightedRandomChestContent(new ItemStack(Item.shovelIron, 1, 0), 	60, 1, 1));
	}
}
