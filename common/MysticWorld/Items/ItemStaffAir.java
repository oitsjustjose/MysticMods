package MysticWorld.Items;

import org.lwjgl.input.Keyboard;

import MysticWorld.MysticWorld;
import MysticWorld.Entity.EntityChargeAir;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemStaffAir extends Item {

	public ItemStaffAir(int id) 
	{
		super(id);
        this.setMaxStackSize(1);
        this.setMaxDamage(200);
		this.setCreativeTab(MysticWorld.MysticWorldTab);
	}
	
	@Override
	public void registerIcons(IconRegister iconRegister)
	{
	    itemIcon = iconRegister.registerIcon("MysticTextures:StaffAir");
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
