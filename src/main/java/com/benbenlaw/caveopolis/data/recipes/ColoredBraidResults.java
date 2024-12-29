package com.benbenlaw.caveopolis.data.recipes;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

import java.util.Arrays;

public class ColoredBraidResults {

    public static final NonNullList<ItemStack> BLUE_BRAID;
    public static final NonNullList<ItemStack> RED_BRAID;
    public static final NonNullList<ItemStack> YELLOW_BRAID;
    public static final NonNullList<ItemStack> GREEN_BRAID;
    public static final NonNullList<ItemStack> ORANGE_BRAID;
    public static final NonNullList<ItemStack> PURPLE_BRAID;
    public static final NonNullList<ItemStack> PINK_BRAID;
    public static final NonNullList<ItemStack> CYAN_BRAID;
    public static final NonNullList<ItemStack> BLACK_BRAID;
    public static final NonNullList<ItemStack> WHITE_BRAID;
    public static final NonNullList<ItemStack> LIGHT_GRAY_BRAID;
    public static final NonNullList<ItemStack> GRAY_BRAID;
    public static final NonNullList<ItemStack> LIGHT_BLUE_BRAID;
    public static final NonNullList<ItemStack> MAGENTA_BRAID;
    public static final NonNullList<ItemStack> BROWN_BRAID;
    public static final NonNullList<ItemStack> LIME_BRAID;


    static {

        BLUE_BRAID = NonNullList.create();
        RED_BRAID = NonNullList.create();
        YELLOW_BRAID = NonNullList.create();
        GREEN_BRAID = NonNullList.create();
        ORANGE_BRAID = NonNullList.create();
        PURPLE_BRAID = NonNullList.create();
        PINK_BRAID = NonNullList.create();
        CYAN_BRAID = NonNullList.create();
        BLACK_BRAID = NonNullList.create();
        WHITE_BRAID = NonNullList.create();
        LIGHT_GRAY_BRAID = NonNullList.create();
        GRAY_BRAID = NonNullList.create();
        LIGHT_BLUE_BRAID = NonNullList.create();
        MAGENTA_BRAID = NonNullList.create();
        BROWN_BRAID = NonNullList.create();
        LIME_BRAID = NonNullList.create();

        for (ItemStack BRAIDTypes : Arrays.asList(
                new ItemStack(CaveopolisItems.COLORED_BRAID_SLAB.get(), 2),
                new ItemStack(CaveopolisItems.COLORED_BRAID_STAIRS.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_BRAID_WALL.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_BRAID_PRESSURE_PLATE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_BRAID_BUTTON.get(), 1)
        ))


        {
            BLUE_BRAID.add(iconWithColor(BRAIDTypes.copy(), "blue"));
            RED_BRAID.add(iconWithColor(BRAIDTypes.copy(), "red"));
            YELLOW_BRAID.add(iconWithColor(BRAIDTypes.copy(), "yellow"));
            GREEN_BRAID.add(iconWithColor(BRAIDTypes.copy(), "green"));
            ORANGE_BRAID.add(iconWithColor(BRAIDTypes.copy(), "orange"));
            PURPLE_BRAID.add(iconWithColor(BRAIDTypes.copy(), "purple"));
            PINK_BRAID.add(iconWithColor(BRAIDTypes.copy(), "pink"));
            CYAN_BRAID.add(iconWithColor(BRAIDTypes.copy(), "cyan"));
            BLACK_BRAID.add(iconWithColor(BRAIDTypes.copy(), "black"));
            WHITE_BRAID.add(iconWithColor(BRAIDTypes.copy(), "white"));
            LIGHT_GRAY_BRAID.add(iconWithColor(BRAIDTypes.copy(), "light_gray"));
            GRAY_BRAID.add(iconWithColor(BRAIDTypes.copy(), "gray"));
            LIGHT_BLUE_BRAID.add(iconWithColor(BRAIDTypes.copy(), "light_blue"));
            MAGENTA_BRAID.add(iconWithColor(BRAIDTypes.copy(), "magenta"));
            BROWN_BRAID.add(iconWithColor(BRAIDTypes.copy(), "brown"));
            LIME_BRAID.add(iconWithColor(BRAIDTypes.copy(), "lime"));
        }
    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }
}