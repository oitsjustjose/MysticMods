package mysticworld.biome;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenBasic extends BiomeGenBase {
	public BiomeGenBasic(int id, Block blockTop, Block blockFiller) {
		super(id);
		this.topBlock = blockTop;
		this.fillerBlock = blockFiller;
	}

	public BiomeGenBasic(int id, int treesChunk, int grassChunk, int flowerChunk, int reedsChunk) {
		super(id);
		this.theBiomeDecorator.treesPerChunk = treesChunk;
		this.theBiomeDecorator.grassPerChunk = grassChunk;
		this.theBiomeDecorator.flowersPerChunk = flowerChunk;
		this.theBiomeDecorator.reedsPerChunk = reedsChunk;
	}

	public BiomeGenBasic(int id, int treesChunk, int grassChunk, int flowerChunk, int reedsChunk, Block blockTop, Block blockFiller) {
		this(id, treesChunk, grassChunk, flowerChunk, reedsChunk);
		this.topBlock = blockTop;
		this.fillerBlock = blockFiller;
	}
}
