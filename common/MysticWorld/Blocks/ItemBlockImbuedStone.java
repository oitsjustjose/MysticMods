package MysticWorld.Blocks;

import java.util.List;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;

public class ItemBlockImbuedStone extends ItemBlock {
	
	public static String[] IMBUED_STONE_TYPE = new String[] {"Fire", "Water", "Earth", "Air", "Energy"};

	public ItemBlockImbuedStone(int par1) {
		super(par1);
        setMaxDamage(0);
        setHasSubtypes(true);
	}
	
	
    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
    	int meta = MathHelper.clamp_int(itemStack.getItemDamage(), 0, IMBUED_STONE_TYPE.length);
        return super.getUnlocalizedName() + IMBUED_STONE_TYPE[meta];
    }
	
	
    public int getMetadata(int par1)
    {
        return par1;
    }
	
	@SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int par1)
    {
        return BlockHandler.oreImbuedStone.getIcon(2, par1);
    }

}
