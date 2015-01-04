package com.jdlogic.examplemod.creativetab;

import com.jdlogic.examplemod.init.ModBlocks;
import com.jdlogic.examplemod.init.ModItems;
import com.jdlogic.examplemod.reference.Reference;
import com.jdlogic.examplemod.reference.Settings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class CreativeTabEM
{
    public static final CreativeTabs EM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            Item item = ModItems.sapphire_sword;

            if (!Settings.General.enableModBlocks && !Settings.General.enableModItems)
            {
                item = Item.getItemFromBlock(Blocks.barrier);
            }
            else if (!Settings.General.enableModItems)
            {
                item = Item.getItemFromBlock(ModBlocks.sapphire_ore);
            }

            return item;
        }
    };
}
