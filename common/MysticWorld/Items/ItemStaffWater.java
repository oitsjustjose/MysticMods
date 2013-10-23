package mysticworld.items;

import mysticworld.MysticWorld;
import mysticworld.entity.EntityChargeWater;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import org.lwjgl.input.Keyboard;

public class ItemStaffWater extends ItemStaff {
	public ItemStaffWater(int id) {
		super(id);
		this.setMaxStackSize(1);
		this.setMaxDamage(200);
		this.setCreativeTab(MysticWorld.MysticWorldTab);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
		if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) {
			MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(world, entityPlayer, true);
			if (movingobjectposition == null) {
				return itemStack;
			} else {
				if (movingobjectposition.typeOfHit == EnumMovingObjectType.TILE) {
					int i = movingobjectposition.blockX;
					int j = movingobjectposition.blockY;
					int k = movingobjectposition.blockZ;
					if (!world.canMineBlock(entityPlayer, i, j, k)) {
						return itemStack;
					}
					if (!entityPlayer.canPlayerEdit(i, j, k, movingobjectposition.sideHit, itemStack)) {
						return itemStack;
					}
					if (world.getBlockMaterial(i, j, k) == Material.water && world.getBlockMetadata(i, j, k) == 0) {
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
							int i1 = world.getBlockId(i, j, k);
							if (i1 == 0) {
								world.playSoundEffect(i + 0.5D, j + 0.5D, k + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
								world.setBlock(i, j, k, Block.waterMoving.blockID);
								itemStack.damageItem(1, entityPlayer);
							}
							return itemStack;
						}
					}
				}
				return itemStack;
			}
		} else {
			world.playAuxSFXAtEntity((EntityPlayer) null, 1009, (int) entityPlayer.posX, (int) entityPlayer.posY, (int) entityPlayer.posZ, 0);
			if (!world.isRemote) {
				world.spawnEntityInWorld(new EntityChargeWater(world, entityPlayer));
				itemStack.damageItem(1, entityPlayer);
			}
			return itemStack;
		}
	}

	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int par4, boolean par5) {
		EntityPlayer player = (EntityPlayer) entity;
		ItemStack currentItem = player.inventory.getCurrentItem();
		if (!world.isRemote) {
			if (currentItem != null) {
				if (currentItem.itemID == itemStack.itemID) {
					MysticWorld.proxy.waterFX(world, (player.posX - 0.5D) + rand.nextDouble(), player.posY, (player.posZ - 0.5D) + rand.nextDouble(), 1.0F);
				}
			}
		}
	}
}