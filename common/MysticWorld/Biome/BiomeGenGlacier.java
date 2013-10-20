package mysticworld.biome;

import java.util.Random;

import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenGlacier extends BiomeGenBase {
	
	public BiomeGenGlacier(int id, int treesChunk, int grassChunk, int flowerChunk, int reedsChunk, int blockTop, int blockFiller) {
		super(id);
		this.topBlock = (byte) blockTop;
		this.fillerBlock = (byte) blockFiller;
		this.theBiomeDecorator.treesPerChunk = treesChunk;
		this.theBiomeDecorator.grassPerChunk = grassChunk;
		this.theBiomeDecorator.flowersPerChunk = flowerChunk;
		this.theBiomeDecorator.reedsPerChunk = reedsChunk;;
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
        this.spawnableCreatureList.add(new SpawnListEntry(net.minecraft.entity.passive.EntityWolf.class, 5, 4, 4));
        this.waterColorMultiplier = 15397370;
	}	
}

