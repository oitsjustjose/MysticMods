package mysticworld.renderer;

import cpw.mods.fml.client.FMLClientHandler;
import mysticworld.model.ModelOrb;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class OrbItemRenderer extends BaseItemRenderer {
	private final ModelOrb modelOrb = new ModelOrb();

	public OrbItemRenderer(String loc) {
		super("Orb" + loc);
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		switch (type) {
		case ENTITY:
			renderOrb(0.0f, 0.5f, 0.0f, 0.4f);
			break;
		case EQUIPPED:
			renderOrb(0.5f, 1.0f, 0.5f, 0.5f);
			break;
		case INVENTORY:
			renderOrb(0.0f, 0.0f, 0.0f, 0.5f);
			break;
		case EQUIPPED_FIRST_PERSON:
			renderOrb(0.0f, 1.0f, 1.0f, 0.5f);
			break;
		default:
			break;
		}
	}

	public void renderOrb(float x, float y, float z, float scale) {
		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glTranslatef(x, y, z);
		GL11.glScalef(scale, scale, scale);
		GL11.glRotatef(180f, 0f, 1f, 0f);
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(texture);
		modelOrb.render();
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
	}
}
