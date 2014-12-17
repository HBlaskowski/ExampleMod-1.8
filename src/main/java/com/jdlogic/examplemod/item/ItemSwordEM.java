package com.jdlogic.examplemod.item;

import com.jdlogic.examplemod.creativetab.CreativeTabEM;
import com.jdlogic.examplemod.reference.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemSwordEM extends ItemSword
{
    public ItemSwordEM(Item.ToolMaterial material, String unlocalizedName)
    {
        super(material);
        this.setMaxDamage(material.getMaxUses());
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabEM.EM_TAB);
        this.setUnlocalizedName(unlocalizedName);
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
