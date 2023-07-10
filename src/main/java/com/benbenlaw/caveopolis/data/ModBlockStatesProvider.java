package com.benbenlaw.caveopolis.data;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.ModBlocks;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStatesProvider extends BlockStateProvider {

    public ModBlockStatesProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Caveopolis.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        blockWithItem(ModBlocks.BRIGHT_STONE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_BRIGHT_STONE_ORE);
        blockWithItem(ModBlocks.MIXED_STONE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_MIXED_STONE_ORE);
        blockWithItem(ModBlocks.MOSSY_STONE);

        //BLACK
        blockWithItem(ModBlocks.BLACK_COLORED_STONE);
        slabBlock((SlabBlock) ModBlocks.BLACK_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.BLACK_COLORED_STONE.get()),
                blockTexture(ModBlocks.BLACK_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.BLACK_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.BLACK_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.BLACK_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.BLACK_COLORED_STONE.get()));
        blockItem(ModBlocks.BLACK_COLORED_STONE_SLAB);
        blockItem(ModBlocks.BLACK_COLORED_STONE_STAIRS);

        blockWithItem(ModBlocks.BLACK_COLORED_STONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.BLACK_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.BLACK_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.BLACK_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.BLACK_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.BLACK_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.BLACK_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.BLACK_COLORED_STONE_BRICKS.get()));
        blockItem(ModBlocks.BLACK_COLORED_STONE_BRICK_SLAB);
        blockItem(ModBlocks.BLACK_COLORED_STONE_BRICK_STAIRS);

        //WHITE
        blockWithItem(ModBlocks.WHITE_COLORED_STONE);
        slabBlock((SlabBlock) ModBlocks.WHITE_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.WHITE_COLORED_STONE.get()),
                blockTexture(ModBlocks.WHITE_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.WHITE_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.WHITE_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.WHITE_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.WHITE_COLORED_STONE.get()));
        blockItem(ModBlocks.WHITE_COLORED_STONE_SLAB);
        blockItem(ModBlocks.WHITE_COLORED_STONE_STAIRS);

        blockWithItem(ModBlocks.WHITE_COLORED_STONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.WHITE_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.WHITE_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.WHITE_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.WHITE_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.WHITE_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.WHITE_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.WHITE_COLORED_STONE_BRICKS.get()));
        blockItem(ModBlocks.WHITE_COLORED_STONE_BRICK_SLAB);
        blockItem(ModBlocks.WHITE_COLORED_STONE_BRICK_STAIRS);

        //BLUE
        blockWithItem(ModBlocks.BLUE_COLORED_STONE);
        slabBlock((SlabBlock) ModBlocks.BLUE_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.BLUE_COLORED_STONE.get()),
                blockTexture(ModBlocks.BLUE_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.BLUE_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.BLUE_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.BLUE_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.BLUE_COLORED_STONE.get()));
        blockItem(ModBlocks.BLUE_COLORED_STONE_SLAB);
        blockItem(ModBlocks.BLUE_COLORED_STONE_STAIRS);

        blockWithItem(ModBlocks.BLUE_COLORED_STONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.BLUE_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.BLUE_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.BLUE_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.BLUE_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.BLUE_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.BLUE_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.BLUE_COLORED_STONE_BRICKS.get()));
        blockItem(ModBlocks.BLUE_COLORED_STONE_BRICK_SLAB);
        blockItem(ModBlocks.BLUE_COLORED_STONE_BRICK_STAIRS);

        //LIME
        blockWithItem(ModBlocks.LIME_COLORED_STONE);
        slabBlock((SlabBlock) ModBlocks.LIME_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.LIME_COLORED_STONE.get()),
                blockTexture(ModBlocks.LIME_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.LIME_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.LIME_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.LIME_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.LIME_COLORED_STONE.get()));
        blockItem(ModBlocks.LIME_COLORED_STONE_SLAB);
        blockItem(ModBlocks.LIME_COLORED_STONE_STAIRS);

        blockWithItem(ModBlocks.LIME_COLORED_STONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.LIME_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.LIME_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.LIME_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.LIME_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.LIME_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.LIME_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.LIME_COLORED_STONE_BRICKS.get()));
        blockItem(ModBlocks.LIME_COLORED_STONE_BRICK_SLAB);
        blockItem(ModBlocks.LIME_COLORED_STONE_BRICK_STAIRS);

        //ORANGE
        blockWithItem(ModBlocks.ORANGE_COLORED_STONE);
        slabBlock((SlabBlock) ModBlocks.ORANGE_COLORED_STONE_SLAB.get(), blockTexture(ModBlocks.ORANGE_COLORED_STONE.get()),
                blockTexture(ModBlocks.ORANGE_COLORED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.ORANGE_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.ORANGE_COLORED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.ORANGE_COLORED_STONE_WALL.get(), blockTexture(ModBlocks.ORANGE_COLORED_STONE.get()));
        blockItem(ModBlocks.ORANGE_COLORED_STONE_SLAB);
        blockItem(ModBlocks.ORANGE_COLORED_STONE_STAIRS);

        blockWithItem(ModBlocks.ORANGE_COLORED_STONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.ORANGE_COLORED_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.ORANGE_COLORED_STONE_BRICKS.get()),
                blockTexture(ModBlocks.ORANGE_COLORED_STONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.ORANGE_COLORED_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.ORANGE_COLORED_STONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.ORANGE_COLORED_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.ORANGE_COLORED_STONE_BRICKS.get()));
        blockItem(ModBlocks.ORANGE_COLORED_STONE_BRICK_SLAB);
        blockItem(ModBlocks.ORANGE_COLORED_STONE_BRICK_STAIRS);

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

        blockItem(ModBlocks.PINK_COLORED_STONE_SLAB);
        blockItem(ModBlocks.PINK_COLORED_STONE_STAIRS);
        blockItem(ModBlocks.PINK_COLORED_STONE_BRICK_SLAB);
        blockItem(ModBlocks.PINK_COLORED_STONE_BRICK_STAIRS);

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

        blockItem(ModBlocks.PURPLE_COLORED_STONE_SLAB);
        blockItem(ModBlocks.PURPLE_COLORED_STONE_STAIRS);
        blockItem(ModBlocks.PURPLE_COLORED_STONE_BRICK_SLAB);
        blockItem(ModBlocks.PURPLE_COLORED_STONE_BRICK_STAIRS);

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

        blockItem(ModBlocks.MAGENTA_COLORED_STONE_SLAB);
        blockItem(ModBlocks.MAGENTA_COLORED_STONE_STAIRS);
        blockItem(ModBlocks.MAGENTA_COLORED_STONE_BRICK_SLAB);
        blockItem(ModBlocks.MAGENTA_COLORED_STONE_BRICK_STAIRS);

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

        blockItem(ModBlocks.RED_COLORED_STONE_SLAB);
        blockItem(ModBlocks.RED_COLORED_STONE_STAIRS);
        blockItem(ModBlocks.RED_COLORED_STONE_BRICK_SLAB);
        blockItem(ModBlocks.RED_COLORED_STONE_BRICK_STAIRS);

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

        blockItem(ModBlocks.LIGHT_BLUE_COLORED_STONE_SLAB);
        blockItem(ModBlocks.LIGHT_BLUE_COLORED_STONE_STAIRS);
        blockItem(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_SLAB);
        blockItem(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_STAIRS);

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

        blockItem(ModBlocks.LIGHT_GRAY_COLORED_STONE_SLAB);
        blockItem(ModBlocks.LIGHT_GRAY_COLORED_STONE_STAIRS);
        blockItem(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_SLAB);
        blockItem(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_STAIRS);

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

        blockItem(ModBlocks.GRAY_COLORED_STONE_SLAB);
        blockItem(ModBlocks.GRAY_COLORED_STONE_STAIRS);
        blockItem(ModBlocks.GRAY_COLORED_STONE_BRICK_SLAB);
        blockItem(ModBlocks.GRAY_COLORED_STONE_BRICK_STAIRS);

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
        
        blockItem(ModBlocks.CYAN_COLORED_STONE_SLAB);
        blockItem(ModBlocks.CYAN_COLORED_STONE_STAIRS);
        blockItem(ModBlocks.CYAN_COLORED_STONE_BRICK_SLAB);
        blockItem(ModBlocks.CYAN_COLORED_STONE_BRICK_STAIRS);

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

        blockItem(ModBlocks.GREEN_COLORED_STONE_SLAB);
        blockItem(ModBlocks.GREEN_COLORED_STONE_STAIRS);
        blockItem(ModBlocks.GREEN_COLORED_STONE_BRICK_SLAB);
        blockItem(ModBlocks.GREEN_COLORED_STONE_BRICK_STAIRS);

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

        blockItem(ModBlocks.YELLOW_COLORED_STONE_SLAB);
        blockItem(ModBlocks.YELLOW_COLORED_STONE_STAIRS);
        blockItem(ModBlocks.YELLOW_COLORED_STONE_BRICK_SLAB);
        blockItem(ModBlocks.YELLOW_COLORED_STONE_BRICK_STAIRS);

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

        blockItem(ModBlocks.BROWN_COLORED_STONE_SLAB);
        blockItem(ModBlocks.BROWN_COLORED_STONE_STAIRS);
        blockItem(ModBlocks.BROWN_COLORED_STONE_BRICK_SLAB);
        blockItem(ModBlocks.BROWN_COLORED_STONE_BRICK_STAIRS);

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


        //BLACK
        blockWithItem(ModBlocks.BLACK_COLORED_COBBLESTONE);
        slabBlock((SlabBlock) ModBlocks.BLACK_COLORED_COBBLESTONE_SLAB.get(), blockTexture(ModBlocks.BLACK_COLORED_COBBLESTONE.get()),
                blockTexture(ModBlocks.BLACK_COLORED_COBBLESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.BLACK_COLORED_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.BLACK_COLORED_COBBLESTONE.get()));
        wallBlock((WallBlock) ModBlocks.BLACK_COLORED_COBBLESTONE_WALL.get(), blockTexture(ModBlocks.BLACK_COLORED_COBBLESTONE.get()));

        blockWithItem(ModBlocks.BLACK_COLORED_COBBLESTONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.BLACK_COLORED_COBBLESTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.BLACK_COLORED_COBBLESTONE_BRICKS.get()),
                 blockTexture(ModBlocks.BLACK_COLORED_COBBLESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.BLACK_COLORED_COBBLESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.BLACK_COLORED_COBBLESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.BLACK_COLORED_COBBLESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.BLACK_COLORED_COBBLESTONE_BRICKS.get()));

        blockItem(ModBlocks.BLACK_COLORED_COBBLESTONE_SLAB);
        blockItem(ModBlocks.BLACK_COLORED_COBBLESTONE_STAIRS);
        blockItem(ModBlocks.BLACK_COLORED_COBBLESTONE_BRICK_SLAB);
        blockItem(ModBlocks.BLACK_COLORED_COBBLESTONE_BRICK_STAIRS);

        //WHITE
        blockWithItem(ModBlocks.WHITE_COLORED_COBBLESTONE);
        slabBlock((SlabBlock) ModBlocks.WHITE_COLORED_COBBLESTONE_SLAB.get(), blockTexture(ModBlocks.WHITE_COLORED_COBBLESTONE.get()),
                blockTexture(ModBlocks.WHITE_COLORED_COBBLESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.WHITE_COLORED_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.WHITE_COLORED_COBBLESTONE.get()));
        wallBlock((WallBlock) ModBlocks.WHITE_COLORED_COBBLESTONE_WALL.get(), blockTexture(ModBlocks.WHITE_COLORED_COBBLESTONE.get()));

        blockWithItem(ModBlocks.WHITE_COLORED_COBBLESTONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.WHITE_COLORED_COBBLESTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.WHITE_COLORED_COBBLESTONE_BRICKS.get()),
                blockTexture(ModBlocks.WHITE_COLORED_COBBLESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.WHITE_COLORED_COBBLESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.WHITE_COLORED_COBBLESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.WHITE_COLORED_COBBLESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.WHITE_COLORED_COBBLESTONE_BRICKS.get()));

        blockItem(ModBlocks.WHITE_COLORED_COBBLESTONE_SLAB);
        blockItem(ModBlocks.WHITE_COLORED_COBBLESTONE_STAIRS);
        blockItem(ModBlocks.WHITE_COLORED_COBBLESTONE_BRICK_SLAB);
        blockItem(ModBlocks.WHITE_COLORED_COBBLESTONE_BRICK_STAIRS);

        //BLUE
        blockWithItem(ModBlocks.BLUE_COLORED_COBBLESTONE);
        slabBlock((SlabBlock) ModBlocks.BLUE_COLORED_COBBLESTONE_SLAB.get(), blockTexture(ModBlocks.BLUE_COLORED_COBBLESTONE.get()),
                blockTexture(ModBlocks.BLUE_COLORED_COBBLESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.BLUE_COLORED_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.BLUE_COLORED_COBBLESTONE.get()));
        wallBlock((WallBlock) ModBlocks.BLUE_COLORED_COBBLESTONE_WALL.get(), blockTexture(ModBlocks.BLUE_COLORED_COBBLESTONE.get()));

        blockWithItem(ModBlocks.BLUE_COLORED_COBBLESTONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.BLUE_COLORED_COBBLESTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.BLUE_COLORED_COBBLESTONE_BRICKS.get()),
                blockTexture(ModBlocks.BLUE_COLORED_COBBLESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.BLUE_COLORED_COBBLESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.BLUE_COLORED_COBBLESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.BLUE_COLORED_COBBLESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.BLUE_COLORED_COBBLESTONE_BRICKS.get()));

        blockItem(ModBlocks.BLUE_COLORED_COBBLESTONE_SLAB);
        blockItem(ModBlocks.BLUE_COLORED_COBBLESTONE_STAIRS);
        blockItem(ModBlocks.BLUE_COLORED_COBBLESTONE_BRICK_SLAB);
        blockItem(ModBlocks.BLUE_COLORED_COBBLESTONE_BRICK_STAIRS);

        
        //LIME
        blockWithItem(ModBlocks.LIME_COLORED_COBBLESTONE);
        slabBlock((SlabBlock) ModBlocks.LIME_COLORED_COBBLESTONE_SLAB.get(), blockTexture(ModBlocks.LIME_COLORED_COBBLESTONE.get()),
                blockTexture(ModBlocks.LIME_COLORED_COBBLESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.LIME_COLORED_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.LIME_COLORED_COBBLESTONE.get()));
        wallBlock((WallBlock) ModBlocks.LIME_COLORED_COBBLESTONE_WALL.get(), blockTexture(ModBlocks.LIME_COLORED_COBBLESTONE.get()));

        blockWithItem(ModBlocks.LIME_COLORED_COBBLESTONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.LIME_COLORED_COBBLESTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.LIME_COLORED_COBBLESTONE_BRICKS.get()),
                blockTexture(ModBlocks.LIME_COLORED_COBBLESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.LIME_COLORED_COBBLESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.LIME_COLORED_COBBLESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.LIME_COLORED_COBBLESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.LIME_COLORED_COBBLESTONE_BRICKS.get()));

        blockItem(ModBlocks.LIME_COLORED_COBBLESTONE_SLAB);
        blockItem(ModBlocks.LIME_COLORED_COBBLESTONE_STAIRS);
        blockItem(ModBlocks.LIME_COLORED_COBBLESTONE_BRICK_SLAB);
        blockItem(ModBlocks.LIME_COLORED_COBBLESTONE_BRICK_STAIRS);

        //ORANGE
        blockWithItem(ModBlocks.ORANGE_COLORED_COBBLESTONE);
        slabBlock((SlabBlock) ModBlocks.ORANGE_COLORED_COBBLESTONE_SLAB.get(), blockTexture(ModBlocks.ORANGE_COLORED_COBBLESTONE.get()),
                blockTexture(ModBlocks.ORANGE_COLORED_COBBLESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.ORANGE_COLORED_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.ORANGE_COLORED_COBBLESTONE.get()));
        wallBlock((WallBlock) ModBlocks.ORANGE_COLORED_COBBLESTONE_WALL.get(), blockTexture(ModBlocks.ORANGE_COLORED_COBBLESTONE.get()));

        blockWithItem(ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICKS.get()),
                blockTexture(ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICKS.get()));

        blockItem(ModBlocks.ORANGE_COLORED_COBBLESTONE_SLAB);
        blockItem(ModBlocks.ORANGE_COLORED_COBBLESTONE_STAIRS);
        blockItem(ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICK_SLAB);
        blockItem(ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICK_STAIRS);

        //PINK
        blockWithItem(ModBlocks.PINK_COLORED_COBBLESTONE);
        slabBlock((SlabBlock) ModBlocks.PINK_COLORED_COBBLESTONE_SLAB.get(), blockTexture(ModBlocks.PINK_COLORED_COBBLESTONE.get()),
                blockTexture(ModBlocks.PINK_COLORED_COBBLESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.PINK_COLORED_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.PINK_COLORED_COBBLESTONE.get()));
        wallBlock((WallBlock) ModBlocks.PINK_COLORED_COBBLESTONE_WALL.get(), blockTexture(ModBlocks.PINK_COLORED_COBBLESTONE.get()));

        blockWithItem(ModBlocks.PINK_COLORED_COBBLESTONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.PINK_COLORED_COBBLESTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.PINK_COLORED_COBBLESTONE_BRICKS.get()),
                blockTexture(ModBlocks.PINK_COLORED_COBBLESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.PINK_COLORED_COBBLESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.PINK_COLORED_COBBLESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.PINK_COLORED_COBBLESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.PINK_COLORED_COBBLESTONE_BRICKS.get()));

        blockItem(ModBlocks.PINK_COLORED_COBBLESTONE_SLAB);
        blockItem(ModBlocks.PINK_COLORED_COBBLESTONE_STAIRS);
        blockItem(ModBlocks.PINK_COLORED_COBBLESTONE_BRICK_SLAB);
        blockItem(ModBlocks.PINK_COLORED_COBBLESTONE_BRICK_STAIRS);

        //Purple
        blockWithItem(ModBlocks.PURPLE_COLORED_COBBLESTONE);
        slabBlock((SlabBlock) ModBlocks.PURPLE_COLORED_COBBLESTONE_SLAB.get(), blockTexture(ModBlocks.PURPLE_COLORED_COBBLESTONE.get()),
                blockTexture(ModBlocks.PURPLE_COLORED_COBBLESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.PURPLE_COLORED_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.PURPLE_COLORED_COBBLESTONE.get()));
        wallBlock((WallBlock) ModBlocks.PURPLE_COLORED_COBBLESTONE_WALL.get(), blockTexture(ModBlocks.PURPLE_COLORED_COBBLESTONE.get()));

        blockWithItem(ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICKS.get()),
                blockTexture(ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICKS.get()));

        blockItem(ModBlocks.PURPLE_COLORED_COBBLESTONE_SLAB);
        blockItem(ModBlocks.PURPLE_COLORED_COBBLESTONE_STAIRS);
        blockItem(ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICK_SLAB);
        blockItem(ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICK_STAIRS);

        //MAGENTA
        blockWithItem(ModBlocks.MAGENTA_COLORED_COBBLESTONE);
        slabBlock((SlabBlock) ModBlocks.MAGENTA_COLORED_COBBLESTONE_SLAB.get(), blockTexture(ModBlocks.MAGENTA_COLORED_COBBLESTONE.get()),
                blockTexture(ModBlocks.MAGENTA_COLORED_COBBLESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.MAGENTA_COLORED_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.MAGENTA_COLORED_COBBLESTONE.get()));
        wallBlock((WallBlock) ModBlocks.MAGENTA_COLORED_COBBLESTONE_WALL.get(), blockTexture(ModBlocks.MAGENTA_COLORED_COBBLESTONE.get()));

        blockWithItem(ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICKS.get()),
                blockTexture(ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICKS.get()));

        blockItem(ModBlocks.MAGENTA_COLORED_COBBLESTONE_SLAB);
        blockItem(ModBlocks.MAGENTA_COLORED_COBBLESTONE_STAIRS);
        blockItem(ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICK_SLAB);
        blockItem(ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICK_STAIRS);

        
        //RED
        blockWithItem(ModBlocks.RED_COLORED_COBBLESTONE);
        slabBlock((SlabBlock) ModBlocks.RED_COLORED_COBBLESTONE_SLAB.get(), blockTexture(ModBlocks.RED_COLORED_COBBLESTONE.get()),
                blockTexture(ModBlocks.RED_COLORED_COBBLESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.RED_COLORED_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.RED_COLORED_COBBLESTONE.get()));
        wallBlock((WallBlock) ModBlocks.RED_COLORED_COBBLESTONE_WALL.get(), blockTexture(ModBlocks.RED_COLORED_COBBLESTONE.get()));

        blockWithItem(ModBlocks.RED_COLORED_COBBLESTONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.RED_COLORED_COBBLESTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.RED_COLORED_COBBLESTONE_BRICKS.get()),
                blockTexture(ModBlocks.RED_COLORED_COBBLESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.RED_COLORED_COBBLESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.RED_COLORED_COBBLESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.RED_COLORED_COBBLESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.RED_COLORED_COBBLESTONE_BRICKS.get()));

        blockItem(ModBlocks.RED_COLORED_COBBLESTONE_SLAB);
        blockItem(ModBlocks.RED_COLORED_COBBLESTONE_STAIRS);
        blockItem(ModBlocks.RED_COLORED_COBBLESTONE_BRICK_SLAB);
        blockItem(ModBlocks.RED_COLORED_COBBLESTONE_BRICK_STAIRS);

        //LIGHT BLUE
        blockWithItem(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE);
        slabBlock((SlabBlock) ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_SLAB.get(), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE.get()),
                blockTexture(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE.get()));
        wallBlock((WallBlock) ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_WALL.get(), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE.get()));

        blockWithItem(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICKS.get()),
                blockTexture(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICKS.get()));

        blockItem(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_SLAB);
        blockItem(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_STAIRS);
        blockItem(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICK_SLAB);
        blockItem(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICK_STAIRS);

        //LIGHT GRAY
        blockWithItem(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE);
        slabBlock((SlabBlock) ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_SLAB.get(), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE.get()),
                blockTexture(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE.get()));
        wallBlock((WallBlock) ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_WALL.get(), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE.get()));

        blockWithItem(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICKS.get()),
                blockTexture(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICKS.get()));

        blockItem(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_SLAB);
        blockItem(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_STAIRS);
        blockItem(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICK_SLAB);
        blockItem(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICK_STAIRS);

        //GRAY
        blockWithItem(ModBlocks.GRAY_COLORED_COBBLESTONE);
        slabBlock((SlabBlock) ModBlocks.GRAY_COLORED_COBBLESTONE_SLAB.get(), blockTexture(ModBlocks.GRAY_COLORED_COBBLESTONE.get()),
                blockTexture(ModBlocks.GRAY_COLORED_COBBLESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.GRAY_COLORED_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.GRAY_COLORED_COBBLESTONE.get()));
        wallBlock((WallBlock) ModBlocks.GRAY_COLORED_COBBLESTONE_WALL.get(), blockTexture(ModBlocks.GRAY_COLORED_COBBLESTONE.get()));

        blockWithItem(ModBlocks.GRAY_COLORED_COBBLESTONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.GRAY_COLORED_COBBLESTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.GRAY_COLORED_COBBLESTONE_BRICKS.get()),
                blockTexture(ModBlocks.GRAY_COLORED_COBBLESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.GRAY_COLORED_COBBLESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.GRAY_COLORED_COBBLESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.GRAY_COLORED_COBBLESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.GRAY_COLORED_COBBLESTONE_BRICKS.get()));

        blockItem(ModBlocks.GRAY_COLORED_COBBLESTONE_SLAB);
        blockItem(ModBlocks.GRAY_COLORED_COBBLESTONE_STAIRS);
        blockItem(ModBlocks.GRAY_COLORED_COBBLESTONE_BRICK_SLAB);
        blockItem(ModBlocks.GRAY_COLORED_COBBLESTONE_BRICK_STAIRS);

        //CYAN
        blockWithItem(ModBlocks.CYAN_COLORED_COBBLESTONE);
        slabBlock((SlabBlock) ModBlocks.CYAN_COLORED_COBBLESTONE_SLAB.get(), blockTexture(ModBlocks.CYAN_COLORED_COBBLESTONE.get()),
                blockTexture(ModBlocks.CYAN_COLORED_COBBLESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.CYAN_COLORED_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.CYAN_COLORED_COBBLESTONE.get()));
        wallBlock((WallBlock) ModBlocks.CYAN_COLORED_COBBLESTONE_WALL.get(), blockTexture(ModBlocks.CYAN_COLORED_COBBLESTONE.get()));

        blockWithItem(ModBlocks.CYAN_COLORED_COBBLESTONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.CYAN_COLORED_COBBLESTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.CYAN_COLORED_COBBLESTONE_BRICKS.get()),
                blockTexture(ModBlocks.CYAN_COLORED_COBBLESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.CYAN_COLORED_COBBLESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.CYAN_COLORED_COBBLESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.CYAN_COLORED_COBBLESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.CYAN_COLORED_COBBLESTONE_BRICKS.get()));

        blockItem(ModBlocks.CYAN_COLORED_COBBLESTONE_SLAB);
        blockItem(ModBlocks.CYAN_COLORED_COBBLESTONE_STAIRS);
        blockItem(ModBlocks.CYAN_COLORED_COBBLESTONE_BRICK_SLAB);
        blockItem(ModBlocks.CYAN_COLORED_COBBLESTONE_BRICK_STAIRS);

        //GREEN
        blockWithItem(ModBlocks.GREEN_COLORED_COBBLESTONE);
        slabBlock((SlabBlock) ModBlocks.GREEN_COLORED_COBBLESTONE_SLAB.get(), blockTexture(ModBlocks.GREEN_COLORED_COBBLESTONE.get()),
                blockTexture(ModBlocks.GREEN_COLORED_COBBLESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.GREEN_COLORED_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.GREEN_COLORED_COBBLESTONE.get()));
        wallBlock((WallBlock) ModBlocks.GREEN_COLORED_COBBLESTONE_WALL.get(), blockTexture(ModBlocks.GREEN_COLORED_COBBLESTONE.get()));

        blockWithItem(ModBlocks.GREEN_COLORED_COBBLESTONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.GREEN_COLORED_COBBLESTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.GREEN_COLORED_COBBLESTONE_BRICKS.get()),
                blockTexture(ModBlocks.GREEN_COLORED_COBBLESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.GREEN_COLORED_COBBLESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.GREEN_COLORED_COBBLESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.GREEN_COLORED_COBBLESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.GREEN_COLORED_COBBLESTONE_BRICKS.get()));

        blockItem(ModBlocks.GREEN_COLORED_COBBLESTONE_SLAB);
        blockItem(ModBlocks.GREEN_COLORED_COBBLESTONE_STAIRS);
        blockItem(ModBlocks.GREEN_COLORED_COBBLESTONE_BRICK_SLAB);
        blockItem(ModBlocks.GREEN_COLORED_COBBLESTONE_BRICK_STAIRS);

        //YELLOW
        blockWithItem(ModBlocks.YELLOW_COLORED_COBBLESTONE);
        slabBlock((SlabBlock) ModBlocks.YELLOW_COLORED_COBBLESTONE_SLAB.get(), blockTexture(ModBlocks.YELLOW_COLORED_COBBLESTONE.get()),
                blockTexture(ModBlocks.YELLOW_COLORED_COBBLESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.YELLOW_COLORED_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.YELLOW_COLORED_COBBLESTONE_WALL.get(), blockTexture(ModBlocks.YELLOW_COLORED_COBBLESTONE.get()));

        blockWithItem(ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICKS.get()),
                blockTexture(ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICKS.get()));

        blockItem(ModBlocks.YELLOW_COLORED_COBBLESTONE_SLAB);
        blockItem(ModBlocks.YELLOW_COLORED_COBBLESTONE_STAIRS);
        blockItem(ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICK_SLAB);
        blockItem(ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICK_STAIRS);

        //BROWN
        blockWithItem(ModBlocks.BROWN_COLORED_COBBLESTONE);
        slabBlock((SlabBlock) ModBlocks.BROWN_COLORED_COBBLESTONE_SLAB.get(), blockTexture(ModBlocks.BROWN_COLORED_COBBLESTONE.get()),
                blockTexture(ModBlocks.BROWN_COLORED_COBBLESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.BROWN_COLORED_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.BROWN_COLORED_COBBLESTONE.get()));
        wallBlock((WallBlock) ModBlocks.BROWN_COLORED_COBBLESTONE_WALL.get(), blockTexture(ModBlocks.BROWN_COLORED_COBBLESTONE.get()));

        blockWithItem(ModBlocks.BROWN_COLORED_COBBLESTONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.BROWN_COLORED_COBBLESTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.BROWN_COLORED_COBBLESTONE_BRICKS.get()),
                blockTexture(ModBlocks.BROWN_COLORED_COBBLESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.BROWN_COLORED_COBBLESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.BROWN_COLORED_COBBLESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.BROWN_COLORED_COBBLESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.BROWN_COLORED_COBBLESTONE_BRICKS.get()));

        blockItem(ModBlocks.BROWN_COLORED_COBBLESTONE_SLAB);
        blockItem(ModBlocks.BROWN_COLORED_COBBLESTONE_STAIRS);
        blockItem(ModBlocks.BROWN_COLORED_COBBLESTONE_BRICK_SLAB);
        blockItem(ModBlocks.BROWN_COLORED_COBBLESTONE_BRICK_STAIRS);

        //BRIGHT STONE
        blockWithItem(ModBlocks.BROWN_COLORED_BRIGHT_COBBLESTONE);
        blockWithItem(ModBlocks.MAGENTA_COLORED_BRIGHT_COBBLESTONE);
        blockWithItem(ModBlocks.PURPLE_COLORED_BRIGHT_COBBLESTONE);
        blockWithItem(ModBlocks.WHITE_COLORED_BRIGHT_COBBLESTONE);
        blockWithItem(ModBlocks.YELLOW_COLORED_BRIGHT_COBBLESTONE);
        blockWithItem(ModBlocks.LIGHT_GRAY_COLORED_BRIGHT_COBBLESTONE);
        blockWithItem(ModBlocks.BLUE_COLORED_BRIGHT_COBBLESTONE);
        blockWithItem(ModBlocks.LIGHT_BLUE_COLORED_BRIGHT_COBBLESTONE);
        blockWithItem(ModBlocks.GRAY_COLORED_BRIGHT_COBBLESTONE);
        blockWithItem(ModBlocks.PINK_COLORED_BRIGHT_COBBLESTONE);
        blockWithItem(ModBlocks.RED_COLORED_BRIGHT_COBBLESTONE);
        blockWithItem(ModBlocks.BLACK_COLORED_BRIGHT_COBBLESTONE);
        blockWithItem(ModBlocks.ORANGE_COLORED_BRIGHT_COBBLESTONE);
        blockWithItem(ModBlocks.GREEN_COLORED_BRIGHT_COBBLESTONE);
        blockWithItem(ModBlocks.LIME_COLORED_BRIGHT_COBBLESTONE);
        blockWithItem(ModBlocks.CYAN_COLORED_BRIGHT_COBBLESTONE);
        blockWithItem(ModBlocks.BRIGHT_COBBLESTONE);
        blockWithItem(ModBlocks.BRIGHT_STONE);

        blockWithItem(ModBlocks.COBBLESTONE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.COBBLESTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.COBBLESTONE_BRICKS.get()),
                blockTexture(ModBlocks.COBBLESTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.COBBLESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.COBBLESTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.COBBLESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.COBBLESTONE_BRICKS.get()));

        blockItem(ModBlocks.COBBLESTONE_BRICK_SLAB);
        blockItem(ModBlocks.COBBLESTONE_BRICK_STAIRS);


        //PLANKS

        blockWithItem(ModBlocks.BROWN_COLORED_WOODEN_PLANKS);
        blockWithItem(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS);
        blockWithItem(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS);
        blockWithItem(ModBlocks.WHITE_COLORED_WOODEN_PLANKS);
        blockWithItem(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS);
        blockWithItem(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS);
        blockWithItem(ModBlocks.BLUE_COLORED_WOODEN_PLANKS);
        blockWithItem(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS);
        blockWithItem(ModBlocks.GRAY_COLORED_WOODEN_PLANKS);
        blockWithItem(ModBlocks.PINK_COLORED_WOODEN_PLANKS);
        blockWithItem(ModBlocks.RED_COLORED_WOODEN_PLANKS);
        blockWithItem(ModBlocks.BLACK_COLORED_WOODEN_PLANKS);
        blockWithItem(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS);
        blockWithItem(ModBlocks.GREEN_COLORED_WOODEN_PLANKS);
        blockWithItem(ModBlocks.LIME_COLORED_WOODEN_PLANKS);
        blockWithItem(ModBlocks.CYAN_COLORED_WOODEN_PLANKS);

        stairsBlock((StairBlock) ModBlocks.BROWN_COLORED_WOODEN_PLANK_STAIRS.get(), blockTexture(ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get()));
        stairsBlock((StairBlock) ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_STAIRS.get(), blockTexture(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get()));
        stairsBlock((StairBlock) ModBlocks.PURPLE_COLORED_WOODEN_PLANK_STAIRS.get(), blockTexture(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get()));
        stairsBlock((StairBlock) ModBlocks.WHITE_COLORED_WOODEN_PLANK_STAIRS.get(), blockTexture(ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get()));
        stairsBlock((StairBlock) ModBlocks.YELLOW_COLORED_WOODEN_PLANK_STAIRS.get(), blockTexture(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_STAIRS.get(), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_STAIRS.get(), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get()));
        stairsBlock((StairBlock) ModBlocks.BLUE_COLORED_WOODEN_PLANK_STAIRS.get(), blockTexture(ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get()));
        stairsBlock((StairBlock) ModBlocks.GRAY_COLORED_WOODEN_PLANK_STAIRS.get(), blockTexture(ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get()));
        stairsBlock((StairBlock) ModBlocks.PINK_COLORED_WOODEN_PLANK_STAIRS.get(), blockTexture(ModBlocks.PINK_COLORED_WOODEN_PLANKS.get()));
        stairsBlock((StairBlock) ModBlocks.RED_COLORED_WOODEN_PLANK_STAIRS.get(), blockTexture(ModBlocks.RED_COLORED_WOODEN_PLANKS.get()));
        stairsBlock((StairBlock) ModBlocks.BLACK_COLORED_WOODEN_PLANK_STAIRS.get(), blockTexture(ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get()));
        stairsBlock((StairBlock) ModBlocks.ORANGE_COLORED_WOODEN_PLANK_STAIRS.get(), blockTexture(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get()));
        stairsBlock((StairBlock) ModBlocks.GREEN_COLORED_WOODEN_PLANK_STAIRS.get(), blockTexture(ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get()));
        stairsBlock((StairBlock) ModBlocks.LIME_COLORED_WOODEN_PLANK_STAIRS.get(), blockTexture(ModBlocks.LIME_COLORED_WOODEN_PLANKS.get()));
        stairsBlock((StairBlock) ModBlocks.CYAN_COLORED_WOODEN_PLANK_STAIRS.get(), blockTexture(ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get()));

        blockItem(ModBlocks.BROWN_COLORED_WOODEN_PLANK_STAIRS);
        blockItem(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_STAIRS);
        blockItem(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_STAIRS);
        blockItem(ModBlocks.WHITE_COLORED_WOODEN_PLANK_STAIRS);
        blockItem(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_STAIRS);
        blockItem(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_STAIRS);
        blockItem(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_STAIRS);
        blockItem(ModBlocks.BLUE_COLORED_WOODEN_PLANK_STAIRS);
        blockItem(ModBlocks.GRAY_COLORED_WOODEN_PLANK_STAIRS);
        blockItem(ModBlocks.PINK_COLORED_WOODEN_PLANK_STAIRS);
        blockItem(ModBlocks.RED_COLORED_WOODEN_PLANK_STAIRS);
        blockItem(ModBlocks.BLACK_COLORED_WOODEN_PLANK_STAIRS);
        blockItem(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_STAIRS);
        blockItem(ModBlocks.GREEN_COLORED_WOODEN_PLANK_STAIRS);
        blockItem(ModBlocks.LIME_COLORED_WOODEN_PLANK_STAIRS);
        blockItem(ModBlocks.CYAN_COLORED_WOODEN_PLANK_STAIRS);

        slabBlock((SlabBlock) ModBlocks.BROWN_COLORED_WOODEN_PLANK_SLAB.get(), blockTexture(ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get()),
                blockTexture(ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_SLAB.get(), blockTexture(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get()),
                blockTexture(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.PURPLE_COLORED_WOODEN_PLANK_SLAB.get(), blockTexture(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get()),
                blockTexture(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.WHITE_COLORED_WOODEN_PLANK_SLAB.get(), blockTexture(ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get()),
                blockTexture(ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_SLAB.get(), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get()),
                blockTexture(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_SLAB.get(), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get()),
                blockTexture(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.BLUE_COLORED_WOODEN_PLANK_SLAB.get(), blockTexture(ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get()),
                blockTexture(ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.GRAY_COLORED_WOODEN_PLANK_SLAB.get(), blockTexture(ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get()),
                blockTexture(ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.PINK_COLORED_WOODEN_PLANK_SLAB.get(), blockTexture(ModBlocks.PINK_COLORED_WOODEN_PLANKS.get()),
                blockTexture(ModBlocks.PINK_COLORED_WOODEN_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.RED_COLORED_WOODEN_PLANK_SLAB.get(), blockTexture(ModBlocks.RED_COLORED_WOODEN_PLANKS.get()),
                blockTexture(ModBlocks.RED_COLORED_WOODEN_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.BLACK_COLORED_WOODEN_PLANK_SLAB.get(), blockTexture(ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get()),
                blockTexture(ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.ORANGE_COLORED_WOODEN_PLANK_SLAB.get(), blockTexture(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get()),
                blockTexture(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.GREEN_COLORED_WOODEN_PLANK_SLAB.get(), blockTexture(ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get()),
                blockTexture(ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.LIME_COLORED_WOODEN_PLANK_SLAB.get(), blockTexture(ModBlocks.LIME_COLORED_WOODEN_PLANKS.get()),
                blockTexture(ModBlocks.LIME_COLORED_WOODEN_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.CYAN_COLORED_WOODEN_PLANK_SLAB.get(), blockTexture(ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get()),
                blockTexture(ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.YELLOW_COLORED_WOODEN_PLANK_SLAB.get(), blockTexture(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get()),
                blockTexture(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get()));

        blockItem(ModBlocks.BROWN_COLORED_WOODEN_PLANK_SLAB);
        blockItem(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_SLAB);
        blockItem(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_SLAB);
        blockItem(ModBlocks.WHITE_COLORED_WOODEN_PLANK_SLAB);
        blockItem(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_SLAB);
        blockItem(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_SLAB);
        blockItem(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_SLAB);
        blockItem(ModBlocks.BLUE_COLORED_WOODEN_PLANK_SLAB);
        blockItem(ModBlocks.GRAY_COLORED_WOODEN_PLANK_SLAB);
        blockItem(ModBlocks.PINK_COLORED_WOODEN_PLANK_SLAB);
        blockItem(ModBlocks.RED_COLORED_WOODEN_PLANK_SLAB);
        blockItem(ModBlocks.BLACK_COLORED_WOODEN_PLANK_SLAB);
        blockItem(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_SLAB);
        blockItem(ModBlocks.GREEN_COLORED_WOODEN_PLANK_SLAB);
        blockItem(ModBlocks.LIME_COLORED_WOODEN_PLANK_SLAB);
        blockItem(ModBlocks.CYAN_COLORED_WOODEN_PLANK_SLAB);

        buttonBlock((ButtonBlock) ModBlocks.BROWN_COLORED_WOODEN_PLANK_BUTTON.get(), blockTexture(ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_BUTTON.get(), blockTexture(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.PURPLE_COLORED_WOODEN_PLANK_BUTTON.get(), blockTexture(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.WHITE_COLORED_WOODEN_PLANK_BUTTON.get(), blockTexture(ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.YELLOW_COLORED_WOODEN_PLANK_BUTTON.get(), blockTexture(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_BUTTON.get(), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_BUTTON.get(), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.BLUE_COLORED_WOODEN_PLANK_BUTTON.get(), blockTexture(ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.GRAY_COLORED_WOODEN_PLANK_BUTTON.get(), blockTexture(ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.PINK_COLORED_WOODEN_PLANK_BUTTON.get(), blockTexture(ModBlocks.PINK_COLORED_WOODEN_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.RED_COLORED_WOODEN_PLANK_BUTTON.get(), blockTexture(ModBlocks.RED_COLORED_WOODEN_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.BLACK_COLORED_WOODEN_PLANK_BUTTON.get(), blockTexture(ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.ORANGE_COLORED_WOODEN_PLANK_BUTTON.get(), blockTexture(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.GREEN_COLORED_WOODEN_PLANK_BUTTON.get(), blockTexture(ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.LIME_COLORED_WOODEN_PLANK_BUTTON.get(), blockTexture(ModBlocks.LIME_COLORED_WOODEN_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.CYAN_COLORED_WOODEN_PLANK_BUTTON.get(), blockTexture(ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get()));
        
        buttonBlock((ButtonBlock) ModBlocks.BROWN_COLORED_STONE_BUTTON.get(), blockTexture(ModBlocks.BROWN_COLORED_STONE.get()));
        buttonBlock((ButtonBlock) ModBlocks.MAGENTA_COLORED_STONE_BUTTON.get(), blockTexture(ModBlocks.MAGENTA_COLORED_STONE.get()));
        buttonBlock((ButtonBlock) ModBlocks.PURPLE_COLORED_STONE_BUTTON.get(), blockTexture(ModBlocks.PURPLE_COLORED_STONE.get()));
        buttonBlock((ButtonBlock) ModBlocks.WHITE_COLORED_STONE_BUTTON.get(), blockTexture(ModBlocks.WHITE_COLORED_STONE.get()));
        buttonBlock((ButtonBlock) ModBlocks.YELLOW_COLORED_STONE_BUTTON.get(), blockTexture(ModBlocks.YELLOW_COLORED_STONE.get()));
        buttonBlock((ButtonBlock) ModBlocks.LIGHT_GRAY_COLORED_STONE_BUTTON.get(), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_STONE.get()));
        buttonBlock((ButtonBlock) ModBlocks.LIGHT_BLUE_COLORED_STONE_BUTTON.get(), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_STONE.get()));
        buttonBlock((ButtonBlock) ModBlocks.BLUE_COLORED_STONE_BUTTON.get(), blockTexture(ModBlocks.BLUE_COLORED_STONE.get()));
        buttonBlock((ButtonBlock) ModBlocks.GRAY_COLORED_STONE_BUTTON.get(), blockTexture(ModBlocks.GRAY_COLORED_STONE.get()));
        buttonBlock((ButtonBlock) ModBlocks.PINK_COLORED_STONE_BUTTON.get(), blockTexture(ModBlocks.PINK_COLORED_STONE.get()));
        buttonBlock((ButtonBlock) ModBlocks.RED_COLORED_STONE_BUTTON.get(), blockTexture(ModBlocks.RED_COLORED_STONE.get()));
        buttonBlock((ButtonBlock) ModBlocks.BLACK_COLORED_STONE_BUTTON.get(), blockTexture(ModBlocks.BLACK_COLORED_STONE.get()));
        buttonBlock((ButtonBlock) ModBlocks.ORANGE_COLORED_STONE_BUTTON.get(), blockTexture(ModBlocks.ORANGE_COLORED_STONE.get()));
        buttonBlock((ButtonBlock) ModBlocks.GREEN_COLORED_STONE_BUTTON.get(), blockTexture(ModBlocks.GREEN_COLORED_STONE.get()));
        buttonBlock((ButtonBlock) ModBlocks.LIME_COLORED_STONE_BUTTON.get(), blockTexture(ModBlocks.LIME_COLORED_STONE.get()));
        buttonBlock((ButtonBlock) ModBlocks.CYAN_COLORED_STONE_BUTTON.get(), blockTexture(ModBlocks.CYAN_COLORED_STONE.get()));

        pressurePlateBlock((PressurePlateBlock) ModBlocks.BROWN_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), blockTexture(ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), blockTexture(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.PURPLE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), blockTexture(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.WHITE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), blockTexture(ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.YELLOW_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), blockTexture(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.BLUE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), blockTexture(ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.GRAY_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), blockTexture(ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.PINK_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), blockTexture(ModBlocks.PINK_COLORED_WOODEN_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.RED_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), blockTexture(ModBlocks.RED_COLORED_WOODEN_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.BLACK_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), blockTexture(ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.ORANGE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), blockTexture(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.GREEN_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), blockTexture(ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.LIME_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), blockTexture(ModBlocks.LIME_COLORED_WOODEN_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.CYAN_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), blockTexture(ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get()));

        blockItem(ModBlocks.BROWN_COLORED_WOODEN_PLANK_PRESSURE_PLATE);
        blockItem(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_PRESSURE_PLATE);
        blockItem(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_PRESSURE_PLATE);
        blockItem(ModBlocks.WHITE_COLORED_WOODEN_PLANK_PRESSURE_PLATE);
        blockItem(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_PRESSURE_PLATE);
        blockItem(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_PRESSURE_PLATE);
        blockItem(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_PRESSURE_PLATE);
        blockItem(ModBlocks.BLUE_COLORED_WOODEN_PLANK_PRESSURE_PLATE);
        blockItem(ModBlocks.GRAY_COLORED_WOODEN_PLANK_PRESSURE_PLATE);
        blockItem(ModBlocks.PINK_COLORED_WOODEN_PLANK_PRESSURE_PLATE);
        blockItem(ModBlocks.RED_COLORED_WOODEN_PLANK_PRESSURE_PLATE);
        blockItem(ModBlocks.BLACK_COLORED_WOODEN_PLANK_PRESSURE_PLATE);
        blockItem(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_PRESSURE_PLATE);
        blockItem(ModBlocks.GREEN_COLORED_WOODEN_PLANK_PRESSURE_PLATE);
        blockItem(ModBlocks.LIME_COLORED_WOODEN_PLANK_PRESSURE_PLATE);
        blockItem(ModBlocks.CYAN_COLORED_WOODEN_PLANK_PRESSURE_PLATE);
        
        pressurePlateBlock((PressurePlateBlock) ModBlocks.BROWN_COLORED_STONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.BROWN_COLORED_STONE.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.MAGENTA_COLORED_STONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.MAGENTA_COLORED_STONE.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.PURPLE_COLORED_STONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.PURPLE_COLORED_STONE.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.WHITE_COLORED_STONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.WHITE_COLORED_STONE.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.YELLOW_COLORED_STONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.YELLOW_COLORED_STONE.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.LIGHT_GRAY_COLORED_STONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_STONE.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.LIGHT_BLUE_COLORED_STONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_STONE.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.BLUE_COLORED_STONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.BLUE_COLORED_STONE.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.GRAY_COLORED_STONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.GRAY_COLORED_STONE.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.PINK_COLORED_STONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.PINK_COLORED_STONE.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.RED_COLORED_STONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.RED_COLORED_STONE.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.BLACK_COLORED_STONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.BLACK_COLORED_STONE.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.ORANGE_COLORED_STONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.ORANGE_COLORED_STONE.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.GREEN_COLORED_STONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.GREEN_COLORED_STONE.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.LIME_COLORED_STONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.LIME_COLORED_STONE.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.CYAN_COLORED_STONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.CYAN_COLORED_STONE.get()));

        blockItem(ModBlocks.BROWN_COLORED_STONE_PRESSURE_PLATE);
        blockItem(ModBlocks.MAGENTA_COLORED_STONE_PRESSURE_PLATE);
        blockItem(ModBlocks.PURPLE_COLORED_STONE_PRESSURE_PLATE);
        blockItem(ModBlocks.WHITE_COLORED_STONE_PRESSURE_PLATE);
        blockItem(ModBlocks.YELLOW_COLORED_STONE_PRESSURE_PLATE);
        blockItem(ModBlocks.LIGHT_GRAY_COLORED_STONE_PRESSURE_PLATE);
        blockItem(ModBlocks.LIGHT_BLUE_COLORED_STONE_PRESSURE_PLATE);
        blockItem(ModBlocks.BLUE_COLORED_STONE_PRESSURE_PLATE);
        blockItem(ModBlocks.GRAY_COLORED_STONE_PRESSURE_PLATE);
        blockItem(ModBlocks.PINK_COLORED_STONE_PRESSURE_PLATE);
        blockItem(ModBlocks.RED_COLORED_STONE_PRESSURE_PLATE);
        blockItem(ModBlocks.BLACK_COLORED_STONE_PRESSURE_PLATE);
        blockItem(ModBlocks.ORANGE_COLORED_STONE_PRESSURE_PLATE);
        blockItem(ModBlocks.GREEN_COLORED_STONE_PRESSURE_PLATE);
        blockItem(ModBlocks.LIME_COLORED_STONE_PRESSURE_PLATE);
        blockItem(ModBlocks.CYAN_COLORED_STONE_PRESSURE_PLATE);
        
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("caveopolis:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}