package MysticStones;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemBlockStoneBricks extends ItemBlock {

	public ItemBlockStoneBricks(int par1) {
		super(par1);
        setMaxDamage(0);
        setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack i){
		switch(i.getItemDamage()){
		case 0:return "AnorthositeBricks";
		case 1:return "LimestoneBricks";
		case 2:return "MarbleBricks";
		case 3:return "MigmatiteBricks";
		case 4:return "OrthogneissBricks";
		case 5:return "SlateBricks";
		case 6:return "TravertineBricks";
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
        return MysticStones.StoneBricks.getIcon(2, par1);
    }


}
