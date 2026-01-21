package mysticworld.renderer;

import cpw.mods.fml.client.FMLClientHandler;
import mysticworld.model.ModelPillarInsert;
import mysticworld.tiles.TileEntityPillarInsert;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class TileEntityPillarInsertRenderer extends TileEntitySpecialRenderer {
	private static final ResourceLocation texture = new ResourceLocation("mysticworld", "textures/models/PillarInsert.png");
	private ModelPillarInsert model;

	public TileEntityPillarInsertRenderer() {
		model = new ModelPillarInsert();
	}

	public void renderAModelAt(TileEntityPillarInsert tileentity, double d, double d1, double d2, float f) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float) d + 0.5F, (float) d1 + 1.5F, (float) d2 + 0.5F);
		GL11.glRotatef(0F, 0F, 0F, 0F);
		GL11.glScalef(1.0F, -1.0F, -1.0F);
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(texture);
		GL11.glPushMatrix();
		model.renderModel(0.0625F);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}

	@Override
	public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f) {
		renderAModelAt((TileEntityPillarInsert) tileentity, d, d1, d2, f);
	}
}
