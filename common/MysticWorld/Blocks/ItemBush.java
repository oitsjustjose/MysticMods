package MysticWorld.Blocks;

import java.util.List;

import MysticWorld.Lib.Strings;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;

public class ItemBush extends ItemBlock {

	public static String[] BUSH_TYPES = new String[] {Strings.BUSH_NAME, Strings.POISON_BUSH_NAME, Strings.WEAKNESS_BUSH_NAME, Strings.SLOWNESS_BUSH_NAME,
		Strings.HARMING_BUSH_NAME, Strings.WITHER_BUSH_NAME, Strings.HEALTH_BUSH_NAME, Strings.SPEED_BUSH_NAME, Strings.FIRE_RESISTANCE_BUSH_NAME,
		Strings.REGEN_BUSH_NAME, Strings.NIGHT_VISION_BUSH_NAME, Strings.INVISIBILITY_BUSH_NAME};
	
	public ItemBush(int par1) {
		super(par1);
        setMaxDamage(0);
        setHasSubtypes(true);
	}
	
    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
    	int meta = MathHelper.clamp_int(itemStack.getItemDamage(), 0, BUSH_TYPES.length);
        return super.getUnlocalizedName() + BUSH_TYPES[meta];
    }
	
	
    public int getMetadata(int par1)
    {
        return par1;
    }
	
	@SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int par1)
    {
        return BlockHandler.bush.getIcon(2, par1);
    }

}
