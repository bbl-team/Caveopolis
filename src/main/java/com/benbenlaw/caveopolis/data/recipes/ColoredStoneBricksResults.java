package com.benbenlaw.caveopolis.data.recipes;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

import java.util.Arrays;

public class ColoredStoneBricksResults {

    public static final NonNullList<ItemStack> BLUE_STONE_BRICKS;
    public static final NonNullList<ItemStack> RED_STONE_BRICKS;
    public static final NonNullList<ItemStack> YELLOW_STONE_BRICKS;
    public static final NonNullList<ItemStack> GREEN_STONE_BRICKS;
    public static final NonNullList<ItemStack> ORANGE_STONE_BRICKS;
    public static final NonNullList<ItemStack> PURPLE_STONE_BRICKS;
    public static final NonNullList<ItemStack> PINK_STONE_BRICKS;
    public static final NonNullList<ItemStack> CYAN_STONE_BRICKS;
    public static final NonNullList<ItemStack> BLACK_STONE_BRICKS;
    public static final NonNullList<ItemStack> WHITE_STONE_BRICKS;
    public static final NonNullList<ItemStack> LIGHT_GRAY_STONE_BRICKS;
    public static final NonNullList<ItemStack> GRAY_STONE_BRICKS;
    public static final NonNullList<ItemStack> LIGHT_BLUE_STONE_BRICKS;
    public static final NonNullList<ItemStack> MAGENTA_STONE_BRICKS;
    public static final NonNullList<ItemStack> BROWN_STONE_BRICKS;
    public static final NonNullList<ItemStack> LIME_STONE_BRICKS;


    static {

        BLUE_STONE_BRICKS = NonNullList.create();
        RED_STONE_BRICKS = NonNullList.create();
        YELLOW_STONE_BRICKS = NonNullList.create();
        GREEN_STONE_BRICKS = NonNullList.create();
        ORANGE_STONE_BRICKS = NonNullList.create();
        PURPLE_STONE_BRICKS = NonNullList.create();
        PINK_STONE_BRICKS = NonNullList.create();
        CYAN_STONE_BRICKS = NonNullList.create();
        BLACK_STONE_BRICKS = NonNullList.create();
        WHITE_STONE_BRICKS = NonNullList.create();
        LIGHT_GRAY_STONE_BRICKS = NonNullList.create();
        GRAY_STONE_BRICKS = NonNullList.create();
        LIGHT_BLUE_STONE_BRICKS = NonNullList.create();
        MAGENTA_STONE_BRICKS = NonNullList.create();
        BROWN_STONE_BRICKS = NonNullList.create();
        LIME_STONE_BRICKS = NonNullList.create();

        for (ItemStack STONE_BRICKSTypes : Arrays.asList(
                new ItemStack(CaveopolisItems.COLORED_STONE_BRICK_SLAB.get(), 2),
                new ItemStack(CaveopolisItems.COLORED_STONE_BRICK_STAIRS.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_STONE_BRICK_WALL.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_STONE_BRICK_PRESSURE_PLATE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_STONE_BRICK_BUTTON.get(), 1)
        ))


        {
            BLUE_STONE_BRICKS.add(iconWithColor(STONE_BRICKSTypes.copy(), "blue"));
            RED_STONE_BRICKS.add(iconWithColor(STONE_BRICKSTypes.copy(), "red"));
            YELLOW_STONE_BRICKS.add(iconWithColor(STONE_BRICKSTypes.copy(), "yellow"));
            GREEN_STONE_BRICKS.add(iconWithColor(STONE_BRICKSTypes.copy(), "green"));
            ORANGE_STONE_BRICKS.add(iconWithColor(STONE_BRICKSTypes.copy(), "orange"));
            PURPLE_STONE_BRICKS.add(iconWithColor(STONE_BRICKSTypes.copy(), "purple"));
            PINK_STONE_BRICKS.add(iconWithColor(STONE_BRICKSTypes.copy(), "pink"));
            CYAN_STONE_BRICKS.add(iconWithColor(STONE_BRICKSTypes.copy(), "cyan"));
            BLACK_STONE_BRICKS.add(iconWithColor(STONE_BRICKSTypes.copy(), "black"));
            WHITE_STONE_BRICKS.add(iconWithColor(STONE_BRICKSTypes.copy(), "white"));
            LIGHT_GRAY_STONE_BRICKS.add(iconWithColor(STONE_BRICKSTypes.copy(), "light_gray"));
            GRAY_STONE_BRICKS.add(iconWithColor(STONE_BRICKSTypes.copy(), "gray"));
            LIGHT_BLUE_STONE_BRICKS.add(iconWithColor(STONE_BRICKSTypes.copy(), "light_blue"));
            MAGENTA_STONE_BRICKS.add(iconWithColor(STONE_BRICKSTypes.copy(), "magenta"));
            BROWN_STONE_BRICKS.add(iconWithColor(STONE_BRICKSTypes.copy(), "brown"));
            LIME_STONE_BRICKS.add(iconWithColor(STONE_BRICKSTypes.copy(), "lime"));
        }
    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }
}