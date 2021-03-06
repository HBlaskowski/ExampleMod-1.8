package com.jdlogic.examplemod.init;

import com.jdlogic.examplemod.item.crafting.RecipesToolsEM;
import com.jdlogic.examplemod.item.crafting.RecipesWeaponsEM;
import com.jdlogic.examplemod.item.crafting.RecipiesArmorEM;
import com.jdlogic.examplemod.reference.Reference;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModRecipies
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.charcoal_block), "SSS", "SSS", "SSS", 'S', new ItemStack(Items.coal, 1, 1)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.coal, 9, 1), "blockCharcoal"));

        GameRegistry.addSmelting(new ItemStack(ModBlocks.nether_sapphire_ore), new ItemStack(ModBlocks.sapphire_ore, 2), 2.5F);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.end_sapphire_ore), new ItemStack(ModBlocks.sapphire_ore, 4), 3.0F);

        GameRegistry.addSmelting(new ItemStack(ModBlocks.nether_ruby_ore), new ItemStack(ModBlocks.ruby_ore, 2), 1.5F);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.end_ruby_ore), new ItemStack(ModBlocks.ruby_ore, 4), 2.0F);

        (new RecipesToolsEM()).addRecipes();
        (new RecipesWeaponsEM()).addRecipes();
        (new RecipiesArmorEM()).addRecipes();
    }
}
