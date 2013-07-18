package MysticWorld.Model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class ModelOrb extends ModelBase {

	private IModelCustom modelOrb;
	
	public ModelOrb()
	{
		modelOrb = AdvancedModelLoader.loadModel("/assets/mystictextures/models/orb.obj");
	}
	
	public void render()
	{
		modelOrb.renderAll();
	}
	
}
