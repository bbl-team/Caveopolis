package com.benbenlaw.caveopolis.block;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.custom.ColoredCavesPortalBlock;
import com.benbenlaw.caveopolis.block.custom.SprayerBlock;
import com.benbenlaw.caveopolis.block.custom.StoneTorchBlock;
import com.benbenlaw.caveopolis.block.custom.StoneWallTorchBlock;
import com.benbenlaw.caveopolis.block.custom.brightblock.*;
import com.benbenlaw.caveopolis.block.custom.sign.black.BlackHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.black.BlackStandingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.black.BlackWallHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.black.BlackWallSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.blue.BlueHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.blue.BlueStandingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.blue.BlueWallHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.blue.BlueWallSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.brown.BrownHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.brown.BrownStandingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.brown.BrownWallHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.brown.BrownWallSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.cyan.CyanHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.cyan.CyanStandingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.cyan.CyanWallHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.cyan.CyanWallSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.gray.GrayHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.gray.GrayStandingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.gray.GrayWallHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.gray.GrayWallSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.green.GreenHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.green.GreenStandingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.green.GreenWallHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.green.GreenWallSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.light_blue.LightBlueHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.light_blue.LightBlueStandingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.light_blue.LightBlueWallHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.light_blue.LightBlueWallSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.light_gray.LightGrayHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.light_gray.LightGrayStandingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.light_gray.LightGrayWallHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.light_gray.LightGrayWallSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.lime.LimeHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.lime.LimeStandingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.lime.LimeWallHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.lime.LimeWallSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.magenta.MagentaHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.magenta.MagentaStandingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.magenta.MagentaWallHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.magenta.MagentaWallSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.orange.OrangeHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.orange.OrangeStandingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.orange.OrangeWallHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.orange.OrangeWallSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.pink.PinkHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.pink.PinkStandingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.pink.PinkWallHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.pink.PinkWallSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.purple.PurpleHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.purple.PurpleStandingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.purple.PurpleWallHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.purple.PurpleWallSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.red.RedHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.red.RedStandingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.red.RedWallHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.red.RedWallSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.white.WhiteHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.white.WhiteStandingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.white.WhiteWallHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.white.WhiteWallSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.yellow.YellowHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.yellow.YellowStandingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.yellow.YellowWallHangingSignBlock;
import com.benbenlaw.caveopolis.block.custom.sign.yellow.YellowWallSignBlock;
import com.benbenlaw.caveopolis.block.custom.torches.*;
import com.benbenlaw.caveopolis.item.ModItems;
import com.benbenlaw.caveopolis.util.ModWoodTypes;
import com.benbenlaw.caveopolis.worldgen.ModConfiguredFeatures;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Optional;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.createBlocks(Caveopolis.MOD_ID);

    //New Blocks



    public static final DeferredBlock<Block> BLUE_TORCH = registerBlockWithoutBlockItem("blue_torch",
            () -> new BlueTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH).lightLevel((state) -> 14)));

    public static final DeferredBlock<Block> BLUE_WALL_TORCH = registerBlockWithoutBlockItem("blue_wall_torch",
            () -> new BlueWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).lightLevel((state) -> 14).lootFrom(ModBlocks.BLUE_TORCH)));

    public static final DeferredBlock<Block> RED_TORCH = registerBlockWithoutBlockItem("red_torch",
            () -> new RedTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH).lightLevel((state) -> 14)));

    public static final DeferredBlock<Block> RED_WALL_TORCH = registerBlockWithoutBlockItem("red_wall_torch",
            () -> new RedWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).lightLevel((state) -> 14).lootFrom(ModBlocks.RED_TORCH)));

    public static final DeferredBlock<Block> GREEN_TORCH = registerBlockWithoutBlockItem("green_torch",
            () -> new GreenTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH).lightLevel((state) -> 14)));

    public static final DeferredBlock<Block> GREEN_WALL_TORCH = registerBlockWithoutBlockItem("green_wall_torch",
            () -> new GreenWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).lightLevel((state) -> 14).lootFrom(ModBlocks.GREEN_TORCH)));

    public static final DeferredBlock<Block> BLACK_TORCH = registerBlockWithoutBlockItem("black_torch",
            () -> new BlackTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH).lightLevel((state) -> 14)));

    public static final DeferredBlock<Block> BLACK_WALL_TORCH = registerBlockWithoutBlockItem("black_wall_torch",
            () -> new BlackWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).lightLevel((state) -> 14).lootFrom(ModBlocks.BLACK_TORCH)));

    public static final DeferredBlock<Block> WHITE_TORCH = registerBlockWithoutBlockItem("white_torch",
            () -> new WhiteTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH).lightLevel((state) -> 14)));

    public static final DeferredBlock<Block> WHITE_WALL_TORCH = registerBlockWithoutBlockItem("white_wall_torch",
            () -> new WhiteWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).lightLevel((state) -> 14).lootFrom(ModBlocks.WHITE_TORCH)));

    public static final DeferredBlock<Block> YELLOW_TORCH = registerBlockWithoutBlockItem("yellow_torch",
            () -> new YellowTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH).lightLevel((state) -> 14)));

    public static final DeferredBlock<Block> YELLOW_WALL_TORCH = registerBlockWithoutBlockItem("yellow_wall_torch",
            () -> new YellowWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).lightLevel((state) -> 14).lootFrom(ModBlocks.YELLOW_TORCH)));

    public static final DeferredBlock<Block> ORANGE_TORCH = registerBlockWithoutBlockItem("orange_torch",
            () -> new OrangeTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH).lightLevel((state) -> 14)));

    public static final DeferredBlock<Block> ORANGE_WALL_TORCH = registerBlockWithoutBlockItem("orange_wall_torch",
            () -> new OrangeWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).lightLevel((state) -> 14).lootFrom(ModBlocks.ORANGE_TORCH)));

    public static final DeferredBlock<Block> BROWN_TORCH = registerBlockWithoutBlockItem("brown_torch",
            () -> new BrownTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH).lightLevel((state) -> 14)));

    public static final  DeferredBlock<Block> BROWN_WALL_TORCH = registerBlockWithoutBlockItem("brown_wall_torch",
            () -> new BrownWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).lightLevel((state) -> 14).lootFrom(ModBlocks.BROWN_TORCH)));

    public static final DeferredBlock<Block> LIME_TORCH = registerBlockWithoutBlockItem("lime_torch",
            () -> new LimeTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH).lightLevel((state) -> 14)));

    public static final DeferredBlock<Block>  LIME_WALL_TORCH = registerBlockWithoutBlockItem("lime_wall_torch",
            () -> new LimeWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).lightLevel((state) -> 14).lootFrom(ModBlocks.LIME_TORCH)));

    public static final  DeferredBlock<Block> MAGENTA_TORCH = registerBlockWithoutBlockItem("magenta_torch",
            () -> new MagentaTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH).lightLevel((state) -> 14)));

    public static final  DeferredBlock<Block> MAGENTA_WALL_TORCH = registerBlockWithoutBlockItem("magenta_wall_torch",
            () -> new MagentaWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).lightLevel((state) -> 14).lootFrom(ModBlocks.MAGENTA_TORCH)));

    public static final  DeferredBlock<Block> LIGHT_BLUE_TORCH = registerBlockWithoutBlockItem("light_blue_torch",
            () -> new LightBlueTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH).lightLevel((state) -> 14)));

    public static final  DeferredBlock<Block> LIGHT_BLUE_WALL_TORCH = registerBlockWithoutBlockItem("light_blue_wall_torch",
            () -> new LightBlueWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).lightLevel((state) -> 14).lootFrom(ModBlocks.LIGHT_BLUE_TORCH)));

    public static final  DeferredBlock<Block> CYAN_TORCH = registerBlockWithoutBlockItem("cyan_torch",
            () -> new CyanTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH).lightLevel((state) -> 14)));

    public static final  DeferredBlock<Block> CYAN_WALL_TORCH = registerBlockWithoutBlockItem("cyan_wall_torch",
            () -> new CyanWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).lightLevel((state) -> 14).lootFrom(ModBlocks.CYAN_TORCH)));

    public static final  DeferredBlock<Block> PURPLE_TORCH = registerBlockWithoutBlockItem("purple_torch",
            () -> new PurpleTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH).lightLevel((state) -> 14)));

    public static final  DeferredBlock<Block> PURPLE_WALL_TORCH = registerBlockWithoutBlockItem("purple_wall_torch",
            () -> new PurpleWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).lightLevel((state) -> 14).lootFrom(ModBlocks.PURPLE_TORCH)));

    public static final  DeferredBlock<Block> GRAY_TORCH = registerBlockWithoutBlockItem("gray_torch",
            () -> new GrayTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH).lightLevel((state) -> 14)));

    public static final  DeferredBlock<Block> GRAY_WALL_TORCH = registerBlockWithoutBlockItem("gray_wall_torch",
            () -> new GrayWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).lightLevel((state) -> 14).lootFrom(ModBlocks.GRAY_TORCH)));

    public static final  DeferredBlock<Block> LIGHT_GRAY_TORCH = registerBlockWithoutBlockItem("light_gray_torch",
            () -> new LightGrayTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH).lightLevel((state) -> 14)));

    public static final  DeferredBlock<Block> LIGHT_GRAY_WALL_TORCH = registerBlockWithoutBlockItem("light_gray_wall_torch",
            () -> new LightGrayWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).lightLevel((state) -> 14).lootFrom(ModBlocks.LIGHT_GRAY_TORCH)));

    public static final  DeferredBlock<Block> PINK_TORCH = registerBlockWithoutBlockItem("pink_torch",
            () -> new PinkTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH).lightLevel((state) -> 14)));

    public static final DeferredBlock<Block> PINK_WALL_TORCH = registerBlockWithoutBlockItem("pink_wall_torch",
            () -> new PinkWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).lightLevel((state) -> 14).lootFrom(ModBlocks.PINK_TORCH)));


    public static final DeferredBlock<Block> COLORED_CAVES_PORTAL = registerBlock("colored_caves_portal",
            () -> new ColoredCavesPortalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).strength(1f).sound(SoundType.METAL)));

    public static final DeferredBlock<Block> SPRAYER = registerBlock("sprayer",
            () -> new SprayerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).strength(1f).sound(SoundType.METAL)));

    public static final DeferredBlock<Block> STONE_CRAFTING_TABLE = registerBlock("stone_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE)));


    public static final DeferredBlock<Block> MIXED_STONE_ORE = registerBlock("mixed_stone_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DEEPSLATE_MIXED_STONE_ORE = registerBlock("deepslate_mixed_stone_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> STONE_TORCH = registerBlockWithoutBlockItem("stone_torch",
            () -> new StoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH).lightLevel((state) -> 14)));

    public static final DeferredHolder<Block, StoneWallTorchBlock> STONE_WALL_TORCH = BLOCKS.register("stone_wall_torch",
            () -> new StoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).lightLevel((state) -> 14).lootFrom(ModBlocks.STONE_TORCH)));

    public static final DeferredBlock<Block> BRIGHT_STONE_ORE = registerBlock("bright_stone_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1.5F, 6.0F).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DEEPSLATE_BRIGHT_STONE_ORE = registerBlock("deepslate_bright_stone_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));

    //Colored Stone

    public static final DeferredBlock<Block> WHITE_DIRT = registerBlock("white_dirt",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)
                    .lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> ORANGE_DIRT = registerBlock("orange_dirt",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)
                    .lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> MAGENTA_DIRT = registerBlock("magenta_dirt",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)
                    .lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> LIGHT_BLUE_DIRT = registerBlock("light_blue_dirt",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)
                    .lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> YELLOW_DIRT = registerBlock("yellow_dirt",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)
                    .lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> LIME_DIRT = registerBlock("lime_dirt",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)
                    .lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> PINK_DIRT = registerBlock("pink_dirt",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)
                    .lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> BLACK_DIRT = registerBlock("black_dirt",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)
                    .lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> RED_DIRT = registerBlock("red_dirt",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)
                    .lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> BLUE_DIRT = registerBlock("blue_dirt",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)
                    .lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> GREEN_DIRT = registerBlock("green_dirt",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)
                    .lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> CYAN_DIRT = registerBlock("cyan_dirt",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)
                    .lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> LIGHT_GRAY_DIRT = registerBlock("light_gray_dirt",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)
                    .lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> GRAY_DIRT = registerBlock("gray_dirt",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)
                    .lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> BROWN_DIRT = registerBlock("brown_dirt",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)
                    .lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> PURPLE_DIRT = registerBlock("purple_dirt",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)
                    .lightLevel(litBlockEmission(15))));











    //Colored Stone


    public static final DeferredBlock<Block> WHITE_COLORED_STONE = registerBlock("white_colored_stone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> WHITE_COLORED_STONE_SLAB = registerBlock("white_colored_stone_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> WHITE_COLORED_STONE_STAIRS = registerBlock("white_colored_stone_stairs",
            () -> {BlockState blockState = ModBlocks.WHITE_COLORED_STONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> WHITE_COLORED_STONE_WALL = registerBlock("white_colored_stone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final DeferredBlock<Block> WHITE_COLORED_STONE_BRICKS = registerBlock("white_colored_stone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> WHITE_COLORED_STONE_BRICK_SLAB = registerBlock("white_colored_stone_brick_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> WHITE_COLORED_STONE_BRICK_STAIRS = registerBlock("white_colored_stone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.WHITE_COLORED_STONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> WHITE_COLORED_STONE_BRICK_WALL = registerBlock("white_colored_stone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));




    public static final DeferredBlock<Block> BLACK_COLORED_STONE = registerBlock("black_colored_stone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLACK_COLORED_STONE_SLAB = registerBlock("black_colored_stone_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLACK_COLORED_STONE_STAIRS = registerBlock("black_colored_stone_stairs",
            () -> {BlockState blockState = ModBlocks.BLACK_COLORED_STONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> BLACK_COLORED_STONE_WALL = registerBlock("black_colored_stone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    
    public static final DeferredBlock<Block> BLACK_COLORED_STONE_BRICKS = registerBlock("black_colored_stone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLACK_COLORED_STONE_BRICK_SLAB = registerBlock("black_colored_stone_brick_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLACK_COLORED_STONE_BRICK_STAIRS = registerBlock("black_colored_stone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.BLACK_COLORED_STONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> BLACK_COLORED_STONE_BRICK_WALL = registerBlock("black_colored_stone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final DeferredBlock<Block> RED_COLORED_STONE = registerBlock("red_colored_stone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> RED_COLORED_STONE_SLAB = registerBlock("red_colored_stone_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> RED_COLORED_STONE_STAIRS = registerBlock("red_colored_stone_stairs",
            () -> {BlockState blockState = ModBlocks.RED_COLORED_STONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> RED_COLORED_STONE_WALL = registerBlock("red_colored_stone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> RED_COLORED_STONE_BRICKS = registerBlock("red_colored_stone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> RED_COLORED_STONE_BRICK_SLAB = registerBlock("red_colored_stone_brick_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> RED_COLORED_STONE_BRICK_STAIRS = registerBlock("red_colored_stone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.RED_COLORED_STONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> RED_COLORED_STONE_BRICK_WALL = registerBlock("red_colored_stone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));


    
    public static final DeferredBlock<Block> YELLOW_COLORED_STONE = registerBlock("yellow_colored_stone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> YELLOW_COLORED_STONE_SLAB = registerBlock("yellow_colored_stone_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> YELLOW_COLORED_STONE_STAIRS = registerBlock("yellow_colored_stone_stairs",
            () -> {BlockState blockState = ModBlocks.YELLOW_COLORED_STONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> YELLOW_COLORED_STONE_WALL = registerBlock("yellow_colored_stone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> YELLOW_COLORED_STONE_BRICKS = registerBlock("yellow_colored_stone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> YELLOW_COLORED_STONE_BRICK_SLAB = registerBlock("yellow_colored_stone_brick_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> YELLOW_COLORED_STONE_BRICK_STAIRS = registerBlock("yellow_colored_stone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.YELLOW_COLORED_STONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> YELLOW_COLORED_STONE_BRICK_WALL = registerBlock("yellow_colored_stone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final DeferredBlock<Block> BLUE_COLORED_STONE = registerBlock("blue_colored_stone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLUE_COLORED_STONE_SLAB = registerBlock("blue_colored_stone_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLUE_COLORED_STONE_STAIRS = registerBlock("blue_colored_stone_stairs",
            () -> {BlockState blockState = ModBlocks.BLUE_COLORED_STONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> BLUE_COLORED_STONE_WALL = registerBlock("blue_colored_stone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> BLUE_COLORED_STONE_BRICKS = registerBlock("blue_colored_stone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLUE_COLORED_STONE_BRICK_SLAB = registerBlock("blue_colored_stone_brick_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLUE_COLORED_STONE_BRICK_STAIRS = registerBlock("blue_colored_stone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.BLUE_COLORED_STONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> BLUE_COLORED_STONE_BRICK_WALL = registerBlock("blue_colored_stone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final DeferredBlock<Block> PINK_COLORED_STONE = registerBlock("pink_colored_stone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PINK_COLORED_STONE_SLAB = registerBlock("pink_colored_stone_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PINK_COLORED_STONE_STAIRS = registerBlock("pink_colored_stone_stairs",
            () -> {BlockState blockState = ModBlocks.PINK_COLORED_STONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> PINK_COLORED_STONE_WALL = registerBlock("pink_colored_stone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> PINK_COLORED_STONE_BRICKS = registerBlock("pink_colored_stone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PINK_COLORED_STONE_BRICK_SLAB = registerBlock("pink_colored_stone_brick_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PINK_COLORED_STONE_BRICK_STAIRS = registerBlock("pink_colored_stone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.PINK_COLORED_STONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> PINK_COLORED_STONE_BRICK_WALL = registerBlock("pink_colored_stone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final DeferredBlock<Block> PURPLE_COLORED_STONE = registerBlock("purple_colored_stone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PURPLE_COLORED_STONE_SLAB = registerBlock("purple_colored_stone_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PURPLE_COLORED_STONE_STAIRS = registerBlock("purple_colored_stone_stairs",
            () -> {BlockState blockState = ModBlocks.PURPLE_COLORED_STONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> PURPLE_COLORED_STONE_WALL = registerBlock("purple_colored_stone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> PURPLE_COLORED_STONE_BRICKS = registerBlock("purple_colored_stone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PURPLE_COLORED_STONE_BRICK_SLAB = registerBlock("purple_colored_stone_brick_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PURPLE_COLORED_STONE_BRICK_STAIRS = registerBlock("purple_colored_stone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.PURPLE_COLORED_STONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> PURPLE_COLORED_STONE_BRICK_WALL = registerBlock("purple_colored_stone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final DeferredBlock<Block> MAGENTA_COLORED_STONE = registerBlock("magenta_colored_stone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MAGENTA_COLORED_STONE_SLAB = registerBlock("magenta_colored_stone_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MAGENTA_COLORED_STONE_STAIRS = registerBlock("magenta_colored_stone_stairs",
            () -> {BlockState blockState = ModBlocks.MAGENTA_COLORED_STONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> MAGENTA_COLORED_STONE_WALL = registerBlock("magenta_colored_stone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> MAGENTA_COLORED_STONE_BRICKS = registerBlock("magenta_colored_stone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MAGENTA_COLORED_STONE_BRICK_SLAB = registerBlock("magenta_colored_stone_brick_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MAGENTA_COLORED_STONE_BRICK_STAIRS = registerBlock("magenta_colored_stone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> MAGENTA_COLORED_STONE_BRICK_WALL = registerBlock("magenta_colored_stone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));


    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_STONE = registerBlock("light_blue_colored_stone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_STONE_SLAB = registerBlock("light_blue_colored_stone_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_STONE_STAIRS = registerBlock("light_blue_colored_stone_stairs",
            () -> {BlockState blockState = ModBlocks.LIGHT_BLUE_COLORED_STONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_STONE_WALL = registerBlock("light_blue_colored_stone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_STONE_BRICKS = registerBlock("light_blue_colored_stone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_STONE_BRICK_SLAB = registerBlock("light_blue_colored_stone_brick_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_STONE_BRICK_STAIRS = registerBlock("light_blue_colored_stone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_STONE_BRICK_WALL = registerBlock("light_blue_colored_stone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final DeferredBlock<Block> CYAN_COLORED_STONE = registerBlock("cyan_colored_stone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CYAN_COLORED_STONE_SLAB = registerBlock("cyan_colored_stone_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CYAN_COLORED_STONE_STAIRS = registerBlock("cyan_colored_stone_stairs",
            () -> {BlockState blockState = ModBlocks.CYAN_COLORED_STONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> CYAN_COLORED_STONE_WALL = registerBlock("cyan_colored_stone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> CYAN_COLORED_STONE_BRICKS = registerBlock("cyan_colored_stone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CYAN_COLORED_STONE_BRICK_SLAB = registerBlock("cyan_colored_stone_brick_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CYAN_COLORED_STONE_BRICK_STAIRS = registerBlock("cyan_colored_stone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.CYAN_COLORED_STONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> CYAN_COLORED_STONE_BRICK_WALL = registerBlock("cyan_colored_stone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final DeferredBlock<Block> GRAY_COLORED_STONE = registerBlock("gray_colored_stone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> GRAY_COLORED_STONE_SLAB = registerBlock("gray_colored_stone_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> GRAY_COLORED_STONE_STAIRS = registerBlock("gray_colored_stone_stairs",
            () -> {BlockState blockState = ModBlocks.GRAY_COLORED_STONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> GRAY_COLORED_STONE_WALL = registerBlock("gray_colored_stone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> GRAY_COLORED_STONE_BRICKS = registerBlock("gray_colored_stone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> GRAY_COLORED_STONE_BRICK_SLAB = registerBlock("gray_colored_stone_brick_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> GRAY_COLORED_STONE_BRICK_STAIRS = registerBlock("gray_colored_stone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.GRAY_COLORED_STONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> GRAY_COLORED_STONE_BRICK_WALL = registerBlock("gray_colored_stone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));


    public static final DeferredBlock<Block> BROWN_COLORED_STONE = registerBlock("brown_colored_stone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BROWN_COLORED_STONE_SLAB = registerBlock("brown_colored_stone_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BROWN_COLORED_STONE_STAIRS = registerBlock("brown_colored_stone_stairs",
            () -> {BlockState blockState = ModBlocks.BROWN_COLORED_STONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> BROWN_COLORED_STONE_WALL = registerBlock("brown_colored_stone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> BROWN_COLORED_STONE_BRICKS = registerBlock("brown_colored_stone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BROWN_COLORED_STONE_BRICK_SLAB = registerBlock("brown_colored_stone_brick_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BROWN_COLORED_STONE_BRICK_STAIRS = registerBlock("brown_colored_stone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.BROWN_COLORED_STONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> BROWN_COLORED_STONE_BRICK_WALL = registerBlock("brown_colored_stone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_STONE = registerBlock("light_gray_colored_stone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_STONE_SLAB = registerBlock("light_gray_colored_stone_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_STONE_STAIRS = registerBlock("light_gray_colored_stone_stairs",
            () -> {BlockState blockState = ModBlocks.LIGHT_GRAY_COLORED_STONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_STONE_WALL = registerBlock("light_gray_colored_stone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_STONE_BRICKS = registerBlock("light_gray_colored_stone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_STONE_BRICK_SLAB = registerBlock("light_gray_colored_stone_brick_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_STONE_BRICK_STAIRS = registerBlock("light_gray_colored_stone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_STONE_BRICK_WALL = registerBlock("light_gray_colored_stone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));





    public static final DeferredBlock<Block> ORANGE_COLORED_STONE = registerBlock("orange_colored_stone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> ORANGE_COLORED_STONE_SLAB = registerBlock("orange_colored_stone_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> ORANGE_COLORED_STONE_STAIRS = registerBlock("orange_colored_stone_stairs",
            () -> {BlockState blockState = ModBlocks.ORANGE_COLORED_STONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> ORANGE_COLORED_STONE_WALL = registerBlock("orange_colored_stone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> ORANGE_COLORED_STONE_BRICKS = registerBlock("orange_colored_stone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> ORANGE_COLORED_STONE_BRICK_SLAB = registerBlock("orange_colored_stone_brick_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> ORANGE_COLORED_STONE_BRICK_STAIRS = registerBlock("orange_colored_stone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.ORANGE_COLORED_STONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> ORANGE_COLORED_STONE_BRICK_WALL = registerBlock("orange_colored_stone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final DeferredBlock<Block> GREEN_COLORED_STONE = registerBlock("green_colored_stone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> GREEN_COLORED_STONE_SLAB = registerBlock("green_colored_stone_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> GREEN_COLORED_STONE_STAIRS = registerBlock("green_colored_stone_stairs",
            () -> {BlockState blockState = ModBlocks.GREEN_COLORED_STONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> GREEN_COLORED_STONE_WALL = registerBlock("green_colored_stone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> GREEN_COLORED_STONE_BRICKS = registerBlock("green_colored_stone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> GREEN_COLORED_STONE_BRICK_SLAB = registerBlock("green_colored_stone_brick_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> GREEN_COLORED_STONE_BRICK_STAIRS = registerBlock("green_colored_stone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.GREEN_COLORED_STONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> GREEN_COLORED_STONE_BRICK_WALL = registerBlock("green_colored_stone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));


    public static final DeferredBlock<Block> LIME_COLORED_STONE = registerBlock("lime_colored_stone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> LIME_COLORED_STONE_SLAB = registerBlock("lime_colored_stone_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> LIME_COLORED_STONE_STAIRS = registerBlock("lime_colored_stone_stairs",
            () -> {BlockState blockState = ModBlocks.LIME_COLORED_STONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> LIME_COLORED_STONE_WALL = registerBlock("lime_colored_stone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> LIME_COLORED_STONE_BRICKS = registerBlock("lime_colored_stone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> LIME_COLORED_STONE_BRICK_SLAB = registerBlock("lime_colored_stone_brick_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> LIME_COLORED_STONE_BRICK_STAIRS = registerBlock("lime_colored_stone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.LIME_COLORED_STONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> LIME_COLORED_STONE_BRICK_WALL = registerBlock("lime_colored_stone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    
//Colored Cobblestone


    public static final DeferredBlock<Block> WHITE_COLORED_COBBLESTONE = registerBlock("white_colored_cobblestone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> WHITE_COLORED_COBBLESTONE_SLAB = registerBlock("white_colored_cobblestone_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> WHITE_COLORED_COBBLESTONE_STAIRS = registerBlock("white_colored_cobblestone_stairs",
            () -> {BlockState blockState = ModBlocks.WHITE_COLORED_COBBLESTONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> WHITE_COLORED_COBBLESTONE_WALL = registerBlock("white_colored_cobblestone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final DeferredBlock<Block> WHITE_COLORED_COBBLESTONE_BRICKS = registerBlock("white_colored_cobblestone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> WHITE_COLORED_COBBLESTONE_BRICK_SLAB = registerBlock("white_colored_cobblestone_brick_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> WHITE_COLORED_COBBLESTONE_BRICK_STAIRS = registerBlock("white_colored_cobblestone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.WHITE_COLORED_COBBLESTONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> WHITE_COLORED_COBBLESTONE_BRICK_WALL = registerBlock("white_colored_cobblestone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));




    public static final DeferredBlock<Block> BLACK_COLORED_COBBLESTONE = registerBlock("black_colored_cobblestone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLACK_COLORED_COBBLESTONE_SLAB = registerBlock("black_colored_cobblestone_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> BLACK_COLORED_COBBLESTONE_STAIRS = registerBlock("black_colored_cobblestone_stairs",
            () -> {BlockState blockState = ModBlocks.BLACK_COLORED_COBBLESTONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> BLACK_COLORED_COBBLESTONE_WALL = registerBlock("black_colored_cobblestone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    
    public static final DeferredBlock<Block> BLACK_COLORED_COBBLESTONE_BRICKS = registerBlock("black_colored_cobblestone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLACK_COLORED_COBBLESTONE_BRICK_SLAB = registerBlock("black_colored_cobblestone_brick_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> BLACK_COLORED_COBBLESTONE_BRICK_STAIRS = registerBlock("black_colored_cobblestone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.BLACK_COLORED_COBBLESTONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> BLACK_COLORED_COBBLESTONE_BRICK_WALL = registerBlock("black_colored_cobblestone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final DeferredBlock<Block> RED_COLORED_COBBLESTONE = registerBlock("red_colored_cobblestone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> RED_COLORED_COBBLESTONE_SLAB = registerBlock("red_colored_cobblestone_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> RED_COLORED_COBBLESTONE_STAIRS = registerBlock("red_colored_cobblestone_stairs",
            () -> {BlockState blockState = ModBlocks.RED_COLORED_COBBLESTONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> RED_COLORED_COBBLESTONE_WALL = registerBlock("red_colored_cobblestone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> RED_COLORED_COBBLESTONE_BRICKS = registerBlock("red_colored_cobblestone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> RED_COLORED_COBBLESTONE_BRICK_SLAB = registerBlock("red_colored_cobblestone_brick_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> RED_COLORED_COBBLESTONE_BRICK_STAIRS = registerBlock("red_colored_cobblestone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.RED_COLORED_COBBLESTONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> RED_COLORED_COBBLESTONE_BRICK_WALL = registerBlock("red_colored_cobblestone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));


    
    public static final DeferredBlock<Block> YELLOW_COLORED_COBBLESTONE = registerBlock("yellow_colored_cobblestone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> YELLOW_COLORED_COBBLESTONE_SLAB = registerBlock("yellow_colored_cobblestone_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> YELLOW_COLORED_COBBLESTONE_STAIRS = registerBlock("yellow_colored_cobblestone_stairs",
            () -> {BlockState blockState = ModBlocks.YELLOW_COLORED_COBBLESTONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> YELLOW_COLORED_COBBLESTONE_WALL = registerBlock("yellow_colored_cobblestone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> YELLOW_COLORED_COBBLESTONE_BRICKS = registerBlock("yellow_colored_cobblestone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> YELLOW_COLORED_COBBLESTONE_BRICK_SLAB = registerBlock("yellow_colored_cobblestone_brick_slab",
                    () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> YELLOW_COLORED_COBBLESTONE_BRICK_STAIRS = registerBlock("yellow_colored_cobblestone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> YELLOW_COLORED_COBBLESTONE_BRICK_WALL = registerBlock("yellow_colored_cobblestone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final DeferredBlock<Block> BLUE_COLORED_COBBLESTONE = registerBlock("blue_colored_cobblestone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLUE_COLORED_COBBLESTONE_SLAB = registerBlock("blue_colored_cobblestone_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> BLUE_COLORED_COBBLESTONE_STAIRS = registerBlock("blue_colored_cobblestone_stairs",
            () -> {BlockState blockState = ModBlocks.BLUE_COLORED_COBBLESTONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> BLUE_COLORED_COBBLESTONE_WALL = registerBlock("blue_colored_cobblestone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> BLUE_COLORED_COBBLESTONE_BRICKS = registerBlock("blue_colored_cobblestone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLUE_COLORED_COBBLESTONE_BRICK_SLAB = registerBlock("blue_colored_cobblestone_brick_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> BLUE_COLORED_COBBLESTONE_BRICK_STAIRS = registerBlock("blue_colored_cobblestone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.BLUE_COLORED_COBBLESTONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> BLUE_COLORED_COBBLESTONE_BRICK_WALL = registerBlock("blue_colored_cobblestone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final DeferredBlock<Block> PINK_COLORED_COBBLESTONE = registerBlock("pink_colored_cobblestone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PINK_COLORED_COBBLESTONE_SLAB = registerBlock("pink_colored_cobblestone_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> PINK_COLORED_COBBLESTONE_STAIRS = registerBlock("pink_colored_cobblestone_stairs",
            () -> {BlockState blockState = ModBlocks.PINK_COLORED_COBBLESTONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> PINK_COLORED_COBBLESTONE_WALL = registerBlock("pink_colored_cobblestone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> PINK_COLORED_COBBLESTONE_BRICKS = registerBlock("pink_colored_cobblestone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PINK_COLORED_COBBLESTONE_BRICK_SLAB = registerBlock("pink_colored_cobblestone_brick_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> PINK_COLORED_COBBLESTONE_BRICK_STAIRS = registerBlock("pink_colored_cobblestone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.PINK_COLORED_COBBLESTONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> PINK_COLORED_COBBLESTONE_BRICK_WALL = registerBlock("pink_colored_cobblestone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final DeferredBlock<Block> PURPLE_COLORED_COBBLESTONE = registerBlock("purple_colored_cobblestone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PURPLE_COLORED_COBBLESTONE_SLAB = registerBlock("purple_colored_cobblestone_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> PURPLE_COLORED_COBBLESTONE_STAIRS = registerBlock("purple_colored_cobblestone_stairs",
            () -> {BlockState blockState = ModBlocks.PURPLE_COLORED_COBBLESTONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> PURPLE_COLORED_COBBLESTONE_WALL = registerBlock("purple_colored_cobblestone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> PURPLE_COLORED_COBBLESTONE_BRICKS = registerBlock("purple_colored_cobblestone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PURPLE_COLORED_COBBLESTONE_BRICK_SLAB = registerBlock("purple_colored_cobblestone_brick_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> PURPLE_COLORED_COBBLESTONE_BRICK_STAIRS = registerBlock("purple_colored_cobblestone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> PURPLE_COLORED_COBBLESTONE_BRICK_WALL = registerBlock("purple_colored_cobblestone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final DeferredBlock<Block> MAGENTA_COLORED_COBBLESTONE = registerBlock("magenta_colored_cobblestone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MAGENTA_COLORED_COBBLESTONE_SLAB = registerBlock("magenta_colored_cobblestone_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> MAGENTA_COLORED_COBBLESTONE_STAIRS = registerBlock("magenta_colored_cobblestone_stairs",
            () -> {BlockState blockState = ModBlocks.MAGENTA_COLORED_COBBLESTONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> MAGENTA_COLORED_COBBLESTONE_WALL = registerBlock("magenta_colored_cobblestone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> MAGENTA_COLORED_COBBLESTONE_BRICKS = registerBlock("magenta_colored_cobblestone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MAGENTA_COLORED_COBBLESTONE_BRICK_SLAB = registerBlock("magenta_colored_cobblestone_brick_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> MAGENTA_COLORED_COBBLESTONE_BRICK_STAIRS = registerBlock("magenta_colored_cobblestone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> MAGENTA_COLORED_COBBLESTONE_BRICK_WALL = registerBlock("magenta_colored_cobblestone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));


    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_COBBLESTONE = registerBlock("light_blue_colored_cobblestone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_COBBLESTONE_SLAB = registerBlock("light_blue_colored_cobblestone_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_COBBLESTONE_STAIRS = registerBlock("light_blue_colored_cobblestone_stairs",
            () -> {BlockState blockState = ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_COBBLESTONE_WALL = registerBlock("light_blue_colored_cobblestone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_COBBLESTONE_BRICKS = registerBlock("light_blue_colored_cobblestone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_COBBLESTONE_BRICK_SLAB = registerBlock("light_blue_colored_cobblestone_brick_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_COBBLESTONE_BRICK_STAIRS = registerBlock("light_blue_colored_cobblestone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_COBBLESTONE_BRICK_WALL = registerBlock("light_blue_colored_cobblestone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final DeferredBlock<Block> CYAN_COLORED_COBBLESTONE = registerBlock("cyan_colored_cobblestone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CYAN_COLORED_COBBLESTONE_SLAB = registerBlock("cyan_colored_cobblestone_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> CYAN_COLORED_COBBLESTONE_STAIRS = registerBlock("cyan_colored_cobblestone_stairs",
            () -> {BlockState blockState = ModBlocks.CYAN_COLORED_COBBLESTONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> CYAN_COLORED_COBBLESTONE_WALL = registerBlock("cyan_colored_cobblestone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> CYAN_COLORED_COBBLESTONE_BRICKS = registerBlock("cyan_colored_cobblestone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CYAN_COLORED_COBBLESTONE_BRICK_SLAB = registerBlock("cyan_colored_cobblestone_brick_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> CYAN_COLORED_COBBLESTONE_BRICK_STAIRS = registerBlock("cyan_colored_cobblestone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.CYAN_COLORED_COBBLESTONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> CYAN_COLORED_COBBLESTONE_BRICK_WALL = registerBlock("cyan_colored_cobblestone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final DeferredBlock<Block> GRAY_COLORED_COBBLESTONE = registerBlock("gray_colored_cobblestone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> GRAY_COLORED_COBBLESTONE_SLAB = registerBlock("gray_colored_cobblestone_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> GRAY_COLORED_COBBLESTONE_STAIRS = registerBlock("gray_colored_cobblestone_stairs",
            () -> {BlockState blockState = ModBlocks.GRAY_COLORED_COBBLESTONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> GRAY_COLORED_COBBLESTONE_WALL = registerBlock("gray_colored_cobblestone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> GRAY_COLORED_COBBLESTONE_BRICKS = registerBlock("gray_colored_cobblestone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> GRAY_COLORED_COBBLESTONE_BRICK_SLAB = registerBlock("gray_colored_cobblestone_brick_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> GRAY_COLORED_COBBLESTONE_BRICK_STAIRS = registerBlock("gray_colored_cobblestone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.CYAN_COLORED_COBBLESTONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> GRAY_COLORED_COBBLESTONE_BRICK_WALL = registerBlock("gray_colored_cobblestone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));


    public static final DeferredBlock<Block> BROWN_COLORED_COBBLESTONE = registerBlock("brown_colored_cobblestone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BROWN_COLORED_COBBLESTONE_SLAB = registerBlock("brown_colored_cobblestone_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> BROWN_COLORED_COBBLESTONE_STAIRS = registerBlock("brown_colored_cobblestone_stairs",
            () -> {BlockState blockState = ModBlocks.BROWN_COLORED_COBBLESTONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> BROWN_COLORED_COBBLESTONE_WALL = registerBlock("brown_colored_cobblestone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> BROWN_COLORED_COBBLESTONE_BRICKS = registerBlock("brown_colored_cobblestone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BROWN_COLORED_COBBLESTONE_BRICK_SLAB = registerBlock("brown_colored_cobblestone_brick_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> BROWN_COLORED_COBBLESTONE_BRICK_STAIRS = registerBlock("brown_colored_cobblestone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.BROWN_COLORED_COBBLESTONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> BROWN_COLORED_COBBLESTONE_BRICK_WALL = registerBlock("brown_colored_cobblestone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_COBBLESTONE = registerBlock("light_gray_colored_cobblestone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_COBBLESTONE_SLAB = registerBlock("light_gray_colored_cobblestone_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_COBBLESTONE_STAIRS = registerBlock("light_gray_colored_cobblestone_stairs",
            () -> {BlockState blockState = ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_COBBLESTONE_WALL = registerBlock("light_gray_colored_cobblestone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_COBBLESTONE_BRICKS = registerBlock("light_gray_colored_cobblestone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_COBBLESTONE_BRICK_SLAB = registerBlock("light_gray_colored_cobblestone_brick_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_COBBLESTONE_BRICK_STAIRS = registerBlock("light_gray_colored_cobblestone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_COBBLESTONE_BRICK_WALL = registerBlock("light_gray_colored_cobblestone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));





    public static final DeferredBlock<Block> ORANGE_COLORED_COBBLESTONE = registerBlock("orange_colored_cobblestone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> ORANGE_COLORED_COBBLESTONE_SLAB = registerBlock("orange_colored_cobblestone_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> ORANGE_COLORED_COBBLESTONE_STAIRS = registerBlock("orange_colored_cobblestone_stairs",
            () -> {BlockState blockState = ModBlocks.ORANGE_COLORED_COBBLESTONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> ORANGE_COLORED_COBBLESTONE_WALL = registerBlock("orange_colored_cobblestone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> ORANGE_COLORED_COBBLESTONE_BRICKS = registerBlock("orange_colored_cobblestone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> ORANGE_COLORED_COBBLESTONE_BRICK_SLAB = registerBlock("orange_colored_cobblestone_brick_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> ORANGE_COLORED_COBBLESTONE_BRICK_STAIRS = registerBlock("orange_colored_cobblestone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> ORANGE_COLORED_COBBLESTONE_BRICK_WALL = registerBlock("orange_colored_cobblestone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));



    public static final DeferredBlock<Block> GREEN_COLORED_COBBLESTONE = registerBlock("green_colored_cobblestone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> GREEN_COLORED_COBBLESTONE_SLAB = registerBlock("green_colored_cobblestone_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> GREEN_COLORED_COBBLESTONE_STAIRS = registerBlock("green_colored_cobblestone_stairs",
            () -> {BlockState blockState = ModBlocks.GREEN_COLORED_COBBLESTONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> GREEN_COLORED_COBBLESTONE_WALL = registerBlock("green_colored_cobblestone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> GREEN_COLORED_COBBLESTONE_BRICKS = registerBlock("green_colored_cobblestone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> GREEN_COLORED_COBBLESTONE_BRICK_SLAB = registerBlock("green_colored_cobblestone_brick_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> GREEN_COLORED_COBBLESTONE_BRICK_STAIRS = registerBlock("green_colored_cobblestone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.GREEN_COLORED_COBBLESTONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> GREEN_COLORED_COBBLESTONE_BRICK_WALL = registerBlock("green_colored_cobblestone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));


    public static final DeferredBlock<Block> LIME_COLORED_COBBLESTONE = registerBlock("lime_colored_cobblestone",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> LIME_COLORED_COBBLESTONE_SLAB = registerBlock("lime_colored_cobblestone_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> LIME_COLORED_COBBLESTONE_STAIRS = registerBlock("lime_colored_cobblestone_stairs",
            () -> {BlockState blockState = ModBlocks.LIME_COLORED_COBBLESTONE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> LIME_COLORED_COBBLESTONE_WALL = registerBlock("lime_colored_cobblestone_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> LIME_COLORED_COBBLESTONE_BRICKS = registerBlock("lime_colored_cobblestone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> LIME_COLORED_COBBLESTONE_BRICK_SLAB = registerBlock("lime_colored_cobblestone_brick_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> LIME_COLORED_COBBLESTONE_BRICK_STAIRS = registerBlock("lime_colored_cobblestone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.LIME_COLORED_COBBLESTONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> LIME_COLORED_COBBLESTONE_BRICK_WALL = registerBlock("lime_colored_cobblestone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> COBBLESTONE_BRICKS = registerBlock("cobblestone_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> COBBLESTONE_BRICK_SLAB = registerBlock("cobblestone_brick_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));    

    public static final DeferredBlock<Block> COBBLESTONE_BRICK_STAIRS = registerBlock("cobblestone_brick_stairs",
            () -> {BlockState blockState = ModBlocks.COBBLESTONE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).strength(1f).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> COBBLESTONE_BRICK_WALL = registerBlock("cobblestone_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).sound(SoundType.STONE).requiresCorrectToolForDrops()));


    //Colored Planks

    public static final DeferredBlock<Block> WHITE_COLORED_WOODEN_PLANKS = registerBlock("white_colored_wooden_planks",
            () -> new FlammableBrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).ignitedByLava()
                    .lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_WOODEN_PLANKS = registerBlock("light_gray_colored_wooden_planks",
            () -> new FlammableBrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).ignitedByLava()
                    .lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_WOODEN_PLANKS = registerBlock("light_blue_colored_wooden_planks",
            () -> new FlammableBrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).ignitedByLava()
                    .lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> BLUE_COLORED_WOODEN_PLANKS = registerBlock("blue_colored_wooden_planks",
            () -> new FlammableBrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).ignitedByLava()
                    .lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> GRAY_COLORED_WOODEN_PLANKS = registerBlock("gray_colored_wooden_planks",
            () -> new FlammableBrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).ignitedByLava()
                    .lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> PINK_COLORED_WOODEN_PLANKS = registerBlock("pink_colored_wooden_planks",
            () -> new FlammableBrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).ignitedByLava()
                    .lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> GREEN_COLORED_WOODEN_PLANKS = registerBlock("green_colored_wooden_planks",
            () -> new FlammableBrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).ignitedByLava()
                    .lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> LIME_COLORED_WOODEN_PLANKS = registerBlock("lime_colored_wooden_planks",
            () -> new FlammableBrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).ignitedByLava()
                    .lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> YELLOW_COLORED_WOODEN_PLANKS = registerBlock("yellow_colored_wooden_planks",
            () -> new FlammableBrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).ignitedByLava()
                    .lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> MAGENTA_COLORED_WOODEN_PLANKS = registerBlock("magenta_colored_wooden_planks",
            () -> new FlammableBrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).ignitedByLava()
                    .lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> PURPLE_COLORED_WOODEN_PLANKS = registerBlock("purple_colored_wooden_planks",
            () -> new FlammableBrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).ignitedByLava()
                    .lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> BLACK_COLORED_WOODEN_PLANKS = registerBlock("black_colored_wooden_planks",
            () -> new FlammableBrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).ignitedByLava()
                    .lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> CYAN_COLORED_WOODEN_PLANKS = registerBlock("cyan_colored_wooden_planks",
            () -> new FlammableBrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).ignitedByLava()
                    .lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> BROWN_COLORED_WOODEN_PLANKS = registerBlock("brown_colored_wooden_planks",
            () -> new FlammableBrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).ignitedByLava()
                    .lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> RED_COLORED_WOODEN_PLANKS = registerBlock("red_colored_wooden_planks",
            () -> new FlammableBrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).ignitedByLava()
                    .lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> ORANGE_COLORED_WOODEN_PLANKS = registerBlock("orange_colored_wooden_planks",
            () -> new FlammableBrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).ignitedByLava()
                    .lightLevel(litBlockEmission(15))));


    public static final DeferredBlock<Block> WHITE_COLORED_WOODEN_PLANK_STAIRS = registerBlock("white_colored_wooden_plank_stairs",
        () -> {BlockState blockState = ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get().defaultBlockState();
                return new FlammableBrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)));});

    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_WOODEN_PLANK_STAIRS = registerBlock("light_gray_colored_wooden_plank_stairs",
            () -> {BlockState blockState = ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get().defaultBlockState();
                return new FlammableBrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)));});

    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_WOODEN_PLANK_STAIRS = registerBlock("light_blue_colored_wooden_plank_stairs",
            () -> {BlockState blockState = ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get().defaultBlockState();
                return new FlammableBrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)));});

    public static final DeferredBlock<Block> BLUE_COLORED_WOODEN_PLANK_STAIRS = registerBlock("blue_colored_wooden_plank_stairs",
            () -> {BlockState blockState = ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get().defaultBlockState();
                return new FlammableBrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)));});

    public static final DeferredBlock<Block> GRAY_COLORED_WOODEN_PLANK_STAIRS = registerBlock("gray_colored_wooden_plank_stairs",
            () -> {BlockState blockState = ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get().defaultBlockState();
                return new FlammableBrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)));});

    public static final DeferredBlock<Block> PINK_COLORED_WOODEN_PLANK_STAIRS = registerBlock("pink_colored_wooden_plank_stairs",
            () -> {BlockState blockState = ModBlocks.PINK_COLORED_WOODEN_PLANKS.get().defaultBlockState();
                return new FlammableBrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)));});

    public static final DeferredBlock<Block> GREEN_COLORED_WOODEN_PLANK_STAIRS = registerBlock("green_colored_wooden_plank_stairs",
            () -> {BlockState blockState = ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get().defaultBlockState();
                return new FlammableBrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)));});

    public static final DeferredBlock<Block> LIME_COLORED_WOODEN_PLANK_STAIRS = registerBlock("lime_colored_wooden_plank_stairs",
            () -> {BlockState blockState = ModBlocks.LIME_COLORED_WOODEN_PLANKS.get().defaultBlockState();
                return new FlammableBrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)));});

    public static final DeferredBlock<Block> YELLOW_COLORED_WOODEN_PLANK_STAIRS = registerBlock("yellow_colored_wooden_plank_stairs",
            () -> {BlockState blockState = ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get().defaultBlockState();
                return new FlammableBrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)));});

    public static final DeferredBlock<Block> MAGENTA_COLORED_WOODEN_PLANK_STAIRS = registerBlock("magenta_colored_wooden_plank_stairs",
            () -> {BlockState blockState = ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get().defaultBlockState();
                return new FlammableBrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)));});

    public static final DeferredBlock<Block> PURPLE_COLORED_WOODEN_PLANK_STAIRS = registerBlock("purple_colored_wooden_plank_stairs",
            () -> {BlockState blockState = ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get().defaultBlockState();
                return new FlammableBrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)));});

    public static final DeferredBlock<Block> BLACK_COLORED_WOODEN_PLANK_STAIRS = registerBlock("black_colored_wooden_plank_stairs",
            () -> {BlockState blockState = ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get().defaultBlockState();
                return new FlammableBrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)));});

    public static final DeferredBlock<Block> CYAN_COLORED_WOODEN_PLANK_STAIRS = registerBlock("cyan_colored_wooden_plank_stairs",
            () -> {BlockState blockState = ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get().defaultBlockState();
                return new FlammableBrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)));});

    public static final DeferredBlock<Block> BROWN_COLORED_WOODEN_PLANK_STAIRS = registerBlock("brown_colored_wooden_plank_stairs",
            () -> {BlockState blockState = ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get().defaultBlockState();
                return new FlammableBrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)));});

    public static final DeferredBlock<Block> RED_COLORED_WOODEN_PLANK_STAIRS = registerBlock("red_colored_wooden_plank_stairs",
            () -> {BlockState blockState = ModBlocks.RED_COLORED_WOODEN_PLANKS.get().defaultBlockState();
                return new FlammableBrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)));});

    public static final DeferredBlock<Block> ORANGE_COLORED_WOODEN_PLANK_STAIRS = registerBlock("orange_colored_wooden_plank_stairs",
            () -> {BlockState blockState = ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get().defaultBlockState();
                return new FlammableBrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)));});



    public static final DeferredBlock<Block> WHITE_COLORED_WOODEN_PLANK_SLAB = registerBlock("white_colored_wooden_plank_slab",
            () -> new FlammableBrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_WOODEN_PLANK_SLAB = registerBlock("light_gray_colored_wooden_plank_slab",
            () -> new FlammableBrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_WOODEN_PLANK_SLAB = registerBlock("light_blue_colored_wooden_plank_slab",
            () -> new FlammableBrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> BLUE_COLORED_WOODEN_PLANK_SLAB = registerBlock("blue_colored_wooden_plank_slab",
            () -> new FlammableBrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> GRAY_COLORED_WOODEN_PLANK_SLAB = registerBlock("gray_colored_wooden_plank_slab",
            () -> new FlammableBrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> PINK_COLORED_WOODEN_PLANK_SLAB = registerBlock("pink_colored_wooden_plank_slab",
            () -> new FlammableBrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> GREEN_COLORED_WOODEN_PLANK_SLAB = registerBlock("green_colored_wooden_plank_slab",
            () -> new FlammableBrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> LIME_COLORED_WOODEN_PLANK_SLAB = registerBlock("lime_colored_wooden_plank_slab",
            () -> new FlammableBrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> YELLOW_COLORED_WOODEN_PLANK_SLAB = registerBlock("yellow_colored_wooden_plank_slab",
            () -> new FlammableBrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> MAGENTA_COLORED_WOODEN_PLANK_SLAB = registerBlock("magenta_colored_wooden_plank_slab",
            () -> new FlammableBrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> PURPLE_COLORED_WOODEN_PLANK_SLAB = registerBlock("purple_colored_wooden_plank_slab",
            () -> new FlammableBrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> BLACK_COLORED_WOODEN_PLANK_SLAB = registerBlock("black_colored_wooden_plank_slab",
            () -> new FlammableBrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> CYAN_COLORED_WOODEN_PLANK_SLAB = registerBlock("cyan_colored_wooden_plank_slab",
            () -> new FlammableBrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> BROWN_COLORED_WOODEN_PLANK_SLAB = registerBlock("brown_colored_wooden_plank_slab",
            () -> new FlammableBrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> RED_COLORED_WOODEN_PLANK_SLAB = registerBlock("red_colored_wooden_plank_slab",
            () -> new FlammableBrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> ORANGE_COLORED_WOODEN_PLANK_SLAB = registerBlock("orange_colored_wooden_plank_slab",
            () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));


    public static final DeferredBlock<Block> ORANGE_COLORED_WOODEN_PLANK_PRESSURE_PLATE = registerBlock("orange_colored_wooden_plank_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.EVERYTHING,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> RED_COLORED_WOODEN_PLANK_PRESSURE_PLATE = registerBlock("red_colored_wooden_plank_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.EVERYTHING,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> BROWN_COLORED_WOODEN_PLANK_PRESSURE_PLATE = registerBlock("brown_colored_wooden_plank_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.EVERYTHING,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> CYAN_COLORED_WOODEN_PLANK_PRESSURE_PLATE = registerBlock("cyan_colored_wooden_plank_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.EVERYTHING,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> BLACK_COLORED_WOODEN_PLANK_PRESSURE_PLATE = registerBlock("black_colored_wooden_plank_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.EVERYTHING,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> PURPLE_COLORED_WOODEN_PLANK_PRESSURE_PLATE = registerBlock("purple_colored_wooden_plank_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.EVERYTHING,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> MAGENTA_COLORED_WOODEN_PLANK_PRESSURE_PLATE = registerBlock("magenta_colored_wooden_plank_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.EVERYTHING,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> YELLOW_COLORED_WOODEN_PLANK_PRESSURE_PLATE = registerBlock("yellow_colored_wooden_plank_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.EVERYTHING,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> LIME_COLORED_WOODEN_PLANK_PRESSURE_PLATE = registerBlock("lime_colored_wooden_plank_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.EVERYTHING,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> GREEN_COLORED_WOODEN_PLANK_PRESSURE_PLATE = registerBlock("green_colored_wooden_plank_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.EVERYTHING,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> PINK_COLORED_WOODEN_PLANK_PRESSURE_PLATE = registerBlock("pink_colored_wooden_plank_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.EVERYTHING,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> GRAY_COLORED_WOODEN_PLANK_PRESSURE_PLATE = registerBlock("gray_colored_wooden_plank_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.EVERYTHING,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_WOODEN_PLANK_PRESSURE_PLATE = registerBlock("light_gray_colored_wooden_plank_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.EVERYTHING,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_WOODEN_PLANK_PRESSURE_PLATE = registerBlock("light_blue_colored_wooden_plank_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.EVERYTHING,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> BLUE_COLORED_WOODEN_PLANK_PRESSURE_PLATE = registerBlock("blue_colored_wooden_plank_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.EVERYTHING,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> WHITE_COLORED_WOODEN_PLANK_PRESSURE_PLATE = registerBlock("white_colored_wooden_plank_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.EVERYTHING,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15)), BlockSetType.OAK));

    public static final DeferredBlock<Block> ORANGE_COLORED_STONE_PRESSURE_PLATE = registerBlock("orange_colored_stone_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE).lightLevel(litBlockEmission(15)), BlockSetType.STONE));
    public static final DeferredBlock<Block> RED_COLORED_STONE_PRESSURE_PLATE = registerBlock("red_colored_stone_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE).lightLevel(litBlockEmission(15)), BlockSetType.STONE));
    public static final DeferredBlock<Block> BROWN_COLORED_STONE_PRESSURE_PLATE = registerBlock("brown_colored_stone_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE).lightLevel(litBlockEmission(15)), BlockSetType.STONE));
    public static final DeferredBlock<Block> CYAN_COLORED_STONE_PRESSURE_PLATE = registerBlock("cyan_colored_stone_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE).lightLevel(litBlockEmission(15)), BlockSetType.STONE));
    public static final DeferredBlock<Block> BLACK_COLORED_STONE_PRESSURE_PLATE = registerBlock("black_colored_stone_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE).lightLevel(litBlockEmission(15)), BlockSetType.STONE));
    public static final DeferredBlock<Block> PURPLE_COLORED_STONE_PRESSURE_PLATE = registerBlock("purple_colored_stone_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE).lightLevel(litBlockEmission(15)), BlockSetType.STONE));
    public static final DeferredBlock<Block> MAGENTA_COLORED_STONE_PRESSURE_PLATE = registerBlock("magenta_colored_stone_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE).lightLevel(litBlockEmission(15)), BlockSetType.STONE));
    public static final DeferredBlock<Block> YELLOW_COLORED_STONE_PRESSURE_PLATE = registerBlock("yellow_colored_stone_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE).lightLevel(litBlockEmission(15)), BlockSetType.STONE));
    public static final DeferredBlock<Block> LIME_COLORED_STONE_PRESSURE_PLATE = registerBlock("lime_colored_stone_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE).lightLevel(litBlockEmission(15)), BlockSetType.STONE));
    public static final DeferredBlock<Block> GREEN_COLORED_STONE_PRESSURE_PLATE = registerBlock("green_colored_stone_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE).lightLevel(litBlockEmission(15)), BlockSetType.STONE));
    public static final DeferredBlock<Block> PINK_COLORED_STONE_PRESSURE_PLATE = registerBlock("pink_colored_stone_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE).lightLevel(litBlockEmission(15)), BlockSetType.STONE));
    public static final DeferredBlock<Block> GRAY_COLORED_STONE_PRESSURE_PLATE = registerBlock("gray_colored_stone_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE).lightLevel(litBlockEmission(15)), BlockSetType.STONE));
    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_STONE_PRESSURE_PLATE = registerBlock("light_gray_colored_stone_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE).lightLevel(litBlockEmission(15)), BlockSetType.STONE));
    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_STONE_PRESSURE_PLATE = registerBlock("light_blue_colored_stone_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE).lightLevel(litBlockEmission(15)), BlockSetType.STONE));
    public static final DeferredBlock<Block> BLUE_COLORED_STONE_PRESSURE_PLATE = registerBlock("blue_colored_stone_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE).lightLevel(litBlockEmission(15)), BlockSetType.STONE));
    public static final DeferredBlock<Block> WHITE_COLORED_STONE_PRESSURE_PLATE = registerBlock("white_colored_stone_pressure_plate",
            () -> new BrightPressurePlateBlock(BlockSetType.PressurePlateSensitivity.MOBS,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE).lightLevel(litBlockEmission(15)), BlockSetType.STONE));

    public static final DeferredBlock<Block> WHITE_COLORED_WOODEN_PLANK_BUTTON = registerBlock("white_colored_wooden_plank_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final DeferredBlock<Block> CYAN_COLORED_WOODEN_PLANK_BUTTON = registerBlock("cyan_colored_wooden_plank_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final DeferredBlock<Block> MAGENTA_COLORED_WOODEN_PLANK_BUTTON = registerBlock("magenta_colored_wooden_plank_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final DeferredBlock<Block> PURPLE_COLORED_WOODEN_PLANK_BUTTON = registerBlock("purple_colored_wooden_plank_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final DeferredBlock<Block> PINK_COLORED_WOODEN_PLANK_BUTTON = registerBlock("pink_colored_wooden_plank_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final DeferredBlock<Block> GRAY_COLORED_WOODEN_PLANK_BUTTON = registerBlock("gray_colored_wooden_plank_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_WOODEN_PLANK_BUTTON = registerBlock("light_gray_colored_wooden_plank_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_WOODEN_PLANK_BUTTON = registerBlock("light_blue_colored_wooden_plank_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final DeferredBlock<Block> BLUE_COLORED_WOODEN_PLANK_BUTTON = registerBlock("blue_colored_wooden_plank_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final DeferredBlock<Block> RED_COLORED_WOODEN_PLANK_BUTTON = registerBlock("red_colored_wooden_plank_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final DeferredBlock<Block> ORANGE_COLORED_WOODEN_PLANK_BUTTON = registerBlock("orange_colored_wooden_plank_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final DeferredBlock<Block> YELLOW_COLORED_WOODEN_PLANK_BUTTON = registerBlock("yellow_colored_wooden_plank_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final DeferredBlock<Block> GREEN_COLORED_WOODEN_PLANK_BUTTON = registerBlock("green_colored_wooden_plank_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final DeferredBlock<Block> LIME_COLORED_WOODEN_PLANK_BUTTON = registerBlock("lime_colored_wooden_plank_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final DeferredBlock<Block> BLACK_COLORED_WOODEN_PLANK_BUTTON = registerBlock("black_colored_wooden_plank_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final DeferredBlock<Block> BROWN_COLORED_WOODEN_PLANK_BUTTON = registerBlock("brown_colored_wooden_plank_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));

    public static final DeferredBlock<Block> WHITE_COLORED_STONE_BUTTON = registerBlock("white_colored_stone_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));
    public static final DeferredBlock<Block> CYAN_COLORED_STONE_BUTTON = registerBlock("cyan_colored_stone_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));
    public static final DeferredBlock<Block> MAGENTA_COLORED_STONE_BUTTON = registerBlock("magenta_colored_stone_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));
    public static final DeferredBlock<Block> PURPLE_COLORED_STONE_BUTTON = registerBlock("purple_colored_stone_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));
    public static final DeferredBlock<Block> PINK_COLORED_STONE_BUTTON = registerBlock("pink_colored_stone_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));
    public static final DeferredBlock<Block> GRAY_COLORED_STONE_BUTTON = registerBlock("gray_colored_stone_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));
    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_STONE_BUTTON = registerBlock("light_gray_colored_stone_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));
    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_STONE_BUTTON = registerBlock("light_blue_colored_stone_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));
    public static final DeferredBlock<Block> BLUE_COLORED_STONE_BUTTON = registerBlock("blue_colored_stone_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));
    public static final DeferredBlock<Block> RED_COLORED_STONE_BUTTON = registerBlock("red_colored_stone_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));
    public static final DeferredBlock<Block> ORANGE_COLORED_STONE_BUTTON = registerBlock("orange_colored_stone_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));
    public static final DeferredBlock<Block> YELLOW_COLORED_STONE_BUTTON = registerBlock("yellow_colored_stone_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));
    public static final DeferredBlock<Block> GREEN_COLORED_STONE_BUTTON = registerBlock("green_colored_stone_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));
    public static final DeferredBlock<Block> LIME_COLORED_STONE_BUTTON = registerBlock("lime_colored_stone_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));
    public static final DeferredBlock<Block> BLACK_COLORED_STONE_BUTTON = registerBlock("black_colored_stone_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));
    public static final DeferredBlock<Block> BROWN_COLORED_STONE_BUTTON = registerBlock("brown_colored_stone_button",
            () -> new BrightButtonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON).lightLevel(litBlockEmission(15)).sound(SoundType.STONE),
                    BlockSetType.STONE, 20, false));


    public static final DeferredBlock<Block> WHITE_COLORED_WOODEN_PLANK_FENCE = registerBlock("white_colored_wooden_plank_fence",
                      () -> new FlammableBrightFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));
    
    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_WOODEN_PLANK_FENCE = registerBlock("light_gray_colored_wooden_plank_fence",
                      () -> new FlammableBrightFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_WOODEN_PLANK_FENCE = registerBlock("light_blue_colored_wooden_plank_fence",
                      () -> new FlammableBrightFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> BLUE_COLORED_WOODEN_PLANK_FENCE = registerBlock("blue_colored_wooden_plank_fence",
                      () -> new FlammableBrightFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> GRAY_COLORED_WOODEN_PLANK_FENCE = registerBlock("gray_colored_wooden_plank_fence",
                      () -> new FlammableBrightFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> PINK_COLORED_WOODEN_PLANK_FENCE = registerBlock("pink_colored_wooden_plank_fence",
                      () -> new FlammableBrightFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> GREEN_COLORED_WOODEN_PLANK_FENCE = registerBlock("green_colored_wooden_plank_fence",
                      () -> new FlammableBrightFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> LIME_COLORED_WOODEN_PLANK_FENCE = registerBlock("lime_colored_wooden_plank_fence",
                      () -> new FlammableBrightFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> YELLOW_COLORED_WOODEN_PLANK_FENCE = registerBlock("yellow_colored_wooden_plank_fence",
                      () -> new FlammableBrightFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> MAGENTA_COLORED_WOODEN_PLANK_FENCE = registerBlock("magenta_colored_wooden_plank_fence",
                      () -> new FlammableBrightFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> PURPLE_COLORED_WOODEN_PLANK_FENCE = registerBlock("purple_colored_wooden_plank_fence",
                      () -> new FlammableBrightFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> BLACK_COLORED_WOODEN_PLANK_FENCE = registerBlock("black_colored_wooden_plank_fence",
                      () -> new FlammableBrightFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> CYAN_COLORED_WOODEN_PLANK_FENCE = registerBlock("cyan_colored_wooden_plank_fence",
                      () -> new FlammableBrightFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> BROWN_COLORED_WOODEN_PLANK_FENCE = registerBlock("brown_colored_wooden_plank_fence",
                      () -> new FlammableBrightFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> RED_COLORED_WOODEN_PLANK_FENCE = registerBlock("red_colored_wooden_plank_fence",
                      () -> new FlammableBrightFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> ORANGE_COLORED_WOODEN_PLANK_FENCE = registerBlock("orange_colored_wooden_plank_fence",
                      () -> new FlammableBrightFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).sound(SoundType.WOOD).lightLevel(litBlockEmission(15))));


    public static final DeferredBlock<Block> WHITE_COLORED_WOODEN_PLANK_FENCE_GATE = registerBlock("white_colored_wooden_plank_fence_gate",
            () -> new FlammableBrightFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE).lightLevel(litBlockEmission(15)), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_WOODEN_PLANK_FENCE_GATE = registerBlock("light_gray_colored_wooden_plank_fence_gate",
            () -> new FlammableBrightFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE).lightLevel(litBlockEmission(15)), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_WOODEN_PLANK_FENCE_GATE = registerBlock("light_blue_colored_wooden_plank_fence_gate",
            () -> new FlammableBrightFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE).lightLevel(litBlockEmission(15)), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final DeferredBlock<Block> BLUE_COLORED_WOODEN_PLANK_FENCE_GATE = registerBlock("blue_colored_wooden_plank_fence_gate",
            () -> new FlammableBrightFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE).lightLevel(litBlockEmission(15)), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final DeferredBlock<Block> GRAY_COLORED_WOODEN_PLANK_FENCE_GATE = registerBlock("gray_colored_wooden_plank_fence_gate",
            () -> new FlammableBrightFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE).lightLevel(litBlockEmission(15)), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final DeferredBlock<Block> PINK_COLORED_WOODEN_PLANK_FENCE_GATE = registerBlock("pink_colored_wooden_plank_fence_gate",
            () -> new FlammableBrightFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE).lightLevel(litBlockEmission(15)), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final DeferredBlock<Block> GREEN_COLORED_WOODEN_PLANK_FENCE_GATE = registerBlock("green_colored_wooden_plank_fence_gate",
            () -> new FlammableBrightFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE).lightLevel(litBlockEmission(15)), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final DeferredBlock<Block> LIME_COLORED_WOODEN_PLANK_FENCE_GATE = registerBlock("lime_colored_wooden_plank_fence_gate",
            () -> new FlammableBrightFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE).lightLevel(litBlockEmission(15)), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final DeferredBlock<Block> YELLOW_COLORED_WOODEN_PLANK_FENCE_GATE = registerBlock("yellow_colored_wooden_plank_fence_gate",
            () -> new FlammableBrightFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE).lightLevel(litBlockEmission(15)), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final DeferredBlock<Block> MAGENTA_COLORED_WOODEN_PLANK_FENCE_GATE = registerBlock("magenta_colored_wooden_plank_fence_gate",
            () -> new FlammableBrightFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE).lightLevel(litBlockEmission(15)), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final DeferredBlock<Block> PURPLE_COLORED_WOODEN_PLANK_FENCE_GATE = registerBlock("purple_colored_wooden_plank_fence_gate",
            () -> new FlammableBrightFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE).lightLevel(litBlockEmission(15)), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final DeferredBlock<Block> BLACK_COLORED_WOODEN_PLANK_FENCE_GATE = registerBlock("black_colored_wooden_plank_fence_gate",
            () -> new FlammableBrightFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE).lightLevel(litBlockEmission(15)), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final DeferredBlock<Block> CYAN_COLORED_WOODEN_PLANK_FENCE_GATE = registerBlock("cyan_colored_wooden_plank_fence_gate",
            () -> new FlammableBrightFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE).lightLevel(litBlockEmission(15)), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final DeferredBlock<Block> BROWN_COLORED_WOODEN_PLANK_FENCE_GATE = registerBlock("brown_colored_wooden_plank_fence_gate",
            () -> new FlammableBrightFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE).lightLevel(litBlockEmission(15)), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final DeferredBlock<Block> RED_COLORED_WOODEN_PLANK_FENCE_GATE = registerBlock("red_colored_wooden_plank_fence_gate",
            () -> new FlammableBrightFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE).lightLevel(litBlockEmission(15)), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final DeferredBlock<Block> ORANGE_COLORED_WOODEN_PLANK_FENCE_GATE = registerBlock("orange_colored_wooden_plank_fence_gate",
            () -> new FlammableBrightFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE).lightLevel(litBlockEmission(15)), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));


    public static final DeferredBlock<Block> WHITE_COLORED_WOODEN_PLANK_DOOR = registerBlock("white_colored_wooden_plank_door",
            () -> new BrightDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_WOODEN_PLANK_DOOR = registerBlock("light_gray_colored_wooden_plank_door",
            () -> new BrightDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_WOODEN_PLANK_DOOR = registerBlock("light_blue_colored_wooden_plank_door",
            () -> new BrightDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> BLUE_COLORED_WOODEN_PLANK_DOOR = registerBlock("blue_colored_wooden_plank_door",
            () -> new BrightDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> GRAY_COLORED_WOODEN_PLANK_DOOR = registerBlock("gray_colored_wooden_plank_door",
            () -> new BrightDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> PINK_COLORED_WOODEN_PLANK_DOOR = registerBlock("pink_colored_wooden_plank_door",
            () -> new BrightDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> GREEN_COLORED_WOODEN_PLANK_DOOR = registerBlock("green_colored_wooden_plank_door",
            () -> new BrightDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> LIME_COLORED_WOODEN_PLANK_DOOR = registerBlock("lime_colored_wooden_plank_door",
            () -> new BrightDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> YELLOW_COLORED_WOODEN_PLANK_DOOR = registerBlock("yellow_colored_wooden_plank_door",
            () -> new BrightDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> MAGENTA_COLORED_WOODEN_PLANK_DOOR = registerBlock("magenta_colored_wooden_plank_door",
            () -> new BrightDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> PURPLE_COLORED_WOODEN_PLANK_DOOR = registerBlock("purple_colored_wooden_plank_door",
            () -> new BrightDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> BLACK_COLORED_WOODEN_PLANK_DOOR = registerBlock("black_colored_wooden_plank_door",
            () -> new BrightDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> CYAN_COLORED_WOODEN_PLANK_DOOR = registerBlock("cyan_colored_wooden_plank_door",
            () -> new BrightDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> BROWN_COLORED_WOODEN_PLANK_DOOR = registerBlock("brown_colored_wooden_plank_door",
            () -> new BrightDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> RED_COLORED_WOODEN_PLANK_DOOR = registerBlock("red_colored_wooden_plank_door",
            () -> new BrightDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> ORANGE_COLORED_WOODEN_PLANK_DOOR = registerBlock("orange_colored_wooden_plank_door",
            () -> new BrightDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));

    
    public static final DeferredBlock<Block> WHITE_COLORED_WOODEN_PLANK_TRAPDOOR = registerBlock("white_colored_wooden_plank_trapdoor",
            () -> new BrightTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_WOODEN_PLANK_TRAPDOOR = registerBlock("light_gray_colored_wooden_plank_trapdoor",
            () -> new BrightTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_WOODEN_PLANK_TRAPDOOR = registerBlock("light_blue_colored_wooden_plank_trapdoor",
            () -> new BrightTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> BLUE_COLORED_WOODEN_PLANK_TRAPDOOR = registerBlock("blue_colored_wooden_plank_trapdoor",
            () -> new BrightTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> GRAY_COLORED_WOODEN_PLANK_TRAPDOOR = registerBlock("gray_colored_wooden_plank_trapdoor",
            () -> new BrightTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> PINK_COLORED_WOODEN_PLANK_TRAPDOOR = registerBlock("pink_colored_wooden_plank_trapdoor",
            () -> new BrightTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> GREEN_COLORED_WOODEN_PLANK_TRAPDOOR = registerBlock("green_colored_wooden_plank_trapdoor",
            () -> new BrightTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> LIME_COLORED_WOODEN_PLANK_TRAPDOOR = registerBlock("lime_colored_wooden_plank_trapdoor",
            () -> new BrightTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> YELLOW_COLORED_WOODEN_PLANK_TRAPDOOR = registerBlock("yellow_colored_wooden_plank_trapdoor",
            () -> new BrightTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> MAGENTA_COLORED_WOODEN_PLANK_TRAPDOOR = registerBlock("magenta_colored_wooden_plank_trapdoor",
            () -> new BrightTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> PURPLE_COLORED_WOODEN_PLANK_TRAPDOOR = registerBlock("purple_colored_wooden_plank_trapdoor",
            () -> new BrightTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> BLACK_COLORED_WOODEN_PLANK_TRAPDOOR = registerBlock("black_colored_wooden_plank_trapdoor",
            () -> new BrightTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> CYAN_COLORED_WOODEN_PLANK_TRAPDOOR = registerBlock("cyan_colored_wooden_plank_trapdoor",
            () -> new BrightTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> BROWN_COLORED_WOODEN_PLANK_TRAPDOOR = registerBlock("brown_colored_wooden_plank_trapdoor",
            () -> new BrightTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> RED_COLORED_WOODEN_PLANK_TRAPDOOR = registerBlock("red_colored_wooden_plank_trapdoor",
            () -> new BrightTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));
    public static final DeferredBlock<Block> ORANGE_COLORED_WOODEN_PLANK_TRAPDOOR = registerBlock("orange_colored_wooden_plank_trapdoor",
            () -> new BrightTrapDoorBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).lightLevel(litBlockEmission(15)), BlockSetType.OAK));

    //LOGS

    public static final DeferredBlock<Block> WHITE_COLORED_LOG = registerBlock("white_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> WHITE_COLORED_WOOD = registerBlock("white_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_WHITE_COLORED_LOG = registerBlock("stripped_white_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_WHITE_COLORED_WOOD = registerBlock("stripped_white_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> PURPLE_COLORED_LOG = registerBlock("purple_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> PURPLE_COLORED_WOOD = registerBlock("purple_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_PURPLE_COLORED_LOG = registerBlock("stripped_purple_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_PURPLE_COLORED_WOOD = registerBlock("stripped_purple_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> PINK_COLORED_LOG = registerBlock("pink_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> PINK_COLORED_WOOD = registerBlock("pink_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_PINK_COLORED_LOG = registerBlock("stripped_pink_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_PINK_COLORED_WOOD = registerBlock("stripped_pink_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> MAGENTA_COLORED_LOG = registerBlock("magenta_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> MAGENTA_COLORED_WOOD = registerBlock("magenta_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_MAGENTA_COLORED_LOG = registerBlock("stripped_magenta_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_MAGENTA_COLORED_WOOD = registerBlock("stripped_magenta_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> LIME_COLORED_LOG = registerBlock("lime_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> LIME_COLORED_WOOD = registerBlock("lime_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_LIME_COLORED_LOG = registerBlock("stripped_lime_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_LIME_COLORED_WOOD = registerBlock("stripped_lime_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> GREEN_COLORED_LOG = registerBlock("green_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> GREEN_COLORED_WOOD = registerBlock("green_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_GREEN_COLORED_LOG = registerBlock("stripped_green_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_GREEN_COLORED_WOOD = registerBlock("stripped_green_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> CYAN_COLORED_LOG = registerBlock("cyan_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> CYAN_COLORED_WOOD = registerBlock("cyan_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_CYAN_COLORED_LOG = registerBlock("stripped_cyan_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_CYAN_COLORED_WOOD = registerBlock("stripped_cyan_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> GRAY_COLORED_LOG = registerBlock("gray_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> GRAY_COLORED_WOOD = registerBlock("gray_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_GRAY_COLORED_LOG = registerBlock("stripped_gray_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_GRAY_COLORED_WOOD = registerBlock("stripped_gray_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_LOG = registerBlock("light_gray_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_WOOD = registerBlock("light_gray_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_LIGHT_GRAY_COLORED_LOG = registerBlock("stripped_light_gray_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_LIGHT_GRAY_COLORED_WOOD = registerBlock("stripped_light_gray_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_LOG = registerBlock("light_blue_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_WOOD = registerBlock("light_blue_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_LIGHT_BLUE_COLORED_LOG = registerBlock("stripped_light_blue_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_LIGHT_BLUE_COLORED_WOOD = registerBlock("stripped_light_blue_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> BLUE_COLORED_LOG = registerBlock("blue_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> BLUE_COLORED_WOOD = registerBlock("blue_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_BLUE_COLORED_LOG = registerBlock("stripped_blue_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_BLUE_COLORED_WOOD = registerBlock("stripped_blue_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> RED_COLORED_LOG = registerBlock("red_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> RED_COLORED_WOOD = registerBlock("red_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_RED_COLORED_LOG = registerBlock("stripped_red_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_RED_COLORED_WOOD = registerBlock("stripped_red_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> ORANGE_COLORED_LOG = registerBlock("orange_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> ORANGE_COLORED_WOOD = registerBlock("orange_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_ORANGE_COLORED_LOG = registerBlock("stripped_orange_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_ORANGE_COLORED_WOOD = registerBlock("stripped_orange_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> YELLOW_COLORED_LOG = registerBlock("yellow_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> YELLOW_COLORED_WOOD = registerBlock("yellow_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_YELLOW_COLORED_LOG = registerBlock("stripped_yellow_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_YELLOW_COLORED_WOOD = registerBlock("stripped_yellow_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> BROWN_COLORED_LOG = registerBlock("brown_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> BROWN_COLORED_WOOD = registerBlock("brown_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_BROWN_COLORED_LOG = registerBlock("stripped_brown_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_BROWN_COLORED_WOOD = registerBlock("stripped_brown_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> BLACK_COLORED_LOG = registerBlock("black_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> BLACK_COLORED_WOOD = registerBlock("black_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_BLACK_COLORED_LOG = registerBlock("stripped_black_colored_log",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> STRIPPED_BLACK_COLORED_WOOD = registerBlock("stripped_black_colored_wood",
            () -> new BrightFlammableLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD).lightLevel(litBlockEmission(15))));

    //SIGNS

    public static final DeferredHolder<Block, BlackStandingSignBlock> BLACK_COLORED_SIGN = BLOCKS.register("black_colored_sign",
            () -> new BlackStandingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN), ModWoodTypes.BLACK));
    public static final DeferredHolder<Block, BlackWallSignBlock> BLACK_COLORED_WALL_SIGN = BLOCKS.register("black_colored_wall_sign",
            () -> new BlackWallSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN), ModWoodTypes.BLACK));
    public static final DeferredHolder<Block, BlackHangingSignBlock> BLACK_COLORED_HANGING_SIGN = BLOCKS.register("black_colored_hanging_sign",
            () -> new BlackHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.BLACK));
    public static final DeferredHolder<Block, BlackWallHangingSignBlock> BLACK_COLORED_WALL_HANGING_SIGN = BLOCKS.register("black_colored_wall_hanging_sign",
            () -> new BlackWallHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.BLACK));
    
    public static final DeferredHolder<Block, BlueStandingSignBlock> BLUE_COLORED_SIGN = BLOCKS.register("blue_colored_sign",
            () -> new BlueStandingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN), ModWoodTypes.BLUE));
    public static final DeferredHolder<Block, BlueWallSignBlock> BLUE_COLORED_WALL_SIGN = BLOCKS.register("blue_colored_wall_sign",
            () -> new BlueWallSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN), ModWoodTypes.BLUE));
    public static final DeferredHolder<Block, BlueHangingSignBlock> BLUE_COLORED_HANGING_SIGN = BLOCKS.register("blue_colored_hanging_sign",
            () -> new BlueHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.BLUE));
    public static final DeferredHolder<Block, BlueWallHangingSignBlock> BLUE_COLORED_WALL_HANGING_SIGN = BLOCKS.register("blue_colored_wall_hanging_sign",
            () -> new BlueWallHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.BLUE));
    
    public static final DeferredHolder<Block, BrownStandingSignBlock> BROWN_COLORED_SIGN = BLOCKS.register("brown_colored_sign",
            () -> new BrownStandingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN), ModWoodTypes.BROWN));
    public static final DeferredHolder<Block, BrownWallSignBlock> BROWN_COLORED_WALL_SIGN = BLOCKS.register("brown_colored_wall_sign",
            () -> new BrownWallSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN), ModWoodTypes.BROWN));
    public static final DeferredHolder<Block, BrownHangingSignBlock> BROWN_COLORED_HANGING_SIGN = BLOCKS.register("brown_colored_hanging_sign",
            () -> new BrownHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.BROWN));
    public static final DeferredHolder<Block, BrownWallHangingSignBlock> BROWN_COLORED_WALL_HANGING_SIGN = BLOCKS.register("brown_colored_wall_hanging_sign",
            () -> new BrownWallHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.BROWN));
    
    public static final DeferredHolder<Block, CyanStandingSignBlock> CYAN_COLORED_SIGN = BLOCKS.register("cyan_colored_sign",
            () -> new CyanStandingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN), ModWoodTypes.CYAN));
    public static final DeferredHolder<Block, CyanWallSignBlock> CYAN_COLORED_WALL_SIGN = BLOCKS.register("cyan_colored_wall_sign",
            () -> new CyanWallSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN), ModWoodTypes.CYAN));
    public static final DeferredHolder<Block, CyanHangingSignBlock> CYAN_COLORED_HANGING_SIGN = BLOCKS.register("cyan_colored_hanging_sign",
            () -> new CyanHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.CYAN));
    public static final DeferredHolder<Block, CyanWallHangingSignBlock> CYAN_COLORED_WALL_HANGING_SIGN = BLOCKS.register("cyan_colored_wall_hanging_sign",
            () -> new CyanWallHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.CYAN));
    
    public static final DeferredHolder<Block, GrayStandingSignBlock> GRAY_COLORED_SIGN = BLOCKS.register("gray_colored_sign",
            () -> new GrayStandingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN), ModWoodTypes.GRAY));
    public static final DeferredHolder<Block, GrayWallSignBlock> GRAY_COLORED_WALL_SIGN = BLOCKS.register("gray_colored_wall_sign",
            () -> new GrayWallSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN), ModWoodTypes.GRAY));
    public static final DeferredHolder<Block, GrayHangingSignBlock> GRAY_COLORED_HANGING_SIGN = BLOCKS.register("gray_colored_hanging_sign",
            () -> new GrayHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.GRAY));
    public static final DeferredHolder<Block, GrayWallHangingSignBlock> GRAY_COLORED_WALL_HANGING_SIGN = BLOCKS.register("gray_colored_wall_hanging_sign",
            () -> new GrayWallHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.GRAY));
    
    public static final DeferredHolder<Block, GreenStandingSignBlock> GREEN_COLORED_SIGN = BLOCKS.register("green_colored_sign",
            () -> new GreenStandingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN), ModWoodTypes.GREEN));
    public static final DeferredHolder<Block, GreenWallSignBlock> GREEN_COLORED_WALL_SIGN = BLOCKS.register("green_colored_wall_sign",
            () -> new GreenWallSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN), ModWoodTypes.GREEN));
    public static final DeferredHolder<Block, GreenHangingSignBlock> GREEN_COLORED_HANGING_SIGN = BLOCKS.register("green_colored_hanging_sign",
            () -> new GreenHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.GREEN));
    public static final DeferredHolder<Block, GreenWallHangingSignBlock> GREEN_COLORED_WALL_HANGING_SIGN = BLOCKS.register("green_colored_wall_hanging_sign",
            () -> new GreenWallHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.GREEN));
    
    public static final DeferredHolder<Block, LightBlueStandingSignBlock> LIGHT_BLUE_COLORED_SIGN = BLOCKS.register("light_blue_colored_sign",
            () -> new LightBlueStandingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN), ModWoodTypes.LIGHT_BLUE));
    public static final DeferredHolder<Block, LightBlueWallSignBlock> LIGHT_BLUE_COLORED_WALL_SIGN = BLOCKS.register("light_blue_colored_wall_sign",
            () -> new LightBlueWallSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN), ModWoodTypes.LIGHT_BLUE));
    public static final DeferredHolder<Block, LightBlueHangingSignBlock> LIGHT_BLUE_COLORED_HANGING_SIGN = BLOCKS.register("light_blue_colored_hanging_sign",
            () -> new LightBlueHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.LIGHT_BLUE));
    public static final DeferredHolder<Block, LightBlueWallHangingSignBlock> LIGHT_BLUE_COLORED_WALL_HANGING_SIGN = BLOCKS.register("light_blue_colored_wall_hanging_sign",
            () -> new LightBlueWallHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.LIGHT_BLUE));
    
    public static final DeferredHolder<Block, LightGrayStandingSignBlock> LIGHT_GRAY_COLORED_SIGN = BLOCKS.register("light_gray_colored_sign",
            () -> new LightGrayStandingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN), ModWoodTypes.LIGHT_GRAY));
    public static final DeferredHolder<Block, LightGrayWallSignBlock> LIGHT_GRAY_COLORED_WALL_SIGN = BLOCKS.register("light_gray_colored_wall_sign",
            () -> new LightGrayWallSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN), ModWoodTypes.LIGHT_GRAY));
    public static final DeferredHolder<Block, LightGrayHangingSignBlock> LIGHT_GRAY_COLORED_HANGING_SIGN = BLOCKS.register("light_gray_colored_hanging_sign",
            () -> new LightGrayHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.LIGHT_GRAY));
    public static final DeferredHolder<Block, LightGrayWallHangingSignBlock> LIGHT_GRAY_COLORED_WALL_HANGING_SIGN = BLOCKS.register("light_gray_colored_wall_hanging_sign",
            () -> new LightGrayWallHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.LIGHT_GRAY));
    
    public static final DeferredHolder<Block, LimeStandingSignBlock> LIME_COLORED_SIGN = BLOCKS.register("lime_colored_sign",
            () -> new LimeStandingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN), ModWoodTypes.LIME));
    public static final DeferredHolder<Block, LimeWallSignBlock> LIME_COLORED_WALL_SIGN = BLOCKS.register("lime_colored_wall_sign",
            () -> new LimeWallSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN), ModWoodTypes.LIME));
    public static final DeferredHolder<Block, LimeHangingSignBlock> LIME_COLORED_HANGING_SIGN = BLOCKS.register("lime_colored_hanging_sign",
            () -> new LimeHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.LIME));
    public static final DeferredHolder<Block, LimeWallHangingSignBlock> LIME_COLORED_WALL_HANGING_SIGN = BLOCKS.register("lime_colored_wall_hanging_sign",
            () -> new LimeWallHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.LIME));
    
    public static final DeferredHolder<Block, MagentaStandingSignBlock> MAGENTA_COLORED_SIGN = BLOCKS.register("magenta_colored_sign",
            () -> new MagentaStandingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN), ModWoodTypes.MAGENTA));
    public static final DeferredHolder<Block, MagentaWallSignBlock> MAGENTA_COLORED_WALL_SIGN = BLOCKS.register("magenta_colored_wall_sign",
            () -> new MagentaWallSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN), ModWoodTypes.MAGENTA));
    public static final DeferredHolder<Block, MagentaHangingSignBlock> MAGENTA_COLORED_HANGING_SIGN = BLOCKS.register("magenta_colored_hanging_sign",
            () -> new MagentaHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.MAGENTA));
    public static final DeferredHolder<Block, MagentaWallHangingSignBlock> MAGENTA_COLORED_WALL_HANGING_SIGN = BLOCKS.register("magenta_colored_wall_hanging_sign",
            () -> new MagentaWallHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.MAGENTA));
    
    public static final DeferredHolder<Block, OrangeStandingSignBlock> ORANGE_COLORED_SIGN = BLOCKS.register("orange_colored_sign",
            () -> new OrangeStandingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN), ModWoodTypes.ORANGE));
    public static final DeferredHolder<Block, OrangeWallSignBlock> ORANGE_COLORED_WALL_SIGN = BLOCKS.register("orange_colored_wall_sign",
            () -> new OrangeWallSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN), ModWoodTypes.ORANGE));
    public static final DeferredHolder<Block, OrangeHangingSignBlock> ORANGE_COLORED_HANGING_SIGN = BLOCKS.register("orange_colored_hanging_sign",
            () -> new OrangeHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.ORANGE));
    public static final DeferredHolder<Block, OrangeWallHangingSignBlock> ORANGE_COLORED_WALL_HANGING_SIGN = BLOCKS.register("orange_colored_wall_hanging_sign",
            () -> new OrangeWallHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.ORANGE));
    
    public static final DeferredHolder<Block, PinkStandingSignBlock> PINK_COLORED_SIGN = BLOCKS.register("pink_colored_sign",
            () -> new PinkStandingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN), ModWoodTypes.PINK));
    public static final DeferredHolder<Block, PinkWallSignBlock> PINK_COLORED_WALL_SIGN = BLOCKS.register("pink_colored_wall_sign",
            () -> new PinkWallSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN), ModWoodTypes.PINK));
    public static final DeferredHolder<Block, PinkHangingSignBlock> PINK_COLORED_HANGING_SIGN = BLOCKS.register("pink_colored_hanging_sign",
            () -> new PinkHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.PINK));
    public static final DeferredHolder<Block, PinkWallHangingSignBlock> PINK_COLORED_WALL_HANGING_SIGN = BLOCKS.register("pink_colored_wall_hanging_sign",
            () -> new PinkWallHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.PINK));
    
    public static final DeferredHolder<Block, PurpleStandingSignBlock> PURPLE_COLORED_SIGN = BLOCKS.register("purple_colored_sign",
            () -> new PurpleStandingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN), ModWoodTypes.PURPLE));
    public static final DeferredHolder<Block, PurpleWallSignBlock> PURPLE_COLORED_WALL_SIGN = BLOCKS.register("purple_colored_wall_sign",
            () -> new PurpleWallSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN), ModWoodTypes.PURPLE));
    public static final DeferredHolder<Block, PurpleHangingSignBlock> PURPLE_COLORED_HANGING_SIGN = BLOCKS.register("purple_colored_hanging_sign",
            () -> new PurpleHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.PURPLE));
    public static final DeferredHolder<Block, PurpleWallHangingSignBlock> PURPLE_COLORED_WALL_HANGING_SIGN = BLOCKS.register("purple_colored_wall_hanging_sign",
            () -> new PurpleWallHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.PURPLE));
    
    public static final DeferredHolder<Block, RedStandingSignBlock> RED_COLORED_SIGN = BLOCKS.register("red_colored_sign",
            () -> new RedStandingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN), ModWoodTypes.RED));
    public static final DeferredHolder<Block, RedWallSignBlock> RED_COLORED_WALL_SIGN = BLOCKS.register("red_colored_wall_sign",
            () -> new RedWallSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN), ModWoodTypes.RED));
    public static final DeferredHolder<Block, RedHangingSignBlock> RED_COLORED_HANGING_SIGN = BLOCKS.register("red_colored_hanging_sign",
            () -> new RedHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.RED));
    public static final DeferredHolder<Block, RedWallHangingSignBlock> RED_COLORED_WALL_HANGING_SIGN = BLOCKS.register("red_colored_wall_hanging_sign",
            () -> new RedWallHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.RED));
    
    public static final DeferredHolder<Block, WhiteStandingSignBlock> WHITE_COLORED_SIGN = BLOCKS.register("white_colored_sign",
            () -> new WhiteStandingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN), ModWoodTypes.WHITE));
    public static final DeferredHolder<Block, WhiteWallSignBlock> WHITE_COLORED_WALL_SIGN = BLOCKS.register("white_colored_wall_sign",
            () -> new WhiteWallSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN), ModWoodTypes.WHITE));
    public static final DeferredHolder<Block, WhiteHangingSignBlock> WHITE_COLORED_HANGING_SIGN = BLOCKS.register("white_colored_hanging_sign",
            () -> new WhiteHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.WHITE));
    public static final DeferredHolder<Block, WhiteWallHangingSignBlock> WHITE_COLORED_WALL_HANGING_SIGN = BLOCKS.register("white_colored_wall_hanging_sign",
            () -> new WhiteWallHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.WHITE));
    
    public static final DeferredHolder<Block, YellowStandingSignBlock> YELLOW_COLORED_SIGN = BLOCKS.register("yellow_colored_sign",
            () -> new YellowStandingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN), ModWoodTypes.YELLOW));
    public static final DeferredHolder<Block, YellowWallSignBlock> YELLOW_COLORED_WALL_SIGN = BLOCKS.register("yellow_colored_wall_sign",
            () -> new YellowWallSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN), ModWoodTypes.YELLOW));
    public static final DeferredHolder<Block, YellowHangingSignBlock> YELLOW_COLORED_HANGING_SIGN = BLOCKS.register("yellow_colored_hanging_sign",
            () -> new YellowHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.YELLOW));
    public static final DeferredHolder<Block, YellowWallHangingSignBlock> YELLOW_COLORED_WALL_HANGING_SIGN = BLOCKS.register("yellow_colored_wall_hanging_sign",
            () -> new YellowWallHangingSignBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.YELLOW));

    //MARBLE

    public static final DeferredBlock<Block> MARBLE = registerBlock("marble",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MARBLE_SLAB = registerBlock("marble_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MARBLE_STAIRS = registerBlock("marble_stairs",
            () -> {BlockState blockState = ModBlocks.MARBLE.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> MARBLE_WALL = registerBlock("marble_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> MARBLE_BRICKS = registerBlock("marble_bricks",
            () -> new BrightFullBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1f).sound(SoundType.STONE)
                    .lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MARBLE_BRICK_SLAB = registerBlock("marble_brick_slab",
   () -> new BrightSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).strength(1f).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MARBLE_BRICK_STAIRS = registerBlock("marble_brick_stairs",
            () -> {BlockState blockState = ModBlocks.MARBLE_BRICKS.get().defaultBlockState();
                return new BrightStairBlock(blockState, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS).sound(SoundType.STONE).lightLevel(litBlockEmission(15)).requiresCorrectToolForDrops());});
    public static final DeferredBlock<Block> MARBLE_BRICK_WALL = registerBlock("marble_brick_wall",
            () -> new BrightWallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL).lightLevel(litBlockEmission(15)).strength(1f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    
    //Colored Leaves

    public static final DeferredBlock<Block> WHITE_COLORED_LEAVES = registerBlock("white_colored_leaves",
            () -> new FlammableBrightLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).sound(SoundType.GRASS)
                    .noOcclusion()
                    .lightLevel(litBlockEmission(15)).isSuffocating((state, world, pos) -> false)
            ));
    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_LEAVES = registerBlock("light_gray_colored_leaves",
            () -> new FlammableBrightLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).sound(SoundType.GRASS)
                    .noOcclusion()
                    .lightLevel(litBlockEmission(15)).isSuffocating((state, world, pos) -> false)
            ));
    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_LEAVES = registerBlock("light_blue_colored_leaves",
            () -> new FlammableBrightLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).sound(SoundType.GRASS)
                    .noOcclusion()
                    .lightLevel(litBlockEmission(15)).isSuffocating((state, world, pos) -> false)
            ));
    public static final DeferredBlock<Block> BLUE_COLORED_LEAVES = registerBlock("blue_colored_leaves",
            () -> new FlammableBrightLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).sound(SoundType.GRASS)
                    .noOcclusion()
                    .lightLevel(litBlockEmission(15)).isSuffocating((state, world, pos) -> false)
            ));
    public static final DeferredBlock<Block> GRAY_COLORED_LEAVES = registerBlock("gray_colored_leaves",
            () -> new FlammableBrightLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).sound(SoundType.GRASS)
                    .noOcclusion()
                    .lightLevel(litBlockEmission(15)).isSuffocating((state, world, pos) -> false)
            ));
    public static final DeferredBlock<Block> PINK_COLORED_LEAVES = registerBlock("pink_colored_leaves",
            () -> new FlammableBrightLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).sound(SoundType.GRASS)
                    .noOcclusion()
                    .lightLevel(litBlockEmission(15)).isSuffocating((state, world, pos) -> false)
            ));
    public static final DeferredBlock<Block> GREEN_COLORED_LEAVES = registerBlock("green_colored_leaves",
            () -> new FlammableBrightLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).sound(SoundType.GRASS)
                    .noOcclusion()
                    .lightLevel(litBlockEmission(15)).isSuffocating((state, world, pos) -> false)
            ));
    public static final DeferredBlock<Block> LIME_COLORED_LEAVES = registerBlock("lime_colored_leaves",
            () -> new FlammableBrightLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).sound(SoundType.GRASS)
                    .noOcclusion()
                    .lightLevel(litBlockEmission(15)).isSuffocating((state, world, pos) -> false)
            ));
    public static final DeferredBlock<Block> YELLOW_COLORED_LEAVES = registerBlock("yellow_colored_leaves",
            () -> new FlammableBrightLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).sound(SoundType.GRASS)
                    .noOcclusion()
                    .lightLevel(litBlockEmission(15)).isSuffocating((state, world, pos) -> false)
            ));
    public static final DeferredBlock<Block> MAGENTA_COLORED_LEAVES = registerBlock("magenta_colored_leaves",
            () -> new FlammableBrightLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).sound(SoundType.GRASS)
                    .noOcclusion()
                    .lightLevel(litBlockEmission(15)).isSuffocating((state, world, pos) -> false)
            ));
    public static final DeferredBlock<Block> PURPLE_COLORED_LEAVES = registerBlock("purple_colored_leaves",
            () -> new FlammableBrightLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).sound(SoundType.GRASS)
                    .noOcclusion()
                    .lightLevel(litBlockEmission(15)).isSuffocating((state, world, pos) -> false)
            ));
    public static final DeferredBlock<Block> BLACK_COLORED_LEAVES = registerBlock("black_colored_leaves",
            () -> new FlammableBrightLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).sound(SoundType.GRASS)
                    .noOcclusion()
                    .lightLevel(litBlockEmission(15)).isSuffocating((state, world, pos) -> false)
            ));
    public static final DeferredBlock<Block> CYAN_COLORED_LEAVES = registerBlock("cyan_colored_leaves",
            () -> new FlammableBrightLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).sound(SoundType.GRASS)
                    .noOcclusion()
                    .lightLevel(litBlockEmission(15)).isSuffocating((state, world, pos) -> false)
            ));
    public static final DeferredBlock<Block> BROWN_COLORED_LEAVES = registerBlock("brown_colored_leaves",
            () -> new FlammableBrightLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).sound(SoundType.GRASS)
                    .noOcclusion()
                    .lightLevel(litBlockEmission(15)).isSuffocating((state, world, pos) -> false)
            ));
    public static final DeferredBlock<Block> RED_COLORED_LEAVES = registerBlock("red_colored_leaves",
            () -> new FlammableBrightLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).sound(SoundType.GRASS)
                    .noOcclusion()
                    .lightLevel(litBlockEmission(15)).isSuffocating((state, world, pos) -> false)
            ));
    public static final DeferredBlock<Block> ORANGE_COLORED_LEAVES = registerBlock("orange_colored_leaves",
            () -> new FlammableBrightLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).sound(SoundType.GRASS)
                    .noOcclusion()
                    .lightLevel(litBlockEmission(15)).isSuffocating((state, world, pos) -> false)
                    ));

    //Colored Saplings

    public static final DeferredBlock<Block> WHITE_COLORED_SAPLING = registerBlock("white_colored_sapling",
            () -> new SaplingBlock(new TreeGrower("white_tree", Optional.empty(), Optional.ofNullable(ModConfiguredFeatures.WHITE_TREE_KEY), Optional.empty()), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING).sound(SoundType.GRASS)
                    ));
    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_SAPLING = registerBlock("light_gray_colored_sapling",
            () -> new SaplingBlock(new TreeGrower("light_gray_tree", Optional.empty(), Optional.ofNullable(ModConfiguredFeatures.LIGHT_GRAY_TREE_KEY), Optional.empty()), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING).sound(SoundType.GRASS)
                    ));
    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_SAPLING = registerBlock("light_blue_colored_sapling",
            () -> new SaplingBlock(new TreeGrower("light_blue_tree", Optional.empty(), Optional.ofNullable(ModConfiguredFeatures.LIGHT_BLUE_TREE_KEY), Optional.empty()), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING).sound(SoundType.GRASS)
                    ));
    public static final DeferredBlock<Block> BLUE_COLORED_SAPLING = registerBlock("blue_colored_sapling",
            () -> new SaplingBlock(new TreeGrower("blue_tree", Optional.empty(), Optional.ofNullable(ModConfiguredFeatures.BLUE_TREE_KEY), Optional.empty()), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING).sound(SoundType.GRASS)
                    ));
    public static final DeferredBlock<Block> GRAY_COLORED_SAPLING = registerBlock("gray_colored_sapling",
            () -> new SaplingBlock(new TreeGrower("gray_tree", Optional.empty(), Optional.ofNullable(ModConfiguredFeatures.GRAY_TREE_KEY), Optional.empty()), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING).sound(SoundType.GRASS)
                    ));
    public static final DeferredBlock<Block> PINK_COLORED_SAPLING = registerBlock("pink_colored_sapling",
            () -> new SaplingBlock(new TreeGrower("pink_tree", Optional.empty(), Optional.ofNullable(ModConfiguredFeatures.PINK_TREE_KEY), Optional.empty()), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING).sound(SoundType.GRASS)
                    ));
    public static final DeferredBlock<Block> GREEN_COLORED_SAPLING = registerBlock("green_colored_sapling",
            () -> new SaplingBlock(new TreeGrower("green_tree", Optional.empty(), Optional.ofNullable(ModConfiguredFeatures.GREEN_TREE_KEY), Optional.empty()), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING).sound(SoundType.GRASS)
                    ));
    public static final DeferredBlock<Block> LIME_COLORED_SAPLING = registerBlock("lime_colored_sapling",
            () -> new SaplingBlock(new TreeGrower("lime_tree", Optional.empty(), Optional.ofNullable(ModConfiguredFeatures.LIME_TREE_KEY), Optional.empty()), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING).sound(SoundType.GRASS)
                    ));
    public static final DeferredBlock<Block> YELLOW_COLORED_SAPLING = registerBlock("yellow_colored_sapling",
            () -> new SaplingBlock(new TreeGrower("yellow_tree", Optional.empty(), Optional.ofNullable(ModConfiguredFeatures.YELLOW_TREE_KEY), Optional.empty()), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING).sound(SoundType.GRASS)
                    ));
    public static final DeferredBlock<Block> MAGENTA_COLORED_SAPLING = registerBlock("magenta_colored_sapling",
            () -> new SaplingBlock(new TreeGrower("magenta_tree", Optional.empty(), Optional.ofNullable(ModConfiguredFeatures.MAGENTA_TREE_KEY), Optional.empty()), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING).sound(SoundType.GRASS)
                    ));
    public static final DeferredBlock<Block> PURPLE_COLORED_SAPLING = registerBlock("purple_colored_sapling",
            () -> new SaplingBlock(new TreeGrower("purple_tree", Optional.empty(), Optional.ofNullable(ModConfiguredFeatures.PURPLE_TREE_KEY), Optional.empty()), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING).sound(SoundType.GRASS)
                    ));
    public static final DeferredBlock<Block> BLACK_COLORED_SAPLING = registerBlock("black_colored_sapling",
            () -> new SaplingBlock(new TreeGrower("black_tree", Optional.empty(), Optional.ofNullable(ModConfiguredFeatures.BLACK_TREE_KEY), Optional.empty()), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING).sound(SoundType.GRASS)
                    ));
    public static final DeferredBlock<Block> CYAN_COLORED_SAPLING = registerBlock("cyan_colored_sapling",
            () -> new SaplingBlock(new TreeGrower("cyan_tree", Optional.empty(), Optional.ofNullable(ModConfiguredFeatures.CYAN_TREE_KEY), Optional.empty()), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING).sound(SoundType.GRASS)
                    ));
    public static final DeferredBlock<Block> BROWN_COLORED_SAPLING = registerBlock("brown_colored_sapling",
            () -> new SaplingBlock(new TreeGrower("brown_tree", Optional.empty(), Optional.ofNullable(ModConfiguredFeatures.BROWN_TREE_KEY), Optional.empty()), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING).sound(SoundType.GRASS)
                    ));
    public static final DeferredBlock<Block> RED_COLORED_SAPLING = registerBlock("red_colored_sapling",
            () -> new SaplingBlock(new TreeGrower("red_tree", Optional.empty(), Optional.ofNullable(ModConfiguredFeatures.RED_TREE_KEY), Optional.empty()), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING).sound(SoundType.GRASS)
                    ));
    public static final DeferredBlock<Block> ORANGE_COLORED_SAPLING = registerBlock("orange_colored_sapling",
            () -> new SaplingBlock(new TreeGrower("orange_tree", Optional.empty(), Optional.ofNullable(ModConfiguredFeatures.ORANGE_TREE_KEY), Optional.empty()), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING).sound(SoundType.GRASS)
                    ));

    //CRAFTING TABLES

    public static final DeferredBlock<Block> WHITE_COLORED_STONE_CRAFTING_TABLE = registerBlock("white_colored_stone_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> ORANGE_COLORED_STONE_CRAFTING_TABLE = registerBlock("orange_colored_stone_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> MAGENTA_COLORED_STONE_CRAFTING_TABLE = registerBlock("magenta_colored_stone_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_STONE_CRAFTING_TABLE = registerBlock("light_blue_colored_stone_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> YELLOW_COLORED_STONE_CRAFTING_TABLE = registerBlock("yellow_colored_stone_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> LIME_COLORED_STONE_CRAFTING_TABLE = registerBlock("lime_colored_stone_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> PINK_COLORED_STONE_CRAFTING_TABLE = registerBlock("pink_colored_stone_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> GRAY_COLORED_STONE_CRAFTING_TABLE = registerBlock("gray_colored_stone_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_STONE_CRAFTING_TABLE = registerBlock("light_gray_colored_stone_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> CYAN_COLORED_STONE_CRAFTING_TABLE = registerBlock("cyan_colored_stone_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> PURPLE_COLORED_STONE_CRAFTING_TABLE = registerBlock("purple_colored_stone_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> BLUE_COLORED_STONE_CRAFTING_TABLE = registerBlock("blue_colored_stone_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> BROWN_COLORED_STONE_CRAFTING_TABLE = registerBlock("brown_colored_stone_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> GREEN_COLORED_STONE_CRAFTING_TABLE = registerBlock("green_colored_stone_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> RED_COLORED_STONE_CRAFTING_TABLE = registerBlock("red_colored_stone_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> BLACK_COLORED_STONE_CRAFTING_TABLE = registerBlock("black_colored_stone_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).lightLevel(litBlockEmission(15))));



    public static final DeferredBlock<Block> WHITE_COLORED_WOODEN_PLANK_CRAFTING_TABLE = registerBlock("white_colored_wooden_plank_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> ORANGE_COLORED_WOODEN_PLANK_CRAFTING_TABLE = registerBlock("orange_colored_wooden_plank_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> MAGENTA_COLORED_WOODEN_PLANK_CRAFTING_TABLE = registerBlock("magenta_colored_wooden_plank_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> LIGHT_BLUE_COLORED_WOODEN_PLANK_CRAFTING_TABLE = registerBlock("light_blue_colored_wooden_plank_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> YELLOW_COLORED_WOODEN_PLANK_CRAFTING_TABLE = registerBlock("yellow_colored_wooden_plank_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> LIME_COLORED_WOODEN_PLANK_CRAFTING_TABLE = registerBlock("lime_colored_wooden_plank_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> PINK_COLORED_WOODEN_PLANK_CRAFTING_TABLE = registerBlock("pink_colored_wooden_plank_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> GRAY_COLORED_WOODEN_PLANK_CRAFTING_TABLE = registerBlock("gray_colored_wooden_plank_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> LIGHT_GRAY_COLORED_WOODEN_PLANK_CRAFTING_TABLE = registerBlock("light_gray_colored_wooden_plank_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> CYAN_COLORED_WOODEN_PLANK_CRAFTING_TABLE = registerBlock("cyan_colored_wooden_plank_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> PURPLE_COLORED_WOODEN_PLANK_CRAFTING_TABLE = registerBlock("purple_colored_wooden_plank_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> BLUE_COLORED_WOODEN_PLANK_CRAFTING_TABLE = registerBlock("blue_colored_wooden_plank_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> BROWN_COLORED_WOODEN_PLANK_CRAFTING_TABLE = registerBlock("brown_colored_wooden_plank_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> GREEN_COLORED_WOODEN_PLANK_CRAFTING_TABLE = registerBlock("green_colored_wooden_plank_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> RED_COLORED_WOODEN_PLANK_CRAFTING_TABLE = registerBlock("red_colored_wooden_plank_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).lightLevel(litBlockEmission(15))));

    public static final DeferredBlock<Block> BLACK_COLORED_WOODEN_PLANK_CRAFTING_TABLE = registerBlock("black_colored_wooden_plank_crafting_table",
            () -> new BrightCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE).lightLevel(litBlockEmission(15))));

    private static ToIntFunction<BlockState> litBlockEmission(int lightLevel) {
        return (blockState) -> blockState.getValue(BlockStateProperties.LIT) ? lightLevel : 0;
    }

    private static <T extends Block> DeferredBlock<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return (DeferredBlock<T>) BLOCKS.register(name, block);
    }

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = (DeferredBlock<T>) BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));

    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
