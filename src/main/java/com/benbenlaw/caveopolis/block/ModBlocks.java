package com.benbenlaw.caveopolis.block;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.crafting_table.StoneCraftingTableBlock;
import com.benbenlaw.caveopolis.block.custom.SprayerBlock;
import com.benbenlaw.caveopolis.block.custom.StoneTorchBlock;
import com.benbenlaw.caveopolis.block.custom.StoneWallTorchBlock;
import com.benbenlaw.caveopolis.item.ModCreativeModTab;
import com.benbenlaw.caveopolis.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Caveopolis.MOD_ID);

    //New Blocks

    public static final RegistryObject<Block> SPRAYER = registerBlock("sprayer",
            () -> new SprayerBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).sound(SoundType.METAL)));

    public static final RegistryObject<Block> STONE_CRAFTING_TABLE = registerBlock("stone_crafting_table",
            () -> new StoneCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE).strength(1f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> MOSSY_STONE = registerBlock("mossy_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.MOSS).strength(0.5f).sound(SoundType.MOSS)));

    public static final RegistryObject<Block> MIXED_STONE_ORE = registerBlock("mixed_stone_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_MIXED_STONE_ORE = registerBlock("deepslate_mixed_stone_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TOPROCK = registerBlock("toprock",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4.5f).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BRIGHT_STONE = registerBlock("bright_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(0.5f).sound(SoundType.STONE)
                    .lightLevel((state) -> 15)));

    public static final RegistryObject<Block> STONE_TORCH = BLOCKS.register("stone_torch",
            () -> new StoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).lightLevel((state) -> 14)));

    public static final RegistryObject<Block> STONE_WALL_TORCH = BLOCKS.register("stone_wall_torch",
            () -> new StoneWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.WALL_TORCH).lightLevel((state) -> 14).lootFrom(ModBlocks.STONE_TORCH)));




