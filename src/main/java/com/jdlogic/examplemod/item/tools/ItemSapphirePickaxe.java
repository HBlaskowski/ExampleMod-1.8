package com.jdlogic.examplemod.item.tools;

import com.google.common.collect.Sets;
import com.jdlogic.examplemod.creativetab.CreativeTabEM;
import com.jdlogic.examplemod.item.ItemToolEM;
import com.jdlogic.examplemod.reference.Material;
import com.jdlogic.examplemod.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import java.util.Set;

public class ItemSapphirePickaxe extends ItemToolEM
{
    private static final Set effectiveBlocks = Sets.newHashSet(new Block[]{Blocks.activator_rail, Blocks.coal_ore, Blocks.cobblestone, Blocks.detector_rail, Blocks.diamond_block, Blocks.diamond_ore, Blocks.double_stone_slab, Blocks.golden_rail, Blocks.gold_block, Blocks.gold_ore, Blocks.ice, Blocks.iron_block, Blocks.iron_ore, Blocks.lapis_block, Blocks.lapis_ore, Blocks.lit_redstone_ore, Blocks.mossy_cobblestone, Blocks.netherrack, Blocks.packed_ice, Blocks.rail, Blocks.redstone_ore, Blocks.sandstone, Blocks.red_sandstone, Blocks.stone, Blocks.stone_slab});


    public ItemSapphirePickaxe()
    {
        super(2.0F, Material.Tools.SAPPHIRE, effectiveBlocks);
        this.setCreativeTab(CreativeTabEM.EM_TAB);
        this.isRepairable();
        this.setUnlocalizedName(Names.Tools.SAPPHIRE_PICKAXE);
    }

    @Override
    public boolean canHarvestBlock(Block blockIn)
    {
        return blockIn == Blocks.obsidian ? this.toolMaterial.getHarvestLevel() == 3 : (blockIn != Blocks.diamond_block && blockIn != Blocks.diamond_ore ? (blockIn != Blocks.emerald_ore && blockIn != Blocks.emerald_block ? (blockIn != Blocks.gold_block && blockIn != Blocks.gold_ore ? (blockIn != Blocks.iron_block && blockIn != Blocks.iron_ore ? (blockIn != Blocks.lapis_block && blockIn != Blocks.lapis_ore ? (blockIn != Blocks.redstone_ore && blockIn != Blocks.lit_redstone_ore ? (blockIn.getMaterial() == net.minecraft.block.material.Material.rock ? true : (blockIn.getMaterial() == net.minecraft.block.material.Material.iron ? true : blockIn.getMaterial() == net.minecraft.block.material.Material.anvil)) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 2);
    }

    @Override
    public float getStrVsBlock(ItemStack stack, Block Block)
    {
        return Block.getMaterial() != net.minecraft.block.material.Material.iron && Block.getMaterial() != net.minecraft.block.material.Material.anvil && Block.getMaterial() != net.minecraft.block.material.Material.rock ? super.getStrVsBlock(stack, Block) : this.efficiencyOnProperMaterial;
    }
}
