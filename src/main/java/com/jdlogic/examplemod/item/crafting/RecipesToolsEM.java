package com.jdlogic.examplemod.item.crafting;

import com.jdlogic.examplemod.init.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class RecipesToolsEM
{
    private String[][] recipePatterns = new String[][] {{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
    private Object[][] recipeItems;

    public RecipesToolsEM()
    {
        this.recipeItems = new Object[][]
                {
                        {"gemSapphire", "gemRuby"},
                        {ModItems.sapphire_pickaxe, ModItems.ruby_pickaxe},
                        {ModItems.sapphire_shovel, ModItems.ruby_shovel},
                        {ModItems.sapphire_axe,ModItems.ruby_axe},
                        {ModItems.sapphire_hoe, ModItems.ruby_hoe}
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
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(item), new Object[]{this.recipePatterns[j], '#', "stickWood", 'X', object}));
            }
        }
    }
}
