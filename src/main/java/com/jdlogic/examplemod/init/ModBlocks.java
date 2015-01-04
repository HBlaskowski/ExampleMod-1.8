package com.jdlogic.examplemod.init;

import com.jdlogic.examplemod.block.BlockCharcoal;
import com.jdlogic.examplemod.block.BlockOreEM;
import com.jdlogic.examplemod.reference.Names;
import com.jdlogic.examplemod.reference.Reference;
import com.jdlogic.examplemod.reference.Settings;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockCharcoal charcoal_block = new BlockCharcoal();

    public static final BlockOreEM sapphire_ore = new BlockOreEM(Names.Blocks.SAPPHIRE_ORE, 2);
    public static final BlockOreEM nether_sapphire_ore = new BlockOreEM(Names.Blocks.NETHER_SAPPHIRE_ORE, 2);
    public static final BlockOreEM end_sapphire_ore = new BlockOreEM(Names.Blocks.END_SAPPHIRE_ORE, 2);

    public static final BlockOreEM ruby_ore = new BlockOreEM(Names.Blocks.RUBY_ORE, 2);
    public static final BlockOreEM nether_ruby_ore = new BlockOreEM(Names.Blocks.NETHER_RUBY_ORE, 2);
    public static final BlockOreEM end_ruby_ore = new BlockOreEM(Names.Blocks.END_RUBY_ORE, 2);

    public static void init()
    {
        if (Settings.General.enableModBlocks)
        {
            GameRegistry.registerBlock(charcoal_block, Names.Blocks.CHARCOAL);

            GameRegistry.registerBlock(sapphire_ore, Names.Blocks.SAPPHIRE_ORE);
            GameRegistry.registerBlock(nether_sapphire_ore, Names.Blocks.NETHER_SAPPHIRE_ORE);
            GameRegistry.registerBlock(end_sapphire_ore, Names.Blocks.END_SAPPHIRE_ORE);

            GameRegistry.registerBlock(ruby_ore, Names.Blocks.RUBY_ORE);
            GameRegistry.registerBlock(nether_ruby_ore, Names.Blocks.NETHER_RUBY_ORE);
            GameRegistry.registerBlock(end_ruby_ore, Names.Blocks.END_RUBY_ORE);
        }
    }
}
