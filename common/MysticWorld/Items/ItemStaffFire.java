package mysticworld.items;

import mysticworld.MysticWorld;
import mysticworld.entity.EntityChargeFire;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ItemStaffFire extends ItemStaff {
	public ItemStaffFire() {
		super();
	}

	@Override
	public boolean itemInteractionForEntity(ItemStack itemStack, EntityPlayer entityPlayer, EntityLivingBase entityLiving) {
		if (entityPlayer.isSneaking()) {
			entityLiving.setFire(5);
			entityLiving.attackEntityFrom(DamageSource.magic, 7);
			itemStack.damageItem(1, entityLiving);
			return true;
		}
		return true;
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
						ItemStack result = FurnaceRecipes.smelting().getSmeltingResult(new ItemStack(world.getBlock(i, j, k), 1, world.getBlockMetadata(i, j, k)));
						if (!world.isRemote && result != null) {
							Item id = result.getItem();
							int meta = result.getItemDamage();
							world.playSoundEffect(i + 0.5D, j + 0.5D, k + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
							world.setBlockToAir(i, j, k);
							world.spawnEntityInWorld(new EntityItem(world, i, j, k, new ItemStack(id, 1, meta)));
							itemStack.damageItem(1, entityPlayer);
						}
					}
				}
			}
		} else {
			world.playAuxSFXAtEntity(null, 1009, (int) entityPlayer.posX, (int) entityPlayer.posY, (int) entityPlayer.posZ, 0);
			if (!world.isRemote) {
				world.spawnEntityInWorld(new EntityChargeFire(world, entityPlayer));
				itemStack.damageItem(1, entityPlayer);
			}
			return itemStack;
		}
		return itemStack;
	}

	@Override
	public boolean onLeftClickEntity(ItemStack itemStack, EntityPlayer entityPlayer, Entity entity) {
		entity.setFire(5);
		entity.attackEntityFrom(DamageSource.magic, 7);
		itemStack.damageItem(1, entityPlayer);
		return true;
	}

	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int par4, boolean par5) {
		if (entity instanceof EntityPlayer && par5) {
            ((EntityPlayer)entity).addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 20, 0));
			MysticWorld.proxy.fireFX(world, (entity.posX - 0.5D) + itemRand.nextDouble(), entity.posY, (entity.posZ - 0.5D) + itemRand.nextDouble(), 1.0F);
		}
	}
}
