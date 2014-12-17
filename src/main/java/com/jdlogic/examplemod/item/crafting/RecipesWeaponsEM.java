package com.jdlogic.examplemod.item.crafting;

import com.jdlogic.examplemod.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class RecipesWeaponsEM
{
    private String[][] recipePatterns = new String[][] {{"X", "X", "#"}, {" XS", "X S", " XS"}};
    private Object[][] recipeItems;
    private static final String __OBFID = "CL_00000097";

    public RecipesWeaponsEM()
    {
        this.recipeItems = new Object[][] {{ModItems.sapphire, ModItems.ruby}, {ModItems.sapphire_sword, ModItems.ruby_sword}, {ModItems.sapphire_bow, ModItems.ruby_bow}};
    }

    public void addRecipes()
    {
        for (int i = 0; i < this.recipeItems[0].length; ++i)
        {
            Object object = this.recipeItems[0][i];

            for (int j = 0; j < this.recipeItems.length - 1; ++j)
            {
                Item item = (Item)this.recipeItems[j + 1][i];
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(item), new Object[]{this.recipePatterns[j], '#', "stickWood", 'S', Items.string, 'X', object}));
            }
        }
    }
}
