package com.benbenlaw.caveopolis.data.recipes;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

import java.util.Arrays;

public class ColoredBricksResults {

    public static final NonNullList<ItemStack> BLUE_BRICKS;
    public static final NonNullList<ItemStack> RED_BRICKS;
    public static final NonNullList<ItemStack> YELLOW_BRICKS;
    public static final NonNullList<ItemStack> GREEN_BRICKS;
    public static final NonNullList<ItemStack> ORANGE_BRICKS;
    public static final NonNullList<ItemStack> PURPLE_BRICKS;
    public static final NonNullList<ItemStack> PINK_BRICKS;
    public static final NonNullList<ItemStack> CYAN_BRICKS;
    public static final NonNullList<ItemStack> BLACK_BRICKS;
    public static final NonNullList<ItemStack> WHITE_BRICKS;
    public static final NonNullList<ItemStack> LIGHT_GRAY_BRICKS;
    public static final NonNullList<ItemStack> GRAY_BRICKS;
    public static final NonNullList<ItemStack> LIGHT_BLUE_BRICKS;
    public static final NonNullList<ItemStack> MAGENTA_BRICKS;
    public static final NonNullList<ItemStack> BROWN_BRICKS;
    public static final NonNullList<ItemStack> LIME_BRICKS;


    static {

        BLUE_BRICKS = NonNullList.create();
        RED_BRICKS = NonNullList.create();
        YELLOW_BRICKS = NonNullList.create();
        GREEN_BRICKS = NonNullList.create();
        ORANGE_BRICKS = NonNullList.create();
        PURPLE_BRICKS = NonNullList.create();
        PINK_BRICKS = NonNullList.create();
        CYAN_BRICKS = NonNullList.create();
        BLACK_BRICKS = NonNullList.create();
        WHITE_BRICKS = NonNullList.create();
        LIGHT_GRAY_BRICKS = NonNullList.create();
        GRAY_BRICKS = NonNullList.create();
        LIGHT_BLUE_BRICKS = NonNullList.create();
        MAGENTA_BRICKS = NonNullList.create();
        BROWN_BRICKS = NonNullList.create();
        LIME_BRICKS = NonNullList.create();

        for (ItemStack BRICKSTypes : Arrays.asList(
                new ItemStack(CaveopolisItems.COLORED_BRICK_SLAB.get(), 2),
                new ItemStack(CaveopolisItems.COLORED_BRICK_STAIRS.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_BRICK_WALL.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_BRICK_PRESSURE_PLATE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_BRICK_BUTTON.get(), 1)
        ))


        {
            BLUE_BRICKS.add(iconWithColor(BRICKSTypes.copy(), "blue"));
            RED_BRICKS.add(iconWithColor(BRICKSTypes.copy(), "red"));
            YELLOW_BRICKS.add(iconWithColor(BRICKSTypes.copy(), "yellow"));
            GREEN_BRICKS.add(iconWithColor(BRICKSTypes.copy(), "green"));
            ORANGE_BRICKS.add(iconWithColor(BRICKSTypes.copy(), "orange"));
            PURPLE_BRICKS.add(iconWithColor(BRICKSTypes.copy(), "purple"));
            PINK_BRICKS.add(iconWithColor(BRICKSTypes.copy(), "pink"));
            CYAN_BRICKS.add(iconWithColor(BRICKSTypes.copy(), "cyan"));
            BLACK_BRICKS.add(iconWithColor(BRICKSTypes.copy(), "black"));
            WHITE_BRICKS.add(iconWithColor(BRICKSTypes.copy(), "white"));
            LIGHT_GRAY_BRICKS.add(iconWithColor(BRICKSTypes.copy(), "light_gray"));
            GRAY_BRICKS.add(iconWithColor(BRICKSTypes.copy(), "gray"));
            LIGHT_BLUE_BRICKS.add(iconWithColor(BRICKSTypes.copy(), "light_blue"));
            MAGENTA_BRICKS.add(iconWithColor(BRICKSTypes.copy(), "magenta"));
            BROWN_BRICKS.add(iconWithColor(BRICKSTypes.copy(), "brown"));
            LIME_BRICKS.add(iconWithColor(BRICKSTypes.copy(), "lime"));
        }
    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }
}