package mysticruins;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChestFiller {
	public static List<ItemStack> rares = new ArrayList<ItemStack>();
	public static List<ItemStack> valuables = new ArrayList<ItemStack>();

	public static void fillWithRares(TileEntity tile) {
		fill(tile, rares, 2.5D);
	}

	public static void fillWithValuables(TileEntity tile) {
		fill(tile, valuables, 5D);
	}

	private static void fill(TileEntity tile, List<ItemStack> stacks, double factor) {
		if (tile instanceof IInventory) {
			IInventory chest = (IInventory) tile;
			Random rand = new Random();
			int num;
			for (int slot = 0; slot < chest.getSizeInventory(); slot++) {
				num = rand.nextInt((int) (stacks.size() * factor));
				if (num < stacks.size()) {
					chest.setInventorySlotContents(slot, stacks.get(num));
				}
			}
		}
	}
}
