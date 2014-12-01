package com.jdlogic.examplemod.init;

import com.jdlogic.examplemod.item.ItemEM;
import com.jdlogic.examplemod.item.ItemSapphire;
import com.jdlogic.examplemod.item.ItemToolEM;
import com.jdlogic.examplemod.item.tools.ItemSapphirePickaxe;
import com.jdlogic.examplemod.reference.Names;
import com.jdlogic.examplemod.reference.Reference;
import com.jdlogic.examplemod.reference.Settings;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemEM sapphire = new ItemSapphire();

    public static final ItemToolEM sapphire_pickaxe = new ItemSapphirePickaxe();

    public static void init()
    {
            if (Settings.General.enableModItems)
            {
                GameRegistry.registerItem(sapphire, Names.Items.SAPPHIRE);

                GameRegistry.registerItem(sapphire_pickaxe, Names.Tools.SAPPHIRE_PICKAXE);
            }
    }
}
