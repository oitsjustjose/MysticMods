package MysticWorld;

import java.util.EnumSet;
import java.util.List;
import java.util.Random;

import MysticWorld.Blocks.BlockBush;
import MysticWorld.Blocks.BlockHandler;
import MysticWorld.Blocks.BlockPlatform;
import MysticWorld.Items.ItemHandler$1;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
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
	
	public static final Enchantment[] enchantmentsPick = { Enchantment.efficiency, Enchantment.fortune, Enchantment.silkTouch, Enchantment.unbreaking };
	
	public TickHandler(){
		this.ticks = EnumSet.of(TickType.PLAYER);
	}

	public void tickStart(EnumSet<TickType> type, Object... tickData){
		Random rand = new Random();
		EntityPlayer player = (EntityPlayer)tickData[0];
		World world = player.worldObj;
		InventoryPlayer inventory = player.inventory;
		ItemStack itemstack = inventory.getCurrentItem();
		
		pillarTick(player, world, inventory, rand);
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
		return 20;
	}
	
	private static void pillarTick(EntityPlayer player, World world, InventoryPlayer inventory, Random rand)
	{
		ItemStack itemStack = inventory.getCurrentItem();
		
		int blockX = (int)player.posX - 1;
		int blockY = (int)(player.posY - 0.15D);
		int blockZ = (int)player.posZ - 1;
		
		int blockId = world.getBlockId(blockX, blockY, blockZ);
		int blockMeta = world.getBlockMetadata(blockX, blockY, blockZ);
		
    	if (blockId == BlockHandler.pillarPlatform.blockID)
    	{	
    			switch (blockMeta)
        		{
        			//food
        			case 0:
        				int foodLevel = player.getFoodStats().getFoodLevel();
        				player.getFoodStats().setFoodLevel((int)((double)foodLevel + 0.5D));
                    	player.getFoodStats().setFoodSaturationLevel(20);
        				break;
        			//regeneration
        			case 1:
        				player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 6000, 4));
        				break;
        			//speed
        			case 2:
        				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 6000, 4));
        				break;
        			//haste
        			case 3:
        				player.addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), 6000, 4));
        				break;
        			//resistance
        			case 4:
        				player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 6000, 4));
        				break;
        			//jump boost
        			case 5:
        				player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 6000, 4));
        				break;
        			//fire
        			case 6:
        				player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 6000, 4));
        				break;
        			//enchanter
        			case 7:
         				if (itemStack != null && (itemStack.itemID == Item.pickaxeWood.itemID || itemStack.itemID == Item.pickaxeStone.itemID ||
         				itemStack.itemID == Item.pickaxeIron.itemID || itemStack.itemID == Item.pickaxeGold.itemID || itemStack.itemID == Item.pickaxeDiamond.itemID))
         				{
         					if (itemStack.isItemEnchanted() != true && player.experienceLevel >= 10)
         					{
         						player.experienceLevel -= 10;
         						itemStack.addEnchantment(enchantmentsPick[rand.nextInt(3)], rand.nextInt(4) + 1);
         					}
         				}
        				break;
        			default:
        				break;
    		}
    	}
	}
}