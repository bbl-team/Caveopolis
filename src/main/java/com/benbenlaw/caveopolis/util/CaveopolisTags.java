package com.benbenlaw.caveopolis.util;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.core.util.CoreTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class CaveopolisTags  {

    public static class Blocks extends CoreTags.Blocks {
        public static final TagKey<Block> COLORING_BANNED = tag(Caveopolis.MOD_ID, "coloring_banned");
        public static final TagKey<Block> COLORED_LOGS = tag(Caveopolis.MOD_ID, "colored_logs");
        public static final TagKey<Block> COLORED_BAMBOO = tag(Caveopolis.MOD_ID, "colored_bamboo");
    }

    public static class Items extends CoreTags.Items {
        public static final TagKey<Item> COLORING_BANNED = tag(Caveopolis.MOD_ID, "coloring_banned");
        public static final TagKey<Item> COLORED_LOGS = tag(Caveopolis.MOD_ID, "colored_logs");
        public static final TagKey<Item> COLORED_BAMBOO = tag(Caveopolis.MOD_ID, "colored_bamboo");
    }
}
