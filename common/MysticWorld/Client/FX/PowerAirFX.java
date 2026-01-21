package mysticworld.client.fx;

import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class PowerAirFX extends PowerFX {
	public PowerAirFX(World world, double x, double y, double z) {
		super(world, x, y, z);
		this.setTexture("air");
	}

	public PowerAirFX(World world, double x, double y, double z, double motionX, double motionY, double motionZ, float rotPitch, float rotYaw) {
		this(world, x, y, z);
		this.motionX = -MathHelper.sin(this.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float) Math.PI);
		this.motionY = (-MathHelper.sin((this.rotationPitch) / 180.0F * (float) Math.PI));
		this.motionZ = MathHelper.cos(this.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float) Math.PI);
		this.particleRed = 1.0F;
		this.particleGreen = 1.0F;
		this.particleBlue = 1.0F;
		this.particleScale = 1.0F;
		this.noClip = true;
		this.particleMaxAge = 120;
		this.rotationPitch = rotPitch;
		this.rotationYaw = rotYaw;
	}

	public PowerAirFX(World world, double x, double y, double z, float scale, int age) {
		this(world, x, y, z);
		this.motionX += motionX;
		this.motionY += motionY;
		this.motionZ += motionZ;
		this.motionX *= 0.019999999552965164D;
		this.motionY *= 0.019999999552965164D;
		this.motionZ *= 0.019999999552965164D;
		this.particleRed = 1.0F;
		this.particleGreen = 1.0F;
		this.particleBlue = 1.0F;
		this.particleScale = scale;
		this.noClip = true;
		this.particleMaxAge = age;
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		this.posX += this.motionX;
		this.posY += this.motionY;
		this.posZ += this.motionZ;
		this.setPosition(this.posX, this.posY, this.posZ);
	}
}