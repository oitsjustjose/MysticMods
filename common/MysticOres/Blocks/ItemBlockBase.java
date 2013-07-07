package MysticOres.Blocks;

import java.util.List;

import MysticOres.MysticOres;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;

public class ItemBlockBase extends ItemBlock {
	
	public static String[] BLOCK_NAMES = new String[] {"Adamantine Ore", "Amethyst Ore", "Iridium Ore", "Mithril Ore", "Tourmaline Ore", "Topaz Ore", "Verdite Ore", "Bloodstone", "Black Soulstone", 
		"Blue Soulstone", "Red Soulstone", "Agate Ore", "Reinforced Glass"};

	public ItemBlockBase(int par1) {
		super(par1);
        setMaxDamage(0);
        setHasSubtypes(true);
	}
	
    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        int meta = MathHelper.clamp_int(itemStack.getItemDamage(), 0, BLOCK_NAMES.length);
        return super.getUnlocalizedName() + BLOCK_NAMES[meta];
    }
	
    public int getMetadata(int par1)
    {
        return par1;
    }
	
	@SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int par1)
    {
        return BlockHandler.BlockBase.getIcon(2, par1);
    }
}
