package mysticores.blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBase extends ItemBlock {
	public static String[] BLOCK_NAMES = new String[] { "Adamantine Ore", "Amethyst Ore", "Iridium Ore", "Mithril Ore", "Tourmaline Ore", "Topaz Ore", "Verdite Ore", "Bloodstone", "Black Soulstone",
			"Blue Soulstone", "Red Soulstone", "Agate Ore", "Tempered Glass" };

	public ItemBase(int par1) {
		super(par1);
		setMaxDamage(0);
		setHasSubtypes(true);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int par1) {
		return BlockHandler.BlockBase.getIcon(2, par1);
	}

	@Override
	public int getMetadata(int par1) {
		return par1;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		int meta = MathHelper.clamp_int(itemStack.getItemDamage(), 0, BLOCK_NAMES.length);
		return BLOCK_NAMES[meta];
	}
}
