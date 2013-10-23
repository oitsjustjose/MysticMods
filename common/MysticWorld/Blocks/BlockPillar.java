package mysticworld.blocks;

import mysticworld.MysticWorld;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockPillar extends Block {
	public BlockPillar(int id) {
		super(id, Material.rock);
		setBlockUnbreakable();
		setResistance(6000000.0F);
		setCreativeTab(MysticWorld.MysticWorldTab);
		setBlockBounds(0.15F, 0.0F, 0.15F, 0.85F, 1.0F, 0.85F);
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon("MysticMods" + ":" + "Pillar");
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}
}
