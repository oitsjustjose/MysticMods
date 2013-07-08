package MysticWorld.Items;

import java.util.Random;

import org.lwjgl.input.Keyboard;

import MysticWorld.MysticWorld;
import MysticWorld.Blocks.BlockHandler;
import MysticWorld.Entity.EntityChargeFire;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ItemStaffFire extends Item {
	
	public ItemStaffFire(int id) {
		super(id);
        this.setMaxStackSize(1);
        this.setMaxDamage(200);
		this.setCreativeTab(MysticWorld.MysticWorldTab);
	}
	
	@Override
	public void registerIcons(IconRegister iconRegister)
	{
	    itemIcon = iconRegister.registerIcon("MysticTextures:StaffFire");
	}	
	
    public boolean itemInteractionForEntity(ItemStack itemStack, EntityLiving entityLiving)
    {
    	if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
    	{
            entityLiving.setFire(5);
            entityLiving.attackEntityFrom(DamageSource.magic, 7);
    		
            itemStack.damageItem(1, entityLiving);   
            
        	return true;
    	}
		return true;
    }
    
    public boolean onLeftClickEntity(ItemStack itemStack, EntityPlayer entityPlayer, Entity entity)
    {
        entity.setFire(5);
        entity.attackEntityFrom(DamageSource.magic, 7);
		
        itemStack.damageItem(1, entityPlayer);   
        
        return true;
    }
    
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer)
	{
		if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
		{
			MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(world, entityPlayer, true);

			Random rand = new Random();
			
	        if (movingobjectposition == null)
	        {
	            return itemStack;
	        }
	        else
	        {
	            if (movingobjectposition.typeOfHit == EnumMovingObjectType.TILE)
	            {
	                int i = movingobjectposition.blockX;
	                int j = movingobjectposition.blockY;
	                int k = movingobjectposition.blockZ;

	                if (!world.canMineBlock(entityPlayer, i, j, k))
	                {
	                    return itemStack;
	                }

	                if (!entityPlayer.canPlayerEdit(i, j, k, movingobjectposition.sideHit, itemStack))
	                {
	                    return itemStack;
	                }
	                else
	                {
	                	if (world.getBlockId(i, j, k) == Block.cobblestone.blockID)
	                    {
	                	   	if (!world.isRemote)
	        	        	{
	                	   		world.playSoundEffect((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
	                	   		world.setBlock(i, j, k, Block.stone.blockID);
	                	   		itemStack.damageItem(1, entityPlayer);
	        	        	}
	                    }
	                    else if (world.getBlockId(i, j, k) == Block.oreIron.blockID)
	                    {
	                    	if (!world.isRemote)
	        	        	{
	                    		world.playSoundEffect((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
	                    		world.setBlock(i, j, k, 0);
	                    		world.spawnEntityInWorld(new EntityItem(world, i, j, k, new ItemStack(Item.ingotIron, 1)));
	                    		itemStack.damageItem(1, entityPlayer);
	        	        	}
	                    }
	                    else if (world.getBlockId(i, j, k) == Block.oreGold.blockID)
	                    {
	                    	if (!world.isRemote)
	        	        	{
	                    		world.playSoundEffect((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
	                    		world.setBlock(i, j, k, 0);
	                    		world.spawnEntityInWorld(new EntityItem(world, i, j, k, new ItemStack(Item.ingotGold, 1)));
	                    		itemStack.damageItem(1, entityPlayer);
	        	        	}
	                    }
	                    else if (world.getBlockId(i, j, k) == Block.sand.blockID)
	                    {
	                    	if (!world.isRemote)
	        	        	{
	                    		world.playSoundEffect((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
	                    		world.setBlock(i, j, k, Block.glass.blockID);
	                    		itemStack.damageItem(1, entityPlayer);
	        	        	}
	                    }
	                    else if (world.getBlockId(i, j, k) == Block.netherrack.blockID)
	                    {
	                    	if (!world.isRemote)
	        	        	{
	                    		world.playSoundEffect((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
	                    		world.setBlock(i, j, k, 0);
	                    		world.spawnEntityInWorld(new EntityItem(world, i, j, k, new ItemStack(Item.netherrackBrick, 1)));
	                    		itemStack.damageItem(1, entityPlayer);
	        	        	}
	                    }
	                    else if (world.getBlockId(i, j, k) == Block.wood.blockID)
	                    {
	                    	if (!world.isRemote)
	        	        	{
	                    		world.playSoundEffect((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
	                    		world.setBlock(i, j, k, 0);
	                    		world.spawnEntityInWorld(new EntityItem(world, i, j, k, new ItemStack(Item.coal, 1, 1)));
	                    		itemStack.damageItem(1, entityPlayer);
	        	        	}
	                    }
	                    else if (world.getBlockId(i, j, k) == Block.cactus.blockID)
	                    {
	                    	if (!world.isRemote)
	        	        	{
	                    		world.playSoundEffect((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
	                    		world.setBlock(i, j, k, 0);
	                    		world.spawnEntityInWorld(new EntityItem(world, i, j, k, new ItemStack(Item.dyePowder, 1, 2)));
	                    		itemStack.damageItem(1, entityPlayer);
	        	        	}
	                    }
	                }
	            }
	        }
		}
		else
		{
			world.playAuxSFXAtEntity((EntityPlayer)null, 1009, (int)entityPlayer.posX, (int)entityPlayer.posY, (int)entityPlayer.posZ, 0);
			
	        if (!world.isRemote)
	        {
	            world.spawnEntityInWorld(new EntityChargeFire(world, entityPlayer));
	            
	            itemStack.damageItem(1, entityPlayer);
	        }
	        
	        return itemStack;
		}
		return itemStack;
	}

}
