package com.jdlogic.examplemod.handler;

import com.jdlogic.examplemod.reference.Reference;
import com.jdlogic.examplemod.reference.Settings;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ConfigHandlerEM
{
    public static Configuration config;

    public static void init(File configFile)
    {
        if (config == null)
        {
            config = new Configuration(configFile, true);
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        Property prop;

        List<String> propOrder1 = new ArrayList<String>();
        config.setCategoryComment(Settings.GENERAL, "General Mod Settings").setCategoryRequiresMcRestart(Settings.GENERAL, true);

        prop = config.get(Settings.GENERAL, "enableModBlocks", true);
        prop.comment = "Set to 'true' to enable this mod's blocks.";
        prop.setLanguageKey("examplemod.configgui.enableModBlocks");
        Settings.General.enableModBlocks = prop.getBoolean(Settings.General.enableModBlocks);
        propOrder1.add(prop.getName());

        prop = config.get(Settings.GENERAL, "enableModItems", true);
        prop.comment = "Set to 'true' to enable this mod's items.";
        prop.setLanguageKey("examplemod.configgui.enableModItems");
        Settings.General.enableModItems = prop.getBoolean(Settings.General.enableModItems);
        propOrder1.add(prop.getName());

        prop = config.get(Settings.GENERAL, "enableOreGenerator", true);
        prop.comment = "Set to 'true' to enable this mod's ore generator.";
        prop.setLanguageKey("examplemod.configgui.enableOreGenerator");
        Settings.General.enableModOreGeneration = prop.getBoolean(Settings.General.enableModOreGeneration);
        propOrder1.add(prop.getName());

        config.setCategoryPropertyOrder(Settings.GENERAL, propOrder1);

        List<String> propOrder2 = new ArrayList<String>();
        config.setCategoryComment(Settings.SAPPHIRE_OVERWORLD, "Overworld Saphhire Ore Settings").setCategoryRequiresWorldRestart(Settings.SAPPHIRE_OVERWORLD, true);

        prop = config.get(Settings.SAPPHIRE_OVERWORLD, "maxVeinSize", 6, "The max vein size of sapphire ore in the overworld.", 0, 64);
        prop.setLanguageKey("examplemod.configgui.maxVeinSize");
        Settings.SapphireOverworld.maxVeinSize = prop.getInt(Settings.SapphireOverworld.maxVeinSize);
        propOrder2.add(prop.getName());

        prop = config.get(Settings.SAPPHIRE_OVERWORLD, "veinPerChunk", 3, "The max veins per chunk of sapphire ore in the overworld.", 0, 64);
        prop.setLanguageKey("examplemod.configgui.veinPerChunk");
        Settings.SapphireOverworld.veinPerChunk = prop.getInt(Settings.SapphireOverworld.veinPerChunk);
        propOrder2.add(prop.getName());

        prop = config.get(Settings.SAPPHIRE_OVERWORLD, "minY", 0, "The min Y level that sapphire ore can generate in the overworld.", 0, 256);
        prop.setLanguageKey("examplemod.configgui.minY");
        Settings.SapphireOverworld.minY = prop.getInt(Settings.SapphireOverworld.minY);
        propOrder2.add(prop.getName());

        prop = config.get(Settings.SAPPHIRE_OVERWORLD, "maxY", 16, "The max Y level that sapphire ore can generate in the overworld.", 0, 256);
        prop.setLanguageKey("examplemod.configgui.maxY");
        Settings.SapphireOverworld.maxY = prop.getInt(Settings.SapphireOverworld.maxY);
        propOrder2.add(prop.getName());

        config.setCategoryPropertyOrder(Settings.SAPPHIRE_OVERWORLD, propOrder2);

        List<String> propOrder3 = new ArrayList<String>();
        config.setCategoryComment(Settings.SAPPHIRE_NETHER, "Nether Saphhire Ore Settings").setCategoryRequiresWorldRestart(Settings.SAPPHIRE_NETHER, true);

        prop = config.get(Settings.SAPPHIRE_NETHER, "maxVeinSize", 6, "The max vein size of sapphire ore in the nether.", 0, 64);
        prop.setLanguageKey("examplemod.configgui.maxVeinSize");
        Settings.SapphireNether.maxVeinSize = prop.getInt(Settings.SapphireNether.maxVeinSize);
        propOrder3.add(prop.getName());

        prop = config.get(Settings.SAPPHIRE_NETHER, "veinPerChunk", 4, "The max veins per chunk of sapphire ore in the nether.", 0, 64);
        prop.setLanguageKey("examplemod.configgui.veinPerChunk");
        Settings.SapphireNether.veinPerChunk = prop.getInt(Settings.SapphireNether.veinPerChunk);
        propOrder3.add(prop.getName());

        prop = config.get(Settings.SAPPHIRE_NETHER, "minY", 16, "The min Y level that sapphire ore can generate in the nether.", 0, 256);
        prop.setLanguageKey("examplemod.configgui.minY");
        Settings.SapphireNether.minY = prop.getInt(Settings.SapphireNether.minY);
        propOrder3.add(prop.getName());

        prop = config.get(Settings.SAPPHIRE_NETHER, "maxY", 48, "The max Y level that sapphire ore can generate in the nether.", 0, 256);
        prop.setLanguageKey("examplemod.configgui.maxY");
        Settings.SapphireNether.maxY = prop.getInt(Settings.SapphireNether.maxY);
        propOrder3.add(prop.getName());

        config.setCategoryPropertyOrder(Settings.SAPPHIRE_NETHER, propOrder3);

        List<String> propOrder4 = new ArrayList<String>();
        config.setCategoryComment(Settings.SAPPHIRE_END, "End Saphhire Ore Settings").setCategoryRequiresWorldRestart(Settings.SAPPHIRE_END, true);

        prop = config.get(Settings.SAPPHIRE_END, "maxVeinSize", 6, "The max vein size of sapphire ore in the end.", 0, 64);
        prop.setLanguageKey("examplemod.configgui.maxVeinSize");
        Settings.SapphireEnd.maxVeinSize = prop.getInt(Settings.SapphireEnd.maxVeinSize);
        propOrder4.add(prop.getName());

        prop = config.get(Settings.SAPPHIRE_END, "veinPerChunk", 6, "The max veins per chunk of sapphire ore in the end.", 0, 64);
        prop.setLanguageKey("examplemod.configgui.veinPerChunk");
        Settings.SapphireEnd.veinPerChunk = prop.getInt(Settings.SapphireEnd.veinPerChunk);
        propOrder4.add(prop.getName());

        prop = config.get(Settings.SAPPHIRE_END, "minY", 10, "The min Y level that sapphire ore can generate in the end.", 0, 256);
        prop.setLanguageKey("examplemod.configgui.minY");
        Settings.SapphireEnd.minY = prop.getInt(Settings.SapphireEnd.minY);
        propOrder4.add(prop.getName());

        prop = config.get(Settings.SAPPHIRE_END, "maxY", 70, "The max Y level that sapphire ore can generate in the end.", 0, 256);
        prop.setLanguageKey("examplemod.configgui.maxY");
        Settings.SapphireEnd.maxY = prop.getInt(Settings.SapphireEnd.maxY);
        propOrder4.add(prop.getName());

        config.setCategoryPropertyOrder(Settings.SAPPHIRE_END, propOrder4);

        List<String> propOrder5 = new ArrayList<String>();
        config.setCategoryComment(Settings.RUBY_OVERWORLD, "Overworld Ruby Ore Settings").setCategoryRequiresWorldRestart(Settings.RUBY_OVERWORLD, true);

        prop = config.get(Settings.RUBY_OVERWORLD, "maxVeinSize", 8, "The max vein size of ruby ore in the overworld.", 0, 64);
        prop.setLanguageKey("examplemod.configgui.maxVeinSize");
        Settings.RubyOverworld.maxVeinSize = prop.getInt(Settings.RubyOverworld.maxVeinSize);
        propOrder5.add(prop.getName());

        prop = config.get(Settings.RUBY_OVERWORLD, "veinPerChunk", 12, "The max veins per chunk of ruby ore in the overworld.", 0, 64);
        prop.setLanguageKey("examplemod.configgui.veinPerChunk");
        Settings.RubyOverworld.veinPerChunk = prop.getInt(Settings.RubyOverworld.veinPerChunk);
        propOrder5.add(prop.getName());

        prop = config.get(Settings.RUBY_OVERWORLD, "minY", 0, "The min Y level that ruby ore can generate in the overworld.", 0, 256);
        prop.setLanguageKey("examplemod.configgui.minY");
        Settings.RubyOverworld.minY = prop.getInt(Settings.RubyOverworld.minY);
        propOrder5.add(prop.getName());

        prop = config.get(Settings.RUBY_OVERWORLD, "maxY", 64, "The max Y level that ruby ore can generate in the overworld.", 0, 256);
        prop.setLanguageKey("examplemod.configgui.maxY");
        Settings.RubyOverworld.maxY = prop.getInt(Settings.RubyOverworld.maxY);
        propOrder5.add(prop.getName());

        config.setCategoryPropertyOrder(Settings.SAPPHIRE_OVERWORLD, propOrder5);

        List<String> propOrder6 = new ArrayList<String>();
        config.setCategoryComment(Settings.RUBY_NETHER, "Nether Ruby Ore Settings").setCategoryRequiresWorldRestart(Settings.RUBY_NETHER, true);

        prop = config.get(Settings.RUBY_NETHER, "maxVeinSize", 8, "The max vein size of ruby ore in the nether.", 0, 64);
        prop.setLanguageKey("examplemod.configgui.maxVeinSize");
        Settings.RubyNether.maxVeinSize = prop.getInt(Settings.RubyNether.maxVeinSize);
        propOrder6.add(prop.getName());

        prop = config.get(Settings.RUBY_NETHER, "veinPerChunk", 16, "The max veins per chunk of ruby ore in the nether.", 0, 64);
        prop.setLanguageKey("examplemod.configgui.veinPerChunk");
        Settings.RubyNether.veinPerChunk = prop.getInt(Settings.RubyNether.veinPerChunk);
        propOrder6.add(prop.getName());

        prop = config.get(Settings.RUBY_NETHER, "minY", 32, "The min Y level that ruby ore can generate in the nether.", 0, 256);
        prop.setLanguageKey("examplemod.configgui.minY");
        Settings.RubyNether.minY = prop.getInt(Settings.RubyNether.minY);
        propOrder6.add(prop.getName());

        prop = config.get(Settings.RUBY_NETHER, "maxY", 112, "The max Y level that ruby ore can generate in the nether.", 0, 256);
        prop.setLanguageKey("examplemod.configgui.maxY");
        Settings.RubyNether.maxY = prop.getInt(Settings.RubyNether.maxY);
        propOrder6.add(prop.getName());

        config.setCategoryPropertyOrder(Settings.RUBY_NETHER, propOrder6);

        List<String> propOrder7 = new ArrayList<String>();
        config.setCategoryComment(Settings.RUBY_END, "End Ruby Ore Settings").setCategoryRequiresWorldRestart(Settings.RUBY_END, true);

        prop = config.get(Settings.RUBY_END, "maxVeinSize", 8, "The max vein size of ruby ore in the end.", 0, 64);
        prop.setLanguageKey("examplemod.configgui.maxVeinSize");
        Settings.RubyEnd.maxVeinSize = prop.getInt(Settings.RubyEnd.maxVeinSize);
        propOrder7.add(prop.getName());

        prop = config.get(Settings.RUBY_END, "veinPerChunk", 12, "The max veins per chunk of ruby ore in the end.", 0, 64);
        prop.setLanguageKey("examplemod.configgui.veinPerChunk");
        Settings.RubyEnd.veinPerChunk = prop.getInt(Settings.RubyEnd.veinPerChunk);
        propOrder7.add(prop.getName());

        prop = config.get(Settings.RUBY_END, "minY", 10, "The min Y level that ruby ore can generate in the end.", 0, 256);
        prop.setLanguageKey("examplemod.configgui.minY");
        Settings.RubyEnd.minY = prop.getInt(Settings.RubyEnd.minY);
        propOrder7.add(prop.getName());

        prop = config.get(Settings.RUBY_END, "maxY", 70, "The max Y level that ruby ore can generate in the end.", 0, 256);
        prop.setLanguageKey("examplemod.configgui.maxY");
        Settings.RubyEnd.maxY = prop.getInt(Settings.RubyEnd.maxY);
        propOrder7.add(prop.getName());

        config.setCategoryPropertyOrder(Settings.RUBY_END, propOrder7);

        if (config.hasChanged())
        {
            config.save();
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
