package mysticworld.entity;

import mysticworld.MysticWorld;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import java.util.Random;

public class EntityChargeEarth extends EntityCharge {
	public EntityChargeEarth(World par1World) {
		super(par1World);
	}

	public EntityChargeEarth(World par1World, EntityPlayer par2EntityPlayer) {
		super(par1World,par2EntityPlayer);
	}

	@Override
	public void chargeFX() {
        MysticWorld.proxy.earthFX(this.worldObj, this.posX + (rand.nextDouble() / 2), this.posY + 0.5D, this.posZ + (rand.nextDouble() / 2), 1.0F);
	}

    @Override
	protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
		Random rand = new Random();
		if (!this.worldObj.isRemote) {
			this.worldObj.playSoundEffect(this.posX, this.posY, this.posZ, "random.explode", 4.0F, (1.0F + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.2F) * 0.7F);
			if (par1MovingObjectPosition.entityHit != null) {
				double f3 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
				if (f3 > 0.0F) {
					par1MovingObjectPosition.entityHit.addVelocity(this.motionX * 0.6000000238418579D / f3, 0.1D, this.motionZ * 0.6000000238418579D / f3);
				}
				par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.magic, 20);
				this.worldObj.spawnEntityInWorld(new EntityItem(worldObj, this.posX, this.posY, this.posZ, new ItemStack(Items.wheat_seeds, rand.nextInt(4))));
				this.worldObj.spawnEntityInWorld(new EntityItem(worldObj, this.posX, this.posY, this.posZ, new ItemStack(Blocks.brown_mushroom, rand.nextInt(2))));
				this.worldObj.spawnEntityInWorld(new EntityItem(worldObj, this.posX, this.posY, this.posZ, new ItemStack(Items.apple, rand.nextInt(2))));
				this.worldObj.spawnEntityInWorld(new EntityItem(worldObj, this.posX, this.posY, this.posZ, new ItemStack(Blocks.sapling, rand.nextInt(2), 0)));
				this.worldObj.spawnEntityInWorld(new EntityItem(worldObj, this.posX, this.posY, this.posZ, new ItemStack(Items.pumpkin_seeds, rand.nextInt(2))));
				this.worldObj.spawnEntityInWorld(new EntityItem(worldObj, this.posX, this.posY, this.posZ, new ItemStack(Blocks.sapling, rand.nextInt(2), 1)));
				this.worldObj.spawnEntityInWorld(new EntityItem(worldObj, this.posX, this.posY, this.posZ, new ItemStack(Blocks.sapling, rand.nextInt(2), 2)));
				this.worldObj.spawnEntityInWorld(new EntityItem(worldObj, this.posX, this.posY, this.posZ, new ItemStack(Blocks.sapling, rand.nextInt(2), 3)));
				this.worldObj.spawnEntityInWorld(new EntityItem(worldObj, this.posX, this.posY, this.posZ, new ItemStack(Items.melon_seeds, rand.nextInt(3))));
			}/* else {
				int i = par1MovingObjectPosition.blockX;
				int j = par1MovingObjectPosition.blockY;
				int k = par1MovingObjectPosition.blockZ;
				switch (par1MovingObjectPosition.sideHit) {
				case 0:
					--j;
					break;
				case 1:
					++j;
					break;
				case 2:
					--k;
					break;
				case 3:
					++k;
					break;
				case 4:
					--i;
					break;
				case 5:
					++i;
				}
			}*/
			this.setDead();
		}
	}
}
