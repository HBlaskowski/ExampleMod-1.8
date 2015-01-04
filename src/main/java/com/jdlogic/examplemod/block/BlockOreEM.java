package com.jdlogic.examplemod.block;

import com.jdlogic.examplemod.creativetab.CreativeTabEM;
import com.jdlogic.examplemod.init.ModBlocks;
import com.jdlogic.examplemod.init.ModItems;
import com.jdlogic.examplemod.reference.Settings;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class BlockOreEM extends BlockEM
{
    public BlockOreEM(String unlocalizedName, int havestLevel)
    {
        super();
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabEM.EM_TAB);
        this.setHardness(5.0F);
        this.setResistance(10.0F);
        this.setStepSound(soundTypePiston);
        this.setHarvestLevel("pickaxe", havestLevel);
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        Item item;

        if (Settings.General.enableModItems && this == ModBlocks.sapphire_ore)
        {
            item = ModItems.sapphire;
        }
        else if (Settings.General.enableModItems && this == ModBlocks.ruby_ore)
        {
            item = ModItems.ruby;
        }
        else
        {
            item = Item.getItemFromBlock(this);
        }

        return item;
    }

    public int quantityDropped(Random random)
    {
        return 1;
    }

    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune))
        {
            int j = random.nextInt(fortune + 2) - 1;

            if (j < 0)
            {
                j = 0;
            }

            return this.quantityDropped(random) * (j + 1);
        }
        else
        {
            return this.quantityDropped(random);
        }
    }

    public int getExpDrop(IBlockAccess world, BlockPos pos, int fortune)
    {
        IBlockState state = world.getBlockState(pos);
        Random rand = world instanceof World ? ((World)world).rand : new Random();
        if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this))
        {
            int j = 0;

            if (this == ModBlocks.sapphire_ore)
            {
                j = MathHelper.getRandomIntegerInRange(rand, 3, 7);
            }
            else if (this == ModBlocks.ruby_ore)
            {
                j = MathHelper.getRandomIntegerInRange(rand, 2, 5);
            }

            return j;
        }
        return 0;
    }
}