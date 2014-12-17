package com.jdlogic.examplemod.item;

import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Set;

public class ItemAxeEM extends ItemToolEM
{
    private static final Set effectiveBlocks = Sets.newHashSet(new Block[]{Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin, Blocks.melon_block, Blocks.ladder});

    public ItemAxeEM(Item.ToolMaterial material, String unlocalizedName)
    {
        super(2.0F, material, effectiveBlocks);
        this.setUnlocalizedName(unlocalizedName);
    }

    @Override
    public float getStrVsBlock(ItemStack stack, Block block)
    {
        return block.getMaterial() != Material.wood && block.getMaterial() != Material.plants && block.getMaterial() != Material.vine ? super.getStrVsBlock(stack, block) : this.efficiencyOnProperMaterial;
    }
}
