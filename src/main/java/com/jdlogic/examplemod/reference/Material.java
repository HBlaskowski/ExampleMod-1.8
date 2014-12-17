package com.jdlogic.examplemod.reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class Material
{
    public static final class Tools
    {
        public static final Item.ToolMaterial SAPPHIRE = EnumHelper.addToolMaterial(Names.Materials.SAPPHIRE, 3, 906, 8.0F, 3.0F, 30);
        public static final Item.ToolMaterial RUBY = EnumHelper.addToolMaterial(Names.Materials.RUBY, 2, 500, 6.0F, 2.0F, 10);
    }

    public static final class Armor
    {
        public static final ItemArmor.ArmorMaterial SAPPHIRE = EnumHelper.addArmorMaterial(Names.Materials.SAPPHIRE, Names.Materials.SAPPHIRE, 15, new int[]{2, 6, 5, 2}, 25);
        public static final ItemArmor.ArmorMaterial RUBY = EnumHelper.addArmorMaterial(Names.Materials.RUBY, Names.Materials.RUBY, 30, new int[]{2, 6, 5, 2}, 10);
    }
}
