package mysticworld.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelStaff extends ModelBase
{
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape5;
    ModelRenderer Shape12;
  
    public ModelStaff()
  	{
    	textureWidth = 64;
    	textureHeight = 64;
    
      	Shape1 = new ModelRenderer(this, 4, 0);
      	Shape1.addBox(0F, 0F, 0F, 1, 20, 1);
      	Shape1.setRotationPoint(0F, 0F, 0F);
      	Shape1.setTextureSize(64, 64);
      	setRotation(Shape1, 0F, 0F, 0F);
      	Shape2 = new ModelRenderer(this, 20, 0);
      	Shape2.addBox(0F, 0F, 0F, 3, 3, 3);
      	Shape2.setRotationPoint(-1F, -3F, -1F);
      	Shape2.setTextureSize(64, 64);
      	setRotation(Shape2, 0F, 0F, 0F);
      	Shape3 = new ModelRenderer(this, 8, 0);
      	Shape3.addBox(0F, 0F, 0F, 3, 1, 1);
      	Shape3.setRotationPoint(1F, 1F, 0F);
      	Shape3.setTextureSize(64, 64);
      	setRotation(Shape3, 0F, 0F, 0F);
      	Shape4 = new ModelRenderer(this, 16, 0);
      	Shape4.addBox(0F, 0F, 0F, 1, 3, 1);
      	Shape4.setRotationPoint(3F, -2F, 0F);
      	Shape4.setTextureSize(64, 64);
      	setRotation(Shape4, 0F, 0F, 0F);
      	Shape6 = new ModelRenderer(this, 16, 0);
      	Shape6.addBox(0F, 0F, 0F, 1, 3, 1);
      	Shape6.setRotationPoint(-3F, -2F, 0F);
      	Shape6.setTextureSize(64, 64);
      	setRotation(Shape6, 0F, 0F, 0F);
      	Shape7 = new ModelRenderer(this, 8, 0);
      	Shape7.addBox(0F, 0F, 0F, 1, 1, 3);
      	Shape7.setRotationPoint(0F, 1F, -3F);
      	Shape7.setTextureSize(64, 64);
      	setRotation(Shape7, 0F, 0F, 0F);
      	Shape8 = new ModelRenderer(this, 8, 0);
      	Shape8.addBox(0F, 0F, 0F, 1, 1, 3);
      	Shape8.setRotationPoint(0F, 1F, 1F);
      	Shape8.setTextureSize(64, 64);
      	setRotation(Shape8, 0F, 0F, 0F);
      	Shape9 = new ModelRenderer(this, 16, 0);
      	Shape9.addBox(0F, 0F, 0F, 1, 3, 1);
      	Shape9.setRotationPoint(0F, -2F, 3F);
      	Shape9.setTextureSize(64, 64);
      	setRotation(Shape9, 0F, 0F, 0F);
      	Shape10 = new ModelRenderer(this, 16, 0);
      	Shape10.addBox(0F, 0F, 0F, 1, 3, 1);
      	Shape10.setRotationPoint(0F, -2F, -3F);
      	Shape10.setTextureSize(64, 64);
      	setRotation(Shape10, 0F, 0F, 0F);
      	Shape11 = new ModelRenderer(this, 32, 0);
      	Shape11.addBox(0F, 0F, 0F, 1, 1, 3);
      	Shape11.setRotationPoint(0F, 20F, -1F);
      	Shape11.setTextureSize(64, 64);
      	setRotation(Shape11, 0F, 0F, 0F);
      	Shape13 = new ModelRenderer(this, 0, 0);
      	Shape13.addBox(0F, 0F, 0F, 1, 1, 1);
      	Shape13.setRotationPoint(-1F, 20F, 0F);
      	Shape13.setTextureSize(64, 64);
      	setRotation(Shape13, 0F, 0F, 0F);
      	Shape14 = new ModelRenderer(this, 0, 0);
      	Shape14.addBox(0F, 0F, 0F, 1, 1, 1);
      	Shape14.setRotationPoint(1F, 20F, 0F);
      	Shape14.setTextureSize(64, 64);
      	setRotation(Shape14, 0F, 0F, 0F);
      	Shape5 = new ModelRenderer(this, 8, 0);
      	Shape5.addBox(0F, 0F, 0F, 3, 1, 1);
      	Shape5.setRotationPoint(-3F, 1F, 0F);
      	Shape5.setTextureSize(64, 64);
      	setRotation(Shape5, 0F, 0F, 0F);
      	Shape12 = new ModelRenderer(this, 0, 0);
      	Shape12.addBox(0F, 0F, 0F, 1, 1, 1);
      	Shape12.setRotationPoint(0F, 21F, 0F);
      	Shape12.setTextureSize(64, 64);
      	setRotation(Shape12, 0F, 0F, 0F);
  	}
  
  	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  	{
  		super.render(entity, f, f1, f2, f3, f4, f5);
  		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  		Shape1.render(f5);
  		Shape2.render(f5);
  		Shape3.render(f5);
  		Shape4.render(f5);
  		Shape6.render(f5);
  		Shape7.render(f5);
  		Shape8.render(f5);
  		Shape9.render(f5);
  		Shape10.render(f5);
  		Shape11.render(f5);
  		Shape13.render(f5);
  		Shape14.render(f5);
  		Shape5.render(f5);
  		Shape12.render(f5);
  	}
  
  	public void renderModel(float f5)
  	{
	    Shape1.render(f5);
	    Shape2.render(f5);
	    Shape3.render(f5);
	    Shape4.render(f5);
	    Shape6.render(f5);
	    Shape7.render(f5);
	    Shape8.render(f5);
	    Shape9.render(f5);
	    Shape10.render(f5);
	    Shape11.render(f5);
	    Shape13.render(f5);
	    Shape14.render(f5);
	    Shape5.render(f5);
	    Shape12.render(f5);
  	}
  
  	private void setRotation(ModelRenderer model, float x, float y, float z)
  	{
  		model.rotateAngleX = x;
  		model.rotateAngleY = y;
  		model.rotateAngleZ = z;
  	}
}
