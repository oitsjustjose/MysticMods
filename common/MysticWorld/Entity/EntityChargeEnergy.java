package mysticworld.entity;

import mysticworld.MysticWorld;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityChargeEnergy extends EntityCharge {
	public EntityChargeEnergy(World par1World) {
		super(par1World);
	}

	public EntityChargeEnergy(World par1World, EntityPlayer par2EntityPlayer) {
		super(par1World,par2EntityPlayer);
	}

	@Override
	public void chargeFX() {
        MysticWorld.proxy.energyFX(this.worldObj, this.posX + (rand.nextDouble() / 2), this.posY + 0.5D, this.posZ + (rand.nextDouble() / 2), 1.0F);
	}

    @Override
	protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
		int i = par1MovingObjectPosition.blockX;
		int j = par1MovingObjectPosition.blockY;
		int k = par1MovingObjectPosition.blockZ;
		if (!this.worldObj.isRemote) {
			if (par1MovingObjectPosition.entityHit != null) {
				double f3 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
				if (f3 > 0.0F) {
					par1MovingObjectPosition.entityHit.addVelocity(this.motionX * 1 * 0.6000000238418579D / f3, 0.1D, this.motionZ * 1 * 0.6000000238418579D / f3);
				}
				worldObj.addWeatherEffect(new EntityLightningBolt(worldObj, par1MovingObjectPosition.entityHit.posX, par1MovingObjectPosition.entityHit.posY, par1MovingObjectPosition.entityHit.posZ));
			} else {
				worldObj.addWeatherEffect(new EntityLightningBolt(worldObj, i, j, k));
				/*switch (par1MovingObjectPosition.sideHit) {
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
				}*/
			}
			this.setDead();
		}
	}
}