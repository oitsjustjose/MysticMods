package mysticruins;

import java.io.File;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "Mystic Ruins", name = "Mystic Ruins", version = "0.1")
@NetworkMod(clientSideRequired = false, serverSideRequired = false)

public class MysticRuins
{
	@EventHandler
    public void preInit(FMLPreInitializationEvent event)
	{
		Config.initialize(new File(event.getModConfigurationDirectory(), "Mystic Mods/Mystic Ruins.cfg"));
        Config.save();
        
		GameRegistry.registerWorldGenerator(new WorldGenRuin());
		GameRegistry.registerWorldGenerator(new WorldGenRuin$1());
		GameRegistry.registerWorldGenerator(new WorldGenMysticDungeon());
	}
}
