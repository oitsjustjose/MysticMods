package MysticWorld.Items;

import MysticWorld.MysticWorld;
import MysticWorld.Entity.EntityChargeAir;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemOrbEarth extends Item {

	public ItemOrbEarth(int par1) 
	{
		super(par1);
        this.setMaxStackSize(1);
        this.setMaxDamage(64);
		this.setCreativeTab(MysticWorld.MysticWorldTab);
	}

	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer)
	{
		world.playSoundEffect(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
	
        if (!world.isRemote)
        {
            itemStack.damageItem(1, entityPlayer);
        }
        
        return itemStack;
	}
	
}
