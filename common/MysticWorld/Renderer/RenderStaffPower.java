package mysticworld.renderer;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class RenderStaffPower extends Render {
    private final ResourceLocation location;
	public RenderStaffPower(String type) {
        location = new ResourceLocation("mysticworld","textures/items/Charge"+type+".png");
	}

	@Override
	public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
		this.doRenderEntity(par1Entity, par2, par4, par6, par8, par9);
	}

	public void doRenderEntity(Entity entity, double par2, double par4, double par6, float par8, float par9) {
		GL11.glPushMatrix();
		this.bindEntityTexture(entity);
        GL11.glTranslatef((float) par2, (float) par4, (float) par6);
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		Tessellator tessellator = Tessellator.instance;
		float f7 = 1.0F;
		float f8 = 0.5F;
		float f9 = 0.25F;
		GL11.glRotatef(180.0F - this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(-this.renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
		tessellator.startDrawingQuads();
		tessellator.setNormal(0.0F, 1.0F, 0.0F);
		tessellator.addVertexWithUV(0.0F - f8, 0.0F - f9, 0.0D, 0, 1);
		tessellator.addVertexWithUV(f7 - f8, 0.0F - f9, 0.0D, 1, 1);
		tessellator.addVertexWithUV(f7 - f8, 1.0F - f9, 0.0D, 1, 0);
		tessellator.addVertexWithUV(0.0F - f8, 1.0F - f9, 0.0D, 0, 0);
		tessellator.draw();
		GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		GL11.glPopMatrix();
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return location;
	}
}