//Colored Stone


    public static final RegistryObject<Block> WHITE_COLORED_STONE = registerBlock("white_colored_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WHITE_COLORED_STONE_SLAB = registerBlock("white_colored_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WHITE_COLORED_STONE_STAIRS = registerBlock("white_colored_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WHITE_COLORED_STONE_WALL = registerBlock("white_colored_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final RegistryObject<Block> WHITE_COLORED_STONE_BRICKS = registerBlock("white_colored_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WHITE_COLORED_STONE_BRICK_SLAB = registerBlock("white_colored_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WHITE_COLORED_STONE_BRICK_STAIRS = registerBlock("white_colored_stone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_COLORED_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WHITE_COLORED_STONE_BRICK_WALL = registerBlock("white_colored_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));




    public static final RegistryObject<Block> BLACK_COLORED_STONE = registerBlock("black_colored_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_COLORED_STONE_SLAB = registerBlock("black_colored_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_COLORED_STONE_STAIRS = registerBlock("black_colored_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.BLACK_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_COLORED_STONE_WALL = registerBlock("black_colored_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> BLACK_COLORED_STONE_BRICKS = registerBlock("black_colored_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLACK_COLORED_STONE_BRICK_SLAB = registerBlock("black_colored_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_COLORED_STONE_BRICK_STAIRS = registerBlock("black_colored_stone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BLACK_COLORED_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_COLORED_STONE_BRICK_WALL = registerBlock("black_colored_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final RegistryObject<Block> RED_COLORED_STONE = registerBlock("red_colored_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_COLORED_STONE_SLAB = registerBlock("red_colored_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_COLORED_STONE_STAIRS = registerBlock("red_colored_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.RED_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_COLORED_STONE_WALL = registerBlock("red_colored_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_COLORED_STONE_BRICKS = registerBlock("red_colored_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_COLORED_STONE_BRICK_SLAB = registerBlock("red_colored_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_COLORED_STONE_BRICK_STAIRS = registerBlock("red_colored_stone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.RED_COLORED_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_COLORED_STONE_BRICK_WALL = registerBlock("red_colored_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));


    
    public static final RegistryObject<Block> YELLOW_COLORED_STONE = registerBlock("yellow_colored_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> YELLOW_COLORED_STONE_SLAB = registerBlock("yellow_colored_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> YELLOW_COLORED_STONE_STAIRS = registerBlock("yellow_colored_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.YELLOW_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> YELLOW_COLORED_STONE_WALL = registerBlock("yellow_colored_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> YELLOW_COLORED_STONE_BRICKS = registerBlock("yellow_colored_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> YELLOW_COLORED_STONE_BRICK_SLAB = registerBlock("yellow_colored_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> YELLOW_COLORED_STONE_BRICK_STAIRS = registerBlock("yellow_colored_stone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.YELLOW_COLORED_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> YELLOW_COLORED_STONE_BRICK_WALL = registerBlock("yellow_colored_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final RegistryObject<Block> BLUE_COLORED_STONE = registerBlock("blue_colored_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_COLORED_STONE_SLAB = registerBlock("blue_colored_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_COLORED_STONE_STAIRS = registerBlock("blue_colored_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.BLUE_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_COLORED_STONE_WALL = registerBlock("blue_colored_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_COLORED_STONE_BRICKS = registerBlock("blue_colored_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLUE_COLORED_STONE_BRICK_SLAB = registerBlock("blue_colored_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_COLORED_STONE_BRICK_STAIRS = registerBlock("blue_colored_stone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BLUE_COLORED_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_COLORED_STONE_BRICK_WALL = registerBlock("blue_colored_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final RegistryObject<Block> PINK_COLORED_STONE = registerBlock("pink_colored_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PINK_COLORED_STONE_SLAB = registerBlock("pink_colored_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PINK_COLORED_STONE_STAIRS = registerBlock("pink_colored_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PINK_COLORED_STONE_WALL = registerBlock("pink_colored_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PINK_COLORED_STONE_BRICKS = registerBlock("pink_colored_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PINK_COLORED_STONE_BRICK_SLAB = registerBlock("pink_colored_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PINK_COLORED_STONE_BRICK_STAIRS = registerBlock("pink_colored_stone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_COLORED_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PINK_COLORED_STONE_BRICK_WALL = registerBlock("pink_colored_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final RegistryObject<Block> PURPLE_COLORED_STONE = registerBlock("purple_colored_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PURPLE_COLORED_STONE_SLAB = registerBlock("purple_colored_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PURPLE_COLORED_STONE_STAIRS = registerBlock("purple_colored_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.PURPLE_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PURPLE_COLORED_STONE_WALL = registerBlock("purple_colored_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PURPLE_COLORED_STONE_BRICKS = registerBlock("purple_colored_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PURPLE_COLORED_STONE_BRICK_SLAB = registerBlock("purple_colored_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PURPLE_COLORED_STONE_BRICK_STAIRS = registerBlock("purple_colored_stone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.PURPLE_COLORED_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PURPLE_COLORED_STONE_BRICK_WALL = registerBlock("purple_colored_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final RegistryObject<Block> MAGENTA_COLORED_STONE = registerBlock("magenta_colored_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MAGENTA_COLORED_STONE_SLAB = registerBlock("magenta_colored_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MAGENTA_COLORED_STONE_STAIRS = registerBlock("magenta_colored_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.MAGENTA_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MAGENTA_COLORED_STONE_WALL = registerBlock("magenta_colored_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MAGENTA_COLORED_STONE_BRICKS = registerBlock("magenta_colored_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MAGENTA_COLORED_STONE_BRICK_SLAB = registerBlock("magenta_colored_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MAGENTA_COLORED_STONE_BRICK_STAIRS = registerBlock("magenta_colored_stone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MAGENTA_COLORED_STONE_BRICK_WALL = registerBlock("magenta_colored_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> LIGHT_BLUE_COLORED_STONE = registerBlock("light_blue_colored_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_BLUE_COLORED_STONE_SLAB = registerBlock("light_blue_colored_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_BLUE_COLORED_STONE_STAIRS = registerBlock("light_blue_colored_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_BLUE_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_BLUE_COLORED_STONE_WALL = registerBlock("light_blue_colored_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LIGHT_BLUE_COLORED_STONE_BRICKS = registerBlock("light_blue_colored_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIGHT_BLUE_COLORED_STONE_BRICK_SLAB = registerBlock("light_blue_colored_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_BLUE_COLORED_STONE_BRICK_STAIRS = registerBlock("light_blue_colored_stone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_BLUE_COLORED_STONE_BRICK_WALL = registerBlock("light_blue_colored_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final RegistryObject<Block> CYAN_COLORED_STONE = registerBlock("cyan_colored_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CYAN_COLORED_STONE_SLAB = registerBlock("cyan_colored_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CYAN_COLORED_STONE_STAIRS = registerBlock("cyan_colored_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.CYAN_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CYAN_COLORED_STONE_WALL = registerBlock("cyan_colored_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CYAN_COLORED_STONE_BRICKS = registerBlock("cyan_colored_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CYAN_COLORED_STONE_BRICK_SLAB = registerBlock("cyan_colored_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CYAN_COLORED_STONE_BRICK_STAIRS = registerBlock("cyan_colored_stone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CYAN_COLORED_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CYAN_COLORED_STONE_BRICK_WALL = registerBlock("cyan_colored_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final RegistryObject<Block> GRAY_COLORED_STONE = registerBlock("gray_colored_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAY_COLORED_STONE_SLAB = registerBlock("gray_colored_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAY_COLORED_STONE_STAIRS = registerBlock("gray_colored_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.GRAY_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAY_COLORED_STONE_WALL = registerBlock("gray_colored_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GRAY_COLORED_STONE_BRICKS = registerBlock("gray_colored_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRAY_COLORED_STONE_BRICK_SLAB = registerBlock("gray_colored_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAY_COLORED_STONE_BRICK_STAIRS = registerBlock("gray_colored_stone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.GRAY_COLORED_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAY_COLORED_STONE_BRICK_WALL = registerBlock("gray_colored_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> BROWN_COLORED_STONE = registerBlock("brown_colored_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BROWN_COLORED_STONE_SLAB = registerBlock("brown_colored_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BROWN_COLORED_STONE_STAIRS = registerBlock("brown_colored_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.BROWN_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BROWN_COLORED_STONE_WALL = registerBlock("brown_colored_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BROWN_COLORED_STONE_BRICKS = registerBlock("brown_colored_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BROWN_COLORED_STONE_BRICK_SLAB = registerBlock("brown_colored_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BROWN_COLORED_STONE_BRICK_STAIRS = registerBlock("brown_colored_stone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BROWN_COLORED_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BROWN_COLORED_STONE_BRICK_WALL = registerBlock("brown_colored_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final RegistryObject<Block> LIGHT_GRAY_COLORED_STONE = registerBlock("light_gray_colored_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_GRAY_COLORED_STONE_SLAB = registerBlock("light_gray_colored_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_GRAY_COLORED_STONE_STAIRS = registerBlock("light_gray_colored_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_GRAY_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_GRAY_COLORED_STONE_WALL = registerBlock("light_gray_colored_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LIGHT_GRAY_COLORED_STONE_BRICKS = registerBlock("light_gray_colored_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIGHT_GRAY_COLORED_STONE_BRICK_SLAB = registerBlock("light_gray_colored_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_GRAY_COLORED_STONE_BRICK_STAIRS = registerBlock("light_gray_colored_stone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_GRAY_COLORED_STONE_BRICK_WALL = registerBlock("light_gray_colored_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));





    public static final RegistryObject<Block> ORANGE_COLORED_STONE = registerBlock("orange_colored_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORANGE_COLORED_STONE_SLAB = registerBlock("orange_colored_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORANGE_COLORED_STONE_STAIRS = registerBlock("orange_colored_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.ORANGE_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORANGE_COLORED_STONE_WALL = registerBlock("orange_colored_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ORANGE_COLORED_STONE_BRICKS = registerBlock("orange_colored_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ORANGE_COLORED_STONE_BRICK_SLAB = registerBlock("orange_colored_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORANGE_COLORED_STONE_BRICK_STAIRS = registerBlock("orange_colored_stone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.ORANGE_COLORED_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORANGE_COLORED_STONE_BRICK_WALL = registerBlock("orange_colored_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final RegistryObject<Block> GREEN_COLORED_STONE = registerBlock("green_colored_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GREEN_COLORED_STONE_SLAB = registerBlock("green_colored_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GREEN_COLORED_STONE_STAIRS = registerBlock("green_colored_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.GREEN_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GREEN_COLORED_STONE_WALL = registerBlock("green_colored_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GREEN_COLORED_STONE_BRICKS = registerBlock("green_colored_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GREEN_COLORED_STONE_BRICK_SLAB = registerBlock("green_colored_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GREEN_COLORED_STONE_BRICK_STAIRS = registerBlock("green_colored_stone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.GREEN_COLORED_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GREEN_COLORED_STONE_BRICK_WALL = registerBlock("green_colored_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> LIME_COLORED_STONE = registerBlock("lime_colored_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIME_COLORED_STONE_SLAB = registerBlock("lime_colored_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIME_COLORED_STONE_STAIRS = registerBlock("lime_colored_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.LIME_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIME_COLORED_STONE_WALL = registerBlock("lime_colored_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LIME_COLORED_STONE_BRICKS = registerBlock("lime_colored_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIME_COLORED_STONE_BRICK_SLAB = registerBlock("lime_colored_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIME_COLORED_STONE_BRICK_STAIRS = registerBlock("lime_colored_stone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIME_COLORED_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIME_COLORED_STONE_BRICK_WALL = registerBlock("lime_colored_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> LIME_COLORED_BRIGHT_STONE = registerBlock("lime_colored_bright_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel((state) -> 15)));

    public static final RegistryObject<Block> GREEN_COLORED_BRIGHT_STONE = registerBlock("green_colored_bright_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel((state) -> 15)));

    public static final RegistryObject<Block> ORANGE_COLORED_BRIGHT_STONE = registerBlock("orange_colored_bright_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel((state) -> 15)));

    public static final RegistryObject<Block> WHITE_COLORED_BRIGHT_STONE = registerBlock("white_colored_bright_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel((state) -> 15)));

    public static final RegistryObject<Block> BLACK_COLORED_BRIGHT_STONE = registerBlock("black_colored_bright_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel((state) -> 15)));

    public static final RegistryObject<Block> RED_COLORED_BRIGHT_STONE = registerBlock("red_colored_bright_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel((state) -> 15)));

    public static final RegistryObject<Block> YELLOW_COLORED_BRIGHT_STONE = registerBlock("yellow_colored_bright_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel((state) -> 15)));

    public static final RegistryObject<Block> BLUE_COLORED_BRIGHT_STONE = registerBlock("blue_colored_bright_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel((state) -> 15)));

    public static final RegistryObject<Block> PINK_COLORED_BRIGHT_STONE = registerBlock("pink_colored_bright_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel((state) -> 15)));

    public static final RegistryObject<Block> PURPLE_COLORED_BRIGHT_STONE = registerBlock("purple_colored_bright_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel((state) -> 15)));

    public static final RegistryObject<Block> MAGENTA_COLORED_BRIGHT_STONE = registerBlock("magenta_colored_bright_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel((state) -> 15)));

    public static final RegistryObject<Block> LIGHT_BLUE_COLORED_BRIGHT_STONE = registerBlock("light_blue_colored_bright_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel((state) -> 15)));

    public static final RegistryObject<Block> CYAN_COLORED_BRIGHT_STONE = registerBlock("cyan_colored_bright_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel((state) -> 15)));

    public static final RegistryObject<Block> LIGHT_GRAY_COLORED_BRIGHT_STONE = registerBlock("light_gray_colored_bright_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel((state) -> 15)));

    public static final RegistryObject<Block> GRAY_COLORED_BRIGHT_STONE = registerBlock("gray_colored_bright_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel((state) -> 15)));

    public static final RegistryObject<Block> BROWN_COLORED_BRIGHT_STONE = registerBlock("brown_colored_bright_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel((state) -> 15)));


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, String tooltipKey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tooltipKey);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, String tooltipKey) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)){
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(Component.literal(tooltipKey));
            }
        });

    }








    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModTab.CAVEOPOLIS)));

    }





    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
