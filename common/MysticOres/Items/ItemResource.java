package MysticOres.Items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import MysticOres.MysticOres;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemResource extends Item
{

	private Icon[] icons;
	
    private static final String[] RESOURCE_TYPES = new String[] {"Verdite Ingot", "Mithril Ingot", "Adamantine Ingot", "Iridium Ingot", "Iridium Nugget", "Tourmaline Gem", "Agate Gem", "Topaz Gem",
    	"Amethyst Gem", "Mystic Powder", "Bloodstone Shard", "Glass Shard", "Obsidian Shard", "Obsidian Rod"};
  
	
	public ItemResource(int id) {
		super(id);
        this.setHasSubtypes(true);
        this.setUnlocalizedName("ItemResource");
        this.setCreativeTab(MysticOres.MysticOresTab);
	}
	
    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        int meta = MathHelper.clamp_int(itemStack.getItemDamage(), 0, RESOURCE_TYPES.length);
        return super.getUnlocalizedName() + RESOURCE_TYPES[meta];
    }
  
	 @Override
	 @SideOnly(Side.CLIENT)
	 public void registerIcons(IconRegister iconRegister) {
		 icons = new Icon[RESOURCE_TYPES.length];
		 
	     for (int i = 0; i < RESOURCE_TYPES.length; ++i) {
	    	 icons[i] = iconRegister.registerIcon("MysticTextures" + ":" + "item.resource_" + i);
	     }
	 }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int meta) {
        int j = MathHelper.clamp_int(meta, 0, RESOURCE_TYPES.length);
        return icons[j];
    }
    
    @SideOnly(Side.CLIENT)
    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List) {
    	for (int var4 = 0; var4 < RESOURCE_TYPES.length; var4++){
    		par3List.add(new ItemStack(par1, 1, var4));
    	}
    }
	
}
