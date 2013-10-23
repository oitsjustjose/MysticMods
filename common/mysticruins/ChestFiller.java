package mysticruins;

import java.util.Random;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class ChestFiller {
	public static void fillWithRares(TileEntity tile) {
		if (tile instanceof IInventory) {
			IInventory chest = (IInventory) tile;
			Random rand = new Random();
			int num;
			for (int slot = 0; slot < chest.getSizeInventory(); slot++) {
				num = rand.nextInt(16);
				if (num == 1) {
					chest.setInventorySlotContents(slot, new ItemStack(Item.enderPearl, 4, 0));
				}
				if (num == 2) {
					chest.setInventorySlotContents(slot, new ItemStack(Item.diamond, 1, 0));
				}
				if (num == 3) {
					chest.setInventorySlotContents(slot, new ItemStack(Item.emerald, 1, 0));
				}
				if (num == 4) {
					chest.setInventorySlotContents(slot, new ItemStack(Item.appleGold, 1, 0));
				}
				if (num == 5) {
					chest.setInventorySlotContents(slot, new ItemStack(Item.ingotGold, 1, 0));
				}
				if (num == 6) {
					chest.setInventorySlotContents(slot, new ItemStack(Item.ingotIron, 1, 0));
				}
			}
		}
	}

	public static void fillWithValuables(TileEntity tile) {
		if (tile instanceof IInventory) {
			IInventory chest = (IInventory) tile;
			Random rand = new Random();
			int num;
			for (int slot = 0; slot < chest.getSizeInventory(); slot++) {
				num = rand.nextInt(32);
				if (num == 1) {
					chest.setInventorySlotContents(slot, new ItemStack(Item.pickaxeIron, 1, 0));
				}
				if (num == 2) {
					chest.setInventorySlotContents(slot, new ItemStack(Item.axeIron, 1, 0));
				}
				if (num == 3) {
					chest.setInventorySlotContents(slot, new ItemStack(Item.swordIron, 1, 0));
				}
				if (num == 4) {
					chest.setInventorySlotContents(slot, new ItemStack(Item.shovelIron, 1, 0));
				}
				if (num == 5) {
					chest.setInventorySlotContents(slot, new ItemStack(Item.ingotGold, 1, 0));
				}
				if (num == 6) {
					chest.setInventorySlotContents(slot, new ItemStack(Item.ingotIron, 1, 0));
				}
			}
		}
	}
}
