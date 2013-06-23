package MysticStones;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;

public class ItemBlockStones extends ItemBlock {
	
	public static String[] STONE_TYPES = new String[] {"Smooth Anorthosite", "Anorthosite", "Smooth Limestone", "Limestone", "Smooth Marble", "Marble", "Smooth Migmatite", "Migmatite",
		"Smooth Orthogneiss", "Orthogneiss", "Smooth Slate", "Slate", "Smooth Travertine", "Travertine"};

	public ItemBlockStones(int par1) {
		super(par1);
        setMaxDamage(0);
        setHasSubtypes(true);
	}
	
    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        int meta = MathHelper.clamp_int(itemStack.getItemDamage(), 0, STONE_TYPES.length);
        return super.getUnlocalizedName() + STONE_TYPES[meta];
    }
	
    public int getMetadata(int par1)
    {
        return par1;
    }
    
	@SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int par1)
    {
        return MysticStones.Stones.getIcon(2, par1);
    }
 
}
