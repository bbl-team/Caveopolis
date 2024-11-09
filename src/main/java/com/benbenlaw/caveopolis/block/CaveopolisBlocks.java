package com.benbenlaw.caveopolis.block;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.core.block.colored.*;
import com.benbenlaw.core.block.flammable.*;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class CaveopolisBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Caveopolis.MOD_ID);

    //Colored Stone
    public static final DeferredBlock<Block> COLORED_STONE = registerBlockWithoutBlockItem("colored_stone",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission()).noOcclusion()));
    public static final DeferredBlock<Block> COLORED_STONE_SLAB = registerBlockWithoutBlockItem("colored_stone_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission()).noOcclusion()));
    public static final DeferredBlock<Block> COLORED_STONE_STAIRS = registerBlockWithoutBlockItem("colored_stone_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_STONE.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).sound(SoundType.STONE)
                        .lightLevel(litBlockEmission()).noOcclusion());});
    public static final DeferredBlock<Block> COLORED_STONE_WALL = registerBlockWithoutBlockItem("colored_stone_wall",
            () -> new ColoredWall(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission()).noOcclusion()));
    public static final DeferredBlock<Block> COLORED_STONE_PRESSURE_PLATE = registerBlockWithoutBlockItem("colored_stone_pressure_plate",
            () -> new ColoredPressurePlate(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE)
                            .lightLevel(litBlockEmission()), BlockSetType.STONE));
    public static final DeferredBlock<Block> COLORED_STONE_BUTTON = registerBlockWithoutBlockItem("colored_stone_button",
            () -> new ColoredButton(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)
                    .lightLevel(litBlockEmission()).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));

    //Colored Mosaic
    public static final DeferredBlock<Block> COLORED_MOSAIC = registerBlockWithoutBlockItem("colored_mosaic",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission()).noOcclusion()));
    public static final DeferredBlock<Block> COLORED_MOSAIC_SLAB = registerBlockWithoutBlockItem("colored_mosaic_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission()).noOcclusion()));
    public static final DeferredBlock<Block> COLORED_MOSAIC_STAIRS = registerBlockWithoutBlockItem("colored_mosaic_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_MOSAIC.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).sound(SoundType.STONE)
                        .lightLevel(litBlockEmission()).noOcclusion());});
    public static final DeferredBlock<Block> COLORED_MOSAIC_WALL = registerBlockWithoutBlockItem("colored_mosaic_wall",
            () -> new ColoredWall(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission()).noOcclusion()));
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
                    .lightLevel(litBlockEmission()).noOcclusion()));
    public static final DeferredBlock<Block> COLORED_CHAOTIC_SLAB = registerBlockWithoutBlockItem("colored_chaotic_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission()).noOcclusion()));
    public static final DeferredBlock<Block> COLORED_CHAOTIC_STAIRS = registerBlockWithoutBlockItem("colored_chaotic_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_CHAOTIC.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).sound(SoundType.STONE)
                        .lightLevel(litBlockEmission()).noOcclusion());});
    public static final DeferredBlock<Block> COLORED_CHAOTIC_WALL = registerBlockWithoutBlockItem("colored_chaotic_wall",
            () -> new ColoredWall(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission()).noOcclusion()));
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
                    .lightLevel(litBlockEmission()).noOcclusion()));
    public static final DeferredBlock<Block> COLORED_TRIPLE_SLAB = registerBlockWithoutBlockItem("colored_triple_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission()).noOcclusion()));
    public static final DeferredBlock<Block> COLORED_TRIPLE_STAIRS = registerBlockWithoutBlockItem("colored_triple_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_TRIPLE.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).sound(SoundType.STONE)
                        .lightLevel(litBlockEmission()).noOcclusion());});
    public static final DeferredBlock<Block> COLORED_TRIPLE_WALL = registerBlockWithoutBlockItem("colored_triple_wall",
            () -> new ColoredWall(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission()).noOcclusion()));
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
                    .lightLevel(litBlockEmission()).noOcclusion()));
    public static final DeferredBlock<Block> COLORED_BRAID_SLAB = registerBlockWithoutBlockItem("colored_braid_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission()).noOcclusion()));
    public static final DeferredBlock<Block> COLORED_BRAID_STAIRS = registerBlockWithoutBlockItem("colored_braid_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_BRAID.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).sound(SoundType.STONE)
                        .lightLevel(litBlockEmission()).noOcclusion());});
    public static final DeferredBlock<Block> COLORED_BRAID_WALL = registerBlockWithoutBlockItem("colored_braid_wall",
            () -> new ColoredWall(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission()).noOcclusion()));
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
                    .lightLevel(litBlockEmission()).noOcclusion()));
    public static final DeferredBlock<Block> COLORED_ENCASED_SLAB = registerBlockWithoutBlockItem("colored_encased_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission()).noOcclusion()));
    public static final DeferredBlock<Block> COLORED_ENCASED_STAIRS = registerBlockWithoutBlockItem("colored_encased_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_ENCASED.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).sound(SoundType.STONE)
                        .lightLevel(litBlockEmission()).noOcclusion());});
    public static final DeferredBlock<Block> COLORED_ENCASED_WALL = registerBlockWithoutBlockItem("colored_encased_wall",
            () -> new ColoredWall(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission()).noOcclusion()));
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
                    .lightLevel(litBlockEmission()).noOcclusion()));
    public static final DeferredBlock<Block> COLORED_ROAD_SLAB = registerBlockWithoutBlockItem("colored_road_slab",
            () -> new ColoredSlab(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission()).noOcclusion()));
    public static final DeferredBlock<Block> COLORED_ROAD_STAIRS = registerBlockWithoutBlockItem("colored_road_stairs",
            () -> {BlockState blockState = CaveopolisBlocks.COLORED_ROAD.get().defaultBlockState();
                return new ColoredStairs(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).sound(SoundType.STONE)
                        .lightLevel(litBlockEmission()).noOcclusion());});
    public static final DeferredBlock<Block> COLORED_ROAD_WALL = registerBlockWithoutBlockItem("colored_road_wall",
            () -> new ColoredWall(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission()).noOcclusion()));
    public static final DeferredBlock<Block> COLORED_ROAD_PRESSURE_PLATE = registerBlockWithoutBlockItem("colored_road_pressure_plate",
            () -> new ColoredPressurePlate(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE)
                            .lightLevel(litBlockEmission()), BlockSetType.STONE));
    public static final DeferredBlock<Block> COLORED_ROAD_BUTTON = registerBlockWithoutBlockItem("colored_road_button",
            () -> new ColoredButton(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)
                    .lightLevel(litBlockEmission()).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));



    //Colored Wood


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
                    .noOcclusion().lightLevel(litBlockEmission()).isSuffocating((state, world, pos) -> false)
            ));
    public static final DeferredBlock<Block> COLORED_PLANKS = registerBlockWithoutBlockItem("colored_planks",
            () -> new FlammableColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)
                    .lightLevel(litBlockEmission()).noOcclusion()));
    public static final DeferredBlock<Block> COLORED_PLANK_FENCE = registerBlockWithoutBlockItem("colored_plank_fence",
            () -> new FlammableColoredFence(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).sound(SoundType.WOOD).lightLevel(litBlockEmission())));
    public static final DeferredBlock<Block> COLORED_PLANK_FENCE_GATE = registerBlockWithoutBlockItem("colored_plank_fence_gate",
            () -> new FlammableColoredFenceGate(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE).sound(SoundType.WOOD).lightLevel(litBlockEmission()),
                    SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<Block> COLORED_PLANK_DOOR = registerBlockWithoutBlockItem("colored_plank_door",
            () -> new ColoredDoor(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).lightLevel(litBlockEmission()), BlockSetType.OAK));
    public static final DeferredBlock<Block> COLORED_PLANK_TRAPDOOR = registerBlockWithoutBlockItem("colored_plank_trapdoor",
            () -> new ColoredTrapDoor(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).lightLevel(litBlockEmission()), BlockSetType.OAK));





    public static final DeferredBlock<Block> COLORED_BRICKS = registerBlockWithoutBlockItem("colored_bricks",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission()).noOcclusion()));
    public static final DeferredBlock<Block> COLORED_STONE_BRICKS = registerBlockWithoutBlockItem("colored_stone_bricks",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission()).noOcclusion()));
    public static final DeferredBlock<Block> COLORED_DIRT = registerBlockWithoutBlockItem("colored_dirt",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)
                    .lightLevel(litBlockEmission()).noOcclusion()));
    public static final DeferredBlock<Block> COLORED_COBBLESTONE = registerBlockWithoutBlockItem("colored_cobblestone",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission()).noOcclusion()));
    public static final DeferredBlock<Block> COLORED_COBBLESTONE_BRICKS = registerBlockWithoutBlockItem("colored_cobblestone_bricks",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission()).noOcclusion()));
    public static final DeferredBlock<Block> COLORED_MARBLE = registerBlockWithoutBlockItem("colored_marble",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission()).noOcclusion()));
    public static final DeferredBlock<Block> COLORED_MARBLE_BRICKS = registerBlockWithoutBlockItem("colored_marble_bricks",
            () -> new ColoredBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission()).noOcclusion()));






    private static <T extends Block> DeferredBlock<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return (DeferredBlock<T>) BLOCKS.register(name, block);
    }

    private static ToIntFunction<BlockState> litBlockEmission() {
        return (blockState) -> blockState.getValue(BlockStateProperties.LIT) ? 15 : 0;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
