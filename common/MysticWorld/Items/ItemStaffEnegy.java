package MysticWorld.Items;

import org.lwjgl.input.Keyboard;

import MysticWorld.MysticWorld;
import MysticWorld.Blocks.BlockHandler;
import MysticWorld.Entity.EntityChargeEnergy;
import MysticWorld.Entity.EntityChargeFire;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemStaffEnegy extends Item{
	
	public ItemStaffEnegy(int id) {
		super(id);
        this.setMaxStackSize(1);
        this.setMaxDamage(200);
		this.setCreativeTab(MysticWorld.MysticWorldTab);
	}
	
	@Override
	public void registerIcons(IconRegister iconRegister)
	{
	    itemIcon = iconRegister.registerIcon("MysticTextures:StaffEnergy");
	}
	
	public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int par4, int par5, int par6, int par7, float par8, float par9, float par10){
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
                world.setBlock(par4, par5, par6, BlockHandler.lightCube.blockID);
            }

            itemStack.damageItem(1, entityPlayer);
            return true;
        }
	}
	
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer)
	{
		world.playAuxSFXAtEntity((EntityPlayer)null, 1009, (int)entityPlayer.posX, (int)entityPlayer.posY, (int)entityPlayer.posZ, 0);
		
		if (!world.isRemote)
		{
			world.spawnEntityInWorld(new EntityChargeEnergy(world, entityPlayer));
        
			itemStack.damageItem(1, entityPlayer);
		}
    
		return itemStack;
	}

}
