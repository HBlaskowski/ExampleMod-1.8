package com.jdlogic.examplemod.item;

import com.jdlogic.examplemod.creativetab.CreativeTabEM;
import com.jdlogic.examplemod.reference.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorEM extends ItemArmor
{
    public ItemArmorEM(ItemArmor.ArmorMaterial material, int renderIndex, int armorType, String unlocalizedName)
    {
        super(material, renderIndex, armorType);
        this.setCreativeTab(CreativeTabEM.EM_TAB);
        this.setUnlocalizedName(unlocalizedName);
    }

    @Override
    public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type)
    {
        String s1 = String.format(Reference.MOD_ID + ":textures/models/armor/%s_layer_%d%s.png",
                this.getArmorMaterial().getName(), (slot == 2 ? 2 : 1), type == null ? "" : String.format("_%s", type));

        return s1;
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
