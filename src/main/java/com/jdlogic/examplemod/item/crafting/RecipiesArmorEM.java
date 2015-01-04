package com.jdlogic.examplemod.item.crafting;

import com.jdlogic.examplemod.init.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class RecipiesArmorEM
{
    private String[][] recipePatterns = new String[][] {{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
    private Object[][] recipeItems;

    public RecipiesArmorEM()
    {
        this.recipeItems = new Object[][]
                {
                        {"gemSapphire", "gemRuby"},
                        {ModItems.sapphire_helmet, ModItems.ruby_helmet},
                        {ModItems.sapphire_chestplate, ModItems.ruby_chestplate},
                        {ModItems.sapphire_leggings, ModItems.ruby_leggings},
                        {ModItems.sapphire_boots, ModItems.ruby_boots}
                };
    }

    public void addRecipes()
    {
        for (int i = 0; i < this.recipeItems[0].length; ++i)
        {
            Object object = this.recipeItems[0][i];

            for (int j = 0; j < this.recipeItems.length - 1; ++j)
            {
                Item item = (Item)this.recipeItems[j + 1][i];
                GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(item), new Object[]{this.recipePatterns[j], 'X', object}));
            }
        }
    }
}
