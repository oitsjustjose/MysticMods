package MysticWorld.Items;

import MysticWorld.MysticWorld;
import MysticWorld.Entity.EntityChargeAir;
import net.minecraft.block.BlockCloth;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFlintAndSteel;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class ItemOrbFire extends ItemFlintAndSteel {

	public ItemOrbFire(int par1) 
	{
		super(par1);
        this.setMaxStackSize(1);
        this.setMaxDamage(500);
		this.setCreativeTab(MysticWorld.MysticWorldTab);
	}
	
    public boolean itemInteractionForEntity(ItemStack itemStack, EntityLiving entityLiving)
    {
        entityLiving.setFire(5);
        entityLiving.attackEntityFrom(DamageSource.magic, 7);
		
        itemStack.damageItem(1, entityLiving);   
        
    	return true;
    }
    
    public boolean onLeftClickEntity(ItemStack itemStack, EntityPlayer entityPlayer, Entity entity)
    {
        entity.setFire(5);
        entity.attackEntityFrom(DamageSource.magic, 7);
		
        itemStack.damageItem(1, entityPlayer);   
        
        return true;
    }
	
}
