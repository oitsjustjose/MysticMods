package MysticWorld.WorldGen;

import java.util.Random;

import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import MysticOres.Items.ItemHandler;
import MysticWorld.Items.ItemHandler$1;

public class MysticHutUtil
{
	public MysticHutUtil()
	{
		addLoot();
	}
	
	public static ChestGenHooks MysticHutChest;
	
	public static void addLoot()
	{
		MysticHutChest = new ChestGenHooks("MysticHutChest", new WeightedRandomChestContent[0], 3, 27);
		MysticHutChest.addItem(new WeightedRandomChestContent(new ItemStack(ItemHandler.ObsidianRod, 1, 0), 1, 1, 1));
		MysticHutChest.addItem(new WeightedRandomChestContent(new ItemStack(ItemHandler.MysticPowder, 1, 0), 1, 1, 1));
		MysticHutChest.addItem(new WeightedRandomChestContent(new ItemStack(ItemHandler.IridiumNugget, 1, 0), 1, 1, 1));
	}
}
