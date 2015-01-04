package com.jdlogic.examplemod.reference;

public class Settings
{
    public static final String GENERAL = "general";
    public static final String SAPPHIRE_OVERWORLD = "sapphireOverworld";
    public static final String SAPPHIRE_NETHER = "sapphireNether";
    public static final String SAPPHIRE_END = "sapphireEnd";
    public static final String RUBY_OVERWORLD = "rubyOverworld";
    public static final String RUBY_NETHER = "rubyNether";
    public static final String RUBY_END = "rubyEnd";

    public static class General
    {
        public static boolean enableModBlocks = true;
        public static boolean enableModItems = true;
        public static boolean enableModOreGeneration = true;
    }

    public static class SapphireOverworld
    {
        public static int maxVeinSize = 6;
        public static int veinPerChunk = 3;
        public static int minY = 0;
        public static int maxY = 16;
    }

    public static class SapphireNether
    {
        public static int maxVeinSize = 6;
        public static int veinPerChunk = 4;
        public static int minY = 16;
        public static int maxY = 48;
    }

    public static class SapphireEnd
    {
        public static int maxVeinSize = 6;
        public static int veinPerChunk = 6;
        public static int minY = 10;
        public static int maxY =70;
    }

    public static class RubyOverworld
    {
        public static int maxVeinSize = 8;
        public static int veinPerChunk = 12;
        public static int minY = 0;
        public static int maxY = 64;
    }

    public static class RubyNether
    {
        public static int maxVeinSize = 8;
        public static int veinPerChunk = 16;
        public static int minY = 32;
        public static int maxY = 112;
    }

    public static class RubyEnd
    {
        public static int maxVeinSize = 8;
        public static int veinPerChunk = 12;
        public static int minY = 10;
        public static int maxY = 70;
    }
}
