package com.benbenlaw.caveopolis.data.recipes;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

import java.util.Arrays;

public class ColoredMarbleResults {

    public static final NonNullList<ItemStack> BLUE_MARBLE;
    public static final NonNullList<ItemStack> RED_MARBLE;
    public static final NonNullList<ItemStack> YELLOW_MARBLE;
    public static final NonNullList<ItemStack> GREEN_MARBLE;
    public static final NonNullList<ItemStack> ORANGE_MARBLE;
    public static final NonNullList<ItemStack> PURPLE_MARBLE;
    public static final NonNullList<ItemStack> PINK_MARBLE;
    public static final NonNullList<ItemStack> CYAN_MARBLE;
    public static final NonNullList<ItemStack> BLACK_MARBLE;
    public static final NonNullList<ItemStack> WHITE_MARBLE;
    public static final NonNullList<ItemStack> LIGHT_GRAY_MARBLE;
    public static final NonNullList<ItemStack> GRAY_MARBLE;
    public static final NonNullList<ItemStack> LIGHT_BLUE_MARBLE;
    public static final NonNullList<ItemStack> MAGENTA_MARBLE;
    public static final NonNullList<ItemStack> BROWN_MARBLE;
    public static final NonNullList<ItemStack> LIME_MARBLE;


    static {

        BLUE_MARBLE = NonNullList.create();
        RED_MARBLE = NonNullList.create();
        YELLOW_MARBLE = NonNullList.create();
        GREEN_MARBLE = NonNullList.create();
        ORANGE_MARBLE = NonNullList.create();
        PURPLE_MARBLE = NonNullList.create();
        PINK_MARBLE = NonNullList.create();
        CYAN_MARBLE = NonNullList.create();
        BLACK_MARBLE = NonNullList.create();
        WHITE_MARBLE = NonNullList.create();
        LIGHT_GRAY_MARBLE = NonNullList.create();
        GRAY_MARBLE = NonNullList.create();
        LIGHT_BLUE_MARBLE = NonNullList.create();
        MAGENTA_MARBLE = NonNullList.create();
        BROWN_MARBLE = NonNullList.create();
        LIME_MARBLE = NonNullList.create();

        for (ItemStack MARBLETypes : Arrays.asList(
                new ItemStack(CaveopolisItems.COLORED_MARBLE_SLAB.get(), 2),
                new ItemStack(CaveopolisItems.COLORED_MARBLE_STAIRS.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_MARBLE_WALL.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_MARBLE_PRESSURE_PLATE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_MARBLE_BUTTON.get(), 1)
        ))


        {
            BLUE_MARBLE.add(iconWithColor(MARBLETypes.copy(), "blue"));
            RED_MARBLE.add(iconWithColor(MARBLETypes.copy(), "red"));
            YELLOW_MARBLE.add(iconWithColor(MARBLETypes.copy(), "yellow"));
            GREEN_MARBLE.add(iconWithColor(MARBLETypes.copy(), "green"));
            ORANGE_MARBLE.add(iconWithColor(MARBLETypes.copy(), "orange"));
            PURPLE_MARBLE.add(iconWithColor(MARBLETypes.copy(), "purple"));
            PINK_MARBLE.add(iconWithColor(MARBLETypes.copy(), "pink"));
            CYAN_MARBLE.add(iconWithColor(MARBLETypes.copy(), "cyan"));
            BLACK_MARBLE.add(iconWithColor(MARBLETypes.copy(), "black"));
            WHITE_MARBLE.add(iconWithColor(MARBLETypes.copy(), "white"));
            LIGHT_GRAY_MARBLE.add(iconWithColor(MARBLETypes.copy(), "light_gray"));
            GRAY_MARBLE.add(iconWithColor(MARBLETypes.copy(), "gray"));
            LIGHT_BLUE_MARBLE.add(iconWithColor(MARBLETypes.copy(), "light_blue"));
            MAGENTA_MARBLE.add(iconWithColor(MARBLETypes.copy(), "magenta"));
            BROWN_MARBLE.add(iconWithColor(MARBLETypes.copy(), "brown"));
            LIME_MARBLE.add(iconWithColor(MARBLETypes.copy(), "lime"));
        }
    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }
}