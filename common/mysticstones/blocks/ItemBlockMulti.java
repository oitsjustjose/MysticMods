package mysticstones.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.ArrayList;

public class ItemBlockMulti extends ItemBlockWithMetadata {
	private ArrayList<String> types;
	public ItemBlockMulti(Block block, ArrayList<String> names) {
		super(block, block);
		this.types = names;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		int meta = MathHelper.clamp_int(itemStack.getItemDamage(), 0, types.size());
		return types.get(meta);
	}
}
