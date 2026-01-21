package mysticworld.renderer;

import cpw.mods.fml.client.FMLClientHandler;
import mysticworld.model.ModelPillarInsert;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class BlockPillarInsertRenderer implements IItemRenderer {
	private static final ResourceLocation texture = new ResourceLocation("mysticworld", "textures/models/PillarInsert.png");
	private final ModelPillarInsert model;

	public BlockPillarInsertRenderer() {
		this.model = new ModelPillarInsert();
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		switch (type) {
		case ENTITY:
			return true;
		case EQUIPPED:
			return true;
		case EQUIPPED_FIRST_PERSON:
			return true;
		case INVENTORY:
			return true;
		default:
			return false;
		}
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		switch (type) {
		case ENTITY:
			renderModel(0.0F, -1.0F, 0.0F, 1.0F);
			break;
		case EQUIPPED:
			renderModel(0.5F, -0.5f, 0.5f, 1.0f);
			break;
		case INVENTORY:
			renderModel(0.5F, -0.6F, 0.5F, 1.0F);
			break;
		case EQUIPPED_FIRST_PERSON:
			renderModel(0.5F, -0.5F, 0.5F, 1.0F);
			break;
		default:
			break;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return true;
	}

	private void renderModel(float x, float y, float z, float scale) {
		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glScalef(scale, scale, scale);
		GL11.glTranslatef(x, y, z);
		GL11.glRotatef(0.0F, 0.0F, 0.0F, 0.0F);
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(texture);
		model.renderModel(0.0625f);
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
	}
}
