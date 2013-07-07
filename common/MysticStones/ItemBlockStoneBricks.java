package MysticStones;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;

public class ItemBlockStoneBricks extends ItemBlock {
	
	public static String[] STONEBRICK_TYPES = new String[] {"Anorthosite Bricks", "Limestone Bricks", "Marble Bricks", "Migmatite Bricks", "Orthogneiss Bricks", "Slate Bricks", "Travertine Bricks"};

	public ItemBlockStoneBricks(int par1) {
		super(par1);
        setMaxDamage(0);
        setHasSubtypes(true);
	}
	
    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        int meta = MathHelper.clamp_int(itemStack.getItemDamage(), 0, STONEBRICK_TYPES.length);
        return super.getUnlocalizedName() + STONEBRICK_TYPES[meta];
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
