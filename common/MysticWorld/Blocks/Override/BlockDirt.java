package MysticWorld.Blocks.Override;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import MysticWorld.MysticWorld;
import MysticWorld.Blocks.ItemBlockBush;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class BlockDirt extends Block
{
    public BlockDirt(int par1)
    {
        super(par1, Material.ground);
        this.setCreativeTab(MysticWorld.MysticWorldTab);
        setHardness(0.5F);
        setStepSound(Block.soundGravelFootstep);
        setUnlocalizedName("MysticDirt");
    }
    
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister)
	{
		this.blockIcon = iconRegister.registerIcon("MysticTextures:MysticDirt");
	}
}
