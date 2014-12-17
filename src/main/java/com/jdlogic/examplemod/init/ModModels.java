package com.jdlogic.examplemod.init;

import com.jdlogic.examplemod.reference.Names;
import com.jdlogic.examplemod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModModels
{
    @SideOnly(Side.CLIENT)
    public static void init()
    {
        registerItemBlockModel(ModBlocks.charcoal_block, 0, Names.Blocks.CHARCOAL);
        registerItemBlockModel(ModBlocks.sapphire_ore, 0, Names.Blocks.SAPPHIRE_ORE);
        registerItemBlockModel(ModBlocks.ruby_ore, 0, Names.Blocks.RUBY_ORE);

        registerItemModel(ModItems.sapphire, 0, Names.Items.SAPPHIRE);
        registerItemModel(ModItems.ruby, 0, Names.Items.RUBY);

        registerItemModel(ModItems.sapphire_pickaxe, 0, Names.Tools.SAPPHIRE_PICKAXE);
        registerItemModel(ModItems.sapphire_shovel, 0, Names.Tools.SAPPHIRE_SHOVEL);
        registerItemModel(ModItems.sapphire_axe, 0, Names.Tools.SAPPHIRE_AXE);
        registerItemModel(ModItems.sapphire_hoe, 0, Names.Tools.SAPPHIRE_HOE);

        registerItemModel(ModItems.ruby_pickaxe, 0, Names.Tools.RUBY_PICKAXE);
        registerItemModel(ModItems.ruby_shovel, 0, Names.Tools.RUBY_SHOVEL);
        registerItemModel(ModItems.ruby_axe, 0, Names.Tools.RUBY_AXE);
        registerItemModel(ModItems.ruby_hoe, 0, Names.Tools.RUBY_HOE);

        registerItemModel(ModItems.sapphire_sword, 0, Names.Weapons.SAPPHIRE_SWORD);
        registerItemModel(ModItems.ruby_sword, 0, Names.Weapons.RUBY_SWORD);

        ModelBakery.addVariantName(ModItems.sapphire_bow, new String[]{Reference.MOD_ID + ":sapphire_bow", Reference.MOD_ID + ":sapphire_bow_pulling_0", Reference.MOD_ID + ":sapphire_bow_pulling_1", Reference.MOD_ID + ":sapphire_bow_pulling_2"});
        registerItemModel(ModItems.sapphire_bow, 0, "sapphire_bow");
        registerItemModel(ModItems.sapphire_bow, 1, "sapphire_bow_pulling_0");
        registerItemModel(ModItems.sapphire_bow, 2, "sapphire_bow_pulling_1");
        registerItemModel(ModItems.sapphire_bow, 3, "sapphire_bow_pulling_2");

        ModelBakery.addVariantName(ModItems.ruby_bow, new String[]{Reference.MOD_ID + ":ruby_bow", Reference.MOD_ID + ":ruby_bow_pulling_0", Reference.MOD_ID + ":ruby_bow_pulling_1", Reference.MOD_ID + ":ruby_bow_pulling_2"});
        registerItemModel(ModItems.ruby_bow, 0, "ruby_bow");
        registerItemModel(ModItems.ruby_bow, 1, "ruby_bow_pulling_0");
        registerItemModel(ModItems.ruby_bow, 2, "ruby_bow_pulling_1");
        registerItemModel(ModItems.ruby_bow, 3, "ruby_bow_pulling_2");

        registerItemModel(ModItems.sapphire_helmet, 0, Names.Armor.SAPPHIRE_HELMET);
        registerItemModel(ModItems.sapphire_chestplate, 0, Names.Armor.SAPPHIRE_CHESTPLATE);
        registerItemModel(ModItems.sapphire_leggings, 0, Names.Armor.SAPPHIRE_LEGGINGS);
        registerItemModel(ModItems.sapphire_boots, 0, Names.Armor.SAPPHIRE_BOOTS);

        registerItemModel(ModItems.ruby_helmet, 0, Names.Armor.RUBY_HELMET);
        registerItemModel(ModItems.ruby_chestplate, 0, Names.Armor.RUBY_CHESTPLATE);
        registerItemModel(ModItems.ruby_leggings, 0, Names.Armor.RUBY_LEGGINGS);
        registerItemModel(ModItems.ruby_boots, 0, Names.Armor.RUBY_BOOTS);
    }

    @SideOnly(Side.CLIENT)
    public static void registerItemBlockModel(Block block, int metadata, String blockName)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), metadata, new ModelResourceLocation(Reference.MOD_ID + ":" + blockName, "inventory"));
    }

    @SideOnly(Side.CLIENT)
    public static void registerItemModel(Item item, int metadata, String itemName)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, metadata, new ModelResourceLocation(Reference.MOD_ID + ":" + itemName, "inventory"));
    }
}
