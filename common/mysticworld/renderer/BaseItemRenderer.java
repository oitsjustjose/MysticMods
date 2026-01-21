package mysticworld.renderer;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

public abstract class BaseItemRenderer implements IItemRenderer {
	protected final ResourceLocation texture;

	public BaseItemRenderer(String loc) {
		texture = new ResourceLocation("mysticworld", "textures/models/" + loc + ".png");
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		switch (type) {
		case ENTITY:
		case EQUIPPED:
		case EQUIPPED_FIRST_PERSON:
		case INVENTORY:
			return true;
		default:
			return false;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		switch (type) {
		case ENTITY:
		case EQUIPPED:
		case INVENTORY:
		case EQUIPPED_FIRST_PERSON:
			return true;
		default:
			return false;
		}
	}
}
