package mysticworld.entity;

import java.util.List;
import java.util.Random;

import mysticworld.MysticWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityChargeAir extends Entity {
	public EntityPlayer shootingEntity;
	private boolean inGround = false;
	private int xTile = -1;
	private int yTile = -1;
	private int zTile = -1;
	private int inTile = 0;
	private int ticksAlive;
	private int ticksInAir = 0;
	private float particleScale = 1.0f;
	private double powerHeight = 0.75D;

	public EntityChargeAir(World par1World) {
		super(par1World);
	}

	public EntityChargeAir(World par1World, EntityPlayer par2EntityPlayer, float pScale, double pHeight) {
		super(par1World);
		this.setSize(0.25F, 0.25F);
		this.setLocationAndAngles(par2EntityPlayer.posX, par2EntityPlayer.posY + par2EntityPlayer.getEyeHeight(), par2EntityPlayer.posZ, par2EntityPlayer.rotationYaw, par2EntityPlayer.rotationPitch);
		this.setPosition(this.posX, this.posY, this.posZ);
		this.motionX = -MathHelper.sin(this.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float) Math.PI);
		this.motionY = (-MathHelper.sin((this.rotationPitch) / 180.0F * (float) Math.PI));
		this.motionZ = MathHelper.cos(this.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float) Math.PI);
		this.shootingEntity = par2EntityPlayer;
		this.particleScale = pScale;
		this.powerHeight = pHeight;
	}

	@Override
	public boolean canBeCollidedWith() {
		return true;
	}

	@Override
	public float getBrightness(float par1) {
		return 1.0F;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getBrightnessForRender(float par1) {
		return 15728880;
	}

	@Override
	public float getCollisionBorderSize() {
		return 1.0F;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public float getShadowSize() {
		return 0.0F;
	}

	@Override
	public void onUpdate() {
		if (!this.worldObj.isRemote && (this.shootingEntity != null && this.shootingEntity.isDead || !this.worldObj.blockExists((int) this.posX, (int) this.posY, (int) this.posZ))) {
			this.setDead();
		} else {
			super.onUpdate();
			Vec3 vec3 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX, this.posY, this.posZ);
			Vec3 vec31 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
			MovingObjectPosition movingobjectposition = this.worldObj.rayTraceBlocks_do_do(vec3, vec31, true, true);
			vec3 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX, this.posY, this.posZ);
			vec31 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
			if (movingobjectposition != null) {
				vec31 = this.worldObj.getWorldVec3Pool().getVecFromPool(movingobjectposition.hitVec.xCoord, movingobjectposition.hitVec.yCoord, movingobjectposition.hitVec.zCoord);
			}
			Entity entity = null;
			List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
			double d0 = 0.0D;
			for (int j = 0; j < list.size(); ++j) {
				Entity entity1 = (Entity) list.get(j);
				if (entity1.canBeCollidedWith() && (!entity1.isEntityEqual(this.shootingEntity) || this.ticksInAir >= 25)) {
					float f = 0.3F;
					AxisAlignedBB axisalignedbb = entity1.boundingBox.expand(f, f, f);
					MovingObjectPosition movingobjectposition1 = axisalignedbb.calculateIntercept(vec3, vec31);
					if (movingobjectposition1 != null) {
						double d1 = vec3.distanceTo(movingobjectposition1.hitVec);
						if (d1 < d0 || d0 == 0.0D) {
							entity = entity1;
							d0 = d1;
						}
					}
				}
			}
			if (entity != null) {
				movingobjectposition = new MovingObjectPosition(entity);
			}
			if (movingobjectposition != null) {
				this.onImpact(movingobjectposition);
			}
			this.posX += this.motionX;
			this.posY += this.motionY;
			this.posZ += this.motionZ;
			float f2 = this.getMotionFactor();
			if (this.isInWater()) {
				for (int k = 0; k < 4; ++k) {
					float f3 = 0.25F;
					this.worldObj.spawnParticle("bubble", this.posX - this.motionX * f3, this.posY - this.motionY * f3, this.posZ - this.motionZ * f3, this.motionX, this.motionY, this.motionZ);
				}
				f2 = 0.8F;
			}
			MysticWorld.proxy.airFeetFX(this.worldObj, this.posX + (rand.nextDouble() / 2), this.posY + 0.5D, this.posZ + (rand.nextDouble() / 2), particleScale, 15);
			MysticWorld.proxy.airFeetFX(this.worldObj, this.posX + (rand.nextDouble() / 2), this.posY + 0.5D, this.posZ + (rand.nextDouble() / 2), particleScale, 15);
			this.setPosition(this.posX, this.posY, this.posZ);
		}
	}

	@Override
	protected void entityInit() {
	}

	protected float getMotionFactor() {
		return 0.95F;
	}

	protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
		Random rand = new Random();
		if (!this.worldObj.isRemote) {
			this.worldObj.playSoundEffect(this.posX, this.posY, this.posZ, "random.explode", 4.0F, (1.0F + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.2F) * 0.7F);
			if (par1MovingObjectPosition.entityHit != null) {
				double f3 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
				if (f3 > 0.0F) {
					par1MovingObjectPosition.entityHit.addVelocity(this.motionX * 2 * 0.6000000238418579D / f3, 1.0D + powerHeight, this.motionZ * 2 * 0.6000000238418579D / f3);
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
			}
			this.setDead();
		}
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
	}
}