package com.jdlogic.examplemod.handler;

import com.jdlogic.examplemod.reference.Reference;
import com.jdlogic.examplemod.reference.Settings;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigHandlerEM
{
    public static Configuration configuration;

    public static void init(File configFile)
    {
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        Settings.General.enableModBlocks = configuration.getBoolean("Enable Mod Blocks", Configuration.CATEGORY_GENERAL, true, "Set to 'true' to enable this mod's blocks.");
        Settings.General.enableModItems = configuration.getBoolean("Enable Mod Items", Configuration.CATEGORY_GENERAL, true, "Set to 'true' to enable this mod's items.");
        Settings.General.enableModOreGeneration = configuration.getBoolean("Enable Ore Generator", Configuration.CATEGORY_GENERAL, true, "Set to 'true' to enable this mod's ore generator.");
        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }
}
