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
        public static final TagKey<Block> COLORED_BRIGHT_STONE = tag("colored_bright_stone");
        public static final TagKey<Block> COLORED_STONE_BRICKS = tag("colored_stone_bricks");

        public static final TagKey<Block> COLORED_STONE_STAIRS = tag("colored_stone_stairs");
        public static final TagKey<Block> COLORED_STONE_BRICK_STAIRS = tag("colored_stone_brick_stairs");

        public static final TagKey<Block> COLORED_STONE_WALL = tag("colored_stone_wall");
        public static final TagKey<Block> COLORED_STONE_BRICK_WALL = tag("colored_stone_brick_wall");

        public static final TagKey<Block> COLORED_STONE_SLABS = tag("colored_stone_slabs");
        public static final TagKey<Block> COLORED_STONE_BRICK_SLABS = tag("colored_stone_brick_slabs");

        public static final TagKey<Block> COLORED_STONE_BUTTONS = tag("colored_stone_buttons");
        public static final TagKey<Block> COLORED_STONE_PRESSURE_PLATES = tag("colored_stone_pressure_plates");
        
        public static final TagKey<Block> COLORED_COBBLESTONE = tag("colored_cobblestone");
        public static final TagKey<Block> COLORED_BRIGHT_COBBLESTONE = tag("colored_bright_cobblestone");
        public static final TagKey<Block> COLORED_COBBLESTONE_BRICKS = tag("colored_cobblestone_bricks");

        public static final TagKey<Block> COLORED_COBBLESTONE_STAIRS = tag("colored_cobblestone_stairs");
        public static final TagKey<Block> COLORED_COBBLESTONE_BRICK_STAIRS = tag("colored_cobblestone_brick_stairs");

        public static final TagKey<Block> COLORED_COBBLESTONE_WALL = tag("colored_cobblestone_wall");
        public static final TagKey<Block> COLORED_COBBLESTONE_BRICK_WALL = tag("colored_cobblestone_brick_wall");

        public static final TagKey<Block> COLORED_COBBLESTONE_SLABS = tag("colored_cobblestone_slabs");
        public static final TagKey<Block> COLORED_COBBLESTONE_BRICK_SLABS = tag("colored_cobblestone_brick_slabs");

        public static final TagKey<Block> COLORED_WOODEN_PLANKS = tag("colored_wooden_planks");
        public static final TagKey<Block> COLORED_WOODEN_PLANK_STAIRS = tag("colored_wooden_plank_stairs");
        public static final TagKey<Block> COLORED_WOODEN_PLANK_SLABS = tag("colored_wooden_plank_slabs");
        public static final TagKey<Block> COLORED_WOODEN_PLANK_BUTTONS = tag("colored_wooden_plank_buttons");
        public static final TagKey<Block> COLORED_WOODEN_PLANK_PRESSURE_PLATES = tag("colored_wooden_plank_pressure_plates");

        public static final TagKey<Block> COLORED_WOODEN_PLANK_FENCES = tag("colored_wooden_plank_fences");
        public static final TagKey<Block> COLORED_WOODEN_PLANK_FENCE_GATES = tag("colored_wooden_plank_fence_gates");
        public static final TagKey<Block> COLORED_WOODEN_PLANK_DOORS = tag("colored_wooden_plank_doors");
        public static final TagKey<Block> COLORED_WOODEN_PLANK_TRAPDOORS = tag("colored_wooden_plank_trapdoors");

        public static final TagKey<Block> COLORED_SIGNS = tag("colored_signs");
        public static final TagKey<Block> COLORED_WALL_SIGNS = tag("colored_wall_signs");
        public static final TagKey<Block> COLORED_HANGING_SIGNS = tag("colored_hanging_signs");
        public static final TagKey<Block> COLORED_WALL_HANGING_SIGNS = tag("colored_wall_hanging_signs");

        public static final TagKey<Block> BROWN_COLORED_LOGS = tag("brown_colored_logs");
        public static final TagKey<Block> BLACK_COLORED_LOGS = tag("black_colored_logs");
        public static final TagKey<Block> GREEN_COLORED_LOGS = tag("green_colored_logs");
        public static final TagKey<Block> LIME_COLORED_LOGS = tag("lime_colored_logs");
        public static final TagKey<Block> CYAN_COLORED_LOGS = tag("cyan_colored_logs");
        public static final TagKey<Block> BLUE_COLORED_LOGS = tag("blue_colored_logs");
        public static final TagKey<Block> LIGHT_BLUE_COLORED_LOGS = tag("light_blue_colored_logs");
        public static final TagKey<Block> LIGHT_GRAY_COLORED_LOGS = tag("light_gray_colored_logs");
        public static final TagKey<Block> GRAY_COLORED_LOGS = tag("gray_colored_logs");
        public static final TagKey<Block> ORANGE_COLORED_LOGS = tag("orange_colored_logs");
        public static final TagKey<Block> YELLOW_COLORED_LOGS = tag("yellow_colored_logs");
        public static final TagKey<Block> WHITE_COLORED_LOGS = tag("white_colored_logs");
        public static final TagKey<Block> PURPLE_COLORED_LOGS = tag("purple_colored_logs");
        public static final TagKey<Block> MAGENTA_COLORED_LOGS = tag("magenta_colored_logs");
        public static final TagKey<Block> PINK_COLORED_LOGS = tag("pink_colored_logs");
        public static final TagKey<Block> RED_COLORED_LOGS = tag("red_colored_logs");

        public static final TagKey<Block> COLORED_WOODS = tag("colored_woods");
        public static final TagKey<Block> COLORED_LOGS = tag("colored_logs");
        public static final TagKey<Block> STRIPPED_COLORED_WOODS = tag("stripped_colored_woods");
        public static final TagKey<Block> STRIPPED_COLORED_LOGS = tag("stripped_colored_logs");

        public static final TagKey<Block> BANNED_FROM_IN_WORLD_SPRAYING = tag("banned_from_in_world_spraying");
        public static final TagKey<Block> GLAZED_TERRACOTTA = tag("glazed_terracotta");
        public static final TagKey<Block> COLORED_CONCRETE = tag("colored_concrete");

        public static final TagKey<Block> SHULKER_BOXES = forgeTag("shulker_boxes");

        public static final TagKey<Block> MARBLE_BLOCKS = tag("marble_blocks");

        public static final TagKey<Block> COLORED_LEAVES = tag("colored_leaves");
        public static final TagKey<Block> COLORED_SAPLINGS = tag("colored_saplings");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Caveopolis.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }

    }




    public static class Items {
        public static final TagKey<Item> MIXED_STONE_INGOTS = forgeTag("ingots/mixed_stone_ingot");
        public static final TagKey<Item> BRIGHT_ITEMS = tag("bright_items");
        public static final TagKey<Item> SPRAY_CANS = tag("spray_cans");

        public static final TagKey<Item> COLORED_STONE = tag("colored_stone");
        public static final TagKey<Item> COLORED_BRIGHT_STONE = tag("colored_bright_stone");
        public static final TagKey<Item> COLORED_STONE_BRICKS = tag("colored_stone_bricks");

        public static final TagKey<Item> COLORED_STONE_STAIRS = tag("colored_stone_stairs");
        public static final TagKey<Item> COLORED_STONE_BRICK_STAIRS = tag("colored_stone_brick_stairs");

        public static final TagKey<Item> COLORED_STONE_WALL = tag("colored_stone_wall");
        public static final TagKey<Item> COLORED_STONE_BRICK_WALL = tag("colored_stone_brick_wall");

        public static final TagKey<Item> COLORED_STONE_SLABS = tag("colored_stone_slabs");
        public static final TagKey<Item> COLORED_STONE_BRICK_SLABS = tag("colored_stone_brick_slabs");
        public static final TagKey<Item> COLORED_STONE_BUTTONS = tag("colored_stone_buttons");
        public static final TagKey<Item> COLORED_STONE_PRESSURE_PLATES = tag("colored_stone_pressure_plates");

        public static final TagKey<Item> COLORED_COBBLESTONE = tag("colored_cobblestone");
        public static final TagKey<Item> COLORED_BRIGHT_COBBLESTONE = tag("colored_bright_cobblestone");
        public static final TagKey<Item> COLORED_COBBLESTONE_BRICKS = tag("colored_cobblestone_bricks");

        public static final TagKey<Item> COLORED_COBBLESTONE_STAIRS = tag("colored_cobblestone_stairs");
        public static final TagKey<Item> COLORED_COBBLESTONE_BRICK_STAIRS = tag("colored_cobblestone_brick_stairs");

        public static final TagKey<Item> COLORED_COBBLESTONE_WALL = tag("colored_cobblestone_wall");
        public static final TagKey<Item> COLORED_COBBLESTONE_BRICK_WALL = tag("colored_cobblestone_brick_wall");

        public static final TagKey<Item> COLORED_COBBLESTONE_SLABS = tag("colored_cobblestone_slabs");
        public static final TagKey<Item> COLORED_COBBLESTONE_BRICK_SLABS = tag("colored_cobblestone_brick_slabs");

        public static final TagKey<Item> COLORED_WOODEN_PLANKS = tag("colored_wooden_planks");
        public static final TagKey<Item> COLORED_WOODEN_PLANK_STAIRS = tag("colored_wooden_plank_stairs");
        public static final TagKey<Item> COLORED_WOODEN_PLANK_SLABS = tag("colored_wooden_plank_slabs");
        public static final TagKey<Item> COLORED_WOODEN_PLANK_BUTTONS = tag("colored_wooden_plank_buttons");
        public static final TagKey<Item> COLORED_WOODEN_PLANK_PRESSURE_PLATES = tag("colored_wooden_plank_pressure_plates");
        public static final TagKey<Item> COLORED_WOODEN_PLANK_FENCES = tag("colored_wooden_plank_fences");
        public static final TagKey<Item> COLORED_WOODEN_PLANK_FENCE_GATES = tag("colored_wooden_plank_fence_gates");
        public static final TagKey<Item> COLORED_WOODEN_PLANK_DOORS = tag("colored_wooden_plank_doors");
        public static final TagKey<Item> COLORED_WOODEN_PLANK_TRAPDOORS = tag("colored_wooden_plank_trapdoors");

        public static final TagKey<Item> COLORED_SIGNS = tag("colored_signs");
        public static final TagKey<Item> COLORED_WALL_SIGNS = tag("colored_wall_signs");
        public static final TagKey<Item> COLORED_HANGING_SIGNS = tag("colored_hanging_signs");
        public static final TagKey<Item> COLORED_WALL_HANGING_SIGNS = tag("colored_wall_hanging_signs");

        public static final TagKey<Item> COLORED_WOODS = tag("colored_woods");
        public static final TagKey<Item> COLORED_LOGS = tag("colored_logs");
        public static final TagKey<Item> STRIPPED_COLORED_WOODS = tag("stripped_colored_woods");
        public static final TagKey<Item> STRIPPED_COLORED_LOGS = tag("stripped_colored_logs");


        public static final TagKey<Item> BROWN_COLORED_LOGS = tag("brown_colored_logs");
        public static final TagKey<Item> BLACK_COLORED_LOGS = tag("black_colored_logs");
        public static final TagKey<Item> GREEN_COLORED_LOGS = tag("green_colored_logs");
        public static final TagKey<Item> LIME_COLORED_LOGS = tag("lime_colored_logs");
        public static final TagKey<Item> CYAN_COLORED_LOGS = tag("cyan_colored_logs");
        public static final TagKey<Item> BLUE_COLORED_LOGS = tag("blue_colored_logs");
        public static final TagKey<Item> LIGHT_BLUE_COLORED_LOGS = tag("light_blue_colored_logs");
        public static final TagKey<Item> LIGHT_GRAY_COLORED_LOGS = tag("light_gray_colored_logs");
        public static final TagKey<Item> GRAY_COLORED_LOGS = tag("gray_colored_logs");
        public static final TagKey<Item> ORANGE_COLORED_LOGS = tag("orange_colored_logs");
        public static final TagKey<Item> YELLOW_COLORED_LOGS = tag("yellow_colored_logs");
        public static final TagKey<Item> WHITE_COLORED_LOGS = tag("white_colored_logs");
        public static final TagKey<Item> PURPLE_COLORED_LOGS = tag("purple_colored_logs");
        public static final TagKey<Item> MAGENTA_COLORED_LOGS = tag("magenta_colored_logs");
        public static final TagKey<Item> PINK_COLORED_LOGS = tag("pink_colored_logs");
        public static final TagKey<Item> RED_COLORED_LOGS = tag("red_colored_logs");

        public static final TagKey<Item> COLORED_LEAVES = tag("colored_leaves");
        public static final TagKey<Item> COLORED_SAPLINGS = tag("colored_saplings");





















        public static final TagKey<Item> COLORED_CONCRETE = tag("colored_concrete");
        public static final TagKey<Item> BANNED_FROM_IN_WORLD_SPRAYING = tag("banned_from_in_world_spraying");
        public static final TagKey<Item> GLAZED_TERRACOTTA = tag("glazed_terracotta");

        public static final TagKey<Item> SHULKER_BOXES = forgeTag("shulker_boxes");
        public static final TagKey<Item> RODS_STONE = forgeTag("rods/stone");




        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Caveopolis.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }

    }

}
