package mysticworld.items;

import mysticworld.MysticWorld;
import mysticworld.entity.EntityChargeWater;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ItemStaffWater extends ItemStaff {
	public ItemStaffWater() {
		super();
		this.setMaxStackSize(1);
		this.setMaxDamage(200);
		this.setCreativeTab(MysticWorld.MysticWorldTab);
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
					}
					if (world.getBlock(i, j, k).getMaterial() == Material.water && world.getBlockMetadata(i, j, k) == 0) {
						world.playSoundEffect(i + 0.5D, j + 0.5D, k + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
						world.setBlockToAir(i, j, k);
						itemStack.damageItem(1, entityPlayer);
						return itemStack;
					} else {
						if (movingobjectposition.sideHit == 0) {
							--j;
						}
						if (movingobjectposition.sideHit == 1) {
							++j;
						}
						if (movingobjectposition.sideHit == 2) {
							--k;
						}
						if (movingobjectposition.sideHit == 3) {
							++k;
						}
						if (movingobjectposition.sideHit == 4) {
							--i;
						}
						if (movingobjectposition.sideHit == 5) {
							++i;
						}
						if (!entityPlayer.canPlayerEdit(i, j, k, movingobjectposition.sideHit, itemStack)) {
							return itemStack;
						} else {
							Block i1 = world.getBlock(i, j, k);
							if (i1 == Blocks.air) {
								world.playSoundEffect(i + 0.5D, j + 0.5D, k + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
								world.setBlock(i, j, k, Blocks.flowing_water);
								itemStack.damageItem(1, entityPlayer);
							}
							return itemStack;
						}
					}
				}
				return itemStack;
			}
		} else {
			world.playAuxSFXAtEntity(null, 1009, (int) entityPlayer.posX, (int) entityPlayer.posY, (int) entityPlayer.posZ, 0);
			if (!world.isRemote) {
				world.spawnEntityInWorld(new EntityChargeWater(world, entityPlayer));
				itemStack.damageItem(1, entityPlayer);
			}
			return itemStack;
		}
	}

	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int par4, boolean par5) {
		if (par5) {
			MysticWorld.proxy.waterFX(world, (entity.posX - 0.5D) + itemRand.nextDouble(), entity.posY, (entity.posZ - 0.5D) + itemRand.nextDouble(), 1.0F);
		}
	}
}