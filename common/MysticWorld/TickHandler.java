package MysticWorld;

import java.util.EnumSet;
import java.util.List;

import MysticWorld.Blocks.BlockBush;
import MysticWorld.Blocks.BlockHandler;
import MysticWorld.Items.ItemHandler$1;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.common.IScheduledTickHandler;
import cpw.mods.fml.common.TickType;

public class TickHandler implements IScheduledTickHandler
{
	private EnumSet ticks;

	public TickHandler(){
		this.ticks = EnumSet.of(TickType.PLAYER);
	}

	public void tickStart(EnumSet<TickType> type, Object... tickData){
		EntityPlayer player = (EntityPlayer)tickData[0];
		World world = player.worldObj;
		InventoryPlayer inventory = player.inventory;
		
		if (inventory.hasItem(ItemHandler$1.fireOrb.itemID) && player.isBurning()){
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 20, 0));
		}
		
		if (inventory.hasItem(ItemHandler$1.airOrb.itemID) && player.getHeldItem() == new ItemStack(ItemHandler$1.airOrb)){
			player.fallDistance = 0.0F;
		}
    }

	public void tickEnd(EnumSet<TickType> type, Object... tickData){
		EntityPlayer player = (EntityPlayer)tickData[0];
		World world = player.worldObj;
		InventoryPlayer inventory = player.inventory;
	}
	
	public EnumSet ticks(){
		return this.ticks;
	}

	public String getLabel(){
		return "mystic world tick";
	}

	public int nextTickSpacing(){
		return 10;
	}
}