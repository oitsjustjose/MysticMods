package mysticstones.blocks;

import mysticstones.MysticStones;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemStones extends ItemBlock {
	public static String[] STONE_TYPES = new String[] { "Smooth Anorthosite", "Anorthosite", "Smooth Limestone", "Limestone", "Smooth Marble", "Marble", "Smooth Migmatite", "Migmatite",
			"Smooth Orthogneiss", "Orthogneiss", "Smooth Slate", "Slate", "Smooth Travertine", "Travertine" };

	public ItemStones(int par1) {
		super(par1);
		setMaxDamage(0);
		setHasSubtypes(true);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int par1) {
		return MysticStones.Stones.getIcon(2, par1);
	}

	@Override
	public int getMetadata(int par1) {
		return par1;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		int meta = MathHelper.clamp_int(itemStack.getItemDamage(), 0, STONE_TYPES.length);
		return STONE_TYPES[meta];
	}
}
