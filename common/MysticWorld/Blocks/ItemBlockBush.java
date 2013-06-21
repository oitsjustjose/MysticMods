package MysticWorld.Blocks;

import java.util.List;

import MysticWorld.Lib.Strings;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemBlockBush extends ItemBlock {

	public ItemBlockBush(int par1) {
		super(par1);
        setMaxDamage(0);
        setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack i){
		switch(i.getItemDamage()){
		case 0:return Strings.BUSH_NAME;
		case 1:return Strings.POISON_BUSH_NAME;
		case 2:return Strings.WEAKNESS_BUSH_NAME;
		case 3:return Strings.SLOWNESS_BUSH_NAME;
		case 4:return Strings.HARMING_BUSH_NAME;
		case 5:return Strings.WITHER_BUSH_NAME;
		case 6:return Strings.HEALTH_BUSH_NAME;
		case 7:return Strings.SPEED_BUSH_NAME;
		case 8:return Strings.FIRE_RESISTANCE_BUSH_NAME;
		case 9:return Strings.REGEN_BUSH_NAME;
		case 10:return Strings.NIGHT_VISION_BUSH_NAME;
		case 11:return Strings.INVISIBILITY_BUSH_NAME;
		default:return "";
		}
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
