package mysticores.items;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class EnumTools
{
    public static final Item.ToolMaterial verditeToolMaterial = EnumHelper.addToolMaterial("Verdite", 1, 262, 5.0F, 1, 5);
    public static final Item.ToolMaterial mithrilToolMaterial = EnumHelper.addToolMaterial("Mithril", 2, 500, 7.0F, 2, 9);
    public static final Item.ToolMaterial adamantineToolMaterial = EnumHelper.addToolMaterial("Adamantine", 3, 3000, 10.0F, 5, 13);
    public static final Item.ToolMaterial iridiumToolMaterial = EnumHelper.addToolMaterial("Iridium", 3, 4000, 12.0F, 7, 15);
    public static final Item.ToolMaterial obsidianToolMaterial = EnumHelper.addToolMaterial("Obsidian", 2, 100, 4.0F, 6, 11);
    public static final Item.ToolMaterial bloodstoneToolMaterial = EnumHelper.addToolMaterial("Bloodstone", 3, 200, 16.0F, 8, 12);
	
	static {
        verditeToolMaterial.customCraftingMaterial = Items.Resource;
        mithrilToolMaterial.customCraftingMaterial = Items.Resource;
        adamantineToolMaterial.customCraftingMaterial = Items.Resource;
        iridiumToolMaterial.customCraftingMaterial = Items.Resource;
        obsidianToolMaterial.customCraftingMaterial = Item.getItemFromBlock(Blocks.obsidian);
        bloodstoneToolMaterial.customCraftingMaterial = Items.Resource;
    }
}
