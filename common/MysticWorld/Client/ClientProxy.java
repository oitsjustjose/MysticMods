package mysticworld.client;

import mysticworld.blocks.BlockHandler;
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
import mysticworld.items.ItemHandler$1;
import mysticworld.lib.RenderIds;
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
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	@Override
	public int addArmor(String armor) {
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}

	//particles
	@Override
	public void airFeetFX(World worldObj, double x, double y, double z, float scale, int age) {
		PowerAirFX airFX = new PowerAirFX(worldObj, x, y, z, scale, age);
		ModLoader.getMinecraftInstance().effectRenderer.addEffect(airFX);
	}

	@Override
	public void earthFX(World worldObj, double x, double y, double z, float scale) {
		PowerEarthFX earthFX = new PowerEarthFX(worldObj, x, y, z, scale);
		ModLoader.getMinecraftInstance().effectRenderer.addEffect(earthFX);
	}

	@Override
	public void energyFX(World worldObj, double x, double y, double z, float scale) {
		PowerEnergyFX energyFX = new PowerEnergyFX(worldObj, x, y, z, scale);
		ModLoader.getMinecraftInstance().effectRenderer.addEffect(energyFX);
	}

	@Override
	public void fireFX(World worldObj, double x, double y, double z, float scale) {
		PowerFireFX fireFX = new PowerFireFX(worldObj, x, y, z, scale);
		ModLoader.getMinecraftInstance().effectRenderer.addEffect(fireFX);
	}

	@Override
	public void lightCubeFX(World worldObj, double x, double y, double z, double motionX, double motionY, double motionZ, float scale) {
		LightCubeFX lightCubeFX = new LightCubeFX(worldObj, x, y, z, motionX, motionY, motionZ, scale);
		ModLoader.getMinecraftInstance().effectRenderer.addEffect(lightCubeFX);
	}

	@Override
	public void registerRenderIDs() {
		RenderIds.RENDER_PILLAR_INSERT = RenderingRegistry.getNextAvailableRenderId();
	}

	@Override
	public void registerRenders() {
		MinecraftForgeClient.registerItemRenderer(BlockHandler.pillarInsert.blockID, new BlockPillarInsertRenderer());
		MinecraftForgeClient.registerItemRenderer(ItemHandler$1.fireStaff.itemID, new ItemStaffFireRenderer());
		MinecraftForgeClient.registerItemRenderer(ItemHandler$1.earthStaff.itemID, new ItemStaffEarthRenderer());
		MinecraftForgeClient.registerItemRenderer(ItemHandler$1.airStaff.itemID, new ItemStaffAirRenderer());
		MinecraftForgeClient.registerItemRenderer(ItemHandler$1.energyStaff.itemID, new ItemStaffEnergyRenderer());
		MinecraftForgeClient.registerItemRenderer(ItemHandler$1.waterStaff.itemID, new ItemStaffWaterRenderer());
		MinecraftForgeClient.registerItemRenderer(ItemHandler$1.fireOrb.itemID, new ItemOrbFireRenderer());
		MinecraftForgeClient.registerItemRenderer(ItemHandler$1.earthOrb.itemID, new ItemOrbEarthRenderer());
		MinecraftForgeClient.registerItemRenderer(ItemHandler$1.airOrb.itemID, new ItemOrbAirRenderer());
		MinecraftForgeClient.registerItemRenderer(ItemHandler$1.energyOrb.itemID, new ItemOrbEnergyRenderer());
		MinecraftForgeClient.registerItemRenderer(ItemHandler$1.waterOrb.itemID, new ItemOrbWaterRenderer());
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
		ModLoader.getMinecraftInstance().effectRenderer.addEffect(waterFX);
	}
}
