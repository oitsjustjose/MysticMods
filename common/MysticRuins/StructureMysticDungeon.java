package MysticRuins;

import java.util.Random;

import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.world.gen.structure.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class StructureMysticDungeon extends WorldGenerator
{

    public StructureMysticDungeon()
    {
    }

    public boolean generate(World world, Random random, int i, int j, int k)
    {
    	if(world.getWorldInfo().getTerrainType() != world.getWorldInfo().getTerrainType().FLAT)
    	{
    		int l = random.nextInt(100);
            if(l >= 4)
            {
                return false;
            }
            for(int i1 = 0; i1 < 1; i1++)
            {
                int j1 = (i + random.nextInt(8)) - random.nextInt(8);
                int k1 = (j + random.nextInt(4)) - random.nextInt(4);
                int l1 = (k + random.nextInt(8)) - random.nextInt(8);
                if(world.isAirBlock(j1 - 1, k1 + 1, l1) && 
                		world.isAirBlock(j1 - 1, k1 + 1, l1 + 1) && 
                		world.isAirBlock(j1 - 1, k1 + 2, l1) && 
                		world.isAirBlock(j1 - 1, k1 + 2, l1 + 1) && 
                		world.getBlockId(j1, k1, l1) == Block.stone.blockID && 
                		world.getBlockId(j1, k1, l1 + 1) == Block.stone.blockID && 
                		world.getBlockId(j1 - 1, k1, l1) == Block.stone.blockID && 
                		world.getBlockId(j1 - 1, k1, l1 + 1) == Block.stone.blockID && 
                		world.getBlockId(j1, k1 + 1, l1) == Block.stone.blockID && 
                		world.getBlockId(j1, k1 + 1, l1 + 1) == Block.stone.blockID);
                boolean flag = true;
                if(!flag)
                {
                    continue;
                }
                world.setBlock(j1, k1 + 1, l1, 0);
                world.setBlock(j1, k1 + 2, l1, 0);
                world.setBlock(j1 - 1, k1 + 1, l1, 0);
                world.setBlock(j1 - 1, k1 + 2, l1, 0);
                world.setBlock(j1 - 1, k1 + 3, l1, 0);
                world.setBlock(j1 - 1, k1 + 1, l1 + 1, 0);
                world.setBlock(j1 - 1, k1 + 2, l1 + 1, 0);
                world.setBlock(j1 - 1, k1 + 1, l1 + 2, 0);
                world.setBlock(j1 - 1, k1 + 1, l1 + 3, 0);
                world.setBlock(j1 - 1, k1 + 2, l1 + 2, 0);
                world.setBlock(j1 - 1, k1 + 3, l1 + 1, 0);
                world.setBlock(j1 - 1, k1 + 1, l1 - 1, 0);
                world.setBlock(j1 - 1, k1 + 2, l1 - 1, 0);
                world.setBlock(j1 - 1, k1 + 3, l1 - 1, 0);
                world.setBlock(j1 - 2, k1 + 1, l1, 0);
                world.setBlock(j1 - 2, k1 + 2, l1, 0);
                world.setBlock(j1 - 2, k1 + 3, l1, 0);
                world.setBlock(j1 - 2, k1 + 1, l1 + 1, 0);
                world.setBlock(j1 - 2, k1 + 1, l1 + 2, 0);
                world.setBlock(j1 - 1, k1 + 2, l1 + 2, 0);
                world.setBlock(j1 - 2, k1 + 2, l1 + 1, 0);
                world.setBlock(j1 - 2, k1 + 3, l1 + 1, 0);
                world.setBlock(j1 - 2, k1 + 1, l1 - 1, 0);
                world.setBlock(j1 - 2, k1 + 2, l1 - 1, 0);
                world.setBlock(j1 - 2, k1 + 3, l1 - 1, 0);
                world.setBlock(j1 - 3, k1 + 1, l1, 0);
                world.setBlock(j1 - 3, k1 + 2, l1, 0);
                world.setBlock(j1 - 3, k1 + 3, l1, 0);
                world.setBlock(j1 - 3, k1 + 1, l1 + 1, 0);
                world.setBlock(j1 - 3, k1 + 2, l1 + 1, 0);
                world.setBlock(j1 - 3, k1 + 3, l1 + 1, 0);
                world.setBlock(j1 - 3, k1 + 1, l1 - 1, 0);
                world.setBlock(j1 - 3, k1 + 2, l1 - 1, 0);
                world.setBlock(j1 - 3, k1 + 3, l1 - 1, 0);
                world.setBlock(j1 - 4, k1 + 1, l1, 0);
                world.setBlock(j1 - 4, k1 + 2, l1, 0);
                world.setBlock(j1 - 4, k1 + 3, l1, 0);
                world.setBlock(j1 - 4, k1 + 1, l1 + 1, 0);
                world.setBlock(j1 - 4, k1 + 2, l1 + 1, 0);
                world.setBlock(j1 - 4, k1 + 3, l1 + 1, 0);
                world.setBlock(j1 - 4, k1 + 1, l1 - 1, 0);
                world.setBlock(j1 - 4, k1 + 2, l1 - 1, 0);
                world.setBlock(j1 - 4, k1 + 3, l1 - 1, 0);
                world.setBlock(j1 - 5, k1 + 1, l1, 0);
                world.setBlock(j1 - 5, k1 + 2, l1, 0);
                world.setBlock(j1 - 5, k1 + 3, l1, 0);
                world.setBlock(j1 - 5, k1 + 1, l1 + 1, 0);
                world.setBlock(j1 - 5, k1 + 2, l1 + 1, 0);
                world.setBlock(j1 - 5, k1 + 3, l1 + 1, 0);
                world.setBlock(j1 - 5, k1 + 1, l1 - 1, 0);
                world.setBlock(j1 - 5, k1 + 2, l1 - 1, 0);
                world.setBlock(j1 - 5, k1 + 3, l1 - 1, 0);
                world.setBlock(j1 - 6, k1 + 1, l1, 0);
                world.setBlock(j1 - 6, k1 + 2, l1, 0);
                world.setBlock(j1 - 6, k1 + 3, l1, 0);
                world.setBlock(j1 - 6, k1 + 4, l1, 0);
                world.setBlock(j1 - 7, k1 + 2, l1, 0);
                world.setBlock(j1 - 7, k1 + 3, l1, 0);
                world.setBlock(j1 - 7, k1 + 4, l1, 0);
                world.setBlock(j1 - 7, k1 + 5, l1, 0);
                world.setBlock(j1 - 8, k1 + 3, l1, 0);
                world.setBlock(j1 - 8, k1 + 4, l1, 0);
                world.setBlock(j1 - 8, k1 + 5, l1, 0);
                world.setBlock(j1 - 9, k1 + 4, l1, 0);
                world.setBlock(j1 - 9, k1 + 5, l1, 0);
                world.setBlock(j1 - 9, k1 + 6, l1, 0);
                world.setBlock(j1 - 9, k1 + 7, l1, 0);
                world.setBlock(j1 - 10, k1 + 5, l1, 0);
                world.setBlock(j1 - 10, k1 + 6, l1, 0);
                world.setBlock(j1 - 10, k1 + 7, l1, 0);
                world.setBlock(j1 - 10, k1 + 8, l1, 0);
                world.setBlock(j1 - 11, k1 + 6, l1, 0);
                world.setBlock(j1 - 11, k1 + 7, l1, 0);
                world.setBlock(j1 - 11, k1 + 8, l1, 0);
                world.setBlock(j1 - 11, k1 + 9, l1, 0);
                world.setBlock(j1 - 12, k1 + 7, l1, 0);
                world.setBlock(j1 - 12, k1 + 8, l1, 0);
                world.setBlock(j1 - 12, k1 + 9, l1, 0);
                world.setBlock(j1 - 12, k1 + 10, l1, 0);
                world.setBlock(j1 - 13, k1 + 8, l1, 0);
                world.setBlock(j1 - 13, k1 + 9, l1, 0);
                world.setBlock(j1 - 13, k1 + 10, l1, 0);
                world.setBlock(j1 - 13, k1 + 11, l1, 0);
                world.setBlock(j1 - 14, k1 + 9, l1, 0);
                world.setBlock(j1 - 14, k1 + 10, l1, 0);
                world.setBlock(j1 - 14, k1 + 11, l1, 0);
                world.setBlock(j1 - 14, k1 + 12, l1, 0);
                world.setBlock(j1 - 15, k1 + 10, l1, 0);
                world.setBlock(j1 - 15, k1 + 11, l1, 0);
                world.setBlock(j1 - 15, k1 + 12, l1, 0);
                world.setBlock(j1 - 15, k1 + 13, l1, 0);
                world.setBlock(j1 - 15, k1 + 14, l1, 0);
                world.setBlock(j1 - 16, k1 + 11, l1, 0);
                world.setBlock(j1 - 16, k1 + 12, l1, 0);
                world.setBlock(j1 - 16, k1 + 13, l1, 0);
                world.setBlock(j1 - 16, k1 + 14, l1, 0);
                int i2 = random.nextInt(100);
                if(i2 <= 40)
                {
                    world.setBlock(j1 - 16, k1 + 11, l1 - 1, 0);
                    world.setBlock(j1 - 16, k1 + 12, l1 - 1, 0);
                    world.setBlock(j1 - 16, k1 + 11, l1 - 2, 0);
                    world.setBlock(j1 - 16, k1 + 12, l1 - 2, 0);
                    world.setBlock(j1 - 16, k1 + 11, l1 - 3, 0);
                    world.setBlock(j1 - 16, k1 + 12, l1 - 3, 0);
                    world.setBlock(j1 - 16, k1 + 11, l1 - 4, 0);
                    world.setBlock(j1 - 16, k1 + 12, l1 - 4, 0);
                    world.setBlock(j1 - 16, k1 + 11, l1 - 5, 0);
                    world.setBlock(j1 - 16, k1 + 12, l1 - 5, 0);
                    world.setBlock(j1 - 16, k1 + 11, l1 - 6, 0);
                    world.setBlock(j1 - 16, k1 + 12, l1 - 6, 0);
                    world.setBlock(j1 - 16, k1 + 11, l1 - 7, 0);
                    world.setBlock(j1 - 16, k1 + 12, l1 - 7, 0);
                    world.setBlock(j1 - 16, k1 + 11, l1 - 8, 0);
                    world.setBlock(j1 - 16, k1 + 12, l1 - 8, 0);
                    world.setBlock(j1 - 16, k1 + 13, l1 - 8, 0);
                    world.setBlock(j1 - 16, k1 + 14, l1 - 8, 0);
                    world.setBlock(j1 - 16, k1 + 12, l1 - 9, 0);
                    world.setBlock(j1 - 16, k1 + 13, l1 - 9, 0);
                    world.setBlock(j1 - 16, k1 + 14, l1 - 9, 0);
                    world.setBlock(j1 - 16, k1 + 15, l1 - 9, 0);
                    world.setBlock(j1 - 16, k1 + 13, l1 - 10, 0);
                    world.setBlock(j1 - 16, k1 + 14, l1 - 10, 0);
                    world.setBlock(j1 - 16, k1 + 15, l1 - 10, 0);
                    world.setBlock(j1 - 16, k1 + 16, l1 - 10, 0);
                    world.setBlock(j1 - 16, k1 + 14, l1 - 11, 0);
                    world.setBlock(j1 - 16, k1 + 15, l1 - 11, 0);
                    world.setBlock(j1 - 16, k1 + 16, l1 - 11, 0);
                    world.setBlock(j1 - 16, k1 + 17, l1 - 11, 0);
                    world.setBlock(j1 - 16, k1 + 15, l1 - 12, 0);
                    world.setBlock(j1 - 16, k1 + 16, l1 - 12, 0);
                    world.setBlock(j1 - 16, k1 + 17, l1 - 12, 0);
                    world.setBlock(j1 - 16, k1 + 16, l1 - 13, 0);
                    world.setBlock(j1 - 16, k1 + 17, l1 - 13, 0);
                    world.setBlock(j1 - 16, k1 + 18, l1 - 13, 0);
                    world.setBlock(j1 - 16, k1 + 19, l1 - 13, 0);
                    world.setBlock(j1 - 16, k1 + 20, l1 - 13, 0);
                    int j2 = random.nextInt(100);
                    if(j2 <= 20)
                    {
                        world.setBlock(j1 - 16, k1 + 17, l1 - 15, 0);
                        world.setBlock(j1 - 16, k1 + 18, l1 - 15, 0);
                        world.setBlock(j1 - 16, k1 + 17, l1 - 16, 0);
                        world.setBlock(j1 - 16, k1 + 18, l1 - 16, 0);
                        world.setBlock(j1 - 16, k1 + 17, l1 - 17, 0);
                        world.setBlock(j1 - 16, k1 + 18, l1 - 17, 0);
                        world.setBlock(j1 - 15, k1 + 17, l1 - 15, 0);
                        world.setBlock(j1 - 15, k1 + 18, l1 - 15, 0);
                        world.setBlock(j1 - 15, k1 + 17, l1 - 16, 0);
                        world.setBlock(j1 - 15, k1 + 18, l1 - 16, 0);
                        world.setBlock(j1 - 15, k1 + 17, l1 - 17, 0);
                        world.setBlock(j1 - 15, k1 + 18, l1 - 17, 0);
                        world.setBlock(j1 - 17, k1 + 17, l1 - 15, 0);
                        world.setBlock(j1 - 17, k1 + 18, l1 - 15, 0);
                        world.setBlock(j1 - 17, k1 + 17, l1 - 16, 0);
                        world.setBlock(j1 - 17, k1 + 18, l1 - 16, 0);
                        world.setBlock(j1 - 17, k1 + 17, l1 - 17, 0);
                        world.setBlock(j1 - 17, k1 + 18, l1 - 17, 0);
                        world.setBlock(j1 - 16, k1 + 16, l1 - 15, Block.blockLapis.blockID);
                        world.setBlock(j1 - 16, k1 + 16, l1 - 16, Block.cobblestoneMossy.blockID);
                        world.setBlock(j1 - 16, k1 + 16, l1 - 17, Block.blockLapis.blockID);
                        world.setBlock(j1 - 15, k1 + 16, l1 - 15, Block.blockLapis.blockID);
                        world.setBlock(j1 - 15, k1 + 16, l1 - 16, Block.blockLapis.blockID);
                        world.setBlock(j1 - 15, k1 + 16, l1 - 17, Block.blockLapis.blockID);
                        world.setBlock(j1 - 17, k1 + 16, l1 - 15, Block.blockLapis.blockID);
                        world.setBlock(j1 - 17, k1 + 16, l1 - 16, Block.blockLapis.blockID);
                        world.setBlock(j1 - 17, k1 + 16, l1 - 17, Block.blockLapis.blockID);
                        world.setBlock(j1 - 16, k1 + 17, l1 - 16, Block.chest.blockID);
                        TileEntityChest chest = (TileEntityChest) world.getBlockTileEntity(j1 - 16, k1 + 17, l1 - 16);
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
                    }
                }
                world.setBlock(j1 - 16, k1 + 12, l1 + 1, 0);
                world.setBlock(j1 - 16, k1 + 13, l1 + 1, 0);
                world.setBlock(j1 - 16, k1 + 14, l1 + 1, 0);
                world.setBlock(j1 - 16, k1 + 15, l1 + 1, 0);
                world.setBlock(j1 - 16, k1 + 13, l1 + 2, 0);
                world.setBlock(j1 - 16, k1 + 14, l1 + 2, 0);
                world.setBlock(j1 - 16, k1 + 15, l1 + 2, 0);
                world.setBlock(j1 - 16, k1 + 16, l1 + 2, 0);
                world.setBlock(j1 - 16, k1 + 14, l1 + 3, 0);
                world.setBlock(j1 - 16, k1 + 15, l1 + 3, 0);
                world.setBlock(j1 - 16, k1 + 16, l1 + 3, 0);
                world.setBlock(j1 - 16, k1 + 15, l1 + 4, 0);
                world.setBlock(j1 - 16, k1 + 16, l1 + 4, 0);
                world.setBlock(j1 - 16, k1 + 17, l1 + 4, 0);
                world.setBlock(j1 - 16, k1 + 18, l1 + 4, 0);
                world.setBlock(j1 - 16, k1 + 16, l1 + 5, 0);
                world.setBlock(j1 - 16, k1 + 17, l1 + 5, 0);
                world.setBlock(j1 - 16, k1 + 18, l1 + 5, 0);
                world.setBlock(j1 - 16, k1 + 19, l1 + 5, 0);
                world.setBlock(j1 - 16, k1 + 17, l1 + 6, 0);
                world.setBlock(j1 - 16, k1 + 18, l1 + 6, 0);
                world.setBlock(j1 - 16, k1 + 19, l1 + 6, 0);
                world.setBlock(j1 - 16, k1 + 20, l1 + 6, 0);
                world.setBlock(j1 - 16, k1 + 18, l1 + 7, 0);
                world.setBlock(j1 - 16, k1 + 19, l1 + 7, 0);
                world.setBlock(j1 - 16, k1 + 20, l1 + 7, 0);
                world.setBlock(j1 - 16, k1 + 21, l1 + 7, 0);
                world.setBlock(j1 - 16, k1 + 19, l1 + 8, 0);
                world.setBlock(j1 - 16, k1 + 20, l1 + 8, 0);
                world.setBlock(j1 - 16, k1 + 21, l1 + 8, 0);
                world.setBlock(j1 - 16, k1 + 22, l1 + 8, 0);
                world.setBlock(j1 - 16, k1 + 20, l1 + 9, 0);
                world.setBlock(j1 - 16, k1 + 21, l1 + 9, 0);
                world.setBlock(j1 - 16, k1 + 22, l1 + 9, 0);
                world.setBlock(j1 - 16, k1 + 23, l1 + 9, 0);
                world.setBlock(j1 - 16, k1 + 24, l1 + 9, 0);
                world.setBlock(j1 - 16, k1 + 21, l1 + 10, 0);
                world.setBlock(j1 - 16, k1 + 22, l1 + 10, 0);
                world.setBlock(j1 - 16, k1 + 23, l1 + 10, 0);
                world.setBlock(j1 - 16, k1 + 24, l1 + 10, 0);
                world.setBlock(j1 - 16, k1 + 22, l1 + 11, 0);
                world.setBlock(j1 - 16, k1 + 23, l1 + 11, 0);
                world.setBlock(j1 - 16, k1 + 24, l1 + 11, 0);
                world.setBlock(j1 - 16, k1 + 25, l1 + 11, 0);
                world.setBlock(j1 - 16, k1 + 23, l1 + 12, 0);
                world.setBlock(j1 - 16, k1 + 24, l1 + 12, 0);
                world.setBlock(j1 - 16, k1 + 25, l1 + 12, 0);
                world.setBlock(j1 - 16, k1 + 26, l1 + 12, 0);
                world.setBlock(j1, k1 + 1, l1, 0);
                world.setBlock(j1, k1 + 2, l1, 0);
                world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 + 1, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 + 1, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 + 2, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 + 2, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 + 3, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 + 3, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 + 3, l1, Block.cobblestoneMossy.blockID);
                int k2 = random.nextInt(100);
                if(k2 <= 40)
                {
                    world.setBlock(j1 - 1, k1 + 3, l1, Block.vine.blockID);
                    world.setBlock(j1 - 1, k1 + 3, l1 + 1, Block.vine.blockID);
                    world.setBlock(j1 - 2, k1 + 3, l1 - 1, Block.vine.blockID);
                    world.setBlock(j1 - 3, k1 + 3, l1 + 2, Block.vine.blockID);
                }
                j1++;
                world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1, l1 - 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 + 1, l1, 0);
                world.setBlock(j1, k1 + 1, l1 + 1, 0);
                world.setBlock(j1, k1 + 1, l1 - 1, 0);
                world.setBlock(j1, k1 + 2, l1, 0);
                world.setBlock(j1, k1 + 2, l1 + 1, 0);
                world.setBlock(j1, k1 + 2, l1 - 1, 0);
                world.setBlock(j1, k1 + 3, l1, 0);
                world.setBlock(j1, k1 + 3, l1 + 1, 0);
                world.setBlock(j1, k1 + 3, l1 - 1, 0);
                world.setBlock(j1, k1 + 1, l1 - 2, Block.cobblestone.blockID);
                j1++;
                world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1, l1 - 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 + 1, l1, 0);
                world.setBlock(j1, k1 + 1, l1 + 1, 0);
                world.setBlock(j1, k1 + 1, l1 - 1, 0);
                world.setBlock(j1, k1 + 2, l1, 0);
                world.setBlock(j1, k1 + 2, l1 + 1, 0);
                world.setBlock(j1, k1 + 2, l1 - 1, 0);
                world.setBlock(j1, k1 + 3, l1, 0);
                world.setBlock(j1, k1 + 3, l1 + 1, 0);
                world.setBlock(j1, k1 + 3, l1 - 1, 0);
                world.setBlock(j1, k1 + 2, l1 + 2, Block.cobblestone.blockID);
                world.setBlock(j1, k1 + 3, l1 + 2, Block.cobblestone.blockID);
                j1++;
                world.setBlock(j1, k1, l1, Block.cobblestone.blockID);
                world.setBlock(j1, k1, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 + 1, l1, 0);
                world.setBlock(j1, k1 + 1, l1 + 1, 0);
                world.setBlock(j1, k1 + 1, l1 - 1, 0);
                world.setBlock(j1, k1 + 2, l1, 0);
                world.setBlock(j1, k1 + 2, l1 + 1, 0);
                world.setBlock(j1, k1 + 2, l1 - 1, 0);
                world.setBlock(j1, k1 + 3, l1, 0);
                world.setBlock(j1, k1 + 3, l1 + 1, 0);
                world.setBlock(j1, k1 + 3, l1 - 1, 0);
                j1++;
                world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 + 1, l1, 0);
                world.setBlock(j1, k1 + 1, l1 + 1, 0);
                world.setBlock(j1, k1 + 1, l1 - 1, 0);
                world.setBlock(j1, k1 + 2, l1, 0);
                world.setBlock(j1, k1 + 2, l1 + 1, 0);
                world.setBlock(j1, k1 + 2, l1 - 1, 0);
                world.setBlock(j1, k1 + 3, l1, 0);
                world.setBlock(j1, k1 + 3, l1 + 1, 0);
                world.setBlock(j1, k1 + 3, l1 - 1, 0);
                world.setBlock(j1, k1 + 1, l1 + 2, Block.cobblestoneMossy.blockID);
                j1++;
                world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1, l1 - 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 + 1, l1, 0);
                world.setBlock(j1, k1 + 1, l1 + 1, 0);
                world.setBlock(j1, k1 + 1, l1 - 1, 0);
                world.setBlock(j1, k1 + 2, l1, 0);
                world.setBlock(j1, k1 + 2, l1 + 1, 0);
                world.setBlock(j1, k1 + 2, l1 - 1, 0);
                world.setBlock(j1, k1 + 3, l1, 0);
                world.setBlock(j1, k1 + 3, l1 + 1, 0);
                world.setBlock(j1, k1 + 3, l1 - 1, 0);
                world.setBlock(j1, k1 + 1, l1 - 2, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 + 2, l1 - 2, Block.cobblestone.blockID);
                j1++;
                world.setBlock(j1, k1, l1, Block.cobblestone.blockID);
                world.setBlock(j1, k1, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 + 1, l1, 0);
                world.setBlock(j1, k1 + 1, l1 + 1, 0);
                world.setBlock(j1, k1 + 1, l1 - 1, 0);
                world.setBlock(j1, k1 + 2, l1, 0);
                world.setBlock(j1, k1 + 2, l1 + 1, 0);
                world.setBlock(j1, k1 + 2, l1 - 1, 0);
                world.setBlock(j1, k1 + 3, l1, 0);
                world.setBlock(j1, k1 + 3, l1 + 1, 0);
                world.setBlock(j1, k1 + 3, l1 - 1, 0);
                int l2 = random.nextInt(100);
                if(l2 <= 30)
                {
                    world.setBlock(j1 - 1, k1 + 3, l1, Block.vine.blockID);
                    world.setBlock(j1 - 1, k1 + 3, l1 + 2, Block.vine.blockID);
                    world.setBlock(j1 - 2, k1 + 3, l1 - 1, Block.vine.blockID);
                    world.setBlock(j1 - 3, k1 + 3, l1 + 1, Block.vine.blockID);
                    world.setBlock(j1 - 5, k1 + 3, l1, Block.vine.blockID);
                }
                int i3 = random.nextInt(100);
                if(i3 <= 40)
                {
                    world.setBlock(j1, k1 + 1, l1 - 2, 0);
                    world.setBlock(j1, k1 + 2, l1 - 2, 0);
                    world.setBlock(j1, k1 + 1, l1 - 3, 0);
                    world.setBlock(j1, k1 + 2, l1 - 3, 0);
                    world.setBlock(j1, k1 + 1, l1 - 4, 0);
                    world.setBlock(j1, k1 + 2, l1 - 4, 0);
                    world.setBlock(j1, k1 + 1, l1 - 5, 0);
                    world.setBlock(j1, k1 + 2, l1 - 5, 0);
                    world.setBlock(j1, k1 + 1, l1 - 6, 0);
                    world.setBlock(j1, k1 + 2, l1 - 6, 0);
                    world.setBlock(j1, k1 + 1, l1 - 7, 0);
                    world.setBlock(j1, k1 + 2, l1 - 7, 0);
                    world.setBlock(j1, k1 + 1, l1 - 8, 0);
                    world.setBlock(j1, k1 + 2, l1 - 8, 0);
                    world.setBlock(j1, k1 + 1, l1 - 9, 0);
                    world.setBlock(j1, k1 + 2, l1 - 9, 0);
                    world.setBlock(j1, k1 + 1, l1 - 10, 0);
                    world.setBlock(j1, k1 + 2, l1 - 10, 0);
                    world.setBlock(j1, k1 + 3, l1 - 10, 0);
                    world.setBlock(j1, k1 + 4, l1 - 10, 0);
                    world.setBlock(j1, k1 + 2, l1 - 11, 0);
                    world.setBlock(j1, k1 + 3, l1 - 11, 0);
                    world.setBlock(j1, k1 + 4, l1 - 11, 0);
                    world.setBlock(j1, k1 + 5, l1 - 11, 0);
                    world.setBlock(j1, k1 + 3, l1 - 12, 0);
                    world.setBlock(j1, k1 + 4, l1 - 12, 0);
                    world.setBlock(j1, k1 + 5, l1 - 12, 0);
                    world.setBlock(j1, k1 + 6, l1 - 12, 0);
                    world.setBlock(j1, k1 + 4, l1 - 13, 0);
                    world.setBlock(j1, k1 + 5, l1 - 13, 0);
                    world.setBlock(j1, k1 + 6, l1 - 13, 0);
                    world.setBlock(j1, k1 + 7, l1 - 13, 0);
                    world.setBlock(j1, k1 + 5, l1 - 14, 0);
                    world.setBlock(j1, k1 + 6, l1 - 14, 0);
                    world.setBlock(j1, k1 + 7, l1 - 14, 0);
                    world.setBlock(j1, k1 + 8, l1 - 14, 0);
                    world.setBlock(j1, k1 + 6, l1 - 15, 0);
                    world.setBlock(j1, k1 + 7, l1 - 15, 0);
                    world.setBlock(j1, k1 + 8, l1 - 15, 0);
                    world.setBlock(j1, k1 + 9, l1 - 15, 0);
                    world.setBlock(j1, k1 + 7, l1 - 16, 0);
                    world.setBlock(j1, k1 + 8, l1 - 16, 0);
                    world.setBlock(j1, k1 + 9, l1 - 16, 0);
                    world.setBlock(j1, k1 + 10, l1 - 16, 0);
                    world.setBlock(j1, k1 + 8, l1 - 17, 0);
                    world.setBlock(j1, k1 + 9, l1 - 17, 0);
                    world.setBlock(j1, k1 + 10, l1 - 17, 0);
                    world.setBlock(j1, k1 + 11, l1 - 17, 0);
                    world.setBlock(j1, k1 + 9, l1 - 18, 0);
                    world.setBlock(j1, k1 + 10, l1 - 18, 0);
                    world.setBlock(j1, k1 + 11, l1 - 18, 0);
                    world.setBlock(j1, k1 + 12, l1 - 18, 0);
                    world.setBlock(j1, k1 + 10, l1 - 19, 0);
                    world.setBlock(j1, k1 + 11, l1 - 19, 0);
                    world.setBlock(j1, k1 + 12, l1 - 19, 0);
                    world.setBlock(j1, k1 + 13, l1 - 19, 0);
                    world.setBlock(j1, k1 + 11, l1 - 20, 0);
                    world.setBlock(j1, k1 + 12, l1 - 20, 0);
                    world.setBlock(j1, k1 + 13, l1 - 20, 0);
                    world.setBlock(j1, k1 + 14, l1 - 20, 0);
                    world.setBlock(j1, k1 + 15, l1 - 20, 0);
                    world.setBlock(j1, k1 + 12, l1 - 21, 0);
                    world.setBlock(j1, k1 + 13, l1 - 21, 0);
                    world.setBlock(j1, k1 + 14, l1 - 21, 0);
                    world.setBlock(j1, k1 + 15, l1 - 21, 0);
                    world.setBlock(j1, k1 + 16, l1 - 21, 0);
                    world.setBlock(j1, k1 + 13, l1 - 22, 0);
                    world.setBlock(j1, k1 + 14, l1 - 22, 0);
                    world.setBlock(j1, k1 + 15, l1 - 22, 0);
                    world.setBlock(j1, k1 + 16, l1 - 22, 0);
                    world.setBlock(j1, k1 + 14, l1 - 23, 0);
                    world.setBlock(j1, k1 + 15, l1 - 23, 0);
                    world.setBlock(j1, k1 + 16, l1 - 23, 0);
                    world.setBlock(j1, k1 + 17, l1 - 23, 0);
                    int j3 = random.nextInt(100);
                    if(j3 <= 20)
                    {
                        world.setBlock(j1, k1 + 15, l1 - 25, 0);
                        world.setBlock(j1, k1 + 16, l1 - 25, 0);
                        world.setBlock(j1, k1 + 15, l1 - 26, 0);
                        world.setBlock(j1, k1 + 16, l1 - 26, 0);
                        world.setBlock(j1, k1 + 15, l1 - 27, 0);
                        world.setBlock(j1, k1 + 16, l1 - 27, 0);
                        world.setBlock(j1 + 1, k1 + 15, l1 - 25, 0);
                        world.setBlock(j1 + 1, k1 + 16, l1 - 25, 0);
                        world.setBlock(j1 + 1, k1 + 15, l1 - 26, 0);
                        world.setBlock(j1 + 1, k1 + 16, l1 - 26, 0);
                        world.setBlock(j1 + 1, k1 + 15, l1 - 27, 0);
                        world.setBlock(j1 + 1, k1 + 16, l1 - 27, 0);
                        world.setBlock(j1 - 1, k1 + 15, l1 - 25, 0);
                        world.setBlock(j1 - 1, k1 + 16, l1 - 25, 0);
                        world.setBlock(j1 - 1, k1 + 15, l1 - 26, 0);
                        world.setBlock(j1 - 1, k1 + 16, l1 - 26, 0);
                        world.setBlock(j1 - 1, k1 + 15, l1 - 27, 0);
                        world.setBlock(j1 - 1, k1 + 16, l1 - 27, 0);
                        world.setBlock(j1 - 16, k1 + 14, l1 - 15, 0);
                        world.setBlock(j1 - 16, k1 + 14, l1 - 16, Block.cobblestoneMossy.blockID);
                        world.setBlock(j1 - 16, k1 + 14, l1 - 17, 0);
                        world.setBlock(j1 - 15, k1 + 14, l1 - 15, 0);
                        world.setBlock(j1 - 15, k1 + 14, l1 - 16, 0);
                        world.setBlock(j1 - 15, k1 + 14, l1 - 17, 0);
                        world.setBlock(j1 - 17, k1 + 14, l1 - 15, 0);
                        world.setBlock(j1 - 17, k1 + 14, l1 - 16, 0);
                        world.setBlock(j1 - 17, k1 + 14, l1 - 17, 0);
                        world.setBlock(j1 - 16, k1 + 15, l1 - 16, Block.chest.blockID);
                        TileEntityChest tileentitychest = (TileEntityChest) world.getBlockTileEntity(j1 - 16, k1 + 15, l1 - 16);
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
                        
                    }
                }
                j1++;
                world.setBlock(j1, k1, l1, Block.cobblestone.blockID);
                world.setBlock(j1, k1, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 + 1, l1, 0);
                world.setBlock(j1, k1 + 1, l1 + 1, 0);
                world.setBlock(j1, k1 + 1, l1 - 1, 0);
                world.setBlock(j1, k1 + 2, l1, 0);
                world.setBlock(j1, k1 + 2, l1 + 1, 0);
                world.setBlock(j1, k1 + 2, l1 - 1, 0);
                world.setBlock(j1, k1 + 3, l1, 0);
                world.setBlock(j1, k1 + 3, l1 + 1, 0);
                world.setBlock(j1, k1 + 3, l1 - 1, 0);
                world.setBlock(j1, k1 + 1, l1 + 2, Block.cobblestoneMossy.blockID);
                j1++;
                world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 + 1, l1, 0);
                world.setBlock(j1, k1 + 1, l1 + 1, 0);
                world.setBlock(j1, k1 + 1, l1 - 1, 0);
                world.setBlock(j1, k1 + 2, l1, 0);
                world.setBlock(j1, k1 + 2, l1 + 1, 0);
                world.setBlock(j1, k1 + 2, l1 - 1, 0);
                world.setBlock(j1, k1 + 3, l1, 0);
                world.setBlock(j1, k1 + 3, l1 + 1, 0);
                world.setBlock(j1, k1 + 3, l1 - 1, 0);
                j1++;
                world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 + 1, l1, 0);
                world.setBlock(j1, k1 + 1, l1 + 1, 0);
                world.setBlock(j1, k1 + 1, l1 - 1, 0);
                world.setBlock(j1, k1 + 2, l1, 0);
                world.setBlock(j1, k1 + 2, l1 + 1, 0);
                world.setBlock(j1, k1 + 2, l1 - 1, 0);
                world.setBlock(j1, k1 + 3, l1, 0);
                world.setBlock(j1, k1 + 3, l1 + 1, 0);
                world.setBlock(j1, k1 + 3, l1 - 1, 0);
                world.setBlock(j1, k1 + 3, l1 + 2, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 + 1, l1 - 2, Block.cobblestone.blockID);
                j1++;
                world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1, l1 - 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 + 1, l1, 0);
                world.setBlock(j1, k1 + 1, l1 + 1, 0);
                world.setBlock(j1, k1 + 1, l1 + 2, 0);
                world.setBlock(j1, k1 + 1, l1 - 1, 0);
                world.setBlock(j1, k1 + 1, l1 - 2, 0);
                world.setBlock(j1, k1 + 2, l1, 0);
                world.setBlock(j1, k1 + 2, l1 + 1, 0);
                world.setBlock(j1, k1 + 2, l1 + 2, 0);
                world.setBlock(j1, k1 + 2, l1 - 1, 0);
                world.setBlock(j1, k1 + 3, l1, 0);
                world.setBlock(j1, k1 + 3, l1 + 1, 0);
                world.setBlock(j1, k1 + 3, l1 - 1, 0);
                j1++;
                world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1, l1 - 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 + 1, l1, 0);
                world.setBlock(j1, k1 + 1, l1 + 1, 0);
                world.setBlock(j1, k1 + 1, l1 - 1, 0);
                world.setBlock(j1, k1 + 1, l1 + 2, 0);
                world.setBlock(j1, k1 + 1, l1 + 3, 0);
                world.setBlock(j1, k1 + 1, l1 - 2, 0);
                world.setBlock(j1, k1 + 2, l1, 0);
                world.setBlock(j1, k1 + 2, l1 + 1, 0);
                world.setBlock(j1, k1 + 2, l1 + 2, 0);
                world.setBlock(j1, k1 + 2, l1 - 1, 0);
                world.setBlock(j1, k1 + 2, l1 - 2, 0);
                world.setBlock(j1, k1 + 3, l1, 0);
                world.setBlock(j1, k1 + 3, l1 + 1, 0);
                world.setBlock(j1, k1 + 3, l1 + 2, 0);
                world.setBlock(j1, k1 + 3, l1 - 1, 0);
                world.setBlock(j1, k1 + 3, l1 - 2, 0);
                world.setBlock(j1, k1 + 3, l1 - 3, 0);
                world.setBlock(j1, k1 + 1, l1 + 2, Block.cobblestone.blockID);
                world.setBlock(j1, k1 + 2, l1 + 2, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 + 1, l1 - 2, Block.cobblestone.blockID);
                j1++;
                world.setBlock(j1, k1 + 1, l1, 0);
                world.setBlock(j1, k1 + 2, l1, 0);
                world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 + 1, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 + 1, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 + 2, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 + 2, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 + 3, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 + 3, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 + 3, l1, Block.cobblestoneMossy.blockID);
                j1++;
                int k3 = random.nextInt(2) + 1;
                if(k3 == 1)
                {
                    int l3 = random.nextInt(2) + 1;
                    world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 2, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 3, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 4, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 1, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 2, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 3, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 4, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 1, l1, 0);
                    world.setBlock(j1, k1 + 2, l1, 0);
                    world.setBlock(j1, k1 + 3, l1, 0);
                    world.setBlock(j1, k1 + 4, l1, 0);
                    world.setBlock(j1, k1 + 1, l1 + 1, 0);
                    world.setBlock(j1, k1 + 1, l1 + 2, 0);
                    world.setBlock(j1, k1 + 1, l1 + 3, 0);
                    world.setBlock(j1, k1 + 1, l1 + 4, 0);
                    world.setBlock(j1, k1 + 1, l1 - 1, 0);
                    world.setBlock(j1, k1 + 1, l1 - 2, 0);
                    world.setBlock(j1, k1 + 1, l1 - 3, 0);
                    world.setBlock(j1, k1 + 1, l1 - 4, 0);
                    world.setBlock(j1, k1 + 2, l1 + 1, 0);
                    world.setBlock(j1, k1 + 2, l1 + 2, 0);
                    world.setBlock(j1, k1 + 2, l1 + 3, 0);
                    world.setBlock(j1, k1 + 2, l1 + 4, 0);
                    world.setBlock(j1, k1 + 2, l1 - 1, 0);
                    world.setBlock(j1, k1 + 2, l1 - 2, 0);
                    world.setBlock(j1, k1 + 2, l1 - 3, 0);
                    world.setBlock(j1, k1 + 2, l1 - 4, 0);
                    world.setBlock(j1, k1 + 3, l1 + 1, 0);
                    world.setBlock(j1, k1 + 3, l1 + 2, 0);
                    world.setBlock(j1, k1 + 3, l1 + 3, 0);
                    world.setBlock(j1, k1 + 3, l1 + 4, 0);
                    world.setBlock(j1, k1 + 3, l1 - 1, 0);
                    world.setBlock(j1, k1 + 3, l1 - 2, 0);
                    world.setBlock(j1, k1 + 3, l1 - 3, 0);
                    world.setBlock(j1, k1 + 3, l1 - 4, 0);
                    world.setBlock(j1, k1 + 4, l1 + 1, 0);
                    world.setBlock(j1, k1 + 4, l1 + 2, 0);
                    world.setBlock(j1, k1 + 4, l1 + 3, 0);
                    world.setBlock(j1, k1 + 4, l1 + 4, 0);
                    world.setBlock(j1, k1 + 4, l1 - 1, 0);
                    world.setBlock(j1, k1 + 4, l1 - 2, 0);
                    world.setBlock(j1, k1 + 4, l1 - 3, 0);
                    world.setBlock(j1, k1 + 4, l1 - 4, 0);
                    world.setBlock(j1, k1 + 1, l1 + 5, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 5, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 2, l1 - 5, Block.cobblestone.blockID);
                    j1++;
                    world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 2, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 3, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 4, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 2, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 3, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 4, Block.cobblestone.blockID);
                    
                    for(int u = 0; u<5;u++)
                    {
                    	world.setBlock(j1, k1+1, l1 + u, 0);
                    	world.setBlock(j1, k1+2, l1 + u, 0);
                    	world.setBlock(j1, k1+3, l1 + u, 0);
                    	world.setBlock(j1, k1+4, l1 + u, 0);
                    	world.setBlock(j1, k1+1, l1 - u, 0);
                    	world.setBlock(j1, k1+2, l1 - u, 0);
                    	world.setBlock(j1, k1+3, l1 - u, 0);
                    	world.setBlock(j1, k1+4, l1 - u, 0);
                    }
                    world.setBlock(j1, k1 + 1, l1 + 5, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 2, l1 + 5, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 3, l1 + 5, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 5, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 2, l1 - 5, Block.cobblestoneMossy.blockID);
                    if(l3 == 1)
                    {
                        int k4 = random.nextInt(100);
                        if(k4 <= 60)
                        {
                        	for(int u=1;u<4;u++)
                        	{
                        		world.setBlock(j1, k1 + u, l1 + u, Block.bookShelf.blockID);
                        	}
                        }
                    }
                    if(l3 == 2)
                    {
                        int l4 = random.nextInt(100);
                        if(l4 <= 40)
                        {
                            world.setBlock(j1, k1 + 1, l1 + 1, Block.blockIron.blockID);
                            world.setBlock(j1, k1 + 2, l1 + 1, Block.blockIron.blockID);
                            world.setBlock(j1, k1 + 1, l1 + 2, Block.blockIron.blockID);
                            world.setBlock(j1, k1 + 2, l1 + 2, 0);
                            world.setBlock(j1, k1 + 3, l1 + 2, 0);
                            world.setBlock(j1, k1 + 1, l1 + 3, 0);
                        }
                    }
                    j1++;
                    world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 2, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 3, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 4, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 1, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 2, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 3, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 4, Block.cobblestone.blockID);
                    for(int u=0;u<5;u++)
                    {
                    	world.setBlock(j1, k1+1, l1+u, 0);
                    	world.setBlock(j1, k1+2, l1+u, 0);
                    	world.setBlock(j1, k1+3, l1+u, 0);
                    	world.setBlock(j1, k1+4, l1+u, 0);
                       	world.setBlock(j1, k1+1, l1-u, 0);
                    	world.setBlock(j1, k1+2, l1-u, 0);
                    	world.setBlock(j1, k1+3, l1-u, 0);
                    	world.setBlock(j1, k1+4, l1-u, 0);
                    }
                    world.setBlock(j1, k1 + 2, l1 + 5, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 5, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 2, l1 - 5, Block.cobblestone.blockID);
                    if(l3 == 2)
                    {
                        int i5 = random.nextInt(100);
                        if(i5 <= 40)
                        {
                            world.setBlock(j1, k1 + 1, l1 + 1, Block.blockIron.blockID);
                            world.setBlock(j1, k1 + 1, l1 + 2, Block.blockIron.blockID);
                            world.setBlock(j1, k1 + 2, l1 + 2, 0);
                            world.setBlock(j1, k1 + 1, l1 + 3, 0);
                        }
                    }
                    j1++;
                    world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 1, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 2, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 3, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 4, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 2, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 3, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 4, Block.cobblestone.blockID);
                    
                    for(int u=0;u<5;u++)
                    {
                    	world.setBlock(j1, k1+1, l1+u, 0);
                    	world.setBlock(j1, k1+2, l1+u, 0);
                    	world.setBlock(j1, k1+3, l1+u, 0);
                    	world.setBlock(j1, k1+4, l1+u, 0);
                       	world.setBlock(j1, k1+1, l1-u, 0);
                    	world.setBlock(j1, k1+2, l1-u, 0);
                    	world.setBlock(j1, k1+3, l1-u, 0);
                    	world.setBlock(j1, k1+4, l1-u, 0);
                    }

                    world.setBlock(j1, k1 + 1, l1 + 5, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 2, l1 + 5, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 3, l1 + 5, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 2, l1 - 5, Block.cobblestone.blockID);
                    if(l3 == 1)
                    {
                        int j5 = random.nextInt(100);
                        if(j5 <= 15)
                        {
                            world.setBlock(j1, k1 + 1, l1 + 1, Block.mobSpawner.blockID);
                            TileEntityMobSpawner spawner = (TileEntityMobSpawner) world.getBlockTileEntity(j1, k1 + 1, l1 + 1);
                            if(spawner != null)
                            {
                            	spawner.func_98049_a().setMobID("Zombie");
                            }           
                            world.setBlock(j1, k1 + 2, l1 + 1, Block.chest.blockID);
                            TileEntityChest chest = (TileEntityChest) world.getBlockTileEntity(j1, k1 + 2, l1 + 1);
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
                            world.setBlock(j1, k1 + 3, l1 + 1, Block.mobSpawner.blockID);
                            TileEntityMobSpawner spawnerII = (TileEntityMobSpawner) world.getBlockTileEntity(j1, k1 + 3, l1 + 1);
                            if(spawnerII != null)
                            {
                            	spawnerII.func_98049_a().setMobID("CaveSpider");
                            }           
                            world.setBlock(j1, k1 + 1, l1 + 2, 0);
                            world.setBlock(j1, k1 + 2, l1 + 2, 0);
                            world.setBlock(j1, k1 + 3, l1 + 2, 0);
                            world.setBlock(j1, k1 + 1, l1 + 3, 0);
                            world.setBlock(j1, k1 + 2, l1 + 3, 0);
                            world.setBlock(j1, k1 + 3, l1 + 3, 0);
                           
                        }
                        world.setBlock(j1, k1 + 1, l1 - 2, Block.planks.blockID);
                        world.setBlock(j1, k1 + 1, l1 - 3, Block.planks.blockID);
                    }
                    j1++;
                    world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 1, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 2, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 3, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 4, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 1, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 2, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 3, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 4, Block.cobblestone.blockID);
                    for(int u = 0; u<5;u++)
                    {
                    	world.setBlock(j1, k1+1, l1 + u, 0);
                    	world.setBlock(j1, k1+2, l1 + u, 0);
                    	world.setBlock(j1, k1+3, l1 + u, 0);
                    	world.setBlock(j1, k1+4, l1 + u, 0);
                    	world.setBlock(j1, k1+1, l1 - u, 0);
                    	world.setBlock(j1, k1+2, l1 - u, 0);
                    	world.setBlock(j1, k1+3, l1 - u, 0);
                    	world.setBlock(j1, k1+4, l1 - u, 0);
                    }
                    world.setBlock(j1, k1 + 1, l1 + 5, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 2, l1 + 5, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 5, Block.cobblestoneMossy.blockID);
                    if(l3 == 1)
                    {
                        world.setBlock(j1, k1 + 1, l1 - 2, Block.planks.blockID);
                        world.setBlock(j1, k1 + 1, l1 - 3, Block.planks.blockID);
                    }
                    if(l3 == 2)
                    {
                        int k5 = random.nextInt(100);
                        if(k5 <= 30)
                        {
                            world.setBlock(j1, k1 + 1, l1 + 1, Block.blockIron.blockID);
                            world.setBlock(j1, k1 + 1, l1 + 2, Block.blockIron.blockID);
                            world.setBlock(j1, k1 + 2, l1 + 2, Block.blockIron.blockID);
                            world.setBlock(j1, k1 + 1, l1 + 3, Block.mobSpawner.blockID);
                            TileEntityMobSpawner spawner = (TileEntityMobSpawner) world.getBlockTileEntity(j1, k1 + 1, l1 + 3);
                            if(spawner != null)
                            {
                            	spawner.func_98049_a().setMobID("Creeper");
                            }           
                        }
                    }
                    j1++;
                    world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 1, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 2, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 3, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 4, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 2, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 3, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 4, Block.cobblestoneMossy.blockID);
                    for(int u = 0; u<5;u++)
                    {
                    	world.setBlock(j1, k1+1, l1 + u, 0);
                    	world.setBlock(j1, k1+2, l1 + u, 0);
                    	world.setBlock(j1, k1+3, l1 + u, 0);
                    	world.setBlock(j1, k1+4, l1 + u, 0);
                    	world.setBlock(j1, k1+1, l1 - u, 0);
                    	world.setBlock(j1, k1+2, l1 - u, 0);
                    	world.setBlock(j1, k1+3, l1 - u, 0);
                    	world.setBlock(j1, k1+4, l1 - u, 0);
                    }
                    world.setBlock(j1, k1 + 1, l1 + 5, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 2, l1 + 5, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 3, l1 + 5, Block.cobblestoneMossy.blockID);
                    if(l3 == 1)
                    {
                        int l5 = random.nextInt(100);
                        if(l5 <= 60)
                        {
                            world.setBlock(j1, k1 + 1, l1 + 1, Block.bookShelf.blockID);
                            world.setBlock(j1, k1 + 2, l1 + 1, Block.bookShelf.blockID);
                            world.setBlock(j1, k1 + 3, l1 + 1, Block.bookShelf.blockID);
                            world.setBlock(j1, k1 + 1, l1 + 2, Block.bookShelf.blockID);
                            world.setBlock(j1, k1 + 2, l1 + 2, Block.mobSpawner.blockID);
                            TileEntityMobSpawner spawner = (TileEntityMobSpawner) world.getBlockTileEntity(j1, k1 + 2, l1 + 2);
                            if(spawner != null)
                            {
                            	spawner.func_98049_a().setMobID("Skeleton");
                            }           
                            world.setBlock(j1, k1 + 3, l1 + 2, Block.bookShelf.blockID);
                            world.setBlock(j1, k1 + 1, l1 + 3, Block.bookShelf.blockID);
                            world.setBlock(j1, k1 + 2, l1 + 3, Block.bookShelf.blockID);
                            world.setBlock(j1, k1 + 3, l1 + 3, Block.bookShelf.blockID);
                        }
                        world.setBlock(j1, k1 + 1, l1 - 2, Block.planks.blockID);
                        world.setBlock(j1, k1 + 1, l1 - 3, Block.planks.blockID);
                    }
                    int i6 = random.nextInt(100);
                    if(i6 <= 30)
                    {
                        world.setBlock(j1 - 1, k1 + 4, l1 + 3, Block.vine.blockID);
                        world.setBlock(j1 - 1, k1 + 4, l1 + 2, Block.vine.blockID);
                        world.setBlock(j1 - 3, k1 + 4, l1 - 1, Block.vine.blockID);
                        world.setBlock(j1 - 3, k1 + 4, l1 + 1, Block.vine.blockID);
                        world.setBlock(j1 - 3, k1 + 4, l1, Block.vine.blockID);
                        world.setBlock(j1 - 3, k1 + 4, l1 - 3, Block.vine.blockID);
                    }
                    j1++;
                    world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 1, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 2, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 3, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 4, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 2, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 3, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 4, Block.cobblestoneMossy.blockID);
                    for(int u = 0; u<5;u++)
                    {
                    	world.setBlock(j1, k1+1, l1 + u, 0);
                    	world.setBlock(j1, k1+2, l1 + u, 0);
                    	world.setBlock(j1, k1+3, l1 + u, 0);
                    	world.setBlock(j1, k1+4, l1 + u, 0);
                    	world.setBlock(j1, k1+1, l1 - u, 0);
                    	world.setBlock(j1, k1+2, l1 - u, 0);
                    	world.setBlock(j1, k1+3, l1 - u, 0);
                    	world.setBlock(j1, k1+4, l1 - u, 0);
                    }
                    world.setBlock(j1, k1 + 1, l1 + 5, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 2, l1 + 5, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 5, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 2, l1 - 5, Block.cobblestone.blockID);
                    if(l3 == 2)
                    {
                        int l6 = random.nextInt(100);
                        if(l6 <= 30)
                        {
                            world.setBlock(j1, k1 + 1, l1 + 1, Block.blockGold.blockID);
                            world.setBlock(j1, k1 + 1, l1 + 2, Block.mobSpawner.blockID);
                            TileEntityMobSpawner spawner = (TileEntityMobSpawner) world.getBlockTileEntity(j1, k1 + 1, l1 + 2);
                            if(spawner != null)
                            {
                            	spawner.func_98049_a().setMobID("Blaze");
                            }           
                            world.setBlock(j1, k1 + 1, l1 + 3, Block.blockGold.blockID);
                        }
                    }
                    j1++;
                    world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 1, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 2, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 3, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 4, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 1, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 2, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 3, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 4, Block.cobblestoneMossy.blockID);
                    for(int u = 0; u<5;u++)
                    {
                    	world.setBlock(j1, k1+1, l1 + u, 0);
                    	world.setBlock(j1, k1+2, l1 + u, 0);
                    	world.setBlock(j1, k1+3, l1 + u, 0);
                    	world.setBlock(j1, k1+4, l1 + u, 0);
                    	world.setBlock(j1, k1+1, l1 - u, 0);
                    	world.setBlock(j1, k1+2, l1 - u, 0);
                    	world.setBlock(j1, k1+3, l1 - u, 0);
                    	world.setBlock(j1, k1+4, l1 - u, 0);
                    }
                    world.setBlock(j1, k1 + 1, l1 + 5, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 2, l1 + 5, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 5, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 3, l1 - 5, Block.cobblestone.blockID);
                    if(l3 == 1)
                    {
                        int i7 = random.nextInt(100);
                        if(i7 <= 60)
                        {
                            world.setBlock(j1, k1 + 1, l1 + 1, Block.bookShelf.blockID);
                            world.setBlock(j1, k1 + 2, l1 + 1, Block.bookShelf.blockID);
                            world.setBlock(j1, k1 + 3, l1 + 1, Block.bookShelf.blockID);
                            world.setBlock(j1, k1 + 1, l1 + 2, Block.bookShelf.blockID);
                            world.setBlock(j1, k1 + 2, l1 + 2, Block.bookShelf.blockID);
                            world.setBlock(j1, k1 + 3, l1 + 2, Block.bookShelf.blockID);
                            world.setBlock(j1, k1 + 1, l1 + 3, Block.bookShelf.blockID);
                            world.setBlock(j1, k1 + 2, l1 + 3, Block.bookShelf.blockID);
                            world.setBlock(j1, k1 + 3, l1 + 3, Block.bookShelf.blockID);
                        }
                    }
                    if(l3 == 2)
                    {
                        int j7 = random.nextInt(100);
                        if(j7 <= 20)
                        {
                            world.setBlock(j1, k1 + 1, l1 + 1, Block.blockGold.blockID);
                            world.setBlock(j1, k1 + 2, l1 + 1, Block.blockGold.blockID);
                            world.setBlock(j1, k1 + 1, l1 + 2, Block.blockGold.blockID);
                            world.setBlock(j1, k1 + 2, l1 + 2, Block.blockGold.blockID);
                            world.setBlock(j1, k1 + 1, l1 + 3, Block.blockGold.blockID);
                        }
                        int j8 = random.nextInt(100);
                        if(j8 <= 30)
                        {
                            world.setBlock(j1, k1 + 1, l1 - 1, 0);
                            world.setBlock(j1, k1 + 2, l1 - 1, Block.mobSpawner.blockID);
                            TileEntityMobSpawner spawner = (TileEntityMobSpawner) world.getBlockTileEntity(j1, k1 + 2, l1 - 1);
                            if(spawner != null)
                            {
                            	spawner.func_98049_a().setMobID("Zombie");
                            }           
                            world.setBlock(j1, k1 + 1, l1 - 2, 0);
                            world.setBlock(j1, k1 + 2, l1 - 2, 0);
                            world.setBlock(j1 - 1, k1 + 1, l1 - 1, 0);
                            world.setBlock(j1 - 1, k1 + 2, l1 - 2, 0);
                            world.setBlock(j1 - 1, k1 + 1, l1 - 2, 0);
                        }
                        int j9 = random.nextInt(100);
                        if(j9 <= 10)
                        {
                            world.setBlock(j1 - 3, k1 + 1, l1 - 1, Block.blockDiamond.blockID);
                            world.setBlock(j1 - 3, k1 + 1, l1 - 2, Block.blockDiamond.blockID);
                        }
                        int j10 = random.nextInt(100);
                        if(j10 <= 10)
                        {
                            world.setBlock(j1 - 3, k1 + 1, l1 - 2, Block.blockDiamond.blockID);
                        }
                        int j11 = random.nextInt(100);
                        if(j11 <= 15)
                        {
                            world.setBlock(j1 - 5, k1 + 1, l1 - 2, Block.chest.blockID);
                            TileEntityChest tileentitychest = (TileEntityChest) world.getBlockTileEntity(j1 - 5, k1 + 1, l1 - 2);
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
                            
                            world.setBlock(j1 - 5, k1 + 1, l1 - 3, 0);
                        }
                    }
                    j1++;
                    world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 2, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 3, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 4, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 1, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 2, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 3, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 4, Block.cobblestone.blockID);
                    for(int u = 0; u<5;u++)
                    {
                    	world.setBlock(j1, k1+1, l1 + u, 0);
                    	world.setBlock(j1, k1+2, l1 + u, 0);
                    	world.setBlock(j1, k1+3, l1 + u, 0);
                    	world.setBlock(j1, k1+4, l1 + u, 0);
                    	world.setBlock(j1, k1+1, l1 - u, 0);
                    	world.setBlock(j1, k1+2, l1 - u, 0);
                    	world.setBlock(j1, k1+3, l1 - u, 0);
                    	world.setBlock(j1, k1+4, l1 - u, 0);
                    }
                    world.setBlock(j1, k1 + 2, l1 - 5, Block.cobblestone.blockID);
                    int k7 = random.nextInt(100);
                    if(k7 <= 30)
                    {
                        world.setBlock(j1 - 2, k1 + 5, l1 - 2, 0);
                        world.setBlock(j1 - 2, k1 + 5, l1 - 3, 0);
                        world.setBlock(j1 - 2, k1 + 5, l1 - 1, 0);
                        world.setBlock(j1 - 1, k1 + 5, l1 - 2, 0);
                        world.setBlock(j1 - 3, k1 + 5, l1 - 2, 0);
                        world.setBlock(j1 - 5, k1 + 5, l1 - 2, 0);
                        world.setBlock(j1 - 2, k1 + 6, l1 - 2, 0);
                        world.setBlock(j1 - 2, k1 + 6, l1 - 1, 0);
                        world.setBlock(j1 - 1, k1 + 6, l1 - 2, 0);
                        world.setBlock(j1 - 3, k1 + 6, l1 - 2, 0);
                        world.setBlock(j1 - 2, k1 + 7, l1 - 2, 0);
                        world.setBlock(j1 - 2, k1 + 7, l1 - 1, 0);
                        world.setBlock(j1 - 1, k1 + 7, l1 - 2, 0);
                        world.setBlock(j1 - 3, k1 + 7, l1 - 2, 0);
                        world.setBlock(j1 - 2, k1 + 8, l1 - 2, 0);
                        world.setBlock(j1 - 2, k1 + 8, l1 - 1, 0);
                        world.setBlock(j1 - 1, k1 + 8, l1 - 2, 0);
                        world.setBlock(j1 - 2, k1 + 9, l1 - 2, 0);
                        world.setBlock(j1 - 2, k1 + 9, l1 - 1, 0);
                        world.setBlock(j1 - 1, k1 + 9, l1 - 2, 0);
                        world.setBlock(j1 - 2, k1 + 10, l1 - 1, 0);
                        world.setBlock(j1 - 1, k1 + 10, l1 - 2, 0);
                        world.setBlock(j1 - 2, k1 + 1, l1 - 2, Block.stone.blockID);
                        world.setBlock(j1 - 2, k1 + 1, l1 - 3, Block.gravel.blockID);
                        world.setBlock(j1 - 1, k1 + 1, l1 - 2, Block.stone.blockID);
                        world.setBlock(j1 - 1, k1 + 1, l1 - 3, Block.gravel.blockID);
                        world.setBlock(j1 - 2, k1 + 1, l1 - 1, Block.stone.blockID);
                        world.setBlock(j1 - 3, k1 + 1, l1 - 2, Block.stone.blockID);
                        world.setBlock(j1 - 2, k1 + 2, l1 - 2, Block.stone.blockID);
                        world.setBlock(j1 - 2, k1 + 2, l1 - 1, Block.gravel.blockID);
                        world.setBlock(j1 - 2, k1 + 3, l1 - 2, Block.stone.blockID);
                        world.setBlock(j1 - 2, k1 + 3, l1 - 1, Block.stone.blockID);
                        world.setBlock(j1 - 4, k1 + 3, l1 - 1, Block.gravel.blockID);
                        world.setBlock(j1 - 2, k1 + 3, l1, Block.gravel.blockID);
                        world.setBlock(j1 - 1, k1 + 3, l1 - 3, Block.stone.blockID);
                    }
                }
                if(k3 == 2)
                {
                    world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 1, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 2, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 3, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 4, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 5, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 6, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 7, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 8, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 2, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 3, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 4, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 5, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 6, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 7, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 8, Block.cobblestone.blockID);
                    for(int u = 0; u<9;u++)
                    {
                    	world.setBlock(j1, k1+1, l1 + u, 0);
                    	world.setBlock(j1, k1+2, l1 + u, 0);
                    	world.setBlock(j1, k1+3, l1 + u, 0);
                    	world.setBlock(j1, k1+4, l1 + u, 0);
                    	world.setBlock(j1, k1+5, l1 + u, 0);
                    	world.setBlock(j1, k1+1, l1 - u, 0);
                    	world.setBlock(j1, k1+2, l1 - u, 0);
                    	world.setBlock(j1, k1+3, l1 - u, 0);
                    	world.setBlock(j1, k1+4, l1 - u, 0);
                    	world.setBlock(j1, k1+5, l1 - u, 0);
                    }
                    world.setBlock(j1, k1 + 1, l1 + 9, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 2, l1 + 9, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 9, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 2, l1 - 9, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 3, l1 - 9, Block.cobblestoneMossy.blockID);
                    int i4 = random.nextInt(100);
                    if(i4 <= 60)
                    {
                        world.setBlock(j1, k1, l1, 0);
                        world.setBlock(j1, k1 - 1, l1, 0);
                        world.setBlock(j1, k1 - 2, l1, 0);
                        world.setBlock(j1, k1 - 3, l1, 0);
                        world.setBlock(j1, k1 - 4, l1, 0);
                        world.setBlock(j1, k1 - 5, l1, 0);
                        world.setBlock(j1, k1 - 6, l1, 0);
                        world.setBlock(j1, k1 - 7, l1, 0);
                        world.setBlock(j1, k1 - 8, l1, 0);
                        world.setBlock(j1, k1 - 9, l1, 0);
                        world.setBlock(j1, k1 - 10, l1, 0);
                        world.setBlock(j1, k1 - 11, l1, 0);
                        world.setBlock(j1, k1 - 12, l1, 0);
                        world.setBlock(j1, k1 - 13, l1, 0);
                        world.setBlock(j1, k1 - 13, l1 + 1, 0);
                        world.setBlock(j1, k1 - 13, l1 - 1, 0);
                        world.setBlock(j1, k1 - 14, l1, 0);
                        world.setBlock(j1, k1 - 14, l1 + 1, 0);
                        world.setBlock(j1, k1 - 14, l1 - 1, 0);
                        world.setBlock(j1 + 1, k1 - 13, l1 + 1, 0);
                        world.setBlock(j1 + 1, k1 - 13, l1 - 1, 0);
                        world.setBlock(j1 + 1, k1 - 14, l1 + 1, 0);
                        world.setBlock(j1 + 1, k1 - 14, l1 - 1, 0);
                    }
                    int j6 = random.nextInt(100);
                    if(j6 <= 70)
                    {
                        world.setBlock(j1, k1, l1 + 6, 0);
                        world.setBlock(j1, k1 - 1, l1 + 6, 0);
                        world.setBlock(j1, k1 - 2, l1 + 6, 0);
                        world.setBlock(j1, k1 - 3, l1 + 6, 0);
                        world.setBlock(j1, k1 - 4, l1 + 6, 0);
                        world.setBlock(j1, k1 - 5, l1 + 6, 0);
                        world.setBlock(j1, k1 - 6, l1 + 6, 0);
                        world.setBlock(j1, k1 - 7, l1 + 6, 0);
                        world.setBlock(j1, k1 - 8, l1 + 6, 0);
                        world.setBlock(j1, k1 - 9, l1 + 6, 0);
                        world.setBlock(j1, k1 - 10, l1 + 6, 0);
                        world.setBlock(j1, k1 - 11, l1 + 6, 0);
                        world.setBlock(j1, k1 - 11, l1 + 7, 0);
                        world.setBlock(j1, k1 - 11, l1 + 5, 0);
                        world.setBlock(j1, k1 - 12, l1 + 6, 0);
                        world.setBlock(j1, k1 - 12, l1 + 7, 0);
                        world.setBlock(j1, k1 - 12, l1 + 5, 0);
                        world.setBlock(j1 + 1, k1 - 11, l1 + 7, 0);
                        world.setBlock(j1 + 1, k1 - 11, l1 + 5, 0);
                        world.setBlock(j1 + 1, k1 - 12, l1 + 7, 0);
                        world.setBlock(j1 + 1, k1 - 12, l1 + 5, 0);
                    }
                    int l7 = random.nextInt(100);
                    if(l7 <= 50)
                    {
                        world.setBlock(j1 + 7, k1, l1 - 4, 0);
                        world.setBlock(j1 + 7, k1 - 1, l1 - 4, 0);
                        world.setBlock(j1 + 7, k1 - 2, l1 - 4, 0);
                        world.setBlock(j1 + 7, k1 - 3, l1 - 4, 0);
                        world.setBlock(j1 + 7, k1 - 4, l1 - 4, 0);
                        world.setBlock(j1 + 7, k1 - 5, l1 - 4, 0);
                        world.setBlock(j1 + 7, k1 - 6, l1 - 4, 0);
                        world.setBlock(j1 + 7, k1 - 7, l1 - 4, 0);
                        world.setBlock(j1 + 7, k1 - 8, l1 - 4, 0);
                        world.setBlock(j1 + 7, k1 - 9, l1 - 4, 0);
                        world.setBlock(j1 + 7, k1 - 10, l1 - 4, 0);
                        world.setBlock(j1 + 7, k1 - 11, l1 - 4, 0);
                        world.setBlock(j1 + 7, k1 - 12, l1 - 4, 0);
                        world.setBlock(j1 + 7, k1 - 13, l1 - 4, 0);
                        world.setBlock(j1 + 7, k1 - 14, l1 - 4, 0);
                        world.setBlock(j1 + 7, k1 - 15, l1 - 4, 0);
                        world.setBlock(j1 + 7, k1 - 15, l1 - 5, 0);
                        world.setBlock(j1 + 7, k1 - 15, l1 - 3, 0);
                        world.setBlock(j1 + 7, k1 - 16, l1 - 4, 0);
                        world.setBlock(j1 + 7, k1 - 16, l1 - 5, 0);
                        world.setBlock(j1 + 7, k1 - 16, l1 - 3, 0);
                        world.setBlock(j1 + 8, k1 - 15, l1 - 5, 0);
                        world.setBlock(j1 + 8, k1 - 15, l1 - 3, 0);
                        world.setBlock(j1 + 8, k1 - 16, l1 - 5, 0);
                        world.setBlock(j1 + 8, k1 - 16, l1 - 3, 0);
                    }
                    j1++;
                    world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 2, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 3, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 4, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 5, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 6, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 7, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 8, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 2, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 3, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 4, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 5, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 6, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 7, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 8, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 1, l1, 0);
                    world.setBlock(j1, k1 + 2, l1, 0);
                    world.setBlock(j1, k1 + 3, l1, 0);
                    world.setBlock(j1, k1 + 4, l1, 0);
                    world.setBlock(j1, k1 + 5, l1, 0);
                    world.setBlock(j1, k1 + 6, l1, 0);
                    world.setBlock(j1, k1 + 7, l1, 0);
                    world.setBlock(j1, k1 + 6, l1 + 1, 0);
                    world.setBlock(j1, k1 + 6, l1 - 1, 0);
                    world.setBlock(j1, k1 + 6, l1 + 2, 0);
                    world.setBlock(j1, k1 + 6, l1 - 2, 0);
                    world.setBlock(j1, k1 + 7, l1 + 1, 0);
                    world.setBlock(j1, k1 + 7, l1 - 1, 0);
                    world.setBlock(j1, k1 + 8, l1, 0);
                    world.setBlock(j1, k1 + 1, l1 + 1, 0);
                    world.setBlock(j1, k1 + 1, l1 + 2, 0);
                    world.setBlock(j1, k1 + 1, l1 + 3, 0);
                    world.setBlock(j1, k1 + 1, l1 + 4, 0);
                    world.setBlock(j1, k1 + 1, l1 + 5, 0);
                    world.setBlock(j1, k1 + 1, l1 + 6, 0);
                    world.setBlock(j1, k1 + 1, l1 + 7, 0);
                    world.setBlock(j1, k1 + 1, l1 + 8, 0);
                    world.setBlock(j1, k1 + 1, l1 - 1, 0);
                    world.setBlock(j1, k1 + 1, l1 - 2, 0);
                    world.setBlock(j1, k1 + 1, l1 - 3, 0);
                    world.setBlock(j1, k1 + 1, l1 - 4, 0);
                    world.setBlock(j1, k1 + 1, l1 - 5, 0);
                    world.setBlock(j1, k1 + 1, l1 - 6, 0);
                    world.setBlock(j1, k1 + 1, l1 - 7, 0);
                    world.setBlock(j1, k1 + 1, l1 - 8, 0);
                    world.setBlock(j1, k1 + 2, l1 + 1, 0);
                    world.setBlock(j1, k1 + 2, l1 + 2, 0);
                    world.setBlock(j1, k1 + 2, l1 + 3, 0);
                    world.setBlock(j1, k1 + 2, l1 + 4, 0);
                    world.setBlock(j1, k1 + 2, l1 + 5, 0);
                    world.setBlock(j1, k1 + 2, l1 + 6, 0);
                    world.setBlock(j1, k1 + 2, l1 + 7, 0);
                    world.setBlock(j1, k1 + 2, l1 + 8, 0);
                    world.setBlock(j1, k1 + 2, l1 - 1, 0);
                    world.setBlock(j1, k1 + 2, l1 - 2, 0);
                    world.setBlock(j1, k1 + 2, l1 - 3, 0);
                    world.setBlock(j1, k1 + 2, l1 - 4, 0);
                    world.setBlock(j1, k1 + 2, l1 - 5, 0);
                    world.setBlock(j1, k1 + 2, l1 - 6, 0);
                    world.setBlock(j1, k1 + 2, l1 - 7, 0);
                    world.setBlock(j1, k1 + 2, l1 - 8, 0);
                    world.setBlock(j1, k1 + 3, l1 + 1, 0);
                    world.setBlock(j1, k1 + 3, l1 + 2, 0);
                    world.setBlock(j1, k1 + 3, l1 + 3, 0);
                    world.setBlock(j1, k1 + 3, l1 + 4, 0);
                    world.setBlock(j1, k1 + 3, l1 + 5, 0);
                    world.setBlock(j1, k1 + 3, l1 + 6, 0);
                    world.setBlock(j1, k1 + 3, l1 + 7, 0);
                    world.setBlock(j1, k1 + 3, l1 + 8, 0);
                    world.setBlock(j1, k1 + 3, l1 - 1, 0);
                    world.setBlock(j1, k1 + 3, l1 - 2, 0);
                    world.setBlock(j1, k1 + 3, l1 - 3, 0);
                    world.setBlock(j1, k1 + 3, l1 - 4, 0);
                    world.setBlock(j1, k1 + 3, l1 - 5, 0);
                    world.setBlock(j1, k1 + 3, l1 - 6, 0);
                    world.setBlock(j1, k1 + 3, l1 - 7, 0);
                    world.setBlock(j1, k1 + 3, l1 - 8, 0);
                    world.setBlock(j1, k1 + 4, l1 + 1, 0);
                    world.setBlock(j1, k1 + 4, l1 + 2, 0);
                    world.setBlock(j1, k1 + 4, l1 + 3, 0);
                    world.setBlock(j1, k1 + 4, l1 + 4, 0);
                    world.setBlock(j1, k1 + 4, l1 + 5, 0);
                    world.setBlock(j1, k1 + 4, l1 + 6, 0);
                    world.setBlock(j1, k1 + 4, l1 + 7, 0);
                    world.setBlock(j1, k1 + 4, l1 + 8, 0);
                    world.setBlock(j1, k1 + 4, l1 - 1, 0);
                    world.setBlock(j1, k1 + 4, l1 - 2, 0);
                    world.setBlock(j1, k1 + 4, l1 - 3, 0);
                    world.setBlock(j1, k1 + 4, l1 - 4, 0);
                    world.setBlock(j1, k1 + 4, l1 - 5, 0);
                    world.setBlock(j1, k1 + 4, l1 - 6, 0);
                    world.setBlock(j1, k1 + 4, l1 - 7, 0);
                    world.setBlock(j1, k1 + 4, l1 - 8, 0);
                    world.setBlock(j1, k1 + 5, l1 + 1, 0);
                    world.setBlock(j1, k1 + 5, l1 + 2, 0);
                    world.setBlock(j1, k1 + 5, l1 + 3, 0);
                    world.setBlock(j1, k1 + 5, l1 + 4, 0);
                    world.setBlock(j1, k1 + 5, l1 + 5, 0);
                    world.setBlock(j1, k1 + 5, l1 + 6, 0);
                    world.setBlock(j1, k1 + 5, l1 + 7, 0);
                    world.setBlock(j1, k1 + 5, l1 + 8, 0);
                    world.setBlock(j1, k1 + 5, l1 - 1, 0);
                    world.setBlock(j1, k1 + 5, l1 - 2, 0);
                    world.setBlock(j1, k1 + 5, l1 - 3, 0);
                    world.setBlock(j1, k1 + 5, l1 - 4, 0);
                    world.setBlock(j1, k1 + 5, l1 - 5, 0);
                    world.setBlock(j1, k1 + 5, l1 - 6, 0);
                    world.setBlock(j1, k1 + 5, l1 - 7, 0);
                    world.setBlock(j1, k1 + 5, l1 - 8, 0);
                    world.setBlock(j1, k1 + 1, l1 + 9, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 2, l1 + 9, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 3, l1 + 9, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 9, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 2, l1 - 9, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 1, l1 + 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 2, l1 + 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 3, l1 + 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 4, l1 + 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 5, l1 + 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 1, l1 - 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 2, l1 - 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 3, l1 - 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 4, l1 - 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 5, l1 - 6, Block.blockNetherQuartz.blockID, 2, 2);
                    j1++;
                    world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 2, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 3, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 4, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 5, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 6, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 7, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 8, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 1, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 2, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 3, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 4, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 5, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 6, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 7, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 8, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 1, l1, 0);
                    world.setBlock(j1, k1 + 2, l1, 0);
                    world.setBlock(j1, k1 + 3, l1, 0);
                    world.setBlock(j1, k1 + 4, l1, 0);
                    world.setBlock(j1, k1 + 5, l1, 0);
                    world.setBlock(j1, k1 + 6, l1, 0);
                    world.setBlock(j1, k1 + 7, l1, 0);
                    world.setBlock(j1, k1 + 6, l1 + 1, 0);
                    world.setBlock(j1, k1 + 6, l1 - 1, 0);
                    world.setBlock(j1, k1 + 6, l1 + 2, 0);
                    world.setBlock(j1, k1 + 6, l1 - 2, 0);
                    world.setBlock(j1, k1 + 7, l1 + 1, 0);
                    world.setBlock(j1, k1 + 7, l1 - 1, 0);
                    world.setBlock(j1, k1 + 8, l1, 0);
                    for(int u = 1; u<9;u++)
                    {
                    	world.setBlock(j1, k1+1, l1 + u, 0);
                    	world.setBlock(j1, k1+2, l1 + u, 0);
                    	world.setBlock(j1, k1+3, l1 + u, 0);
                    	world.setBlock(j1, k1+4, l1 + u, 0);
                    	world.setBlock(j1, k1+5, l1 + u, 0);
                    	world.setBlock(j1, k1+1, l1 - u, 0);
                    	world.setBlock(j1, k1+2, l1 - u, 0);
                    	world.setBlock(j1, k1+3, l1 - u, 0);
                    	world.setBlock(j1, k1+4, l1 - u, 0);
                    	world.setBlock(j1, k1+5, l1 - u, 0);
                    }
                    world.setBlock(j1, k1 + 2, l1 + 9, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 9, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 2, l1 - 9, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 1, l1, Block.stoneSingleSlab.blockID);
                    world.setBlock(j1, k1 + 1, l1 + 1, Block.stoneSingleSlab.blockID);
                    world.setBlock(j1, k1 + 1, l1 + 2, Block.stoneSingleSlab.blockID);
                    world.setBlock(j1, k1 + 1, l1 + 3, Block.stoneSingleSlab.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 1, Block.stoneSingleSlab.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 2, Block.stoneSingleSlab.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 3, Block.stoneSingleSlab.blockID);
                    j1++;
                    world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 1, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 2, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 3, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 4, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 5, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 6, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 7, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 8, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 2, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 3, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 4, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 5, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 6, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 7, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 8, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 1, l1, 0);
                    world.setBlock(j1, k1 + 2, l1, 0);
                    world.setBlock(j1, k1 + 3, l1, 0);
                    world.setBlock(j1, k1 + 4, l1, 0);
                    world.setBlock(j1, k1 + 5, l1, 0);
                    world.setBlock(j1, k1 + 6, l1, 0);
                    world.setBlock(j1, k1 + 7, l1, 0);
                    world.setBlock(j1, k1 + 6, l1 + 1, 0);
                    world.setBlock(j1, k1 + 6, l1 - 1, 0);
                    world.setBlock(j1, k1 + 6, l1 + 2, 0);
                    world.setBlock(j1, k1 + 6, l1 - 2, 0);
                    world.setBlock(j1, k1 + 7, l1 + 1, 0);
                    world.setBlock(j1, k1 + 7, l1 - 1, 0);
                    world.setBlock(j1, k1 + 8, l1, 0);
                    world.setBlock(j1, k1 + 1, l1 + 1, 0);
                    world.setBlock(j1, k1 + 1, l1 + 2, 0);
                    world.setBlock(j1, k1 + 1, l1 + 3, 0);
                    world.setBlock(j1, k1 + 1, l1 + 4, 0);
                    world.setBlock(j1, k1 + 1, l1 + 5, 0);
                    world.setBlock(j1, k1 + 1, l1 + 6, 0);
                    world.setBlock(j1, k1 + 1, l1 + 7, 0);
                    world.setBlock(j1, k1 + 1, l1 + 8, 0);
                    world.setBlock(j1, k1 + 1, l1 - 1, 0);
                    world.setBlock(j1, k1 + 1, l1 - 2, 0);
                    world.setBlock(j1, k1 + 1, l1 - 3, 0);
                    world.setBlock(j1, k1 + 1, l1 - 4, 0);
                    world.setBlock(j1, k1 + 1, l1 - 5, 0);
                    world.setBlock(j1, k1 + 1, l1 - 6, 0);
                    world.setBlock(j1, k1 + 1, l1 - 7, 0);
                    world.setBlock(j1, k1 + 1, l1 - 8, 0);
                    world.setBlock(j1, k1 + 2, l1 + 1, 0);
                    world.setBlock(j1, k1 + 2, l1 + 2, 0);
                    world.setBlock(j1, k1 + 2, l1 + 3, 0);
                    world.setBlock(j1, k1 + 2, l1 + 4, 0);
                    world.setBlock(j1, k1 + 2, l1 + 5, 0);
                    world.setBlock(j1, k1 + 2, l1 + 6, 0);
                    world.setBlock(j1, k1 + 2, l1 + 7, 0);
                    world.setBlock(j1, k1 + 2, l1 + 8, 0);
                    world.setBlock(j1, k1 + 2, l1 - 1, 0);
                    world.setBlock(j1, k1 + 2, l1 - 2, 0);
                    world.setBlock(j1, k1 + 2, l1 - 3, 0);
                    world.setBlock(j1, k1 + 2, l1 - 4, 0);
                    world.setBlock(j1, k1 + 2, l1 - 5, 0);
                    world.setBlock(j1, k1 + 2, l1 - 6, 0);
                    world.setBlock(j1, k1 + 2, l1 - 7, 0);
                    world.setBlock(j1, k1 + 2, l1 - 8, 0);
                    world.setBlock(j1, k1 + 3, l1 + 1, 0);
                    world.setBlock(j1, k1 + 3, l1 + 2, 0);
                    world.setBlock(j1, k1 + 3, l1 + 3, 0);
                    world.setBlock(j1, k1 + 3, l1 + 4, 0);
                    world.setBlock(j1, k1 + 3, l1 + 5, 0);
                    world.setBlock(j1, k1 + 3, l1 + 6, 0);
                    world.setBlock(j1, k1 + 3, l1 + 7, 0);
                    world.setBlock(j1, k1 + 3, l1 + 8, 0);
                    world.setBlock(j1, k1 + 3, l1 - 1, 0);
                    world.setBlock(j1, k1 + 3, l1 - 2, 0);
                    world.setBlock(j1, k1 + 3, l1 - 3, 0);
                    world.setBlock(j1, k1 + 3, l1 - 4, 0);
                    world.setBlock(j1, k1 + 3, l1 - 5, 0);
                    world.setBlock(j1, k1 + 3, l1 - 6, 0);
                    world.setBlock(j1, k1 + 3, l1 - 7, 0);
                    world.setBlock(j1, k1 + 3, l1 - 8, 0);
                    world.setBlock(j1, k1 + 4, l1 + 1, 0);
                    world.setBlock(j1, k1 + 4, l1 + 2, 0);
                    world.setBlock(j1, k1 + 4, l1 + 3, 0);
                    world.setBlock(j1, k1 + 4, l1 + 4, 0);
                    world.setBlock(j1, k1 + 4, l1 + 5, 0);
                    world.setBlock(j1, k1 + 4, l1 + 6, 0);
                    world.setBlock(j1, k1 + 4, l1 + 7, 0);
                    world.setBlock(j1, k1 + 4, l1 + 8, 0);
                    world.setBlock(j1, k1 + 4, l1 - 1, 0);
                    world.setBlock(j1, k1 + 4, l1 - 2, 0);
                    world.setBlock(j1, k1 + 4, l1 - 3, 0);
                    world.setBlock(j1, k1 + 4, l1 - 4, 0);
                    world.setBlock(j1, k1 + 4, l1 - 5, 0);
                    world.setBlock(j1, k1 + 4, l1 - 6, 0);
                    world.setBlock(j1, k1 + 4, l1 - 7, 0);
                    world.setBlock(j1, k1 + 4, l1 - 8, 0);
                    world.setBlock(j1, k1 + 5, l1 + 1, 0);
                    world.setBlock(j1, k1 + 5, l1 + 2, 0);
                    world.setBlock(j1, k1 + 5, l1 + 3, 0);
                    world.setBlock(j1, k1 + 5, l1 + 4, 0);
                    world.setBlock(j1, k1 + 5, l1 + 5, 0);
                    world.setBlock(j1, k1 + 5, l1 + 6, 0);
                    world.setBlock(j1, k1 + 5, l1 + 7, 0);
                    world.setBlock(j1, k1 + 5, l1 + 8, 0);
                    world.setBlock(j1, k1 + 5, l1 - 1, 0);
                    world.setBlock(j1, k1 + 5, l1 - 2, 0);
                    world.setBlock(j1, k1 + 5, l1 - 3, 0);
                    world.setBlock(j1, k1 + 5, l1 - 4, 0);
                    world.setBlock(j1, k1 + 5, l1 - 5, 0);
                    world.setBlock(j1, k1 + 5, l1 - 6, 0);
                    world.setBlock(j1, k1 + 5, l1 - 7, 0);
                    world.setBlock(j1, k1 + 5, l1 - 8, 0);
                    world.setBlock(j1, k1 + 1, l1 + 9, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 2, l1 + 9, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 3, l1 + 9, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 9, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 2, l1 - 9, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 1, l1 + 3, Block.stoneSingleSlab.blockID);
                    world.setBlock(j1, k1, l1, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 1, l1, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 2, l1, Block.obsidian.blockID);
                    world.setBlock(j1, k1, l1 + 1, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 1, l1 + 1, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 2, l1 + 1, Block.obsidian.blockID);
                    world.setBlock(j1, k1, l1 + 2, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 1, l1 + 2, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 2, l1 + 2, Block.obsidian.blockID);
                    world.setBlock(j1, k1, l1 - 1, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 1, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 2, l1 - 1, Block.obsidian.blockID);
                    world.setBlock(j1, k1, l1 - 2, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 2, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 2, l1 - 2, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 3, Block.stoneSingleSlab.blockID);
                    world.setBlock(j1, k1 + 1, l1 + 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 2, l1 + 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 3, l1 + 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 4, l1 + 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 5, l1 + 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 1, l1 - 6, Block.blockNetherQuartz.blockID, 2, 2);
                    int k8 = random.nextInt(100);
                    if(k8 <= 15)
                    {
                        world.setBlock(j1, k1 + 1, l1 - 7, Block.chest.blockID);
                        TileEntityChest tileentitychest = (TileEntityChest) world.getBlockTileEntity(j1, k1 + 1, l1 - 7);
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
                        
                    }
                    world.setBlock(j1, k1 + 2, l1 - 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 3, l1 - 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 4, l1 - 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 5, l1 - 6, Block.blockNetherQuartz.blockID, 2, 2);
                    j1++;
                    world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 2, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 3, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 4, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 5, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 6, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 7, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 8, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 1, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 2, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 3, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 4, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 5, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 6, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 7, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 8, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 1, l1, 0);
                    world.setBlock(j1, k1 + 2, l1, 0);
                    world.setBlock(j1, k1 + 3, l1, 0);
                    world.setBlock(j1, k1 + 4, l1, 0);
                    world.setBlock(j1, k1 + 5, l1, 0);
                    world.setBlock(j1, k1 + 6, l1, 0);
                    world.setBlock(j1, k1 + 7, l1, 0);
                    world.setBlock(j1, k1 + 6, l1 + 1, 0);
                    world.setBlock(j1, k1 + 6, l1 - 1, 0);
                    world.setBlock(j1, k1 + 6, l1 + 2, 0);
                    world.setBlock(j1, k1 + 6, l1 - 2, 0);
                    world.setBlock(j1, k1 + 7, l1 + 1, 0);
                    world.setBlock(j1, k1 + 7, l1 - 1, 0);
                    world.setBlock(j1, k1 + 8, l1, 0);
                    world.setBlock(j1, k1 + 1, l1 + 1, 0);
                    world.setBlock(j1, k1 + 1, l1 + 2, 0);
                    world.setBlock(j1, k1 + 1, l1 + 3, 0);
                    world.setBlock(j1, k1 + 1, l1 + 4, 0);
                    world.setBlock(j1, k1 + 1, l1 + 5, 0);
                    world.setBlock(j1, k1 + 1, l1 + 6, 0);
                    world.setBlock(j1, k1 + 1, l1 + 7, 0);
                    world.setBlock(j1, k1 + 1, l1 + 8, 0);
                    world.setBlock(j1, k1 + 1, l1 - 1, 0);
                    world.setBlock(j1, k1 + 1, l1 - 2, 0);
                    world.setBlock(j1, k1 + 1, l1 - 3, 0);
                    world.setBlock(j1, k1 + 1, l1 - 4, 0);
                    world.setBlock(j1, k1 + 1, l1 - 5, 0);
                    world.setBlock(j1, k1 + 1, l1 - 6, 0);
                    world.setBlock(j1, k1 + 1, l1 - 7, 0);
                    world.setBlock(j1, k1 + 1, l1 - 8, 0);
                    world.setBlock(j1, k1 + 2, l1 + 1, 0);
                    world.setBlock(j1, k1 + 2, l1 + 2, 0);
                    world.setBlock(j1, k1 + 2, l1 + 3, 0);
                    world.setBlock(j1, k1 + 2, l1 + 4, 0);
                    world.setBlock(j1, k1 + 2, l1 + 5, 0);
                    world.setBlock(j1, k1 + 2, l1 + 6, 0);
                    world.setBlock(j1, k1 + 2, l1 + 7, 0);
                    world.setBlock(j1, k1 + 2, l1 + 8, 0);
                    world.setBlock(j1, k1 + 2, l1 - 1, 0);
                    world.setBlock(j1, k1 + 2, l1 - 2, 0);
                    world.setBlock(j1, k1 + 2, l1 - 3, 0);
                    world.setBlock(j1, k1 + 2, l1 - 4, 0);
                    world.setBlock(j1, k1 + 2, l1 - 5, 0);
                    world.setBlock(j1, k1 + 2, l1 - 6, 0);
                    world.setBlock(j1, k1 + 2, l1 - 7, 0);
                    world.setBlock(j1, k1 + 2, l1 - 8, 0);
                    world.setBlock(j1, k1 + 3, l1 + 1, 0);
                    world.setBlock(j1, k1 + 3, l1 + 2, 0);
                    world.setBlock(j1, k1 + 3, l1 + 3, 0);
                    world.setBlock(j1, k1 + 3, l1 + 4, 0);
                    world.setBlock(j1, k1 + 3, l1 + 5, 0);
                    world.setBlock(j1, k1 + 3, l1 + 6, 0);
                    world.setBlock(j1, k1 + 3, l1 + 7, 0);
                    world.setBlock(j1, k1 + 3, l1 + 8, 0);
                    world.setBlock(j1, k1 + 3, l1 - 1, 0);
                    world.setBlock(j1, k1 + 3, l1 - 2, 0);
                    world.setBlock(j1, k1 + 3, l1 - 3, 0);
                    world.setBlock(j1, k1 + 3, l1 - 4, 0);
                    world.setBlock(j1, k1 + 3, l1 - 5, 0);
                    world.setBlock(j1, k1 + 3, l1 - 6, 0);
                    world.setBlock(j1, k1 + 3, l1 - 7, 0);
                    world.setBlock(j1, k1 + 3, l1 - 8, 0);
                    world.setBlock(j1, k1 + 4, l1 + 1, 0);
                    world.setBlock(j1, k1 + 4, l1 + 2, 0);
                    world.setBlock(j1, k1 + 4, l1 + 3, 0);
                    world.setBlock(j1, k1 + 4, l1 + 4, 0);
                    world.setBlock(j1, k1 + 4, l1 + 5, 0);
                    world.setBlock(j1, k1 + 4, l1 + 6, 0);
                    world.setBlock(j1, k1 + 4, l1 + 7, 0);
                    world.setBlock(j1, k1 + 4, l1 + 8, 0);
                    world.setBlock(j1, k1 + 4, l1 - 1, 0);
                    world.setBlock(j1, k1 + 4, l1 - 2, 0);
                    world.setBlock(j1, k1 + 4, l1 - 3, 0);
                    world.setBlock(j1, k1 + 4, l1 - 4, 0);
                    world.setBlock(j1, k1 + 4, l1 - 5, 0);
                    world.setBlock(j1, k1 + 4, l1 - 6, 0);
                    world.setBlock(j1, k1 + 4, l1 - 7, 0);
                    world.setBlock(j1, k1 + 4, l1 - 8, 0);
                    world.setBlock(j1, k1 + 5, l1 + 1, 0);
                    world.setBlock(j1, k1 + 5, l1 + 2, 0);
                    world.setBlock(j1, k1 + 5, l1 + 3, 0);
                    world.setBlock(j1, k1 + 5, l1 + 4, 0);
                    world.setBlock(j1, k1 + 5, l1 + 5, 0);
                    world.setBlock(j1, k1 + 5, l1 + 6, 0);
                    world.setBlock(j1, k1 + 5, l1 + 7, 0);
                    world.setBlock(j1, k1 + 5, l1 + 8, 0);
                    world.setBlock(j1, k1 + 5, l1 - 1, 0);
                    world.setBlock(j1, k1 + 5, l1 - 2, 0);
                    world.setBlock(j1, k1 + 5, l1 - 3, 0);
                    world.setBlock(j1, k1 + 5, l1 - 4, 0);
                    world.setBlock(j1, k1 + 5, l1 - 5, 0);
                    world.setBlock(j1, k1 + 5, l1 - 6, 0);
                    world.setBlock(j1, k1 + 5, l1 - 7, 0);
                    world.setBlock(j1, k1 + 5, l1 - 8, 0);
                    world.setBlock(j1, k1 + 2, l1 + 9, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 3, l1 + 9, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 9, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 2, l1 - 9, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 4, l1 - 9, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 1, l1 + 3, Block.stoneSingleSlab.blockID);
                    world.setBlock(j1, k1, l1, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 1, l1, Block.chest.blockID);
                    TileEntityChest tileentitychest = (TileEntityChest) world.getBlockTileEntity(j1, k1 + 1, l1);
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
                    
                    world.setBlock(j1, k1 + 2, l1, Block.obsidian.blockID);
                    world.setBlock(j1, k1, l1 + 1, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 1, l1 + 1, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 2, l1 + 1, Block.obsidian.blockID);
                    world.setBlock(j1, k1, l1 + 2, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 1, l1 + 2, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 2, l1 + 2, Block.obsidian.blockID);
                    world.setBlock(j1, k1, l1 - 1, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 1, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 2, l1 - 1, Block.obsidian.blockID);
                    world.setBlock(j1, k1, l1 - 2, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 2, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 2, l1 - 2, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 3, Block.stoneSingleSlab.blockID);
                    int k9 = random.nextInt(100);
                    if(k9 <= 75)
                    {
                        world.setBlock(j1, k1 + 1, l1, 0);
                        world.setBlock(j1, k1 + 2, l1, 0);
                        world.setBlock(j1, k1 + 1, l1 + 1, 0);
                        world.setBlock(j1, k1 + 2, l1 + 1, 0);
                        world.setBlock(j1, k1 + 1, l1 - 1, 0);
                        world.setBlock(j1, k1 + 1, l1, 0);
                        world.setBlock(j1 - 1, k1 + 1, l1, 0);
                        world.setBlock(j1 - 1, k1 + 2, l1, 0);
                        world.setBlock(j1 - 1, k1 + 2, l1 - 1, 0);
                        world.setBlock(j1 - 3, k1 + 1, l1 + 2, Block.obsidian.blockID);
                        world.setBlock(j1 - 2, k1 + 1, l1, Block.obsidian.blockID);
                        world.setBlock(j1 - 3, k1 + 1, l1 - 3, Block.obsidian.blockID);
                    }
                    j1++;
                    world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 1, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 2, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 3, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 4, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 5, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 6, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 7, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 8, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 2, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 3, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 4, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 5, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 6, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 7, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 8, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 1, l1, 0);
                    world.setBlock(j1, k1 + 2, l1, 0);
                    world.setBlock(j1, k1 + 3, l1, 0);
                    world.setBlock(j1, k1 + 4, l1, 0);
                    world.setBlock(j1, k1 + 5, l1, 0);
                    world.setBlock(j1, k1 + 6, l1, 0);
                    world.setBlock(j1, k1 + 7, l1, 0);
                    world.setBlock(j1, k1 + 6, l1 + 1, 0);
                    world.setBlock(j1, k1 + 6, l1 - 1, 0);
                    world.setBlock(j1, k1 + 6, l1 + 2, 0);
                    world.setBlock(j1, k1 + 6, l1 - 2, 0);
                    world.setBlock(j1, k1 + 7, l1 + 1, 0);
                    world.setBlock(j1, k1 + 7, l1 - 1, 0);
                    world.setBlock(j1, k1 + 8, l1, 0);
                    world.setBlock(j1, k1 + 1, l1 + 1, 0);
                    world.setBlock(j1, k1 + 1, l1 + 2, 0);
                    world.setBlock(j1, k1 + 1, l1 + 3, 0);
                    world.setBlock(j1, k1 + 1, l1 + 4, 0);
                    world.setBlock(j1, k1 + 1, l1 + 5, 0);
                    world.setBlock(j1, k1 + 1, l1 + 6, 0);
                    world.setBlock(j1, k1 + 1, l1 + 7, 0);
                    world.setBlock(j1, k1 + 1, l1 + 8, 0);
                    world.setBlock(j1, k1 + 1, l1 - 1, 0);
                    world.setBlock(j1, k1 + 1, l1 - 2, 0);
                    world.setBlock(j1, k1 + 1, l1 - 3, 0);
                    world.setBlock(j1, k1 + 1, l1 - 4, 0);
                    world.setBlock(j1, k1 + 1, l1 - 5, 0);
                    world.setBlock(j1, k1 + 1, l1 - 6, 0);
                    world.setBlock(j1, k1 + 1, l1 - 7, 0);
                    world.setBlock(j1, k1 + 1, l1 - 8, 0);
                    world.setBlock(j1, k1 + 2, l1 + 1, 0);
                    world.setBlock(j1, k1 + 2, l1 + 2, 0);
                    world.setBlock(j1, k1 + 2, l1 + 3, 0);
                    world.setBlock(j1, k1 + 2, l1 + 4, 0);
                    world.setBlock(j1, k1 + 2, l1 + 5, 0);
                    world.setBlock(j1, k1 + 2, l1 + 6, 0);
                    world.setBlock(j1, k1 + 2, l1 + 7, 0);
                    world.setBlock(j1, k1 + 2, l1 + 8, 0);
                    world.setBlock(j1, k1 + 2, l1 - 1, 0);
                    world.setBlock(j1, k1 + 2, l1 - 2, 0);
                    world.setBlock(j1, k1 + 2, l1 - 3, 0);
                    world.setBlock(j1, k1 + 2, l1 - 4, 0);
                    world.setBlock(j1, k1 + 2, l1 - 5, 0);
                    world.setBlock(j1, k1 + 2, l1 - 6, 0);
                    world.setBlock(j1, k1 + 2, l1 - 7, 0);
                    world.setBlock(j1, k1 + 2, l1 - 8, 0);
                    world.setBlock(j1, k1 + 3, l1 + 1, 0);
                    world.setBlock(j1, k1 + 3, l1 + 2, 0);
                    world.setBlock(j1, k1 + 3, l1 + 3, 0);
                    world.setBlock(j1, k1 + 3, l1 + 4, 0);
                    world.setBlock(j1, k1 + 3, l1 + 5, 0);
                    world.setBlock(j1, k1 + 3, l1 + 6, 0);
                    world.setBlock(j1, k1 + 3, l1 + 7, 0);
                    world.setBlock(j1, k1 + 3, l1 + 8, 0);
                    world.setBlock(j1, k1 + 3, l1 - 1, 0);
                    world.setBlock(j1, k1 + 3, l1 - 2, 0);
                    world.setBlock(j1, k1 + 3, l1 - 3, 0);
                    world.setBlock(j1, k1 + 3, l1 - 4, 0);
                    world.setBlock(j1, k1 + 3, l1 - 5, 0);
                    world.setBlock(j1, k1 + 3, l1 - 6, 0);
                    world.setBlock(j1, k1 + 3, l1 - 7, 0);
                    world.setBlock(j1, k1 + 3, l1 - 8, 0);
                    world.setBlock(j1, k1 + 4, l1 + 1, 0);
                    world.setBlock(j1, k1 + 4, l1 + 2, 0);
                    world.setBlock(j1, k1 + 4, l1 + 3, 0);
                    world.setBlock(j1, k1 + 4, l1 + 4, 0);
                    world.setBlock(j1, k1 + 4, l1 + 5, 0);
                    world.setBlock(j1, k1 + 4, l1 + 6, 0);
                    world.setBlock(j1, k1 + 4, l1 + 7, 0);
                    world.setBlock(j1, k1 + 4, l1 + 8, 0);
                    world.setBlock(j1, k1 + 4, l1 - 1, 0);
                    world.setBlock(j1, k1 + 4, l1 - 2, 0);
                    world.setBlock(j1, k1 + 4, l1 - 3, 0);
                    world.setBlock(j1, k1 + 4, l1 - 4, 0);
                    world.setBlock(j1, k1 + 4, l1 - 5, 0);
                    world.setBlock(j1, k1 + 4, l1 - 6, 0);
                    world.setBlock(j1, k1 + 4, l1 - 7, 0);
                    world.setBlock(j1, k1 + 4, l1 - 8, 0);
                    world.setBlock(j1, k1 + 5, l1 + 1, 0);
                    world.setBlock(j1, k1 + 5, l1 + 2, 0);
                    world.setBlock(j1, k1 + 5, l1 + 3, 0);
                    world.setBlock(j1, k1 + 5, l1 + 4, 0);
                    world.setBlock(j1, k1 + 5, l1 + 5, 0);
                    world.setBlock(j1, k1 + 5, l1 + 6, 0);
                    world.setBlock(j1, k1 + 5, l1 + 7, 0);
                    world.setBlock(j1, k1 + 5, l1 + 8, 0);
                    world.setBlock(j1, k1 + 5, l1 - 1, 0);
                    world.setBlock(j1, k1 + 5, l1 - 2, 0);
                    world.setBlock(j1, k1 + 5, l1 - 3, 0);
                    world.setBlock(j1, k1 + 5, l1 - 4, 0);
                    world.setBlock(j1, k1 + 5, l1 - 5, 0);
                    world.setBlock(j1, k1 + 5, l1 - 6, 0);
                    world.setBlock(j1, k1 + 5, l1 - 7, 0);
                    world.setBlock(j1, k1 + 5, l1 - 8, 0);
                    world.setBlock(j1, k1 + 1, l1 + 9, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 9, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 2, l1 - 9, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 1, l1 + 3, Block.stoneSingleSlab.blockID);
                    world.setBlock(j1, k1, l1, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 1, l1, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 2, l1, Block.obsidian.blockID);
                    world.setBlock(j1, k1, l1 + 1, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 1, l1 + 1, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 2, l1 + 1, Block.obsidian.blockID);
                    world.setBlock(j1, k1, l1 + 2, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 1, l1 + 2, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 2, l1 + 2, Block.obsidian.blockID);
                    world.setBlock(j1, k1, l1 - 1, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 1, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 2, l1 - 1, Block.obsidian.blockID);
                    world.setBlock(j1, k1, l1 - 2, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 2, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 2, l1 - 2, Block.obsidian.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 3, Block.stoneSingleSlab.blockID);
                    world.setBlock(j1, k1 + 1, l1 + 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 2, l1 + 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 3, l1 + 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 4, l1 + 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 5, l1 + 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 1, l1 - 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 2, l1 - 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 3, l1 - 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 4, l1 - 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 5, l1 - 6, Block.blockNetherQuartz.blockID, 2, 2);
                    int k10 = random.nextInt(100);
                    if(k10 <= 50)
                    {
                        world.setBlock(j1, k1 + 1, l1 + 7, Block.blockNetherQuartz.blockID, 2, 2);
                        world.setBlock(j1 - 2, k1 + 1, l1 + 8, Block.blockNetherQuartz.blockID, 2, 2);
                        world.setBlock(j1 - 1, k1 + 1, l1 + 5, Block.blockNetherQuartz.blockID, 2, 2);
                        world.setBlock(j1, k1 + 2, l1 + 6, 0);
                        world.setBlock(j1, k1 + 3, l1 + 6, 0);
                        world.setBlock(j1, k1 + 4, l1 + 6, 0);
                    }
                    int k11 = random.nextInt(100);
                    if(k11 <= 30)
                    {
                        world.setBlock(j1 + 1, k1 + 5, l1 + 3, Block.vine.blockID);
                        world.setBlock(j1 - 1, k1 + 5, l1 + 3, Block.vine.blockID);
                        world.setBlock(j1 - 1, k1 + 6, l1 + 2, Block.vine.blockID);
                        world.setBlock(j1 - 1, k1 + 5, l1 + 2, Block.vine.blockID);
                        world.setBlock(j1 - 2, k1 + 7, l1 - 1, Block.vine.blockID);
                        world.setBlock(j1 - 2, k1 + 7, l1 + 1, Block.vine.blockID);
                        world.setBlock(j1 - 2, k1 + 6, l1 + 1, Block.vine.blockID);
                        world.setBlock(j1 - 3, k1 + 8, l1, Block.vine.blockID);
                        world.setBlock(j1 + 1, k1 + 5, l1 - 3, Block.vine.blockID);
                    }
                    j1++;
                    world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 1, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 2, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 3, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 4, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 5, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 6, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 7, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 8, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 1, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 2, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 3, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 4, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 5, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 6, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 7, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 8, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 1, l1, 0);
                    world.setBlock(j1, k1 + 2, l1, 0);
                    world.setBlock(j1, k1 + 3, l1, 0);
                    world.setBlock(j1, k1 + 4, l1, 0);
                    world.setBlock(j1, k1 + 5, l1, 0);
                    world.setBlock(j1, k1 + 6, l1, 0);
                    world.setBlock(j1, k1 + 7, l1, 0);
                    world.setBlock(j1, k1 + 6, l1 + 1, 0);
                    world.setBlock(j1, k1 + 6, l1 - 1, 0);
                    world.setBlock(j1, k1 + 6, l1 + 2, 0);
                    world.setBlock(j1, k1 + 6, l1 - 2, 0);
                    world.setBlock(j1, k1 + 7, l1 + 1, 0);
                    world.setBlock(j1, k1 + 7, l1 - 1, 0);
                    world.setBlock(j1, k1 + 8, l1, 0);
                    world.setBlock(j1, k1 + 1, l1 + 1, 0);
                    world.setBlock(j1, k1 + 1, l1 + 2, 0);
                    world.setBlock(j1, k1 + 1, l1 + 3, 0);
                    world.setBlock(j1, k1 + 1, l1 + 4, 0);
                    world.setBlock(j1, k1 + 1, l1 + 5, 0);
                    world.setBlock(j1, k1 + 1, l1 + 6, 0);
                    world.setBlock(j1, k1 + 1, l1 + 7, 0);
                    world.setBlock(j1, k1 + 1, l1 + 8, 0);
                    world.setBlock(j1, k1 + 1, l1 - 1, 0);
                    world.setBlock(j1, k1 + 1, l1 - 2, 0);
                    world.setBlock(j1, k1 + 1, l1 - 3, 0);
                    world.setBlock(j1, k1 + 1, l1 - 4, 0);
                    world.setBlock(j1, k1 + 1, l1 - 5, 0);
                    world.setBlock(j1, k1 + 1, l1 - 6, 0);
                    world.setBlock(j1, k1 + 1, l1 - 7, 0);
                    world.setBlock(j1, k1 + 1, l1 - 8, 0);
                    world.setBlock(j1, k1 + 2, l1 + 1, 0);
                    world.setBlock(j1, k1 + 2, l1 + 2, 0);
                    world.setBlock(j1, k1 + 2, l1 + 3, 0);
                    world.setBlock(j1, k1 + 2, l1 + 4, 0);
                    world.setBlock(j1, k1 + 2, l1 + 5, 0);
                    world.setBlock(j1, k1 + 2, l1 + 6, 0);
                    world.setBlock(j1, k1 + 2, l1 + 7, 0);
                    world.setBlock(j1, k1 + 2, l1 + 8, 0);
                    world.setBlock(j1, k1 + 2, l1 - 1, 0);
                    world.setBlock(j1, k1 + 2, l1 - 2, 0);
                    world.setBlock(j1, k1 + 2, l1 - 3, 0);
                    world.setBlock(j1, k1 + 2, l1 - 4, 0);
                    world.setBlock(j1, k1 + 2, l1 - 5, 0);
                    world.setBlock(j1, k1 + 2, l1 - 6, 0);
                    world.setBlock(j1, k1 + 2, l1 - 7, 0);
                    world.setBlock(j1, k1 + 2, l1 - 8, 0);
                    world.setBlock(j1, k1 + 3, l1 + 1, 0);
                    world.setBlock(j1, k1 + 3, l1 + 2, 0);
                    world.setBlock(j1, k1 + 3, l1 + 3, 0);
                    world.setBlock(j1, k1 + 3, l1 + 4, 0);
                    world.setBlock(j1, k1 + 3, l1 + 5, 0);
                    world.setBlock(j1, k1 + 3, l1 + 6, 0);
                    world.setBlock(j1, k1 + 3, l1 + 7, 0);
                    world.setBlock(j1, k1 + 3, l1 + 8, 0);
                    world.setBlock(j1, k1 + 3, l1 - 1, 0);
                    world.setBlock(j1, k1 + 3, l1 - 2, 0);
                    world.setBlock(j1, k1 + 3, l1 - 3, 0);
                    world.setBlock(j1, k1 + 3, l1 - 4, 0);
                    world.setBlock(j1, k1 + 3, l1 - 5, 0);
                    world.setBlock(j1, k1 + 3, l1 - 6, 0);
                    world.setBlock(j1, k1 + 3, l1 - 7, 0);
                    world.setBlock(j1, k1 + 3, l1 - 8, 0);
                    world.setBlock(j1, k1 + 4, l1 + 1, 0);
                    world.setBlock(j1, k1 + 4, l1 + 2, 0);
                    world.setBlock(j1, k1 + 4, l1 + 3, 0);
                    world.setBlock(j1, k1 + 4, l1 + 4, 0);
                    world.setBlock(j1, k1 + 4, l1 + 5, 0);
                    world.setBlock(j1, k1 + 4, l1 + 6, 0);
                    world.setBlock(j1, k1 + 4, l1 + 7, 0);
                    world.setBlock(j1, k1 + 4, l1 + 8, 0);
                    world.setBlock(j1, k1 + 4, l1 - 1, 0);
                    world.setBlock(j1, k1 + 4, l1 - 2, 0);
                    world.setBlock(j1, k1 + 4, l1 - 3, 0);
                    world.setBlock(j1, k1 + 4, l1 - 4, 0);
                    world.setBlock(j1, k1 + 4, l1 - 5, 0);
                    world.setBlock(j1, k1 + 4, l1 - 6, 0);
                    world.setBlock(j1, k1 + 4, l1 - 7, 0);
                    world.setBlock(j1, k1 + 4, l1 - 8, 0);
                    world.setBlock(j1, k1 + 5, l1 + 1, 0);
                    world.setBlock(j1, k1 + 5, l1 + 2, 0);
                    world.setBlock(j1, k1 + 5, l1 + 3, 0);
                    world.setBlock(j1, k1 + 5, l1 + 4, 0);
                    world.setBlock(j1, k1 + 5, l1 + 5, 0);
                    world.setBlock(j1, k1 + 5, l1 + 6, 0);
                    world.setBlock(j1, k1 + 5, l1 + 7, 0);
                    world.setBlock(j1, k1 + 5, l1 + 8, 0);
                    world.setBlock(j1, k1 + 5, l1 - 1, 0);
                    world.setBlock(j1, k1 + 5, l1 - 2, 0);
                    world.setBlock(j1, k1 + 5, l1 - 3, 0);
                    world.setBlock(j1, k1 + 5, l1 - 4, 0);
                    world.setBlock(j1, k1 + 5, l1 - 5, 0);
                    world.setBlock(j1, k1 + 5, l1 - 6, 0);
                    world.setBlock(j1, k1 + 5, l1 - 7, 0);
                    world.setBlock(j1, k1 + 5, l1 - 8, 0);
                    world.setBlock(j1, k1 + 1, l1 + 9, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 2, l1 + 9, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 4, l1 + 9, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 9, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 2, l1 - 9, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 3, l1 - 9, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 1, l1, Block.stoneSingleSlab.blockID);
                    world.setBlock(j1, k1 + 1, l1 + 1, Block.stoneSingleSlab.blockID);
                    world.setBlock(j1, k1 + 1, l1 + 2, Block.stoneSingleSlab.blockID);
                    world.setBlock(j1, k1 + 1, l1 + 3, Block.stoneSingleSlab.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 1, Block.stoneSingleSlab.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 2, Block.stoneSingleSlab.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 3, Block.stoneSingleSlab.blockID);
                    j1++;
                    world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 1, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 2, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 3, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 4, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 5, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 6, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 7, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 8, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 2, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 3, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 4, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 5, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 6, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 7, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 8, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 1, l1, 0);
                    world.setBlock(j1, k1 + 2, l1, 0);
                    world.setBlock(j1, k1 + 3, l1, 0);
                    world.setBlock(j1, k1 + 4, l1, 0);
                    world.setBlock(j1, k1 + 5, l1, 0);
                    world.setBlock(j1, k1 + 6, l1, 0);
                    world.setBlock(j1, k1 + 7, l1, 0);
                    world.setBlock(j1, k1 + 6, l1 + 1, 0);
                    world.setBlock(j1, k1 + 6, l1 - 1, 0);
                    world.setBlock(j1, k1 + 6, l1 + 2, 0);
                    world.setBlock(j1, k1 + 6, l1 - 2, 0);
                    world.setBlock(j1, k1 + 7, l1 + 1, 0);
                    world.setBlock(j1, k1 + 7, l1 - 1, 0);
                    world.setBlock(j1, k1 + 8, l1, 0);
                    world.setBlock(j1, k1 + 1, l1 + 1, 0);
                    world.setBlock(j1, k1 + 1, l1 + 2, 0);
                    world.setBlock(j1, k1 + 1, l1 + 3, 0);
                    world.setBlock(j1, k1 + 1, l1 + 4, 0);
                    world.setBlock(j1, k1 + 1, l1 + 5, 0);
                    world.setBlock(j1, k1 + 1, l1 + 6, 0);
                    world.setBlock(j1, k1 + 1, l1 + 7, 0);
                    world.setBlock(j1, k1 + 1, l1 + 8, 0);
                    world.setBlock(j1, k1 + 1, l1 - 1, 0);
                    world.setBlock(j1, k1 + 1, l1 - 2, 0);
                    world.setBlock(j1, k1 + 1, l1 - 3, 0);
                    world.setBlock(j1, k1 + 1, l1 - 4, 0);
                    world.setBlock(j1, k1 + 1, l1 - 5, 0);
                    world.setBlock(j1, k1 + 1, l1 - 6, 0);
                    world.setBlock(j1, k1 + 1, l1 - 7, 0);
                    world.setBlock(j1, k1 + 1, l1 - 8, 0);
                    world.setBlock(j1, k1 + 2, l1 + 1, 0);
                    world.setBlock(j1, k1 + 2, l1 + 2, 0);
                    world.setBlock(j1, k1 + 2, l1 + 3, 0);
                    world.setBlock(j1, k1 + 2, l1 + 4, 0);
                    world.setBlock(j1, k1 + 2, l1 + 5, 0);
                    world.setBlock(j1, k1 + 2, l1 + 6, 0);
                    world.setBlock(j1, k1 + 2, l1 + 7, 0);
                    world.setBlock(j1, k1 + 2, l1 + 8, 0);
                    world.setBlock(j1, k1 + 2, l1 - 1, 0);
                    world.setBlock(j1, k1 + 2, l1 - 2, 0);
                    world.setBlock(j1, k1 + 2, l1 - 3, 0);
                    world.setBlock(j1, k1 + 2, l1 - 4, 0);
                    world.setBlock(j1, k1 + 2, l1 - 5, 0);
                    world.setBlock(j1, k1 + 2, l1 - 6, 0);
                    world.setBlock(j1, k1 + 2, l1 - 7, 0);
                    world.setBlock(j1, k1 + 2, l1 - 8, 0);
                    world.setBlock(j1, k1 + 3, l1 + 1, 0);
                    world.setBlock(j1, k1 + 3, l1 + 2, 0);
                    world.setBlock(j1, k1 + 3, l1 + 3, 0);
                    world.setBlock(j1, k1 + 3, l1 + 4, 0);
                    world.setBlock(j1, k1 + 3, l1 + 5, 0);
                    world.setBlock(j1, k1 + 3, l1 + 6, 0);
                    world.setBlock(j1, k1 + 3, l1 + 7, 0);
                    world.setBlock(j1, k1 + 3, l1 + 8, 0);
                    world.setBlock(j1, k1 + 3, l1 - 1, 0);
                    world.setBlock(j1, k1 + 3, l1 - 2, 0);
                    world.setBlock(j1, k1 + 3, l1 - 3, 0);
                    world.setBlock(j1, k1 + 3, l1 - 4, 0);
                    world.setBlock(j1, k1 + 3, l1 - 5, 0);
                    world.setBlock(j1, k1 + 3, l1 - 6, 0);
                    world.setBlock(j1, k1 + 3, l1 - 7, 0);
                    world.setBlock(j1, k1 + 3, l1 - 8, 0);
                    world.setBlock(j1, k1 + 4, l1 + 1, 0);
                    world.setBlock(j1, k1 + 4, l1 + 2, 0);
                    world.setBlock(j1, k1 + 4, l1 + 3, 0);
                    world.setBlock(j1, k1 + 4, l1 + 4, 0);
                    world.setBlock(j1, k1 + 4, l1 + 5, 0);
                    world.setBlock(j1, k1 + 4, l1 + 6, 0);
                    world.setBlock(j1, k1 + 4, l1 + 7, 0);
                    world.setBlock(j1, k1 + 4, l1 + 8, 0);
                    world.setBlock(j1, k1 + 4, l1 - 1, 0);
                    world.setBlock(j1, k1 + 4, l1 - 2, 0);
                    world.setBlock(j1, k1 + 4, l1 - 3, 0);
                    world.setBlock(j1, k1 + 4, l1 - 4, 0);
                    world.setBlock(j1, k1 + 4, l1 - 5, 0);
                    world.setBlock(j1, k1 + 4, l1 - 6, 0);
                    world.setBlock(j1, k1 + 4, l1 - 7, 0);
                    world.setBlock(j1, k1 + 4, l1 - 8, 0);
                    world.setBlock(j1, k1 + 5, l1 + 1, 0);
                    world.setBlock(j1, k1 + 5, l1 + 2, 0);
                    world.setBlock(j1, k1 + 5, l1 + 3, 0);
                    world.setBlock(j1, k1 + 5, l1 + 4, 0);
                    world.setBlock(j1, k1 + 5, l1 + 5, 0);
                    world.setBlock(j1, k1 + 5, l1 + 6, 0);
                    world.setBlock(j1, k1 + 5, l1 + 7, 0);
                    world.setBlock(j1, k1 + 5, l1 + 8, 0);
                    world.setBlock(j1, k1 + 5, l1 - 1, 0);
                    world.setBlock(j1, k1 + 5, l1 - 2, 0);
                    world.setBlock(j1, k1 + 5, l1 - 3, 0);
                    world.setBlock(j1, k1 + 5, l1 - 4, 0);
                    world.setBlock(j1, k1 + 5, l1 - 5, 0);
                    world.setBlock(j1, k1 + 5, l1 - 6, 0);
                    world.setBlock(j1, k1 + 5, l1 - 7, 0);
                    world.setBlock(j1, k1 + 5, l1 - 8, 0);
                    world.setBlock(j1, k1 + 1, l1 + 9, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 3, l1 + 9, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 9, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 2, l1 - 9, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 1, l1 + 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 2, l1 + 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 3, l1 + 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 4, l1 + 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 5, l1 + 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 1, l1 - 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 2, l1 - 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 3, l1 - 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 4, l1 - 6, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 + 5, l1 - 6, Block.blockNetherQuartz.blockID, 2, 2);
                    int j12 = random.nextInt(100);
                    if(j12 <= 50)
                    {
                        world.setBlock(j1, k1 + 1, l1 - 7, Block.blockNetherQuartz.blockID, 2, 2);
                        world.setBlock(j1 - 1, k1 + 1, l1 - 8, Block.blockNetherQuartz.blockID, 2, 2);
                        world.setBlock(j1 - 3, k1 + 1, l1 - 5, Block.blockNetherQuartz.blockID, 2, 2);
                        world.setBlock(j1, k1 + 3, l1 - 6, 0);
                        world.setBlock(j1, k1 + 4, l1 - 6, 0);
                        world.setBlock(j1, k1 + 5, l1 - 6, 0);
                    }
                    j1++;
                    world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 1, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 2, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 3, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 4, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 5, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 6, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 + 7, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 + 8, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 1, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 2, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 3, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1, l1 - 4, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 5, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 6, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 7, Block.cobblestone.blockID);
                    world.setBlock(j1, k1, l1 - 8, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 1, l1, 0);
                    world.setBlock(j1, k1 + 2, l1, 0);
                    world.setBlock(j1, k1 + 3, l1, 0);
                    world.setBlock(j1, k1 + 4, l1, 0);
                    world.setBlock(j1, k1 + 5, l1, 0);
                    world.setBlock(j1, k1 + 6, l1, 0);
                    world.setBlock(j1, k1 + 7, l1, 0);
                    world.setBlock(j1, k1 + 6, l1 + 1, 0);
                    world.setBlock(j1, k1 + 6, l1 - 1, 0);
                    world.setBlock(j1, k1 + 6, l1 + 2, 0);
                    world.setBlock(j1, k1 + 6, l1 - 2, 0);
                    world.setBlock(j1, k1 + 7, l1 + 1, 0);
                    world.setBlock(j1, k1 + 7, l1 - 1, 0);
                    world.setBlock(j1, k1 + 8, l1, 0);
                    world.setBlock(j1, k1 + 1, l1 + 1, 0);
                    world.setBlock(j1, k1 + 1, l1 + 2, 0);
                    world.setBlock(j1, k1 + 1, l1 + 3, 0);
                    world.setBlock(j1, k1 + 1, l1 + 4, 0);
                    world.setBlock(j1, k1 + 1, l1 + 5, 0);
                    world.setBlock(j1, k1 + 1, l1 + 6, 0);
                    world.setBlock(j1, k1 + 1, l1 + 7, 0);
                    world.setBlock(j1, k1 + 1, l1 + 8, 0);
                    world.setBlock(j1, k1 + 1, l1 - 1, 0);
                    world.setBlock(j1, k1 + 1, l1 - 2, 0);
                    world.setBlock(j1, k1 + 1, l1 - 3, 0);
                    world.setBlock(j1, k1 + 1, l1 - 4, 0);
                    world.setBlock(j1, k1 + 1, l1 - 5, 0);
                    world.setBlock(j1, k1 + 1, l1 - 6, 0);
                    world.setBlock(j1, k1 + 1, l1 - 7, 0);
                    world.setBlock(j1, k1 + 1, l1 - 8, 0);
                    world.setBlock(j1, k1 + 2, l1 + 1, 0);
                    world.setBlock(j1, k1 + 2, l1 + 2, 0);
                    world.setBlock(j1, k1 + 2, l1 + 3, 0);
                    world.setBlock(j1, k1 + 2, l1 + 4, 0);
                    world.setBlock(j1, k1 + 2, l1 + 5, 0);
                    world.setBlock(j1, k1 + 2, l1 + 6, 0);
                    world.setBlock(j1, k1 + 2, l1 + 7, 0);
                    world.setBlock(j1, k1 + 2, l1 + 8, 0);
                    world.setBlock(j1, k1 + 2, l1 - 1, 0);
                    world.setBlock(j1, k1 + 2, l1 - 2, 0);
                    world.setBlock(j1, k1 + 2, l1 - 3, 0);
                    world.setBlock(j1, k1 + 2, l1 - 4, 0);
                    world.setBlock(j1, k1 + 2, l1 - 5, 0);
                    world.setBlock(j1, k1 + 2, l1 - 6, 0);
                    world.setBlock(j1, k1 + 2, l1 - 7, 0);
                    world.setBlock(j1, k1 + 2, l1 - 8, 0);
                    world.setBlock(j1, k1 + 3, l1 + 1, 0);
                    world.setBlock(j1, k1 + 3, l1 + 2, 0);
                    world.setBlock(j1, k1 + 3, l1 + 3, 0);
                    world.setBlock(j1, k1 + 3, l1 + 4, 0);
                    world.setBlock(j1, k1 + 3, l1 + 5, 0);
                    world.setBlock(j1, k1 + 3, l1 + 6, 0);
                    world.setBlock(j1, k1 + 3, l1 + 7, 0);
                    world.setBlock(j1, k1 + 3, l1 + 8, 0);
                    world.setBlock(j1, k1 + 3, l1 - 1, 0);
                    world.setBlock(j1, k1 + 3, l1 - 2, 0);
                    world.setBlock(j1, k1 + 3, l1 - 3, 0);
                    world.setBlock(j1, k1 + 3, l1 - 4, 0);
                    world.setBlock(j1, k1 + 3, l1 - 5, 0);
                    world.setBlock(j1, k1 + 3, l1 - 6, 0);
                    world.setBlock(j1, k1 + 3, l1 - 7, 0);
                    world.setBlock(j1, k1 + 3, l1 - 8, 0);
                    world.setBlock(j1, k1 + 4, l1 + 1, 0);
                    world.setBlock(j1, k1 + 4, l1 + 2, 0);
                    world.setBlock(j1, k1 + 4, l1 + 3, 0);
                    world.setBlock(j1, k1 + 4, l1 + 4, 0);
                    world.setBlock(j1, k1 + 4, l1 + 5, 0);
                    world.setBlock(j1, k1 + 4, l1 + 6, 0);
                    world.setBlock(j1, k1 + 4, l1 + 7, 0);
                    world.setBlock(j1, k1 + 4, l1 + 8, 0);
                    world.setBlock(j1, k1 + 4, l1 - 1, 0);
                    world.setBlock(j1, k1 + 4, l1 - 2, 0);
                    world.setBlock(j1, k1 + 4, l1 - 3, 0);
                    world.setBlock(j1, k1 + 4, l1 - 4, 0);
                    world.setBlock(j1, k1 + 4, l1 - 5, 0);
                    world.setBlock(j1, k1 + 4, l1 - 6, 0);
                    world.setBlock(j1, k1 + 4, l1 - 7, 0);
                    world.setBlock(j1, k1 + 4, l1 - 8, 0);
                    world.setBlock(j1, k1 + 5, l1 + 1, 0);
                    world.setBlock(j1, k1 + 5, l1 + 2, 0);
                    world.setBlock(j1, k1 + 5, l1 + 3, 0);
                    world.setBlock(j1, k1 + 5, l1 + 4, 0);
                    world.setBlock(j1, k1 + 5, l1 + 5, 0);
                    world.setBlock(j1, k1 + 5, l1 + 6, 0);
                    world.setBlock(j1, k1 + 5, l1 + 7, 0);
                    world.setBlock(j1, k1 + 5, l1 + 8, 0);
                    world.setBlock(j1, k1 + 5, l1 - 1, 0);
                    world.setBlock(j1, k1 + 5, l1 - 2, 0);
                    world.setBlock(j1, k1 + 5, l1 - 3, 0);
                    world.setBlock(j1, k1 + 5, l1 - 4, 0);
                    world.setBlock(j1, k1 + 5, l1 - 5, 0);
                    world.setBlock(j1, k1 + 5, l1 - 6, 0);
                    world.setBlock(j1, k1 + 5, l1 - 7, 0);
                    world.setBlock(j1, k1 + 5, l1 - 8, 0);
                    world.setBlock(j1, k1 + 1, l1 + 9, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 2, l1 + 9, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 1, l1 - 9, Block.cobblestone.blockID);
                    world.setBlock(j1, k1 + 2, l1 - 9, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 + 3, l1 - 9, Block.cobblestone.blockID);
                }
                j1++;
                world.setBlock(j1, k1 + 1, l1, 0);
                world.setBlock(j1, k1 + 2, l1, 0);
                world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 + 1, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 + 1, l1 + 2, Block.cobblestone.blockID);
                world.setBlock(j1, k1 + 1, l1 + 3, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 + 2, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 + 2, l1 + 2, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 + 3, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 + 3, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 + 1, l1 - 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 + 2, l1 - 1, Block.cobblestoneMossy.blockID);
                j1++;
                world.setBlock(j1, k1 + 1, l1, 0);
                world.setBlock(j1, k1 + 2, l1, 0);
                world.setBlock(j1, k1 + 3, l1, 0);
                world.setBlock(j1, k1 + 1, l1 + 1, 0);
                world.setBlock(j1, k1 + 2, l1 + 1, 0);
                world.setBlock(j1, k1 + 3, l1 + 1, 0);
                world.setBlock(j1, k1 + 1, l1 - 1, 0);
                world.setBlock(j1, k1 + 2, l1 - 1, 0);
                world.setBlock(j1, k1 + 3, l1 - 1, 0);
                world.setBlock(j1, k1, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1, l1 - 1, Block.cobblestone.blockID);
                j1++;
                world.setBlock(j1, k1 + 1, l1, 0);
                world.setBlock(j1, k1 + 2, l1, 0);
                world.setBlock(j1, k1 + 3, l1, 0);
                world.setBlock(j1, k1 + 1, l1 + 1, 0);
                world.setBlock(j1, k1 + 2, l1 + 1, 0);
                world.setBlock(j1, k1 + 3, l1 + 1, 0);
                world.setBlock(j1, k1 + 1, l1 - 1, 0);
                world.setBlock(j1, k1 + 2, l1 - 1, 0);
                world.setBlock(j1, k1 + 3, l1 - 1, 0);
                world.setBlock(j1, k1, l1, Block.cobblestone.blockID);
                world.setBlock(j1, k1, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1, l1 - 1, Block.cobblestoneMossy.blockID);
                j1++;
                world.setBlock(j1, k1, l1, 0);
                world.setBlock(j1, k1 + 1, l1, 0);
                world.setBlock(j1, k1 + 2, l1, 0);
                world.setBlock(j1, k1 + 3, l1, 0);
                j1++;
                world.setBlock(j1, k1 - 1, l1, 0);
                world.setBlock(j1, k1, l1, 0);
                world.setBlock(j1, k1 + 1, l1, 0);
                world.setBlock(j1, k1 + 2, l1, 0);
                j1++;
                world.setBlock(j1, k1 - 2, l1, 0);
                world.setBlock(j1, k1 - 1, l1, 0);
                world.setBlock(j1, k1, l1, 0);
                world.setBlock(j1, k1 + 1, l1, 0);
                j1++;
                world.setBlock(j1, k1 - 3, l1, 0);
                world.setBlock(j1, k1 - 2, l1, 0);
                world.setBlock(j1, k1 - 1, l1, 0);
                world.setBlock(j1, k1, l1, 0);
                j1++;
                world.setBlock(j1, k1 - 4, l1, 0);
                world.setBlock(j1, k1 - 3, l1, 0);
                world.setBlock(j1, k1 - 2, l1, 0);
                world.setBlock(j1, k1 - 1, l1, 0);
                j1++;
                world.setBlock(j1, k1 - 5, l1, 0);
                world.setBlock(j1, k1 - 4, l1, 0);
                world.setBlock(j1, k1 - 3, l1, 0);
                world.setBlock(j1, k1 - 2, l1, 0);
                j1++;
                world.setBlock(j1, k1 - 5, l1, 0);
                world.setBlock(j1, k1 - 4, l1, 0);
                j1++;
                world.setBlock(j1, k1 - 5, l1, 0);
                world.setBlock(j1, k1 - 4, l1, 0);
                j1++;
                world.setBlock(j1, k1 - 5, l1, 0);
                world.setBlock(j1, k1 - 4, l1, 0);
                j1++;
                world.setBlock(j1, k1 - 5, l1, 0);
                world.setBlock(j1, k1 - 4, l1, 0);
                j1++;
                world.setBlock(j1, k1 - 5, l1, 0);
                world.setBlock(j1, k1 - 4, l1, 0);
                j1++;
                world.setBlock(j1, k1 - 5, l1, 0);
                world.setBlock(j1, k1 - 4, l1, 0);
                j1++;
                world.setBlock(j1, k1 - 5, l1, 0);
                world.setBlock(j1, k1 - 4, l1, 0);
                j1++;
                world.setBlock(j1, k1 - 5, l1, 0);
                world.setBlock(j1, k1 - 4, l1, 0);
                world.setBlock(j1, k1 - 5, l1 + 1, 0);
                world.setBlock(j1, k1 - 4, l1 + 1, 0);
                world.setBlock(j1, k1 - 5, l1 + 2, 0);
                world.setBlock(j1, k1 - 4, l1 + 2, 0);
                world.setBlock(j1, k1 - 5, l1 + 3, 0);
                world.setBlock(j1, k1 - 4, l1 + 3, 0);
                world.setBlock(j1, k1 - 5, l1 + 4, 0);
                world.setBlock(j1, k1 - 4, l1 + 4, 0);
                world.setBlock(j1, k1 - 5, l1 + 5, 0);
                world.setBlock(j1, k1 - 4, l1 + 5, 0);
                world.setBlock(j1, k1 - 5, l1 + 6, 0);
                world.setBlock(j1, k1 - 4, l1 + 6, 0);
                world.setBlock(j1, k1 - 5, l1 + 7, 0);
                world.setBlock(j1, k1 - 4, l1 + 7, 0);
                world.setBlock(j1, k1 - 5, l1 + 8, 0);
                world.setBlock(j1, k1 - 4, l1 + 8, 0);
                world.setBlock(j1, k1 - 5, l1 + 9, 0);
                world.setBlock(j1, k1 - 4, l1 + 9, 0);
                world.setBlock(j1, k1 - 5, l1 + 10, 0);
                world.setBlock(j1, k1 - 4, l1 + 10, 0);
                world.setBlock(j1, k1 - 5, l1 + 11, 0);
                world.setBlock(j1, k1 - 4, l1 + 11, 0);
                world.setBlock(j1, k1 - 5, l1 + 12, 0);
                world.setBlock(j1, k1 - 4, l1 + 12, 0);
                world.setBlock(j1, k1 - 5, l1 + 13, 0);
                world.setBlock(j1, k1 - 4, l1 + 13, 0);
                world.setBlock(j1, k1 - 5, l1 + 14, 0);
                world.setBlock(j1, k1 - 4, l1 + 14, 0);
                world.setBlock(j1, k1 - 5, l1 + 15, 0);
                world.setBlock(j1, k1 - 4, l1 + 15, 0);
                world.setBlock(j1, k1 - 5, l1 + 16, 0);
                world.setBlock(j1, k1 - 4, l1 + 16, 0);
                world.setBlock(j1, k1 - 5, l1 + 17, 0);
                world.setBlock(j1, k1 - 4, l1 + 17, 0);
                world.setBlock(j1, k1 - 5, l1 + 18, 0);
                world.setBlock(j1, k1 - 4, l1 + 18, 0);
                world.setBlock(j1, k1 - 5, l1 + 19, 0);
                world.setBlock(j1, k1 - 4, l1 + 19, 0);
                world.setBlock(j1, k1 - 5, l1 + 20, 0);
                world.setBlock(j1, k1 - 4, l1 + 20, 0);
                world.setBlock(j1, k1 - 4, l1 + 21, 0);
                world.setBlock(j1, k1 - 5, l1 + 21, 0);
                world.setBlock(j1, k1 - 6, l1 + 21, 0);
                world.setBlock(j1, k1 - 4, l1 + 22, 0);
                world.setBlock(j1, k1 - 5, l1 + 22, 0);
                world.setBlock(j1, k1 - 6, l1 + 22, 0);
                world.setBlock(j1, k1 - 7, l1 + 22, 0);
                world.setBlock(j1, k1 - 5, l1 + 23, 0);
                world.setBlock(j1, k1 - 6, l1 + 23, 0);
                world.setBlock(j1, k1 - 7, l1 + 23, 0);
                world.setBlock(j1, k1 - 8, l1 + 23, 0);
                world.setBlock(j1, k1 - 6, l1 + 24, 0);
                world.setBlock(j1, k1 - 7, l1 + 24, 0);
                world.setBlock(j1, k1 - 8, l1 + 24, 0);
                world.setBlock(j1, k1 - 9, l1 + 24, 0);
                world.setBlock(j1, k1 - 7, l1 + 25, 0);
                world.setBlock(j1, k1 - 8, l1 + 25, 0);
                world.setBlock(j1, k1 - 9, l1 + 25, 0);
                world.setBlock(j1, k1 - 10, l1 + 25, 0);
                world.setBlock(j1, k1 - 8, l1 + 26, 0);
                world.setBlock(j1, k1 - 9, l1 + 26, 0);
                world.setBlock(j1, k1 - 10, l1 + 26, 0);
                world.setBlock(j1, k1 - 11, l1 + 26, 0);
                world.setBlock(j1, k1 - 9, l1 + 27, 0);
                world.setBlock(j1, k1 - 10, l1 + 27, 0);
                world.setBlock(j1, k1 - 11, l1 + 27, 0);
                world.setBlock(j1, k1 - 12, l1 + 27, 0);
                world.setBlock(j1, k1 - 10, l1 + 28, 0);
                world.setBlock(j1, k1 - 11, l1 + 28, 0);
                world.setBlock(j1, k1 - 12, l1 + 28, 0);
                world.setBlock(j1, k1 - 13, l1 + 28, 0);
                world.setBlock(j1, k1 - 11, l1 + 29, 0);
                world.setBlock(j1, k1 - 12, l1 + 29, 0);
                world.setBlock(j1, k1 - 13, l1 + 29, 0);
                world.setBlock(j1, k1 - 14, l1 + 29, 0);
                int j4 = random.nextInt(100);
                if(j4 <= 20)
                {
                    world.setBlock(j1, k1 - 12, l1 + 31, 0);
                    world.setBlock(j1, k1 - 13, l1 + 31, 0);
                    world.setBlock(j1, k1 - 12, l1 + 32, 0);
                    world.setBlock(j1, k1 - 13, l1 + 32, 0);
                    world.setBlock(j1, k1 - 12, l1 + 33, 0);
                    world.setBlock(j1, k1 - 13, l1 + 33, 0);
                    world.setBlock(j1 + 1, k1 - 12, l1 + 31, 0);
                    world.setBlock(j1 + 1, k1 - 13, l1 + 31, 0);
                    world.setBlock(j1 + 1, k1 - 12, l1 + 32, 0);
                    world.setBlock(j1 + 1, k1 - 13, l1 + 32, 0);
                    world.setBlock(j1 + 1, k1 - 12, l1 + 33, 0);
                    world.setBlock(j1 + 1, k1 - 13, l1 + 33, 0);
                    world.setBlock(j1 - 1, k1 - 12, l1 + 31, 0);
                    world.setBlock(j1 - 1, k1 - 13, l1 + 31, 0);
                    world.setBlock(j1 - 1, k1 - 12, l1 + 32, 0);
                    world.setBlock(j1 - 1, k1 - 13, l1 + 32, 0);
                    world.setBlock(j1 - 1, k1 - 12, l1 + 33, 0);
                    world.setBlock(j1 - 1, k1 - 13, l1 + 33, 0);
                    world.setBlock(j1, k1 - 10, l1 + 31, Block.blockLapis.blockID);
                    world.setBlock(j1, k1 - 10, l1 + 32, Block.cobblestoneMossy.blockID);
                    world.setBlock(j1, k1 - 10, l1 + 33, Block.blockLapis.blockID);
                    world.setBlock(j1 + 1, k1 - 10, l1 + 31, Block.blockLapis.blockID);
                    world.setBlock(j1 + 1, k1 - 10, l1 + 32, Block.blockLapis.blockID);
                    world.setBlock(j1 + 1, k1 - 10, l1 + 33, Block.blockLapis.blockID);
                    world.setBlock(j1 - 1, k1 - 10, l1 + 31, Block.blockLapis.blockID);
                    world.setBlock(j1 - 1, k1 - 10, l1 + 32, Block.blockLapis.blockID);
                    world.setBlock(j1 - 1, k1 - 10, l1 + 33, Block.blockLapis.blockID);
                    world.setBlock(j1, k1 - 11, l1 + 32, Block.chest.blockID);
                    TileEntityChest chest = (TileEntityChest) world.getBlockTileEntity(j1, k1 - 11, l1 + 32);
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
                }
                j1++;
                world.setBlock(j1, k1 - 4, l1, 0);
                world.setBlock(j1, k1 - 5, l1, 0);
                world.setBlock(j1, k1 - 6, l1, 0);
                j1++;
                world.setBlock(j1, k1 - 4, l1, 0);
                world.setBlock(j1, k1 - 5, l1, 0);
                world.setBlock(j1, k1 - 6, l1, 0);
                world.setBlock(j1, k1 - 7, l1, 0);
                j1++;
                world.setBlock(j1, k1 - 5, l1, 0);
                world.setBlock(j1, k1 - 6, l1, 0);
                world.setBlock(j1, k1 - 7, l1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                j1++;
                world.setBlock(j1, k1 - 6, l1, 0);
                world.setBlock(j1, k1 - 7, l1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                j1++;
                world.setBlock(j1, k1 - 7, l1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 10, l1, 0);
                j1++;
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 10, l1, 0);
                j1++;
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 10, l1, 0);
                j1++;
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 10, l1, 0);
                j1++;
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 9, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 9, l1 - 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 10, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 10, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 10, l1 - 2, Block.cobblestone.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 2, Block.cobblestone.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 + 2, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 9, l1 + 2, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 10, l1 - 2, Block.cobblestone.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 + 2, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 10, l1 - 2, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 9, l1 - 2, Block.cobblestoneMossy.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 + 2, Block.cobblestone.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 + 2, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 9, l1 + 2, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 10, l1 - 2, Block.cobblestone.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 + 2, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 10, l1 - 2, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 9, l1 - 2, Block.cobblestone.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 + 2, Block.stone.blockID);
                world.setBlock(j1, k1 - 10, l1 - 2, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 9, l1 - 2, Block.cobblestone.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 + 2, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 9, l1 + 2, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 10, l1 - 2, Block.cobblestoneMossy.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 + 2, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 8, l1 + 2, Block.cobblestone.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 + 2, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 10, l1 - 2, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 9, l1 - 2, Block.cobblestoneMossy.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 + 2, Block.cobblestone.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 + 2, Block.cobblestoneMossy.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 + 2, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 9, l1 + 2, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 9, l1 - 2, Block.cobblestoneMossy.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 2, Block.cobblestone.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 + 2, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 9, l1 + 2, Block.cobblestone.blockID);
                j1++;
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 11, l1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 10, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 10, l1 - 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 9, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 9, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 8, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 8, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 8, l1, Block.cobblestoneMossy.blockID);
                int k6 = random.nextInt(100);
                if(k6 <= 30)
                {
                    world.setBlock(j1 - 1, k1 - 8, l1 + 3, Block.vine.blockID);
                    world.setBlock(j1 - 2, k1 - 8, l1, Block.vine.blockID);
                    world.setBlock(j1 - 2, k1 - 9, l1, Block.vine.blockID);
                    world.setBlock(j1 - 4, k1 - 8, l1 + 2, Block.vine.blockID);
                    world.setBlock(j1 - 6, k1 - 8, l1 - 1, Block.vine.blockID);
                }
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 2, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 3, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 4, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 2, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 3, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 4, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 7, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 + 2, 0);
                world.setBlock(j1, k1 - 10, l1 + 3, 0);
                world.setBlock(j1, k1 - 10, l1 + 4, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 2, 0);
                world.setBlock(j1, k1 - 10, l1 - 3, 0);
                world.setBlock(j1, k1 - 10, l1 - 4, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 + 2, 0);
                world.setBlock(j1, k1 - 9, l1 + 3, 0);
                world.setBlock(j1, k1 - 9, l1 + 4, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 2, 0);
                world.setBlock(j1, k1 - 9, l1 - 3, 0);
                world.setBlock(j1, k1 - 9, l1 - 4, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 + 2, 0);
                world.setBlock(j1, k1 - 8, l1 + 3, 0);
                world.setBlock(j1, k1 - 8, l1 + 4, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 2, 0);
                world.setBlock(j1, k1 - 8, l1 - 3, 0);
                world.setBlock(j1, k1 - 8, l1 - 4, 0);
                world.setBlock(j1, k1 - 7, l1 + 1, 0);
                world.setBlock(j1, k1 - 7, l1 + 2, 0);
                world.setBlock(j1, k1 - 7, l1 + 3, 0);
                world.setBlock(j1, k1 - 7, l1 + 4, 0);
                world.setBlock(j1, k1 - 7, l1 - 1, 0);
                world.setBlock(j1, k1 - 7, l1 - 2, 0);
                world.setBlock(j1, k1 - 7, l1 - 3, 0);
                world.setBlock(j1, k1 - 7, l1 - 4, 0);
                world.setBlock(j1, k1 - 10, l1 + 5, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 9, l1 + 5, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 10, l1 - 5, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 9, l1 - 5, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 8, l1 - 5, Block.cobblestone.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 2, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 3, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 4, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 2, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 3, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 4, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 7, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 + 2, 0);
                world.setBlock(j1, k1 - 10, l1 + 3, 0);
                world.setBlock(j1, k1 - 10, l1 + 4, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 2, 0);
                world.setBlock(j1, k1 - 10, l1 - 3, 0);
                world.setBlock(j1, k1 - 10, l1 - 4, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 + 2, 0);
                world.setBlock(j1, k1 - 9, l1 + 3, 0);
                world.setBlock(j1, k1 - 9, l1 + 4, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 2, 0);
                world.setBlock(j1, k1 - 9, l1 - 3, 0);
                world.setBlock(j1, k1 - 9, l1 - 4, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 + 2, 0);
                world.setBlock(j1, k1 - 8, l1 + 3, 0);
                world.setBlock(j1, k1 - 8, l1 + 4, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 2, 0);
                world.setBlock(j1, k1 - 8, l1 - 3, 0);
                world.setBlock(j1, k1 - 8, l1 - 4, 0);
                world.setBlock(j1, k1 - 7, l1 + 1, 0);
                world.setBlock(j1, k1 - 7, l1 + 2, 0);
                world.setBlock(j1, k1 - 7, l1 + 3, 0);
                world.setBlock(j1, k1 - 7, l1 + 4, 0);
                world.setBlock(j1, k1 - 7, l1 - 1, 0);
                world.setBlock(j1, k1 - 7, l1 - 2, 0);
                world.setBlock(j1, k1 - 7, l1 - 3, 0);
                world.setBlock(j1, k1 - 7, l1 - 4, 0);
                world.setBlock(j1, k1 - 10, l1 + 5, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 9, l1 + 5, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 9, l1 - 5, Block.cobblestoneMossy.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 2, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 3, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 4, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 2, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 3, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 4, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 7, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 + 2, 0);
                world.setBlock(j1, k1 - 10, l1 + 3, 0);
                world.setBlock(j1, k1 - 10, l1 + 4, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 2, 0);
                world.setBlock(j1, k1 - 10, l1 - 3, 0);
                world.setBlock(j1, k1 - 10, l1 - 4, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 + 2, 0);
                world.setBlock(j1, k1 - 9, l1 + 3, 0);
                world.setBlock(j1, k1 - 9, l1 + 4, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 2, 0);
                world.setBlock(j1, k1 - 9, l1 - 3, 0);
                world.setBlock(j1, k1 - 9, l1 - 4, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 + 2, 0);
                world.setBlock(j1, k1 - 8, l1 + 3, 0);
                world.setBlock(j1, k1 - 8, l1 + 4, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 2, 0);
                world.setBlock(j1, k1 - 8, l1 - 3, 0);
                world.setBlock(j1, k1 - 8, l1 - 4, 0);
                world.setBlock(j1, k1 - 7, l1 + 1, 0);
                world.setBlock(j1, k1 - 7, l1 + 2, 0);
                world.setBlock(j1, k1 - 7, l1 + 3, 0);
                world.setBlock(j1, k1 - 7, l1 + 4, 0);
                world.setBlock(j1, k1 - 7, l1 - 1, 0);
                world.setBlock(j1, k1 - 7, l1 - 2, 0);
                world.setBlock(j1, k1 - 7, l1 - 3, 0);
                world.setBlock(j1, k1 - 7, l1 - 4, 0);
                world.setBlock(j1, k1 - 10, l1 + 5, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 9, l1 + 5, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 8, l1 + 5, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 9, l1 - 5, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 8, l1 - 5, Block.cobblestoneMossy.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 2, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 3, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 4, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 2, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 3, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 4, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 7, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 + 2, 0);
                world.setBlock(j1, k1 - 10, l1 + 3, 0);
                world.setBlock(j1, k1 - 10, l1 + 4, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 2, 0);
                world.setBlock(j1, k1 - 10, l1 - 3, 0);
                world.setBlock(j1, k1 - 10, l1 - 4, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 + 2, 0);
                world.setBlock(j1, k1 - 9, l1 + 3, 0);
                world.setBlock(j1, k1 - 9, l1 + 4, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 2, 0);
                world.setBlock(j1, k1 - 9, l1 - 3, 0);
                world.setBlock(j1, k1 - 9, l1 - 4, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 + 2, 0);
                world.setBlock(j1, k1 - 8, l1 + 3, 0);
                world.setBlock(j1, k1 - 8, l1 + 4, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 2, 0);
                world.setBlock(j1, k1 - 8, l1 - 3, 0);
                world.setBlock(j1, k1 - 8, l1 - 4, 0);
                world.setBlock(j1, k1 - 7, l1 + 1, 0);
                world.setBlock(j1, k1 - 7, l1 + 2, 0);
                world.setBlock(j1, k1 - 7, l1 + 3, 0);
                world.setBlock(j1, k1 - 7, l1 + 4, 0);
                world.setBlock(j1, k1 - 7, l1 - 1, 0);
                world.setBlock(j1, k1 - 7, l1 - 2, 0);
                world.setBlock(j1, k1 - 7, l1 - 3, 0);
                world.setBlock(j1, k1 - 7, l1 - 4, 0);
                world.setBlock(j1, k1 - 10, l1 + 5, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 9, l1 + 5, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 10, l1 - 5, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 9, l1 - 5, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 8, l1 - 5, Block.cobblestone.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 2, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 3, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 4, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 2, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 3, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 4, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 7, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 + 2, 0);
                world.setBlock(j1, k1 - 10, l1 + 3, 0);
                world.setBlock(j1, k1 - 10, l1 + 4, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 2, 0);
                world.setBlock(j1, k1 - 10, l1 - 3, 0);
                world.setBlock(j1, k1 - 10, l1 - 4, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 + 2, 0);
                world.setBlock(j1, k1 - 9, l1 + 3, 0);
                world.setBlock(j1, k1 - 9, l1 + 4, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 2, 0);
                world.setBlock(j1, k1 - 9, l1 - 3, 0);
                world.setBlock(j1, k1 - 9, l1 - 4, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 + 2, 0);
                world.setBlock(j1, k1 - 8, l1 + 3, 0);
                world.setBlock(j1, k1 - 8, l1 + 4, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 2, 0);
                world.setBlock(j1, k1 - 8, l1 - 3, 0);
                world.setBlock(j1, k1 - 8, l1 - 4, 0);
                world.setBlock(j1, k1 - 7, l1 + 1, 0);
                world.setBlock(j1, k1 - 7, l1 + 2, 0);
                world.setBlock(j1, k1 - 7, l1 + 3, 0);
                world.setBlock(j1, k1 - 7, l1 + 4, 0);
                world.setBlock(j1, k1 - 7, l1 - 1, 0);
                world.setBlock(j1, k1 - 7, l1 - 2, 0);
                world.setBlock(j1, k1 - 7, l1 - 3, 0);
                world.setBlock(j1, k1 - 7, l1 - 4, 0);
                world.setBlock(j1, k1 - 10, l1 + 5, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 9, l1 + 5, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 8, l1 + 5, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 9, l1 - 5, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 8, l1 - 5, Block.cobblestoneMossy.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 2, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 3, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 4, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 2, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 3, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 4, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 7, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 + 2, 0);
                world.setBlock(j1, k1 - 10, l1 + 3, 0);
                world.setBlock(j1, k1 - 10, l1 + 4, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 2, 0);
                world.setBlock(j1, k1 - 10, l1 - 3, 0);
                world.setBlock(j1, k1 - 10, l1 - 4, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 + 2, 0);
                world.setBlock(j1, k1 - 9, l1 + 3, 0);
                world.setBlock(j1, k1 - 9, l1 + 4, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 2, 0);
                world.setBlock(j1, k1 - 9, l1 - 3, 0);
                world.setBlock(j1, k1 - 9, l1 - 4, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 + 2, 0);
                world.setBlock(j1, k1 - 8, l1 + 3, 0);
                world.setBlock(j1, k1 - 8, l1 + 4, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 2, 0);
                world.setBlock(j1, k1 - 8, l1 - 3, 0);
                world.setBlock(j1, k1 - 8, l1 - 4, 0);
                world.setBlock(j1, k1 - 7, l1 + 1, 0);
                world.setBlock(j1, k1 - 7, l1 + 2, 0);
                world.setBlock(j1, k1 - 7, l1 + 3, 0);
                world.setBlock(j1, k1 - 7, l1 + 4, 0);
                world.setBlock(j1, k1 - 7, l1 - 1, 0);
                world.setBlock(j1, k1 - 7, l1 - 2, 0);
                world.setBlock(j1, k1 - 7, l1 - 3, 0);
                world.setBlock(j1, k1 - 7, l1 - 4, 0);
                world.setBlock(j1, k1 - 10, l1 + 5, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 8, l1 + 5, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 9, l1 - 5, Block.cobblestone.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 2, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 3, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 4, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 2, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 3, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 4, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 7, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 + 2, 0);
                world.setBlock(j1, k1 - 10, l1 + 3, 0);
                world.setBlock(j1, k1 - 10, l1 + 4, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 2, 0);
                world.setBlock(j1, k1 - 10, l1 - 3, 0);
                world.setBlock(j1, k1 - 10, l1 - 4, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 + 2, 0);
                world.setBlock(j1, k1 - 9, l1 + 3, 0);
                world.setBlock(j1, k1 - 9, l1 + 4, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 2, 0);
                world.setBlock(j1, k1 - 9, l1 - 3, 0);
                world.setBlock(j1, k1 - 9, l1 - 4, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 + 2, 0);
                world.setBlock(j1, k1 - 8, l1 + 3, 0);
                world.setBlock(j1, k1 - 8, l1 + 4, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 2, 0);
                world.setBlock(j1, k1 - 8, l1 - 3, 0);
                world.setBlock(j1, k1 - 8, l1 - 4, 0);
                world.setBlock(j1, k1 - 7, l1 + 1, 0);
                world.setBlock(j1, k1 - 7, l1 + 2, 0);
                world.setBlock(j1, k1 - 7, l1 + 3, 0);
                world.setBlock(j1, k1 - 7, l1 + 4, 0);
                world.setBlock(j1, k1 - 7, l1 - 1, 0);
                world.setBlock(j1, k1 - 7, l1 - 2, 0);
                world.setBlock(j1, k1 - 7, l1 - 3, 0);
                world.setBlock(j1, k1 - 7, l1 - 4, 0);
                world.setBlock(j1, k1 - 10, l1 + 5, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 9, l1 + 5, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 8, l1 + 5, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 9, l1 - 5, Block.cobblestoneMossy.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 2, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 3, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 4, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 2, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 3, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 4, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 7, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 + 2, 0);
                world.setBlock(j1, k1 - 10, l1 + 3, 0);
                world.setBlock(j1, k1 - 10, l1 + 4, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 2, 0);
                world.setBlock(j1, k1 - 10, l1 - 3, 0);
                world.setBlock(j1, k1 - 10, l1 - 4, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 + 2, 0);
                world.setBlock(j1, k1 - 9, l1 + 3, 0);
                world.setBlock(j1, k1 - 9, l1 + 4, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 2, 0);
                world.setBlock(j1, k1 - 9, l1 - 3, 0);
                world.setBlock(j1, k1 - 9, l1 - 4, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 + 2, 0);
                world.setBlock(j1, k1 - 8, l1 + 3, 0);
                world.setBlock(j1, k1 - 8, l1 + 4, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 2, 0);
                world.setBlock(j1, k1 - 8, l1 - 3, 0);
                world.setBlock(j1, k1 - 8, l1 - 4, 0);
                world.setBlock(j1, k1 - 7, l1 + 1, 0);
                world.setBlock(j1, k1 - 7, l1 + 2, 0);
                world.setBlock(j1, k1 - 7, l1 + 3, 0);
                world.setBlock(j1, k1 - 7, l1 + 4, 0);
                world.setBlock(j1, k1 - 7, l1 - 1, 0);
                world.setBlock(j1, k1 - 7, l1 - 2, 0);
                world.setBlock(j1, k1 - 7, l1 - 3, 0);
                world.setBlock(j1, k1 - 7, l1 - 4, 0);
                world.setBlock(j1, k1 - 10, l1 + 5, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 9, l1 + 5, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 8, l1 + 5, Block.cobblestone.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 2, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 3, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 4, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 2, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 3, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 4, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 7, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 + 2, 0);
                world.setBlock(j1, k1 - 10, l1 + 3, 0);
                world.setBlock(j1, k1 - 10, l1 + 4, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 2, 0);
                world.setBlock(j1, k1 - 10, l1 - 3, 0);
                world.setBlock(j1, k1 - 10, l1 - 4, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 + 2, 0);
                world.setBlock(j1, k1 - 9, l1 + 3, 0);
                world.setBlock(j1, k1 - 9, l1 + 4, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 2, 0);
                world.setBlock(j1, k1 - 9, l1 - 3, 0);
                world.setBlock(j1, k1 - 9, l1 - 4, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 + 2, 0);
                world.setBlock(j1, k1 - 8, l1 + 3, 0);
                world.setBlock(j1, k1 - 8, l1 + 4, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 2, 0);
                world.setBlock(j1, k1 - 8, l1 - 3, 0);
                world.setBlock(j1, k1 - 8, l1 - 4, 0);
                world.setBlock(j1, k1 - 7, l1 + 1, 0);
                world.setBlock(j1, k1 - 7, l1 + 2, 0);
                world.setBlock(j1, k1 - 7, l1 + 3, 0);
                world.setBlock(j1, k1 - 7, l1 + 4, 0);
                world.setBlock(j1, k1 - 7, l1 - 1, 0);
                world.setBlock(j1, k1 - 7, l1 - 2, 0);
                world.setBlock(j1, k1 - 7, l1 - 3, 0);
                world.setBlock(j1, k1 - 7, l1 - 4, 0);
                world.setBlock(j1, k1 - 10, l1 + 5, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 9, l1 + 5, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 10, l1 - 5, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 9, l1 - 5, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 8, l1 - 5, Block.cobblestone.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 2, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 3, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 4, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 2, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 3, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 4, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 7, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 + 2, 0);
                world.setBlock(j1, k1 - 10, l1 + 3, 0);
                world.setBlock(j1, k1 - 10, l1 + 4, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 2, 0);
                world.setBlock(j1, k1 - 10, l1 - 3, 0);
                world.setBlock(j1, k1 - 10, l1 - 4, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 + 2, 0);
                world.setBlock(j1, k1 - 9, l1 + 3, 0);
                world.setBlock(j1, k1 - 9, l1 + 4, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 2, 0);
                world.setBlock(j1, k1 - 9, l1 - 3, 0);
                world.setBlock(j1, k1 - 9, l1 - 4, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 + 2, 0);
                world.setBlock(j1, k1 - 8, l1 + 3, 0);
                world.setBlock(j1, k1 - 8, l1 + 4, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 2, 0);
                world.setBlock(j1, k1 - 8, l1 - 3, 0);
                world.setBlock(j1, k1 - 8, l1 - 4, 0);
                world.setBlock(j1, k1 - 7, l1 + 1, 0);
                world.setBlock(j1, k1 - 7, l1 + 2, 0);
                world.setBlock(j1, k1 - 7, l1 + 3, 0);
                world.setBlock(j1, k1 - 7, l1 + 4, 0);
                world.setBlock(j1, k1 - 7, l1 - 1, 0);
                world.setBlock(j1, k1 - 7, l1 - 2, 0);
                world.setBlock(j1, k1 - 7, l1 - 3, 0);
                world.setBlock(j1, k1 - 7, l1 - 4, 0);
                world.setBlock(j1, k1 - 10, l1 + 5, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 9, l1 + 5, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 9, l1 - 5, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 8, l1 - 5, Block.cobblestone.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 2, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 3, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 4, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 2, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 3, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 4, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 7, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 + 2, 0);
                world.setBlock(j1, k1 - 10, l1 + 3, 0);
                world.setBlock(j1, k1 - 10, l1 + 4, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 2, 0);
                world.setBlock(j1, k1 - 10, l1 - 3, 0);
                world.setBlock(j1, k1 - 10, l1 - 4, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 + 2, 0);
                world.setBlock(j1, k1 - 9, l1 + 3, 0);
                world.setBlock(j1, k1 - 9, l1 + 4, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 2, 0);
                world.setBlock(j1, k1 - 9, l1 - 3, 0);
                world.setBlock(j1, k1 - 9, l1 - 4, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 + 2, 0);
                world.setBlock(j1, k1 - 8, l1 + 3, 0);
                world.setBlock(j1, k1 - 8, l1 + 4, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 2, 0);
                world.setBlock(j1, k1 - 8, l1 - 3, 0);
                world.setBlock(j1, k1 - 8, l1 - 4, 0);
                world.setBlock(j1, k1 - 7, l1 + 1, 0);
                world.setBlock(j1, k1 - 7, l1 + 2, 0);
                world.setBlock(j1, k1 - 7, l1 + 3, 0);
                world.setBlock(j1, k1 - 7, l1 + 4, 0);
                world.setBlock(j1, k1 - 7, l1 - 1, 0);
                world.setBlock(j1, k1 - 7, l1 - 2, 0);
                world.setBlock(j1, k1 - 7, l1 - 3, 0);
                world.setBlock(j1, k1 - 7, l1 - 4, 0);
                world.setBlock(j1, k1 - 10, l1 + 5, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 9, l1 + 5, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 8, l1 + 5, Block.cobblestone.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 2, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 3, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 4, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 2, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 3, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 4, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 7, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 + 2, 0);
                world.setBlock(j1, k1 - 10, l1 + 3, 0);
                world.setBlock(j1, k1 - 10, l1 + 4, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 2, 0);
                world.setBlock(j1, k1 - 10, l1 - 3, 0);
                world.setBlock(j1, k1 - 10, l1 - 4, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 + 2, 0);
                world.setBlock(j1, k1 - 9, l1 + 3, 0);
                world.setBlock(j1, k1 - 9, l1 + 4, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 2, 0);
                world.setBlock(j1, k1 - 9, l1 - 3, 0);
                world.setBlock(j1, k1 - 9, l1 - 4, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 + 2, 0);
                world.setBlock(j1, k1 - 8, l1 + 3, 0);
                world.setBlock(j1, k1 - 8, l1 + 4, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 2, 0);
                world.setBlock(j1, k1 - 8, l1 - 3, 0);
                world.setBlock(j1, k1 - 8, l1 - 4, 0);
                world.setBlock(j1, k1 - 7, l1 + 1, 0);
                world.setBlock(j1, k1 - 7, l1 + 2, 0);
                world.setBlock(j1, k1 - 7, l1 + 3, 0);
                world.setBlock(j1, k1 - 7, l1 + 4, 0);
                world.setBlock(j1, k1 - 7, l1 - 1, 0);
                world.setBlock(j1, k1 - 7, l1 - 2, 0);
                world.setBlock(j1, k1 - 7, l1 - 3, 0);
                world.setBlock(j1, k1 - 7, l1 - 4, 0);
                world.setBlock(j1, k1 - 10, l1 + 5, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 10, l1 + 5, Block.cobblestone.blockID);
                j1++;
                world.setBlock(j1, k1 - 11, l1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 2, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 + 3, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 + 4, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 11, l1 - 2, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 3, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 11, l1 - 4, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 10, l1, 0);
                world.setBlock(j1, k1 - 9, l1, 0);
                world.setBlock(j1, k1 - 8, l1, 0);
                world.setBlock(j1, k1 - 7, l1, 0);
                world.setBlock(j1, k1 - 10, l1 + 1, 0);
                world.setBlock(j1, k1 - 10, l1 + 2, 0);
                world.setBlock(j1, k1 - 10, l1 + 3, 0);
                world.setBlock(j1, k1 - 10, l1 + 4, 0);
                world.setBlock(j1, k1 - 10, l1 - 1, 0);
                world.setBlock(j1, k1 - 10, l1 - 2, 0);
                world.setBlock(j1, k1 - 10, l1 - 3, 0);
                world.setBlock(j1, k1 - 10, l1 - 4, 0);
                world.setBlock(j1, k1 - 9, l1 + 1, 0);
                world.setBlock(j1, k1 - 9, l1 + 2, 0);
                world.setBlock(j1, k1 - 9, l1 + 3, 0);
                world.setBlock(j1, k1 - 9, l1 + 4, 0);
                world.setBlock(j1, k1 - 9, l1 - 1, 0);
                world.setBlock(j1, k1 - 9, l1 - 2, 0);
                world.setBlock(j1, k1 - 9, l1 - 3, 0);
                world.setBlock(j1, k1 - 9, l1 - 4, 0);
                world.setBlock(j1, k1 - 8, l1 + 1, 0);
                world.setBlock(j1, k1 - 8, l1 + 2, 0);
                world.setBlock(j1, k1 - 8, l1 + 3, 0);
                world.setBlock(j1, k1 - 8, l1 + 4, 0);
                world.setBlock(j1, k1 - 8, l1 - 1, 0);
                world.setBlock(j1, k1 - 8, l1 - 2, 0);
                world.setBlock(j1, k1 - 8, l1 - 3, 0);
                world.setBlock(j1, k1 - 8, l1 - 4, 0);
                world.setBlock(j1, k1 - 7, l1 + 1, 0);
                world.setBlock(j1, k1 - 7, l1 + 2, 0);
                world.setBlock(j1, k1 - 7, l1 + 3, 0);
                world.setBlock(j1, k1 - 7, l1 + 4, 0);
                world.setBlock(j1, k1 - 7, l1 - 1, 0);
                world.setBlock(j1, k1 - 7, l1 - 2, 0);
                world.setBlock(j1, k1 - 7, l1 - 3, 0);
                world.setBlock(j1, k1 - 7, l1 - 4, 0);
                world.setBlock(j1, k1 - 10, l1 + 5, Block.cobblestone.blockID);
                world.setBlock(j1, k1 - 9, l1 + 5, Block.cobblestoneMossy.blockID);
                world.setBlock(j1, k1 - 8, l1 + 5, Block.cobblestone.blockID);
                int i8 = random.nextInt(2) + 1;
                if(i8 == 1)
                {
                    world.setBlock(j1 - 2, k1 - 10, l1, Block.cobblestone.blockID);
                    world.setBlock(j1 - 2, k1 - 9, l1, Block.cobblestone.blockID);
                    world.setBlock(j1 - 2, k1 - 8, l1, Block.cobblestone.blockID);
                    world.setBlock(j1 - 2, k1 - 7, l1, Block.cobblestone.blockID);
                    world.setBlock(j1 - 6, k1 - 10, l1, Block.cobblestone.blockID);
                    world.setBlock(j1 - 6, k1 - 9, l1, Block.cobblestone.blockID);
                    world.setBlock(j1 - 6, k1 - 8, l1, Block.cobblestone.blockID);
                    world.setBlock(j1 - 6, k1 - 7, l1, Block.cobblestone.blockID);
                    world.setBlock(j1 - 10, k1 - 10, l1, Block.cobblestone.blockID);
                    world.setBlock(j1 - 10, k1 - 9, l1, Block.cobblestone.blockID);
                    world.setBlock(j1 - 10, k1 - 8, l1, Block.cobblestone.blockID);
                    world.setBlock(j1 - 10, k1 - 7, l1, Block.cobblestone.blockID);
                    int l8 = random.nextInt(100);
                    if(l8 <= 50)
                    {
                        world.setBlock(j1 - 1, k1 - 10, l1 + 2, Block.stoneDoubleSlab.blockID);
                        world.setBlock(j1 - 1, k1 - 9, l1 + 2, Block.stoneDoubleSlab.blockID);
                        world.setBlock(j1 - 1, k1 - 8, l1 + 2, Block.stoneDoubleSlab.blockID);
                        world.setBlock(j1 - 1, k1 - 10, l1 + 3, Block.stoneDoubleSlab.blockID);
                        world.setBlock(j1 - 1, k1 - 9, l1 + 3, Block.stoneDoubleSlab.blockID);
                        world.setBlock(j1 - 1, k1 - 8, l1 + 3, Block.stoneDoubleSlab.blockID);
                    }
                    int l9 = random.nextInt(100);
                    if(l9 <= 60)
                    {
                        world.setBlock(j1 - 2, k1 - 10, l1 + 2, Block.stoneDoubleSlab.blockID);
                        world.setBlock(j1 - 2, k1 - 9, l1 + 2, Block.stoneDoubleSlab.blockID);
                        world.setBlock(j1 - 2, k1 - 8, l1 + 2, Block.stoneDoubleSlab.blockID);
                        world.setBlock(j1 - 2, k1 - 10, l1 + 3, Block.stoneDoubleSlab.blockID);
                        world.setBlock(j1 - 2, k1 - 9, l1 + 3, Block.stoneDoubleSlab.blockID);
                    }
                    int l10 = random.nextInt(100);
                    if(l10 <= 70)
                    {
                        world.setBlock(j1 - 3, k1 - 10, l1 + 2, Block.stoneDoubleSlab.blockID);
                        world.setBlock(j1 - 3, k1 - 9, l1 + 2, Block.stoneDoubleSlab.blockID);
                        world.setBlock(j1 - 3, k1 - 10, l1 + 3, Block.stoneDoubleSlab.blockID);
                        world.setBlock(j1 - 3, k1 - 9, l1 + 3, Block.stoneDoubleSlab.blockID);
                    }
                    int l11 = random.nextInt(100);
                    if(l11 <= 40)
                    {
                        world.setBlock(j1 - 1, k1 - 10, l1 - 2, Block.brick.blockID);
                        world.setBlock(j1 - 1, k1 - 9, l1 - 2, Block.brick.blockID);
                        world.setBlock(j1 - 1, k1 - 8, l1 - 2, Block.brick.blockID);
                        world.setBlock(j1 - 1, k1 - 10, l1 - 3, Block.brick.blockID);
                        world.setBlock(j1 - 1, k1 - 9, l1 - 3, Block.brick.blockID);
                    }
                    int k12 = random.nextInt(100);
                    if(k12 <= 50)
                    {
                        world.setBlock(j1 - 2, k1 - 10, l1 - 2, Block.brick.blockID);
                        world.setBlock(j1 - 2, k1 - 9, l1 - 2, Block.brick.blockID);
                        world.setBlock(j1 - 2, k1 - 8, l1 - 2, Block.brick.blockID);
                        world.setBlock(j1 - 2, k1 - 10, l1 - 3, Block.brick.blockID);
                        world.setBlock(j1 - 2, k1 - 9, l1 - 3, Block.brick.blockID);
                        world.setBlock(j1 - 2, k1 - 8, l1 - 3, Block.brick.blockID);
                    }
                    int l12 = random.nextInt(100);
                    if(l12 <= 40)
                    {
                        world.setBlock(j1 - 4, k1 - 10, l1 - 2, Block.netherBrick.blockID);
                        world.setBlock(j1 - 4, k1 - 9, l1 - 2, Block.netherBrick.blockID);
                        world.setBlock(j1 - 4, k1 - 10, l1 - 3, Block.netherBrick.blockID);
                        world.setBlock(j1 - 4, k1 - 9, l1 - 3, Block.netherBrick.blockID);
                    }
                    int i13 = random.nextInt(100);
                    if(i13 <= 40)
                    {
                        world.setBlock(j1 - 5, k1 - 10, l1 - 2, Block.netherBrick.blockID);
                        world.setBlock(j1 - 5, k1 - 9, l1 - 2, Block.netherBrick.blockID);
                        world.setBlock(j1 - 5, k1 - 10, l1 - 3, Block.netherBrick.blockID);
                        world.setBlock(j1 - 5, k1 - 9, l1 - 3, Block.netherBrick.blockID);
                        world.setBlock(j1 - 6, k1 - 10, l1 - 2, Block.netherBrick.blockID);
                        world.setBlock(j1 - 6, k1 - 9, l1 - 2, Block.netherBrick.blockID);
                        world.setBlock(j1 - 6, k1 - 10, l1 - 3, Block.netherBrick.blockID);
                    }
                    int j13 = random.nextInt(100);
                    if(j13 <= 15)
                    {
                        world.setBlock(j1 - 9, k1 - 10, l1 + 2, Block.chest.blockID);
                        TileEntityChest tileentitychest = (TileEntityChest) world.getBlockTileEntity(j1 - 9, k1 - 10, l1 + 2);
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
                        
                    }
                    int k13 = random.nextInt(100);
                    if(k13 <= 15)
                    {
                        world.setBlock(j1 - 9, k1 - 10, l1 - 2, Block.chest.blockID);
                        TileEntityChest chest = (TileEntityChest) world.getBlockTileEntity(j1 - 9, k1 - 10, l1 - 2);
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
                    }
                }
                if(i8 != 2)
                {
                    continue;
                }
                world.setBlock(j1 - 1, k1 - 10, l1, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 1, k1 - 9, l1, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 1, k1 - 8, l1, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 1, k1 - 7, l1, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 1, k1 - 10, l1 + 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 1, k1 - 9, l1 + 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 1, k1 - 8, l1 + 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 1, k1 - 7, l1 + 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 1, k1 - 10, l1 - 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 1, k1 - 9, l1 - 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 1, k1 - 8, l1 - 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 1, k1 - 7, l1 - 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 3, k1 - 10, l1, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 3, k1 - 9, l1, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 3, k1 - 8, l1, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 3, k1 - 7, l1, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 3, k1 - 10, l1 + 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 3, k1 - 9, l1 + 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 3, k1 - 8, l1 + 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 3, k1 - 7, l1 + 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 3, k1 - 10, l1 - 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 3, k1 - 9, l1 - 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 3, k1 - 8, l1 - 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 3, k1 - 7, l1 - 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 4, k1 - 10, l1, Block.mobSpawner.blockID);
                TileEntityMobSpawner spawner = (TileEntityMobSpawner) world.getBlockTileEntity(j1 - 4, k1 - 10, l1);
                if(spawner != null)
                {
                	spawner.func_98049_a().setMobID("Zombie");
                }           
                
                
                world.setBlock(j1 - 8, k1 - 10, l1, Block.stoneSingleSlab.blockID);
                world.setBlock(j1 - 8, k1 - 10, l1 + 1, Block.stoneSingleSlab.blockID);
                world.setBlock(j1 - 8, k1 - 10, l1 - 1, Block.stoneSingleSlab.blockID);
                world.setBlock(j1 - 5, k1 - 10, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1 - 5, k1 - 10, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1 - 5, k1 - 10, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1 - 6, k1 - 10, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1 - 6, k1 - 10, l1 + 1, Block.cobblestone.blockID);
                world.setBlock(j1 - 6, k1 - 10, l1 - 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1 - 6, k1 - 10, l1 + 2, Block.cobblestoneMossy.blockID);
                world.setBlock(j1 - 6, k1 - 10, l1 - 2, Block.cobblestoneMossy.blockID);
                world.setBlock(j1 - 7, k1 - 10, l1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1 - 7, k1 - 10, l1 + 1, Block.cobblestoneMossy.blockID);
                world.setBlock(j1 - 7, k1 - 10, l1 - 1, Block.cobblestone.blockID);
                int i9 = random.nextInt(100);
                if(i9 <= 30)
                {
                    world.setBlock(j1 - 6, k1 - 9, l1, Block.chest.blockID);
                    TileEntityChest tileentitychest = (TileEntityChest) world.getBlockTileEntity(j1 - 6, k1 - 9, l1);
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
                    
                }
                if(i9 <= 10)
                {
                    world.setBlock(j1 - 6, k1 - 9, l1, Block.chest.blockID);
                    TileEntityChest chest = (TileEntityChest) world.getBlockTileEntity(j1 - 6, k1 - 9, l1);
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
                }
                world.setBlock(j1 - 9, k1 - 10, l1, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 9, k1 - 9, l1, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 9, k1 - 8, l1, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 9, k1 - 7, l1, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 9, k1 - 10, l1 + 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 9, k1 - 9, l1 + 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 9, k1 - 8, l1 + 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 9, k1 - 7, l1 + 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 9, k1 - 10, l1 - 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 9, k1 - 9, l1 - 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 9, k1 - 8, l1 - 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 9, k1 - 7, l1 - 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 11, k1 - 10, l1, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 11, k1 - 9, l1, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 11, k1 - 8, l1, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 11, k1 - 7, l1, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 11, k1 - 10, l1 + 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 11, k1 - 9, l1 + 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 11, k1 - 8, l1 + 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 11, k1 - 7, l1 + 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 11, k1 - 10, l1 - 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 11, k1 - 9, l1 - 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 11, k1 - 8, l1 - 3, Block.blockNetherQuartz.blockID, 2, 2);
                world.setBlock(j1 - 11, k1 - 7, l1 - 3, Block.blockNetherQuartz.blockID, 2, 2);
                int i10 = random.nextInt(100);
                if(i10 <= 20)
                {
                    world.setBlock(j1 - 2, k1 - 10, l1 + 4, Block.chest.blockID);
                    TileEntityChest tileentitychest = (TileEntityChest) world.getBlockTileEntity(j1 - 2, k1 - 10, l1 + 4);
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
                    
                }
                int i11 = random.nextInt(100);
                if(i11 <= 40)
                {
                    world.setBlock(j1 - 3, k1 - 9, l1 + 3, 0);
                    world.setBlock(j1 - 3, k1 - 8, l1 + 3, 0);
                    world.setBlock(j1 - 3, k1 - 7, l1 + 3, 0);
                    world.setBlock(j1 - 1, k1 - 10, l1 + 4, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1 - 2, k1 - 10, l1 + 4, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1, k1 - 10, l1 + 2, Block.blockNetherQuartz.blockID, 2, 2);
                }
                int i12 = random.nextInt(100);
                if(i12 <= 40)
                {
                    world.setBlock(j1 - 9, k1 - 9, l1 - 3, 0);
                    world.setBlock(j1 - 9, k1 - 8, l1 - 3, 0);
                    world.setBlock(j1 - 9, k1 - 7, l1 - 3, 0);
                    world.setBlock(j1 - 7, k1 - 10, l1 - 2, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1 - 8, k1 - 10, l1 - 4, Block.blockNetherQuartz.blockID, 2, 2);
                    world.setBlock(j1 - 8, k1 - 10, l1 - 2, Block.blockNetherQuartz.blockID, 2, 2);
                }
            }
        }
		return true;
    	}
}
