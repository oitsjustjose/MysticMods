package mysticworld.items;

import mysticworld.MysticWorld;
import mysticworld.entity.EntityChargeEarth;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ItemStaffEarth extends ItemStaff {
	public ItemStaffEarth() {
		super();
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
		if (entityPlayer.isSneaking()) {
			MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(world, entityPlayer, true);
			if (movingobjectposition == null) {
				return itemStack;
			} else {
				if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
					int i = movingobjectposition.blockX;
					int j = movingobjectposition.blockY;
					int k = movingobjectposition.blockZ;
					if (!world.canMineBlock(entityPlayer, i, j, k)) {
						return itemStack;
					}
					if (!entityPlayer.canPlayerEdit(i, j, k, movingobjectposition.sideHit, itemStack)) {
						return itemStack;
					} else {
						if (applyBonemeal(itemStack, world, i, j, k, entityPlayer)) {
							if (!world.isRemote) {
								world.playAuxSFX(2005, i, j, k, 0);
							}
							return itemStack;
						}
					}
				}
			}
		} else {
			world.playAuxSFXAtEntity(null, 1009, (int) entityPlayer.posX, (int) entityPlayer.posY, (int) entityPlayer.posZ, 0);
			if (!world.isRemote) {
				world.spawnEntityInWorld(new EntityChargeEarth(world, entityPlayer));
				itemStack.damageItem(1, entityPlayer);
			}
			return itemStack;
		}
		return itemStack;
	}

	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int par4, boolean par5) {
		if (par5) {
			MysticWorld.proxy.earthFX(world, (entity.posX - 0.5D) + itemRand.nextDouble(), entity.posY, (entity.posZ - 0.5D) + itemRand.nextDouble(), 1.0F);
		}
	}

	public static boolean applyBonemeal(ItemStack itemStack, World par1World, int par2, int par3, int par4, EntityPlayer player) {
		return ItemOrbEarth.applyBonemeal(itemStack, par1World, par2, par3, par4, player);
	}
}
