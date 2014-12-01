package com.jdlogic.examplemod.init;

import com.jdlogic.examplemod.block.BlockCharcoal;
import com.jdlogic.examplemod.block.ore.BlockSapphireOre;
import com.jdlogic.examplemod.reference.Names;
import com.jdlogic.examplemod.reference.Reference;
import com.jdlogic.examplemod.reference.Settings;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockCharcoal charcoal_block = new BlockCharcoal();
    public static final BlockSapphireOre sapphire_ore = new BlockSapphireOre();

    public static void init()
    {
        if (Settings.General.enableModBlocks)
        {
            GameRegistry.registerBlock(charcoal_block, Names.Blocks.CHARCOAL);
            GameRegistry.registerBlock(sapphire_ore, Names.Blocks.SAPPHIRE_ORE);
        }
    }
}
