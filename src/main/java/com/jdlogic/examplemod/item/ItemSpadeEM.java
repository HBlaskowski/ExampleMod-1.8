package com.jdlogic.examplemod.item;

import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import java.util.Set;

public class ItemSpadeEM extends ItemToolEM
{
    private static final Set effectiveBlocks = Sets.newHashSet(new Block[]{Blocks.clay, Blocks.dirt, Blocks.farmland, Blocks.grass, Blocks.gravel, Blocks.mycelium, Blocks.sand, Blocks.snow, Blocks.snow_layer, Blocks.soul_sand});

    public ItemSpadeEM(Item.ToolMaterial material, String unlocalizedName)
    {
        super(2.0F, material, effectiveBlocks);
        this.setUnlocalizedName(unlocalizedName);
    }

    @Override
    public boolean canHarvestBlock(Block blockIn)
    {
        return blockIn == Blocks.snow_layer ? true : blockIn == Blocks.snow;
    }
}
