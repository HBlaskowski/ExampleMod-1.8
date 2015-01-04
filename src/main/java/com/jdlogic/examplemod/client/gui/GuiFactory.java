package com.jdlogic.examplemod.client.gui;

import com.jdlogic.examplemod.handler.ConfigHandlerEM;
import com.jdlogic.examplemod.reference.Reference;
import com.jdlogic.examplemod.reference.Settings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraftforge.fml.client.config.DummyConfigElement.DummyCategoryElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.GuiConfigEntries;
import net.minecraftforge.fml.client.config.GuiConfigEntries.CategoryEntry;
import net.minecraftforge.fml.client.config.IConfigElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GuiFactory implements IModGuiFactory
{
    @Override
    public void initialize(Minecraft minecraftInstance)
    {

    }

    @Override
    public Class<? extends GuiScreen> mainConfigGuiClass()
    {
        return ExampleModGuiConfig.class;
    }

    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories()
    {
        return null;
    }

    @Override
    public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element)
    {
        return null;
    }

    public static class ExampleModGuiConfig extends GuiConfig
    {
        public ExampleModGuiConfig(GuiScreen guiScreen)
        {
            super(guiScreen, getConfigElements(), Reference.MOD_ID, false, false, I18n.format("examplemod.configgui.EMConfigTitle"));
        }

        private static List<IConfigElement> getConfigElements()
        {
            List<IConfigElement> list = new ArrayList<IConfigElement>();
            list.add(new DummyCategoryElement("exampleModeGeneralCfg", "examplemod.configgui.ctgy.EMGeneralConfig", GeneralEntry.class));
            list.add(new DummyCategoryElement("exampleModOreCfg", "examplemod.configgui.ctgy.EMOreConfig", OreEntry.class));
            return list;
        }

        public static class GeneralEntry extends CategoryEntry
        {
            public GeneralEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
            {
                super(owningScreen, owningEntryList, prop);
            }

            @Override
            protected GuiScreen buildChildScreen()
            {
                return new GuiConfig(this.owningScreen,
                        (new ConfigElement(ConfigHandlerEM.config.getCategory(Settings.GENERAL))).getChildElements(),
                        this.owningScreen.modID, Settings.GENERAL, this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
                        this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
                        GuiConfig.getAbridgedConfigPath(ConfigHandlerEM.config.toString()),
                        I18n.format("examplemod.configgui.ctgy.EMGeneralConfig"));
            }
        }

        public static class OreEntry extends CategoryEntry
        {
            public OreEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
            {
                super(owningScreen, owningEntryList, prop);
            }

            @Override
            protected GuiScreen buildChildScreen()
            {
                List<IConfigElement> list = new ArrayList<IConfigElement>();
                list.add(new DummyCategoryElement("exampleModSapphireCfg", "examplemod.configgui.ctgy.EMSapphireConfig", SapphireEntry.class));
                list.add(new DummyCategoryElement("exampleModRubyCfg", "examplemod.configgui.ctgy.EMRubyConfig", RubyEntry.class));

                return new GuiConfig(this.owningScreen, list, this.owningScreen.modID,
                        this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
                        this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
                        GuiConfig.getAbridgedConfigPath(ConfigHandlerEM.config.toString()),
                        I18n.format("examplemod.configgui.ctgy.EMOreConfig"));
            }
        }

        public static class SapphireEntry extends CategoryEntry
        {
            public SapphireEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
            {
                super(owningScreen, owningEntryList, prop);
            }

            @Override
            protected GuiScreen buildChildScreen()
            {
                List<IConfigElement> list = new ArrayList<IConfigElement>();
                list.add(new DummyCategoryElement("exampleModSapphireOverworldCfg", "examplemod.configgui.ctgy.EMSapphireOverworldConfig", SapphireOverworldEntry.class));
                list.add(new DummyCategoryElement("exampleModSapphireNetherCfg", "examplemod.configgui.ctgy.EMSapphireNetherConfig", SapphireNetherEntry.class));
                list.add(new DummyCategoryElement("exampleModSapphireEndCfg", "examplemod.configgui.ctgy.EMSapphireEndConfig", SapphireEndEntry.class));

                return new GuiConfig(this.owningScreen, list, this.owningScreen.modID,
                        this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
                        this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
                        GuiConfig.getAbridgedConfigPath(ConfigHandlerEM.config.toString()),
                        I18n.format("examplemod.configgui.ctgy.EMSapphireConfig"));
            }
        }

        public static class SapphireOverworldEntry extends CategoryEntry
        {
            public SapphireOverworldEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
            {
                super(owningScreen, owningEntryList, prop);
            }

            @Override
            protected GuiScreen buildChildScreen()
            {
                return new GuiConfig(this.owningScreen,
                        (new ConfigElement(ConfigHandlerEM.config.getCategory(Settings.SAPPHIRE_OVERWORLD))).getChildElements(),
                        this.owningScreen.modID, Settings.GENERAL, this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
                        this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
                        GuiConfig.getAbridgedConfigPath(ConfigHandlerEM.config.toString()),
                        I18n.format("examplemod.configgui.ctgy.EMSapphireOverworldConfig"));
            }
        }

        public static class SapphireNetherEntry extends CategoryEntry
        {
            public SapphireNetherEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
            {
                super(owningScreen, owningEntryList, prop);
            }

            @Override
            protected GuiScreen buildChildScreen()
            {
                return new GuiConfig(this.owningScreen,
                        (new ConfigElement(ConfigHandlerEM.config.getCategory(Settings.SAPPHIRE_NETHER))).getChildElements(),
                        this.owningScreen.modID, Settings.GENERAL, this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
                        this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
                        GuiConfig.getAbridgedConfigPath(ConfigHandlerEM.config.toString()),
                        I18n.format("examplemod.configgui.ctgy.EMSapphireNetherConfig"));
            }
        }

        public static class SapphireEndEntry extends CategoryEntry
        {
            public SapphireEndEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
            {
                super(owningScreen, owningEntryList, prop);
            }

            @Override
            protected GuiScreen buildChildScreen()
            {
                return new GuiConfig(this.owningScreen,
                        (new ConfigElement(ConfigHandlerEM.config.getCategory(Settings.SAPPHIRE_END))).getChildElements(),
                        this.owningScreen.modID, Settings.GENERAL, this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
                        this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
                        GuiConfig.getAbridgedConfigPath(ConfigHandlerEM.config.toString()),
                        I18n.format("examplemod.configgui.ctgy.EMSapphireEndConfig"));
            }
        }

        public static class RubyEntry extends CategoryEntry
        {
            public RubyEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
            {
                super(owningScreen, owningEntryList, prop);
            }

            @Override
            protected GuiScreen buildChildScreen()
            {
                List<IConfigElement> list = new ArrayList<IConfigElement>();
                list.add(new DummyCategoryElement("exampleModRubyOverworldCfg", "examplemod.configgui.ctgy.EMRubyOverworldConfig", RubyOverworldEntry.class));
                list.add(new DummyCategoryElement("exampleModRubyNetherCfg", "examplemod.configgui.ctgy.EMRubyNetherConfig", RubyNetherEntry.class));
                list.add(new DummyCategoryElement("exampleModRubyEndCfg", "examplemod.configgui.ctgy.EMRubyEndConfig", RubyEndEntry.class));

                return new GuiConfig(this.owningScreen, list, this.owningScreen.modID,
                        this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
                        this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
                        GuiConfig.getAbridgedConfigPath(ConfigHandlerEM.config.toString()),
                        I18n.format("examplemod.configgui.ctgy.EMRubyConfig"));
            }
        }

        public static class RubyOverworldEntry extends CategoryEntry
        {
            public RubyOverworldEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
            {
                super(owningScreen, owningEntryList, prop);
            }

            @Override
            protected GuiScreen buildChildScreen()
            {
                return new GuiConfig(this.owningScreen,
                        (new ConfigElement(ConfigHandlerEM.config.getCategory(Settings.RUBY_OVERWORLD))).getChildElements(),
                        this.owningScreen.modID, Settings.GENERAL, this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
                        this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
                        GuiConfig.getAbridgedConfigPath(ConfigHandlerEM.config.toString()),
                        I18n.format("examplemod.configgui.ctgy.EMRubyOverworldConfig"));
            }
        }

        public static class RubyNetherEntry extends CategoryEntry
        {
            public RubyNetherEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
            {
                super(owningScreen, owningEntryList, prop);
            }

            @Override
            protected GuiScreen buildChildScreen()
            {
                return new GuiConfig(this.owningScreen,
                        (new ConfigElement(ConfigHandlerEM.config.getCategory(Settings.RUBY_NETHER))).getChildElements(),
                        this.owningScreen.modID, Settings.GENERAL, this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
                        this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
                        GuiConfig.getAbridgedConfigPath(ConfigHandlerEM.config.toString()),
                        I18n.format("examplemod.configgui.ctgy.EMRubyNetherConfig"));
            }
        }

        public static class RubyEndEntry extends CategoryEntry
        {
            public RubyEndEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
            {
                super(owningScreen, owningEntryList, prop);
            }

            @Override
            protected GuiScreen buildChildScreen()
            {
                return new GuiConfig(this.owningScreen,
                        (new ConfigElement(ConfigHandlerEM.config.getCategory(Settings.RUBY_END))).getChildElements(),
                        this.owningScreen.modID, Settings.GENERAL, this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
                        this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
                        GuiConfig.getAbridgedConfigPath(ConfigHandlerEM.config.toString()),
                        I18n.format("examplemod.configgui.ctgy.EMRubyEndConfig"));
            }
        }
    }
}
