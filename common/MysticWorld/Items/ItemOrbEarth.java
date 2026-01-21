package mysticworld.items;

import cpw.mods.fml.common.eventhandler.Event;
import mysticworld.MysticWorld;
import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class ItemOrbEarth extends ItemOrb {
	public ItemOrbEarth() {
		super();
	}

	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
		if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack)) {
			return false;
		} else {
			if (applyBonemeal(par1ItemStack, par3World, par4, par5, par6, par2EntityPlayer)) {
				if (!par3World.isRemote) {
					par3World.playAuxSFX(2005, par4, par5, par6, 0);
				}
				return true;
			}
			return false;
		}
	}

	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int par4, boolean par5) {
		EntityPlayer player = (EntityPlayer) entity;
		if (par5) {
			MysticWorld.proxy.earthFX(world, (player.posX - 0.5D) + itemRand.nextDouble(), player.posY, (player.posZ - 0.5D) + itemRand.nextDouble(), 1.0F);
		}
	}

	public static boolean applyBonemeal(ItemStack itemStack, World world, int x, int y, int z, EntityPlayer player) {
        Block block = world.getBlock(x, y, z);
        BonemealEvent event = new BonemealEvent(player, world, block, x, y, z);
        if (MinecraftForge.EVENT_BUS.post(event)){
            return false;
        }
        if (event.getResult() == Event.Result.ALLOW){
            if (!world.isRemote){
                itemStack.damageItem(1, player);
            }
            return true;
        }
        if (block instanceof IGrowable){
            IGrowable igrowable = (IGrowable)block;
            if (igrowable.func_149851_a(world, x, y, z, world.isRemote)){
                if (!world.isRemote){
                    if (igrowable.func_149852_a(world, world.rand, x, y, z)){
                        igrowable.func_149853_b(world, world.rand, x, y, z);
                    }
                    itemStack.damageItem(1, player);
                }
                return true;
            }
        }
        return false;
	}
}
