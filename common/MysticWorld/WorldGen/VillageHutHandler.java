package MysticWorld.WorldGen;

import java.util.List;
import java.util.Random;

import net.minecraft.world.gen.structure.ComponentVillageStartPiece;
import net.minecraft.world.gen.structure.StructureVillagePieceWeight;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageCreationHandler;

public class VillageHutHandler implements IVillageCreationHandler
{

    @Override
    public StructureVillagePieceWeight getVillagePieceWeight (Random random, int i)
    {
        return new StructureVillagePieceWeight(ComponentVillagerHut.class, 30, i + random.nextInt(4));
    }

    @Override
    public Class<?> getComponentClass ()
    {
        return ComponentVillagerHut.class;
    }

    @Override
    public Object buildComponent (StructureVillagePieceWeight villagePiece, ComponentVillageStartPiece startPiece, List pieces, Random random, int p1, int p2, int p3, int p4, int p5)
    {
         return ComponentVillagerHut.buildComponent(startPiece, pieces, random, p1, p2, p3, p4, p5);
    }

}