package com.jdlogic.examplemod.block;

import com.jdlogic.examplemod.creativetab.CreativeTabEM;
import com.jdlogic.examplemod.reference.Names;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCharcoal extends BlockEM
{
    public BlockCharcoal()
    {
        super();
        this.setUnlocalizedName(Names.Blocks.CHARCOAL);
        this.setCreativeTab(CreativeTabEM.EM_TAB);
        this.setHardness(5.0F);
        this.setResistance(10.0F);
        this.setStepSound(soundTypePiston);
        this.setHarvestLevel("pickaxe", 0);
    }
}
