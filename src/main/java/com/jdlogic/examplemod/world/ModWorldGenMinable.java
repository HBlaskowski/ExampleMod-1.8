package com.jdlogic.examplemod.world;

import com.jdlogic.examplemod.init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class ModWorldGenMinable implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch(world.provider.getDimensionId())
        {
            //Sky
            case 1:
                generateSky(world, random, chunkX, chunkZ);
                break;

            //Overworld
            case 0:
                generateOverworld(world, random, chunkX, chunkZ);
                break;

            //Nether
            case -1:
                generateNether(world, random, chunkX, chunkZ);
                break;
        }
    }

    public void generateNether(World world, Random random, int x, int z)
    {

    }

    public void generateOverworld(World world, Random random, int x, int z)
    {
        generateOre(ModBlocks.sapphire_ore.getDefaultState(), world, random, x, z, 2, 6, 1, 0, 16);
    }

    public void generateSky(World world, Random random, int x, int z)
    {

    }

    public void generateOre(IBlockState blockState, World world, Random random, int chunkX, int chunkZ, int minVienSize, int maxVienSize, int chance, int minY, int maxY)
    {
        int vienSize = minVienSize + random.nextInt(maxVienSize - minVienSize);
        int heightRange = maxY - minY;

        WorldGenMinable modMinable = new WorldGenMinable(blockState, vienSize, BlockHelper.forBlock(Blocks.stone));

        for (int i = 0; i < chance; i++)
        {
            int xPos = chunkX * 16 + random.nextInt(16);
            int yPos = random.nextInt(heightRange) + minY;
            int zPos = chunkZ * 16 + random.nextInt(16);

            BlockPos blockpos1 = new BlockPos(xPos, yPos, zPos);
            modMinable.generate(world, random, blockpos1);
        }
    }
}
