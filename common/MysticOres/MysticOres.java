package mysticores;

import java.io.File;

import mysticores.blocks.BlockHandler;
import mysticores.items.IridiumFuelHandler;
import mysticores.items.Items;
import mysticores.util.ConfigurationManager;
import mysticores.util.Localizations;
import mysticores.util.OreDictManager;
import mysticores.util.RecipeManager;
import mysticores.util.TabMysticOres;
import mysticores.worldgen.GeneratorManager;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "Mystic Ores", name = "Mystic Ores", version = "0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MysticOres {
	@Instance("Mystic Ores")
	public static MysticOres instance;
	public static CreativeTabs MysticOresTab = new TabMysticOres(CreativeTabs.getNextID(), "MysticOresTab");

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationManager.initialize(new File(event.getModConfigurationDirectory(), "Mystic Mods/Mystic Ores.cfg"));
		ConfigurationManager.save();
		BlockHandler.Initialize();
		Items.Initialize();
		RecipeManager.Initialize();
		OreDictManager.Initialize();
		GeneratorManager.Initialize();
		Localizations.Initialize();
		GameRegistry.registerFuelHandler(new IridiumFuelHandler());
	}
}
