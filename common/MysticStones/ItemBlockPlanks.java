package MysticStones;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemBlockPlanks extends ItemBlock {

	public ItemBlockPlanks(int par1) {
		super(par1);
        setMaxDamage(0);
        setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack i){
		switch(i.getItemDamage()){
		case 0:return "BlackPlank";
		case 1:return "RedPlank";
		case 2:return "GreenPlank";
		case 3:return "PurplePlank";
		case 4:return "BluePlank";
		case 5:return "LimePlank";
		case 6:return "YellowPlank";
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
        return MysticStones.Planks.getIcon(2, par1);
    }

}
