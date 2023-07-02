package com.benbenlaw.caveopolis.data;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.ModBlocks;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStatesProvider extends BlockStateProvider {

    public ModBlockStatesProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Caveopolis.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        //MISC BLOCKS

        blockWithItem(ModBlocks.BRIGHT_STONE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_BRIGHT_STONE_ORE);
        blockWithItem(ModBlocks.MIXED_STONE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_MIXED_STONE_ORE);
        models().cube(ModBlocks.STONE_CRAFTING_TABLE.get().toString(),
                        modLoc("block/bright_colored_stone"),
                        modLoc("block/stone_crafting_table_top"),
                        modLoc("block/stone_crafting_table_front"),
                        modLoc("block/stone_crafting_table_side"),
                        modLoc("block/stone_crafting_table_side"),
                        modLoc("block/stone_crafting_table_front"));
        blockWithItem(ModBlocks.MOSSY_STONE);

        //BLACK
        blockWithItem(ModBlocks.BLACK_COLORED_STONE);
        slabBlock((SlabBlock) ModBlocks.BLACK_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.BLACK_COLORED_STONE.get()),
                blockTexture(ModBlocks.BLACK_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.BLACK_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.BLACK_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.BLACK_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.BLACK_COLORED_STONE.get()));

        blockWithItem(ModBlocks.BLACK_COLORED_STONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.BLACK_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.BLACK_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.BLACK_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.BLACK_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.BLACK_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.BLACK_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.BLACK_COLORED_STONE_BRICKS.get()));
        
        //WHITE
        blockWithItem(ModBlocks.WHITE_COLORED_STONE);
        slabBlock((SlabBlock) ModBlocks.WHITE_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.WHITE_COLORED_STONE.get()),
                blockTexture(ModBlocks.WHITE_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.WHITE_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.WHITE_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.WHITE_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.WHITE_COLORED_STONE.get()));

        blockWithItem(ModBlocks.WHITE_COLORED_STONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.WHITE_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.WHITE_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.WHITE_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.WHITE_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.WHITE_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.WHITE_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.WHITE_COLORED_STONE_BRICKS.get()));

        //BLUE
        blockWithItem(ModBlocks.BLUE_COLORED_STONE);
        slabBlock((SlabBlock) ModBlocks.BLUE_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.BLUE_COLORED_STONE.get()),
                blockTexture(ModBlocks.BLUE_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.BLUE_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.BLUE_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.BLUE_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.BLUE_COLORED_STONE.get()));

        blockWithItem(ModBlocks.BLUE_COLORED_STONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.BLUE_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.BLUE_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.BLUE_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.BLUE_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.BLUE_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.BLUE_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.BLUE_COLORED_STONE_BRICKS.get()));

        //LIME
        blockWithItem(ModBlocks.LIME_COLORED_STONE);
        slabBlock((SlabBlock) ModBlocks.LIME_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.LIME_COLORED_STONE.get()),
                blockTexture(ModBlocks.LIME_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.LIME_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.LIME_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.LIME_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.LIME_COLORED_STONE.get()));

        blockWithItem(ModBlocks.LIME_COLORED_STONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.LIME_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.LIME_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.LIME_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.LIME_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.LIME_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.LIME_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.LIME_COLORED_STONE_BRICKS.get()));

        //ORANGE
        blockWithItem(ModBlocks.ORANGE_COLORED_STONE);
        slabBlock((SlabBlock) ModBlocks.ORANGE_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.ORANGE_COLORED_STONE.get()),
                blockTexture(ModBlocks.ORANGE_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.ORANGE_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.ORANGE_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.ORANGE_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.ORANGE_COLORED_STONE.get()));

        blockWithItem(ModBlocks.ORANGE_COLORED_STONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.ORANGE_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.ORANGE_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.ORANGE_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.ORANGE_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.ORANGE_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.ORANGE_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.ORANGE_COLORED_STONE_BRICKS.get()));

        //PINK
        blockWithItem(ModBlocks.PINK_COLORED_STONE);
        slabBlock((SlabBlock) ModBlocks.PINK_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.PINK_COLORED_STONE.get()),
                blockTexture(ModBlocks.PINK_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.PINK_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.PINK_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.PINK_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.PINK_COLORED_STONE.get()));

        blockWithItem(ModBlocks.PINK_COLORED_STONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.PINK_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.PINK_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.PINK_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.PINK_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.PINK_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.PINK_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.PINK_COLORED_STONE_BRICKS.get()));

        //Purple
        blockWithItem(ModBlocks.PURPLE_COLORED_STONE);
        slabBlock((SlabBlock) ModBlocks.PURPLE_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.PURPLE_COLORED_STONE.get()),
                blockTexture(ModBlocks.PURPLE_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.PURPLE_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.PURPLE_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.PURPLE_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.PURPLE_COLORED_STONE.get()));

        blockWithItem(ModBlocks.PURPLE_COLORED_STONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.PURPLE_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.PURPLE_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.PURPLE_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.PURPLE_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.PURPLE_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.PURPLE_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.PURPLE_COLORED_STONE_BRICKS.get()));

        //MAGENTA
        blockWithItem(ModBlocks.MAGENTA_COLORED_STONE);
        slabBlock((SlabBlock) ModBlocks.MAGENTA_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.MAGENTA_COLORED_STONE.get()),
                blockTexture(ModBlocks.MAGENTA_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.MAGENTA_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.MAGENTA_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.MAGENTA_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.MAGENTA_COLORED_STONE.get()));

        blockWithItem(ModBlocks.MAGENTA_COLORED_STONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.MAGENTA_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.MAGENTA_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.MAGENTA_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get()));

        //RED
        blockWithItem(ModBlocks.RED_COLORED_STONE);
        slabBlock((SlabBlock) ModBlocks.RED_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.RED_COLORED_STONE.get()),
                blockTexture(ModBlocks.RED_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.RED_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.RED_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.RED_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.RED_COLORED_STONE.get()));

        blockWithItem(ModBlocks.RED_COLORED_STONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.RED_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.RED_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.RED_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.RED_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.RED_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.RED_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.RED_COLORED_STONE_BRICKS.get()));

        //LIGHT BLUE
        blockWithItem(ModBlocks.LIGHT_BLUE_COLORED_STONE);
        slabBlock((SlabBlock) ModBlocks.LIGHT_BLUE_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_STONE.get()),
                blockTexture(ModBlocks.LIGHT_BLUE_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_BLUE_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.LIGHT_BLUE_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_STONE.get()));

        blockWithItem(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get()));

        //LIGHT GRAY
        blockWithItem(ModBlocks.LIGHT_GRAY_COLORED_STONE);
        slabBlock((SlabBlock) ModBlocks.LIGHT_GRAY_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_STONE.get()),
                blockTexture(ModBlocks.LIGHT_GRAY_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_GRAY_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.LIGHT_GRAY_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_STONE.get()));

        blockWithItem(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get()));

        //GRAY
        blockWithItem(ModBlocks.GRAY_COLORED_STONE);
        slabBlock((SlabBlock) ModBlocks.GRAY_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.GRAY_COLORED_STONE.get()),
                blockTexture(ModBlocks.GRAY_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.GRAY_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.GRAY_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.GRAY_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.GRAY_COLORED_STONE.get()));

        blockWithItem(ModBlocks.GRAY_COLORED_STONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.GRAY_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.GRAY_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.GRAY_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.GRAY_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.GRAY_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.GRAY_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.GRAY_COLORED_STONE_BRICKS.get()));

        //CYAN
        blockWithItem(ModBlocks.CYAN_COLORED_STONE);
        slabBlock((SlabBlock) ModBlocks.CYAN_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.CYAN_COLORED_STONE.get()),
                blockTexture(ModBlocks.CYAN_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.CYAN_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.CYAN_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.CYAN_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.CYAN_COLORED_STONE.get()));

        blockWithItem(ModBlocks.CYAN_COLORED_STONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.CYAN_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.CYAN_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.CYAN_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.CYAN_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.CYAN_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.CYAN_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.CYAN_COLORED_STONE_BRICKS.get()));

        //GREEN
        blockWithItem(ModBlocks.GREEN_COLORED_STONE);
        slabBlock((SlabBlock) ModBlocks.GREEN_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.GREEN_COLORED_STONE.get()),
                blockTexture(ModBlocks.GREEN_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.GREEN_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.GREEN_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.GREEN_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.GREEN_COLORED_STONE.get()));

        blockWithItem(ModBlocks.GREEN_COLORED_STONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.GREEN_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.GREEN_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.GREEN_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.GREEN_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.GREEN_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.GREEN_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.GREEN_COLORED_STONE_BRICKS.get()));

        //YELLOW
        blockWithItem(ModBlocks.YELLOW_COLORED_STONE);
        slabBlock((SlabBlock) ModBlocks.YELLOW_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.YELLOW_COLORED_STONE.get()),
                blockTexture(ModBlocks.YELLOW_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.YELLOW_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.YELLOW_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.YELLOW_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.YELLOW_COLORED_STONE.get()));

        blockWithItem(ModBlocks.YELLOW_COLORED_STONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.YELLOW_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.YELLOW_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.YELLOW_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.YELLOW_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.YELLOW_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.YELLOW_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.YELLOW_COLORED_STONE_BRICKS.get()));

        //BROWN
        blockWithItem(ModBlocks.BROWN_COLORED_STONE);
        slabBlock((SlabBlock) ModBlocks.BROWN_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.BROWN_COLORED_STONE.get()),
                blockTexture(ModBlocks.BROWN_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.BROWN_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.BROWN_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.BROWN_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.BROWN_COLORED_STONE.get()));

        blockWithItem(ModBlocks.BROWN_COLORED_STONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.BROWN_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.BROWN_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.BROWN_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.BROWN_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.BROWN_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.BROWN_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.BROWN_COLORED_STONE_BRICKS.get()));

        //BRIGHT STONE
        blockWithItem(ModBlocks.BROWN_COLORED_BRIGHT_STONE);
        blockWithItem(ModBlocks.MAGENTA_COLORED_BRIGHT_STONE);
        blockWithItem(ModBlocks.PURPLE_COLORED_BRIGHT_STONE);
        blockWithItem(ModBlocks.WHITE_COLORED_BRIGHT_STONE);
        blockWithItem(ModBlocks.YELLOW_COLORED_BRIGHT_STONE);
        blockWithItem(ModBlocks.LIGHT_GRAY_COLORED_BRIGHT_STONE);
        blockWithItem(ModBlocks.BLUE_COLORED_BRIGHT_STONE);
        blockWithItem(ModBlocks.LIGHT_BLUE_COLORED_BRIGHT_STONE);
        blockWithItem(ModBlocks.GRAY_COLORED_BRIGHT_STONE);
        blockWithItem(ModBlocks.PINK_COLORED_BRIGHT_STONE);
        blockWithItem(ModBlocks.RED_COLORED_BRIGHT_STONE);
        blockWithItem(ModBlocks.BLACK_COLORED_BRIGHT_STONE);
        blockWithItem(ModBlocks.ORANGE_COLORED_BRIGHT_STONE);
        blockWithItem(ModBlocks.GREEN_COLORED_BRIGHT_STONE);
        blockWithItem(ModBlocks.LIME_COLORED_BRIGHT_STONE);
        blockWithItem(ModBlocks.CYAN_COLORED_BRIGHT_STONE);

    }
    
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}