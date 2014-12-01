package com.jdlogic.examplemod.init;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class ModRecipies
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.charcoal_block), "SSS", "SSS", "SSS", 'S', new ItemStack(Items.coal, 1, 1)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.coal, 9, 1), new ItemStack(ModBlocks.charcoal_block)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.sapphire_pickaxe), "XXX", " # ", " # ", 'X', new ItemStack(ModItems.sapphire), '#', new ItemStack(Items.stick)));
    }
}
