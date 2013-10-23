package mysticworld.client;

import mysticworld.blocks.BlockHandler;
import mysticworld.blocks.BlockPillarInsert;
import mysticworld.client.fx.LightCubeFX;
import mysticworld.client.fx.PowerAirFX;
import mysticworld.client.fx.PowerEarthFX;
import mysticworld.client.fx.PowerEnergyFX;
import mysticworld.client.fx.PowerFireFX;
import mysticworld.client.fx.PowerWaterFX;
import mysticworld.entity.EntityChargeAir;
import mysticworld.entity.EntityChargeEarth;
import mysticworld.entity.EntityChargeEnergy;
import mysticworld.entity.EntityChargeFire;
import mysticworld.entity.EntityChargeWater;
import mysticworld.items.ItemHandler;
import mysticworld.renderer.BlockPillarInsertRenderer;
import mysticworld.renderer.ItemOrbAirRenderer;
import mysticworld.renderer.ItemOrbEarthRenderer;
import mysticworld.renderer.ItemOrbEnergyRenderer;
import mysticworld.renderer.ItemOrbFireRenderer;
import mysticworld.renderer.ItemOrbWaterRenderer;
import mysticworld.renderer.ItemStaffAirRenderer;
import mysticworld.renderer.ItemStaffEarthRenderer;
import mysticworld.renderer.ItemStaffEnergyRenderer;
import mysticworld.renderer.ItemStaffFireRenderer;
import mysticworld.renderer.ItemStaffWaterRenderer;
import mysticworld.renderer.RenderStaffPower;
import mysticworld.renderer.TileEntityPillarInsertRenderer;
import mysticworld.tiles.TileEntityPillarInsert;
import mysticworld.util.CommonProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	public final Minecraft mc = Minecraft.getMinecraft();

	@Override
	public int addArmor(String armor) {
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}

	//particles
	@Override
	public void airFeetFX(World worldObj, double x, double y, double z, float scale, int age) {
		PowerAirFX airFX = new PowerAirFX(worldObj, x, y, z, scale, age);
		mc.effectRenderer.addEffect(airFX);
	}

	@Override
	public void earthFX(World worldObj, double x, double y, double z, float scale) {
		PowerEarthFX earthFX = new PowerEarthFX(worldObj, x, y, z, scale);
		mc.effectRenderer.addEffect(earthFX);
	}

	@Override
	public void energyFX(World worldObj, double x, double y, double z, float scale) {
		PowerEnergyFX energyFX = new PowerEnergyFX(worldObj, x, y, z, scale);
		mc.effectRenderer.addEffect(energyFX);
	}

	@Override
	public void fireFX(World worldObj, double x, double y, double z, float scale) {
		PowerFireFX fireFX = new PowerFireFX(worldObj, x, y, z, scale);
		mc.effectRenderer.addEffect(fireFX);
	}

	@Override
	public void lightCubeFX(World worldObj, double x, double y, double z, double motionX, double motionY, double motionZ, float scale) {
		LightCubeFX lightCubeFX = new LightCubeFX(worldObj, x, y, z, motionX, motionY, motionZ, scale);
		mc.effectRenderer.addEffect(lightCubeFX);
	}

	@Override
	public void registerRenders() {
		BlockPillarInsert.RENDER_PILLAR_INSERT = RenderingRegistry.getNextAvailableRenderId();
		MinecraftForgeClient.registerItemRenderer(BlockHandler.pillarInsert.blockID, new BlockPillarInsertRenderer());
		MinecraftForgeClient.registerItemRenderer(ItemHandler.fireStaff.itemID, new ItemStaffFireRenderer());
		MinecraftForgeClient.registerItemRenderer(ItemHandler.earthStaff.itemID, new ItemStaffEarthRenderer());
		MinecraftForgeClient.registerItemRenderer(ItemHandler.airStaff.itemID, new ItemStaffAirRenderer());
		MinecraftForgeClient.registerItemRenderer(ItemHandler.energyStaff.itemID, new ItemStaffEnergyRenderer());
		MinecraftForgeClient.registerItemRenderer(ItemHandler.waterStaff.itemID, new ItemStaffWaterRenderer());
		MinecraftForgeClient.registerItemRenderer(ItemHandler.fireOrb.itemID, new ItemOrbFireRenderer());
		MinecraftForgeClient.registerItemRenderer(ItemHandler.earthOrb.itemID, new ItemOrbEarthRenderer());
		MinecraftForgeClient.registerItemRenderer(ItemHandler.airOrb.itemID, new ItemOrbAirRenderer());
		MinecraftForgeClient.registerItemRenderer(ItemHandler.energyOrb.itemID, new ItemOrbEnergyRenderer());
		MinecraftForgeClient.registerItemRenderer(ItemHandler.waterOrb.itemID, new ItemOrbWaterRenderer());
		RenderingRegistry.registerEntityRenderingHandler(EntityChargeFire.class, new RenderStaffPower(0));
		RenderingRegistry.registerEntityRenderingHandler(EntityChargeWater.class, new RenderStaffPower(1));
		RenderingRegistry.registerEntityRenderingHandler(EntityChargeEarth.class, new RenderStaffPower(2));
		RenderingRegistry.registerEntityRenderingHandler(EntityChargeAir.class, new RenderStaffPower(3));
		RenderingRegistry.registerEntityRenderingHandler(EntityChargeEnergy.class, new RenderStaffPower(4));
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPillarInsert.class, new TileEntityPillarInsertRenderer());
	}

	@Override
	public void waterFX(World worldObj, double x, double y, double z, float scale) {
		PowerWaterFX waterFX = new PowerWaterFX(worldObj, x, y, z, scale);
		mc.effectRenderer.addEffect(waterFX);
	}
}
