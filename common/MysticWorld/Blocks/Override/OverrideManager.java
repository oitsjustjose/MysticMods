package MysticWorld.Blocks.Override;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import MysticWorld.Lib.Booleans;

public class OverrideManager
{
	public static Block MysticGrass;
	public static Block MysticDirt;
	public static Block MysticStone;
	
	public static void init()
	{
		
		if(Booleans.VANILLA_OVERRIDE_ENABLE)
		{
			Block.blocksList[Block.grass.blockID] = null;
			Block.blocksList[Block.dirt.blockID] = null;
			Block.blocksList[Block.stone.blockID] = null;
			
			MysticDirt = new BlockDirt(Block.dirt.blockID);
			MysticGrass = new BlockGrass(Block.grass.blockID);
			
			GameRegistry.registerBlock(MysticDirt, "MysticDirtMW");
			GameRegistry.registerBlock(MysticGrass, "MysticGrassMW");
			
			LanguageRegistry.instance().addName(MysticDirt, "Dirt");
			LanguageRegistry.instance().addName(MysticGrass, "Grass Block");
		}
	}
}
