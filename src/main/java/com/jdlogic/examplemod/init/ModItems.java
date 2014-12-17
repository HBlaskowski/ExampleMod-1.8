package com.jdlogic.examplemod.init;

import com.jdlogic.examplemod.item.*;
import com.jdlogic.examplemod.reference.Material;
import com.jdlogic.examplemod.reference.Names;
import com.jdlogic.examplemod.reference.Reference;
import com.jdlogic.examplemod.reference.Settings;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemEM sapphire = new ItemGemEM(Names.Items.SAPPHIRE);
    public static final ItemEM ruby = new ItemGemEM(Names.Items.RUBY);

    public static final ItemPickaxeEM sapphire_pickaxe = new ItemPickaxeEM(Material.Tools.SAPPHIRE, Names.Tools.SAPPHIRE_PICKAXE);
    public static final ItemAxeEM sapphire_axe = new ItemAxeEM(Material.Tools.SAPPHIRE, Names.Tools.SAPPHIRE_AXE);
    public static final ItemSpadeEM sapphire_shovel = new ItemSpadeEM(Material.Tools.SAPPHIRE, Names.Tools.SAPPHIRE_SHOVEL);
    public static final ItemHoeEM sapphire_hoe = new ItemHoeEM(Material.Tools.SAPPHIRE, Names.Tools.SAPPHIRE_HOE);

    public static final ItemPickaxeEM ruby_pickaxe = new ItemPickaxeEM(Material.Tools.RUBY, Names.Tools.RUBY_PICKAXE);
    public static final ItemAxeEM ruby_axe = new ItemAxeEM(Material.Tools.RUBY, Names.Tools.RUBY_AXE);
    public static final ItemSpadeEM ruby_shovel = new ItemSpadeEM(Material.Tools.RUBY, Names.Tools.RUBY_SHOVEL);
    public static final ItemHoeEM ruby_hoe = new ItemHoeEM(Material.Tools.RUBY, Names.Tools.RUBY_HOE);

    public static final ItemSwordEM sapphire_sword = new ItemSwordEM(Material.Tools.SAPPHIRE, Names.Weapons.SAPPHIRE_SWORD);
    public static final ItemSwordEM ruby_sword = new ItemSwordEM(Material.Tools.RUBY, Names.Weapons.RUBY_SWORD);

    public static final ItemBowEM sapphire_bow = new ItemBowEM(Names.Weapons.SAPPHIRE_BOW, 750);
    public static final ItemBowEM ruby_bow = new ItemBowEM(Names.Weapons.RUBY_BOW, 500);

    public static final ItemArmorEM sapphire_helmet = new ItemArmorEM(Material.Armor.SAPPHIRE, 3, 0, Names.Armor.SAPPHIRE_HELMET);
    public static final ItemArmorEM sapphire_chestplate = new ItemArmorEM(Material.Armor.SAPPHIRE, 3, 1, Names.Armor.SAPPHIRE_CHESTPLATE);
    public static final ItemArmorEM sapphire_leggings = new ItemArmorEM(Material.Armor.SAPPHIRE, 3, 2, Names.Armor.SAPPHIRE_LEGGINGS);
    public static final ItemArmorEM sapphire_boots = new ItemArmorEM(Material.Armor.SAPPHIRE, 3, 3, Names.Armor.SAPPHIRE_BOOTS);

    public static final ItemArmorEM ruby_helmet = new ItemArmorEM(Material.Armor.RUBY, 3, 0, Names.Armor.RUBY_HELMET);
    public static final ItemArmorEM ruby_chestplate = new ItemArmorEM(Material.Armor.RUBY, 3, 1, Names.Armor.RUBY_CHESTPLATE);
    public static final ItemArmorEM ruby_leggings = new ItemArmorEM(Material.Armor.RUBY, 3, 2, Names.Armor.RUBY_LEGGINGS);
    public static final ItemArmorEM ruby_boots = new ItemArmorEM(Material.Armor.RUBY, 3, 3, Names.Armor.RUBY_BOOTS);

    public static void init()
    {
            if (Settings.General.enableModItems)
            {
                GameRegistry.registerItem(sapphire, Names.Items.SAPPHIRE);
                GameRegistry.registerItem(ruby, Names.Items.RUBY);

                GameRegistry.registerItem(sapphire_pickaxe, Names.Tools.SAPPHIRE_PICKAXE);
                GameRegistry.registerItem(sapphire_axe, Names.Tools.SAPPHIRE_AXE);
                GameRegistry.registerItem(sapphire_shovel, Names.Tools.SAPPHIRE_SHOVEL);
                GameRegistry.registerItem(sapphire_hoe, Names.Tools.SAPPHIRE_HOE);

                GameRegistry.registerItem(ruby_pickaxe, Names.Tools.RUBY_PICKAXE);
                GameRegistry.registerItem(ruby_axe, Names.Tools.RUBY_AXE);
                GameRegistry.registerItem(ruby_shovel, Names.Tools.RUBY_SHOVEL);
                GameRegistry.registerItem(ruby_hoe, Names.Tools.RUBY_HOE);

                GameRegistry.registerItem(sapphire_sword, Names.Weapons.SAPPHIRE_SWORD);
                GameRegistry.registerItem(ruby_sword, Names.Weapons.RUBY_SWORD);

                GameRegistry.registerItem(sapphire_bow, Names.Weapons.SAPPHIRE_BOW);
                GameRegistry.registerItem(ruby_bow, Names.Weapons.RUBY_BOW);

                GameRegistry.registerItem(sapphire_helmet, Names.Armor.SAPPHIRE_HELMET);
                GameRegistry.registerItem(sapphire_chestplate, Names.Armor.SAPPHIRE_CHESTPLATE);
                GameRegistry.registerItem(sapphire_leggings, Names.Armor.SAPPHIRE_LEGGINGS);
                GameRegistry.registerItem(sapphire_boots, Names.Armor.SAPPHIRE_BOOTS);

                GameRegistry.registerItem(ruby_helmet, Names.Armor.RUBY_HELMET);
                GameRegistry.registerItem(ruby_chestplate, Names.Armor.RUBY_CHESTPLATE);
                GameRegistry.registerItem(ruby_leggings, Names.Armor.RUBY_LEGGINGS);
                GameRegistry.registerItem(ruby_boots, Names.Armor.RUBY_BOOTS);
            }
    }
}
