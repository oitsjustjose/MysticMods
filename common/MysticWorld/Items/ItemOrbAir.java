package mysticworld.items;

import mysticworld.MysticWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ItemOrbAir extends ItemOrb {
	public ItemOrbAir() {
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
            if (player.onGround) {
                world.playSoundEffect(player.posX, player.posY, player.posZ, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
                if(!world.isRemote){
                    player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 50, charge*25/getMaxItemUseDuration(itemStack)));
                }
                itemStack.damageItem(1, player);
            }
            resetData(itemStack);
        }
    }

	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int par4, boolean par5) {
        if (par5) {
            entity.fallDistance = 0.0F;
            chargeEffect(itemStack, world, entity);
        }
	}

    @Override
    public void onUsingTick(ItemStack stack, EntityPlayer player, int count){
        if (stack.stackTagCompound == null){
            stack.setTagCompound(new NBTTagCompound());
        }
        incrementData(stack, getMaxItemUseDuration(stack) - count);
        spiralEffect(stack, player.worldObj, player, getMaxItemUseDuration(stack) - count);
    }

	private void chargeEffect(ItemStack itemStack, World world, Entity player) {
		double particleX = (player.posX - 0.5D) + itemRand.nextDouble();
		double particleZ = (player.posZ - 0.5D) + itemRand.nextDouble();
        MysticWorld.proxy.airFeetFX(world, particleX, player.posY, particleZ, 1.0f, 15);
	}

	private void incrementData(ItemStack itemStack, int charge) {
		itemStack.stackTagCompound.setFloat("angle", itemStack.stackTagCompound.getFloat("angle") + 0.2f);
		itemStack.stackTagCompound.setDouble("radius", charge * 0.025D);
        if (itemStack.stackTagCompound.getDouble("radius") > 2.5D) {
            itemStack.stackTagCompound.setDouble("radius", 2.5D);
        }
        if (itemStack.stackTagCompound.getFloat("angle") > 6.0f) {
            itemStack.stackTagCompound.setFloat("angle", 0.0f);
        }
	}

	private void resetData(ItemStack itemStack) {
		itemStack.stackTagCompound.setFloat("angle", 0);
		itemStack.stackTagCompound.setDouble("radius", 0);
	}

	private void spiralEffect(ItemStack itemStack, World world, EntityPlayer player, int charge) {
		double particleX = player.posX + (MathHelper.cos(itemStack.stackTagCompound.getFloat("angle"))) * itemStack.stackTagCompound.getDouble("radius");
		double particleY = player.posY;
		double particleZ = player.posZ + (MathHelper.sin(itemStack.stackTagCompound.getFloat("angle"))) * itemStack.stackTagCompound.getDouble("radius");
		float particleScale = charge * 5.0f / getMaxItemUseDuration(itemStack);
        MysticWorld.proxy.airFeetFX(world, particleX, particleY, particleZ, 1.0f + particleScale, 15);
	}
}
