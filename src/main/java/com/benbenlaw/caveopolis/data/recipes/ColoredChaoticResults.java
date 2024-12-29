package com.benbenlaw.caveopolis.data.recipes;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

import java.util.Arrays;

public class ColoredChaoticResults {

    public static final NonNullList<ItemStack> BLUE_CHAOTIC;
    public static final NonNullList<ItemStack> RED_CHAOTIC;
    public static final NonNullList<ItemStack> YELLOW_CHAOTIC;
    public static final NonNullList<ItemStack> GREEN_CHAOTIC;
    public static final NonNullList<ItemStack> ORANGE_CHAOTIC;
    public static final NonNullList<ItemStack> PURPLE_CHAOTIC;
    public static final NonNullList<ItemStack> PINK_CHAOTIC;
    public static final NonNullList<ItemStack> CYAN_CHAOTIC;
    public static final NonNullList<ItemStack> BLACK_CHAOTIC;
    public static final NonNullList<ItemStack> WHITE_CHAOTIC;
    public static final NonNullList<ItemStack> LIGHT_GRAY_CHAOTIC;
    public static final NonNullList<ItemStack> GRAY_CHAOTIC;
    public static final NonNullList<ItemStack> LIGHT_BLUE_CHAOTIC;
    public static final NonNullList<ItemStack> MAGENTA_CHAOTIC;
    public static final NonNullList<ItemStack> BROWN_CHAOTIC;
    public static final NonNullList<ItemStack> LIME_CHAOTIC;


    static {

        BLUE_CHAOTIC = NonNullList.create();
        RED_CHAOTIC = NonNullList.create();
        YELLOW_CHAOTIC = NonNullList.create();
        GREEN_CHAOTIC = NonNullList.create();
        ORANGE_CHAOTIC = NonNullList.create();
        PURPLE_CHAOTIC = NonNullList.create();
        PINK_CHAOTIC = NonNullList.create();
        CYAN_CHAOTIC = NonNullList.create();
        BLACK_CHAOTIC = NonNullList.create();
        WHITE_CHAOTIC = NonNullList.create();
        LIGHT_GRAY_CHAOTIC = NonNullList.create();
        GRAY_CHAOTIC = NonNullList.create();
        LIGHT_BLUE_CHAOTIC = NonNullList.create();
        MAGENTA_CHAOTIC = NonNullList.create();
        BROWN_CHAOTIC = NonNullList.create();
        LIME_CHAOTIC = NonNullList.create();

        for (ItemStack CHAOTICTypes : Arrays.asList(
                new ItemStack(CaveopolisItems.COLORED_CHAOTIC_SLAB.get(), 2),
                new ItemStack(CaveopolisItems.COLORED_CHAOTIC_STAIRS.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_CHAOTIC_WALL.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_CHAOTIC_PRESSURE_PLATE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_CHAOTIC_BUTTON.get(), 1)
        ))


        {
            BLUE_CHAOTIC.add(iconWithColor(CHAOTICTypes.copy(), "blue"));
            RED_CHAOTIC.add(iconWithColor(CHAOTICTypes.copy(), "red"));
            YELLOW_CHAOTIC.add(iconWithColor(CHAOTICTypes.copy(), "yellow"));
            GREEN_CHAOTIC.add(iconWithColor(CHAOTICTypes.copy(), "green"));
            ORANGE_CHAOTIC.add(iconWithColor(CHAOTICTypes.copy(), "orange"));
            PURPLE_CHAOTIC.add(iconWithColor(CHAOTICTypes.copy(), "purple"));
            PINK_CHAOTIC.add(iconWithColor(CHAOTICTypes.copy(), "pink"));
            CYAN_CHAOTIC.add(iconWithColor(CHAOTICTypes.copy(), "cyan"));
            BLACK_CHAOTIC.add(iconWithColor(CHAOTICTypes.copy(), "black"));
            WHITE_CHAOTIC.add(iconWithColor(CHAOTICTypes.copy(), "white"));
            LIGHT_GRAY_CHAOTIC.add(iconWithColor(CHAOTICTypes.copy(), "light_gray"));
            GRAY_CHAOTIC.add(iconWithColor(CHAOTICTypes.copy(), "gray"));
            LIGHT_BLUE_CHAOTIC.add(iconWithColor(CHAOTICTypes.copy(), "light_blue"));
            MAGENTA_CHAOTIC.add(iconWithColor(CHAOTICTypes.copy(), "magenta"));
            BROWN_CHAOTIC.add(iconWithColor(CHAOTICTypes.copy(), "brown"));
            LIME_CHAOTIC.add(iconWithColor(CHAOTICTypes.copy(), "lime"));
        }
    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }
}