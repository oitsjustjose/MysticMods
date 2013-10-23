package mysticores.items;

import java.util.List;

import mysticores.MysticOres;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemResource extends Item {
	private Icon[] icons;
	private static final String[] RESOURCE_TYPES = new String[] { "Verdite Ingot", "Mithril Ingot", "Adamantine Ingot", "Iridium Ingot", "Iridium Nugget", "Tourmaline Gem", "Agate Gem", "Topaz Gem",
			"Amethyst Gem", "Mystic Powder", "Bloodstone Shard", "Glass Shard", "Obsidian Shard", "Obsidian Rod" };

	public ItemResource(int id) {
		super(id);
		this.setHasSubtypes(true);
		this.setCreativeTab(MysticOres.MysticOresTab);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int meta) {
		int j = MathHelper.clamp_int(meta, 0, RESOURCE_TYPES.length);
		return icons[j];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List) {
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
	public void registerIcons(IconRegister iconRegister) {
		icons = new Icon[RESOURCE_TYPES.length];
		for (int i = 0; i < RESOURCE_TYPES.length; ++i)
			icons[i] = iconRegister.registerIcon("MysticMods:" + RESOURCE_TYPES[i]);
	}
}
