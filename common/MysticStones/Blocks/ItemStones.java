package mysticstones.blocks;

import mysticstones.MysticStones;

public class ItemStones extends ItemBlockMulti {
	public static final String[] STONE_TYPES = new String[] { "Smooth Anorthosite", "Anorthosite", "Smooth Limestone", "Limestone", "Smooth Marble", "Marble", "Smooth Migmatite", "Migmatite",
			"Smooth Orthogneiss", "Orthogneiss", "Smooth Slate", "Slate", "Smooth Travertine", "Travertine" };

	public ItemStones(int par1) {
		super(par1, MysticStones.Stones, STONE_TYPES);
	}
}
