package com.jdlogic.examplemod;

import com.jdlogic.examplemod.handler.ConfigHandlerEM;
import com.jdlogic.examplemod.handler.FuelHandlerEM;
import com.jdlogic.examplemod.init.*;
import com.jdlogic.examplemod.reference.Reference;
import com.jdlogic.examplemod.utils.LogHelper;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class ExampleMod
{
    @Mod.Instance(Reference.MOD_ID)
    public static ExampleMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigHandlerEM.init(event.getSuggestedConfigurationFile());

        FMLCommonHandler.instance().bus().register(new ConfigHandlerEM());

        ModWorldGenerator.init();

        ModBlocks.init();

        ModItems.init();

        LogHelper.info("Pre Initialization Done!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent evnet)
    {
        ModBlockProperties.init();

        ModModels.init();

        ModRecipies.init();

        GameRegistry.registerFuelHandler(new FuelHandlerEM());

        LogHelper.info("Initialization Done!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Done!");
    }

}
