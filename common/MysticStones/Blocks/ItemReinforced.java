package mysticstones.blocks;

import java.util.List;

import mysticstones.MysticStones;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemReinforced extends ItemBlockMulti {
	public static final String[] BRICK_TYPE = new String[] { "Mithril Bricks", "Verdite Bricks", "Iridium Bricks", "Adamantine Bricks", "Tourmaline Bricks", "Topaz Bricks", "Amethyst Bricks",
			"Agate Bricks" };

	public ItemReinforced(int par1) {
		super(par1, MysticStones.ReinforcedBricks, BRICK_TYPE);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		if (par4) {
			par3List.add("Works As A Beacon Block Too!");
		}
	}
}
