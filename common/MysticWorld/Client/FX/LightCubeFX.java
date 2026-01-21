package mysticworld.client.fx;

import net.minecraft.world.World;

public class LightCubeFX extends PowerFX {
	public LightCubeFX(World world, double x, double y, double z) {
		super(world, x, y, z);
		this.setTexture("lightCube");
	}

	public LightCubeFX(World world, double x, double y, double z, double motionX, double motionY, double motionZ, float scale) {
		this(world, x, y, z);
		this.motionX *= 0.10000000149011612D;
		this.motionY *= 0.10000000149011612D;
		this.motionZ *= 0.10000000149011612D;
		this.motionX += motionX;
		this.motionY += motionY;
		this.motionZ += motionZ;
		this.particleRed = 1.0F;
		this.particleGreen = 1.0F;
		this.particleBlue = 1.0F;
		this.particleScale = scale;
		this.noClip = true;
		this.particleMaxAge = rand.nextInt(25);
	}
}
