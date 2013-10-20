package mysticores.items;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;

public class EnumTools
{
	static EnumToolMaterial verditeToolMaterial = EnumHelper.addToolMaterial("Verdite", 1, 262, 5.0F, 1, 5);
	static EnumToolMaterial mithrilToolMaterial = EnumHelper.addToolMaterial("Mithril", 2, 500, 7.0F, 2, 9);
	static EnumToolMaterial adamantineToolMaterial = EnumHelper.addToolMaterial("Adamantine", 3, 3000, 10.0F, 5, 13);
	static EnumToolMaterial iridiumToolMaterial = EnumHelper.addToolMaterial("Iridium", 3, 4000, 12.0F, 7, 15);
	static EnumToolMaterial obsidianToolMaterial = EnumHelper.addToolMaterial("Obsidian", 2, 100, 4.0F, 6, 11);
	static EnumToolMaterial bloodstoneToolMaterial = EnumHelper.addToolMaterial("Bloodstone", 3, 200, 16.0F, 8, 12);
	
	static { verditeToolMaterial.customCraftingMaterial = Item.itemsList[Items.Resource.itemID]; }
	static { mithrilToolMaterial.customCraftingMaterial = Item.itemsList[Items.Resource.itemID]; }
	static { adamantineToolMaterial.customCraftingMaterial = Item.itemsList[Items.Resource.itemID]; }
	static { iridiumToolMaterial.customCraftingMaterial = Item.itemsList[Items.Resource.itemID]; }
	static { obsidianToolMaterial.customCraftingMaterial = Item.itemsList[Block.obsidian.blockID]; }
	static { bloodstoneToolMaterial.customCraftingMaterial = Item.itemsList[Items.Resource.itemID]; }
}
