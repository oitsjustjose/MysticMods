package mysticworld.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import java.util.List;

public class EntityCharge extends Entity{
    public EntityPlayer shootingEntity;
    protected int ticksInAir = 0;

    public EntityCharge(World par1World) {
        super(par1World);
    }

    public EntityCharge(World par1World, EntityPlayer par2EntityPlayer) {
        super(par1World);
        this.setSize(0.25F, 0.25F);
        this.setLocationAndAngles(par2EntityPlayer.posX, par2EntityPlayer.posY + par2EntityPlayer.getEyeHeight(), par2EntityPlayer.posZ, par2EntityPlayer.rotationYaw, par2EntityPlayer.rotationPitch);
        this.setPosition(this.posX, this.posY, this.posZ);
        this.motionX = -MathHelper.sin(this.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float) Math.PI);
        this.motionY = (-MathHelper.sin((this.rotationPitch) / 180.0F * (float) Math.PI));
        this.motionZ = MathHelper.cos(this.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float) Math.PI);
        this.shootingEntity = par2EntityPlayer;
    }

    @Override
    public void onUpdate() {
        if (!this.worldObj.isRemote && (this.shootingEntity != null && this.shootingEntity.isDead || !this.worldObj.blockExists((int) this.posX, (int) this.posY, (int) this.posZ))) {
            this.setDead();
        } else {
            ticksInAir++;
            super.onUpdate();
            Vec3 vec3 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
            Vec3 vec31 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
            MovingObjectPosition movingobjectposition = this.worldObj.func_147447_a(vec3, vec31, true, true, false);
            vec3 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
            vec31 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
            if (movingobjectposition != null) {
                vec31 = Vec3.createVectorHelper(movingobjectposition.hitVec.xCoord, movingobjectposition.hitVec.yCoord, movingobjectposition.hitVec.zCoord);
            }
            Entity entity = null;
            List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
            double d0 = 0.0D;
            for (int j = 0; j < list.size(); ++j) {
                Entity entity1 = (Entity) list.get(j);
                if (entity1.canBeCollidedWith() && (!entity1.isEntityEqual(this.shootingEntity) || this.ticksInAir >= 25)) {
                    AxisAlignedBB axisalignedbb = entity1.boundingBox.expand(0.3F, 0.3F, 0.3F);
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
            if (this.isInWater()) {
                for (int k = 0; k < 4; ++k) {
                    float f3 = 0.25F;
                    this.worldObj.spawnParticle("bubble", this.posX - this.motionX * f3, this.posY - this.motionY * f3, this.posZ - this.motionZ * f3, this.motionX, this.motionY, this.motionZ);
                }
            }
            chargeFX();
            this.setPosition(this.posX, this.posY, this.posZ);
        }
    }

    protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {}

    public void chargeFX(){}

    @Override
    @SideOnly(Side.CLIENT)
    public boolean isInRangeToRenderDist(double par1){
        return par1 > 1.0D && super.isInRangeToRenderDist(par1);
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
    public float getBrightness(float par1) {
        return 1.0F;
    }

    @Override
    protected void entityInit() {

    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound var1) {

    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound var1) {

    }

    @Override
    public boolean canBeCollidedWith() {
        return true;
    }
}
