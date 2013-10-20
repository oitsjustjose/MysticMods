package mysticworld.items;

import mysticworld.MysticWorld;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class ItemOrbFire extends ItemOrb {
	public ItemOrbFire(int id) {
		super(id);
	}

	public boolean itemInteractionForEntity(ItemStack itemStack, EntityLiving entityLiving) {
		entityLiving.setFire(5);
		entityLiving.attackEntityFrom(DamageSource.magic, 7);
		itemStack.damageItem(1, entityLiving);
		return true;
	}

	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
		if (par7 == 0) {
			--par5;
		}
		if (par7 == 1) {
			++par5;
		}
		if (par7 == 2) {
			--par6;
		}
		if (par7 == 3) {
			++par6;
		}
		if (par7 == 4) {
			--par4;
		}
		if (par7 == 5) {
			++par4;
		}
		if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack)) {
			return false;
		} else {
			if (par3World.isAirBlock(par4, par5, par6)) {
				par3World.playSoundEffect(par4 + 0.5D, par5 + 0.5D, par6 + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
				par3World.setBlock(par4, par5, par6, Block.fire.blockID);
			}
			par1ItemStack.damageItem(1, par2EntityPlayer);
			return true;
		}
	}

	@Override
	public boolean onLeftClickEntity(ItemStack itemStack, EntityPlayer entityPlayer, Entity entity) {
		entity.setFire(5);
		entity.attackEntityFrom(DamageSource.magic, 7);
		itemStack.damageItem(1, entityPlayer);
		return true;
	}

	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int par4, boolean par5) {
		EntityPlayer player = (EntityPlayer) entity;
		ItemStack currentItem = player.inventory.getCurrentItem();
		if (!world.isRemote) {
			if (currentItem != null) {
				if (currentItem.itemID == itemStack.itemID) {
					player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 20, 0));
					MysticWorld.proxy.fireFX(world, (player.posX - 0.5D) + rand.nextDouble(), player.posY, (player.posZ - 0.5D) + rand.nextDouble(), 1.0F);
				}
			}
		}
	}
}
