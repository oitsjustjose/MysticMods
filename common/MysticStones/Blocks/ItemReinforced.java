package MysticStones.Blocks;

import java.util.List;

import MysticStones.MysticStones;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;

public class ItemReinforced extends ItemBlock {
	
	public static String[] BRICK_TYPE = new String[] {"Mithril", "Verdite", "Iridium", "Adamantine", "Tourmaline", "Topaz", "Amethyst", "Agate"};

	public ItemReinforced(int par1) {
		super(par1);
        setMaxDamage(0);
        setHasSubtypes(true);
	}
	
	
    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        int meta = MathHelper.clamp_int(itemStack.getItemDamage(), 0, BRICK_TYPE.length);
        return BRICK_TYPE[meta] + " Bricks";
    }
    
    public int getMetadata(int par1)
    {
        return par1;
    }
    
    @SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		if(par2EntityPlayer.isSneaking() == true)
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
