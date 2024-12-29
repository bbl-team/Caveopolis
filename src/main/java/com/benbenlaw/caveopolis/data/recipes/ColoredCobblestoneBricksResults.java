package com.benbenlaw.caveopolis.data.recipes;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

import java.util.Arrays;

public class ColoredCobblestoneBricksResults {

    public static final NonNullList<ItemStack> BLUE_COBBLESTONE_BRICKS;
    public static final NonNullList<ItemStack> RED_COBBLESTONE_BRICKS;
    public static final NonNullList<ItemStack> YELLOW_COBBLESTONE_BRICKS;
    public static final NonNullList<ItemStack> GREEN_COBBLESTONE_BRICKS;
    public static final NonNullList<ItemStack> ORANGE_COBBLESTONE_BRICKS;
    public static final NonNullList<ItemStack> PURPLE_COBBLESTONE_BRICKS;
    public static final NonNullList<ItemStack> PINK_COBBLESTONE_BRICKS;
    public static final NonNullList<ItemStack> CYAN_COBBLESTONE_BRICKS;
    public static final NonNullList<ItemStack> BLACK_COBBLESTONE_BRICKS;
    public static final NonNullList<ItemStack> WHITE_COBBLESTONE_BRICKS;
    public static final NonNullList<ItemStack> LIGHT_GRAY_COBBLESTONE_BRICKS;
    public static final NonNullList<ItemStack> GRAY_COBBLESTONE_BRICKS;
    public static final NonNullList<ItemStack> LIGHT_BLUE_COBBLESTONE_BRICKS;
    public static final NonNullList<ItemStack> MAGENTA_COBBLESTONE_BRICKS;
    public static final NonNullList<ItemStack> BROWN_COBBLESTONE_BRICKS;
    public static final NonNullList<ItemStack> LIME_COBBLESTONE_BRICKS;


    static {

        BLUE_COBBLESTONE_BRICKS = NonNullList.create();
        RED_COBBLESTONE_BRICKS = NonNullList.create();
        YELLOW_COBBLESTONE_BRICKS = NonNullList.create();
        GREEN_COBBLESTONE_BRICKS = NonNullList.create();
        ORANGE_COBBLESTONE_BRICKS = NonNullList.create();
        PURPLE_COBBLESTONE_BRICKS = NonNullList.create();
        PINK_COBBLESTONE_BRICKS = NonNullList.create();
        CYAN_COBBLESTONE_BRICKS = NonNullList.create();
        BLACK_COBBLESTONE_BRICKS = NonNullList.create();
        WHITE_COBBLESTONE_BRICKS = NonNullList.create();
        LIGHT_GRAY_COBBLESTONE_BRICKS = NonNullList.create();
        GRAY_COBBLESTONE_BRICKS = NonNullList.create();
        LIGHT_BLUE_COBBLESTONE_BRICKS = NonNullList.create();
        MAGENTA_COBBLESTONE_BRICKS = NonNullList.create();
        BROWN_COBBLESTONE_BRICKS = NonNullList.create();
        LIME_COBBLESTONE_BRICKS = NonNullList.create();

        for (ItemStack COBBLESTONE_BRICKSTypes : Arrays.asList(
                new ItemStack(CaveopolisItems.COLORED_COBBLESTONE_BRICK_SLAB.get(), 2),
                new ItemStack(CaveopolisItems.COLORED_COBBLESTONE_BRICK_STAIRS.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_COBBLESTONE_BRICK_WALL.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_COBBLESTONE_BRICK_PRESSURE_PLATE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_COBBLESTONE_BRICK_BUTTON.get(), 1)
        ))


        {
            BLUE_COBBLESTONE_BRICKS.add(iconWithColor(COBBLESTONE_BRICKSTypes.copy(), "blue"));
            RED_COBBLESTONE_BRICKS.add(iconWithColor(COBBLESTONE_BRICKSTypes.copy(), "red"));
            YELLOW_COBBLESTONE_BRICKS.add(iconWithColor(COBBLESTONE_BRICKSTypes.copy(), "yellow"));
            GREEN_COBBLESTONE_BRICKS.add(iconWithColor(COBBLESTONE_BRICKSTypes.copy(), "green"));
            ORANGE_COBBLESTONE_BRICKS.add(iconWithColor(COBBLESTONE_BRICKSTypes.copy(), "orange"));
            PURPLE_COBBLESTONE_BRICKS.add(iconWithColor(COBBLESTONE_BRICKSTypes.copy(), "purple"));
            PINK_COBBLESTONE_BRICKS.add(iconWithColor(COBBLESTONE_BRICKSTypes.copy(), "pink"));
            CYAN_COBBLESTONE_BRICKS.add(iconWithColor(COBBLESTONE_BRICKSTypes.copy(), "cyan"));
            BLACK_COBBLESTONE_BRICKS.add(iconWithColor(COBBLESTONE_BRICKSTypes.copy(), "black"));
            WHITE_COBBLESTONE_BRICKS.add(iconWithColor(COBBLESTONE_BRICKSTypes.copy(), "white"));
            LIGHT_GRAY_COBBLESTONE_BRICKS.add(iconWithColor(COBBLESTONE_BRICKSTypes.copy(), "light_gray"));
            GRAY_COBBLESTONE_BRICKS.add(iconWithColor(COBBLESTONE_BRICKSTypes.copy(), "gray"));
            LIGHT_BLUE_COBBLESTONE_BRICKS.add(iconWithColor(COBBLESTONE_BRICKSTypes.copy(), "light_blue"));
            MAGENTA_COBBLESTONE_BRICKS.add(iconWithColor(COBBLESTONE_BRICKSTypes.copy(), "magenta"));
            BROWN_COBBLESTONE_BRICKS.add(iconWithColor(COBBLESTONE_BRICKSTypes.copy(), "brown"));
            LIME_COBBLESTONE_BRICKS.add(iconWithColor(COBBLESTONE_BRICKSTypes.copy(), "lime"));
        }
    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }
}