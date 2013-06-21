package MysticOres;

import MysticOres.Blocks.BlockHandler;
import MysticOres.Items.ItemHandler;
import thaumcraft.api.EnumTag;
import thaumcraft.api.ObjectTags;
import thaumcraft.api.ThaumcraftApi;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModHandler
{
	public static void init()
	{
		
		//Thaumcraft API
		if(Loader.isModLoaded("Thaumcraft") == true)
		{
			ThaumcraftApi.registerObjectTag(ItemHandler.AdamantineIngot.itemID, 0, (new ObjectTags()).add(EnumTag.METAL, 10).add(EnumTag.VALUABLE, 4));
			ThaumcraftApi.registerObjectTag(ItemHandler.MithrilIngot.itemID, 0, (new ObjectTags()).add(EnumTag.METAL, 8).add(EnumTag.MAGIC, 2));
			ThaumcraftApi.registerObjectTag(ItemHandler.VerditeIngot.itemID, 0, (new ObjectTags()).add(EnumTag.METAL, 8).add(EnumTag.PLANT, 2));
			ThaumcraftApi.registerObjectTag(ItemHandler.IridiumIngot.itemID, 0, (new ObjectTags()).add(EnumTag.METAL, 16).add(EnumTag.VALUABLE, 8));
			ThaumcraftApi.registerObjectTag(ItemHandler.AmethystGem.itemID, 0, (new ObjectTags()).add(EnumTag.MAGIC, 4).add(EnumTag.VALUABLE, 2));
			ThaumcraftApi.registerObjectTag(ItemHandler.TourmalineGem.itemID, 0, (new ObjectTags()).add(EnumTag.MAGIC, 4).add(EnumTag.VALUABLE, 2));
			ThaumcraftApi.registerObjectTag(ItemHandler.TopazGem.itemID, 0, (new ObjectTags()).add(EnumTag.MAGIC, 4).add(EnumTag.VALUABLE, 2));
			ThaumcraftApi.registerObjectTag(ItemHandler.AgateGem.itemID, 0, (new ObjectTags()).add(EnumTag.MAGIC, 4).add(EnumTag.VALUABLE, 2));
			ThaumcraftApi.registerObjectTag(ItemHandler.MysticPowder.itemID, 0, (new ObjectTags()).add(EnumTag.MAGIC, 4).add(EnumTag.VALUABLE, 2)
					.add(EnumTag.EXCHANGE, 9));
			ThaumcraftApi.registerObjectTag(BlockHandler.ReinforcedGlass.blockID, 0, (new ObjectTags()).add(EnumTag.CRYSTAL, 4).add(EnumTag.ROCK, 2));
			ThaumcraftApi.registerObjectTag(ItemHandler.IridiumNugget.itemID, 0, (new ObjectTags()).add(EnumTag.POISON, 2).add(EnumTag.FIRE, 1).add(EnumTag.MAGIC, 4)
					.add(EnumTag.POWER, 6));
			ThaumcraftApi.registerObjectTag(ItemHandler.BloodstoneShard.itemID, 0, (new ObjectTags()).add(EnumTag.CRYSTAL, 1).add(EnumTag.DARK, 1));
			ThaumcraftApi.registerObjectTag(BlockHandler.BlockOres.blockID, 7, (new ObjectTags()).add(EnumTag.DARK, 4).add(EnumTag.EVIL, 2));
			
			System.out.println("[Mystic Ores] Thaumcraft Integration Initialized Successfully!");
		}
		
		
		//IC2 API
		/*
		if(Loader.isModLoaded("IC2") == true && Config.DustsEnabled == true)
		{
			IC2Handler.adamantineRecipe();
			IC2Handler.mithrilRecipe();
			IC2Handler.verditeRecipe();
		}
		*/

		/*
		//TE API
		if(Loader.isModLoaded("ThermalExpansion") == true && Config.DustsEnabled == true)
		{
			ThermalExpansionHandler.init();
			
			GameRegistry.addSmelting(MysticOres.AdamantineDust.itemID, new ItemStack(MysticOres.AdamantineIngot), 0.0F);
			GameRegistry.addSmelting(MysticOres.MithrilDust.itemID, new ItemStack(MysticOres.MithrilIngot), 0.0F);
			GameRegistry.addSmelting(MysticOres.VerditeDust.itemID, new ItemStack(MysticOres.VerditeIngot), 0.0F);
		}
		*/
	}
}
