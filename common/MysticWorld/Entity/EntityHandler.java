package mysticworld.entity;

import cpw.mods.fml.common.registry.EntityRegistry;
import mysticworld.MysticWorld;
import mysticworld.lib.Strings;

public class EntityHandler {
    //Entity IDs
    public static final int ENTITY_AIR_CHARGE = 1;
    public static final int ENTITY_FIREBALL = 2;
    public static final int ENTITY_EARTH_CHARGE = 3;
    public static final int ENTITY_ENERGY_CHARGE = 4;
    public static final int ENTITY_WATER_CHARGE = 5;
	public static void init() {
        EntityRegistry.registerModEntity(EntityChargeAir.class, Strings.ENTITY_AIR_CHARGE_NAME, ENTITY_AIR_CHARGE, MysticWorld.instance, 80, 3, false);
        EntityRegistry.registerModEntity(EntityChargeFire.class, Strings.ENTITY_FIREBALL_NAME, ENTITY_FIREBALL, MysticWorld.instance, 80, 3, false);
        EntityRegistry.registerModEntity(EntityChargeEarth.class, Strings.ENTITY_EARTH_CHARGE_NAME, ENTITY_EARTH_CHARGE, MysticWorld.instance, 80, 3, false);
        EntityRegistry.registerModEntity(EntityChargeEnergy.class, Strings.ENTITY_ENERGY_CHARGE_NAME, ENTITY_ENERGY_CHARGE, MysticWorld.instance, 80, 3, false);
        EntityRegistry.registerModEntity(EntityChargeWater.class, Strings.ENTITY_WATER_CHARGE_NAME, ENTITY_WATER_CHARGE, MysticWorld.instance, 80, 3, false);
	}
}
