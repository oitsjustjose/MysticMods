package mysticruins;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.DungeonHooks;

import java.util.Random;

public class StructureRuin$1 extends WorldGenerator {
	public StructureRuin$1() {
	}

	@Override
	public boolean generate(World world, Random random, int i, int j, int k) {
		int j1 = (i + random.nextInt(8)) - random.nextInt(8);
		int k1 = (j + random.nextInt(4)) - random.nextInt(4);
		int l1 = (k + random.nextInt(8)) - random.nextInt(8);
		if (k1 <= 0) {
			return false;
		}
		if (!world.isAirBlock(j1, k1, l1) || world.getBlock(j1, k1 - 1, l1) != Blocks.grass || !Blocks.pumpkin.canPlaceBlockAt(world, j1, k1, l1)) {
			return false;
		}
		int i2 = random.nextInt(3) + 1;
		if (i2 == 1) {
			int i3 = random.nextInt(8) + 5;
			int l3 = random.nextInt(8) + 5;
			int k4 = random.nextInt(4) + 3;
			int j8 = random.nextInt(100);
            int j5;
			if (j8 <= 20) {
				j5 = 0;
			} else {
				j5 = random.nextInt(4) + 5;
			}
			setBlock(world, j1, k1 - j5, l1, Blocks.stonebrick);
			setBlock(world, j1, (k1 - j5) + 2, l1, Blocks.stonebrick);
            setBlock(world, j1, (k1 - j5) + 4, l1 + 1, Blocks.stonebrick);
            setBlock(world, j1, (k1 - j5) + 3, l1 + 2, Blocks.stonebrick);
            setBlock(world, j1, (k1 - j5) + 1, l1 + 3, Blocks.stonebrick);
            setBlock(world, j1, (k1 - j5) + 2, l1 + 3, Blocks.stonebrick);
            setBlockAndMetadata(world, j1, k1 - j5, l1 + 3, Blocks.stonebrick, 1);
            setBlockAndMetadata(world, j1, (k1 - j5) + 1, l1, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1, (k1 - j5) + 2, l1 + 1, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1, (k1 - j5) + 3, l1 + 1, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1, (k1 - j5) + 5, l1 + 1, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1, (k1 - j5) + 2, l1 + 2, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1, (k1 - j5) + 4, l1 + 2, Blocks.stonebrick, 1);
			setBlock(world, j1, k1 - j5 - k4 - 1, l1 + 2, Blocks.dirt);
			setBlock(world, j1, k1 - j5 - k4, l1 + 2, Blocks.chest);
			ChestFiller.fillWithValuables(world.getTileEntity(j1, k1 - j5 - k4, l1 + 2));
			int l6 = 1;
			int i6 = 0;
			boolean flag = false;
			do {
				if (world.isAirBlock(j1 + l3, k1 - j5 - l6, l1 + l3 + 4) || world.isAirBlock(j1 + l3, k1 - j5 - l6, l1 + l3 + 5) || world.isAirBlock(j1 + l3, k1 - j5 - l6, l1 + l3 + 6)
						|| world.getBlock(j1 + l3, k1 - j5 - l6, l1 + l3 + 4) == Blocks.water || world.getBlock(j1 + l3, k1 - j5 - l6, l1 + l3 + 5) == Blocks.water
						|| world.getBlock(j1 + l3, k1 - j5 - l6, l1 + l3 + 6) == Blocks.water) {
					i6++;
				} else {
					flag = true;
				}
			} while (!flag && l6++ < 12);
			setBlock(world, j1 + l3, k1 - j5 - i6, l1 + l3 + 4, Blocks.stonebrick);
            setBlock(world, j1 + l3 + 2, k1 - j5 - i6, l1 + l3 + 4, Blocks.stonebrick);
            setBlock(world, j1 + l3 + 5, k1 - j5 - i6, l1 + l3 + 4, Blocks.stonebrick);
            setBlock(world, j1 + l3, ((k1 - j5) + 1) - i6, l1 + l3 + 5, Blocks.stonebrick);
            setBlock(world, j1 + l3, ((k1 - j5) + 1) - i6, l1 + l3 + 7, Blocks.stonebrick);
			setBlockAndMetadata(world, j1 + l3, ((k1 - j5) + 1) - i6, l1 + l3 + 4, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 + l3 + 1, k1 - j5 - i6, l1 + l3 + 4, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 + l3 + 1, ((k1 - j5) + 1) - i6, l1 + l3 + 4, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 + l3 + 3, k1 - j5 - i6, l1 + l3 + 4, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 + l3 + 4, k1 - j5 - i6, l1 + l3 + 4, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 + l3, k1 - j5 - i6, l1 + l3 + 5, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 + l3, ((k1 - j5) + 2) - i6, l1 + l3 + 6, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 + l3, ((k1 - j5) + 3) - i6, l1 + l3 + 6, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 + l3, k1 - j5 - i6, l1 + l3 + 7, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 + l3, ((k1 - j5) + 2) - i6, l1 + l3 + 7, Blocks.stonebrick, 1);
			int k7 = random.nextInt(100);
			if (k7 <= 30) {
				setBlock(world, j1 + l3, k1 - j5 - i6 - k4, l1 + l3 + 5, Blocks.mob_spawner);
				TileEntityMobSpawner spawner = (TileEntityMobSpawner) world.getTileEntity(j1 + l3, k1 - j5 - i6 - k4, l1 + l3 + 5);
				if (spawner != null) {
					spawner.func_145881_a().setEntityName(DungeonHooks.getRandomDungeonMob(random));
				}
				setBlock(world, j1 + l3, k1 - j5 - i6 - k4 - 1, l1 + l3 + 5, Blocks.dirt);
			}
			l6 = 1;
			i6 = 0;
			flag = false;
			do {
				if (world.isAirBlock(j1 - i3, k1 - j5 - l6, l1 - 4) || world.isAirBlock(j1 - i3, k1 - j5 - l6, l1 - 5) || world.isAirBlock(j1 - i3 - 1, k1 - j5 - l6, l1 - 5)
						|| world.getBlock(j1 - i3, k1 - j5 - l6, l1 - 4) == Blocks.water || world.getBlock(j1 - i3, k1 - j5 - l6, l1 - 5) == Blocks.water
						|| world.getBlock(j1 - i3 - 1, k1 - j5 - l6, l1 - 5) == Blocks.water) {
					i6++;
				} else {
					flag = true;
				}
			} while (!flag && l6++ < 12);
			setBlock(world, j1 - i3, k1 - j5 - i6, l1 - 4, Blocks.stonebrick);
			setBlockAndMetadata(world, j1 - i3, ((k1 - j5) + 1) - i6, l1 - 4, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 - i3, k1 - j5 - i6, l1 - 5, Blocks.stonebrick, 1);
			setBlock(world, j1 - i3 - 1, k1 - j5 - i6, l1 - 5, Blocks.stonebrick);
			setBlockAndMetadata(world, j1 - i3 - 1, ((k1 - j5) + 1) - i6, l1 - 5, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 - i3 - 1, ((k1 - j5) + 2) - i6, l1 - 5, Blocks.stonebrick, 1);
			setBlock(world, j1 - i3 - 2, k1 - j5 - i6, l1 - 5, Blocks.stonebrick);
			k7 = random.nextInt(100);
			if (k7 <= 60) {
				setBlock(world, j1 - i3 - 1, k1 - j5 - i6 - k4, l1 - 5, Blocks.dirt);
				setBlock(world, j1 - i3 - 1, k1 - j5 - i6 - k4 - 1, l1 - 5, Blocks.dirt);
			}
		}
		if (i2 == 2) {
			int k2 = random.nextInt(8) + 5;
			int j3 = random.nextInt(8) + 5;
			int i4 = random.nextInt(8) + 5;
			int l4 = random.nextInt(4) + 3;
			int k8 = random.nextInt(100);
            int k5;
			if (k8 <= 20) {
				k5 = 0;
			} else {
				k5 = random.nextInt(4) + 5;
			}
			setBlock(world, j1, k1 - k5, l1, Blocks.stonebrick);
			setBlockAndMetadata(world, j1, k1 - k5, l1 + 1, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1, k1 - k5, l1 + 2, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1, k1 - k5, l1 + 3, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1, k1 - k5, l1 + 4, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1, (k1 - k5) + 1, l1 + 2, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1, (k1 - k5) + 2, l1 + 2, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1, (k1 - k5) + 3, l1 + 2, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1, (k1 - k5) + 1, l1 + 1, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 + 1, k1 - k5, l1, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 + 2, k1 - k5, l1, Blocks.stonebrick, 1);
			setBlock(world, j1, k1 - k5 - l4, l1 + 2, Blocks.dirt);
			setBlock(world, j1, k1 - k5 - l4 - 1, l1 + 2, Blocks.dirt);
			int i7 = 1;
			int j6 = 0;
			boolean flag1 = false;
			do {
				if (world.isAirBlock(j1 - k2, k1 - k5 - i7, l1 - 4) || world.isAirBlock(j1 - k2, k1 - k5 - i7, l1 - 5) || world.isAirBlock(j1 - k2 - 1, k1 - k5 - i7, l1 - 5)
						|| world.getBlock(j1 - k2, k1 - k5 - i7, l1 - 4) == Blocks.water || world.getBlock(j1 - k2, k1 - k5 - i7, l1 - 5) == Blocks.water
						|| world.getBlock(j1 - k2 - 1, k1 - k5 - i7, l1 - 5) == Blocks.water) {
					j6++;
				} else {
					flag1 = true;
				}
			} while (!flag1 && i7++ < 12);
			setBlock(world, j1 - k2, k1 - k5 - j6, l1 - 3, Blocks.stonebrick);
			setBlockAndMetadata(world, j1 - k2, k1 - k5 - j6, l1 - 4, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 - k2, ((k1 - k5) + 1) - j6, l1 - 4, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 - k2, ((k1 - k5) + 2) - j6, l1 - 4, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 - k2, k1 - k5 - j6, l1 - 5, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 - k2, ((k1 - k5) + 1) - j6, l1 - 5, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 - k2, ((k1 - k5) + 2) - j6, l1 - 5, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 - k2, ((k1 - k5) + 3) - j6, l1 - 5, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 - k2, ((k1 - k5) + 4) - j6, l1 - 5, Blocks.stonebrick, 1);
			setBlock(world, j1 - k2 - 1, k1 - k5 - j6, l1 - 5, Blocks.stonebrick);
			setBlockAndMetadata(world, j1 - k2 - 1, ((k1 - k5) + 1) - j6, l1 - 5, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 - k2 - 1, ((k1 - k5) + 2) - j6, l1 - 5, Blocks.stonebrick, 1);
			setBlock(world, j1 - k2 - 2, k1 - k5 - j6, l1 - 5, Blocks.stonebrick);
			int l7 = random.nextInt(100);
			if (l7 <= 30) {
				setBlock(world, j1 - k2 - 1, k1 - k5 - j6 - l4, l1 - 5, Blocks.dirt);
				setBlock(world, j1 - k2 - 1, k1 - k5 - j6 - l4 - 1, l1 - 5, Blocks.dirt);
			}
			i7 = 1;
			j6 = 0;
			flag1 = false;
			do {
				if (world.isAirBlock(j1 + i4, k1 - k5 - i7, l1 + 4) || world.isAirBlock(j1 + i4, k1 - k5 - i7, l1 + 6) || world.isAirBlock(j1 + i4, k1 - k5 - i7, l1 + 8)
						|| world.getBlock(j1 + i4, k1 - k5 - i7, l1 + 4) == Blocks.water || world.getBlock(j1 + i4, k1 - k5 - i7, l1 + 6) == Blocks.water
						|| world.getBlock(j1 + i4, k1 - k5 - i7, l1 + 8) == Blocks.water) {
					j6++;
				} else {
					flag1 = true;
				}
			} while (!flag1 && i7++ < 12);
			setBlock(world, j1 + i4, k1 - k5 - j6, l1 + 4, Blocks.stonebrick);
			setBlockAndMetadata(world, j1 + i4, ((k1 - k5) + 1) - j6, l1 + 4, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 + i4 + 1, k1 - k5 - j6, l1 + 4, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 + i4 + 1, ((k1 - k5) + 1) - j6, l1 + 4, Blocks.stonebrick, 1);
			setBlock(world, j1 + i4 + 2, k1 - k5 - j6, l1 + 4, Blocks.stonebrick);
			setBlock(world, j1 + i4 + 3, k1 - k5 - j6, l1 + 4, Blocks.stonebrick);
			setBlock(world, j1 + i4 + 3, ((k1 - k5) + 1) - j6, l1 + 4, Blocks.stonebrick);
			setBlock(world, j1 + i4 + 4, k1 - k5 - j6, l1 + 4, Blocks.stonebrick);
			setBlock(world, j1 + i4 + 5, k1 - k5 - j6, l1 + 4, Blocks.stonebrick);
			setBlockAndMetadata(world, j1 + i4, k1 - k5 - j6, l1 + 5, Blocks.stonebrick, 1);
			setBlock(world, j1 + i4, ((k1 - k5) + 1) - j6, l1 + 5, Blocks.stonebrick);
			setBlockAndMetadata(world, j1 + i4, ((k1 - k5) + 2) - j6, l1 + 6, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 + i4, k1 - k5 - j6, l1 + 7, Blocks.stonebrick, 1);
			setBlock(world, j1 + i4, ((k1 - k5) + 1) - j6, l1 + 7, Blocks.stonebrick);
			setBlockAndMetadata(world, j1 + i4, ((k1 - k5) + 2) - j6, l1 + 7, Blocks.stonebrick, 1);
			setBlock(world, j1 + i4, k1 - k5 - j6, l1 + 8, Blocks.stonebrick);
			setBlockAndMetadata(world, j1 + i4, ((k1 - k5) + 1) - j6, l1 + 8, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 + i4, k1 - k5 - j6, l1 + 9, Blocks.stonebrick, 1);
			l7 = random.nextInt(100);
			if (l7 <= 60) {
				setBlock(world, j1 + i4, k1 - k5 - j6 - l4, l1 + 7, Blocks.dirt);
				setBlock(world, j1 + i4, k1 - k5 - j6 - l4 - 1, l1 + 7, Blocks.dirt);
			}
			i7 = 1;
			j6 = 0;
			flag1 = false;
			do {
				if (world.isAirBlock(j1 - j3, k1 - k5 - i7, l1 + i4) || world.isAirBlock(j1 - j3, k1 - k5 - i7, (l1 + i4) - 2) || world.isAirBlock((j1 - j3) + 1, k1 - k5 - i7, l1 + i4)
						|| world.getBlock(j1 - j3, k1 - k5 - i7, l1 + i4) == Blocks.water || world.getBlock(j1 - j3, k1 - k5 - i7, (l1 + i4) - 2) == Blocks.water
						|| world.getBlock((j1 - j3) + 1, k1 - k5 - i7, l1 + i4) == Blocks.water) {
					j6++;
				} else {
					flag1 = true;
				}
			} while (!flag1 && i7++ < 12);
			setBlock(world, (j1 - j3) + 1, k1 - k5 - j6, l1 + i4, Blocks.stonebrick);
			setBlockAndMetadata(world, (j1 - j3) + 1, ((k1 - k5) + 1) - j6, l1 + i4, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, (j1 - j3) + 1, ((k1 - k5) + 2) - j6, l1 + i4, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, (j1 - j3) + 2, k1 - k5 - j6, l1 + i4, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 - j3, k1 - k5 - j6, (l1 + i4) - 1, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 - j3, ((k1 - k5) + 1) - j6, (l1 + i4) - 1, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 - j3, ((k1 - k5) + 2) - j6, (l1 + i4) - 1, Blocks.stonebrick, 1);
			setBlock(world, j1 - j3, ((k1 - k5) + 3) - j6, (l1 + i4) - 1, Blocks.stonebrick);
			setBlockAndMetadata(world, j1 - j3, ((k1 - k5) + 4) - j6, (l1 + i4) - 1, Blocks.stonebrick, 1);
			setBlock(world, j1 - j3, ((k1 - k5) + 2) - j6, (l1 + i4) - 2, Blocks.stonebrick);
			setBlockAndMetadata(world, j1 - j3, ((k1 - k5) + 3) - j6, (l1 + i4) - 2, Blocks.stonebrick, 1);
			setBlock(world, j1 - j3, ((k1 - k5) + 4) - j6, (l1 + i4) - 2, Blocks.stonebrick);
			setBlockAndMetadata(world, j1 - j3, ((k1 - k5) + 5) - j6, (l1 + i4) - 2, Blocks.stonebrick, 1);
			setBlock(world, j1 - j3, k1 - k5 - j6, (l1 + i4) - 3, Blocks.stonebrick);
			setBlock(world, j1 - j3, ((k1 - k5) + 1) - j6, (l1 + i4) - 3, Blocks.stonebrick);
			setBlock(world, j1 - j3, ((k1 - k5) + 2) - j6, (l1 + i4) - 3, Blocks.stonebrick);
			setBlockAndMetadata(world, j1 - j3, ((k1 - k5) + 3) - j6, (l1 + i4) - 3, Blocks.stonebrick, 1);
			l7 = random.nextInt(100);
			if (l7 <= 30) {
				setBlock(world, j1 - j3, k1 - k5 - j6 - l4, (l1 + i4) - 2, Blocks.dirt);
				setBlock(world, j1 - j3, k1 - k5 - j6 - l4 - 1, (l1 + i4) - 2, Blocks.dirt);
			}
			i7 = 1;
			j6 = 0;
			flag1 = false;
			do {
				if (world.isAirBlock(j1 + j3 + 4, k1 - k5 - i7, l1 - 6) || world.isAirBlock(j1 + j3 + 4, k1 - k5 - i7, l1 - 7) || world.isAirBlock(j1 + j3 + 5, k1 - k5 - i7, l1 - 7)
						|| world.getBlock(j1 + j3 + 4, k1 - k5 - i7, l1 - 6) == Blocks.water || world.getBlock(j1 + j3 + 4, k1 - k5 - i7, l1 - 7) == Blocks.water
						|| world.getBlock(j1 + j3 + 5, k1 - k5 - i7, l1 - 7) == Blocks.water) {
					j6++;
				} else {
					flag1 = true;
				}
			} while (!flag1 && i7++ < 12);
			setBlock(world, j1 + j3 + 4, k1 - k5 - j6, l1 - 6, Blocks.stonebrick);
			setBlockAndMetadata(world, j1 + j3 + 4, ((k1 - k5) + 1) - j6, l1 - 6, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 + j3 + 4, ((k1 - k5) + 2) - j6, l1 - 6, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 + j3 + 4, k1 - k5 - j6, l1 - 7, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 + j3 + 4, ((k1 - k5) + 1) - j6, l1 - 7, Blocks.stonebrick, 1);
			setBlock(world, j1 + j3 + 5, k1 - k5 - j6, l1 - 7, Blocks.stonebrick);
			setBlockAndMetadata(world, j1 + j3 + 5, ((k1 - k5) + 1) - j6, l1 - 7, Blocks.stonebrick, 1);
			setBlockAndMetadata(world, j1 + j3 + 5, ((k1 - k5) + 2) - j6, l1 - 7, Blocks.stonebrick, 1);
			setBlock(world, j1 + j3 + 6, k1 - k5 - j6, l1 - 7, Blocks.stonebrick);
			l7 = random.nextInt(100);
			if (l7 <= 30) {
				setBlock(world, j1 + j3 + 4, k1 - k5 - j6 - l4, l1 - 7, Blocks.dirt);
				setBlock(world, j1 + j3 + 4, k1 - k5 - j6 - l4 - 1, l1 - 7, Blocks.dirt);
			}
		}
		if (i2 != 3) {
			return true;
		}
		int l2 = random.nextInt(8) + 5;
		int k3 = random.nextInt(8) + 5;
		int j4 = random.nextInt(8) + 5;
		int i5 = random.nextInt(4) + 3;
		int l8 = random.nextInt(100);
        int l5;
		if (l8 <= 20) {
			l5 = 0;
		} else {
			l5 = random.nextInt(4) + 5;
		}
		setBlock(world, j1, k1 - l5, l1, Blocks.stonebrick);
		setBlockAndMetadata(world, j1 - 1, k1 - l5, l1, Blocks.stonebrick, 1);
		setBlockAndMetadata(world, j1 - 1, (k1 - l5) + 1, l1, Blocks.stonebrick, 1);
		setBlockAndMetadata(world, j1 - 1, (k1 - l5) + 2, l1, Blocks.stonebrick, 1);
		setBlockAndMetadata(world, j1 - 1, (k1 - l5) + 3, l1, Blocks.stonebrick, 1);
		setBlock(world, j1, (k1 - l5) + 1, l1, Blocks.stonebrick);
		setBlockAndMetadata(world, j1, (k1 - l5) + 2, l1, Blocks.stonebrick, 1);
		setBlockAndMetadata(world, j1, (k1 - l5) + 3, l1, Blocks.stonebrick, 1);
		setBlockAndMetadata(world, j1, (k1 - l5) + 4, l1, Blocks.stonebrick, 1);
		setBlockAndMetadata(world, j1, (k1 - l5) + 5, l1, Blocks.stonebrick, 1);
		setBlock(world, j1, k1 - l5, l1 + 1, Blocks.stonebrick);
		setBlockAndMetadata(world, j1, (k1 - l5) + 2, l1 + 1, Blocks.stonebrick, 1);
		setBlock(world, j1, k1 - l5, l1 + 2, Blocks.stonebrick);
		setBlockAndMetadata(world, j1, (k1 - l5) + 1, l1 + 2, Blocks.stonebrick, 1);
		setBlock(world, j1, k1 - l5 - i5, l1 + 1, Blocks.dirt);
		setBlock(world, j1, k1 - l5 - i5 - 1, l1 + 1, Blocks.dirt);
		int j7 = 1;
		int k6 = 0;
		boolean flag2 = false;
		do {
			if (world.isAirBlock(j1 + k3 + l2, k1 - l5 - j7, l1 + j4 + 2) || world.isAirBlock(j1 + k3 + l2, k1 - l5 - j7, l1 + j4 + 3) || world.isAirBlock(j1 + k3 + l2, k1 - l5 - j7, l1 + j4 + 4)
					|| world.getBlock(j1 + k3 + l2, k1 - l5 - j7, l1 + j4 + 2) == Blocks.water || world.getBlock(j1 + k3 + l2, k1 - l5 - j7, l1 + j4 + 3) == Blocks.water
					|| world.getBlock(j1 + k3 + l2, k1 - l5 - j7, l1 + j4 + 4) == Blocks.water) {
				k6++;
			} else {
				flag2 = true;
			}
		} while (!flag2 && j7++ < 12);
		setBlock(world, j1 + k3 + l2, k1 - l5 - k6, l1 + j4, Blocks.stonebrick);
		setBlockAndMetadata(world, j1 + k3 + l2, ((k1 - l5) + 1) - k6, l1 + j4, Blocks.stonebrick, 1);
		setBlockAndMetadata(world, j1 + k3 + l2 + 1, k1 - l5 - k6, l1 + j4, Blocks.stonebrick, 1);
		setBlockAndMetadata(world, j1 + k3 + l2 + 1, ((k1 - l5) + 1) - k6, l1 + j4, Blocks.stonebrick, 1);
		setBlockAndMetadata(world, j1 + k3 + l2 + 2, k1 - l5 - k6, l1 + j4, Blocks.stonebrick, 1);
		setBlockAndMetadata(world, j1 + k3 + l2 + 3, k1 - l5 - k6, l1 + j4, Blocks.stonebrick, 1);
		setBlock(world, j1 + k3 + l2, k1 - l5 - k6, l1 + j4 + 1, Blocks.stonebrick);
		setBlockAndMetadata(world, j1 + k3 + l2, ((k1 - l5) + 1) - k6, l1 + j4 + 1, Blocks.stonebrick, 1);
		setBlockAndMetadata(world, j1 + k3 + l2, ((k1 - l5) + 2) - k6, l1 + j4 + 1, Blocks.stonebrick, 1);
		setBlockAndMetadata(world, j1 + k3 + l2, ((k1 - l5) + 3) - k6, l1 + j4 + 1, Blocks.stonebrick, 1);
		setBlock(world, j1 + k3 + l2, k1 - l5 - k6, l1 + j4 + 2, Blocks.stonebrick);
		setBlockAndMetadata(world, j1 + k3 + l2, ((k1 - l5) + 2) - k6, l1 + j4 + 2, Blocks.stonebrick, 1);
		setBlock(world, j1 + k3 + l2, k1 - l5 - k6, l1 + j4 + 3, Blocks.stonebrick);
		setBlockAndMetadata(world, j1 + k3 + l2, ((k1 - l5) + 1) - k6, l1 + j4 + 3, Blocks.stonebrick, 1);
		setBlock(world, j1 + k3 + l2, k1 - l5 - k6, l1 + j4 + 4, Blocks.stonebrick);
		setBlock(world, j1 + k3 + l2, k1 - l5 - k6, l1 + j4 + 6, Blocks.stonebrick);
		int i8 = random.nextInt(100);
		if (i8 <= 30) {
			setBlock(world, j1 + k3 + l2, k1 - l5 - k6 - i5, l1 + j4 + 1, Blocks.dirt);
			setBlock(world, j1 + k3 + l2, k1 - l5 - k6 - i5 - 1, l1 + j4 + 1, Blocks.dirt);
		}
		j7 = 1;
		k6 = 0;
		flag2 = false;
		do {
			if (world.isAirBlock(j1 - k3, k1 - l5 - j7, l1 - l2 - 2) || world.isAirBlock(j1 - k3, k1 - l5 - j7, l1 - l2 - 4) || world.isAirBlock(j1 - k3 - 2, k1 - l5 - j7, l1 - l2 - 6)
					|| world.getBlock(j1 - k3, k1 - l5 - j7, l1 - l2 - 2) == Blocks.water || world.getBlock(j1 - k3, k1 - l5 - j7, l1 - l2 - 4) == Blocks.water
					|| world.getBlock(j1 - k3 - 2, k1 - l5 - j7, l1 - l2 - 6) == Blocks.water) {
				k6++;
			} else {
				flag2 = true;
			}
		} while (!flag2 && j7++ < 12);
		setBlock(world, j1 - k3, k1 - l5 - k6, l1 - l2 - 1, Blocks.stonebrick);
		setBlock(world, j1 - k3, (k1 - l5 - k6) + 1, l1 - l2 - 1, Blocks.stonebrick);
		setBlockAndMetadata(world, j1 - k3, (k1 - l5 - k6) + 2, l1 - l2 - 1, Blocks.stonebrick, 1);
		setBlockAndMetadata(world, j1 - k3, k1 - l5 - k6, l1 - l2 - 2, Blocks.stonebrick, 1);
		setBlockAndMetadata(world, j1 - k3, ((k1 - l5) + 1) - k6, l1 - l2 - 2, Blocks.stonebrick, 1);
		setBlock(world, j1 - k3, k1 - l5 - k6, l1 - l2 - 3, Blocks.stonebrick);
		setBlockAndMetadata(world, j1 - k3, ((k1 - l5) + 1) - k6, l1 - l2 - 3, Blocks.stonebrick, 1);
		setBlockAndMetadata(world, j1 - k3, k1 - l5 - k6, l1 - l2 - 4, Blocks.stonebrick, 1);
		setBlockAndMetadata(world, j1 - k3 - 1, k1 - l5 - k6, l1 - l2 - 6, Blocks.stonebrick, 1);
		setBlock(world, j1 - k3 - 2, k1 - l5 - k6, l1 - l2 - 6, Blocks.stonebrick);
		setBlock(world, j1 - k3 - 2, ((k1 - l5) + 1) - k6, l1 - l2 - 6, Blocks.stonebrick);
		setBlock(world, j1 - k3 - 3, k1 - l5 - k6, l1 - l2 - 6, Blocks.stonebrick);
		i8 = random.nextInt(100);
		if (i8 <= 60) {
			setBlock(world, j1 - k3 - 1, k1 - l5 - k6 - i5, l1 - l2 - 6, Blocks.dirt);
			setBlock(world, j1 - k3 - 1, k1 - l5 - k6 - i5 - 1, l1 - l2 - 6, Blocks.dirt);
		}
		j7 = 1;
		k6 = 0;
		flag2 = false;
		do {
			if (world.isAirBlock(j1 + l2, k1 - l5 - j7, l1 + j4) || world.isAirBlock(j1 + l2 + 2, k1 - l5 - j7, l1 + j4) || world.isAirBlock(j1 + l2 + 4, k1 - l5 - j7, l1 + j4)
					|| world.getBlock(j1 + l2, k1 - l5 - j7, l1 + j4) == Blocks.water || world.getBlock(j1 + l2 + 2, k1 - l5 - j7, l1 + j4) == Blocks.water
					|| world.getBlock(j1 + l2 + 4, k1 - l5 - j7, l1 + j4) == Blocks.water) {
				k6++;
			} else {
				flag2 = true;
			}
		} while (!flag2 && j7++ < 12);
		setBlock(world, j1 + l2, k1 - l5 - k6, l1 + j4, Blocks.stonebrick);
		setBlockAndMetadata(world, j1 + l2 + 1, k1 - l5 - k6, l1 + j4, Blocks.stonebrick, 1);
		setBlockAndMetadata(world, j1 + l2 + 1, ((k1 - l5) + 1) - k6, l1 + j4, Blocks.stonebrick, 1);
		setBlock(world, j1 + l2 + 1, ((k1 - l5) + 2) - k6, l1 + j4, Blocks.stonebrick);
		setBlockAndMetadata(world, j1 + l2 + 1, ((k1 - l5) + 3) - k6, l1 + j4, Blocks.stonebrick, 1);
		setBlock(world, j1 + l2 + 2, k1 - l5 - k6, l1 + j4, Blocks.stonebrick);
		setBlock(world, j1 + l2 + 2, ((k1 - l5) + 1) - k6, l1 + j4, Blocks.stonebrick);
		setBlockAndMetadata(world, j1 + l2 + 2, ((k1 - l5) + 2) - k6, l1 + j4, Blocks.stonebrick, 1);
		setBlock(world, j1 + l2 + 3, ((k1 - l5) + 2) - k6, l1 + j4, Blocks.stonebrick);
		setBlockAndMetadata(world, j1 + l2 + 4, k1 - l5 - k6, l1 + j4, Blocks.stonebrick, 1);
		setBlockAndMetadata(world, j1 + l2 + 4, ((k1 - l5) + 1) - k6, l1 + j4, Blocks.stonebrick, 1);
		setBlockAndMetadata(world, j1 + l2 + 5, k1 - l5 - k6, l1 + j4, Blocks.stonebrick, 1);
		i8 = random.nextInt(100);
		if (i8 <= 30) {
			setBlock(world, j1 + l2 + 2, k1 - l5 - k6 - i5, l1 + j4, Blocks.dirt);
			setBlock(world, j1 + l2 + 2, k1 - l5 - k6 - i5 - 1, l1 + j4, Blocks.dirt);
		}
		j7 = 1;
		k6 = 0;
		flag2 = false;
		do {
			if (world.isAirBlock(j1 - 3, k1 - l5 - j7, l1 + k3 + 1) || world.isAirBlock(j1 - 3, k1 - l5 - j7, l1 + k3 + 3) || world.isAirBlock(j1 - 3, k1 - l5 - j7, l1 + k3 + 4)
					|| world.getBlock(j1 - 3, k1 - l5 - j7, l1 + k3 + 1) == Blocks.water || world.getBlock(j1 - 3, k1 - l5 - j7, l1 + k3 + 3) == Blocks.water
					|| world.getBlock(j1 - 3, k1 - l5 - j7, l1 + k3 + 4) == Blocks.water) {
				k6++;
			} else {
				flag2 = true;
			}
		} while (!flag2 && j7++ < 12);
		setBlock(world, j1 - 3, k1 - l5 - k6, l1 + k3, Blocks.stonebrick);
		setBlockAndMetadata(world, j1 - 3, ((k1 - l5) + 1) - k6, l1 + k3, Blocks.stonebrick, 1);
		setBlockAndMetadata(world, j1 - 3, ((k1 - l5) + 2) - k6, l1 + k3 + 1, Blocks.stonebrick, 1);
		setBlockAndMetadata(world, j1 - 3, k1 - l5 - k6, l1 + k3 + 2, Blocks.stonebrick, 1);
		setBlockAndMetadata(world, j1 - 3, ((k1 - l5) + 1) - k6, l1 + k3 + 2, Blocks.stonebrick, 1);
		setBlock(world, j1 - 3, ((k1 - l5) + 2) - k6, l1 + k3 + 2, Blocks.stonebrick);
		setBlock(world, j1 - 3, k1 - l5 - k6, l1 + k3 + 3, Blocks.stonebrick);
		setBlock(world, j1 - 3, ((k1 - l5) + 1) - k6, l1 + k3 + 3, Blocks.stonebrick);
		setBlock(world, j1 - 3, k1 - l5 - k6, l1 + k3 + 4, Blocks.stonebrick);
		setBlockAndMetadata(world, j1 - 3, ((k1 - l5) + 1) - k6, l1 + k3 + 4, Blocks.stonebrick, 1);
		setBlockAndMetadata(world, j1 - 3, k1 - l5 - k6, l1 + k3 + 5, Blocks.stonebrick, 1);
		i8 = random.nextInt(100);
		if (i8 <= 30) {
			setBlock(world, j1 - 3, k1 - l5 - k6 - i5 - 1, l1 + k3 + 3, Blocks.dirt);
			setBlock(world, j1 - 3, k1 - l5 - k6 - i5, l1 + k3 + 3, Blocks.chest);
			ChestFiller.fillWithRares(world.getTileEntity(j1 - 3, k1 - l5 - k6 - i5, l1 + k3 + 3));
		}
		return true;
	}

    private void setBlock(World w, int x, int y, int z){
        func_150515_a(w, x, y, z, Blocks.air);
    }

    private void setBlock(World w, int x, int y, int z, Block bl){
        func_150515_a(w, x, y, z, bl);
    }

    private void setBlockAndMetadata(World w, int x, int y, int z, Block bl, int meta){
        setBlockAndNotifyAdequately(w, x, y, z, bl, meta);
    }
}
