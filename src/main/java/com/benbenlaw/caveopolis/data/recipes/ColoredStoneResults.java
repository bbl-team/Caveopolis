package com.benbenlaw.caveopolis.data.recipes;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

import java.util.Arrays;

public class ColoredStoneResults {

    public static final NonNullList<ItemStack> BLUE_STONE;
    public static final NonNullList<ItemStack> RED_STONE;
    public static final NonNullList<ItemStack> YELLOW_STONE;
    public static final NonNullList<ItemStack> GREEN_STONE;
    public static final NonNullList<ItemStack> ORANGE_STONE;
    public static final NonNullList<ItemStack> PURPLE_STONE;
    public static final NonNullList<ItemStack> PINK_STONE;
    public static final NonNullList<ItemStack> CYAN_STONE;
    public static final NonNullList<ItemStack> BLACK_STONE;
    public static final NonNullList<ItemStack> WHITE_STONE;
    public static final NonNullList<ItemStack> LIGHT_GRAY_STONE;
    public static final NonNullList<ItemStack> GRAY_STONE;
    public static final NonNullList<ItemStack> LIGHT_BLUE_STONE;
    public static final NonNullList<ItemStack> MAGENTA_STONE;
    public static final NonNullList<ItemStack> BROWN_STONE;
    public static final NonNullList<ItemStack> LIME_STONE;


    static {

        BLUE_STONE = NonNullList.create();
        RED_STONE = NonNullList.create();
        YELLOW_STONE = NonNullList.create();
        GREEN_STONE = NonNullList.create();
        ORANGE_STONE = NonNullList.create();
        PURPLE_STONE = NonNullList.create();
        PINK_STONE = NonNullList.create();
        CYAN_STONE = NonNullList.create();
        BLACK_STONE = NonNullList.create();
        WHITE_STONE = NonNullList.create();
        LIGHT_GRAY_STONE = NonNullList.create();
        GRAY_STONE = NonNullList.create();
        LIGHT_BLUE_STONE = NonNullList.create();
        MAGENTA_STONE = NonNullList.create();
        BROWN_STONE = NonNullList.create();
        LIME_STONE = NonNullList.create();

        for (ItemStack stoneTypes : Arrays.asList(
                new ItemStack(CaveopolisItems.COLORED_STONE_SLAB.get(), 2),
                new ItemStack(CaveopolisItems.COLORED_STONE_STAIRS.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_STONE_WALL.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_STONE_PRESSURE_PLATE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_STONE_BUTTON.get(), 1)
        ))


        {
            BLUE_STONE.add(iconWithColor(stoneTypes.copy(), "blue"));
            RED_STONE.add(iconWithColor(stoneTypes.copy(), "red"));
            YELLOW_STONE.add(iconWithColor(stoneTypes.copy(), "yellow"));
            GREEN_STONE.add(iconWithColor(stoneTypes.copy(), "green"));
            ORANGE_STONE.add(iconWithColor(stoneTypes.copy(), "orange"));
            PURPLE_STONE.add(iconWithColor(stoneTypes.copy(), "purple"));
            PINK_STONE.add(iconWithColor(stoneTypes.copy(), "pink"));
            CYAN_STONE.add(iconWithColor(stoneTypes.copy(), "cyan"));
            BLACK_STONE.add(iconWithColor(stoneTypes.copy(), "black"));
            WHITE_STONE.add(iconWithColor(stoneTypes.copy(), "white"));
            LIGHT_GRAY_STONE.add(iconWithColor(stoneTypes.copy(), "light_gray"));
            GRAY_STONE.add(iconWithColor(stoneTypes.copy(), "gray"));
            LIGHT_BLUE_STONE.add(iconWithColor(stoneTypes.copy(), "light_blue"));
            MAGENTA_STONE.add(iconWithColor(stoneTypes.copy(), "magenta"));
            BROWN_STONE.add(iconWithColor(stoneTypes.copy(), "brown"));
            LIME_STONE.add(iconWithColor(stoneTypes.copy(), "lime"));
        }
    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }
}