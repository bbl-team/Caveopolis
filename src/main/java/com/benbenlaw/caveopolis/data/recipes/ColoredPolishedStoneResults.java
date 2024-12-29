package com.benbenlaw.caveopolis.data.recipes;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

import java.util.Arrays;

public class ColoredPolishedStoneResults {

    public static final NonNullList<ItemStack> BLUE_POLISHED_STONE;
    public static final NonNullList<ItemStack> RED_POLISHED_STONE;
    public static final NonNullList<ItemStack> YELLOW_POLISHED_STONE;
    public static final NonNullList<ItemStack> GREEN_POLISHED_STONE;
    public static final NonNullList<ItemStack> ORANGE_POLISHED_STONE;
    public static final NonNullList<ItemStack> PURPLE_POLISHED_STONE;
    public static final NonNullList<ItemStack> PINK_POLISHED_STONE;
    public static final NonNullList<ItemStack> CYAN_POLISHED_STONE;
    public static final NonNullList<ItemStack> BLACK_POLISHED_STONE;
    public static final NonNullList<ItemStack> WHITE_POLISHED_STONE;
    public static final NonNullList<ItemStack> LIGHT_GRAY_POLISHED_STONE;
    public static final NonNullList<ItemStack> GRAY_POLISHED_STONE;
    public static final NonNullList<ItemStack> LIGHT_BLUE_POLISHED_STONE;
    public static final NonNullList<ItemStack> MAGENTA_POLISHED_STONE;
    public static final NonNullList<ItemStack> BROWN_POLISHED_STONE;
    public static final NonNullList<ItemStack> LIME_POLISHED_STONE;


    static {

        BLUE_POLISHED_STONE = NonNullList.create();
        RED_POLISHED_STONE = NonNullList.create();
        YELLOW_POLISHED_STONE = NonNullList.create();
        GREEN_POLISHED_STONE = NonNullList.create();
        ORANGE_POLISHED_STONE = NonNullList.create();
        PURPLE_POLISHED_STONE = NonNullList.create();
        PINK_POLISHED_STONE = NonNullList.create();
        CYAN_POLISHED_STONE = NonNullList.create();
        BLACK_POLISHED_STONE = NonNullList.create();
        WHITE_POLISHED_STONE = NonNullList.create();
        LIGHT_GRAY_POLISHED_STONE = NonNullList.create();
        GRAY_POLISHED_STONE = NonNullList.create();
        LIGHT_BLUE_POLISHED_STONE = NonNullList.create();
        MAGENTA_POLISHED_STONE = NonNullList.create();
        BROWN_POLISHED_STONE = NonNullList.create();
        LIME_POLISHED_STONE = NonNullList.create();

        for (ItemStack POLISHED_STONETypes : Arrays.asList(
                new ItemStack(CaveopolisItems.COLORED_POLISHED_STONE_SLAB.get(), 2),
                new ItemStack(CaveopolisItems.COLORED_POLISHED_STONE_STAIRS.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_POLISHED_STONE_WALL.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_POLISHED_STONE_PRESSURE_PLATE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_POLISHED_STONE_BUTTON.get(), 1)
        ))


        {
            BLUE_POLISHED_STONE.add(iconWithColor(POLISHED_STONETypes.copy(), "blue"));
            RED_POLISHED_STONE.add(iconWithColor(POLISHED_STONETypes.copy(), "red"));
            YELLOW_POLISHED_STONE.add(iconWithColor(POLISHED_STONETypes.copy(), "yellow"));
            GREEN_POLISHED_STONE.add(iconWithColor(POLISHED_STONETypes.copy(), "green"));
            ORANGE_POLISHED_STONE.add(iconWithColor(POLISHED_STONETypes.copy(), "orange"));
            PURPLE_POLISHED_STONE.add(iconWithColor(POLISHED_STONETypes.copy(), "purple"));
            PINK_POLISHED_STONE.add(iconWithColor(POLISHED_STONETypes.copy(), "pink"));
            CYAN_POLISHED_STONE.add(iconWithColor(POLISHED_STONETypes.copy(), "cyan"));
            BLACK_POLISHED_STONE.add(iconWithColor(POLISHED_STONETypes.copy(), "black"));
            WHITE_POLISHED_STONE.add(iconWithColor(POLISHED_STONETypes.copy(), "white"));
            LIGHT_GRAY_POLISHED_STONE.add(iconWithColor(POLISHED_STONETypes.copy(), "light_gray"));
            GRAY_POLISHED_STONE.add(iconWithColor(POLISHED_STONETypes.copy(), "gray"));
            LIGHT_BLUE_POLISHED_STONE.add(iconWithColor(POLISHED_STONETypes.copy(), "light_blue"));
            MAGENTA_POLISHED_STONE.add(iconWithColor(POLISHED_STONETypes.copy(), "magenta"));
            BROWN_POLISHED_STONE.add(iconWithColor(POLISHED_STONETypes.copy(), "brown"));
            LIME_POLISHED_STONE.add(iconWithColor(POLISHED_STONETypes.copy(), "lime"));
        }
    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }
}