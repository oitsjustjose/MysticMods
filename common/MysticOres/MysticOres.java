package MysticOres;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import MysticOres.Blocks.BlockHandler;
import MysticOres.Items.IridiumFuelHandler;
import MysticOres.Items.Items;
import MysticOres.Util.ConfigurationManager;
import MysticOres.Util.Localizations;
import MysticOres.Util.OreDictManager;
import MysticOres.Util.RecipeManager;
import MysticOres.Util.TabMysticOres;
import MysticOres.Worldgen.GeneratorManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "Mystic Ores", name = "Mystic Ores", version = "0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class MysticOres
{
	@Instance("Mystic Ores")
	public static MysticOres instance;
	
	public static CreativeTabs MysticOresTab = new TabMysticOres(CreativeTabs.getNextID(), "MysticOresTab");

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{		
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
