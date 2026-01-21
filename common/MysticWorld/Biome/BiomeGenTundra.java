package mysticworld.biome;

import net.minecraft.block.Block;

public class BiomeGenTundra extends BiomeGenBasic {
	public BiomeGenTundra(int id, int treesChunk, int grassChunk, int flowerChunk, int reedsChunk, Block blockTop, Block blockFiller) {
		super(id, treesChunk, grassChunk, flowerChunk, reedsChunk, blockTop, blockFiller);
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.add(new SpawnListEntry(net.minecraft.entity.passive.EntityWolf.class, 5, 4, 4));
	}
}
