package mysticstones.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItemReinforced extends ItemBlockMulti {
	public static final ArrayList<String> BRICK_TYPE = new ArrayList<String>(Arrays.asList("Mithril Bricks", "Verdite Bricks", "Iridium Bricks", "Adamantine Bricks", "Tourmaline Bricks", "Topaz Bricks", "Amethyst Bricks",
			"Agate Bricks"));

	public ItemReinforced(Block block) {
		super(block, BRICK_TYPE);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        super.addInformation(par1ItemStack, par2EntityPlayer, par3List, par4);
		if (par4) {
			par3List.add("Works As A Beacon Block Too!");
		}
	}
}
