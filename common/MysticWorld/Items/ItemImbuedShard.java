package mysticworld.items;

import java.util.List;

import mysticworld.MysticWorld;
import mysticworld.lib.Strings;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemImbuedShard extends Item {
	private Icon[] icons;
	private static final String[] SHARD_TYPES = new String[] { "Fire", "Water", "Earth", "Air", "Energy" };

	public ItemImbuedShard(int id) {
		super(id);
		this.setHasSubtypes(true);
		this.setUnlocalizedName(Strings.IMBUED_SHARD_NAME);
		this.setCreativeTab(MysticWorld.MysticWorldTab);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int meta) {
		int j = MathHelper.clamp_int(meta, 0, 5);
		return icons[j];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List) {
		for (int var4 = 0; var4 < SHARD_TYPES.length; var4++) {
			par3List.add(new ItemStack(par1, 1, var4));
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		int meta = MathHelper.clamp_int(itemStack.getItemDamage(), 0, 5);
		return super.getUnlocalizedName() + SHARD_TYPES[meta];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		icons = new Icon[SHARD_TYPES.length];
		for (int i = 0; i < SHARD_TYPES.length; ++i) {
			icons[i] = iconRegister.registerIcon("MysticMods:Shard" + SHARD_TYPES[i]);
		}
	}
}
