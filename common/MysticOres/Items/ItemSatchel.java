package MysticOres.Items;

import MysticOres.MysticOres;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.*;
import net.minecraft.world.World;

public class ItemSatchel extends Item
{

	public ItemSatchel(int par1)
	{
		super(par1);
		setCreativeTab(MysticOres.MysticOresTab);
		maxStackSize = 1;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack is, World world, EntityPlayer player)
	{
		if(!player.isSneaking())
		{
			IInventory inv;
			inv = player.getInventoryEnderChest();
			player.displayGUIChest(inv);
		}
		return is;
	}
	
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return true;
    }
	
	  @Override
	  public void registerIcons(IconRegister iconRegister)
	  {
	           itemIcon = iconRegister.registerIcon("MysticTextures" + ":" + this.getUnlocalizedName());
	  }
}
