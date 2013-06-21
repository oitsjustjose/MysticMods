package MysticStones;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemBlockStones extends ItemBlock {

	public ItemBlockStones(int par1) {
		super(par1);
        setMaxDamage(0);
        setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack i){
		switch(i.getItemDamage()){
		case 0:return "AnorthositeSmooth";
		case 1:return "Anorthosite";
		case 2:return "LimestoneSmooth";
		case 3:return "Limestone";
		case 4:return "MarbleSmooth";
		case 5:return "Marble";
		case 6:return "MigmatiteSmooth";
		case 7:return "Migmatite";
		case 8:return "OrthogneissSmooth";
		case 9:return "Orthogneiss";
		case 10:return "SlateSmooth";
		case 11:return "Slate";
		case 12:return "TravertineSmooth";
		case 13:return "Travertine";
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
        return MysticStones.Stones.getIcon(2, par1);
    }
 
}
