package com.jdlogic.examplemod.world;

import com.google.common.base.Predicate;
import com.jdlogic.examplemod.init.ModBlocks;
import com.jdlogic.examplemod.reference.Settings;
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
    public static Predicate generateIn;

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

    public void generateOverworld(World world, Random random, int x, int z)
    {
        generateIn = BlockHelper.forBlock(Blocks.stone);

        generateOre(ModBlocks.sapphire_ore.getDefaultState(), world, random, x, z,
                Settings.SapphireOverworld.maxVeinSize, Settings.SapphireOverworld.veinPerChunk,
                Settings.SapphireOverworld.minY, Settings.SapphireOverworld.maxY);

        generateOre(ModBlocks.ruby_ore.getDefaultState(), world, random, x, z,
                Settings.RubyOverworld.maxVeinSize, Settings.RubyOverworld.veinPerChunk,
                Settings.RubyOverworld.minY, Settings.RubyOverworld.maxY);
    }

    public void generateNether(World world, Random random, int x, int z)
    {
        generateIn = BlockHelper.forBlock(Blocks.netherrack);

        generateOre(ModBlocks.nether_sapphire_ore.getDefaultState(), world, random, x, z,
                Settings.SapphireNether.maxVeinSize, Settings.SapphireNether.veinPerChunk,
                Settings.SapphireNether.minY, Settings.SapphireNether.maxY);

        generateOre(ModBlocks.nether_ruby_ore.getDefaultState(), world, random, x, z,
                Settings.RubyNether.maxVeinSize, Settings.RubyNether.veinPerChunk,
                Settings.RubyNether.minY, Settings.RubyNether.maxY);
    }

    public void generateSky(World world, Random random, int x, int z)
    {
        generateIn = BlockHelper.forBlock(Blocks.end_stone);

        generateOre(ModBlocks.end_sapphire_ore.getDefaultState(), world, random, x, z,
                Settings.SapphireEnd.maxVeinSize, Settings.SapphireEnd.veinPerChunk,
                Settings.SapphireEnd.minY, Settings.SapphireEnd.maxY);

        generateOre(ModBlocks.end_ruby_ore.getDefaultState(), world, random, x, z,
                Settings.RubyEnd.maxVeinSize, Settings.RubyEnd.veinPerChunk,
                Settings.RubyEnd.minY, Settings.RubyEnd.maxY);
    }

    public void generateOre(IBlockState blockState, World world, Random random, int chunkX, int chunkZ, int maxVeinSize, int veinPerChunck, int minY, int maxY)
    {
        int heightRange = maxY - minY;

        for (int i = 0; i < veinPerChunck; i++)
        {
            int xPos = chunkX * 16 + random.nextInt(16);
            int yPos = minY + random.nextInt(heightRange);
            int zPos = chunkZ * 16 + random.nextInt(16);

            BlockPos blockpos1 = new BlockPos(xPos, yPos, zPos);
            (new WorldGenMinable(blockState, maxVeinSize, generateIn)).generate(world, random, blockpos1);
        }
    }
}
