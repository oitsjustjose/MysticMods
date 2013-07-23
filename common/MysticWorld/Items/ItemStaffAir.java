package MysticWorld.Items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import MysticWorld.MysticWorld;
import MysticWorld.Entity.EntityChargeAir;

public class ItemStaffAir extends ItemStaff {
	
	public ItemStaffAir(int id) 
	{
		super(id);
	}
	
	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int par4, boolean par5) 
	{
		if (itemStack.stackTagCompound == null)
    		itemStack.setTagCompound(new NBTTagCompound());

		EntityPlayer player = (EntityPlayer)entity;
		ItemStack currentItem = player.inventory.getCurrentItem();	
		
		itemStack.stackTagCompound.setInteger("maxChargeTime", 3 * 20);
						
		if (currentItem != null)
		{
			if (currentItem.itemID == itemStack.itemID)
			{
				player.fallDistance = 0.0F;
				
				if (!world.isRemote)
					MysticWorld.proxy.airFeetFX(world, (player.posX - 0.5D) + rand.nextDouble(), player.posY + (player.height/itemStack.stackTagCompound.getInteger("maxChargeTime") * itemStack.stackTagCompound.getInteger("chargeTime")), (player.posZ - 0.5D) + rand.nextDouble(), 1.0f + ((float)(itemStack.stackTagCompound.getInteger("chargeTime")) * (5.0f * (1 / (float)itemStack.stackTagCompound.getInteger("maxChargeTime")))), 15);
				
				if (!Mouse.isButtonDown(1))
				{
					if (itemStack.stackTagCompound.getInteger("chargeTime") > 0)
					{
						if (!(Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)))
						{							
							if (!world.isRemote)
							{
								world.playAuxSFXAtEntity((EntityPlayer)null, 1009, (int)player.posX, (int)player.posY, (int)player.posZ, 0);
								world.spawnEntityInWorld(new EntityChargeAir(world, player, 1.0f + ((float)(itemStack.stackTagCompound.getInteger("chargeTime")) * (5.0f * (1 / (float)itemStack.stackTagCompound.getInteger("maxChargeTime")))), (float)(itemStack.stackTagCompound.getInteger("chargeTime")) * (2.5D * (1.0D / (double)itemStack.stackTagCompound.getInteger("maxChargeTime")))));
								
								itemStack.damageItem(1, player);	
							}
						}
						else
						{
							if (player.onGround)
							{
								world.playSoundEffect(player.posX, player.posY, player.posZ, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
								itemStack.damageItem(1, player);
								player.setVelocity(0.0D, 1.0D + (float)(itemStack.stackTagCompound.getInteger("chargeTime")) * (2.5D * (1.0D / (double)itemStack.stackTagCompound.getInteger("maxChargeTime"))), 0.0D);
							}
						}
					}
						
					itemStack.stackTagCompound.setInteger("chargeTime", 0);
					itemStack.stackTagCompound.setFloat("angle", 0);
					itemStack.stackTagCompound.setDouble("radius", 0);
					itemStack.stackTagCompound.setBoolean("charging", false);
				}
				else
				{
					if ((Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)))
					{
						if (!world.isRemote)
							MysticWorld.proxy.airFeetFX(world, player.posX + MathHelper.cos(itemStack.stackTagCompound.getFloat("angle")) * itemStack.stackTagCompound.getDouble("radius"), player.posY, player.posZ + MathHelper.sin(itemStack.stackTagCompound.getFloat("angle")) * itemStack.stackTagCompound.getDouble("radius"), 1.0f + ((float)(itemStack.stackTagCompound.getInteger("chargeTime")) * (5.0f * (1 / (float)itemStack.stackTagCompound.getInteger("maxChargeTime")))), 45);
					}
					
					if (itemStack.stackTagCompound.getBoolean("charging") == true)
					{
						itemStack.stackTagCompound.setInteger("chargeTime", itemStack.stackTagCompound.getInteger("chargeTime") + 1);
						itemStack.stackTagCompound.setFloat("angle", itemStack.stackTagCompound.getFloat("angle") + 0.1f);
						itemStack.stackTagCompound.setDouble("radius", itemStack.stackTagCompound.getDouble("radius") + 0.1D);
					}
				}
			}	
			else
			{
				itemStack.stackTagCompound.setInteger("chargeTime", 0);
				itemStack.stackTagCompound.setFloat("angle", 0);
				itemStack.stackTagCompound.setDouble("radius", 0);
			}
		}
		
		if (itemStack.stackTagCompound.getInteger("chargeTime") > itemStack.stackTagCompound.getInteger("maxChargeTime"))
		{
			itemStack.stackTagCompound.setInteger("chargeTime", itemStack.stackTagCompound.getInteger("maxChargeTime"));
		}
		
		if (itemStack.stackTagCompound.getDouble("radius") > 7.0D)
		{
			itemStack.stackTagCompound.setDouble("radius", 7.0D);
		}
		
		if (itemStack.stackTagCompound.getFloat("angle") > 6.0f)
		{
			itemStack.stackTagCompound.setFloat("angle", 0.0f);
		}
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
	{	
		if (itemStack.stackTagCompound == null)
    		itemStack.setTagCompound(new NBTTagCompound());

		itemStack.stackTagCompound.setDouble("radius", 2.0D);
		
		if (itemStack.stackTagCompound.getBoolean("charging") == false)
		{
			itemStack.stackTagCompound.setBoolean("charging", true);
		}
		
		return itemStack;
	}
	
}
