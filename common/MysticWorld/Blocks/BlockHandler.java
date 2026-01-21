package mysticworld.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import mysticworld.lib.Strings;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.Arrays;

public class BlockHandler {
    public static final ArrayList<String> IMBUED_STONE_TYPE = new ArrayList<String>(Arrays.asList(Strings.IMBUED_STONE_NAME+"Fire", Strings.IMBUED_STONE_NAME+"Water", Strings.IMBUED_STONE_NAME+"Earth", Strings.IMBUED_STONE_NAME+"Air", Strings.IMBUED_STONE_NAME+"Energy"));
    public static final ArrayList<String> BUSH_TYPES = new ArrayList<String>(Arrays.asList(Strings.BUSH_NAME, Strings.POISON_BUSH_NAME, Strings.WEAKNESS_BUSH_NAME, Strings.SLOWNESS_BUSH_NAME, Strings.HARMING_BUSH_NAME,
            Strings.WITHER_BUSH_NAME, Strings.HEALTH_BUSH_NAME, Strings.SPEED_BUSH_NAME, Strings.FIRE_RESISTANCE_BUSH_NAME, Strings.REGEN_BUSH_NAME, Strings.NIGHT_VISION_BUSH_NAME,
            Strings.INVISIBILITY_BUSH_NAME));
	public static Block oreImbuedStone, bush, lightCube, pillarPlatform, pillar, pillarInsert;

	public static void init() {
        oreImbuedStone = GameRegistry.registerBlock(new BlockImbuedStone().setBlockName(Strings.IMBUED_STONE_NAME), ItemBlockMulti.class, Strings.IMBUED_STONE_NAME, IMBUED_STONE_TYPE);
		bush = GameRegistry.registerBlock(new BlockBushes().setBlockName(Strings.BUSH_NAME), ItemBlockMulti.class, Strings.BUSH_NAME, BUSH_TYPES);
		lightCube = GameRegistry.registerBlock(new BlockLightCube().setBlockName(Strings.LIGHT_CUBE_NAME).setBlockTextureName("mysticworld:lightCube"), Strings.LIGHT_CUBE_NAME);
		pillarPlatform = GameRegistry.registerBlock(new BlockPlatform().setBlockName(Strings.PLATFORM_NAME).setBlockTextureName("mysticworld:Platform"), Strings.PLATFORM_NAME);
		pillar = GameRegistry.registerBlock(new BlockPillar().setBlockName(Strings.PILLAR_NAME).setBlockTextureName("mysticworld:Pillar"), Strings.PILLAR_NAME);
		pillarInsert = GameRegistry.registerBlock(new BlockPillarInsert().setBlockName(Strings.PILLAR_INSERT_NAME), Strings.PILLAR_INSERT_NAME);
	}
}
