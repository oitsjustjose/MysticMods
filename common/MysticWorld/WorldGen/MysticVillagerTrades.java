package MysticWorld.WorldGen;

import java.util.Random;

import MysticWorld.*;
import MysticWorld.Items.ItemHandler$1;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;

public class MysticVillagerTrades implements IVillageTradeHandler
{

    @Override
    public void manipulateTradesForVillager (EntityVillager villager, MerchantRecipeList recipeList, Random random)
    {
        if (villager.getProfession() == 98943)
        {
            recipeList.addToListWithCheck(new MerchantRecipe(new ItemStack(ItemHandler$1.imbuedShard, 19, 0), new ItemStack(Item.emerald, 1, 0)));
            recipeList.addToListWithCheck(new MerchantRecipe(new ItemStack(ItemHandler$1.imbuedShard, 16, 1), new ItemStack(Item.emerald, 1, 0)));
            recipeList.addToListWithCheck(new MerchantRecipe(new ItemStack(ItemHandler$1.imbuedShard, 17, 2), new ItemStack(Item.emerald, 1, 0)));
            recipeList.addToListWithCheck(new MerchantRecipe(new ItemStack(ItemHandler$1.imbuedShard, 13, 3), new ItemStack(Item.emerald, 1, 0)));
            recipeList.addToListWithCheck(new MerchantRecipe(new ItemStack(ItemHandler$1.imbuedShard, 11, 4), new ItemStack(Item.emerald, 1, 0)));
        }
    }

}