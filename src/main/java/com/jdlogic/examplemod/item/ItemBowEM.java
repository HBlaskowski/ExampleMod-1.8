package com.jdlogic.examplemod.item;

import com.jdlogic.examplemod.creativetab.CreativeTabEM;
import com.jdlogic.examplemod.init.ModItems;
import com.jdlogic.examplemod.reference.Names;
import com.jdlogic.examplemod.reference.Reference;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

public class ItemBowEM extends ItemBow
{
    public ItemBowEM(String unlocalizedName, int maxDamage)
    {
        super();
        this.setMaxDamage(maxDamage);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabEM.EM_TAB);
    }

    public String getSimpleName(ItemStack stack)
    {
        String simpleName = null;

        if (stack.getItem() == ModItems.sapphire_bow)
        {
            simpleName = Names.Weapons.SAPPHIRE_BOW;
        }
        else if (stack.getItem() == ModItems.ruby_bow)
        {
            simpleName = Names.Weapons.RUBY_BOW;
        }

        return simpleName;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack stack)
    {
        int j = 0;

        if (stack.getItem() == ModItems.sapphire_bow)
        {
            j = 250000;
        }
        else if (stack.getItem() == ModItems.ruby_bow)
        {
            j = 100000;
        }
        return j;
    }

    @Override
    public int getItemEnchantability()
    {
        return 5;
    }

    @Override
    public ModelResourceLocation getModel(ItemStack stack, EntityPlayer player, int useRemaining)
    {
        ModelResourceLocation modelresourcelocation = null;
        String state = null;

        if (stack.getItem() == this && player.getItemInUse() != null)
        {
            String name = this.getSimpleName(stack);

            if(useRemaining >= 18)
            {
                state = String.format(":%s_pulling_2", name);
            }
            else if(useRemaining > 13)
            {
                state = String.format(":%s_pulling_1", name);
            }
            else if(useRemaining > 0)
            {
                state = String.format(":%s_pulling_0", name);
            }

            modelresourcelocation = new ModelResourceLocation(Reference.MOD_ID + state, "inventory");
        }

        return modelresourcelocation;
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
