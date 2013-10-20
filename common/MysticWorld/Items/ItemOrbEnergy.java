package mysticworld.items;

import mysticworld.MysticWorld;
import mysticworld.blocks.BlockHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemOrbEnergy extends ItemOrb {
	public ItemOrbEnergy(int id) {
		super(id);
	}

	@Override
	public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
		if (par7 == 0) {
			--par5;
		}
		if (par7 == 1) {
			++par5;
		}
		if (par7 == 2) {
			--par6;
		}
		if (par7 == 3) {
			++par6;
		}
		if (par7 == 4) {
			--par4;
		}
		if (par7 == 5) {
			++par4;
		}
		if (!entityPlayer.canPlayerEdit(par4, par5, par6, par7, itemStack)) {
			return false;
		} else {
			int i1 = world.getBlockId(par4, par5, par6);
			if (i1 == 0) {
				world.playSoundEffect(par4 + 0.5D, par5 + 0.5D, par6 + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
				world.setBlock(par4, par5, par6, BlockHandler.lightCube.blockID);
			}
			itemStack.damageItem(1, entityPlayer);
			return true;
		}
	}

	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int par4, boolean par5) {
		EntityPlayer player = (EntityPlayer) entity;
		ItemStack currentItem = player.inventory.getCurrentItem();
		if (!world.isRemote) {
			if (currentItem != null) {
				if (currentItem.itemID == itemStack.itemID) {
					player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 20, 2));
					MysticWorld.proxy.energyFX(world, (player.posX - 0.5D) + rand.nextDouble(), player.posY, (player.posZ - 0.5D) + rand.nextDouble(), 1.0F);
				}
			}
		}
	}
}
