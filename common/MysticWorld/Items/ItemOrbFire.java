package mysticworld.items;

import mysticworld.MysticWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class ItemOrbFire extends ItemOrb {
	public ItemOrbFire() {
		super();
	}

	@Override
	public boolean itemInteractionForEntity(ItemStack itemStack, EntityPlayer entityPlayer, EntityLivingBase entity) {
		entity.setFire(5);
		entity.attackEntityFrom(DamageSource.magic, 7);
		itemStack.damageItem(1, entityPlayer);
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
				par3World.setBlock(par4, par5, par6, Blocks.fire);
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
		if (entity instanceof EntityPlayer && par5) {
            ((EntityPlayer)entity).addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 20, 0));
			MysticWorld.proxy.fireFX(world, (entity.posX - 0.5D) + itemRand.nextDouble(), entity.posY, (entity.posZ - 0.5D) + itemRand.nextDouble(), 1.0F);
		}
	}
}
