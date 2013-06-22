package MysticOres;

import MysticOres.Blocks.BlockHandler;
import MysticOres.Items.ItemHandler;
import thaumcraft.api.EnumTag;
import thaumcraft.api.ObjectTags;
import thaumcraft.api.ThaumcraftApi;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class ThaumcraftAPIManager
{
	public static void init()
	{
		if(Loader.isModLoaded("Thaumcraft") == true)
		{
			ThaumcraftApi.registerObjectTag(ItemHandler.Resource.itemID, 2, (new ObjectTags()).add(EnumTag.METAL, 10).add(EnumTag.VALUABLE, 4));
			ThaumcraftApi.registerObjectTag(ItemHandler.Resource.itemID, 1, (new ObjectTags()).add(EnumTag.METAL, 8).add(EnumTag.MAGIC, 2));
			ThaumcraftApi.registerObjectTag(ItemHandler.Resource.itemID, 0, (new ObjectTags()).add(EnumTag.METAL, 8).add(EnumTag.PLANT, 2));
			ThaumcraftApi.registerObjectTag(ItemHandler.Resource.itemID, 3, (new ObjectTags()).add(EnumTag.METAL, 16).add(EnumTag.VALUABLE, 8));
			ThaumcraftApi.registerObjectTag(ItemHandler.Resource.itemID, 8, (new ObjectTags()).add(EnumTag.MAGIC, 4).add(EnumTag.VALUABLE, 2));
			ThaumcraftApi.registerObjectTag(ItemHandler.Resource.itemID, 5, (new ObjectTags()).add(EnumTag.MAGIC, 4).add(EnumTag.VALUABLE, 2));
			ThaumcraftApi.registerObjectTag(ItemHandler.Resource.itemID, 7, (new ObjectTags()).add(EnumTag.MAGIC, 4).add(EnumTag.VALUABLE, 2));
			ThaumcraftApi.registerObjectTag(ItemHandler.Resource.itemID, 6, (new ObjectTags()).add(EnumTag.MAGIC, 4).add(EnumTag.VALUABLE, 2));
			ThaumcraftApi.registerObjectTag(ItemHandler.Resource.itemID, 9, (new ObjectTags()).add(EnumTag.MAGIC, 4).add(EnumTag.VALUABLE, 2)
					.add(EnumTag.EXCHANGE, 9));
			ThaumcraftApi.registerObjectTag(BlockHandler.ReinforcedGlass.blockID, 0, (new ObjectTags()).add(EnumTag.CRYSTAL, 4).add(EnumTag.ROCK, 2));
			ThaumcraftApi.registerObjectTag(ItemHandler.Resource.itemID, 4, (new ObjectTags()).add(EnumTag.POISON, 2).add(EnumTag.FIRE, 1).add(EnumTag.MAGIC, 4)
					.add(EnumTag.POWER, 6));
			ThaumcraftApi.registerObjectTag(ItemHandler.Resource.itemID, 10, (new ObjectTags()).add(EnumTag.CRYSTAL, 1).add(EnumTag.DARK, 1));
			ThaumcraftApi.registerObjectTag(BlockHandler.BlockOres.blockID, 7, (new ObjectTags()).add(EnumTag.DARK, 4).add(EnumTag.EVIL, 2));
			
			System.out.println("[Mystic Ores] Thaumcraft Integration Initialized Successfully!");
		}
	}
}
