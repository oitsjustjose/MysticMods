package mysticores.items;

import mysticores.MysticOres;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;

public class ItemHoes extends ItemHoe {
	public ItemHoes(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(MysticOres.MysticOresTab);
	}

	@Override
	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("MysticMods" + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
}
