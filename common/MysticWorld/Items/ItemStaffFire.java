package MysticWorld.Items;

import org.lwjgl.input.Keyboard;

import MysticWorld.MysticWorld;
import MysticWorld.Blocks.BlockHandler;
import MysticWorld.Entity.EntityChargeFire;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
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
	
    public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int par4, int par5, int par6, int par7, float par8, float par9, float par10){
		if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
		{
			if (par7 == 0)
	        {
	            --par5;
	        }

	        if (par7 == 1)
	        {
	            ++par5;
	        }

	        if (par7 == 2)
	        {
	            --par6;
	        }

	        if (par7 == 3)
	        {
	            ++par6;
	        }

	        if (par7 == 4)
	        {
	            --par4;
	        }

	        if (par7 == 5)
	        {
	            ++par4;
	        }

	        if (!entityPlayer.canPlayerEdit(par4, par5, par6, par7, itemStack))
	        {
	            return false;
	        }
	        else
	        {
	            int i1 = world.getBlockId(par4, par5, par6);

	            if (i1 == 0)
	            {
	                world.playSoundEffect((double)par4 + 0.5D, (double)par5 + 0.5D, (double)par6 + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
	                world.setBlock(par4, par5, par6, Block.fire.blockID);
	            }

	            itemStack.damageItem(1, entityPlayer);
	            return true;
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
	        
	        return true;
		}
	}

}
