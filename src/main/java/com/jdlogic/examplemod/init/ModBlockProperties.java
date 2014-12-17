package com.jdlogic.examplemod.init;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class ModBlockProperties
{
    public static void init()
    {
        setFireInfo(ModBlocks.charcoal_block, 5, 5);
    }


    public static void setFireInfo(Block  block, int spreadSpeed, int flammability)
    {
        Blocks.fire.setFireInfo(block, spreadSpeed, flammability);
    }
}
