package mysticworld.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPillarInsert extends ModelBase
{
    ModelRenderer Plate1;
    ModelRenderer Plate2;
    ModelRenderer smallPlate1;
    ModelRenderer smallPlate2;
    ModelRenderer Object1;
  
  public ModelPillarInsert()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Plate1 = new ModelRenderer(this, 0, 0);
      Plate1.addBox(0F, 0F, 0F, 12, 2, 12);
      Plate1.setRotationPoint(-6F, 22F, -6F);
      Plate1.setTextureSize(64, 32);
      setRotation(Plate1, 0F, 0F, 0F);
      Plate2 = new ModelRenderer(this, 0, 0);
      Plate2.addBox(0F, 0F, 0F, 12, 2, 12);
      Plate2.setRotationPoint(-6F, 8F, -6F);
      Plate2.setTextureSize(64, 32);
      setRotation(Plate2, 0F, 0F, 0F);
      smallPlate1 = new ModelRenderer(this, 0, 0);
      smallPlate1.addBox(0F, 0F, 0F, 8, 2, 8);
      smallPlate1.setRotationPoint(-4F, 10F, -4F);
      smallPlate1.setTextureSize(64, 32);
      setRotation(smallPlate1, 0F, 0F, 0F);
      smallPlate2 = new ModelRenderer(this, 0, 0);
      smallPlate2.addBox(0F, 0F, 0F, 8, 2, 8);
      smallPlate2.setRotationPoint(-4F, 20F, -4F);
      smallPlate2.setTextureSize(64, 32);
      setRotation(smallPlate2, 0F, 0F, 0F);
      Object1 = new ModelRenderer(this, 0, 14);
      Object1.addBox(0F, 0F, 0F, 4, 4, 4);
      Object1.setRotationPoint(-2F, 14F, -2F);
      Object1.setTextureSize(64, 32);
      setRotation(Object1, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Plate1.render(f5);
    Plate2.render(f5);
    smallPlate1.render(f5);
    smallPlate2.render(f5);
    Object1.render(f5);
  }
  
  public void renderModel (float f1)
  {
  	Plate1.render(f1);
  	Plate2.render(f1);
  	smallPlate1.render(f1);
  	smallPlate2.render(f1);
  	Object1.render(f1);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}
