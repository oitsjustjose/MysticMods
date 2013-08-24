package MysticStones.Blocks;

import java.util.List;

import MysticStones.MysticStones;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;

public class ItemPlanks extends ItemBlock {
	
	public static String[] PLANK_TYPE = new String[] {"Purple Planks", "Green Planks", "Black Planks", "Orange Planks", "Red Planks", "Blue Planks", "Yellow Planks"};

	public ItemPlanks(int par1) {
		super(par1);
        setMaxDamage(0);
        setHasSubtypes(true);
	}
	
    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        int meta = MathHelper.clamp_int(itemStack.getItemDamage(), 0, PLANK_TYPE.length);
        return PLANK_TYPE[meta];
    }
	
    public int getMetadata(int par1)
    {
        return par1;
    }
	
	@SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int par1)
    {
        return MysticStones.Planks.getIcon(2, par1);
    }

}
