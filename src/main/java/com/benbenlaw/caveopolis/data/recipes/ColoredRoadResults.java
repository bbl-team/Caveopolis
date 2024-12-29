package com.benbenlaw.caveopolis.data.recipes;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

import java.util.Arrays;

public class ColoredRoadResults {

    public static final NonNullList<ItemStack> BLUE_ROAD;
    public static final NonNullList<ItemStack> RED_ROAD;
    public static final NonNullList<ItemStack> YELLOW_ROAD;
    public static final NonNullList<ItemStack> GREEN_ROAD;
    public static final NonNullList<ItemStack> ORANGE_ROAD;
    public static final NonNullList<ItemStack> PURPLE_ROAD;
    public static final NonNullList<ItemStack> PINK_ROAD;
    public static final NonNullList<ItemStack> CYAN_ROAD;
    public static final NonNullList<ItemStack> BLACK_ROAD;
    public static final NonNullList<ItemStack> WHITE_ROAD;
    public static final NonNullList<ItemStack> LIGHT_GRAY_ROAD;
    public static final NonNullList<ItemStack> GRAY_ROAD;
    public static final NonNullList<ItemStack> LIGHT_BLUE_ROAD;
    public static final NonNullList<ItemStack> MAGENTA_ROAD;
    public static final NonNullList<ItemStack> BROWN_ROAD;
    public static final NonNullList<ItemStack> LIME_ROAD;


    static {

        BLUE_ROAD = NonNullList.create();
        RED_ROAD = NonNullList.create();
        YELLOW_ROAD = NonNullList.create();
        GREEN_ROAD = NonNullList.create();
        ORANGE_ROAD = NonNullList.create();
        PURPLE_ROAD = NonNullList.create();
        PINK_ROAD = NonNullList.create();
        CYAN_ROAD = NonNullList.create();
        BLACK_ROAD = NonNullList.create();
        WHITE_ROAD = NonNullList.create();
        LIGHT_GRAY_ROAD = NonNullList.create();
        GRAY_ROAD = NonNullList.create();
        LIGHT_BLUE_ROAD = NonNullList.create();
        MAGENTA_ROAD = NonNullList.create();
        BROWN_ROAD = NonNullList.create();
        LIME_ROAD = NonNullList.create();

        for (ItemStack ROADTypes : Arrays.asList(
                new ItemStack(CaveopolisItems.COLORED_ROAD_SLAB.get(), 2),
                new ItemStack(CaveopolisItems.COLORED_ROAD_STAIRS.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_ROAD_WALL.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_ROAD_PRESSURE_PLATE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_ROAD_BUTTON.get(), 1)
        ))


        {
            BLUE_ROAD.add(iconWithColor(ROADTypes.copy(), "blue"));
            RED_ROAD.add(iconWithColor(ROADTypes.copy(), "red"));
            YELLOW_ROAD.add(iconWithColor(ROADTypes.copy(), "yellow"));
            GREEN_ROAD.add(iconWithColor(ROADTypes.copy(), "green"));
            ORANGE_ROAD.add(iconWithColor(ROADTypes.copy(), "orange"));
            PURPLE_ROAD.add(iconWithColor(ROADTypes.copy(), "purple"));
            PINK_ROAD.add(iconWithColor(ROADTypes.copy(), "pink"));
            CYAN_ROAD.add(iconWithColor(ROADTypes.copy(), "cyan"));
            BLACK_ROAD.add(iconWithColor(ROADTypes.copy(), "black"));
            WHITE_ROAD.add(iconWithColor(ROADTypes.copy(), "white"));
            LIGHT_GRAY_ROAD.add(iconWithColor(ROADTypes.copy(), "light_gray"));
            GRAY_ROAD.add(iconWithColor(ROADTypes.copy(), "gray"));
            LIGHT_BLUE_ROAD.add(iconWithColor(ROADTypes.copy(), "light_blue"));
            MAGENTA_ROAD.add(iconWithColor(ROADTypes.copy(), "magenta"));
            BROWN_ROAD.add(iconWithColor(ROADTypes.copy(), "brown"));
            LIME_ROAD.add(iconWithColor(ROADTypes.copy(), "lime"));
        }
    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }
}