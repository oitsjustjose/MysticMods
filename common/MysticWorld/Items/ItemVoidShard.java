package mysticworld.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mysticworld.MysticWorld;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import java.util.List;

public class ItemVoidShard extends Item {
	public ItemVoidShard() {
		super();
		this.setMaxStackSize(1);
		this.setCreativeTab(MysticWorld.MysticWorldTab);
		this.setMaxDamage(1);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean par4) {
		if (itemStack.stackTagCompound == null)
			itemStack.setTagCompound(new NBTTagCompound());
		list.add("Experience Stored: " + Integer.toString(itemStack.stackTagCompound.getInteger("xpStored")));
	}

	@Override
	public boolean hasEffect(ItemStack itemStack, int i) {
		if (itemStack.stackTagCompound == null)
			itemStack.setTagCompound(new NBTTagCompound());
		if (itemStack.stackTagCompound.hasKey("filled")) {
			return itemStack.stackTagCompound.getBoolean("filled");
		} else {
			return false;
		}
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
		if (itemStack.stackTagCompound == null)
			itemStack.setTagCompound(new NBTTagCompound());
		int experience = entityPlayer.experienceLevel;
		int experienceSubtract = entityPlayer.experienceLevel - 30;
		if (!itemStack.stackTagCompound.getBoolean("filled")) {
			if (experience > 0 && experience <= 30) {
				entityPlayer.experienceLevel = 0;
				itemStack.stackTagCompound.setInteger("xpStored", experience);
				itemStack.stackTagCompound.setBoolean("filled", true);
			} else if (experience > 30) {
				entityPlayer.experienceLevel = experienceSubtract;
				itemStack.stackTagCompound.setInteger("xpStored", 30);
				itemStack.stackTagCompound.setBoolean("filled", true);
			}
		} else {
			entityPlayer.experienceLevel += itemStack.stackTagCompound.getInteger("xpStored");
			itemStack.stackTagCompound.setInteger("xpStored", 0);
			itemStack.stackTagCompound.setBoolean("filled", false);
			itemStack.damageItem(2, entityPlayer);
		}
		return itemStack;
	}
}
