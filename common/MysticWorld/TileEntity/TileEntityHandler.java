package MysticWorld.TileEntity;

import MysticWorld.Lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntityHandler {

	public static void init()
	{
		GameRegistry.registerTileEntity(TileEntityPillarInsert.class, Strings.PILLAR_INSERT_TE_NAME);
	}
	
}
