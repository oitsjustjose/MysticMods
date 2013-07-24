package MysticWorld.Items;

import java.util.Random;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import MysticWorld.MysticWorld;
import MysticWorld.Entity.EntityChargeAir;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ItemOrbAir extends ItemOrb 
{	
	public ItemOrbAir(int id) 
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
		
		itemStack.stackTagCompound.setInteger("maxChargeTime", 5 * 20);
						
		if (currentItem != null)
		{
			if (currentItem.itemID == itemStack.itemID)
			{
				player.fallDistance = 0.0F;

				chargeEffect(itemStack, world, player);
							
				if (!Mouse.isButtonDown(1))
				{
					if (itemStack.stackTagCompound.getInteger("chargeTime") > 0)
					{	
						if (player.onGround)
						{
								world.playSoundEffect(player.posX, player.posY, player.posZ, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
								player.setVelocity(0.0D, 1.0D + (float)(itemStack.stackTagCompound.getInteger("chargeTime")) * (2.5D * (1.0D / (double)itemStack.stackTagCompound.getInteger("maxChargeTime"))), 0.0D);

								itemStack.damageItem(1, player);
						}
					}

					resetData(itemStack);
				}
				else
				{	
					if (itemStack.stackTagCompound.getBoolean("charging") == true)
					{
						incrementData(itemStack);
					}
					
					spiralEffect(itemStack, world, player);
				}
			}	
		}
		else
		{
			resetData(itemStack);
			itemStack.stackTagCompound.setFloat("angle", 0);
			itemStack.stackTagCompound.setDouble("radius", 0);
		}
		
		if (itemStack.stackTagCompound.getInteger("chargeTime") > itemStack.stackTagCompound.getInteger("maxChargeTime"))
		{
			itemStack.stackTagCompound.setInteger("chargeTime", itemStack.stackTagCompound.getInteger("maxChargeTime"));
		}
		
		if (itemStack.stackTagCompound.getDouble("radius") > 2.5D)
		{
			itemStack.stackTagCompound.setDouble("radius", 2.5D);
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
		
		if (itemStack.stackTagCompound.getBoolean("charging") == false)
		{
			itemStack.stackTagCompound.setBoolean("charging", true);
		}
		
		return itemStack;
	}
	
	private void spiralEffect(ItemStack itemStack, World world, EntityPlayer player)
	{
		double particleX = player.posX + (double)(MathHelper.cos(itemStack.stackTagCompound.getFloat("angle"))) * itemStack.stackTagCompound.getDouble("radius");
		double particleY = player.posY;
		double particleZ = player.posZ + (double)(MathHelper.sin(itemStack.stackTagCompound.getFloat("angle"))) * itemStack.stackTagCompound.getDouble("radius");
		float particleScale = ((float)(itemStack.stackTagCompound.getInteger("chargeTime")) * (5.0f * (1 / (float)itemStack.stackTagCompound.getInteger("maxChargeTime"))));

		if (!world.isRemote)
			MysticWorld.proxy.airFeetFX(world, particleX, particleY, particleZ, 1.0f + particleScale, 15);
	}
	
	private void chargeEffect(ItemStack itemStack, World world, EntityPlayer player)
	{
		double particleX = (player.posX - 0.5D) + rand.nextDouble();
		double particleZ = (player.posZ - 0.5D) + rand.nextDouble(); 

		if (!world.isRemote)
			MysticWorld.proxy.airFeetFX(world, particleX, player.posY, particleZ, 1.0f, 15);
	}
	
	private void resetData(ItemStack itemStack)
	{
		itemStack.stackTagCompound.setInteger("chargeTime", 0);
		itemStack.stackTagCompound.setBoolean("charging", false);
		itemStack.stackTagCompound.setFloat("angle", 0);
		itemStack.stackTagCompound.setDouble("radius", 0);
	}
	
	private void incrementData(ItemStack itemStack)
	{
		itemStack.stackTagCompound.setInteger("chargeTime", itemStack.stackTagCompound.getInteger("chargeTime") + 1);
		itemStack.stackTagCompound.setFloat("angle", itemStack.stackTagCompound.getFloat("angle") + 0.2f);
		itemStack.stackTagCompound.setDouble("radius", (double)itemStack.stackTagCompound.getInteger("chargeTime") * 0.025D);
	}
}
