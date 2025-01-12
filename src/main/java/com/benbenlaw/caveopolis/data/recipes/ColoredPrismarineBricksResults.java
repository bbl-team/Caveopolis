package com.benbenlaw.caveopolis.data.recipes;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

import java.util.Arrays;

public class ColoredPrismarineBricksResults {

    public static final NonNullList<ItemStack> BLUE_PRISMARINE_BRICKS;
    public static final NonNullList<ItemStack> RED_PRISMARINE_BRICKS;
    public static final NonNullList<ItemStack> YELLOW_PRISMARINE_BRICKS;
    public static final NonNullList<ItemStack> GREEN_PRISMARINE_BRICKS;
    public static final NonNullList<ItemStack> ORANGE_PRISMARINE_BRICKS;
    public static final NonNullList<ItemStack> PURPLE_PRISMARINE_BRICKS;
    public static final NonNullList<ItemStack> PINK_PRISMARINE_BRICKS;
    public static final NonNullList<ItemStack> CYAN_PRISMARINE_BRICKS;
    public static final NonNullList<ItemStack> BLACK_PRISMARINE_BRICKS;
    public static final NonNullList<ItemStack> WHITE_PRISMARINE_BRICKS;
    public static final NonNullList<ItemStack> LIGHT_GRAY_PRISMARINE_BRICKS;
    public static final NonNullList<ItemStack> GRAY_PRISMARINE_BRICKS;
    public static final NonNullList<ItemStack> LIGHT_BLUE_PRISMARINE_BRICKS;
    public static final NonNullList<ItemStack> MAGENTA_PRISMARINE_BRICKS;
    public static final NonNullList<ItemStack> BROWN_PRISMARINE_BRICKS;
    public static final NonNullList<ItemStack> LIME_PRISMARINE_BRICKS;


    static {

        BLUE_PRISMARINE_BRICKS = NonNullList.create();
        RED_PRISMARINE_BRICKS = NonNullList.create();
        YELLOW_PRISMARINE_BRICKS = NonNullList.create();
        GREEN_PRISMARINE_BRICKS = NonNullList.create();
        ORANGE_PRISMARINE_BRICKS = NonNullList.create();
        PURPLE_PRISMARINE_BRICKS = NonNullList.create();
        PINK_PRISMARINE_BRICKS = NonNullList.create();
        CYAN_PRISMARINE_BRICKS = NonNullList.create();
        BLACK_PRISMARINE_BRICKS = NonNullList.create();
        WHITE_PRISMARINE_BRICKS = NonNullList.create();
        LIGHT_GRAY_PRISMARINE_BRICKS = NonNullList.create();
        GRAY_PRISMARINE_BRICKS = NonNullList.create();
        LIGHT_BLUE_PRISMARINE_BRICKS = NonNullList.create();
        MAGENTA_PRISMARINE_BRICKS = NonNullList.create();
        BROWN_PRISMARINE_BRICKS = NonNullList.create();
        LIME_PRISMARINE_BRICKS = NonNullList.create();

        for (ItemStack PRISMARINE_BRICKSTypes : Arrays.asList(
                new ItemStack(CaveopolisItems.COLORED_PRISMARINE_BRICK_SLAB.get(), 2),
                new ItemStack(CaveopolisItems.COLORED_PRISMARINE_BRICK_STAIRS.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_PRISMARINE_BRICK_WALL.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_PRISMARINE_BRICK_PRESSURE_PLATE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_PRISMARINE_BRICK_BUTTON.get(), 1)
        ))


        {
            BLUE_PRISMARINE_BRICKS.add(iconWithColor(PRISMARINE_BRICKSTypes.copy(), "blue"));
            RED_PRISMARINE_BRICKS.add(iconWithColor(PRISMARINE_BRICKSTypes.copy(), "red"));
            YELLOW_PRISMARINE_BRICKS.add(iconWithColor(PRISMARINE_BRICKSTypes.copy(), "yellow"));
            GREEN_PRISMARINE_BRICKS.add(iconWithColor(PRISMARINE_BRICKSTypes.copy(), "green"));
            ORANGE_PRISMARINE_BRICKS.add(iconWithColor(PRISMARINE_BRICKSTypes.copy(), "orange"));
            PURPLE_PRISMARINE_BRICKS.add(iconWithColor(PRISMARINE_BRICKSTypes.copy(), "purple"));
            PINK_PRISMARINE_BRICKS.add(iconWithColor(PRISMARINE_BRICKSTypes.copy(), "pink"));
            CYAN_PRISMARINE_BRICKS.add(iconWithColor(PRISMARINE_BRICKSTypes.copy(), "cyan"));
            BLACK_PRISMARINE_BRICKS.add(iconWithColor(PRISMARINE_BRICKSTypes.copy(), "black"));
            WHITE_PRISMARINE_BRICKS.add(iconWithColor(PRISMARINE_BRICKSTypes.copy(), "white"));
            LIGHT_GRAY_PRISMARINE_BRICKS.add(iconWithColor(PRISMARINE_BRICKSTypes.copy(), "light_gray"));
            GRAY_PRISMARINE_BRICKS.add(iconWithColor(PRISMARINE_BRICKSTypes.copy(), "gray"));
            LIGHT_BLUE_PRISMARINE_BRICKS.add(iconWithColor(PRISMARINE_BRICKSTypes.copy(), "light_blue"));
            MAGENTA_PRISMARINE_BRICKS.add(iconWithColor(PRISMARINE_BRICKSTypes.copy(), "magenta"));
            BROWN_PRISMARINE_BRICKS.add(iconWithColor(PRISMARINE_BRICKSTypes.copy(), "brown"));
            LIME_PRISMARINE_BRICKS.add(iconWithColor(PRISMARINE_BRICKSTypes.copy(), "lime"));
        }
    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }
}