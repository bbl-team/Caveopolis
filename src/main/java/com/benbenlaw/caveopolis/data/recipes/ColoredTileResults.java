package com.benbenlaw.caveopolis.data.recipes;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

import java.util.Arrays;

public class ColoredTileResults {

    public static final NonNullList<ItemStack> BLUE_TILE;
    public static final NonNullList<ItemStack> RED_TILE;
    public static final NonNullList<ItemStack> YELLOW_TILE;
    public static final NonNullList<ItemStack> GREEN_TILE;
    public static final NonNullList<ItemStack> ORANGE_TILE;
    public static final NonNullList<ItemStack> PURPLE_TILE;
    public static final NonNullList<ItemStack> PINK_TILE;
    public static final NonNullList<ItemStack> CYAN_TILE;
    public static final NonNullList<ItemStack> BLACK_TILE;
    public static final NonNullList<ItemStack> WHITE_TILE;
    public static final NonNullList<ItemStack> LIGHT_GRAY_TILE;
    public static final NonNullList<ItemStack> GRAY_TILE;
    public static final NonNullList<ItemStack> LIGHT_BLUE_TILE;
    public static final NonNullList<ItemStack> MAGENTA_TILE;
    public static final NonNullList<ItemStack> BROWN_TILE;
    public static final NonNullList<ItemStack> LIME_TILE;


    static {

        BLUE_TILE = NonNullList.create();
        RED_TILE = NonNullList.create();
        YELLOW_TILE = NonNullList.create();
        GREEN_TILE = NonNullList.create();
        ORANGE_TILE = NonNullList.create();
        PURPLE_TILE = NonNullList.create();
        PINK_TILE = NonNullList.create();
        CYAN_TILE = NonNullList.create();
        BLACK_TILE = NonNullList.create();
        WHITE_TILE = NonNullList.create();
        LIGHT_GRAY_TILE = NonNullList.create();
        GRAY_TILE = NonNullList.create();
        LIGHT_BLUE_TILE = NonNullList.create();
        MAGENTA_TILE = NonNullList.create();
        BROWN_TILE = NonNullList.create();
        LIME_TILE = NonNullList.create();

        for (ItemStack tileTypes : Arrays.asList(
                new ItemStack(CaveopolisItems.COLORED_TILE_SLAB.get(), 2),
                new ItemStack(CaveopolisItems.COLORED_TILE_STAIRS.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_TILE_WALL.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_TILE_PRESSURE_PLATE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_TILE_BUTTON.get(), 1)
        ))


        {
            BLUE_TILE.add(iconWithColor(tileTypes.copy(), "blue"));
            RED_TILE.add(iconWithColor(tileTypes.copy(), "red"));
            YELLOW_TILE.add(iconWithColor(tileTypes.copy(), "yellow"));
            GREEN_TILE.add(iconWithColor(tileTypes.copy(), "green"));
            ORANGE_TILE.add(iconWithColor(tileTypes.copy(), "orange"));
            PURPLE_TILE.add(iconWithColor(tileTypes.copy(), "purple"));
            PINK_TILE.add(iconWithColor(tileTypes.copy(), "pink"));
            CYAN_TILE.add(iconWithColor(tileTypes.copy(), "cyan"));
            BLACK_TILE.add(iconWithColor(tileTypes.copy(), "black"));
            WHITE_TILE.add(iconWithColor(tileTypes.copy(), "white"));
            LIGHT_GRAY_TILE.add(iconWithColor(tileTypes.copy(), "light_gray"));
            GRAY_TILE.add(iconWithColor(tileTypes.copy(), "gray"));
            LIGHT_BLUE_TILE.add(iconWithColor(tileTypes.copy(), "light_blue"));
            MAGENTA_TILE.add(iconWithColor(tileTypes.copy(), "magenta"));
            BROWN_TILE.add(iconWithColor(tileTypes.copy(), "brown"));
            LIME_TILE.add(iconWithColor(tileTypes.copy(), "lime"));
        }
    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }
}