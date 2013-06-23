package MysticWorld.Items;

import MysticWorld.MysticWorld;
import MysticWorld.Entity.EntityChargeEarth;
import MysticWorld.Entity.EntityChargeFire;
import MysticWorld.Entity.EntityChargeWater;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.entity.player.UseHoeEvent;

public class ItemStaffWater extends Item {

	public ItemStaffWater(int id) {
		super(id);
		this.setMaxStackSize(1);
		this.setMaxDamage(64);
		this.setCreativeTab(MysticWorld.MysticWorldTab);
	}
	
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
             itemIcon = iconRegister.registerIcon("MysticTextures" + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
	
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer){
		world.playAuxSFXAtEntity((EntityPlayer)null, 1009, (int)entityPlayer.posX, (int)entityPlayer.posY, (int)entityPlayer.posZ, 0);
	
        if (!world.isRemote)
        {
            world.spawnEntityInWorld(new EntityChargeWater(world, entityPlayer));
            
            itemStack.damageItem(1, entityPlayer);
        }
        
        return itemStack;
	}
}