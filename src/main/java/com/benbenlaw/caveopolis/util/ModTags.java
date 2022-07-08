package com.benbenlaw.caveopolis.util;

import com.benbenlaw.caveopolis.Caveopolis;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {



    public static class Blocks {


        public static final TagKey<Block> COLORED_STONE = tag("colored_stone");
        public static final TagKey<Block> COLORED_STONE_BRICKS = tag("colored_stone_bricks");

        public static final TagKey<Block> COLORED_STONE_STAIRS = tag("colored_stone_stairs");
        public static final TagKey<Block> COLORED_STONE_BRICK_STAIRS = tag("colored_stone_brick_stairs");

        public static final TagKey<Block> COLORED_STONE_WALL = tag("colored_stone_wall");
        public static final TagKey<Block> COLORED_STONE_BRICK_WALL = tag("colored_stone_brick_wall");

        public static final TagKey<Block> COLORED_STONE_SLABS = tag("colored_stone_slabs");
        public static final TagKey<Block> COLORED_STONE_BRICK_SLABS = tag("colored_stone_brick_slabs");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Caveopolis.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }

    }




    public static class Items {
   //     public static final TagKey<Item> SPACE_SUIT_HELMET = tag("space_suit_helmet");
        public static final TagKey<Item> MIXED_STONE_INGOTS = forgeTag("ingots/mixed_stone_ingot");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Caveopolis.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }

    }

}
