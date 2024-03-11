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
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Arrays;
import java.util.List;

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

        blockWithItem(ModBlocks.BROWN_DIRT);
        blockWithItem(ModBlocks.MAGENTA_DIRT);
        blockWithItem(ModBlocks.PURPLE_DIRT);
        blockWithItem(ModBlocks.WHITE_DIRT);
        blockWithItem(ModBlocks.YELLOW_DIRT);
        blockWithItem(ModBlocks.LIGHT_GRAY_DIRT);
        blockWithItem(ModBlocks.BLUE_DIRT);
        blockWithItem(ModBlocks.LIGHT_BLUE_DIRT);
        blockWithItem(ModBlocks.GRAY_DIRT);
        blockWithItem(ModBlocks.PINK_DIRT);
        blockWithItem(ModBlocks.RED_DIRT);
        blockWithItem(ModBlocks.BLACK_DIRT);
        blockWithItem(ModBlocks.ORANGE_DIRT);
        blockWithItem(ModBlocks.GREEN_DIRT);
        blockWithItem(ModBlocks.LIME_DIRT);
        blockWithItem(ModBlocks.CYAN_DIRT);

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
        stairsBlock((StairBlock) ModBlocks.YELLOW_COLORED_STONE_STAIRS.get(), blockTexture(ModBlocks.YELLOW_COLORED_STONE.get()));
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

        fenceBlock((FenceBlock) ModBlocks.BROWN_COLORED_WOODEN_PLANK_FENCE.get(), blockTexture(ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_FENCE.get(), blockTexture(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.PURPLE_COLORED_WOODEN_PLANK_FENCE.get(), blockTexture(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.WHITE_COLORED_WOODEN_PLANK_FENCE.get(), blockTexture(ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.YELLOW_COLORED_WOODEN_PLANK_FENCE.get(), blockTexture(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_FENCE.get(), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_FENCE.get(), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.BLUE_COLORED_WOODEN_PLANK_FENCE.get(), blockTexture(ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.GRAY_COLORED_WOODEN_PLANK_FENCE.get(), blockTexture(ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.PINK_COLORED_WOODEN_PLANK_FENCE.get(), blockTexture(ModBlocks.PINK_COLORED_WOODEN_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.RED_COLORED_WOODEN_PLANK_FENCE.get(), blockTexture(ModBlocks.RED_COLORED_WOODEN_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.BLACK_COLORED_WOODEN_PLANK_FENCE.get(), blockTexture(ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.ORANGE_COLORED_WOODEN_PLANK_FENCE.get(), blockTexture(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.GREEN_COLORED_WOODEN_PLANK_FENCE.get(), blockTexture(ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.LIME_COLORED_WOODEN_PLANK_FENCE.get(), blockTexture(ModBlocks.LIME_COLORED_WOODEN_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.CYAN_COLORED_WOODEN_PLANK_FENCE.get(), blockTexture(ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get()));

        fenceGateBlock((FenceGateBlock) ModBlocks.BROWN_COLORED_WOODEN_PLANK_FENCE_GATE.get(), blockTexture(ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_FENCE_GATE.get(), blockTexture(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.PURPLE_COLORED_WOODEN_PLANK_FENCE_GATE.get(), blockTexture(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.WHITE_COLORED_WOODEN_PLANK_FENCE_GATE.get(), blockTexture(ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.YELLOW_COLORED_WOODEN_PLANK_FENCE_GATE.get(), blockTexture(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_FENCE_GATE.get(), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_FENCE_GATE.get(), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.BLUE_COLORED_WOODEN_PLANK_FENCE_GATE.get(), blockTexture(ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.GRAY_COLORED_WOODEN_PLANK_FENCE_GATE.get(), blockTexture(ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.PINK_COLORED_WOODEN_PLANK_FENCE_GATE.get(), blockTexture(ModBlocks.PINK_COLORED_WOODEN_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.RED_COLORED_WOODEN_PLANK_FENCE_GATE.get(), blockTexture(ModBlocks.RED_COLORED_WOODEN_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.BLACK_COLORED_WOODEN_PLANK_FENCE_GATE.get(), blockTexture(ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.ORANGE_COLORED_WOODEN_PLANK_FENCE_GATE.get(), blockTexture(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.GREEN_COLORED_WOODEN_PLANK_FENCE_GATE.get(), blockTexture(ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.LIME_COLORED_WOODEN_PLANK_FENCE_GATE.get(), blockTexture(ModBlocks.LIME_COLORED_WOODEN_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.CYAN_COLORED_WOODEN_PLANK_FENCE_GATE.get(), blockTexture(ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get()));

        blockItem(ModBlocks.BROWN_COLORED_WOODEN_PLANK_FENCE_GATE);
        blockItem(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_FENCE_GATE);
        blockItem(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_FENCE_GATE);
        blockItem(ModBlocks.WHITE_COLORED_WOODEN_PLANK_FENCE_GATE);
        blockItem(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_FENCE_GATE);
        blockItem(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_FENCE_GATE);
        blockItem(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_FENCE_GATE);
        blockItem(ModBlocks.BLUE_COLORED_WOODEN_PLANK_FENCE_GATE);
        blockItem(ModBlocks.GRAY_COLORED_WOODEN_PLANK_FENCE_GATE);
        blockItem(ModBlocks.PINK_COLORED_WOODEN_PLANK_FENCE_GATE);
        blockItem(ModBlocks.RED_COLORED_WOODEN_PLANK_FENCE_GATE);
        blockItem(ModBlocks.BLACK_COLORED_WOODEN_PLANK_FENCE_GATE);
        blockItem(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_FENCE_GATE);
        blockItem(ModBlocks.GREEN_COLORED_WOODEN_PLANK_FENCE_GATE);
        blockItem(ModBlocks.LIME_COLORED_WOODEN_PLANK_FENCE_GATE);
        blockItem(ModBlocks.CYAN_COLORED_WOODEN_PLANK_FENCE_GATE);

        doorBlockWithRenderType((DoorBlock) ModBlocks.BROWN_COLORED_WOODEN_PLANK_DOOR.get(), modLoc("block/brown_colored_wooden_plank_door_bottom"),
                modLoc("block/brown_colored_wooden_plank_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock) ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_DOOR.get(), modLoc("block/magenta_colored_wooden_plank_door_bottom"),
                modLoc("block/magenta_colored_wooden_plank_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock) ModBlocks.PURPLE_COLORED_WOODEN_PLANK_DOOR.get(), modLoc("block/purple_colored_wooden_plank_door_bottom"),
                modLoc("block/purple_colored_wooden_plank_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock) ModBlocks.WHITE_COLORED_WOODEN_PLANK_DOOR.get(), modLoc("block/white_colored_wooden_plank_door_bottom"),
                modLoc("block/white_colored_wooden_plank_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock) ModBlocks.YELLOW_COLORED_WOODEN_PLANK_DOOR.get(), modLoc("block/yellow_colored_wooden_plank_door_bottom"),
                modLoc("block/yellow_colored_wooden_plank_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock) ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_DOOR.get(), modLoc("block/light_gray_colored_wooden_plank_door_bottom"),
                modLoc("block/light_gray_colored_wooden_plank_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock) ModBlocks.GRAY_COLORED_WOODEN_PLANK_DOOR.get(), modLoc("block/gray_colored_wooden_plank_door_bottom"),
                modLoc("block/gray_colored_wooden_plank_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock) ModBlocks.BLUE_COLORED_WOODEN_PLANK_DOOR.get(), modLoc("block/blue_colored_wooden_plank_door_bottom"),
                modLoc("block/blue_colored_wooden_plank_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock) ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_DOOR.get(), modLoc("block/light_blue_colored_wooden_plank_door_bottom"),
                modLoc("block/light_blue_colored_wooden_plank_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock) ModBlocks.PINK_COLORED_WOODEN_PLANK_DOOR.get(), modLoc("block/pink_colored_wooden_plank_door_bottom"),
                modLoc("block/pink_colored_wooden_plank_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock) ModBlocks.RED_COLORED_WOODEN_PLANK_DOOR.get(), modLoc("block/red_colored_wooden_plank_door_bottom"),
                modLoc("block/red_colored_wooden_plank_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock) ModBlocks.BLACK_COLORED_WOODEN_PLANK_DOOR.get(), modLoc("block/black_colored_wooden_plank_door_bottom"),
                modLoc("block/black_colored_wooden_plank_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock) ModBlocks.ORANGE_COLORED_WOODEN_PLANK_DOOR.get(), modLoc("block/orange_colored_wooden_plank_door_bottom"),
                modLoc("block/orange_colored_wooden_plank_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock) ModBlocks.GREEN_COLORED_WOODEN_PLANK_DOOR.get(), modLoc("block/green_colored_wooden_plank_door_bottom"),
                modLoc("block/green_colored_wooden_plank_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock) ModBlocks.LIME_COLORED_WOODEN_PLANK_DOOR.get(), modLoc("block/lime_colored_wooden_plank_door_bottom"),
                modLoc("block/lime_colored_wooden_plank_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock) ModBlocks.CYAN_COLORED_WOODEN_PLANK_DOOR.get(), modLoc("block/cyan_colored_wooden_plank_door_bottom"),
                modLoc("block/cyan_colored_wooden_plank_door_top"), "cutout");


        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.BROWN_COLORED_WOODEN_PLANK_TRAPDOOR.get(), modLoc("block/brown_colored_wooden_plank_trapdoor"),
                true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_TRAPDOOR.get(), modLoc("block/magenta_colored_wooden_plank_trapdoor"),
                true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.PURPLE_COLORED_WOODEN_PLANK_TRAPDOOR.get(), modLoc("block/purple_colored_wooden_plank_trapdoor"),
                true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.WHITE_COLORED_WOODEN_PLANK_TRAPDOOR.get(), modLoc("block/white_colored_wooden_plank_trapdoor"),
                true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.YELLOW_COLORED_WOODEN_PLANK_TRAPDOOR.get(), modLoc("block/yellow_colored_wooden_plank_trapdoor"),
                true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_TRAPDOOR.get(), modLoc("block/light_gray_colored_wooden_plank_trapdoor"),
                true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.GRAY_COLORED_WOODEN_PLANK_TRAPDOOR.get(), modLoc("block/gray_colored_wooden_plank_trapdoor"),
                true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.BLUE_COLORED_WOODEN_PLANK_TRAPDOOR.get(), modLoc("block/blue_colored_wooden_plank_trapdoor"),
                true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_TRAPDOOR.get(), modLoc("block/light_blue_colored_wooden_plank_trapdoor"),
                true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.PINK_COLORED_WOODEN_PLANK_TRAPDOOR.get(), modLoc("block/pink_colored_wooden_plank_trapdoor"),
                true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.RED_COLORED_WOODEN_PLANK_TRAPDOOR.get(), modLoc("block/red_colored_wooden_plank_trapdoor"),
                true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.BLACK_COLORED_WOODEN_PLANK_TRAPDOOR.get(), modLoc("block/black_colored_wooden_plank_trapdoor"),
                true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.ORANGE_COLORED_WOODEN_PLANK_TRAPDOOR.get(), modLoc("block/orange_colored_wooden_plank_trapdoor"),
                true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.GREEN_COLORED_WOODEN_PLANK_TRAPDOOR.get(), modLoc("block/green_colored_wooden_plank_trapdoor"),
                true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.LIME_COLORED_WOODEN_PLANK_TRAPDOOR.get(), modLoc("block/lime_colored_wooden_plank_trapdoor"),
                true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.CYAN_COLORED_WOODEN_PLANK_TRAPDOOR.get(), modLoc("block/cyan_colored_wooden_plank_trapdoor"),
                true, "cutout");

        blockItem(ModBlocks.BROWN_COLORED_WOODEN_PLANK_TRAPDOOR, "_bottom");
        blockItem(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_TRAPDOOR, "_bottom");
        blockItem(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_TRAPDOOR, "_bottom");
        blockItem(ModBlocks.WHITE_COLORED_WOODEN_PLANK_TRAPDOOR, "_bottom");
        blockItem(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_TRAPDOOR, "_bottom");
        blockItem(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_TRAPDOOR, "_bottom");
        blockItem(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_TRAPDOOR, "_bottom");
        blockItem(ModBlocks.BLUE_COLORED_WOODEN_PLANK_TRAPDOOR, "_bottom");
        blockItem(ModBlocks.GRAY_COLORED_WOODEN_PLANK_TRAPDOOR, "_bottom");
        blockItem(ModBlocks.PINK_COLORED_WOODEN_PLANK_TRAPDOOR, "_bottom");
        blockItem(ModBlocks.RED_COLORED_WOODEN_PLANK_TRAPDOOR, "_bottom");
        blockItem(ModBlocks.BLACK_COLORED_WOODEN_PLANK_TRAPDOOR, "_bottom");
        blockItem(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_TRAPDOOR, "_bottom");
        blockItem(ModBlocks.GREEN_COLORED_WOODEN_PLANK_TRAPDOOR, "_bottom");
        blockItem(ModBlocks.LIME_COLORED_WOODEN_PLANK_TRAPDOOR, "_bottom");
        blockItem(ModBlocks.CYAN_COLORED_WOODEN_PLANK_TRAPDOOR, "_bottom");


        logBlock(((RotatedPillarBlock) ModBlocks.BROWN_COLORED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.MAGENTA_COLORED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.PURPLE_COLORED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.WHITE_COLORED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.YELLOW_COLORED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.LIGHT_GRAY_COLORED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.LIGHT_BLUE_COLORED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.BLUE_COLORED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.GRAY_COLORED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.PINK_COLORED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.RED_COLORED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.BLACK_COLORED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.ORANGE_COLORED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.GREEN_COLORED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.LIME_COLORED_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.CYAN_COLORED_LOG.get()));

        axisBlock(((RotatedPillarBlock) ModBlocks.BROWN_COLORED_WOOD.get()), blockTexture(ModBlocks.BROWN_COLORED_LOG.get()), blockTexture(ModBlocks.BROWN_COLORED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.MAGENTA_COLORED_WOOD.get()), blockTexture(ModBlocks.MAGENTA_COLORED_LOG.get()), blockTexture(ModBlocks.MAGENTA_COLORED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.PURPLE_COLORED_WOOD.get()), blockTexture(ModBlocks.PURPLE_COLORED_LOG.get()), blockTexture(ModBlocks.PURPLE_COLORED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.WHITE_COLORED_WOOD.get()), blockTexture(ModBlocks.WHITE_COLORED_LOG.get()), blockTexture(ModBlocks.WHITE_COLORED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.YELLOW_COLORED_WOOD.get()), blockTexture(ModBlocks.YELLOW_COLORED_LOG.get()), blockTexture(ModBlocks.YELLOW_COLORED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.LIGHT_GRAY_COLORED_WOOD.get()), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_LOG.get()), blockTexture(ModBlocks.LIGHT_GRAY_COLORED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.LIGHT_BLUE_COLORED_WOOD.get()), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_LOG.get()), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.BLUE_COLORED_WOOD.get()), blockTexture(ModBlocks.BLUE_COLORED_LOG.get()), blockTexture(ModBlocks.BLUE_COLORED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.GRAY_COLORED_WOOD.get()), blockTexture(ModBlocks.GRAY_COLORED_LOG.get()), blockTexture(ModBlocks.GRAY_COLORED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.PINK_COLORED_WOOD.get()), blockTexture(ModBlocks.PINK_COLORED_LOG.get()), blockTexture(ModBlocks.PINK_COLORED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.RED_COLORED_WOOD.get()), blockTexture(ModBlocks.RED_COLORED_LOG.get()), blockTexture(ModBlocks.RED_COLORED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.BLACK_COLORED_WOOD.get()), blockTexture(ModBlocks.BLACK_COLORED_LOG.get()), blockTexture(ModBlocks.BLACK_COLORED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.ORANGE_COLORED_WOOD.get()), blockTexture(ModBlocks.ORANGE_COLORED_LOG.get()), blockTexture(ModBlocks.ORANGE_COLORED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.GREEN_COLORED_WOOD.get()), blockTexture(ModBlocks.GREEN_COLORED_LOG.get()), blockTexture(ModBlocks.GREEN_COLORED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.LIME_COLORED_WOOD.get()), blockTexture(ModBlocks.LIME_COLORED_LOG.get()), blockTexture(ModBlocks.LIME_COLORED_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CYAN_COLORED_WOOD.get()), blockTexture(ModBlocks.CYAN_COLORED_LOG.get()), blockTexture(ModBlocks.CYAN_COLORED_LOG.get()));

        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_BROWN_COLORED_LOG.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_brown_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_brown_colored_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_BROWN_COLORED_WOOD.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_brown_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_brown_colored_log"));

        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_WHITE_COLORED_LOG.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_white_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_white_colored_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_WHITE_COLORED_WOOD.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_white_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_white_colored_log"));

        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_LIME_COLORED_LOG.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_lime_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_lime_colored_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_LIME_COLORED_WOOD.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_lime_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_lime_colored_log"));

        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_GREEN_COLORED_LOG.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_green_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_green_colored_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_GREEN_COLORED_WOOD.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_green_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_green_colored_log"));

        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_RED_COLORED_LOG.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_red_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_red_colored_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_RED_COLORED_WOOD.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_red_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_red_colored_log"));

        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_PINK_COLORED_LOG.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_pink_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_pink_colored_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_PINK_COLORED_WOOD.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_pink_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_pink_colored_log"));

        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_MAGENTA_COLORED_LOG.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_magenta_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_magenta_colored_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_MAGENTA_COLORED_WOOD.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_magenta_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_magenta_colored_log"));

        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_PURPLE_COLORED_LOG.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_purple_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_purple_colored_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_PURPLE_COLORED_WOOD.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_purple_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_purple_colored_log"));

        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_GRAY_COLORED_LOG.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_gray_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_gray_colored_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_GRAY_COLORED_WOOD.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_gray_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_gray_colored_log"));

        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_LIGHT_GRAY_COLORED_LOG.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_light_gray_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_light_gray_colored_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_LIGHT_GRAY_COLORED_WOOD.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_light_gray_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_light_gray_colored_log"));

        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_LIGHT_BLUE_COLORED_LOG.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_light_blue_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_light_blue_colored_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_LIGHT_BLUE_COLORED_WOOD.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_light_blue_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_light_blue_colored_log"));

        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_BLUE_COLORED_LOG.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_blue_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_blue_colored_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_BLUE_COLORED_WOOD.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_blue_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_blue_colored_log"));

        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_CYAN_COLORED_LOG.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_cyan_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_cyan_colored_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_CYAN_COLORED_WOOD.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_cyan_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_cyan_colored_log"));

        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_ORANGE_COLORED_LOG.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_orange_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_orange_colored_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_ORANGE_COLORED_WOOD.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_orange_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_orange_colored_log"));

        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_YELLOW_COLORED_LOG.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_yellow_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_yellow_colored_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_YELLOW_COLORED_WOOD.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_yellow_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_yellow_colored_log"));

        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_BLACK_COLORED_LOG.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_black_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_black_colored_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_BLACK_COLORED_WOOD.get(), new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_black_colored_log"),
                new ResourceLocation(Caveopolis.MOD_ID, "block/stripped_black_colored_log"));


        blockItem(ModBlocks.STRIPPED_BROWN_COLORED_WOOD);
        blockItem(ModBlocks.STRIPPED_MAGENTA_COLORED_WOOD);
        blockItem(ModBlocks.STRIPPED_PURPLE_COLORED_WOOD);
        blockItem(ModBlocks.STRIPPED_WHITE_COLORED_WOOD);
        blockItem(ModBlocks.STRIPPED_YELLOW_COLORED_WOOD);
        blockItem(ModBlocks.STRIPPED_LIGHT_GRAY_COLORED_WOOD);
        blockItem(ModBlocks.STRIPPED_LIGHT_BLUE_COLORED_WOOD);
        blockItem(ModBlocks.STRIPPED_BLUE_COLORED_WOOD);
        blockItem(ModBlocks.STRIPPED_GRAY_COLORED_WOOD);
        blockItem(ModBlocks.STRIPPED_PINK_COLORED_WOOD);
        blockItem(ModBlocks.STRIPPED_RED_COLORED_WOOD);
        blockItem(ModBlocks.STRIPPED_BLACK_COLORED_WOOD);
        blockItem(ModBlocks.STRIPPED_ORANGE_COLORED_WOOD);
        blockItem(ModBlocks.STRIPPED_GREEN_COLORED_WOOD);
        blockItem(ModBlocks.STRIPPED_LIME_COLORED_WOOD);
        blockItem(ModBlocks.STRIPPED_CYAN_COLORED_WOOD);

        blockItem(ModBlocks.STRIPPED_BROWN_COLORED_LOG);
        blockItem(ModBlocks.STRIPPED_MAGENTA_COLORED_LOG);
        blockItem(ModBlocks.STRIPPED_PURPLE_COLORED_LOG);
        blockItem(ModBlocks.STRIPPED_WHITE_COLORED_LOG);
        blockItem(ModBlocks.STRIPPED_YELLOW_COLORED_LOG);
        blockItem(ModBlocks.STRIPPED_LIGHT_GRAY_COLORED_LOG);
        blockItem(ModBlocks.STRIPPED_LIGHT_BLUE_COLORED_LOG);
        blockItem(ModBlocks.STRIPPED_BLUE_COLORED_LOG);
        blockItem(ModBlocks.STRIPPED_GRAY_COLORED_LOG);
        blockItem(ModBlocks.STRIPPED_PINK_COLORED_LOG);
        blockItem(ModBlocks.STRIPPED_RED_COLORED_LOG);
        blockItem(ModBlocks.STRIPPED_BLACK_COLORED_LOG);
        blockItem(ModBlocks.STRIPPED_ORANGE_COLORED_LOG);
        blockItem(ModBlocks.STRIPPED_GREEN_COLORED_LOG);
        blockItem(ModBlocks.STRIPPED_LIME_COLORED_LOG);
        blockItem(ModBlocks.STRIPPED_CYAN_COLORED_LOG);

        blockItem(ModBlocks.BROWN_COLORED_WOOD);
        blockItem(ModBlocks.MAGENTA_COLORED_WOOD);
        blockItem(ModBlocks.PURPLE_COLORED_WOOD);
        blockItem(ModBlocks.WHITE_COLORED_WOOD);
        blockItem(ModBlocks.YELLOW_COLORED_WOOD);
        blockItem(ModBlocks.LIGHT_GRAY_COLORED_WOOD);
        blockItem(ModBlocks.LIGHT_BLUE_COLORED_WOOD);
        blockItem(ModBlocks.BLUE_COLORED_WOOD);
        blockItem(ModBlocks.GRAY_COLORED_WOOD);
        blockItem(ModBlocks.PINK_COLORED_WOOD);
        blockItem(ModBlocks.RED_COLORED_WOOD);
        blockItem(ModBlocks.BLACK_COLORED_WOOD);
        blockItem(ModBlocks.ORANGE_COLORED_WOOD);
        blockItem(ModBlocks.GREEN_COLORED_WOOD);
        blockItem(ModBlocks.LIME_COLORED_WOOD);
        blockItem(ModBlocks.CYAN_COLORED_WOOD);

        blockItem(ModBlocks.BROWN_COLORED_LOG);
        blockItem(ModBlocks.MAGENTA_COLORED_LOG);
        blockItem(ModBlocks.PURPLE_COLORED_LOG);
        blockItem(ModBlocks.WHITE_COLORED_LOG);
        blockItem(ModBlocks.YELLOW_COLORED_LOG);
        blockItem(ModBlocks.LIGHT_GRAY_COLORED_LOG);
        blockItem(ModBlocks.LIGHT_BLUE_COLORED_LOG);
        blockItem(ModBlocks.BLUE_COLORED_LOG);
        blockItem(ModBlocks.GRAY_COLORED_LOG);
        blockItem(ModBlocks.PINK_COLORED_LOG);
        blockItem(ModBlocks.RED_COLORED_LOG);
        blockItem(ModBlocks.BLACK_COLORED_LOG);
        blockItem(ModBlocks.ORANGE_COLORED_LOG);
        blockItem(ModBlocks.GREEN_COLORED_LOG);
        blockItem(ModBlocks.LIME_COLORED_LOG);
        blockItem(ModBlocks.CYAN_COLORED_LOG);

        signBlock(((StandingSignBlock) ModBlocks.BLACK_COLORED_SIGN.get()), ((WallSignBlock) ModBlocks.BLACK_COLORED_WALL_SIGN.get()),
                blockTexture(ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get()));
        hangingSignBlock(ModBlocks.BLACK_COLORED_HANGING_SIGN.get(), ModBlocks.BLACK_COLORED_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get()));

        signBlock(((StandingSignBlock) ModBlocks.WHITE_COLORED_SIGN.get()), ((WallSignBlock) ModBlocks.WHITE_COLORED_WALL_SIGN.get()),
                blockTexture(ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get()));
        hangingSignBlock(ModBlocks.WHITE_COLORED_HANGING_SIGN.get(), ModBlocks.WHITE_COLORED_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get()));

        signBlock(((StandingSignBlock) ModBlocks.BROWN_COLORED_SIGN.get()), ((WallSignBlock) ModBlocks.BROWN_COLORED_WALL_SIGN.get()),
                blockTexture(ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get()));
        hangingSignBlock(ModBlocks.BROWN_COLORED_HANGING_SIGN.get(), ModBlocks.BROWN_COLORED_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get()));

        signBlock(((StandingSignBlock) ModBlocks.GRAY_COLORED_SIGN.get()), ((WallSignBlock) ModBlocks.GRAY_COLORED_WALL_SIGN.get()),
                blockTexture(ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get()));
        hangingSignBlock(ModBlocks.GRAY_COLORED_HANGING_SIGN.get(), ModBlocks.GRAY_COLORED_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get()));

        signBlock(((StandingSignBlock) ModBlocks.LIGHT_GRAY_COLORED_SIGN.get()), ((WallSignBlock) ModBlocks.LIGHT_GRAY_COLORED_WALL_SIGN.get()),
                blockTexture(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get()));
        hangingSignBlock(ModBlocks.LIGHT_GRAY_COLORED_HANGING_SIGN.get(), ModBlocks.LIGHT_GRAY_COLORED_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get()));

        signBlock(((StandingSignBlock) ModBlocks.LIGHT_BLUE_COLORED_SIGN.get()), ((WallSignBlock) ModBlocks.LIGHT_BLUE_COLORED_WALL_SIGN.get()),
                blockTexture(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get()));
        hangingSignBlock(ModBlocks.LIGHT_BLUE_COLORED_HANGING_SIGN.get(), ModBlocks.LIGHT_BLUE_COLORED_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get()));

        signBlock(((StandingSignBlock) ModBlocks.BLUE_COLORED_SIGN.get()), ((WallSignBlock) ModBlocks.BLUE_COLORED_WALL_SIGN.get()),
                blockTexture(ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get()));
        hangingSignBlock(ModBlocks.BLUE_COLORED_HANGING_SIGN.get(), ModBlocks.BLUE_COLORED_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get()));

        signBlock(((StandingSignBlock) ModBlocks.CYAN_COLORED_SIGN.get()), ((WallSignBlock) ModBlocks.CYAN_COLORED_WALL_SIGN.get()),
                blockTexture(ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get()));
        hangingSignBlock(ModBlocks.CYAN_COLORED_HANGING_SIGN.get(), ModBlocks.CYAN_COLORED_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get()));

        signBlock(((StandingSignBlock) ModBlocks.LIME_COLORED_SIGN.get()), ((WallSignBlock) ModBlocks.LIME_COLORED_WALL_SIGN.get()),
                blockTexture(ModBlocks.LIME_COLORED_WOODEN_PLANKS.get()));
        hangingSignBlock(ModBlocks.LIME_COLORED_HANGING_SIGN.get(), ModBlocks.LIME_COLORED_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.LIME_COLORED_WOODEN_PLANKS.get()));

        signBlock(((StandingSignBlock) ModBlocks.GREEN_COLORED_SIGN.get()), ((WallSignBlock) ModBlocks.GREEN_COLORED_WALL_SIGN.get()),
                blockTexture(ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get()));
        hangingSignBlock(ModBlocks.GREEN_COLORED_HANGING_SIGN.get(), ModBlocks.GREEN_COLORED_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get()));

        signBlock(((StandingSignBlock) ModBlocks.YELLOW_COLORED_SIGN.get()), ((WallSignBlock) ModBlocks.YELLOW_COLORED_WALL_SIGN.get()),
                blockTexture(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get()));
        hangingSignBlock(ModBlocks.YELLOW_COLORED_HANGING_SIGN.get(), ModBlocks.YELLOW_COLORED_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get()));

        signBlock(((StandingSignBlock) ModBlocks.ORANGE_COLORED_SIGN.get()), ((WallSignBlock) ModBlocks.ORANGE_COLORED_WALL_SIGN.get()),
                blockTexture(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get()));
        hangingSignBlock(ModBlocks.ORANGE_COLORED_HANGING_SIGN.get(), ModBlocks.ORANGE_COLORED_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get()));

        signBlock(((StandingSignBlock) ModBlocks.RED_COLORED_SIGN.get()), ((WallSignBlock) ModBlocks.RED_COLORED_WALL_SIGN.get()),
                blockTexture(ModBlocks.RED_COLORED_WOODEN_PLANKS.get()));
        hangingSignBlock(ModBlocks.RED_COLORED_HANGING_SIGN.get(), ModBlocks.RED_COLORED_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.RED_COLORED_WOODEN_PLANKS.get()));

        signBlock(((StandingSignBlock) ModBlocks.PINK_COLORED_SIGN.get()), ((WallSignBlock) ModBlocks.PINK_COLORED_WALL_SIGN.get()),
                blockTexture(ModBlocks.PINK_COLORED_WOODEN_PLANKS.get()));
        hangingSignBlock(ModBlocks.PINK_COLORED_HANGING_SIGN.get(), ModBlocks.PINK_COLORED_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.PINK_COLORED_WOODEN_PLANKS.get()));

        signBlock(((StandingSignBlock) ModBlocks.MAGENTA_COLORED_SIGN.get()), ((WallSignBlock) ModBlocks.MAGENTA_COLORED_WALL_SIGN.get()),
                blockTexture(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get()));
        hangingSignBlock(ModBlocks.MAGENTA_COLORED_HANGING_SIGN.get(), ModBlocks.MAGENTA_COLORED_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get()));

        signBlock(((StandingSignBlock) ModBlocks.PURPLE_COLORED_SIGN.get()), ((WallSignBlock) ModBlocks.PURPLE_COLORED_WALL_SIGN.get()),
                blockTexture(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get()));
        hangingSignBlock(ModBlocks.PURPLE_COLORED_HANGING_SIGN.get(), ModBlocks.PURPLE_COLORED_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get()));

        //MARBLE

        blockWithItem(ModBlocks.MARBLE);
        slabBlock((SlabBlock) ModBlocks.MARBLE_SLAB.get(), blockTexture(ModBlocks.MARBLE.get()),
                blockTexture(ModBlocks.MARBLE.get()));
        stairsBlock((StairBlock) ModBlocks.MARBLE_STAIRS.get(), blockTexture(ModBlocks.MARBLE.get()));
        wallBlock((WallBlock) ModBlocks.MARBLE_WALL.get(), blockTexture(ModBlocks.MARBLE.get()));
        blockItem(ModBlocks.MARBLE_SLAB);
        blockItem(ModBlocks.MARBLE_STAIRS);

        blockWithItem(ModBlocks.MARBLE_BRICKS);
        slabBlock((SlabBlock) ModBlocks.MARBLE_BRICK_SLAB.get(), blockTexture(ModBlocks.MARBLE_BRICKS.get()),
                blockTexture(ModBlocks.MARBLE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.MARBLE_BRICK_STAIRS.get(), blockTexture(ModBlocks.MARBLE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.MARBLE_BRICK_WALL.get(), blockTexture(ModBlocks.MARBLE_BRICKS.get()));
        blockItem(ModBlocks.MARBLE_BRICK_SLAB);
        blockItem(ModBlocks.MARBLE_BRICK_STAIRS);

        //Leaves

        blockWithItem(ModBlocks.BLACK_COLORED_LEAVES);
        blockWithItem(ModBlocks.BROWN_COLORED_LEAVES);
        blockWithItem(ModBlocks.WHITE_COLORED_LEAVES);
        blockWithItem(ModBlocks.YELLOW_COLORED_LEAVES);
        blockWithItem(ModBlocks.ORANGE_COLORED_LEAVES);
        blockWithItem(ModBlocks.RED_COLORED_LEAVES);
        blockWithItem(ModBlocks.PINK_COLORED_LEAVES);
        blockWithItem(ModBlocks.PURPLE_COLORED_LEAVES);
        blockWithItem(ModBlocks.MAGENTA_COLORED_LEAVES);
        blockWithItem(ModBlocks.BLUE_COLORED_LEAVES);
        blockWithItem(ModBlocks.LIGHT_BLUE_COLORED_LEAVES);
        blockWithItem(ModBlocks.GRAY_COLORED_LEAVES);
        blockWithItem(ModBlocks.LIGHT_GRAY_COLORED_LEAVES);
        blockWithItem(ModBlocks.GREEN_COLORED_LEAVES);
        blockWithItem(ModBlocks.LIME_COLORED_LEAVES);
        blockWithItem(ModBlocks.CYAN_COLORED_LEAVES);

        //SAPLING

        saplingBlock(ModBlocks.BLACK_COLORED_SAPLING);
        saplingBlock(ModBlocks.BROWN_COLORED_SAPLING);
        saplingBlock(ModBlocks.WHITE_COLORED_SAPLING);
        saplingBlock(ModBlocks.YELLOW_COLORED_SAPLING);
        saplingBlock(ModBlocks.ORANGE_COLORED_SAPLING);
        saplingBlock(ModBlocks.RED_COLORED_SAPLING);
        saplingBlock(ModBlocks.PINK_COLORED_SAPLING);
        saplingBlock(ModBlocks.PURPLE_COLORED_SAPLING);
        saplingBlock(ModBlocks.MAGENTA_COLORED_SAPLING);
        saplingBlock(ModBlocks.BLUE_COLORED_SAPLING);
        saplingBlock(ModBlocks.LIGHT_BLUE_COLORED_SAPLING);
        saplingBlock(ModBlocks.GRAY_COLORED_SAPLING);
        saplingBlock(ModBlocks.LIGHT_GRAY_COLORED_SAPLING);
        saplingBlock(ModBlocks.GREEN_COLORED_SAPLING);
        saplingBlock(ModBlocks.LIME_COLORED_SAPLING);
        saplingBlock(ModBlocks.CYAN_COLORED_SAPLING);


    }

                        

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(), models().cubeAll(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(), models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }



    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("caveopolis:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }


    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("caveopolis:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}