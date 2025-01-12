package com.benbenlaw.caveopolis.data.recipes;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

import java.util.Arrays;

public class ColoredCrackedStoneBricksResults {

    public static final NonNullList<ItemStack> BLUE_CRACKED_STONE_BRICKS;
    public static final NonNullList<ItemStack> RED_CRACKED_STONE_BRICKS;
    public static final NonNullList<ItemStack> YELLOW_CRACKED_STONE_BRICKS;
    public static final NonNullList<ItemStack> GREEN_CRACKED_STONE_BRICKS;
    public static final NonNullList<ItemStack> ORANGE_CRACKED_STONE_BRICKS;
    public static final NonNullList<ItemStack> PURPLE_CRACKED_STONE_BRICKS;
    public static final NonNullList<ItemStack> PINK_CRACKED_STONE_BRICKS;
    public static final NonNullList<ItemStack> CYAN_CRACKED_STONE_BRICKS;
    public static final NonNullList<ItemStack> BLACK_CRACKED_STONE_BRICKS;
    public static final NonNullList<ItemStack> WHITE_CRACKED_STONE_BRICKS;
    public static final NonNullList<ItemStack> LIGHT_GRAY_CRACKED_STONE_BRICKS;
    public static final NonNullList<ItemStack> GRAY_CRACKED_STONE_BRICKS;
    public static final NonNullList<ItemStack> LIGHT_BLUE_CRACKED_STONE_BRICKS;
    public static final NonNullList<ItemStack> MAGENTA_CRACKED_STONE_BRICKS;
    public static final NonNullList<ItemStack> BROWN_CRACKED_STONE_BRICKS;
    public static final NonNullList<ItemStack> LIME_CRACKED_STONE_BRICKS;


    static {

        BLUE_CRACKED_STONE_BRICKS = NonNullList.create();
        RED_CRACKED_STONE_BRICKS = NonNullList.create();
        YELLOW_CRACKED_STONE_BRICKS = NonNullList.create();
        GREEN_CRACKED_STONE_BRICKS = NonNullList.create();
        ORANGE_CRACKED_STONE_BRICKS = NonNullList.create();
        PURPLE_CRACKED_STONE_BRICKS = NonNullList.create();
        PINK_CRACKED_STONE_BRICKS = NonNullList.create();
        CYAN_CRACKED_STONE_BRICKS = NonNullList.create();
        BLACK_CRACKED_STONE_BRICKS = NonNullList.create();
        WHITE_CRACKED_STONE_BRICKS = NonNullList.create();
        LIGHT_GRAY_CRACKED_STONE_BRICKS = NonNullList.create();
        GRAY_CRACKED_STONE_BRICKS = NonNullList.create();
        LIGHT_BLUE_CRACKED_STONE_BRICKS = NonNullList.create();
        MAGENTA_CRACKED_STONE_BRICKS = NonNullList.create();
        BROWN_CRACKED_STONE_BRICKS = NonNullList.create();
        LIME_CRACKED_STONE_BRICKS = NonNullList.create();

        for (ItemStack CRACKED_STONE_BRICKSTypes : Arrays.asList(
                new ItemStack(CaveopolisItems.COLORED_CRACKED_STONE_BRICK_SLAB.get(), 2),
                new ItemStack(CaveopolisItems.COLORED_CRACKED_STONE_BRICK_STAIRS.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_CRACKED_STONE_BRICK_WALL.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_CRACKED_STONE_BRICK_PRESSURE_PLATE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_CRACKED_STONE_BRICK_BUTTON.get(), 1)
        ))


        {
            BLUE_CRACKED_STONE_BRICKS.add(iconWithColor(CRACKED_STONE_BRICKSTypes.copy(), "blue"));
            RED_CRACKED_STONE_BRICKS.add(iconWithColor(CRACKED_STONE_BRICKSTypes.copy(), "red"));
            YELLOW_CRACKED_STONE_BRICKS.add(iconWithColor(CRACKED_STONE_BRICKSTypes.copy(), "yellow"));
            GREEN_CRACKED_STONE_BRICKS.add(iconWithColor(CRACKED_STONE_BRICKSTypes.copy(), "green"));
            ORANGE_CRACKED_STONE_BRICKS.add(iconWithColor(CRACKED_STONE_BRICKSTypes.copy(), "orange"));
            PURPLE_CRACKED_STONE_BRICKS.add(iconWithColor(CRACKED_STONE_BRICKSTypes.copy(), "purple"));
            PINK_CRACKED_STONE_BRICKS.add(iconWithColor(CRACKED_STONE_BRICKSTypes.copy(), "pink"));
            CYAN_CRACKED_STONE_BRICKS.add(iconWithColor(CRACKED_STONE_BRICKSTypes.copy(), "cyan"));
            BLACK_CRACKED_STONE_BRICKS.add(iconWithColor(CRACKED_STONE_BRICKSTypes.copy(), "black"));
            WHITE_CRACKED_STONE_BRICKS.add(iconWithColor(CRACKED_STONE_BRICKSTypes.copy(), "white"));
            LIGHT_GRAY_CRACKED_STONE_BRICKS.add(iconWithColor(CRACKED_STONE_BRICKSTypes.copy(), "light_gray"));
            GRAY_CRACKED_STONE_BRICKS.add(iconWithColor(CRACKED_STONE_BRICKSTypes.copy(), "gray"));
            LIGHT_BLUE_CRACKED_STONE_BRICKS.add(iconWithColor(CRACKED_STONE_BRICKSTypes.copy(), "light_blue"));
            MAGENTA_CRACKED_STONE_BRICKS.add(iconWithColor(CRACKED_STONE_BRICKSTypes.copy(), "magenta"));
            BROWN_CRACKED_STONE_BRICKS.add(iconWithColor(CRACKED_STONE_BRICKSTypes.copy(), "brown"));
            LIME_CRACKED_STONE_BRICKS.add(iconWithColor(CRACKED_STONE_BRICKSTypes.copy(), "lime"));
        }
    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }
}