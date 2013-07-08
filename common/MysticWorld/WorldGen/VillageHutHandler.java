package MysticWorld.WorldGen;

import java.util.List;
import java.util.Random;

import MysticWorld.Items.ItemHandler$1;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.gen.structure.ComponentVillageStartPiece;
import net.minecraft.world.gen.structure.StructureVillagePieceWeight;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageCreationHandler;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;

public class VillageHutHandler implements IVillageCreationHandler, IVillageTradeHandler
{
	
    @Override
    public void manipulateTradesForVillager (EntityVillager villager, MerchantRecipeList recipeList, Random random)
    {
        if (villager.getProfession() == 98943)
        {
            recipeList.add(new MerchantRecipe(new ItemStack(ItemHandler$1.imbuedShard, 19, 0), new ItemStack(Item.emerald, 1, 0)));
            recipeList.add(new MerchantRecipe(new ItemStack(ItemHandler$1.imbuedShard, 16, 1), new ItemStack(Item.emerald, 1, 0)));
            recipeList.add(new MerchantRecipe(new ItemStack(ItemHandler$1.imbuedShard, 17, 2), new ItemStack(Item.emerald, 1, 0)));
            recipeList.add(new MerchantRecipe(new ItemStack(ItemHandler$1.imbuedShard, 13, 3), new ItemStack(Item.emerald, 1, 0)));
            recipeList.add(new MerchantRecipe(new ItemStack(ItemHandler$1.imbuedShard, 11, 4), new ItemStack(Item.emerald, 1, 0)));
        }
    }

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