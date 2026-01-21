package mysticworld.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class ModelOrb extends ModelBase {
    private static final ResourceLocation orb = new ResourceLocation("mysticworld", "models/orb.obj");
	private IModelCustom modelOrb;

	public ModelOrb() {
		modelOrb = AdvancedModelLoader.loadModel(orb);
	}

	public void render() {
		modelOrb.renderAll();
	}
}
