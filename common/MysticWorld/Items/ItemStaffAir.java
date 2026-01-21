package mysticworld.items;

import mysticworld.MysticWorld;
import mysticworld.entity.EntityChargeAir;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemStaffAir extends ItemStaff {
	public ItemStaffAir() {
		super();
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
        player.setItemInUse(itemStack, this.getMaxItemUseDuration(itemStack));
		return itemStack;
	}

    @Override
    public int getMaxItemUseDuration(ItemStack itemStack){
        return 5*20;
    }

    @Override
    public void onPlayerStoppedUsing(ItemStack itemStack, World world, EntityPlayer player, int time) {
        int charge = getMaxItemUseDuration(itemStack)-time;
        if (charge > 0) {
            world.playAuxSFXAtEntity(player, 1009, (int) player.posX, (int) player.posY, (int) player.posZ, 0);
            if (!world.isRemote)
                world.spawnEntityInWorld(new EntityChargeAir(world, player, 1.0f + charge * (5.0f * (1 / (float) getMaxItemUseDuration(itemStack))), charge * (2.5D * (1.0D / getMaxItemUseDuration(itemStack)))));
            itemStack.damageItem(1, player);
        }
    }

	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int par4, boolean current) {
		if (current) {
            entity.fallDistance = 0.0F;
		}
	}

    @Override
    public void onUsingTick(ItemStack stack, EntityPlayer player, int count){
        chargeEffect(stack, player.worldObj, player, getMaxItemUseDuration(stack) - count);
    }

	private void chargeEffect(ItemStack itemStack, World world, Entity player, int charge) {
		double particleX = (player.posX - 0.5D) + itemRand.nextDouble();
		double particleY = player.posY + (charge * player.height / getMaxItemUseDuration(itemStack));
		double particleZ = (player.posZ - 0.5D) + itemRand.nextDouble();
		float particleScale = charge * (5.0f * (1 / (float) getMaxItemUseDuration(itemStack)));
        MysticWorld.proxy.airFeetFX(world, particleX, particleY, particleZ, 1.0f + particleScale, 15);
	}
}
