package mysticworld.entity;

import mysticworld.MysticWorld;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityChargeFire extends EntityCharge {
	public EntityChargeFire(World par1World) {
		super(par1World);
	}

	public EntityChargeFire(World par1World, EntityPlayer par2EntityPlayer) {
		super(par1World,par2EntityPlayer);
	}

	@Override
	public void chargeFX() {
        MysticWorld.proxy.fireFX(this.worldObj, this.posX + (rand.nextDouble() / 2), this.posY + 0.5D, this.posZ + (rand.nextDouble() / 2), 1.0F);
	}

    @Override
	protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
		if (!this.worldObj.isRemote) {
			this.worldObj.playSoundEffect(this.posX, this.posY, this.posZ, "random.explode", 4.0F, (1.0F + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.2F) * 0.7F);
			if (par1MovingObjectPosition.entityHit != null) {
				double f3 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
				if (f3 > 0.0F) {
					par1MovingObjectPosition.entityHit.addVelocity(this.motionX * 0.6000000238418579D / f3, 0.1D, this.motionZ * 0.6000000238418579D / f3);
				}
				if (!par1MovingObjectPosition.entityHit.isImmuneToFire()) {
					par1MovingObjectPosition.entityHit.setFire(5);
					par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.magic, 7);
				}
			} else {
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
				if (this.worldObj.isAirBlock(i, j, k)) {
					this.worldObj.setBlock(i, j, k, Blocks.fire);
				}
			}
			this.setDead();
		}
	}
}
