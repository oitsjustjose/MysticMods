package mysticores;

import mysticores.blocks.BlockHandler;
import mysticores.items.Items;
import mysticores.util.ConfigurationManager;
import mysticores.util.Localizations;
import mysticores.util.OreDictManager;
import mysticores.util.RecipeManager;
import mysticores.util.TabMysticOres;
import mysticores.worldgen.GeneratorManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "MysticOres", name = "Mystic Ores", version = "0.1")
@NetworkMod(clientSideRequired = true)
public class MysticOres implements IFuelHandler {
	@Instance("MysticOres")
	public static MysticOres instance;
	public static final CreativeTabs MysticOresTab = new TabMysticOres("MysticOresTab");

	@Override
	public int getBurnTime(ItemStack fuel) {
		if (fuel.getItem().itemID == Items.Resource.itemID && fuel.getItemDamage() == 4)
			return 12800;
		else
			return 0;
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationManager.initialize(event.getSuggestedConfigurationFile());
		BlockHandler.initialize();
		Items.initialize();
		OreDictManager.initialize();
		RecipeManager.initialize();
		GeneratorManager.initialize();
		Localizations.initialize();
		GameRegistry.registerFuelHandler(this);
	}
}
