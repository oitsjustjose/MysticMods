package mysticworld.items;

import mysticworld.MysticWorld;
import mysticworld.entity.EntityChargeAir;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import org.lwjgl.input.Mouse;

public class ItemStaffAir extends ItemStaff {
	public ItemStaffAir(int id) {
		super(id);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
		if (itemStack.stackTagCompound == null)
			itemStack.setTagCompound(new NBTTagCompound());
		if (itemStack.stackTagCompound.getBoolean("charging") == false) {
			itemStack.stackTagCompound.setBoolean("charging", true);
		}
		return itemStack;
	}

	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int par4, boolean par5) {
		if (itemStack.stackTagCompound == null)
			itemStack.setTagCompound(new NBTTagCompound());
		EntityPlayer player = (EntityPlayer) entity;
		ItemStack currentItem = player.inventory.getCurrentItem();
		itemStack.stackTagCompound.setInteger("maxChargeTime", 3 * 20);
		if (currentItem != null) {
			if (currentItem.itemID == itemStack.itemID) {
				player.fallDistance = 0.0F;
				chargeEffect(itemStack, world, player);
				if (!Mouse.isButtonDown(1)) {
					if (itemStack.stackTagCompound.getInteger("chargeTime") > 0) {
						if (!world.isRemote) {
							world.playAuxSFXAtEntity((EntityPlayer) null, 1009, (int) player.posX, (int) player.posY, (int) player.posZ, 0);
							world.spawnEntityInWorld(new EntityChargeAir(world, player, 1.0f + ((itemStack.stackTagCompound.getInteger("chargeTime")) * (5.0f * (1 / (float) itemStack.stackTagCompound
									.getInteger("maxChargeTime")))), (itemStack.stackTagCompound.getInteger("chargeTime")) * (2.5D * (1.0D / itemStack.stackTagCompound.getInteger("maxChargeTime")))));
							itemStack.damageItem(1, player);
						}
					}
					resetData(itemStack);
				} else {
					if (itemStack.stackTagCompound.getBoolean("charging") == true) {
						incrementData(itemStack);
					}
				}
			}
		} else {
			resetData(itemStack);
		}
		if (itemStack.stackTagCompound.getInteger("chargeTime") > itemStack.stackTagCompound.getInteger("maxChargeTime")) {
			itemStack.stackTagCompound.setInteger("chargeTime", itemStack.stackTagCompound.getInteger("maxChargeTime"));
		}
	}

	private void chargeEffect(ItemStack itemStack, World world, EntityPlayer player) {
		double particleX = (player.posX - 0.5D) + rand.nextDouble();
		double particleY = player.posY + (player.height / itemStack.stackTagCompound.getInteger("maxChargeTime") * itemStack.stackTagCompound.getInteger("chargeTime"));
		double particleZ = (player.posZ - 0.5D) + rand.nextDouble();
		float particleScale = ((itemStack.stackTagCompound.getInteger("chargeTime")) * (5.0f * (1 / (float) itemStack.stackTagCompound.getInteger("maxChargeTime"))));
		if (!world.isRemote)
			MysticWorld.proxy.airFeetFX(world, particleX, particleY, particleZ, 1.0f + particleScale, 15);
	}

	private void incrementData(ItemStack itemStack) {
		itemStack.stackTagCompound.setInteger("chargeTime", itemStack.stackTagCompound.getInteger("chargeTime") + 1);
	}

	private void resetData(ItemStack itemStack) {
		itemStack.stackTagCompound.setInteger("chargeTime", 0);
		itemStack.stackTagCompound.setBoolean("charging", false);
	}
}
