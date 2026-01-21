package mysticores.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSatchel extends Item {
	public ItemSatchel() {
		super();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack, int i) {
		return true;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack is, World world, EntityPlayer player) {
		if (!player.isSneaking()) {
			player.displayGUIChest(player.getInventoryEnderChest());
		}
		return is;
	}
}
