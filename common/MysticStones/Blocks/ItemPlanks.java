package mysticstones.blocks;

import mysticstones.MysticStones;

public class ItemPlanks extends ItemBlockMulti {
	public static final String[] PLANK_TYPE = new String[] { "Purple Planks", "Green Planks", "Black Planks", "Orange Planks", "Red Planks", "Blue Planks", "Yellow Planks" };

	public ItemPlanks(int par1) {
		super(par1, MysticStones.Planks, PLANK_TYPE);
	}
}
