package mysticores;

import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLMissingMappingsEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameData;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mysticores.blocks.BlockHandler;
import mysticores.items.Items;
import mysticores.util.ConfigurationManager;
import mysticores.util.RecipeManager;
import mysticores.worldgen.WorldGenOres;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = "mysticores", name = "Mystic Ores", version = "0.1")
public final class MysticOres implements IFuelHandler {
	@Instance("mysticores")
	public static MysticOres instance;
    public boolean ENABLE = true;
	public static CreativeTabs MysticOresTab;
    public static final String[] INGOTS = { "ingotVerdite", "ingotMithril", "ingotAdamantine", "ingotIridium", "fuelIridium", "gemTourmaline", "gemAgate", "gemTopaz", "gemAmethyst", "dustMystic",
            " shardBloodstone", "shardGlass", "shardObsidian", "rodObsidian" };
    public static final String[] ORES = { "oreAdamantine", "oreAmethyst", "oreIridium", "oreMithril", "oreSapphire", "oreTopaz", "oreVerdite", "oreBloodstone", "oreBlackSoulstone",
            "oreBlueSoulstone", "oreRedSoulstone", "oreAgate" };

	@Override
	public int getBurnTime(ItemStack fuel) {
		if (fuel.getItem() == Items.Resource && fuel.getItemDamage() == 4)
			return 12800;
		else
			return 0;
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationManager.initialize(event.getSuggestedConfigurationFile());
        if(ENABLE){
            MysticOresTab = new CreativeTabs("MysticOresTab") {

                @Override
                public Item getTabIconItem() {
                    return Item.getItemFromBlock(BlockHandler.BlockBase);
                }

                @Override
                @SideOnly(Side.CLIENT)
                public int func_151243_f()
                {
                    return 7;
                }
            };
            BlockHandler.initialize();
            Items.initialize();
            for (int i = 0; i < INGOTS.length; i++) {
                OreDictionary.registerOre(INGOTS[i], new ItemStack(Items.Resource, 1, i));
            }
            for (int i = 0; i < ORES.length; i++) {
                OreDictionary.registerOre(ORES[i], new ItemStack(BlockHandler.BlockBase, 1, i));
            }
            RecipeManager.initialize();
            GameRegistry.registerWorldGenerator(new WorldGenOres(), 100);
            GameRegistry.registerFuelHandler(this);
        }
	}

    @EventHandler
    public void onRemap(FMLMissingMappingsEvent event){
        for(FMLMissingMappingsEvent.MissingMapping missingMapping : event.get()){
            if(missingMapping.type.name().equals("ITEM") && missingMapping.name.contains("item.")){
                missingMapping.remap(GameData.getItemRegistry().getObject(missingMapping.name.replace("item.mysticores:r", "R").replace("item.", "")));
            }
        }
    }
}