package mysticstones.blocks;

import mysticstones.MysticStones;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemStoneBricks extends ItemBlock {
	public static String[] STONEBRICK_TYPES = new String[] { "Anorthosite Bricks", "Limestone Bricks", "Marble Bricks", "Migmatite Bricks", "Orthogneiss Bricks", "Slate Bricks", "Travertine Bricks" };

	public ItemStoneBricks(int par1) {
		super(par1);
		setMaxDamage(0);
		setHasSubtypes(true);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int par1) {
		return MysticStones.StoneBricks.getIcon(2, par1);
	}

	@Override
	public int getMetadata(int par1) {
		return par1;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		int meta = MathHelper.clamp_int(itemStack.getItemDamage(), 0, STONEBRICK_TYPES.length);
		return STONEBRICK_TYPES[meta];
	}
}
