package com.benbenlaw.caveopolis.block;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.config.StartupConfig;
import com.benbenlaw.caveopolis.worldgen.CaveopolisConfiguredFeatures;
import com.benbenlaw.caveopolis.worldgen.CaveopolisPlacedFeatures;
import com.benbenlaw.caveopolis.worldgen.tree.CaveopolisTreeGrowers;
import com.benbenlaw.core.block.colored.*;
import com.benbenlaw.core.block.colored.flammable.*;
import net.minecraft.data.worldgen.features.MiscOverworldFeatures;
import net.minecraft.data.worldgen.features.NetherFeatures;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.feature.configurations.NetherForestVegetationConfig;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class CaveopolisBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Caveopolis.MOD_ID);

    //Misc Blocks
    public static final DeferredBlock<Block> COLORED_CRAFTING_TABLE = registerBlockWithoutBlockItem("colored_crafting_table",
            () -> new ColoredCraftingTable(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).sound(SoundType.WOOD)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_DIRT = registerBlockWithoutBlockItem("colored_dirt",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_TALL_GRASS = registerBlockWithoutBlockItem("colored_tall_grass",
            () -> new ColoredDoublePlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS).sound(SoundType.GRASS)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_SHORT_GRASS = registerBlockWithoutBlockItem("colored_short_grass",
            () -> new ColoredTallGrassBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SHORT_GRASS).sound(SoundType.GRASS)
                    .lightLevel(litBlockEmission()), (ColoredDoublePlantBlock) COLORED_TALL_GRASS.get()));
    public static final DeferredBlock<Block> COLORED_GRASS_BLOCK = registerBlockWithoutBlockItem("colored_grass_block",
            () -> new ColoredGrassBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRASS_BLOCK).sound(SoundType.GRASS)
                    .lightLevel(litBlockEmission()), (ColoredBlock) COLORED_DIRT.get(),
                    (ColoredTallGrassBlock) COLORED_SHORT_GRASS.get(), CaveopolisConfiguredFeatures.BONEMEAL_BLACK_GRASS_KEY));

    //Colored Cracked Stone Bricks
    public static final DeferredBlock<Block> COLORED_CRACKED_STONE_BRICKS = registerBlockWithoutBlockItem("colored_cracked_stone_bricks",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_CRACKED_STONE_BRICK_SLAB = registerBlockWithoutBlockItem("colored_cracked_stone_brick_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_CRACKED_STONE_BRICK_STAIRS = registerBlockWithoutBlockItem("colored_cracked_stone_brick_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_CRACKED_STONE_BRICKS.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS).sound(SoundType.STONE)
                        .lightLevel(litBlockEmission()));});
    public static final DeferredBlock<Block> COLORED_CRACKED_STONE_BRICK_WALL = registerBlockWithoutBlockItem("colored_cracked_stone_brick_wall",
            () -> new ColoredWall(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_CRACKED_STONE_BRICK_PRESSURE_PLATE = registerBlockWithoutBlockItem("colored_cracked_stone_brick_pressure_plate",
            () -> new ColoredPressurePlate(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE)
                            .lightLevel(litBlockEmission()), BlockSetType.STONE));
    public static final DeferredBlock<Block> COLORED_CRACKED_STONE_BRICK_BUTTON = registerBlockWithoutBlockItem("colored_cracked_stone_brick_button",
            () -> new ColoredButton(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)
                    .lightLevel(litBlockEmission()).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));

    //Colored Prismarine
    public static final DeferredBlock<Block> COLORED_PRISMARINE = registerBlockWithoutBlockItem("colored_prismarine",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_PRISMARINE_SLAB = registerBlockWithoutBlockItem("colored_prismarine_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_SLAB).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_PRISMARINE_STAIRS = registerBlockWithoutBlockItem("colored_prismarine_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_PRISMARINE.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_STAIRS).sound(SoundType.STONE)
                        .lightLevel(litBlockEmission()));});
    public static final DeferredBlock<Block> COLORED_PRISMARINE_WALL = registerBlockWithoutBlockItem("colored_prismarine_wall",
            () -> new ColoredWall(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_WALL).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_PRISMARINE_PRESSURE_PLATE = registerBlockWithoutBlockItem("colored_prismarine_pressure_plate",
            () -> new ColoredPressurePlate(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE)
                            .lightLevel(litBlockEmission()), BlockSetType.STONE));
    public static final DeferredBlock<Block> COLORED_PRISMARINE_BUTTON = registerBlockWithoutBlockItem("colored_prismarine_button",
            () -> new ColoredButton(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)
                    .lightLevel(litBlockEmission()).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));

    //Colored Dark Prismarine
    public static final DeferredBlock<Block> COLORED_DARK_PRISMARINE = registerBlockWithoutBlockItem("colored_dark_prismarine",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_DARK_PRISMARINE_SLAB = registerBlockWithoutBlockItem("colored_dark_prismarine_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE_SLAB).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_DARK_PRISMARINE_STAIRS = registerBlockWithoutBlockItem("colored_dark_prismarine_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_DARK_PRISMARINE.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE_STAIRS).sound(SoundType.STONE)
                        .lightLevel(litBlockEmission()));});
    public static final DeferredBlock<Block> COLORED_DARK_PRISMARINE_WALL = registerBlockWithoutBlockItem("colored_dark_prismarine_wall",
            () -> new ColoredWall(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_DARK_PRISMARINE_PRESSURE_PLATE = registerBlockWithoutBlockItem("colored_dark_prismarine_pressure_plate",
            () -> new ColoredPressurePlate(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE)
                            .lightLevel(litBlockEmission()), BlockSetType.STONE));
    public static final DeferredBlock<Block> COLORED_DARK_PRISMARINE_BUTTON = registerBlockWithoutBlockItem("colored_dark_prismarine_button",
            () -> new ColoredButton(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)
                    .lightLevel(litBlockEmission()).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));

    //Colored Prismarine Bricks
    public static final DeferredBlock<Block> COLORED_PRISMARINE_BRICKS = registerBlockWithoutBlockItem("colored_prismarine_bricks",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_PRISMARINE_BRICK_SLAB = registerBlockWithoutBlockItem("colored_prismarine_brick_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICK_SLAB).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_PRISMARINE_BRICK_STAIRS = registerBlockWithoutBlockItem("colored_prismarine_brick_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_PRISMARINE_BRICKS.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICK_STAIRS).sound(SoundType.STONE)
                        .lightLevel(litBlockEmission()));});
    public static final DeferredBlock<Block> COLORED_PRISMARINE_BRICK_WALL = registerBlockWithoutBlockItem("colored_prismarine_brick_wall",
            () -> new ColoredWall(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_PRISMARINE_BRICK_PRESSURE_PLATE = registerBlockWithoutBlockItem("colored_prismarine_brick_pressure_plate",
            () -> new ColoredPressurePlate(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE)
                            .lightLevel(litBlockEmission()), BlockSetType.STONE));
    public static final DeferredBlock<Block> COLORED_PRISMARINE_BRICK_BUTTON = registerBlockWithoutBlockItem("colored_prismarine_brick_button",
            () -> new ColoredButton(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)
                    .lightLevel(litBlockEmission()).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));



    //Colored Tiles
    public static final DeferredBlock<Block> COLORED_TILE = registerBlockWithoutBlockItem("colored_tile",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_TILE_SLAB = registerBlockWithoutBlockItem("colored_tile_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_TILE_STAIRS = registerBlockWithoutBlockItem("colored_tile_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_TILE.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).sound(SoundType.STONE)
                        .lightLevel(litBlockEmission()));});
    public static final DeferredBlock<Block> COLORED_TILE_WALL = registerBlockWithoutBlockItem("colored_tile_wall",
            () -> new ColoredWall(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_TILE_PRESSURE_PLATE = registerBlockWithoutBlockItem("colored_tile_pressure_plate",
            () -> new ColoredPressurePlate(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE)
                            .lightLevel(litBlockEmission()), BlockSetType.STONE));
    public static final DeferredBlock<Block> COLORED_TILE_BUTTON = registerBlockWithoutBlockItem("colored_tile_button",
            () -> new ColoredButton(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)
                    .lightLevel(litBlockEmission()).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));


    //Colored Polished Stone
    public static final DeferredBlock<Block> COLORED_POLISHED_STONE = registerBlockWithoutBlockItem("colored_polished_stone",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_POLISHED_STONE_SLAB = registerBlockWithoutBlockItem("colored_polished_stone_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE_SLAB).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_POLISHED_STONE_STAIRS = registerBlockWithoutBlockItem("colored_polished_stone_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_POLISHED_STONE.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE_STAIRS).sound(SoundType.STONE)
                        .lightLevel(litBlockEmission()));});
    public static final DeferredBlock<Block> COLORED_POLISHED_STONE_WALL = registerBlockWithoutBlockItem("colored_polished_stone_wall",
            () -> new ColoredWall(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_POLISHED_STONE_PRESSURE_PLATE = registerBlockWithoutBlockItem("colored_polished_stone_pressure_plate",
            () -> new ColoredPressurePlate(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE)
                            .lightLevel(litBlockEmission()), BlockSetType.STONE));
    public static final DeferredBlock<Block> COLORED_POLISHED_STONE_BUTTON = registerBlockWithoutBlockItem("colored_polished_stone_button",
            () -> new ColoredButton(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)
                    .lightLevel(litBlockEmission()).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));


    //Colored Stone


    public static final DeferredBlock<Block> COLORED_STONE = registerBlockWithoutBlockItem("colored_stone",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));

    public static final DeferredBlock<Block> COLORED_STONE_SLAB = registerBlockWithoutBlockItem("colored_stone_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_STONE_STAIRS = registerBlockWithoutBlockItem("colored_stone_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_STONE.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).sound(SoundType.STONE)
                        .lightLevel(litBlockEmission()));});
    public static final DeferredBlock<Block> COLORED_STONE_WALL = registerBlockWithoutBlockItem("colored_stone_wall",
            () -> new ColoredWall(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_STONE_PRESSURE_PLATE = registerBlockWithoutBlockItem("colored_stone_pressure_plate",
            () -> new ColoredPressurePlate(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE)
                            .lightLevel(litBlockEmission()), BlockSetType.STONE));
    public static final DeferredBlock<Block> COLORED_STONE_BUTTON = registerBlockWithoutBlockItem("colored_stone_button",
            () -> new ColoredButton(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)
                    .lightLevel(litBlockEmission()).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));

    //Colored Stone Bricks

    public static final DeferredBlock<Block> COLORED_STONE_BRICKS = registerBlockWithoutBlockItem("colored_stone_bricks",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_STONE_BRICK_SLAB = registerBlockWithoutBlockItem("colored_stone_brick_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_STONE_BRICK_STAIRS = registerBlockWithoutBlockItem("colored_stone_brick_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_STONE_BRICKS.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS).sound(SoundType.STONE)
                        .lightLevel(litBlockEmission()));});
    public static final DeferredBlock<Block> COLORED_STONE_BRICK_WALL = registerBlockWithoutBlockItem("colored_stone_brick_wall",
            () -> new ColoredWall(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_STONE_BRICK_PRESSURE_PLATE = registerBlockWithoutBlockItem("colored_stone_brick_pressure_plate",
            () -> new ColoredPressurePlate(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE)
                            .lightLevel(litBlockEmission()), BlockSetType.STONE));
    public static final DeferredBlock<Block> COLORED_STONE_BRICK_BUTTON = registerBlockWithoutBlockItem("colored_stone_brick_button",
            () -> new ColoredButton(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)
                    .lightLevel(litBlockEmission()).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));

    //Colored Brick

    public static final DeferredBlock<Block> COLORED_BRICKS = registerBlockWithoutBlockItem("colored_bricks",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_BRICK_SLAB = registerBlockWithoutBlockItem("colored_brick_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_BRICK_STAIRS = registerBlockWithoutBlockItem("colored_brick_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_BRICKS.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).sound(SoundType.STONE)
                        .lightLevel(litBlockEmission()));});
    public static final DeferredBlock<Block> COLORED_BRICK_WALL = registerBlockWithoutBlockItem("colored_brick_wall",
            () -> new ColoredWall(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_BRICK_PRESSURE_PLATE = registerBlockWithoutBlockItem("colored_brick_pressure_plate",
            () -> new ColoredPressurePlate(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE)
                            .lightLevel(litBlockEmission()), BlockSetType.STONE));
    public static final DeferredBlock<Block> COLORED_BRICK_BUTTON = registerBlockWithoutBlockItem("colored_brick_button",
            () -> new ColoredButton(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)
                    .lightLevel(litBlockEmission()).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));

    //Colored Cobblestone

    public static final DeferredBlock<Block> COLORED_COBBLESTONE = registerBlockWithoutBlockItem("colored_cobblestone",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_COBBLESTONE_SLAB = registerBlockWithoutBlockItem("colored_cobblestone_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_COBBLESTONE_STAIRS = registerBlockWithoutBlockItem("colored_cobblestone_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_COBBLESTONE.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_STAIRS).sound(SoundType.STONE)
                        .lightLevel(litBlockEmission()));});
    public static final DeferredBlock<Block> COLORED_COBBLESTONE_WALL = registerBlockWithoutBlockItem("colored_cobblestone_wall",
            () -> new ColoredWall(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_COBBLESTONE_PRESSURE_PLATE = registerBlockWithoutBlockItem("colored_cobblestone_pressure_plate",
            () -> new ColoredPressurePlate(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE)
                            .lightLevel(litBlockEmission()), BlockSetType.STONE));
    public static final DeferredBlock<Block> COLORED_COBBLESTONE_BUTTON = registerBlockWithoutBlockItem("colored_cobblestone_button",
            () -> new ColoredButton(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)
                    .lightLevel(litBlockEmission()).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));

    //Colored Cobblestone Bricks

    public static final DeferredBlock<Block> COLORED_COBBLESTONE_BRICKS = registerBlockWithoutBlockItem("colored_cobblestone_bricks",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_COBBLESTONE_BRICK_SLAB = registerBlockWithoutBlockItem("colored_cobblestone_brick_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_COBBLESTONE_BRICK_STAIRS = registerBlockWithoutBlockItem("colored_cobblestone_brick_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_COBBLESTONE_BRICKS.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_STAIRS).sound(SoundType.STONE)
                        .lightLevel(litBlockEmission()));});
    public static final DeferredBlock<Block> COLORED_COBBLESTONE_BRICK_WALL = registerBlockWithoutBlockItem("colored_cobblestone_brick_wall",
            () -> new ColoredWall(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_COBBLESTONE_BRICK_PRESSURE_PLATE = registerBlockWithoutBlockItem("colored_cobblestone_brick_pressure_plate",
            () -> new ColoredPressurePlate(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE)
                            .lightLevel(litBlockEmission()), BlockSetType.STONE));
    public static final DeferredBlock<Block> COLORED_COBBLESTONE_BRICK_BUTTON = registerBlockWithoutBlockItem("colored_cobblestone_brick_button",
            () -> new ColoredButton(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)
                    .lightLevel(litBlockEmission()).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));

    //Colored Marble

    public static final DeferredBlock<Block> COLORED_MARBLE = registerBlockWithoutBlockItem("colored_marble",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_MARBLE_SLAB = registerBlockWithoutBlockItem("colored_marble_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_MARBLE_STAIRS = registerBlockWithoutBlockItem("colored_marble_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_MARBLE.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_STAIRS).sound(SoundType.STONE)
                        .lightLevel(litBlockEmission()));});
    public static final DeferredBlock<Block> COLORED_MARBLE_WALL = registerBlockWithoutBlockItem("colored_marble_wall",
            () -> new ColoredWall(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_MARBLE_PRESSURE_PLATE = registerBlockWithoutBlockItem("colored_marble_pressure_plate",
            () -> new ColoredPressurePlate(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE)
                            .lightLevel(litBlockEmission()), BlockSetType.STONE));
    public static final DeferredBlock<Block> COLORED_MARBLE_BUTTON = registerBlockWithoutBlockItem("colored_marble_button",
            () -> new ColoredButton(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)
                    .lightLevel(litBlockEmission()).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));

    //Colored Marble Bricks

    public static final DeferredBlock<Block> COLORED_MARBLE_BRICKS = registerBlockWithoutBlockItem("colored_marble_bricks",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_MARBLE_BRICK_SLAB = registerBlockWithoutBlockItem("colored_marble_brick_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_MARBLE_BRICK_STAIRS = registerBlockWithoutBlockItem("colored_marble_brick_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_MARBLE_BRICKS.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_STAIRS).sound(SoundType.STONE)
                        .lightLevel(litBlockEmission()));});
    public static final DeferredBlock<Block> COLORED_MARBLE_BRICK_WALL = registerBlockWithoutBlockItem("colored_marble_brick_wall",
            () -> new ColoredWall(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_MARBLE_BRICK_PRESSURE_PLATE = registerBlockWithoutBlockItem("colored_marble_brick_pressure_plate",
            () -> new ColoredPressurePlate(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE)
                            .lightLevel(litBlockEmission()), BlockSetType.STONE));
    public static final DeferredBlock<Block> COLORED_MARBLE_BRICK_BUTTON = registerBlockWithoutBlockItem("colored_marble_brick_button",
            () -> new ColoredButton(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)
                    .lightLevel(litBlockEmission()).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));



    //Colored Mosaic
    public static final DeferredBlock<Block> COLORED_MOSAIC = registerBlockWithoutBlockItem("colored_mosaic",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_MOSAIC_SLAB = registerBlockWithoutBlockItem("colored_mosaic_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_MOSAIC_STAIRS = registerBlockWithoutBlockItem("colored_mosaic_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_MOSAIC.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).sound(SoundType.STONE)
                        .lightLevel(litBlockEmission()));});
    public static final DeferredBlock<Block> COLORED_MOSAIC_WALL = registerBlockWithoutBlockItem("colored_mosaic_wall",
            () -> new ColoredWall(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_MOSAIC_PRESSURE_PLATE = registerBlockWithoutBlockItem("colored_mosaic_pressure_plate",
            () -> new ColoredPressurePlate(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE)
                            .lightLevel(litBlockEmission()), BlockSetType.STONE));
    public static final DeferredBlock<Block> COLORED_MOSAIC_BUTTON = registerBlockWithoutBlockItem("colored_mosaic_button",
            () -> new ColoredButton(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)
                    .lightLevel(litBlockEmission()).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));

    //Colored Chaotic
    public static final DeferredBlock<Block> COLORED_CHAOTIC = registerBlockWithoutBlockItem("colored_chaotic",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_CHAOTIC_SLAB = registerBlockWithoutBlockItem("colored_chaotic_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_CHAOTIC_STAIRS = registerBlockWithoutBlockItem("colored_chaotic_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_CHAOTIC.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).sound(SoundType.STONE)
                        .lightLevel(litBlockEmission()));});
    public static final DeferredBlock<Block> COLORED_CHAOTIC_WALL = registerBlockWithoutBlockItem("colored_chaotic_wall",
            () -> new ColoredWall(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_CHAOTIC_PRESSURE_PLATE = registerBlockWithoutBlockItem("colored_chaotic_pressure_plate",
            () -> new ColoredPressurePlate(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE)
                            .lightLevel(litBlockEmission()), BlockSetType.STONE));
    public static final DeferredBlock<Block> COLORED_CHAOTIC_BUTTON = registerBlockWithoutBlockItem("colored_chaotic_button",
            () -> new ColoredButton(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)
                    .lightLevel(litBlockEmission()).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));

    //Colored Triple
    public static final DeferredBlock<Block> COLORED_TRIPLE = registerBlockWithoutBlockItem("colored_triple",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_TRIPLE_SLAB = registerBlockWithoutBlockItem("colored_triple_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_TRIPLE_STAIRS = registerBlockWithoutBlockItem("colored_triple_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_TRIPLE.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).sound(SoundType.STONE)
                        .lightLevel(litBlockEmission()));});
    public static final DeferredBlock<Block> COLORED_TRIPLE_WALL = registerBlockWithoutBlockItem("colored_triple_wall",
            () -> new ColoredWall(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_TRIPLE_PRESSURE_PLATE = registerBlockWithoutBlockItem("colored_triple_pressure_plate",
            () -> new ColoredPressurePlate(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE)
                            .lightLevel(litBlockEmission()), BlockSetType.STONE));
    public static final DeferredBlock<Block> COLORED_TRIPLE_BUTTON = registerBlockWithoutBlockItem("colored_triple_button",
            () -> new ColoredButton(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)
                    .lightLevel(litBlockEmission()).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));

    //Colored Braid
    public static final DeferredBlock<Block> COLORED_BRAID = registerBlockWithoutBlockItem("colored_braid",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_BRAID_SLAB = registerBlockWithoutBlockItem("colored_braid_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_BRAID_STAIRS = registerBlockWithoutBlockItem("colored_braid_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_BRAID.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).sound(SoundType.STONE)
                        .lightLevel(litBlockEmission()));});
    public static final DeferredBlock<Block> COLORED_BRAID_WALL = registerBlockWithoutBlockItem("colored_braid_wall",
            () -> new ColoredWall(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_BRAID_PRESSURE_PLATE = registerBlockWithoutBlockItem("colored_braid_pressure_plate",
            () -> new ColoredPressurePlate(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE)
                            .lightLevel(litBlockEmission()), BlockSetType.STONE));
    public static final DeferredBlock<Block> COLORED_BRAID_BUTTON = registerBlockWithoutBlockItem("colored_braid_button",
            () -> new ColoredButton(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)
                    .lightLevel(litBlockEmission()).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));

    //Colored Encased
    public static final DeferredBlock<Block> COLORED_ENCASED = registerBlockWithoutBlockItem("colored_encased",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_ENCASED_SLAB = registerBlockWithoutBlockItem("colored_encased_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_ENCASED_STAIRS = registerBlockWithoutBlockItem("colored_encased_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_ENCASED.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).sound(SoundType.STONE)
                        .lightLevel(litBlockEmission()));});
    public static final DeferredBlock<Block> COLORED_ENCASED_WALL = registerBlockWithoutBlockItem("colored_encased_wall",
            () -> new ColoredWall(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_ENCASED_PRESSURE_PLATE = registerBlockWithoutBlockItem("colored_encased_pressure_plate",
            () -> new ColoredPressurePlate(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE)
                            .lightLevel(litBlockEmission()), BlockSetType.STONE));
    public static final DeferredBlock<Block> COLORED_ENCASED_BUTTON = registerBlockWithoutBlockItem("colored_encased_button",
            () -> new ColoredButton(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)
                    .lightLevel(litBlockEmission()).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));

    //Colored Road
    public static final DeferredBlock<Block> COLORED_ROAD = registerBlockWithoutBlockItem("colored_road",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_ROAD_SLAB = registerBlockWithoutBlockItem("colored_road_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_ROAD_STAIRS = registerBlockWithoutBlockItem("colored_road_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_ROAD.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).sound(SoundType.STONE)
                        .lightLevel(litBlockEmission()));});
    public static final DeferredBlock<Block> COLORED_ROAD_WALL = registerBlockWithoutBlockItem("colored_road_wall",
            () -> new ColoredWall(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_ROAD_PRESSURE_PLATE = registerBlockWithoutBlockItem("colored_road_pressure_plate",
            () -> new ColoredPressurePlate(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE)
                            .lightLevel(litBlockEmission()), BlockSetType.STONE));
    public static final DeferredBlock<Block> COLORED_ROAD_BUTTON = registerBlockWithoutBlockItem("colored_road_button",
            () -> new ColoredButton(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)
                    .lightLevel(litBlockEmission()).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));

    //Colored Plants
    public static final DeferredBlock<Block> COLORED_POPPY = registerBlockWithoutBlockItem("colored_poppy",
            () -> new ColoredFlower(MobEffects.ABSORPTION, 0.0f, BlockBehaviour.Properties.ofFullCopy(Blocks.POPPY).sound(SoundType.GRASS)
                    .lightLevel(litBlockEmission()).noOcclusion()));
    public static final DeferredBlock<Block> COLORED_POTTED_POPPY = registerBlockWithoutBlockItem("colored_potted_poppy",
            () -> new ColoredFlowerPot(() -> (FlowerPotBlock) Blocks.FLOWER_POT, COLORED_POPPY, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_POPPY)
                    .lightLevel(litBlockEmission()).noOcclusion()));

    public static final DeferredBlock<Block> COLORED_DANDELION = registerBlockWithoutBlockItem("colored_dandelion",
            () -> new ColoredFlower(MobEffects.ABSORPTION, 0.0f, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION).sound(SoundType.GRASS)
                    .lightLevel(litBlockEmission()).noOcclusion()));
    public static final DeferredBlock<Block> COLORED_POTTED_DANDELION = registerBlockWithoutBlockItem("colored_potted_dandelion",
            () -> new ColoredFlowerPot(() -> (FlowerPotBlock) Blocks.FLOWER_POT, COLORED_DANDELION, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)
                    .lightLevel(litBlockEmission()).noOcclusion()));

    //Colored Bamboo
    public static final DeferredBlock<Block> COLORED_BAMBOO_BLOCK = registerBlockWithoutBlockItem("colored_bamboo_block",
            () -> new FlammableColoredLog(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_BLOCK).lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> STRIPPED_COLORED_BAMBOO_BLOCK = registerBlockWithoutBlockItem("stripped_colored_bamboo_block",
            () -> new FlammableColoredLog(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_BLOCK).lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_BAMBOO_PLANKS = registerBlockWithoutBlockItem("colored_bamboo_planks",
            () -> new FlammableColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS).sound(SoundType.WOOD)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_BAMBOO_SLAB = registerBlockWithoutBlockItem("colored_bamboo_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_SLAB).sound(SoundType.WOOD)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_BAMBOO_STAIRS = registerBlockWithoutBlockItem("colored_bamboo_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_BAMBOO_PLANKS.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_STAIRS).sound(SoundType.WOOD)
                        .lightLevel(litBlockEmission()));});
    public static final DeferredBlock<Block> COLORED_BAMBOO_FENCE = registerBlockWithoutBlockItem("colored_bamboo_fence",
            () -> new FlammableColoredFence(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_FENCE).sound(SoundType.WOOD).lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_BAMBOO_FENCE_GATE = registerBlockWithoutBlockItem("colored_bamboo_fence_gate",
            () -> new FlammableColoredFenceGate(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_FENCE_GATE).sound(SoundType.WOOD).lightLevel(litBlockEmission()),
                    SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<Block> COLORED_BAMBOO_DOOR = registerBlockWithoutBlockItem("colored_bamboo_door",
            () -> new ColoredDoor(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_DOOR).lightLevel(litBlockEmission()), BlockSetType.OAK));
    public static final DeferredBlock<Block> COLORED_BAMBOO_TRAPDOOR = registerBlockWithoutBlockItem("colored_bamboo_trapdoor",
            () -> new ColoredTrapDoor(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_TRAPDOOR).lightLevel(litBlockEmission()), BlockSetType.OAK));
    public static final DeferredBlock<Block> COLORED_BAMBOO_PRESSURE_PLATE = registerBlockWithoutBlockItem("colored_bamboo_pressure_plate",
            () -> new ColoredPressurePlate(BlockSetType.PressurePlateSensitivity.EVERYTHING,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PRESSURE_PLATE).sound(SoundType.WOOD)
                            .lightLevel(litBlockEmission()), BlockSetType.OAK));
    public static final DeferredBlock<Block> COLORED_BAMBOO_BUTTON = registerBlockWithoutBlockItem("colored_bamboo_button",
            () -> new ColoredButton(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_BUTTON)
                    .lightLevel(litBlockEmission()).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));

    //Bamboo Mosaic
    public static final DeferredBlock<Block> COLORED_BAMBOO_MOSAIC = registerBlockWithoutBlockItem("colored_bamboo_mosaic",
            () -> new FlammableColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_MOSAIC).sound(SoundType.WOOD)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_BAMBOO_MOSAIC_SLAB = registerBlockWithoutBlockItem("colored_bamboo_mosaic_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_MOSAIC_SLAB).sound(SoundType.WOOD)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_BAMBOO_MOSAIC_STAIRS = registerBlockWithoutBlockItem("colored_bamboo_mosaic_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_BAMBOO_MOSAIC.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_MOSAIC_STAIRS).sound(SoundType.WOOD)
                        .lightLevel(litBlockEmission()));});
    public static final DeferredBlock<Block> COLORED_BAMBOO_MOSAIC_FENCE = registerBlockWithoutBlockItem("colored_bamboo_mosaic_fence",
            () -> new FlammableColoredFence(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_FENCE).sound(SoundType.WOOD).lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_BAMBOO_MOSAIC_FENCE_GATE = registerBlockWithoutBlockItem("colored_bamboo_mosaic_fence_gate",
            () -> new FlammableColoredFenceGate(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_FENCE_GATE).sound(SoundType.WOOD).lightLevel(litBlockEmission()),
                    SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<Block> COLORED_BAMBOO_MOSAIC_DOOR = registerBlockWithoutBlockItem("colored_bamboo_mosaic_door",
            () -> new ColoredDoor(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_DOOR).lightLevel(litBlockEmission()), BlockSetType.OAK));
    public static final DeferredBlock<Block> COLORED_BAMBOO_MOSAIC_TRAPDOOR = registerBlockWithoutBlockItem("colored_bamboo_mosaic_trapdoor",
            () -> new ColoredTrapDoor(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_TRAPDOOR).lightLevel(litBlockEmission()), BlockSetType.OAK));
    public static final DeferredBlock<Block> COLORED_BAMBOO_MOSAIC_PRESSURE_PLATE = registerBlockWithoutBlockItem("colored_bamboo_mosaic_pressure_plate",
            () -> new ColoredPressurePlate(BlockSetType.PressurePlateSensitivity.EVERYTHING,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PRESSURE_PLATE).sound(SoundType.WOOD)
                            .lightLevel(litBlockEmission()), BlockSetType.OAK));
    public static final DeferredBlock<Block> COLORED_BAMBOO_MOSAIC_BUTTON = registerBlockWithoutBlockItem("colored_bamboo_mosaic_button",
            () -> new ColoredButton(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_BUTTON)
                    .lightLevel(litBlockEmission()).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));





    //Colored Wood
    public static final DeferredBlock<Block> COLORED_SAPLING = registerBlockWithoutBlockItem("colored_sapling",
            () -> new ColoredSapling(CaveopolisTreeGrowers.WHITE_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING).lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_LOG = registerBlockWithoutBlockItem("colored_log",
            () -> new FlammableColoredLog(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_WOOD = registerBlockWithoutBlockItem("colored_wood",
            () -> new FlammableColoredLog(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> STRIPPED_COLORED_LOG = registerBlockWithoutBlockItem("stripped_colored_log",
            () -> new FlammableColoredLog(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG).lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> STRIPPED_COLORED_WOOD = registerBlockWithoutBlockItem("stripped_colored_wood",
            () -> new FlammableColoredLog(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD).lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_LEAVES = registerBlockWithoutBlockItem("colored_leaves",
            () -> new FlammableColoredLeaves(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).sound(SoundType.GRASS)
                    .noOcclusion().lightLevel(litBlockEmission()).isSuffocating((state, world, pos) -> false)));
    public static final DeferredBlock<Block> COLORED_PLANKS = registerBlockWithoutBlockItem("colored_planks",
            () -> new FlammableColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_PLANK_SLAB = registerBlockWithoutBlockItem("colored_plank_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB).sound(SoundType.WOOD)
                    .lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_PLANK_STAIRS = registerBlockWithoutBlockItem("colored_plank_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_PLANKS.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)
                        .lightLevel(litBlockEmission()));});
    public static final DeferredBlock<Block> COLORED_PLANK_PRESSURE_PLATE = registerBlockWithoutBlockItem("colored_plank_pressure_plate",
            () -> new ColoredPressurePlate(BlockSetType.PressurePlateSensitivity.EVERYTHING,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD)
                            .lightLevel(litBlockEmission()), BlockSetType.OAK));
    public static final DeferredBlock<Block> COLORED_PLANK_BUTTON = registerBlockWithoutBlockItem("colored_plank_button",
            () -> new ColoredButton(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)
                    .lightLevel(litBlockEmission()).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final DeferredBlock<Block> COLORED_PLANK_FENCE = registerBlockWithoutBlockItem("colored_plank_fence",
            () -> new FlammableColoredFence(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).sound(SoundType.WOOD).lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_PLANK_FENCE_GATE = registerBlockWithoutBlockItem("colored_plank_fence_gate",
            () -> new FlammableColoredFenceGate(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE).sound(SoundType.WOOD).lightLevel(litBlockEmission()),
                    SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<Block> COLORED_PLANK_DOOR = registerBlockWithoutBlockItem("colored_plank_door",
            () -> new ColoredDoor(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).lightLevel(litBlockEmission()), BlockSetType.OAK));
    public static final DeferredBlock<Block> COLORED_PLANK_TRAPDOOR = registerBlockWithoutBlockItem("colored_plank_trapdoor",
            () -> new ColoredTrapDoor(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).lightLevel(litBlockEmission()), BlockSetType.OAK));









    private static <T extends Block> DeferredBlock<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static ToIntFunction<BlockState> litBlockEmission() {
        return (blockState) -> blockState.getValue(BlockStateProperties.LIT) ? StartupConfig.litBlockEmission.get() : 0;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
