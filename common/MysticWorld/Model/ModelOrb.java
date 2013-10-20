package mysticworld.model;

import net.minecraft.client.model.ModelBase;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class ModelOrb extends ModelBase {
	private IModelCustom modelOrb;

	public ModelOrb() {
		modelOrb = AdvancedModelLoader.loadModel("/assets/mysticmods/models/orb.obj");
	}

	public void render() {
		modelOrb.renderAll();
	}
}
