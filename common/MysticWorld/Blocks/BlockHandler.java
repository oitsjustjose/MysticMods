package mysticworld.blocks;

import mysticworld.lib.BlockIds;
import mysticworld.lib.Strings;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockHandler {
	public static Block oreImbuedStone;
	public static Block bush;
	public static Block lightCube;
	public static Block pillarPlatform;
	public static Block pillar;
	public static Block pillarInsert;

	public static void init() {
		oreImbuedStone = new BlockImbuedStone(BlockIds.ORE_STONE_1).setUnlocalizedName(Strings.IMBUED_STONE_NAME);
		bush = new BlockBush(BlockIds.BUSH).setUnlocalizedName(Strings.BUSH_NAME);
		lightCube = new BlockLightCube(BlockIds.LIGHT_CUBE).setUnlocalizedName(Strings.LIGHT_CUBE_NAME);
		pillarPlatform = new BlockPlatform(BlockIds.PLATFORM).setUnlocalizedName(Strings.PLATFORM_NAME);
		pillar = new BlockPillar(BlockIds.PILLAR).setUnlocalizedName(Strings.PILLAR_NAME);
		pillarInsert = new BlockPillarInsert(BlockIds.PILLAR_INSERT).setUnlocalizedName(Strings.PILLAR_INSERT_NAME);
		registerBlocks();
		setBlockHarvestLevels();
	}

	private static void registerBlocks() {
		GameRegistry.registerBlock(oreImbuedStone, ItemImbuedStone.class, Strings.IMBUED_STONE_NAME);
		GameRegistry.registerBlock(bush, ItemBush.class, Strings.BUSH_NAME);
		GameRegistry.registerBlock(lightCube, Strings.LIGHT_CUBE_NAME);
		GameRegistry.registerBlock(pillarPlatform, Strings.PLATFORM_NAME);
		GameRegistry.registerBlock(pillar, Strings.PILLAR_NAME);
		GameRegistry.registerBlock(pillarInsert, Strings.PILLAR_INSERT_NAME);
	}

	private static void setBlockHarvestLevels() {
	}
}
