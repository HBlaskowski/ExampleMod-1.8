package com.jdlogic.examplemod.block.ore;

import com.jdlogic.examplemod.block.BlockEM;
import com.jdlogic.examplemod.creativetab.CreativeTabEM;
import com.jdlogic.examplemod.init.ModBlocks;
import com.jdlogic.examplemod.init.ModItems;
import com.jdlogic.examplemod.reference.Names;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class BlockSapphireOre extends BlockEM
{
    public BlockSapphireOre()
    {
        super();
        this.setUnlocalizedName(Names.Blocks.SAPPHIRE_ORE);
        this.setCreativeTab(CreativeTabEM.EM_TAB);
        this.setHardness(5.0F);
        this.setResistance(10.0F);
        this.setStepSound(soundTypePiston);
        this.setHarvestLevel("pickaxe", 2);
    }

    // Sets item to be dropped when block is mined
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return this == ModBlocks.sapphire_ore ? ModItems.sapphire : Item.getItemFromBlock(this);
    }

    // Sets normal item drop amount
    public int quantityDropped(Random random)
    {
        return 1;
    }

    // Adds chance of extra item drops based on fortune level
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

    // Sets the amount of exp dropped when block is mined
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

            return j;
        }
        return 0;
    }
}
