package MysticWorld.Entity;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import cpw.mods.fml.common.registry.EntityRegistry;
import MysticWorld.MysticWorld;
import MysticWorld.Lib.EntityIds;
import MysticWorld.Lib.Strings;

public class EntityHandler {

	public static void init(){
		registerEntities();
	}
	
	public static void registerEntities(){
		EntityRegistry.registerModEntity(EntityChargeAir.class, Strings.ENTITY_AIR_CHARGE_NAME, EntityIds.ENTITY_AIR_CHARGE, MysticWorld.instance, 80, 3, false);
		EntityRegistry.registerModEntity(EntityChargeFire.class, Strings.ENTITY_FIREBALL_NAME, EntityIds.ENTITY_FIREBALL, MysticWorld.instance, 80, 3, false);
		EntityRegistry.registerModEntity(EntityChargeEarth.class, Strings.ENTITY_EARTH_CHARGE_NAME, EntityIds.ENTITY_EARTH_CHARGE, MysticWorld.instance, 80, 3, false);
		EntityRegistry.registerModEntity(EntityChargeEnergy.class, Strings.ENTITY_ENERGY_CHARGE_NAME, EntityIds.ENTITY_ENERGY_CHARGE, MysticWorld.instance, 80, 3, false);
		EntityRegistry.registerModEntity(EntityChargeWater.class, Strings.ENTITY_WATER_CHARGE_NAME, EntityIds.ENTITY_WATER_CHARGE, MysticWorld.instance, 80, 3, false);
		
		EntityRegistry.registerModEntity(EntityPigman.class, Strings.ENTITY_PIGMAN_NAME, EntityIds.ENTITY_PIGMAN, MysticWorld.instance, 80, 3, false);
		
		BiomeGenBase[] overworldbiomes = BiomeDictionary.getBiomesForType(BiomeDictionary.Type.PLAINS.DESERT.MAGICAL.MOUNTAIN.FOREST.HILLS);
		
		EntityRegistry.addSpawn(EntityPigman.class, 10, 2, 12, EnumCreatureType.creature, overworldbiomes);
	}
}
