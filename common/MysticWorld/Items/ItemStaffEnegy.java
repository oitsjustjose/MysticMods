package MysticWorld.Items;

import org.lwjgl.input.Keyboard;

import MysticWorld.MysticWorld;
import MysticWorld.Blocks.BlockHandler;
import MysticWorld.Entity.EntityChargeEnergy;
import MysticWorld.Entity.EntityChargeFire;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ItemStaffEnegy extends ItemStaff {
	
	public ItemStaffEnegy(int id) {
		super(id);
	}
	
	@Override
	public void registerIcons(IconRegister iconRegister)
	{
	    itemIcon = iconRegister.registerIcon("MysticTextures:StaffEnergy");
	}
	
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer)
	{
		if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
		{
			MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(world, entityPlayer, true);

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
	                	 if (movingobjectposition.sideHit == 0)
	                     {
	                         --j;
	                     }

	                     if (movingobjectposition.sideHit == 1)
	                     {
	                         ++j;
	                     }

	                     if (movingobjectposition.sideHit == 2)
	                     {
	                         --k;
	                     }

	                     if (movingobjectposition.sideHit == 3)
	                     {
	                         ++k;
	                     }

	                     if (movingobjectposition.sideHit == 4)
	                     {
	                         --i;
	                     }

	                     if (movingobjectposition.sideHit == 5)
	                     {
	                         ++i;
	                     }


	                    if (!entityPlayer.canPlayerEdit(i, j, k, movingobjectposition.sideHit, itemStack))
	                    {
	                        return itemStack;
	                    }
	                    else
	                    {
	                        if (world.isAirBlock(i, j, k))
	                        {
	                            world.playSoundEffect((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
	                            world.setBlock(i, j, k, BlockHandler.lightCube.blockID);
	                        }

	                        itemStack.damageItem(1, entityPlayer);
	                        return itemStack;
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
				world.spawnEntityInWorld(new EntityChargeEnergy(world, entityPlayer));
	        
				itemStack.damageItem(1, entityPlayer);
			}
	    
			return itemStack;
		}
		return itemStack;
	}

}
