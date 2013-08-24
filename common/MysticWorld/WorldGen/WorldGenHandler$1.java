package MysticWorld.WorldGen;

import MysticWorld.Lib.Booleans;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGenHandler$1 {

	public static void init()
	{
		if(Booleans.ENABLE_BUSH_GEN)
			GameRegistry.registerWorldGenerator(new WorldGenBushes());
		
		GameRegistry.registerWorldGenerator(new WorldGenStones());
	}
	
}
