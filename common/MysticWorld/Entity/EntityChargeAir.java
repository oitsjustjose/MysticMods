package mysticworld.entity;

import mysticworld.MysticWorld;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityChargeAir extends EntityCharge {
	private float particleScale = 1.0f;
	private double powerHeight = 0.75D;

	public EntityChargeAir(World par1World) {
		super(par1World);
	}

	public EntityChargeAir(World par1World, EntityPlayer par2EntityPlayer, float pScale, double pHeight) {
		super(par1World,par2EntityPlayer);
		this.particleScale = pScale;
		this.powerHeight = pHeight;
	}

	@Override
	public void chargeFX() {
        MysticWorld.proxy.airFeetFX(this.worldObj, this.posX + (rand.nextDouble() / 2), this.posY + 0.5D, this.posZ + (rand.nextDouble() / 2), particleScale, 15);
        MysticWorld.proxy.airFeetFX(this.worldObj, this.posX + (rand.nextDouble() / 2), this.posY + 0.5D, this.posZ + (rand.nextDouble() / 2), particleScale, 15);
	}

    @Override
	protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
		if (!this.worldObj.isRemote) {
			this.worldObj.playSoundEffect(this.posX, this.posY, this.posZ, "random.explode", 4.0F, (1.0F + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.2F) * 0.7F);
			if (par1MovingObjectPosition.entityHit != null) {
				double f3 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
				if (f3 > 0.0F) {
					par1MovingObjectPosition.entityHit.addVelocity(this.motionX * 2 * 0.6000000238418579D / f3, 1.0D + powerHeight, this.motionZ * 2 * 0.6000000238418579D / f3);
				}
			} /*else {
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