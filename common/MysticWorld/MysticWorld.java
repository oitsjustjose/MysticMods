package mysticworld;

import mysticworld.biome.BiomeHandler;
import mysticworld.blocks.BlockHandler;
import mysticworld.entity.EntityHandler;
import mysticworld.items.ItemHandler;
import mysticworld.lib.Booleans;
import mysticworld.tiles.TileEntityHandler;
import mysticworld.util.CommonProxy;
import mysticworld.util.Config;
import mysticworld.util.Localizations;
import mysticworld.util.RecipeHandler;
import mysticworld.util.Reference;
import mysticworld.util.TabMysticWorld;
import mysticworld.util.TickHandler;
import mysticworld.worldgen.WorldGenBushes;
import mysticworld.worldgen.WorldGenStones;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NUMBER)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MysticWorld {
	@Instance(Reference.MOD_ID)
	public static MysticWorld instance;
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	public static final CreativeTabs MysticWorldTab = new TabMysticWorld("MysticWorldTab");

	@EventHandler
	public void load(FMLInitializationEvent event) {
		TickRegistry.registerTickHandler(new TickHandler(), Side.SERVER);
		BlockHandler.init();
		ItemHandler.init();
		TileEntityHandler.init();
		if (Booleans.ENABLE_BUSH_GEN)
			GameRegistry.registerWorldGenerator(new WorldGenBushes());
		GameRegistry.registerWorldGenerator(new WorldGenStones());
		EntityHandler.init();
		RecipeHandler.init();
		Localizations.Initialize();
		proxy.registerRenders();
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Config.initialize(event.getSuggestedConfigurationFile());
		BiomeHandler.init();
	}
}
