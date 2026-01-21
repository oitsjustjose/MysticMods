package mysticworld.biome;

import mysticworld.lib.Booleans;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;

public class BiomeHandler {
	public static BiomeGenBase Mountain;
	public static BiomeGenBase Tundra;
	public static BiomeGenBase Steppe;
	public static BiomeGenBase Glacier;
	public static BiomeGenBase Jungle;

	public static void init(){
		if (Booleans.ENABLE_JUNGLE_REWRITE) {
            Jungle = new BiomeGenJungle(21).setColor(5470985).setBiomeName("Jungle").func_76733_a(5470985).setTemperatureRainfall(1.2F, 0.9F).setHeight(new BiomeGenBase.Height(0.2F, 0.4F));
			BiomeManager.addSpawnBiome(Jungle);
			BiomeManager.addStrongholdBiome(Jungle);
		}
		if (Booleans.ENABLE_MOUNTAIN_GEN) {
            Mountain = new BiomeGenBasic(53, Blocks.stone, Blocks.stone).setColor(9286496).setBiomeName("Mountain").setEnableSnow().setTemperatureRainfall(0.05F, 0.8F)
                    .setHeight(new BiomeGenBase.Height(0.5F, 1.0F));
			BiomeManager.addSpawnBiome(Mountain);
			BiomeManager.addStrongholdBiome(Mountain);
		}
		if (Booleans.ENABLE_TUNDRA_GEN) {
            Tundra = new BiomeGenTundra(54, 0, 0, 0, 0, Blocks.snow, Blocks.snow).setColor(9286496).setBiomeName("Tundra").setEnableSnow().setTemperatureRainfall(0.05F, 0.8F)
                    .setHeight(new BiomeGenBase.Height(0.8F, 0.4F));
			BiomeManager.addStrongholdBiome(Tundra);
		}
		if (Booleans.ENABLE_STEPPE_GEN) {
            Steppe = new BiomeGenBasic(55, 0, 2, 2, 3, Blocks.grass, Blocks.dirt).setColor(5470985).setBiomeName("Steppe").setHeight(new BiomeGenBase.Height(0.1F, 0.1F));
			BiomeManager.addSpawnBiome(Steppe);
			BiomeManager.addVillageBiome(Steppe, true);
			BiomeManager.addStrongholdBiome(Steppe);
		}
        if (Booleans.ENABLE_GLACIER_GEN) {
            Glacier = new BiomeGenGlacier(56, 0, 0, 0, 0, Blocks.ice, Blocks.ice).setColor(9474208).setBiomeName("Glacier").setEnableSnow().setTemperatureRainfall(0.05F, 0.8F)
                    .setHeight(new BiomeGenBase.Height(0.5F, 0.7F));
            BiomeManager.addStrongholdBiome(Glacier);
        }
	}
}
