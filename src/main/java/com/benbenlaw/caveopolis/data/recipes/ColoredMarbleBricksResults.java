package com.benbenlaw.caveopolis.data.recipes;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

import java.util.Arrays;

public class ColoredMarbleBricksResults {

    public static final NonNullList<ItemStack> BLUE_MARBLE_BRICKS;
    public static final NonNullList<ItemStack> RED_MARBLE_BRICKS;
    public static final NonNullList<ItemStack> YELLOW_MARBLE_BRICKS;
    public static final NonNullList<ItemStack> GREEN_MARBLE_BRICKS;
    public static final NonNullList<ItemStack> ORANGE_MARBLE_BRICKS;
    public static final NonNullList<ItemStack> PURPLE_MARBLE_BRICKS;
    public static final NonNullList<ItemStack> PINK_MARBLE_BRICKS;
    public static final NonNullList<ItemStack> CYAN_MARBLE_BRICKS;
    public static final NonNullList<ItemStack> BLACK_MARBLE_BRICKS;
    public static final NonNullList<ItemStack> WHITE_MARBLE_BRICKS;
    public static final NonNullList<ItemStack> LIGHT_GRAY_MARBLE_BRICKS;
    public static final NonNullList<ItemStack> GRAY_MARBLE_BRICKS;
    public static final NonNullList<ItemStack> LIGHT_BLUE_MARBLE_BRICKS;
    public static final NonNullList<ItemStack> MAGENTA_MARBLE_BRICKS;
    public static final NonNullList<ItemStack> BROWN_MARBLE_BRICKS;
    public static final NonNullList<ItemStack> LIME_MARBLE_BRICKS;


    static {

        BLUE_MARBLE_BRICKS = NonNullList.create();
        RED_MARBLE_BRICKS = NonNullList.create();
        YELLOW_MARBLE_BRICKS = NonNullList.create();
        GREEN_MARBLE_BRICKS = NonNullList.create();
        ORANGE_MARBLE_BRICKS = NonNullList.create();
        PURPLE_MARBLE_BRICKS = NonNullList.create();
        PINK_MARBLE_BRICKS = NonNullList.create();
        CYAN_MARBLE_BRICKS = NonNullList.create();
        BLACK_MARBLE_BRICKS = NonNullList.create();
        WHITE_MARBLE_BRICKS = NonNullList.create();
        LIGHT_GRAY_MARBLE_BRICKS = NonNullList.create();
        GRAY_MARBLE_BRICKS = NonNullList.create();
        LIGHT_BLUE_MARBLE_BRICKS = NonNullList.create();
        MAGENTA_MARBLE_BRICKS = NonNullList.create();
        BROWN_MARBLE_BRICKS = NonNullList.create();
        LIME_MARBLE_BRICKS = NonNullList.create();

        for (ItemStack MARBLE_BRICKSTypes : Arrays.asList(
                new ItemStack(CaveopolisItems.COLORED_MARBLE_BRICK_SLAB.get(), 2),
                new ItemStack(CaveopolisItems.COLORED_MARBLE_BRICK_STAIRS.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_MARBLE_BRICK_WALL.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_MARBLE_BRICK_PRESSURE_PLATE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_MARBLE_BRICK_BUTTON.get(), 1)
        ))


        {
            BLUE_MARBLE_BRICKS.add(iconWithColor(MARBLE_BRICKSTypes.copy(), "blue"));
            RED_MARBLE_BRICKS.add(iconWithColor(MARBLE_BRICKSTypes.copy(), "red"));
            YELLOW_MARBLE_BRICKS.add(iconWithColor(MARBLE_BRICKSTypes.copy(), "yellow"));
            GREEN_MARBLE_BRICKS.add(iconWithColor(MARBLE_BRICKSTypes.copy(), "green"));
            ORANGE_MARBLE_BRICKS.add(iconWithColor(MARBLE_BRICKSTypes.copy(), "orange"));
            PURPLE_MARBLE_BRICKS.add(iconWithColor(MARBLE_BRICKSTypes.copy(), "purple"));
            PINK_MARBLE_BRICKS.add(iconWithColor(MARBLE_BRICKSTypes.copy(), "pink"));
            CYAN_MARBLE_BRICKS.add(iconWithColor(MARBLE_BRICKSTypes.copy(), "cyan"));
            BLACK_MARBLE_BRICKS.add(iconWithColor(MARBLE_BRICKSTypes.copy(), "black"));
            WHITE_MARBLE_BRICKS.add(iconWithColor(MARBLE_BRICKSTypes.copy(), "white"));
            LIGHT_GRAY_MARBLE_BRICKS.add(iconWithColor(MARBLE_BRICKSTypes.copy(), "light_gray"));
            GRAY_MARBLE_BRICKS.add(iconWithColor(MARBLE_BRICKSTypes.copy(), "gray"));
            LIGHT_BLUE_MARBLE_BRICKS.add(iconWithColor(MARBLE_BRICKSTypes.copy(), "light_blue"));
            MAGENTA_MARBLE_BRICKS.add(iconWithColor(MARBLE_BRICKSTypes.copy(), "magenta"));
            BROWN_MARBLE_BRICKS.add(iconWithColor(MARBLE_BRICKSTypes.copy(), "brown"));
            LIME_MARBLE_BRICKS.add(iconWithColor(MARBLE_BRICKSTypes.copy(), "lime"));
        }
    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }
}