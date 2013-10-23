package mysticstones.blocks;

import mysticstones.MysticStones;

public class ItemStoneBricks extends ItemBlockMulti {
	public static final String[] STONEBRICK_TYPES = new String[] { "Anorthosite Bricks", "Limestone Bricks", "Marble Bricks", "Migmatite Bricks", "Orthogneiss Bricks", "Slate Bricks",
			"Travertine Bricks" };

	public ItemStoneBricks(int par1) {
		super(par1, MysticStones.StoneBricks, STONEBRICK_TYPES);
	}
}
