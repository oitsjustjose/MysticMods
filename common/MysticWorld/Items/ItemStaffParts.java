package mysticworld.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mysticworld.MysticWorld;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

import java.util.List;

public class ItemStaffParts extends Item {
	private IIcon[] icons;
	private static final String[] STAFF_PARTS = new String[] { "Staff", "Hilt", "Handle", "Head" };

	public ItemStaffParts() {
		super();
		this.setHasSubtypes(true);
		this.setCreativeTab(MysticWorld.MysticWorldTab);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int meta) {
		int j = MathHelper.clamp_int(meta, 0, STAFF_PARTS.length);
		return icons[j];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List par3List) {
		for (int var4 = 0; var4 < STAFF_PARTS.length; var4++) {
			par3List.add(new ItemStack(par1, 1, var4));
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		int meta = MathHelper.clamp_int(itemStack.getItemDamage(), 0, 5);
		return STAFF_PARTS[meta];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean isFull3D() {
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		icons = new IIcon[STAFF_PARTS.length];
		for (int i = 0; i < STAFF_PARTS.length; ++i) {
			icons[i] = iconRegister.registerIcon("mysticworld:StaffPart_" + STAFF_PARTS[i]);
		}
	}
}
