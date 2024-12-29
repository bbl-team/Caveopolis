package com.benbenlaw.caveopolis.data.recipes;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

import java.util.Arrays;

public class ColoredTripleResults {

    public static final NonNullList<ItemStack> BLUE_TRIPLE;
    public static final NonNullList<ItemStack> RED_TRIPLE;
    public static final NonNullList<ItemStack> YELLOW_TRIPLE;
    public static final NonNullList<ItemStack> GREEN_TRIPLE;
    public static final NonNullList<ItemStack> ORANGE_TRIPLE;
    public static final NonNullList<ItemStack> PURPLE_TRIPLE;
    public static final NonNullList<ItemStack> PINK_TRIPLE;
    public static final NonNullList<ItemStack> CYAN_TRIPLE;
    public static final NonNullList<ItemStack> BLACK_TRIPLE;
    public static final NonNullList<ItemStack> WHITE_TRIPLE;
    public static final NonNullList<ItemStack> LIGHT_GRAY_TRIPLE;
    public static final NonNullList<ItemStack> GRAY_TRIPLE;
    public static final NonNullList<ItemStack> LIGHT_BLUE_TRIPLE;
    public static final NonNullList<ItemStack> MAGENTA_TRIPLE;
    public static final NonNullList<ItemStack> BROWN_TRIPLE;
    public static final NonNullList<ItemStack> LIME_TRIPLE;


    static {

        BLUE_TRIPLE = NonNullList.create();
        RED_TRIPLE = NonNullList.create();
        YELLOW_TRIPLE = NonNullList.create();
        GREEN_TRIPLE = NonNullList.create();
        ORANGE_TRIPLE = NonNullList.create();
        PURPLE_TRIPLE = NonNullList.create();
        PINK_TRIPLE = NonNullList.create();
        CYAN_TRIPLE = NonNullList.create();
        BLACK_TRIPLE = NonNullList.create();
        WHITE_TRIPLE = NonNullList.create();
        LIGHT_GRAY_TRIPLE = NonNullList.create();
        GRAY_TRIPLE = NonNullList.create();
        LIGHT_BLUE_TRIPLE = NonNullList.create();
        MAGENTA_TRIPLE = NonNullList.create();
        BROWN_TRIPLE = NonNullList.create();
        LIME_TRIPLE = NonNullList.create();

        for (ItemStack TRIPLETypes : Arrays.asList(
                new ItemStack(CaveopolisItems.COLORED_TRIPLE_SLAB.get(), 2),
                new ItemStack(CaveopolisItems.COLORED_TRIPLE_STAIRS.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_TRIPLE_WALL.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_TRIPLE_PRESSURE_PLATE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_TRIPLE_BUTTON.get(), 1)
        ))


        {
            BLUE_TRIPLE.add(iconWithColor(TRIPLETypes.copy(), "blue"));
            RED_TRIPLE.add(iconWithColor(TRIPLETypes.copy(), "red"));
            YELLOW_TRIPLE.add(iconWithColor(TRIPLETypes.copy(), "yellow"));
            GREEN_TRIPLE.add(iconWithColor(TRIPLETypes.copy(), "green"));
            ORANGE_TRIPLE.add(iconWithColor(TRIPLETypes.copy(), "orange"));
            PURPLE_TRIPLE.add(iconWithColor(TRIPLETypes.copy(), "purple"));
            PINK_TRIPLE.add(iconWithColor(TRIPLETypes.copy(), "pink"));
            CYAN_TRIPLE.add(iconWithColor(TRIPLETypes.copy(), "cyan"));
            BLACK_TRIPLE.add(iconWithColor(TRIPLETypes.copy(), "black"));
            WHITE_TRIPLE.add(iconWithColor(TRIPLETypes.copy(), "white"));
            LIGHT_GRAY_TRIPLE.add(iconWithColor(TRIPLETypes.copy(), "light_gray"));
            GRAY_TRIPLE.add(iconWithColor(TRIPLETypes.copy(), "gray"));
            LIGHT_BLUE_TRIPLE.add(iconWithColor(TRIPLETypes.copy(), "light_blue"));
            MAGENTA_TRIPLE.add(iconWithColor(TRIPLETypes.copy(), "magenta"));
            BROWN_TRIPLE.add(iconWithColor(TRIPLETypes.copy(), "brown"));
            LIME_TRIPLE.add(iconWithColor(TRIPLETypes.copy(), "lime"));
        }
    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }
}