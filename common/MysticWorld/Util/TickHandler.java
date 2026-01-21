package mysticworld.util;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import mysticworld.blocks.BlockHandler;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.Random;

public class TickHandler {
	public static final Enchantment[] enchantmentsPick = { Enchantment.efficiency, Enchantment.fortune, Enchantment.silkTouch, Enchantment.unbreaking };

	@SubscribeEvent
	public void tickStart(TickEvent.PlayerTickEvent event) {
        if(event.phase == TickEvent.Phase.START && event.side.isServer() && event.player.worldObj.getWorldTime()%20==0)
		    pillarTick(event.player, event.player.worldObj, event.player.getRNG());
	}

	private static void pillarTick(EntityPlayer player, World world, Random rand) {
		ItemStack itemStack = player.inventory.getCurrentItem();
		int blockX = (int) player.posX - 1;
		int blockY = (int) (player.posY - 0.15D);
		int blockZ = (int) player.posZ - 1;
		Block blockId = world.getBlock(blockX, blockY, blockZ);
		int blockMeta = world.getBlockMetadata(blockX, blockY, blockZ);
		if (blockId == BlockHandler.pillarPlatform) {
			switch (blockMeta) {
			//food
			case 0:
				int foodLevel = player.getFoodStats().getFoodLevel();
				player.getFoodStats().setFoodLevel((int) (foodLevel + 0.5D));
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
				if (itemStack != null
						&& (itemStack.getItem() == Items.wooden_pickaxe || itemStack.getItem() == Items.stone_pickaxe || itemStack.getItem() == Items.iron_pickaxe
								|| itemStack.getItem() == Items.golden_pickaxe || itemStack.getItem() == Items.diamond_pickaxe)) {
					if (!itemStack.isItemEnchanted() && player.experienceLevel >= 10) {
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