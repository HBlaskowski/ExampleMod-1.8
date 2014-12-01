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
        //Blocks.fire.setFireInfo in MC 1.7.10
        Blocks.fire.func_180686_a(block, spreadSpeed, flammability);
    }
}
