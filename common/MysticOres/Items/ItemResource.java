package mysticores.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

import java.util.List;

public class ItemResource extends Item {
	private IIcon[] icons;
	private static final String[] RESOURCE_TYPES = new String[] { "Verdite Ingot", "Mithril Ingot", "Adamantine Ingot", "Iridium Ingot", "Iridium Nugget", "Tourmaline Gem", "Agate Gem", "Topaz Gem",
			"Amethyst Gem", "Mystic Powder", "Bloodstone Shard", "Glass Shard", "Obsidian Shard", "Obsidian Rod" };

	public ItemResource() {
		super();
		this.setHasSubtypes(true);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int meta) {
		int j = MathHelper.clamp_int(meta, 0, RESOURCE_TYPES.length);
		return icons[j];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List par3List) {
		for (int var4 = 0; var4 < RESOURCE_TYPES.length; var4++)
			par3List.add(new ItemStack(par1, 1, var4));
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		int meta = MathHelper.clamp_int(itemStack.getItemDamage(), 0, RESOURCE_TYPES.length);
		return RESOURCE_TYPES[meta];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		icons = new IIcon[RESOURCE_TYPES.length];
		for (int i = 0; i < RESOURCE_TYPES.length; ++i)
			icons[i] = iconRegister.registerIcon("mysticores:" + RESOURCE_TYPES[i]);
	}
}
