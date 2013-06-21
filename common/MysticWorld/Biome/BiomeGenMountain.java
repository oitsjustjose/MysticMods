package MysticWorld.Biome;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenMountain extends BiomeGenBase {
	
	public BiomeGenMountain(int id, int blockTop, int blockFiller)
	{
		super(id);
		this.topBlock = (byte) blockTop;
		this.fillerBlock = (byte) blockFiller;
	}
}

