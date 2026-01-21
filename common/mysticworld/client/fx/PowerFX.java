package mysticworld.client.fx;

import cpw.mods.fml.client.FMLClientHandler;
import mysticworld.client.ClientProxy;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

public class PowerFX extends EntityFX {
	private ResourceLocation textureFX;

	public PowerFX(World world, double x, double y, double z) {
		super(world, x, y, z);
	}

	public PowerFX(World world, double x, double y, double z, float scale) {
		super(world, x, y, z);
		this.motionX *= 0.019999999552965164D;
		this.motionY *= 0.019999999552965164D;
		this.motionZ *= 0.019999999552965164D;
		this.motionX += motionX;
		this.motionY += motionY;
		this.motionZ += motionZ;
		this.particleRed = 1.0F;
		this.particleGreen = 1.0F;
		this.particleBlue = 1.0F;
		this.particleScale = scale;
		this.noClip = true;
		this.particleMaxAge = 15;
	}

	@Override
	public void onUpdate() {
		this.prevPosX = this.posX;
		this.prevPosY = this.posY;
		this.prevPosZ = this.posZ;
		if (this.particleAge++ >= this.particleMaxAge) {
			this.setDead();
		}
		this.motionY += 0.004D;
		this.moveEntity(this.motionX, this.motionY, this.motionZ);
		if (this.posY == this.prevPosY) {
			this.motionX *= 1.1D;
			this.motionZ *= 1.1D;
		}
		this.motionX *= 0.9599999785423279D;
		this.motionY *= 0.9599999785423279D;
		this.motionZ *= 0.9599999785423279D;
		if (this.onGround) {
			this.motionX *= 0.699999988079071D;
			this.motionZ *= 0.699999988079071D;
		}
	}

	@Override
	public void renderParticle(Tessellator tessellator, float par2, float par3, float par4, float par5, float par6, float par7) {
		tessellator.draw();
		GL11.glPushMatrix();
		GL11.glDepthMask(false);
		GL11.glEnable(3042);
		GL11.glBlendFunc(770, 1);
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(textureFX);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
		float scale = 0.1F * this.particleScale;
		float xPos = (float) (this.prevPosX + (this.posX - this.prevPosX) * par2 - interpPosX);
		float yPos = (float) (this.prevPosY + (this.posY - this.prevPosY) * par2 - interpPosY);
		float zPos = (float) (this.prevPosZ + (this.posZ - this.prevPosZ) * par2 - interpPosZ);
		tessellator.startDrawingQuads();
		tessellator.setBrightness(240);
		tessellator.setColorOpaque_F(this.particleRed, this.particleGreen, this.particleBlue);
		tessellator.addVertexWithUV(xPos - par3 * scale - par6 * scale, yPos - par4 * scale, zPos - par5 * scale - par7 * scale, 0D, 1D);
		tessellator.addVertexWithUV(xPos - par3 * scale + par6 * scale, yPos + par4 * scale, zPos - par5 * scale + par7 * scale, 1D, 1D);
		tessellator.addVertexWithUV(xPos + par3 * scale + par6 * scale, yPos + par4 * scale, zPos + par5 * scale + par7 * scale, 1D, 0D);
		tessellator.addVertexWithUV(xPos + par3 * scale - par6 * scale, yPos - par4 * scale, zPos + par5 * scale - par7 * scale, 0D, 0D);
		tessellator.draw();
		GL11.glDisable(3042);
		GL11.glDepthMask(true);
		GL11.glPopMatrix();
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(ClientProxy.particle);
		tessellator.startDrawingQuads();
	}

	public PowerFX setTexture(String loc) {
		textureFX = new ResourceLocation("mysticworld", "textures/misc/" + loc + "FX.png");
		return this;
	}
}
