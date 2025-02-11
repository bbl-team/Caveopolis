package com.benbenlaw.caveopolis.data.recipes;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

public class VanillaResults {
    String[] colors = {
            "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray",
            "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
    };

    public static final NonNullList<ItemStack> STONE;
    public static final NonNullList<ItemStack> STONE_BRICKS;
    public static final NonNullList<ItemStack> BRICKS;
    public static final NonNullList<ItemStack> COBBLESTONE;
    public static final NonNullList<ItemStack> DIRT;
    public static final NonNullList<ItemStack> GRASS_BLOCK;
    public static final NonNullList<ItemStack> SHORT_GRASS;
    public static final NonNullList<ItemStack> TALL_GRASS;
    public static final NonNullList<ItemStack> APPLE;
    public static final NonNullList<ItemStack> POPPY;
    public static final NonNullList<ItemStack> DANDELION;
    public static final NonNullList<ItemStack> LEAVES;
    public static final NonNullList<ItemStack> SAPLING;
    public static final NonNullList<ItemStack> LOGS;
    public static final NonNullList<ItemStack> PLANKS;
    public static final NonNullList<ItemStack> PRISMARINE;
    public static final NonNullList<ItemStack> BAMBOO;
    public static final NonNullList<ItemStack> COLORED_BAMBOO;




    static {

        STONE = NonNullList.create();
        for (String color : new VanillaResults().colors) {
            STONE.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_STONE.get(), 1), color));
            STONE.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_BRAID.get(), 1), color));
            STONE.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_MOSAIC.get(), 1), color));
            STONE.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_POLISHED_STONE.get(), 1), color));
            STONE.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_ROAD.get(), 1), color));
            STONE.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_TRIPLE.get(), 1), color));
            STONE.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_MARBLE.get(), 1), color));
            STONE.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_CHAOTIC.get(), 1), color));
            STONE.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_ENCASED.get(), 1), color));
            STONE.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_COBBLESTONE.get(), 1), color));
            STONE.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_TILE.get(), 1), color));
            STONE.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_STONE_BRICKS.get(), 1), color));
            STONE.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_CRACKED_STONE_BRICKS.get(), 1), color));
        }

        COBBLESTONE = NonNullList.create();
        for (String color : new VanillaResults().colors) {
            COBBLESTONE.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_COBBLESTONE.get(), 1), color));
            COBBLESTONE.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_COBBLESTONE_BRICKS.get(), 1), color));
        }

        DIRT = NonNullList.create();
        for (String color : new VanillaResults().colors) {
            DIRT.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_DIRT.get(), 1), color));
            DIRT.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_GRASS_BLOCK.get(), 1), color));
        }

        GRASS_BLOCK = NonNullList.create();
        for (String color : new VanillaResults().colors) {
            GRASS_BLOCK.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_GRASS_BLOCK.get(), 1), color));
        }

        SHORT_GRASS = NonNullList.create();
        for (String color : new VanillaResults().colors) {
            SHORT_GRASS.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_SHORT_GRASS.get(), 1), color));
        }

        TALL_GRASS = NonNullList.create();
        for (String color : new VanillaResults().colors) {
            TALL_GRASS.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_TALL_GRASS.get(), 1), color));
        }

        APPLE = NonNullList.create();
        for (String color : new VanillaResults().colors) {
            APPLE.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_APPLE.get(), 1), color));
        }

        POPPY = NonNullList.create();
        for (String color : new VanillaResults().colors) {
            POPPY.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_POPPY.get(), 1), color));
        }

        DANDELION = NonNullList.create();
        for (String color : new VanillaResults().colors) {
            DANDELION.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_DANDELION.get(), 1), color));
        }

        LEAVES = NonNullList.create();
        for (String color : new VanillaResults().colors) {
            LEAVES.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_LEAVES.get(), 1), color));
        }

        SAPLING = NonNullList.create();
        for (String color : new VanillaResults().colors) {
            SAPLING.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_SAPLING.get(), 1), color));
        }

        LOGS = NonNullList.create();
        for (String color : new VanillaResults().colors) {
            LOGS.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_LOG.get(), 1), color));
            LOGS.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_WOOD.get(), 1), color));
            LOGS.add(iconWithColor(new ItemStack(CaveopolisItems.STRIPPED_COLORED_LOG.get(), 1), color));
            LOGS.add(iconWithColor(new ItemStack(CaveopolisItems.STRIPPED_COLORED_WOOD.get(), 1), color));
            LOGS.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_PLANKS.get(), 4), color));
            LOGS.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_CRAFTING_TABLE.get(), 1), color));
            //Added Bamboo
            LOGS.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_BAMBOO_BLOCK.get(), 1), color));
            LOGS.add(iconWithColor(new ItemStack(CaveopolisItems.STRIPPED_COLORED_BAMBOO_BLOCK.get(), 1), color));
            LOGS.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_BAMBOO_PLANKS.get(), 4), color));
            LOGS.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_BAMBOO_MOSAIC.get(), 4), color));

        }

        STONE_BRICKS = NonNullList.create();
        for (String color : new VanillaResults().colors) {
            STONE_BRICKS.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_STONE_BRICKS.get(), 1), color));
        }

        BRICKS = NonNullList.create();
        for (String color : new VanillaResults().colors) {
            BRICKS.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_BRICKS.get(), 1), color));
        }

        PLANKS = NonNullList.create();
        for (String color : new VanillaResults().colors) {
            PLANKS.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_PLANKS.get(), 1), color));
        }

        PRISMARINE = NonNullList.create();
        for (String color : new VanillaResults().colors) {
            PRISMARINE.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_PRISMARINE.get(), 1), color));
            PRISMARINE.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_PRISMARINE_BRICKS.get(), 1), color));
            PRISMARINE.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_DARK_PRISMARINE.get(), 1), color));
        }

        BAMBOO = NonNullList.create();
        for (String color : new VanillaResults().colors) {
            BAMBOO.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_BAMBOO_BLOCK.get(), 1), color));
            BAMBOO.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_BAMBOO_PLANKS.get(), 2), color));
            BAMBOO.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_BAMBOO_MOSAIC.get(), 2), color));
        }

        COLORED_BAMBOO = NonNullList.create();
        for (String color : new VanillaResults().colors) {
            COLORED_BAMBOO.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_BAMBOO_PLANKS.get(), 2), color));
            COLORED_BAMBOO.add(iconWithColor(new ItemStack(CaveopolisItems.COLORED_BAMBOO_MOSAIC.get(), 2), color));
        }

    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }
}