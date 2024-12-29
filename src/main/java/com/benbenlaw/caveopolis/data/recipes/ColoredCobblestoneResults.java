package com.benbenlaw.caveopolis.data.recipes;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

import java.util.Arrays;

public class ColoredCobblestoneResults {

    public static final NonNullList<ItemStack> BLUE_COBBLESTONE;
    public static final NonNullList<ItemStack> RED_COBBLESTONE;
    public static final NonNullList<ItemStack> YELLOW_COBBLESTONE;
    public static final NonNullList<ItemStack> GREEN_COBBLESTONE;
    public static final NonNullList<ItemStack> ORANGE_COBBLESTONE;
    public static final NonNullList<ItemStack> PURPLE_COBBLESTONE;
    public static final NonNullList<ItemStack> PINK_COBBLESTONE;
    public static final NonNullList<ItemStack> CYAN_COBBLESTONE;
    public static final NonNullList<ItemStack> BLACK_COBBLESTONE;
    public static final NonNullList<ItemStack> WHITE_COBBLESTONE;
    public static final NonNullList<ItemStack> LIGHT_GRAY_COBBLESTONE;
    public static final NonNullList<ItemStack> GRAY_COBBLESTONE;
    public static final NonNullList<ItemStack> LIGHT_BLUE_COBBLESTONE;
    public static final NonNullList<ItemStack> MAGENTA_COBBLESTONE;
    public static final NonNullList<ItemStack> BROWN_COBBLESTONE;
    public static final NonNullList<ItemStack> LIME_COBBLESTONE;


    static {

        BLUE_COBBLESTONE = NonNullList.create();
        RED_COBBLESTONE = NonNullList.create();
        YELLOW_COBBLESTONE = NonNullList.create();
        GREEN_COBBLESTONE = NonNullList.create();
        ORANGE_COBBLESTONE = NonNullList.create();
        PURPLE_COBBLESTONE = NonNullList.create();
        PINK_COBBLESTONE = NonNullList.create();
        CYAN_COBBLESTONE = NonNullList.create();
        BLACK_COBBLESTONE = NonNullList.create();
        WHITE_COBBLESTONE = NonNullList.create();
        LIGHT_GRAY_COBBLESTONE = NonNullList.create();
        GRAY_COBBLESTONE = NonNullList.create();
        LIGHT_BLUE_COBBLESTONE = NonNullList.create();
        MAGENTA_COBBLESTONE = NonNullList.create();
        BROWN_COBBLESTONE = NonNullList.create();
        LIME_COBBLESTONE = NonNullList.create();

        for (ItemStack COBBLESTONETypes : Arrays.asList(
                new ItemStack(CaveopolisItems.COLORED_COBBLESTONE_SLAB.get(), 2),
                new ItemStack(CaveopolisItems.COLORED_COBBLESTONE_STAIRS.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_COBBLESTONE_WALL.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_COBBLESTONE_PRESSURE_PLATE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_COBBLESTONE_BUTTON.get(), 1)
        ))


        {
            BLUE_COBBLESTONE.add(iconWithColor(COBBLESTONETypes.copy(), "blue"));
            RED_COBBLESTONE.add(iconWithColor(COBBLESTONETypes.copy(), "red"));
            YELLOW_COBBLESTONE.add(iconWithColor(COBBLESTONETypes.copy(), "yellow"));
            GREEN_COBBLESTONE.add(iconWithColor(COBBLESTONETypes.copy(), "green"));
            ORANGE_COBBLESTONE.add(iconWithColor(COBBLESTONETypes.copy(), "orange"));
            PURPLE_COBBLESTONE.add(iconWithColor(COBBLESTONETypes.copy(), "purple"));
            PINK_COBBLESTONE.add(iconWithColor(COBBLESTONETypes.copy(), "pink"));
            CYAN_COBBLESTONE.add(iconWithColor(COBBLESTONETypes.copy(), "cyan"));
            BLACK_COBBLESTONE.add(iconWithColor(COBBLESTONETypes.copy(), "black"));
            WHITE_COBBLESTONE.add(iconWithColor(COBBLESTONETypes.copy(), "white"));
            LIGHT_GRAY_COBBLESTONE.add(iconWithColor(COBBLESTONETypes.copy(), "light_gray"));
            GRAY_COBBLESTONE.add(iconWithColor(COBBLESTONETypes.copy(), "gray"));
            LIGHT_BLUE_COBBLESTONE.add(iconWithColor(COBBLESTONETypes.copy(), "light_blue"));
            MAGENTA_COBBLESTONE.add(iconWithColor(COBBLESTONETypes.copy(), "magenta"));
            BROWN_COBBLESTONE.add(iconWithColor(COBBLESTONETypes.copy(), "brown"));
            LIME_COBBLESTONE.add(iconWithColor(COBBLESTONETypes.copy(), "lime"));
        }
    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }
}