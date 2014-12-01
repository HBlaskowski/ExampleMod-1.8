package com.jdlogic.examplemod.init;

import com.jdlogic.examplemod.reference.Names;
import com.jdlogic.examplemod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ModItemModels
{

    public static void init()
    {
        registerItemBlockModel(ModBlocks.charcoal_block, 0, Names.Blocks.CHARCOAL);
        registerItemBlockModel(ModBlocks.sapphire_ore, 0, Names.Blocks.SAPPHIRE_ORE);

        registerItemModel(ModItems.sapphire, 0, Names.Items.SAPPHIRE);
        registerItemModel(ModItems.sapphire_pickaxe, 0, Names.Tools.SAPPHIRE_PICKAXE);
    }

    public static void registerItemBlockModel(Block block, int metadata, String blockName)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), metadata, new ModelResourceLocation(Reference.MOD_ID + ":" + blockName, "inventory"));
    }

    public static void registerItemModel(Item item, int metadata, String itemName)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, metadata, new ModelResourceLocation(Reference.MOD_ID + ":" + itemName, "inventory"));
    }
}
