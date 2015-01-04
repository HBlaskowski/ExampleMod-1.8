package com.jdlogic.examplemod.init;

import com.jdlogic.examplemod.reference.Reference;
import com.jdlogic.examplemod.reference.Settings;
import com.jdlogic.examplemod.world.ModWorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModWorldGenerator
{
    public static IWorldGenerator modWorldGenerator;

    public static void init()
    {
        if (Settings.General.enableModOreGeneration && Settings.General.enableModBlocks)
        {
            modWorldGenerator = new ModWorldGenMinable();
            GameRegistry.registerWorldGenerator(modWorldGenerator, 0);
        }
    }
}
