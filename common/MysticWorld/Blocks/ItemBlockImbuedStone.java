package MysticWorld.Blocks;

import java.util.List;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemBlockImbuedStone extends ItemBlock {

	public ItemBlockImbuedStone(int par1) {
		super(par1);
        setMaxDamage(0);
        setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack i){
		switch(i.getItemDamage()){
		case 0:return "Fire";
		case 1:return "Water";
		case 2:return "Earth";
		case 3:return "Air";
		case 4:return "Energy";
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
        return BlockHandler.oreImbuedStone.getIcon(2, par1);
    }

}
