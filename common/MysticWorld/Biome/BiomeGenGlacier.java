package mysticworld.biome;

import net.minecraft.block.Block;

public class BiomeGenGlacier extends BiomeGenTundra {
	public BiomeGenGlacier(int id, int treesChunk, int grassChunk, int flowerChunk, int reedsChunk, Block blockTop, Block blockFiller) {
		super(id, treesChunk, grassChunk, flowerChunk, reedsChunk, blockTop, blockFiller);
		this.waterColorMultiplier = 15397370;
	}
}
