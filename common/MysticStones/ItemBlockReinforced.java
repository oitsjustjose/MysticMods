package MysticStones;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemBlockReinforced extends ItemBlock {

	public ItemBlockReinforced(int par1) {
		super(par1);
        setMaxDamage(0);
        setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack i){
		switch(i.getItemDamage()){
		case 0:return "MithrilBricks";
		case 1:return "VerditeBricks";
		case 2:return "IridiumBricks";
		case 3:return "AdamantineBricks";
		case 4:return "TourmalineBricks";
		case 5:return "TopazBricks";
		case 6:return "AmethystBricks";
		case 7:return "AgateBricks";
		default:return "";
		}
	}
	
    public int getMetadata(int par1)
    {
        return par1;
    }
    
    @SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		if(par2EntityPlayer.isSneaking() == false)
		{
			par3List.add("Works As A Beacon Block Too!");
		}
	}
	
	
	@SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int par1)
    {
        return MysticStones.ReinforcedBricks.getIcon(2, par1);
    }

}
