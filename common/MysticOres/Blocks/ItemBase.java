package mysticores.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.ArrayList;

public class ItemBase extends ItemBlockWithMetadata {
    public final ArrayList<String> names;
	public ItemBase(Block block, ArrayList<String> names) {
		super(block, block);
        this.names = names;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		int meta = MathHelper.clamp_int(itemStack.getItemDamage(), 0, names.size());
		return names.get(meta);
	}
}
