package mysticworld.tiles;

import cpw.mods.fml.common.registry.GameRegistry;
import mysticworld.lib.Strings;

public class TileEntityHandler {
	public static void init() {
		GameRegistry.registerTileEntity(TileEntityPillarInsert.class, Strings.PILLAR_INSERT_TE_NAME);
	}
}
