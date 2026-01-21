package mysticworld.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mysticworld.MysticWorld;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemStaff extends Item {
	public ItemStaff() {
		super();
		this.setMaxStackSize(1);
		this.setMaxDamage(200);
		this.setCreativeTab(MysticWorld.MysticWorldTab);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean isFull3D() {
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister) {
	}
}
