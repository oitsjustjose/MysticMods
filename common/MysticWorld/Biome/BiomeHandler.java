package MysticWorld.Biome;

import cpw.mods.fml.common.registry.GameRegistry;
import MysticOres.Blocks.BlockHandler;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;

public class BiomeHandler
{
	public static BiomeGenBase Mountain;
	public static BiomeGenBase Tundra;
	public static BiomeGenBase Steppe;
	public static BiomeGenBase Glacier;
	public static BiomeGenBase Jungle;
	
	public static void init()
	{
		initializeBiomes();
		registerBiomes();
		addSpawnBiomes();
		addStructureBiomes();
	}
	
	public static void initializeBiomes()
	{
		Mountain = new BiomeGenMountain(23, Block.stone.blockID, Block.stone.blockID).setColor(9286496).setBiomeName("Mountain").setEnableSnow().setTemperatureRainfall(0.05F, 0.8F).setMinMaxHeight(0.5F, 1.0F);
		Tundra = new BiomeGenTundra(24, 0, 0, 0, 0, Block.blockSnow.blockID, Block.blockSnow.blockID).setColor(9286496).setBiomeName("Tundra").setEnableSnow().setTemperatureRainfall(0.05F, 0.8F).setMinMaxHeight(0.8F, 0.4F);
		Steppe = new BiomeGenBasic(25, 0, 2, 2, 3, Block.grass.blockID, Block.dirt.blockID).setColor(5470985).setBiomeName("Steppe").setMinMaxHeight(0.1F, 0.1F);
		Glacier = new BiomeGenGlacier(26, 0, 0, 0, 0, Block.ice.blockID, Block.ice.blockID).setColor(9474208).setBiomeName("Glacier").setEnableSnow().setTemperatureRainfall(0.05F, 0.8F).setMinMaxHeight(0.5F, 0.7F);
		Jungle = new BiomeGenJungle(27).setColor(5470985).setBiomeName("Jungle").func_76733_a(5470985).setTemperatureRainfall(1.2F, 0.9F).setMinMaxHeight(0.2F, 0.4F);;
	}
	
	public static void registerBiomes()
	{
		GameRegistry.removeBiome(BiomeGenBase.jungle);
		GameRegistry.removeBiome(BiomeGenBase.jungleHills);
	    GameRegistry.addBiome(Mountain);
	    GameRegistry.addBiome(Tundra);
	    GameRegistry.addBiome(Steppe);
	    GameRegistry.addBiome(Glacier);   
	    GameRegistry.addBiome(Jungle);
	}
	
	public static void addSpawnBiomes()
	{
		BiomeManager.addSpawnBiome(Steppe);
	    BiomeManager.addSpawnBiome(Mountain);
	    BiomeManager.addSpawnBiome(Jungle);
	}
	
	public static void addStructureBiomes()
	{
		BiomeManager.addVillageBiome(Steppe, true);
		
		BiomeManager.addStrongholdBiome(Glacier);
		BiomeManager.addStrongholdBiome(Mountain);
		BiomeManager.addStrongholdBiome(Steppe);
		BiomeManager.addStrongholdBiome(Tundra);
		BiomeManager.addStrongholdBiome(Jungle);
	}
}
