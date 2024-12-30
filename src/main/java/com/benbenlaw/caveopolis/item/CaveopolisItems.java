package com.benbenlaw.caveopolis.item;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.CaveopolisBlocks;
import com.benbenlaw.core.block.colored.*;
import com.benbenlaw.core.item.CoreDataComponents;
import com.benbenlaw.core.item.colored.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CaveopolisItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Caveopolis.MOD_ID);

    //Colored Crafting Table
    public static final DeferredItem<Item> COLORED_CRAFTING_TABLE = ITEMS.register("colored_crafting_table",
            () -> new ColoredBlockItem((ColoredCraftingTable) CaveopolisBlocks.COLORED_CRAFTING_TABLE.get(), new ColoredItemProperties()));

    //Misc Items
    public static final DeferredItem<Item> WORKTABLE = ITEMS.register("worktable",
            () -> new WorktableItem(new ColoredItemProperties()));

    public static final DeferredItem<Item> COLORED_SAPLING = ITEMS.register("colored_sapling",
            () -> new ColoredBlockItem((ColoredSapling) CaveopolisBlocks.COLORED_SAPLING.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_APPLE = ITEMS.register("colored_apple",
            () -> new ColoredItem(new Item.Properties().food(Foods.APPLE)));


    //Spray Cans
    public static final DeferredItem<Item> BLUE_SPRAY_CAN = ITEMS.register("blue_spray_can",
            () -> new ColoringItem(new Item.Properties().durability(2048)
                    .craftRemainder(BuiltInRegistries.ITEM.get(ResourceLocation.parse("caveopolie:blue_spray_can")))
                    , DyeColor.BLUE));
    public static final DeferredItem<Item> RED_SPRAY_CAN = ITEMS.register("red_spray_can",
            () -> new ColoringItem(new Item.Properties().durability(2048)
                    .craftRemainder(BuiltInRegistries.ITEM.get(ResourceLocation.parse("caveopolis:red_spray_can")))
                    , DyeColor.RED));
    public static final DeferredItem<Item> GREEN_SPRAY_CAN = ITEMS.register("green_spray_can",
            () -> new ColoringItem(new Item.Properties().durability(2048)
                    .craftRemainder(BuiltInRegistries.ITEM.get(ResourceLocation.parse("caveopolis:green_spray_can")))
                    , DyeColor.GREEN));
    public static final DeferredItem<Item> YELLOW_SPRAY_CAN = ITEMS.register("yellow_spray_can",
            () -> new ColoringItem(new Item.Properties().durability(2048)
                    .craftRemainder(BuiltInRegistries.ITEM.get(ResourceLocation.parse("caveopolis:yellow_spray_can")))
                    ,DyeColor.YELLOW));
    public static final DeferredItem<Item> PINK_SPRAY_CAN = ITEMS.register("pink_spray_can",
            () -> new ColoringItem(new Item.Properties().durability(2048)
                    .craftRemainder(BuiltInRegistries.ITEM.get(ResourceLocation.parse("caveopolis:pink_spray_can")))
                    , DyeColor.PINK));
    public static final DeferredItem<Item> ORANGE_SPRAY_CAN = ITEMS.register("orange_spray_can",
            () -> new ColoringItem(new Item.Properties().durability(2048)
                    .craftRemainder(BuiltInRegistries.ITEM.get(ResourceLocation.parse("caveopolis:orange_spray_can")))
                    , DyeColor.ORANGE));
    public static final DeferredItem<Item> PURPLE_SPRAY_CAN = ITEMS.register("purple_spray_can",
            () -> new ColoringItem(new Item.Properties().durability(2048)
                    .craftRemainder(BuiltInRegistries.ITEM.get(ResourceLocation.parse("caveopolis:purple_spray_can")))
                    , DyeColor.PURPLE));
    public static final DeferredItem<Item> WHITE_SPRAY_CAN = ITEMS.register("white_spray_can",
            () -> new ColoringItem(new Item.Properties().durability(2048)
                    .craftRemainder(BuiltInRegistries.ITEM.get(ResourceLocation.parse("caveopolis:white_spray_can"))),
                    DyeColor.WHITE));
    public static final DeferredItem<Item> BLACK_SPRAY_CAN = ITEMS.register("black_spray_can",
            () -> new ColoringItem(new Item.Properties().durability(2048)
                    .craftRemainder(BuiltInRegistries.ITEM.get(ResourceLocation.parse("caveopolis:black_spray_can")))
                    , DyeColor.BLACK));
    public static final DeferredItem<Item> BROWN_SPRAY_CAN = ITEMS.register("brown_spray_can",
            () -> new ColoringItem(new Item.Properties().durability(2048)
                    .craftRemainder(BuiltInRegistries.ITEM.get(ResourceLocation.parse("caveopolis:brown_spray_can")))
                    , DyeColor.BROWN));
    public static final DeferredItem<Item> CYAN_SPRAY_CAN = ITEMS.register("cyan_spray_can",
            () -> new ColoringItem(new Item.Properties().durability(2048)
                    .craftRemainder(BuiltInRegistries.ITEM.get(ResourceLocation.parse("caveopolis:cyan_spray_can")))
                    , DyeColor.CYAN));
    public static final DeferredItem<Item> GRAY_SPRAY_CAN = ITEMS.register("gray_spray_can",
            () -> new ColoringItem(new Item.Properties().durability(2048)
                    .craftRemainder(BuiltInRegistries.ITEM.get(ResourceLocation.parse("caveopolis:gray_spray_can")))
                    , DyeColor.GRAY));
    public static final DeferredItem<Item> LIGHT_BLUE_SPRAY_CAN = ITEMS.register("light_blue_spray_can",
            () -> new ColoringItem(new Item.Properties().durability(2048)
                    .craftRemainder(BuiltInRegistries.ITEM.get(ResourceLocation.parse("caveopolis:light_blue_spray_can")))
                    , DyeColor.LIGHT_BLUE));
    public static final DeferredItem<Item> LIGHT_GRAY_SPRAY_CAN = ITEMS.register("light_gray_spray_can",
            () -> new ColoringItem(new Item.Properties().durability(2048)
                    .craftRemainder(BuiltInRegistries.ITEM.get(ResourceLocation.parse("caveopolis:light_gray_spray_can")))
                    , DyeColor.LIGHT_GRAY));
    public static final DeferredItem<Item> LIME_SPRAY_CAN = ITEMS.register("lime_spray_can",
            () -> new ColoringItem(new Item.Properties().durability(2048)
                    .craftRemainder(BuiltInRegistries.ITEM.get(ResourceLocation.parse("caveopolis:lime_spray_can")))
                    , DyeColor.LIME));
    public static final DeferredItem<Item> MAGENTA_SPRAY_CAN = ITEMS.register("magenta_spray_can",
            () -> new ColoringItem(new Item.Properties().durability(2048)
                    .craftRemainder(BuiltInRegistries.ITEM.get(ResourceLocation.parse("caveopolis:magenta_spray_can")))
                    , DyeColor.MAGENTA));
    public static final DeferredItem<Item> GLOWSTONE_SPRAY_CAN = ITEMS.register("glowstone_spray_can",
            () -> new LightingItem(new Item.Properties().durability(2048)
                    .craftRemainder(BuiltInRegistries.ITEM.get(ResourceLocation.parse("caveopolis:glowstone_spray_can")))
            ));

    //Colored Flowers
    public static final DeferredItem<Item> COLORED_POPPY = ITEMS.register("colored_poppy",
            () -> new ColoredBlockItem((ColoredFlower) CaveopolisBlocks.COLORED_POPPY.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_DANDELION = ITEMS.register("colored_dandelion",
            () -> new ColoredBlockItem((ColoredFlower) CaveopolisBlocks.COLORED_DANDELION.get(), new ColoredItemProperties()));

    //Colored Tile
    public static final DeferredItem<Item> COLORED_TILE = ITEMS.register("colored_tile",
            () -> new ColoredBlockItem((ColoredBlock) CaveopolisBlocks.COLORED_TILE.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_TILE_STAIRS = ITEMS.register("colored_tile_stairs",
            () -> new ColoredBlockItem((ColoredStairs) CaveopolisBlocks.COLORED_TILE_STAIRS.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_TILE_SLAB = ITEMS.register("colored_tile_slab",
            () -> new ColoredBlockItem((ColoredSlab) CaveopolisBlocks.COLORED_TILE_SLAB.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_TILE_WALL = ITEMS.register("colored_tile_wall",
            () -> new ColoredBlockItem((ColoredWall) CaveopolisBlocks.COLORED_TILE_WALL.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_TILE_PRESSURE_PLATE = ITEMS.register("colored_tile_pressure_plate",
            () -> new ColoredBlockItem((ColoredPressurePlate) CaveopolisBlocks.COLORED_TILE_PRESSURE_PLATE.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_TILE_BUTTON = ITEMS.register("colored_tile_button",
            () -> new ColoredBlockItem((ColoredButton) CaveopolisBlocks.COLORED_TILE_BUTTON.get(), new ColoredItemProperties()));


    //Colored Polished Stone
    public static final DeferredItem<Item> COLORED_POLISHED_STONE = ITEMS.register("colored_polished_stone",
            () -> new ColoredBlockItem((ColoredBlock) CaveopolisBlocks.COLORED_POLISHED_STONE.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_POLISHED_STONE_STAIRS = ITEMS.register("colored_polished_stone_stairs",
            () -> new ColoredBlockItem((ColoredStairs) CaveopolisBlocks.COLORED_POLISHED_STONE_STAIRS.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_POLISHED_STONE_SLAB = ITEMS.register("colored_polished_stone_slab",
            () -> new ColoredBlockItem((ColoredSlab) CaveopolisBlocks.COLORED_POLISHED_STONE_SLAB.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_POLISHED_STONE_WALL = ITEMS.register("colored_polished_stone_wall",
            () -> new ColoredBlockItem((ColoredWall) CaveopolisBlocks.COLORED_POLISHED_STONE_WALL.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_POLISHED_STONE_PRESSURE_PLATE = ITEMS.register("colored_polished_stone_pressure_plate",
            () -> new ColoredBlockItem((ColoredPressurePlate) CaveopolisBlocks.COLORED_POLISHED_STONE_PRESSURE_PLATE.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_POLISHED_STONE_BUTTON = ITEMS.register("colored_polished_stone_button",
            () -> new ColoredBlockItem((ColoredButton) CaveopolisBlocks.COLORED_POLISHED_STONE_BUTTON.get(), new ColoredItemProperties()));


    //Colored Stone
    public static final DeferredItem<Item> COLORED_STONE = ITEMS.register("colored_stone",
            () -> new ColoredBlockItem((ColoredBlock) CaveopolisBlocks.COLORED_STONE.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_STONE_STAIRS = ITEMS.register("colored_stone_stairs",
            () -> new ColoredBlockItem((ColoredStairs) CaveopolisBlocks.COLORED_STONE_STAIRS.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_STONE_SLAB = ITEMS.register("colored_stone_slab",
            () -> new ColoredBlockItem((ColoredSlab) CaveopolisBlocks.COLORED_STONE_SLAB.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_STONE_WALL = ITEMS.register("colored_stone_wall",
            () -> new ColoredBlockItem((ColoredWall) CaveopolisBlocks.COLORED_STONE_WALL.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_STONE_PRESSURE_PLATE = ITEMS.register("colored_stone_pressure_plate",
            () -> new ColoredBlockItem((ColoredPressurePlate) CaveopolisBlocks.COLORED_STONE_PRESSURE_PLATE.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_STONE_BUTTON = ITEMS.register("colored_stone_button",
            () -> new ColoredBlockItem((ColoredButton) CaveopolisBlocks.COLORED_STONE_BUTTON.get(), new ColoredItemProperties()));

    //Colored Stone Bricks
    public static final DeferredItem<Item> COLORED_STONE_BRICKS = ITEMS.register("colored_stone_bricks",
            () -> new ColoredBlockItem((ColoredBlock) CaveopolisBlocks.COLORED_STONE_BRICKS.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_STONE_BRICK_STAIRS = ITEMS.register("colored_stone_brick_stairs",
            () -> new ColoredBlockItem((ColoredStairs) CaveopolisBlocks.COLORED_STONE_BRICK_STAIRS.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_STONE_BRICK_SLAB = ITEMS.register("colored_stone_brick_slab",
            () -> new ColoredBlockItem((ColoredSlab) CaveopolisBlocks.COLORED_STONE_BRICK_SLAB.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_STONE_BRICK_WALL = ITEMS.register("colored_stone_brick_wall",
            () -> new ColoredBlockItem((ColoredWall) CaveopolisBlocks.COLORED_STONE_BRICK_WALL.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_STONE_BRICK_PRESSURE_PLATE = ITEMS.register("colored_stone_brick_pressure_plate",
            () -> new ColoredBlockItem((ColoredPressurePlate) CaveopolisBlocks.COLORED_STONE_BRICK_PRESSURE_PLATE.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_STONE_BRICK_BUTTON = ITEMS.register("colored_stone_brick_button",
            () -> new ColoredBlockItem((ColoredButton) CaveopolisBlocks.COLORED_STONE_BRICK_BUTTON.get(), new ColoredItemProperties()));

    //Colored Bricks
    public static final DeferredItem<Item> COLORED_BRICKS = ITEMS.register("colored_bricks",
            () -> new ColoredBlockItem((ColoredBlock) CaveopolisBlocks.COLORED_BRICKS.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_BRICK_STAIRS = ITEMS.register("colored_brick_stairs",
            () -> new ColoredBlockItem((ColoredStairs) CaveopolisBlocks.COLORED_BRICK_STAIRS.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_BRICK_SLAB = ITEMS.register("colored_brick_slab",
            () -> new ColoredBlockItem((ColoredSlab) CaveopolisBlocks.COLORED_BRICK_SLAB.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_BRICK_WALL = ITEMS.register("colored_brick_wall",
            () -> new ColoredBlockItem((ColoredWall) CaveopolisBlocks.COLORED_BRICK_WALL.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_BRICK_PRESSURE_PLATE = ITEMS.register("colored_brick_pressure_plate",
            () -> new ColoredBlockItem((ColoredPressurePlate) CaveopolisBlocks.COLORED_BRICK_PRESSURE_PLATE.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_BRICK_BUTTON = ITEMS.register("colored_brick_button",
            () -> new ColoredBlockItem((ColoredButton) CaveopolisBlocks.COLORED_BRICK_BUTTON.get(), new ColoredItemProperties()));

    //Colored Cobblestone
    public static final DeferredItem<Item> COLORED_COBBLESTONE = ITEMS.register("colored_cobblestone",
            () -> new ColoredBlockItem((ColoredBlock) CaveopolisBlocks.COLORED_COBBLESTONE.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_COBBLESTONE_STAIRS = ITEMS.register("colored_cobblestone_stairs",
            () -> new ColoredBlockItem((ColoredStairs) CaveopolisBlocks.COLORED_COBBLESTONE_STAIRS.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_COBBLESTONE_SLAB = ITEMS.register("colored_cobblestone_slab",
            () -> new ColoredBlockItem((ColoredSlab) CaveopolisBlocks.COLORED_COBBLESTONE_SLAB.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_COBBLESTONE_WALL = ITEMS.register("colored_cobblestone_wall",
            () -> new ColoredBlockItem((ColoredWall) CaveopolisBlocks.COLORED_COBBLESTONE_WALL.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_COBBLESTONE_PRESSURE_PLATE = ITEMS.register("colored_cobblestone_pressure_plate",
            () -> new ColoredBlockItem((ColoredPressurePlate) CaveopolisBlocks.COLORED_COBBLESTONE_PRESSURE_PLATE.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_COBBLESTONE_BUTTON = ITEMS.register("colored_cobblestone_button",
            () -> new ColoredBlockItem((ColoredButton) CaveopolisBlocks.COLORED_COBBLESTONE_BUTTON.get(), new ColoredItemProperties()));

    //Colored Cobblestone Bricks
    public static final DeferredItem<Item> COLORED_COBBLESTONE_BRICKS = ITEMS.register("colored_cobblestone_bricks",
            () -> new ColoredBlockItem((ColoredBlock) CaveopolisBlocks.COLORED_COBBLESTONE_BRICKS.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_COBBLESTONE_BRICK_STAIRS = ITEMS.register("colored_cobblestone_brick_stairs",
            () -> new ColoredBlockItem((ColoredStairs) CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_STAIRS.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_COBBLESTONE_BRICK_SLAB = ITEMS.register("colored_cobblestone_brick_slab",
            () -> new ColoredBlockItem((ColoredSlab) CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_SLAB.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_COBBLESTONE_BRICK_WALL = ITEMS.register("colored_cobblestone_brick_wall",
            () -> new ColoredBlockItem((ColoredWall) CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_WALL.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_COBBLESTONE_BRICK_PRESSURE_PLATE = ITEMS.register("colored_cobblestone_brick_pressure_plate",
            () -> new ColoredBlockItem((ColoredPressurePlate) CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_PRESSURE_PLATE.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_COBBLESTONE_BRICK_BUTTON = ITEMS.register("colored_cobblestone_brick_button",
            () -> new ColoredBlockItem((ColoredButton) CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_BUTTON.get(), new ColoredItemProperties()));

    //Colored Marble
    public static final DeferredItem<Item> COLORED_MARBLE = ITEMS.register("colored_marble",
            () -> new ColoredBlockItem((ColoredBlock) CaveopolisBlocks.COLORED_MARBLE.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_MARBLE_STAIRS = ITEMS.register("colored_marble_stairs",
            () -> new ColoredBlockItem((ColoredStairs) CaveopolisBlocks.COLORED_MARBLE_STAIRS.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_MARBLE_SLAB = ITEMS.register("colored_marble_slab",
            () -> new ColoredBlockItem((ColoredSlab) CaveopolisBlocks.COLORED_MARBLE_SLAB.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_MARBLE_WALL = ITEMS.register("colored_marble_wall",
            () -> new ColoredBlockItem((ColoredWall) CaveopolisBlocks.COLORED_MARBLE_WALL.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_MARBLE_PRESSURE_PLATE = ITEMS.register("colored_marble_pressure_plate",
            () -> new ColoredBlockItem((ColoredPressurePlate) CaveopolisBlocks.COLORED_MARBLE_PRESSURE_PLATE.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_MARBLE_BUTTON = ITEMS.register("colored_marble_button",
            () -> new ColoredBlockItem((ColoredButton) CaveopolisBlocks.COLORED_MARBLE_BUTTON.get(), new ColoredItemProperties()));

    //Colored Marble Bricks
    public static final DeferredItem<Item> COLORED_MARBLE_BRICKS = ITEMS.register("colored_marble_bricks",
            () -> new ColoredBlockItem((ColoredBlock) CaveopolisBlocks.COLORED_MARBLE_BRICKS.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_MARBLE_BRICK_STAIRS = ITEMS.register("colored_marble_brick_stairs",
            () -> new ColoredBlockItem((ColoredStairs) CaveopolisBlocks.COLORED_MARBLE_BRICK_STAIRS.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_MARBLE_BRICK_SLAB = ITEMS.register("colored_marble_brick_slab",
            () -> new ColoredBlockItem((ColoredSlab) CaveopolisBlocks.COLORED_MARBLE_BRICK_SLAB.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_MARBLE_BRICK_WALL = ITEMS.register("colored_marble_brick_wall",
            () -> new ColoredBlockItem((ColoredWall) CaveopolisBlocks.COLORED_MARBLE_BRICK_WALL.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_MARBLE_BRICK_PRESSURE_PLATE = ITEMS.register("colored_marble_brick_pressure_plate",
            () -> new ColoredBlockItem((ColoredPressurePlate) CaveopolisBlocks.COLORED_MARBLE_BRICK_PRESSURE_PLATE.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_MARBLE_BRICK_BUTTON = ITEMS.register("colored_marble_brick_button",
            () -> new ColoredBlockItem((ColoredButton) CaveopolisBlocks.COLORED_MARBLE_BRICK_BUTTON.get(), new ColoredItemProperties()));





    //Colored Mosaic
    public static final DeferredItem<Item> COLORED_MOSAIC = ITEMS.register("colored_mosaic",
            () -> new ColoredBlockItem((ColoredBlock) CaveopolisBlocks.COLORED_MOSAIC.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_MOSAIC_STAIRS = ITEMS.register("colored_mosaic_stairs",
            () -> new ColoredBlockItem((ColoredStairs) CaveopolisBlocks.COLORED_MOSAIC_STAIRS.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_MOSAIC_SLAB = ITEMS.register("colored_mosaic_slab",
            () -> new ColoredBlockItem((ColoredSlab) CaveopolisBlocks.COLORED_MOSAIC_SLAB.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_MOSAIC_WALL = ITEMS.register("colored_mosaic_wall",
            () -> new ColoredBlockItem((ColoredWall) CaveopolisBlocks.COLORED_MOSAIC_WALL.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_MOSAIC_PRESSURE_PLATE = ITEMS.register("colored_mosaic_pressure_plate",
            () -> new ColoredBlockItem((ColoredPressurePlate) CaveopolisBlocks.COLORED_MOSAIC_PRESSURE_PLATE.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_MOSAIC_BUTTON = ITEMS.register("colored_mosaic_button",
            () -> new ColoredBlockItem((ColoredButton) CaveopolisBlocks.COLORED_MOSAIC_BUTTON.get(), new ColoredItemProperties()));

    //Colored Chaotic
    public static final DeferredItem<Item> COLORED_CHAOTIC = ITEMS.register("colored_chaotic",
            () -> new ColoredBlockItem((ColoredBlock) CaveopolisBlocks.COLORED_CHAOTIC.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_CHAOTIC_STAIRS = ITEMS.register("colored_chaotic_stairs",
            () -> new ColoredBlockItem((ColoredStairs) CaveopolisBlocks.COLORED_CHAOTIC_STAIRS.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_CHAOTIC_SLAB = ITEMS.register("colored_chaotic_slab",
            () -> new ColoredBlockItem((ColoredSlab) CaveopolisBlocks.COLORED_CHAOTIC_SLAB.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_CHAOTIC_WALL = ITEMS.register("colored_chaotic_wall",
            () -> new ColoredBlockItem((ColoredWall) CaveopolisBlocks.COLORED_CHAOTIC_WALL.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_CHAOTIC_PRESSURE_PLATE = ITEMS.register("colored_chaotic_pressure_plate",
            () -> new ColoredBlockItem((ColoredPressurePlate) CaveopolisBlocks.COLORED_CHAOTIC_PRESSURE_PLATE.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_CHAOTIC_BUTTON = ITEMS.register("colored_chaotic_button",
            () -> new ColoredBlockItem((ColoredButton) CaveopolisBlocks.COLORED_CHAOTIC_BUTTON.get(), new ColoredItemProperties()));

    //Colored Triple
    public static final DeferredItem<Item> COLORED_TRIPLE = ITEMS.register("colored_triple",
            () -> new ColoredBlockItem((ColoredBlock) CaveopolisBlocks.COLORED_TRIPLE.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_TRIPLE_STAIRS = ITEMS.register("colored_triple_stairs",
            () -> new ColoredBlockItem((ColoredStairs) CaveopolisBlocks.COLORED_TRIPLE_STAIRS.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_TRIPLE_SLAB = ITEMS.register("colored_triple_slab",
            () -> new ColoredBlockItem((ColoredSlab) CaveopolisBlocks.COLORED_TRIPLE_SLAB.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_TRIPLE_WALL = ITEMS.register("colored_triple_wall",
            () -> new ColoredBlockItem((ColoredWall) CaveopolisBlocks.COLORED_TRIPLE_WALL.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_TRIPLE_PRESSURE_PLATE = ITEMS.register("colored_triple_pressure_plate",
            () -> new ColoredBlockItem((ColoredPressurePlate) CaveopolisBlocks.COLORED_TRIPLE_PRESSURE_PLATE.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_TRIPLE_BUTTON = ITEMS.register("colored_triple_button",
            () -> new ColoredBlockItem((ColoredButton) CaveopolisBlocks.COLORED_TRIPLE_BUTTON.get(), new ColoredItemProperties()));

    //Colored Braid
    public static final DeferredItem<Item> COLORED_BRAID = ITEMS.register("colored_braid",
            () -> new ColoredBlockItem((ColoredBlock) CaveopolisBlocks.COLORED_BRAID.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_BRAID_STAIRS = ITEMS.register("colored_braid_stairs",
            () -> new ColoredBlockItem((ColoredStairs) CaveopolisBlocks.COLORED_BRAID_STAIRS.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_BRAID_SLAB = ITEMS.register("colored_braid_slab",
            () -> new ColoredBlockItem((ColoredSlab) CaveopolisBlocks.COLORED_BRAID_SLAB.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_BRAID_WALL = ITEMS.register("colored_braid_wall",
            () -> new ColoredBlockItem((ColoredWall) CaveopolisBlocks.COLORED_BRAID_WALL.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_BRAID_PRESSURE_PLATE = ITEMS.register("colored_braid_pressure_plate",
            () -> new ColoredBlockItem((ColoredPressurePlate) CaveopolisBlocks.COLORED_BRAID_PRESSURE_PLATE.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_BRAID_BUTTON = ITEMS.register("colored_braid_button",
            () -> new ColoredBlockItem((ColoredButton) CaveopolisBlocks.COLORED_BRAID_BUTTON.get(), new ColoredItemProperties()));

    //Colored Encased
    public static final DeferredItem<Item> COLORED_ENCASED = ITEMS.register("colored_encased",
            () -> new ColoredBlockItem((ColoredBlock) CaveopolisBlocks.COLORED_ENCASED.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_ENCASED_STAIRS = ITEMS.register("colored_encased_stairs",
            () -> new ColoredBlockItem((ColoredStairs) CaveopolisBlocks.COLORED_ENCASED_STAIRS.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_ENCASED_SLAB = ITEMS.register("colored_encased_slab",
            () -> new ColoredBlockItem((ColoredSlab) CaveopolisBlocks.COLORED_ENCASED_SLAB.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_ENCASED_WALL = ITEMS.register("colored_encased_wall",
            () -> new ColoredBlockItem((ColoredWall) CaveopolisBlocks.COLORED_ENCASED_WALL.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_ENCASED_PRESSURE_PLATE = ITEMS.register("colored_encased_pressure_plate",
            () -> new ColoredBlockItem((ColoredPressurePlate) CaveopolisBlocks.COLORED_ENCASED_PRESSURE_PLATE.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_ENCASED_BUTTON = ITEMS.register("colored_encased_button",
            () -> new ColoredBlockItem((ColoredButton) CaveopolisBlocks.COLORED_ENCASED_BUTTON.get(), new ColoredItemProperties()));

    //Colored Road
    public static final DeferredItem<Item> COLORED_ROAD = ITEMS.register("colored_road",
            () -> new ColoredBlockItem((ColoredBlock) CaveopolisBlocks.COLORED_ROAD.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_ROAD_STAIRS = ITEMS.register("colored_road_stairs",
            () -> new ColoredBlockItem((ColoredStairs) CaveopolisBlocks.COLORED_ROAD_STAIRS.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_ROAD_SLAB = ITEMS.register("colored_road_slab",
            () -> new ColoredBlockItem((ColoredSlab) CaveopolisBlocks.COLORED_ROAD_SLAB.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_ROAD_WALL = ITEMS.register("colored_road_wall",
            () -> new ColoredBlockItem((ColoredWall) CaveopolisBlocks.COLORED_ROAD_WALL.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_ROAD_PRESSURE_PLATE = ITEMS.register("colored_road_pressure_plate",
            () -> new ColoredBlockItem((ColoredPressurePlate) CaveopolisBlocks.COLORED_ROAD_PRESSURE_PLATE.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_ROAD_BUTTON = ITEMS.register("colored_road_button",
            () -> new ColoredBlockItem((ColoredButton) CaveopolisBlocks.COLORED_ROAD_BUTTON.get(), new ColoredItemProperties()));






    public static final DeferredItem<Item> COLORED_LOG = ITEMS.register("colored_log",
            () -> new ColoredBlockItem((ColoredLog) CaveopolisBlocks.COLORED_LOG.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_WOOD = ITEMS.register("colored_wood",
            () -> new ColoredBlockItem((ColoredLog) CaveopolisBlocks.COLORED_WOOD.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> STRIPPED_COLORED_LOG = ITEMS.register("stripped_colored_log",
            () -> new ColoredBlockItem((ColoredLog) CaveopolisBlocks.STRIPPED_COLORED_LOG.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> STRIPPED_COLORED_WOOD = ITEMS.register("stripped_colored_wood",
            () -> new ColoredBlockItem((ColoredLog) CaveopolisBlocks.STRIPPED_COLORED_WOOD.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_LEAVES = ITEMS.register("colored_leaves",
            () -> new ColoredBlockItem((ColoredLeaves) CaveopolisBlocks.COLORED_LEAVES.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_PLANKS = ITEMS.register("colored_planks",
            () -> new ColoredBlockItem((ColoredBlock) CaveopolisBlocks.COLORED_PLANKS.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_PLANK_SLAB = ITEMS.register("colored_plank_slab",
            () -> new ColoredBlockItem((ColoredSlab) CaveopolisBlocks.COLORED_PLANK_SLAB.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_PLANK_STAIRS = ITEMS.register("colored_plank_stairs",
            () -> new ColoredBlockItem((ColoredStairs) CaveopolisBlocks.COLORED_PLANK_STAIRS.get(), new ColoredItemProperties()));

    public static final DeferredItem<Item> COLORED_PLANK_PRESSURE_PLATE = ITEMS.register("colored_plank_pressure_plate",
            () -> new ColoredBlockItem((ColoredPressurePlate) CaveopolisBlocks.COLORED_PLANK_PRESSURE_PLATE.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_PLANK_BUTTON = ITEMS.register("colored_plank_button",
            () -> new ColoredBlockItem((ColoredButton) CaveopolisBlocks.COLORED_PLANK_BUTTON.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_PLANK_FENCE = ITEMS.register("colored_plank_fence",
            () -> new ColoredBlockItem((ColoredFence) CaveopolisBlocks.COLORED_PLANK_FENCE.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_PLANK_FENCE_GATE = ITEMS.register("colored_plank_fence_gate",
            () -> new ColoredBlockItem((ColoredFenceGate) CaveopolisBlocks.COLORED_PLANK_FENCE_GATE.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_PLANK_DOOR = ITEMS.register("colored_plank_door",
            () -> new ColoredBlockItem((ColoredDoor) CaveopolisBlocks.COLORED_PLANK_DOOR.get(), new ColoredItemProperties()));
    public static final DeferredItem<Item> COLORED_PLANK_TRAPDOOR = ITEMS.register("colored_plank_trapdoor",
            () -> new ColoredBlockItem((ColoredTrapDoor) CaveopolisBlocks.COLORED_PLANK_TRAPDOOR.get(), new ColoredItemProperties()));



    public static final DeferredItem<Item> COLORED_DIRT = ITEMS.register("colored_dirt",
            () -> new ColoredBlockItem((ColoredBlock) CaveopolisBlocks.COLORED_DIRT.get(), new ColoredItemProperties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
