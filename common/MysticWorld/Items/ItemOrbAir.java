package MysticWorld.Items;

import java.util.Random;

import MysticWorld.MysticWorld;
import MysticWorld.Entity.EntityChargeAir;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
		EntityPlayer player = (EntityPlayer)entity;
		ItemStack currentItem = player.inventory.getCurrentItem();
		
		if (!world.isRemote)
		{
			if (currentItem != null)
			{
				if (currentItem.itemID == itemStack.itemID)
				{
					player.fallDistance = 0.0F;
					MysticWorld.proxy.airFeetFX(world, (player.posX - 0.5D) + rand.nextDouble(), player.posY, (player.posZ - 0.5D) + rand.nextDouble(), 1.0F, 15);
				}
			}
		}
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer)
	{
		if (entityPlayer.onGround)
		{
			world.playSoundEffect(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
			itemStack.damageItem(1, entityPlayer);
			entityPlayer.addVelocity(0, 2.5, 0);
		}
		
        return itemStack;
	}
	
}
