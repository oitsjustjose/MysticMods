package mysticworld.items;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraftforge.common.EnumHelper;

public class EnumArmor
{
	static EnumArmorMaterial Verdite = EnumHelper.addArmorMaterial("Verdite", 262, new int[]{2, 5, 4, 1}, 5);
	static EnumArmorMaterial Mithril = EnumHelper.addArmorMaterial("Mithril", 500, new int[]{2, 7, 6, 2}, 9);
	static EnumArmorMaterial Adamantine = EnumHelper.addArmorMaterial("Adamantine", 3000, new int[]{4, 9, 6, 4}, 13);
	static EnumArmorMaterial Iridium = EnumHelper.addArmorMaterial("Iridium", 4000, new int[]{4, 10, 7, 5}, 15);
}
