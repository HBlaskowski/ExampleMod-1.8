package com.jdlogic.examplemod.block;

import com.jdlogic.examplemod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockEM extends Block
{
    public BlockEM(Material material)
    {
        super(material);
    }

    public BlockEM()
    {
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
