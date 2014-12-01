package com.jdlogic.examplemod.creativetab;

import com.jdlogic.examplemod.init.ModBlocks;
import com.jdlogic.examplemod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabEM
{
    public static final CreativeTabs EM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(ModBlocks.charcoal_block);
        }
    };
}
