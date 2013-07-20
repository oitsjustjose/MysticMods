package MysticWorld.Items;

import java.util.Random;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import MysticWorld.MysticWorld;
import MysticWorld.Entity.EntityChargeAir;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;

public class ItemStaffAir extends ItemStaff {
	
	public ItemStaffAir(int id) 
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
					MysticWorld.proxy.airFX(world, (player.posX - 0.5D) + rand.nextDouble(), player.posY, (player.posZ - 0.5D) + rand.nextDouble(), 1.0F);
				}	
			}
		}
	}
	
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer)
	{
		if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
		{
			if (entityPlayer.onGround)
			{
				world.playSoundEffect(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
				itemStack.damageItem(1, entityPlayer);
				entityPlayer.addVelocity(0, 2.5, 0);
			}
	        
	        return itemStack;
		}
		else
		{
			world.playAuxSFXAtEntity((EntityPlayer)null, 1009, (int)entityPlayer.posX, (int)entityPlayer.posY, (int)entityPlayer.posZ, 0);
	
			if (!world.isRemote)
			{
				world.spawnEntityInWorld(new EntityChargeAir(world, entityPlayer));
            
            	itemStack.damageItem(1, entityPlayer);
			}
		}
			
        return itemStack;
		
	}
	
}
