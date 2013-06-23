package MysticWorld;

import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
import MysticWorld.Client.FX.AirFX;
import MysticWorld.Client.FX.LightCubeFX;

public class CommonProxy {
	
	public int addArmor(String armor)
	{
		return 0;
	}

	public void registerRenders(){
	}
	
	//particles
	public void airFX(World worldObj, double x, double y, double z, float scale){
	}
	
	public void earthFX(World worldObj, double x, double y, double z, float scale){
	}
	
	public void energyFX(World worldObj, double x, double y, double z, float scale){
	}
	
	public void fireFX(World worldObj, double x, double y, double z, float scale){
	}
	
	public void waterFX(World worldObj, double x, double y, double z, float scale){
	}
	
	public void lightCubeFX(World worldObj, double x, double y, double z, double motionX, double motionY, double motionZ, float scale){
	}
	
}
