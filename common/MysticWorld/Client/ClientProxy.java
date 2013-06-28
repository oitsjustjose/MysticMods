package MysticWorld.Client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.RenderFireball;
import net.minecraft.item.Item;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
import MysticWorld.CommonProxy;
import MysticWorld.Client.FX.PowerAirFX;
import MysticWorld.Client.FX.PowerEarthFX;
import MysticWorld.Client.FX.PowerEnergyFX;
import MysticWorld.Client.FX.PowerFireFX;
import MysticWorld.Client.FX.LightCubeFX;
import MysticWorld.Client.FX.PowerWaterFX;
import MysticWorld.Entity.EntityChargeAir;
import MysticWorld.Entity.EntityChargeEarth;
import MysticWorld.Entity.EntityChargeEnergy;
import MysticWorld.Entity.EntityChargeFire;
import MysticWorld.Entity.EntityChargeWater;
import MysticWorld.Items.ItemHandler$1;
import MysticWorld.Renderer.RenderStaffPower;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityChargeFire.class, new RenderStaffPower(0));
		RenderingRegistry.registerEntityRenderingHandler(EntityChargeWater.class, new RenderStaffPower(1));
		RenderingRegistry.registerEntityRenderingHandler(EntityChargeEarth.class, new RenderStaffPower(2));
		RenderingRegistry.registerEntityRenderingHandler(EntityChargeAir.class, new RenderStaffPower(3));
		RenderingRegistry.registerEntityRenderingHandler(EntityChargeEnergy.class, new RenderStaffPower(4));
	}
	
	public int addArmor(String armor)
	{
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
	
	//particles
	@Override
	public void airFX(World worldObj, double x, double y, double z, float scale)
	{
		PowerAirFX airFX = new PowerAirFX(worldObj, x, y, z, scale);
		ModLoader.getMinecraftInstance().effectRenderer.addEffect(airFX);
	}
	
	@Override
	public void earthFX(World worldObj, double x, double y, double z, float scale)
	{
		PowerEarthFX earthFX = new PowerEarthFX(worldObj, x, y, z, scale);
		ModLoader.getMinecraftInstance().effectRenderer.addEffect(earthFX);
	}
	
	@Override
	public void energyFX(World worldObj, double x, double y, double z, float scale)
	{
		PowerEnergyFX energyFX = new PowerEnergyFX(worldObj, x, y, z, scale);
		ModLoader.getMinecraftInstance().effectRenderer.addEffect(energyFX);
	}
	
	@Override
	public void fireFX(World worldObj, double x, double y, double z, float scale)
	{
		PowerFireFX fireFX = new PowerFireFX(worldObj, x, y, z, scale);
		ModLoader.getMinecraftInstance().effectRenderer.addEffect(fireFX);
	}
	
	@Override
	public void waterFX(World worldObj, double x, double y, double z, float scale)
	{
		PowerWaterFX waterFX = new PowerWaterFX(worldObj, x, y, z, scale);
		ModLoader.getMinecraftInstance().effectRenderer.addEffect(waterFX);
	}
	
	@Override
	public void lightCubeFX(World worldObj, double x, double y, double z, double motionX, double motionY, double motionZ, float scale)
	{
		LightCubeFX lightCubeFX = new LightCubeFX(worldObj, x, y, z, motionX, motionY, motionZ, scale);
		ModLoader.getMinecraftInstance().effectRenderer.addEffect(lightCubeFX);
	}
	
}
