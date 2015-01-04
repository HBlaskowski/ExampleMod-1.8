package com.jdlogic.examplemod.init;

import net.minecraftforge.oredict.OreDictionary;

public class ModOreDictionary
{
    public static void init()
    {
        OreDictionary.registerOre("blockCharcoal", ModBlocks.charcoal_block);
        OreDictionary.registerOre("oreSapphire", ModBlocks.sapphire_ore);
        OreDictionary.registerOre("oreRuby", ModBlocks.ruby_ore);

        OreDictionary.registerOre("gemSapphire", ModItems.sapphire);
        OreDictionary.registerOre("gemRuby", ModItems.ruby);
    }
}
