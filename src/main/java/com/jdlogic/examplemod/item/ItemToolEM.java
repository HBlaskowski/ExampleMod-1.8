package com.jdlogic.examplemod.item;


import com.jdlogic.examplemod.creativetab.CreativeTabEM;
import com.jdlogic.examplemod.reference.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class ItemToolEM extends ItemTool
{
    public ItemToolEM(float damageVsEntity, Item.ToolMaterial toolMaterial, Set blocksEffectiveAgainst)
    {
        super(damageVsEntity, toolMaterial, blocksEffectiveAgainst);
        this.setCreativeTab(CreativeTabEM.EM_TAB);
        this.maxStackSize = 1;
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
