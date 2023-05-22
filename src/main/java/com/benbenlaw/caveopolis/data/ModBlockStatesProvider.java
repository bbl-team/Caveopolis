package com.benbenlaw.caveopolis.data;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStatesProvider extends BlockStateProvider {



    public ModBlockStatesProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Caveopolis.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {


        simpleBlock(ModBlocks.BLACK_COLORED_STONE.get());

        slabBlock((SlabBlock) ModBlocks.BLACK_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.BLACK_COLORED_STONE.get()),
                blockTexture(ModBlocks.BLACK_COLORED_STONE.get()));

        stairsBlock((StairBlock) ModBlocks.BLACK_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.BLACK_COLORED_STONE.get()));

        wallBlock((WallBlock) ModBlocks.BLACK_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.BLACK_COLORED_STONE.get()));

        simpleBlock(ModBlocks.BLACK_COLORED_STONE_BRICKS.get());

        slabBlock((SlabBlock) ModBlocks.BLACK_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.BLACK_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.BLACK_COLORED_STONE_BRICKS.get()));

        stairsBlock((StairBlock) ModBlocks.BLACK_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.BLACK_COLORED_STONE_BRICKS.get()));

        wallBlock((WallBlock) ModBlocks.BLACK_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.BLACK_COLORED_STONE_BRICKS.get()));
        
        
        
        
        simpleBlock(ModBlocks.WHITE_COLORED_STONE.get());
        slabBlock((SlabBlock) ModBlocks.WHITE_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.WHITE_COLORED_STONE.get()),
                blockTexture(ModBlocks.WHITE_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.WHITE_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.WHITE_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.WHITE_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.WHITE_COLORED_STONE.get()));

        simpleBlock(ModBlocks.WHITE_COLORED_STONE_BRICKS.get());
        slabBlock((SlabBlock) ModBlocks.WHITE_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.WHITE_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.WHITE_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.WHITE_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.WHITE_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.WHITE_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.WHITE_COLORED_STONE_BRICKS.get()));

        
        
        
        simpleBlock(ModBlocks.BLUE_COLORED_STONE.get());
        slabBlock((SlabBlock) ModBlocks.BLUE_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.BLUE_COLORED_STONE.get()),
                blockTexture(ModBlocks.BLUE_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.BLUE_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.BLUE_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.BLUE_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.BLUE_COLORED_STONE.get()));

        simpleBlock(ModBlocks.BLUE_COLORED_STONE_BRICKS.get());
        slabBlock((SlabBlock) ModBlocks.BLUE_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.BLUE_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.BLUE_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.BLUE_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.BLUE_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.BLUE_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.BLUE_COLORED_STONE_BRICKS.get()));

        
        
        
        simpleBlock(ModBlocks.LIME_COLORED_STONE.get());
        slabBlock((SlabBlock) ModBlocks.LIME_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.LIME_COLORED_STONE.get()),
                blockTexture(ModBlocks.LIME_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.LIME_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.LIME_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.LIME_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.LIME_COLORED_STONE.get()));

        simpleBlock(ModBlocks.LIME_COLORED_STONE_BRICKS.get());
        slabBlock((SlabBlock) ModBlocks.LIME_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.LIME_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.LIME_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.LIME_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.LIME_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.LIME_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.LIME_COLORED_STONE_BRICKS.get()));



        simpleBlock(ModBlocks.ORANGE_COLORED_STONE.get());
        slabBlock((SlabBlock) ModBlocks.ORANGE_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.ORANGE_COLORED_STONE.get()),
                blockTexture(ModBlocks.ORANGE_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.ORANGE_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.ORANGE_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.ORANGE_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.ORANGE_COLORED_STONE.get()));

        simpleBlock(ModBlocks.ORANGE_COLORED_STONE_BRICKS.get());
        slabBlock((SlabBlock) ModBlocks.ORANGE_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.ORANGE_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.ORANGE_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.ORANGE_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.ORANGE_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.ORANGE_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.ORANGE_COLORED_STONE_BRICKS.get()));



        simpleBlock(ModBlocks.PINK_COLORED_STONE.get());
        slabBlock((SlabBlock) ModBlocks.PINK_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.PINK_COLORED_STONE.get()),
                blockTexture(ModBlocks.PINK_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.PINK_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.PINK_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.PINK_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.PINK_COLORED_STONE.get()));

        simpleBlock(ModBlocks.PINK_COLORED_STONE_BRICKS.get());
        slabBlock((SlabBlock) ModBlocks.PINK_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.PINK_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.PINK_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.PINK_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.PINK_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.PINK_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.PINK_COLORED_STONE_BRICKS.get()));



        simpleBlock(ModBlocks.PURPLE_COLORED_STONE.get());
        slabBlock((SlabBlock) ModBlocks.PURPLE_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.PURPLE_COLORED_STONE.get()),
                blockTexture(ModBlocks.PURPLE_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.PURPLE_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.PURPLE_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.PURPLE_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.PURPLE_COLORED_STONE.get()));

        simpleBlock(ModBlocks.PURPLE_COLORED_STONE_BRICKS.get());
        slabBlock((SlabBlock) ModBlocks.PURPLE_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.PURPLE_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.PURPLE_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.PURPLE_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.PURPLE_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.PURPLE_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.PURPLE_COLORED_STONE_BRICKS.get()));


        
        simpleBlock(ModBlocks.MAGENTA_COLORED_STONE.get());
        slabBlock((SlabBlock) ModBlocks.MAGENTA_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.MAGENTA_COLORED_STONE.get()),
                blockTexture(ModBlocks.MAGENTA_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.MAGENTA_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.MAGENTA_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.MAGENTA_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.MAGENTA_COLORED_STONE.get()));

        simpleBlock(ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get());
        slabBlock((SlabBlock) ModBlocks.MAGENTA_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.MAGENTA_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.MAGENTA_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get()));



        simpleBlock(ModBlocks.RED_COLORED_STONE.get());
        slabBlock((SlabBlock) ModBlocks.RED_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.RED_COLORED_STONE.get()),
                blockTexture(ModBlocks.RED_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.RED_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.RED_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.RED_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.RED_COLORED_STONE.get()));

        simpleBlock(ModBlocks.RED_COLORED_STONE_BRICKS.get());
        slabBlock((SlabBlock) ModBlocks.RED_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.RED_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.RED_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.RED_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.RED_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.RED_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.RED_COLORED_STONE_BRICKS.get()));



        simpleBlock(ModBlocks.LIGHT_BLUE_COLORED_STONE.get());
        slabBlock((SlabBlock) ModBlocks.LIGHT_BLUE_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_STONE.get()),
                blockTexture(ModBlocks.LIGHT_BLUE_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_BLUE_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.LIGHT_BLUE_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_STONE.get()));

        simpleBlock(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get());
        slabBlock((SlabBlock) ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get()));



        simpleBlock(ModBlocks.LIGHT_GRAY_COLORED_STONE.get());
        slabBlock((SlabBlock) ModBlocks.LIGHT_GRAY_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_STONE.get()),
                blockTexture(ModBlocks.LIGHT_GRAY_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_GRAY_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.LIGHT_GRAY_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_STONE.get()));

        simpleBlock(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get());
        slabBlock((SlabBlock) ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get()));




        simpleBlock(ModBlocks.GRAY_COLORED_STONE.get());
        slabBlock((SlabBlock) ModBlocks.GRAY_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.GRAY_COLORED_STONE.get()),
                blockTexture(ModBlocks.GRAY_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.GRAY_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.GRAY_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.GRAY_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.GRAY_COLORED_STONE.get()));

        simpleBlock(ModBlocks.GRAY_COLORED_STONE_BRICKS.get());
        slabBlock((SlabBlock) ModBlocks.GRAY_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.GRAY_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.GRAY_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.GRAY_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.GRAY_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.GRAY_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.GRAY_COLORED_STONE_BRICKS.get()));


        simpleBlock(ModBlocks.CYAN_COLORED_STONE.get());
        slabBlock((SlabBlock) ModBlocks.CYAN_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.CYAN_COLORED_STONE.get()),
                blockTexture(ModBlocks.CYAN_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.CYAN_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.CYAN_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.CYAN_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.CYAN_COLORED_STONE.get()));

        simpleBlock(ModBlocks.CYAN_COLORED_STONE_BRICKS.get());
        slabBlock((SlabBlock) ModBlocks.CYAN_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.CYAN_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.CYAN_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.CYAN_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.CYAN_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.CYAN_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.CYAN_COLORED_STONE_BRICKS.get()));



        simpleBlock(ModBlocks.GREEN_COLORED_STONE.get());
        slabBlock((SlabBlock) ModBlocks.GREEN_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.GREEN_COLORED_STONE.get()),
                blockTexture(ModBlocks.GREEN_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.GREEN_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.GREEN_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.GREEN_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.GREEN_COLORED_STONE.get()));

        simpleBlock(ModBlocks.GREEN_COLORED_STONE_BRICKS.get());
        slabBlock((SlabBlock) ModBlocks.GREEN_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.GREEN_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.GREEN_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.GREEN_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.GREEN_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.GREEN_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.GREEN_COLORED_STONE_BRICKS.get()));


        simpleBlock(ModBlocks.YELLOW_COLORED_STONE.get());
        slabBlock((SlabBlock) ModBlocks.YELLOW_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.YELLOW_COLORED_STONE.get()),
                blockTexture(ModBlocks.YELLOW_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.YELLOW_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.YELLOW_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.YELLOW_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.YELLOW_COLORED_STONE.get()));

        simpleBlock(ModBlocks.YELLOW_COLORED_STONE_BRICKS.get());
        slabBlock((SlabBlock) ModBlocks.YELLOW_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.YELLOW_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.YELLOW_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.YELLOW_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.YELLOW_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.YELLOW_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.YELLOW_COLORED_STONE_BRICKS.get()));



        simpleBlock(ModBlocks.BROWN_COLORED_STONE.get());
        slabBlock((SlabBlock) ModBlocks.BROWN_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.BROWN_COLORED_STONE.get()),
                blockTexture(ModBlocks.BROWN_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.BROWN_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.BROWN_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.BROWN_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.BROWN_COLORED_STONE.get()));

        simpleBlock(ModBlocks.BROWN_COLORED_STONE_BRICKS.get());
        slabBlock((SlabBlock) ModBlocks.BROWN_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.BROWN_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.BROWN_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.BROWN_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.BROWN_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.BROWN_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.BROWN_COLORED_STONE_BRICKS.get()));

        simpleBlock(ModBlocks.BROWN_COLORED_BRIGHT_STONE.get());
        simpleBlock(ModBlocks.MAGENTA_COLORED_BRIGHT_STONE.get());
        simpleBlock(ModBlocks.PURPLE_COLORED_BRIGHT_STONE.get());
        simpleBlock(ModBlocks.WHITE_COLORED_BRIGHT_STONE.get());
        simpleBlock(ModBlocks.YELLOW_COLORED_BRIGHT_STONE.get());
        simpleBlock(ModBlocks.LIGHT_GRAY_COLORED_BRIGHT_STONE.get());
        simpleBlock(ModBlocks.BLUE_COLORED_BRIGHT_STONE.get());
        simpleBlock(ModBlocks.LIGHT_BLUE_COLORED_BRIGHT_STONE.get());
        simpleBlock(ModBlocks.GRAY_COLORED_BRIGHT_STONE.get());
        simpleBlock(ModBlocks.PINK_COLORED_BRIGHT_STONE.get());
        simpleBlock(ModBlocks.RED_COLORED_BRIGHT_STONE.get());
        simpleBlock(ModBlocks.BLACK_COLORED_BRIGHT_STONE.get());
        simpleBlock(ModBlocks.ORANGE_COLORED_BRIGHT_STONE.get());
        simpleBlock(ModBlocks.GREEN_COLORED_BRIGHT_STONE.get());
        simpleBlock(ModBlocks.LIME_COLORED_BRIGHT_STONE.get());
        simpleBlock(ModBlocks.CYAN_COLORED_BRIGHT_STONE.get());



        




    }

}