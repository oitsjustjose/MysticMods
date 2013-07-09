package MysticRuins;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class StructureRuin$1 extends WorldGenerator
{

    public StructureRuin$1()
    {
    }

    public boolean generate(World world, Random random, int i, int j, int k)
    {
        int l = random.nextInt(100);
        if(l >= 10)
        {
            return false;
        }
        for(int i1 = 0; i1 < 1; i1++)
        {
            int j1 = (i + random.nextInt(8)) - random.nextInt(8);
            int k1 = (j + random.nextInt(4)) - random.nextInt(4);
            int l1 = (k + random.nextInt(8)) - random.nextInt(8);
            if(!world.isAirBlock(j1, k1, l1) || world.getBlockId(j1, k1 - 1, l1) != Block.grass.blockID || !Block.pumpkin.canPlaceBlockAt(world, j1, k1, l1))
            {
                continue;
            } 
            int i2 = random.nextInt(3) + 1;
            if(i2 == 1)
            {
                int j2 = random.nextInt(8) + 5;
                int i3 = random.nextInt(8) + 5;
                int l3 = random.nextInt(8) + 5;
                int k4 = random.nextInt(4) + 3;
                int j5 = 1;
                int i6 = 0;
                int l6 = 1;
                boolean flag = false;
                int k7 = random.nextInt(100);
                int j8 = random.nextInt(100);
                if(j8 <= 20)
                {
                    j5 = 0;
                } else
                {
                    j5 = random.nextInt(4) + 5;
                }
                world.setBlock(j1, k1 - j5, l1, Block.stoneBrick.blockID);
                world.setBlock(j1, (k1 - j5) + 1, l1, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1, (k1 - j5) + 2, l1, Block.stoneBrick.blockID);
                world.setBlock(j1, (k1 - j5) + 2, l1 + 1, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1, (k1 - j5) + 3, l1 + 1, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1, (k1 - j5) + 4, l1 + 1, Block.stoneBrick.blockID);
                world.setBlock(j1, (k1 - j5) + 5, l1 + 1, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1, (k1 - j5) + 2, l1 + 2, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1, (k1 - j5) + 3, l1 + 2, Block.stoneBrick.blockID);
                world.setBlock(j1, (k1 - j5) + 4, l1 + 2, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1, k1 - j5, l1 + 3, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1, (k1 - j5) + 1, l1 + 3, Block.stoneBrick.blockID);
                world.setBlock(j1, (k1 - j5) + 2, l1 + 3, Block.stoneBrick.blockID);
                
                world.setBlock(j1, k1 - j5 - k4, l1 + 2, Block.chest.blockID);
                TileEntityChest tileentitychest = (TileEntityChest) world.getBlockTileEntity(j1, k1 - j5 - k4, l1 + 2);
                Random rand = new Random();
                for(int slot = 0; slot < tileentitychest.getSizeInventory(); slot++)
                {
                	int num = rand.nextInt(32);
                	
                	if(num == 1)
                	{
                		tileentitychest.setInventorySlotContents(slot, new ItemStack(Item.pickaxeIron, 1, 0));
                	}
                	
                	if(num == 2)
                	{
                		tileentitychest.setInventorySlotContents(slot, new ItemStack(Item.axeIron, 1, 0));
                	}
                	
                	if(num == 3)
                	{
                		tileentitychest.setInventorySlotContents(slot, new ItemStack(Item.swordIron, 1, 0));
                	}
                	
                	if(num == 4)
                	{
                		tileentitychest.setInventorySlotContents(slot, new ItemStack(Item.shovelIron, 1, 0));
                	}
                	
                	if(num == 5)
                	{
                		tileentitychest.setInventorySlotContents(slot,  new ItemStack(Item.ingotGold, 1, 0));
                	}
                	
                	if(num == 6)
                	{
                		tileentitychest.setInventorySlotContents(slot, new ItemStack(Item.ingotIron, 1, 0));
                	}
                }
                
                
                world.setBlock(j1, k1 - j5 - k4 - 1, l1 + 2, Block.dirt.blockID);
                l6 = 1;
                i6 = 0;
                flag = false;
                do
                {
                    if(world.isAirBlock(j1 + l3, k1 - j5 - l6, l1 + l3 + 4) || world.isAirBlock(j1 + l3, k1 - j5 - l6, l1 + l3 + 5) || world.isAirBlock(j1 + l3, k1 - j5 - l6, l1 + l3 + 6) || world.getBlockId(j1 + l3, k1 - j5 - l6, l1 + l3 + 4) == Block.waterStill.blockID || world.getBlockId(j1 + l3, k1 - j5 - l6, l1 + l3 + 5) == Block.waterStill.blockID || world.getBlockId(j1 + l3, k1 - j5 - l6, l1 + l3 + 6) == Block.waterStill.blockID)
                    {
                        i6++;
                    } else
                    {
                        flag = true;
                    }
                } while(!flag && l6++ < 12);
                world.setBlock(j1 + l3, k1 - j5 - i6, l1 + l3 + 4, Block.stoneBrick.blockID);
                world.setBlock(j1 + l3, ((k1 - j5) + 1) - i6, l1 + l3 + 4, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 + l3 + 1, k1 - j5 - i6, l1 + l3 + 4, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 + l3 + 1, ((k1 - j5) + 1) - i6, l1 + l3 + 4, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 + l3 + 2, k1 - j5 - i6, l1 + l3 + 4, Block.stoneBrick.blockID);
                world.setBlock(j1 + l3 + 3, k1 - j5 - i6, l1 + l3 + 4, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 + l3 + 4, k1 - j5 - i6, l1 + l3 + 4, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 + l3 + 5, k1 - j5 - i6, l1 + l3 + 4, Block.stoneBrick.blockID);
                world.setBlock(j1 + l3, k1 - j5 - i6, l1 + l3 + 5, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 + l3, ((k1 - j5) + 1) - i6, l1 + l3 + 5, Block.stoneBrick.blockID);
                world.setBlock(j1 + l3, ((k1 - j5) + 2) - i6, l1 + l3 + 6, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 + l3, ((k1 - j5) + 3) - i6, l1 + l3 + 6, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 + l3, k1 - j5 - i6, l1 + l3 + 7, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 + l3, ((k1 - j5) + 1) - i6, l1 + l3 + 7, Block.stoneBrick.blockID);
                world.setBlock(j1 + l3, ((k1 - j5) + 2) - i6, l1 + l3 + 7, Block.stoneBrick.blockID, 1, 2);
                k7 = random.nextInt(100);
                if(k7 <= 30)
                {
                    world.setBlock(j1 + l3, k1 - j5 - i6 - k4, l1 + l3 + 5, Block.mobSpawner.blockID);
                    TileEntityMobSpawner spawner = (TileEntityMobSpawner) world.getBlockTileEntity(j1 + l3, k1 - j5 - i6 - k4, l1 + l3 + 5);
                    if(spawner != null)
                    {
                    	spawner.getSpawnerLogic().setMobID("Zombie");
                    }           
                    
                    
                    
                    
                    world.setBlock(j1 + l3, k1 - j5 - i6 - k4 - 1, l1 + l3 + 5, Block.dirt.blockID);
                }
                l6 = 1;
                i6 = 0;
                flag = false;
                do
                {
                    if(world.isAirBlock(j1 - i3, k1 - j5 - l6, l1 - 4) || world.isAirBlock(j1 - i3, k1 - j5 - l6, l1 - 5) || world.isAirBlock(j1 - i3 - 1, k1 - j5 - l6, l1 - 5) || world.getBlockId(j1 - i3, k1 - j5 - l6, l1 - 4) == Block.waterStill.blockID || world.getBlockId(j1 - i3, k1 - j5 - l6, l1 - 5) == Block.waterStill.blockID || world.getBlockId(j1 - i3 - 1, k1 - j5 - l6, l1 - 5) == Block.waterStill.blockID)
                    {
                        i6++;
                    } else
                    {
                        flag = true;
                    }
                } while(!flag && l6++ < 12);
                world.setBlock(j1 - i3, k1 - j5 - i6, l1 - 4, Block.stoneBrick.blockID);
                world.setBlock(j1 - i3, ((k1 - j5) + 1) - i6, l1 - 4, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 - i3, k1 - j5 - i6, l1 - 5, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 - i3 - 1, k1 - j5 - i6, l1 - 5, Block.stoneBrick.blockID);
                world.setBlock(j1 - i3 - 1, ((k1 - j5) + 1) - i6, l1 - 5, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 - i3 - 1, ((k1 - j5) + 2) - i6, l1 - 5, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 - i3 - 2, k1 - j5 - i6, l1 - 5, Block.stoneBrick.blockID);
                k7 = random.nextInt(100);
                if(k7 <= 60)
                {
                    world.setBlock(j1 - i3 - 1, k1 - j5 - i6 - k4, l1 - 5, Block.dirt.blockID);
                    world.setBlock(j1 - i3 - 1, k1 - j5 - i6 - k4 - 1, l1 - 5, Block.dirt.blockID);
                }
            }
            if(i2 == 2)
            {
                int k2 = random.nextInt(8) + 5;
                int j3 = random.nextInt(8) + 5;
                int i4 = random.nextInt(8) + 5;
                int l4 = random.nextInt(4) + 3;
                int k5 = 1;
                int j6 = 0;
                int i7 = 1;
                boolean flag1 = false;
                int l7 = random.nextInt(100);
                int k8 = random.nextInt(100);
                if(k8 <= 20)
                {
                    k5 = 0;
                } else
                {
                    k5 = random.nextInt(4) + 5;
                }
                world.setBlock(j1, k1 - k5, l1, Block.stoneBrick.blockID);
                world.setBlock(j1, k1 - k5, l1 + 1, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1, k1 - k5, l1 + 2, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1, k1 - k5, l1 + 3, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1, k1 - k5, l1 + 4, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1, (k1 - k5) + 1, l1 + 2, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1, (k1 - k5) + 2, l1 + 2, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1, (k1 - k5) + 3, l1 + 2, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1, (k1 - k5) + 1, l1 + 1, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 + 1, k1 - k5, l1, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 + 2, k1 - k5, l1, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1, k1 - k5 - l4, l1 + 2, Block.dirt.blockID);
                world.setBlock(j1, k1 - k5 - l4 - 1, l1 + 2, Block.dirt.blockID);
                i7 = 1;
                j6 = 0;
                flag1 = false;
                do
                {
                    if(world.isAirBlock(j1 - k2, k1 - k5 - i7, l1 - 4) || world.isAirBlock(j1 - k2, k1 - k5 - i7, l1 - 5) || world.isAirBlock(j1 - k2 - 1, k1 - k5 - i7, l1 - 5) || world.getBlockId(j1 - k2, k1 - k5 - i7, l1 - 4) == Block.waterStill.blockID || world.getBlockId(j1 - k2, k1 - k5 - i7, l1 - 5) == Block.waterStill.blockID || world.getBlockId(j1 - k2 - 1, k1 - k5 - i7, l1 - 5) == Block.waterStill.blockID)
                    {
                        j6++;
                    } else
                    {
                        flag1 = true;
                    }
                } while(!flag1 && i7++ < 12);
                world.setBlock(j1 - k2, k1 - k5 - j6, l1 - 3, Block.stoneBrick.blockID);
                world.setBlock(j1 - k2, k1 - k5 - j6, l1 - 4, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 - k2, ((k1 - k5) + 1) - j6, l1 - 4, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 - k2, ((k1 - k5) + 2) - j6, l1 - 4, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 - k2, k1 - k5 - j6, l1 - 5, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 - k2, ((k1 - k5) + 1) - j6, l1 - 5, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 - k2, ((k1 - k5) + 2) - j6, l1 - 5, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 - k2, ((k1 - k5) + 3) - j6, l1 - 5, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 - k2, ((k1 - k5) + 4) - j6, l1 - 5, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 - k2 - 1, k1 - k5 - j6, l1 - 5, Block.stoneBrick.blockID);
                world.setBlock(j1 - k2 - 1, ((k1 - k5) + 1) - j6, l1 - 5, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 - k2 - 1, ((k1 - k5) + 2) - j6, l1 - 5, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 - k2 - 2, k1 - k5 - j6, l1 - 5, Block.stoneBrick.blockID);
                l7 = random.nextInt(100);
                if(l7 <= 30)
                {
                    world.setBlock(j1 - k2 - 1, k1 - k5 - j6 - l4, l1 - 5, Block.dirt.blockID);
                    world.setBlock(j1 - k2 - 1, k1 - k5 - j6 - l4 - 1, l1 - 5, Block.dirt.blockID);
                }
                i7 = 1;
                j6 = 0;
                flag1 = false;
                do
                {
                    if(world.isAirBlock(j1 + i4, k1 - k5 - i7, l1 + 4) || world.isAirBlock(j1 + i4, k1 - k5 - i7, l1 + 6) || world.isAirBlock(j1 + i4, k1 - k5 - i7, l1 + 8) || world.getBlockId(j1 + i4, k1 - k5 - i7, l1 + 4) == Block.waterStill.blockID || world.getBlockId(j1 + i4, k1 - k5 - i7, l1 + 6) == Block.waterStill.blockID || world.getBlockId(j1 + i4, k1 - k5 - i7, l1 + 8) == Block.waterStill.blockID)
                    {
                        j6++;
                    } else
                    {
                        flag1 = true;
                    }
                } while(!flag1 && i7++ < 12);
                world.setBlock(j1 + i4, k1 - k5 - j6, l1 + 4, Block.stoneBrick.blockID);
                world.setBlock(j1 + i4, ((k1 - k5) + 1) - j6, l1 + 4, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 + i4 + 1, k1 - k5 - j6, l1 + 4, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 + i4 + 1, ((k1 - k5) + 1) - j6, l1 + 4, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 + i4 + 2, k1 - k5 - j6, l1 + 4, Block.stoneBrick.blockID);
                world.setBlock(j1 + i4 + 3, k1 - k5 - j6, l1 + 4, Block.stoneBrick.blockID);
                world.setBlock(j1 + i4 + 3, ((k1 - k5) + 1) - j6, l1 + 4, Block.stoneBrick.blockID);
                world.setBlock(j1 + i4 + 4, k1 - k5 - j6, l1 + 4, Block.stoneBrick.blockID);
                world.setBlock(j1 + i4 + 5, k1 - k5 - j6, l1 + 4, Block.stoneBrick.blockID);
                world.setBlock(j1 + i4, k1 - k5 - j6, l1 + 5, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 + i4, ((k1 - k5) + 1) - j6, l1 + 5, Block.stoneBrick.blockID);
                world.setBlock(j1 + i4, ((k1 - k5) + 2) - j6, l1 + 6, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 + i4, k1 - k5 - j6, l1 + 7, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 + i4, ((k1 - k5) + 1) - j6, l1 + 7, Block.stoneBrick.blockID);
                world.setBlock(j1 + i4, ((k1 - k5) + 2) - j6, l1 + 7, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 + i4, k1 - k5 - j6, l1 + 8, Block.stoneBrick.blockID);
                world.setBlock(j1 + i4, ((k1 - k5) + 1) - j6, l1 + 8, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 + i4, k1 - k5 - j6, l1 + 9, Block.stoneBrick.blockID, 1, 2);
                l7 = random.nextInt(100);
                if(l7 <= 60)
                {
                    world.setBlock(j1 + i4, k1 - k5 - j6 - l4, l1 + 7, Block.dirt.blockID);
                    world.setBlock(j1 + i4, k1 - k5 - j6 - l4 - 1, l1 + 7, Block.dirt.blockID);
                }
                i7 = 1;
                j6 = 0;
                flag1 = false;
                do
                {
                    if(world.isAirBlock(j1 - j3, k1 - k5 - i7, l1 + i4) || world.isAirBlock(j1 - j3, k1 - k5 - i7, (l1 + i4) - 2) || world.isAirBlock((j1 - j3) + 1, k1 - k5 - i7, l1 + i4) || world.getBlockId(j1 - j3, k1 - k5 - i7, l1 + i4) == Block.waterStill.blockID || world.getBlockId(j1 - j3, k1 - k5 - i7, (l1 + i4) - 2) == Block.waterStill.blockID || world.getBlockId((j1 - j3) + 1, k1 - k5 - i7, l1 + i4) == Block.waterStill.blockID)
                    {
                        j6++;
                    } else
                    {
                        flag1 = true;
                    }
                } while(!flag1 && i7++ < 12);
                world.setBlock((j1 - j3) + 1, k1 - k5 - j6, l1 + i4, Block.stoneBrick.blockID);
                world.setBlock((j1 - j3) + 1, ((k1 - k5) + 1) - j6, l1 + i4, Block.stoneBrick.blockID, 1, 2);
                world.setBlock((j1 - j3) + 1, ((k1 - k5) + 2) - j6, l1 + i4, Block.stoneBrick.blockID, 1, 2);
                world.setBlock((j1 - j3) + 2, k1 - k5 - j6, l1 + i4, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 - j3, k1 - k5 - j6, (l1 + i4) - 1, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 - j3, ((k1 - k5) + 1) - j6, (l1 + i4) - 1, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 - j3, ((k1 - k5) + 2) - j6, (l1 + i4) - 1, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 - j3, ((k1 - k5) + 3) - j6, (l1 + i4) - 1, Block.stoneBrick.blockID);
                world.setBlock(j1 - j3, ((k1 - k5) + 4) - j6, (l1 + i4) - 1, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 - j3, ((k1 - k5) + 2) - j6, (l1 + i4) - 2, Block.stoneBrick.blockID);
                world.setBlock(j1 - j3, ((k1 - k5) + 3) - j6, (l1 + i4) - 2, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 - j3, ((k1 - k5) + 4) - j6, (l1 + i4) - 2, Block.stoneBrick.blockID);
                world.setBlock(j1 - j3, ((k1 - k5) + 5) - j6, (l1 + i4) - 2, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 - j3, k1 - k5 - j6, (l1 + i4) - 3, Block.stoneBrick.blockID);
                world.setBlock(j1 - j3, ((k1 - k5) + 1) - j6, (l1 + i4) - 3, Block.stoneBrick.blockID);
                world.setBlock(j1 - j3, ((k1 - k5) + 2) - j6, (l1 + i4) - 3, Block.stoneBrick.blockID);
                world.setBlock(j1 - j3, ((k1 - k5) + 3) - j6, (l1 + i4) - 3, Block.stoneBrick.blockID, 1, 2);
                l7 = random.nextInt(100);
                if(l7 <= 30)
                {
                    world.setBlock(j1 - j3, k1 - k5 - j6 - l4, (l1 + i4) - 2, Block.dirt.blockID);
                    world.setBlock(j1 - j3, k1 - k5 - j6 - l4 - 1, (l1 + i4) - 2, Block.dirt.blockID);
                }
                i7 = 1;
                j6 = 0;
                flag1 = false;
                do
                {
                    if(world.isAirBlock(j1 + j3 + 4, k1 - k5 - i7, l1 - 6) || world.isAirBlock(j1 + j3 + 4, k1 - k5 - i7, l1 - 7) || world.isAirBlock(j1 + j3 + 5, k1 - k5 - i7, l1 - 7) || world.getBlockId(j1 + j3 + 4, k1 - k5 - i7, l1 - 6) == Block.waterStill.blockID || world.getBlockId(j1 + j3 + 4, k1 - k5 - i7, l1 - 7) == Block.waterStill.blockID || world.getBlockId(j1 + j3 + 5, k1 - k5 - i7, l1 - 7) == Block.waterStill.blockID)
                    {
                        j6++;
                    } else
                    {
                        flag1 = true;
                    }
                } while(!flag1 && i7++ < 12);
                world.setBlock(j1 + j3 + 4, k1 - k5 - j6, l1 - 6, Block.stoneBrick.blockID);
                world.setBlock(j1 + j3 + 4, ((k1 - k5) + 1) - j6, l1 - 6, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 + j3 + 4, ((k1 - k5) + 2) - j6, l1 - 6, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 + j3 + 4, k1 - k5 - j6, l1 - 7, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 + j3 + 4, ((k1 - k5) + 1) - j6, l1 - 7, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 + j3 + 5, k1 - k5 - j6, l1 - 7, Block.stoneBrick.blockID);
                world.setBlock(j1 + j3 + 5, ((k1 - k5) + 1) - j6, l1 - 7, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 + j3 + 5, ((k1 - k5) + 2) - j6, l1 - 7, Block.stoneBrick.blockID, 1, 2);
                world.setBlock(j1 + j3 + 6, k1 - k5 - j6, l1 - 7, Block.stoneBrick.blockID);
                l7 = random.nextInt(100);
                if(l7 <= 30)
                {
                    world.setBlock(j1 + j3 + 4, k1 - k5 - j6 - l4, l1 - 7, Block.dirt.blockID);
                    world.setBlock(j1 + j3 + 4, k1 - k5 - j6 - l4 - 1, l1 - 7, Block.dirt.blockID);
                }
            }
            if(i2 != 3)
            {
                continue;
            }
            int l2 = random.nextInt(8) + 5;
            int k3 = random.nextInt(8) + 5;
            int j4 = random.nextInt(8) + 5;
            int i5 = random.nextInt(4) + 3;
            int l5 = 1;
            int k6 = 0;
            int j7 = 1;
            boolean flag2 = false;
            int i8 = random.nextInt(100);
            int l8 = random.nextInt(100);
            if(l8 <= 20)
            {
                l5 = 0;
            } else
            {
                l5 = random.nextInt(4) + 5;
            }
            world.setBlock(j1, k1 - l5, l1, Block.stoneBrick.blockID);
            world.setBlock(j1 - 1, k1 - l5, l1, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 - 1, (k1 - l5) + 1, l1, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 - 1, (k1 - l5) + 2, l1, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 - 1, (k1 - l5) + 3, l1, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1, (k1 - l5) + 1, l1, Block.stoneBrick.blockID);
            world.setBlock(j1, (k1 - l5) + 2, l1, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1, (k1 - l5) + 3, l1, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1, (k1 - l5) + 4, l1, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1, (k1 - l5) + 5, l1, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1, k1 - l5, l1 + 1, Block.stoneBrick.blockID);
            world.setBlock(j1, (k1 - l5) + 2, l1 + 1, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1, k1 - l5, l1 + 2, Block.stoneBrick.blockID);
            world.setBlock(j1, (k1 - l5) + 1, l1 + 2, Block.stoneBrick.blockID, 1, 2);
            
            world.setBlock(j1, k1 - l5 - i5, l1 + 1, Block.dirt.blockID);
            world.setBlock(j1, k1 - l5 - i5 - 1, l1 + 1, Block.dirt.blockID);
            j7 = 1;
            k6 = 0;
            flag2 = false;
            do
            {
                if(world.isAirBlock(j1 + k3 + l2, k1 - l5 - j7, l1 + j4 + 2) || world.isAirBlock(j1 + k3 + l2, k1 - l5 - j7, l1 + j4 + 3) || world.isAirBlock(j1 + k3 + l2, k1 - l5 - j7, l1 + j4 + 4) || world.getBlockId(j1 + k3 + l2, k1 - l5 - j7, l1 + j4 + 2) == Block.waterStill.blockID || world.getBlockId(j1 + k3 + l2, k1 - l5 - j7, l1 + j4 + 3) == Block.waterStill.blockID || world.getBlockId(j1 + k3 + l2, k1 - l5 - j7, l1 + j4 + 4) == Block.waterStill.blockID)
                {
                    k6++;
                } else
                {
                    flag2 = true;
                }
            } while(!flag2 && j7++ < 12);
            world.setBlock(j1 + k3 + l2, k1 - l5 - k6, l1 + j4, Block.stoneBrick.blockID);
            world.setBlock(j1 + k3 + l2, ((k1 - l5) + 1) - k6, l1 + j4, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 + k3 + l2 + 1, k1 - l5 - k6, l1 + j4, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 + k3 + l2 + 1, ((k1 - l5) + 1) - k6, l1 + j4, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 + k3 + l2 + 2, k1 - l5 - k6, l1 + j4, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 + k3 + l2 + 3, k1 - l5 - k6, l1 + j4, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 + k3 + l2, k1 - l5 - k6, l1 + j4 + 1, Block.stoneBrick.blockID);
            world.setBlock(j1 + k3 + l2, ((k1 - l5) + 1) - k6, l1 + j4 + 1, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 + k3 + l2, ((k1 - l5) + 2) - k6, l1 + j4 + 1, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 + k3 + l2, ((k1 - l5) + 3) - k6, l1 + j4 + 1, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 + k3 + l2, k1 - l5 - k6, l1 + j4 + 2, Block.stoneBrick.blockID);
            world.setBlock(j1 + k3 + l2, ((k1 - l5) + 2) - k6, l1 + j4 + 2, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 + k3 + l2, k1 - l5 - k6, l1 + j4 + 3, Block.stoneBrick.blockID);
            world.setBlock(j1 + k3 + l2, ((k1 - l5) + 1) - k6, l1 + j4 + 3, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 + k3 + l2, k1 - l5 - k6, l1 + j4 + 4, Block.stoneBrick.blockID);
            world.setBlock(j1 + k3 + l2, k1 - l5 - k6, l1 + j4 + 6, Block.stoneBrick.blockID);
            i8 = random.nextInt(100);
            if(i8 <= 30)
            {
                world.setBlock(j1 + k3 + l2, k1 - l5 - k6 - i5, l1 + j4 + 1, Block.dirt.blockID);
                world.setBlock(j1 + k3 + l2, k1 - l5 - k6 - i5 - 1, l1 + j4 + 1, Block.dirt.blockID);
            }
            j7 = 1;
            k6 = 0;
            flag2 = false;
            do
            {
                if(world.isAirBlock(j1 - k3, k1 - l5 - j7, l1 - l2 - 2) || world.isAirBlock(j1 - k3, k1 - l5 - j7, l1 - l2 - 4) || world.isAirBlock(j1 - k3 - 2, k1 - l5 - j7, l1 - l2 - 6) || world.getBlockId(j1 - k3, k1 - l5 - j7, l1 - l2 - 2) == Block.waterStill.blockID || world.getBlockId(j1 - k3, k1 - l5 - j7, l1 - l2 - 4) == Block.waterStill.blockID || world.getBlockId(j1 - k3 - 2, k1 - l5 - j7, l1 - l2 - 6) == Block.waterStill.blockID)
                {
                    k6++;
                } else
                {
                    flag2 = true;
                }
            } while(!flag2 && j7++ < 12);
            world.setBlock(j1 - k3, k1 - l5 - k6, l1 - l2 - 1, Block.stoneBrick.blockID);
            world.setBlock(j1 - k3, (k1 - l5 - k6) + 1, l1 - l2 - 1, Block.stoneBrick.blockID);
            world.setBlock(j1 - k3, (k1 - l5 - k6) + 2, l1 - l2 - 1, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 - k3, k1 - l5 - k6, l1 - l2 - 2, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 - k3, ((k1 - l5) + 1) - k6, l1 - l2 - 2, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 - k3, k1 - l5 - k6, l1 - l2 - 3, Block.stoneBrick.blockID);
            world.setBlock(j1 - k3, ((k1 - l5) + 1) - k6, l1 - l2 - 3, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 - k3, k1 - l5 - k6, l1 - l2 - 4, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 - k3 - 1, k1 - l5 - k6, l1 - l2 - 6, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 - k3 - 2, k1 - l5 - k6, l1 - l2 - 6, Block.stoneBrick.blockID);
            world.setBlock(j1 - k3 - 2, ((k1 - l5) + 1) - k6, l1 - l2 - 6, Block.stoneBrick.blockID);
            world.setBlock(j1 - k3 - 3, k1 - l5 - k6, l1 - l2 - 6, Block.stoneBrick.blockID);
            i8 = random.nextInt(100);
            if(i8 <= 60)
            {
            	world.setBlock(j1 - k3 - 1, k1 - l5 - k6 - i5, l1 - l2 - 6, Block.dirt.blockID);
                world.setBlock(j1 - k3 - 1, k1 - l5 - k6 - i5 - 1, l1 - l2 - 6, Block.dirt.blockID);
            }
            j7 = 1;
            k6 = 0;
            flag2 = false;
            do
            {
                if(world.isAirBlock(j1 + l2, k1 - l5 - j7, l1 + j4) || world.isAirBlock(j1 + l2 + 2, k1 - l5 - j7, l1 + j4) || world.isAirBlock(j1 + l2 + 4, k1 - l5 - j7, l1 + j4) || world.getBlockId(j1 + l2, k1 - l5 - j7, l1 + j4) == Block.waterStill.blockID || world.getBlockId(j1 + l2 + 2, k1 - l5 - j7, l1 + j4) == Block.waterStill.blockID || world.getBlockId(j1 + l2 + 4, k1 - l5 - j7, l1 + j4) == Block.waterStill.blockID)
                {
                    k6++;
                } else
                {
                    flag2 = true;
                }
            } while(!flag2 && j7++ < 12);
            world.setBlock(j1 + l2, k1 - l5 - k6, l1 + j4, Block.stoneBrick.blockID);
            world.setBlock(j1 + l2 + 1, k1 - l5 - k6, l1 + j4, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 + l2 + 1, ((k1 - l5) + 1) - k6, l1 + j4, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 + l2 + 1, ((k1 - l5) + 2) - k6, l1 + j4, Block.stoneBrick.blockID);
            world.setBlock(j1 + l2 + 1, ((k1 - l5) + 3) - k6, l1 + j4, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 + l2 + 2, k1 - l5 - k6, l1 + j4, Block.stoneBrick.blockID);
            world.setBlock(j1 + l2 + 2, ((k1 - l5) + 1) - k6, l1 + j4, Block.stoneBrick.blockID);
            world.setBlock(j1 + l2 + 2, ((k1 - l5) + 2) - k6, l1 + j4, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 + l2 + 3, ((k1 - l5) + 2) - k6, l1 + j4, Block.stoneBrick.blockID);
            world.setBlock(j1 + l2 + 4, k1 - l5 - k6, l1 + j4, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 + l2 + 4, ((k1 - l5) + 1) - k6, l1 + j4, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 + l2 + 5, k1 - l5 - k6, l1 + j4, Block.stoneBrick.blockID, 1, 2);
            i8 = random.nextInt(100);
            if(i8 <= 30)
            {
                world.setBlock(j1 + l2 + 2, k1 - l5 - k6 - i5, l1 + j4, Block.dirt.blockID);
                world.setBlock(j1 + l2 + 2, k1 - l5 - k6 - i5 - 1, l1 + j4, Block.dirt.blockID);
            }
            j7 = 1;
            k6 = 0;
            flag2 = false;
            do
            {
                if(world.isAirBlock(j1 - 3, k1 - l5 - j7, l1 + k3 + 1) || world.isAirBlock(j1 - 3, k1 - l5 - j7, l1 + k3 + 3) || world.isAirBlock(j1 - 3, k1 - l5 - j7, l1 + k3 + 4) || world.getBlockId(j1 - 3, k1 - l5 - j7, l1 + k3 + 1) == Block.waterStill.blockID || world.getBlockId(j1 - 3, k1 - l5 - j7, l1 + k3 + 3) == Block.waterStill.blockID || world.getBlockId(j1 - 3, k1 - l5 - j7, l1 + k3 + 4) == Block.waterStill.blockID)
                {
                    k6++;
                } else
                {
                    flag2 = true;
                }
            } while(!flag2 && j7++ < 12);
            world.setBlock(j1 - 3, k1 - l5 - k6, l1 + k3, Block.stoneBrick.blockID);
            world.setBlock(j1 - 3, ((k1 - l5) + 1) - k6, l1 + k3, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 - 3, ((k1 - l5) + 2) - k6, l1 + k3 + 1, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 - 3, k1 - l5 - k6, l1 + k3 + 2, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 - 3, ((k1 - l5) + 1) - k6, l1 + k3 + 2, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 - 3, ((k1 - l5) + 2) - k6, l1 + k3 + 2, Block.stoneBrick.blockID);
            world.setBlock(j1 - 3, k1 - l5 - k6, l1 + k3 + 3, Block.stoneBrick.blockID);
            world.setBlock(j1 - 3, ((k1 - l5) + 1) - k6, l1 + k3 + 3, Block.stoneBrick.blockID);
            world.setBlock(j1 - 3, k1 - l5 - k6, l1 + k3 + 4, Block.stoneBrick.blockID);
            world.setBlock(j1 - 3, ((k1 - l5) + 1) - k6, l1 + k3 + 4, Block.stoneBrick.blockID, 1, 2);
            world.setBlock(j1 - 3, k1 - l5 - k6, l1 + k3 + 5, Block.stoneBrick.blockID, 1, 2);
            i8 = random.nextInt(100);
            if(i8 <= 30)
            {
                world.setBlock(j1 - 3, k1 - l5 - k6 - i5, l1 + k3 + 3, Block.chest.blockID);
                TileEntityChest chest = (TileEntityChest) world.getBlockTileEntity(j1 - 3, k1 - l5 - k6 - i5, l1 + k3 + 3);
                Random rand = new Random();
                for(int slot = 0; slot < chest.getSizeInventory(); slot++)
                {
                	int num = rand.nextInt(16);
                	
                	if(num == 1)
                	{
                		chest.setInventorySlotContents(slot, new ItemStack(Item.enderPearl, 4, 0));
                	}
                	
                	if(num == 2)
                	{
                		chest.setInventorySlotContents(slot, new ItemStack(Item.diamond, 1, 0));
                	}
                	
                	if(num == 3)
                	{
                		chest.setInventorySlotContents(slot, new ItemStack(Item.emerald, 1, 0));
                	}
                	
                	if(num == 4)
                	{
                		chest.setInventorySlotContents(slot, new ItemStack(Item.appleGold, 1, 0));
                	}
                	
                	if(num == 5)
                	{
                		chest.setInventorySlotContents(slot,  new ItemStack(Item.ingotGold, 1, 0));
                	}
                	
                	if(num == 6)
                	{
                		chest.setInventorySlotContents(slot, new ItemStack(Item.ingotIron, 1, 0));
                	}
                }
                world.setBlock(j1 - 3, k1 - l5 - k6 - i5 - 1, l1 + k3 + 3, Block.dirt.blockID);
            }
        }

        return true;
    }
}
