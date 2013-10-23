package mysticworld.renderer;

import mysticworld.model.ModelOrb;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;

public class ItemOrbAirRenderer implements IItemRenderer {
	private ModelOrb modelOrb;

	public ItemOrbAirRenderer() {
		modelOrb = new ModelOrb();
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
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation("mysticmods:textures" + "/models/OrbAir.png"));
		modelOrb.render();
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		switch (type) {
		case ENTITY:
			return true;
		case EQUIPPED:
			return true;
		case INVENTORY:
			return true;
		case EQUIPPED_FIRST_PERSON:
			return true;
		default:
			return false;
		}
	}
}
