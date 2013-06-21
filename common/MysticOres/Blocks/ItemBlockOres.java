package MysticOres.Blocks;

import java.util.List;

import MysticOres.MysticOres;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemBlockOres extends ItemBlock {

	public ItemBlockOres(int par1) {
		super(par1);
        setMaxDamage(0);
        setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack i){
		switch(i.getItemDamage()){
		case 0:return "Adamantine";
		case 1:return "Amethyst";
		case 2:return "Iridium";
		case 3:return "Mithril";
		case 4:return "Sapphire";
		case 5:return "Topaz";
		case 6:return "Verdite";
		case 7:return "Bloodstone";
		case 8:return "BlackSoulstone";
		case 9:return "BlueSoulstone";
		case 10:return "RedSoulstone";
		case 11:return "Agate";
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
        return BlockHandler.BlockOres.getIcon(2, par1);
    }

}
