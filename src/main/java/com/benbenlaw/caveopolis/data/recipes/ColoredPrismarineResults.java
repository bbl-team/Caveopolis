package com.benbenlaw.caveopolis.data.recipes;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

import java.util.Arrays;

public class ColoredPrismarineResults {

    public static final NonNullList<ItemStack> BLUE_PRISMARINE;
    public static final NonNullList<ItemStack> RED_PRISMARINE;
    public static final NonNullList<ItemStack> YELLOW_PRISMARINE;
    public static final NonNullList<ItemStack> GREEN_PRISMARINE;
    public static final NonNullList<ItemStack> ORANGE_PRISMARINE;
    public static final NonNullList<ItemStack> PURPLE_PRISMARINE;
    public static final NonNullList<ItemStack> PINK_PRISMARINE;
    public static final NonNullList<ItemStack> CYAN_PRISMARINE;
    public static final NonNullList<ItemStack> BLACK_PRISMARINE;
    public static final NonNullList<ItemStack> WHITE_PRISMARINE;
    public static final NonNullList<ItemStack> LIGHT_GRAY_PRISMARINE;
    public static final NonNullList<ItemStack> GRAY_PRISMARINE;
    public static final NonNullList<ItemStack> LIGHT_BLUE_PRISMARINE;
    public static final NonNullList<ItemStack> MAGENTA_PRISMARINE;
    public static final NonNullList<ItemStack> BROWN_PRISMARINE;
    public static final NonNullList<ItemStack> LIME_PRISMARINE;


    static {

        BLUE_PRISMARINE = NonNullList.create();
        RED_PRISMARINE = NonNullList.create();
        YELLOW_PRISMARINE = NonNullList.create();
        GREEN_PRISMARINE = NonNullList.create();
        ORANGE_PRISMARINE = NonNullList.create();
        PURPLE_PRISMARINE = NonNullList.create();
        PINK_PRISMARINE = NonNullList.create();
        CYAN_PRISMARINE = NonNullList.create();
        BLACK_PRISMARINE = NonNullList.create();
        WHITE_PRISMARINE = NonNullList.create();
        LIGHT_GRAY_PRISMARINE = NonNullList.create();
        GRAY_PRISMARINE = NonNullList.create();
        LIGHT_BLUE_PRISMARINE = NonNullList.create();
        MAGENTA_PRISMARINE = NonNullList.create();
        BROWN_PRISMARINE = NonNullList.create();
        LIME_PRISMARINE = NonNullList.create();

        for (ItemStack PRISMARINETypes : Arrays.asList(
                new ItemStack(CaveopolisItems.COLORED_PRISMARINE_SLAB.get(), 2),
                new ItemStack(CaveopolisItems.COLORED_PRISMARINE_STAIRS.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_PRISMARINE_WALL.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_PRISMARINE_PRESSURE_PLATE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_PRISMARINE_BUTTON.get(), 1)
        ))


        {
            BLUE_PRISMARINE.add(iconWithColor(PRISMARINETypes.copy(), "blue"));
            RED_PRISMARINE.add(iconWithColor(PRISMARINETypes.copy(), "red"));
            YELLOW_PRISMARINE.add(iconWithColor(PRISMARINETypes.copy(), "yellow"));
            GREEN_PRISMARINE.add(iconWithColor(PRISMARINETypes.copy(), "green"));
            ORANGE_PRISMARINE.add(iconWithColor(PRISMARINETypes.copy(), "orange"));
            PURPLE_PRISMARINE.add(iconWithColor(PRISMARINETypes.copy(), "purple"));
            PINK_PRISMARINE.add(iconWithColor(PRISMARINETypes.copy(), "pink"));
            CYAN_PRISMARINE.add(iconWithColor(PRISMARINETypes.copy(), "cyan"));
            BLACK_PRISMARINE.add(iconWithColor(PRISMARINETypes.copy(), "black"));
            WHITE_PRISMARINE.add(iconWithColor(PRISMARINETypes.copy(), "white"));
            LIGHT_GRAY_PRISMARINE.add(iconWithColor(PRISMARINETypes.copy(), "light_gray"));
            GRAY_PRISMARINE.add(iconWithColor(PRISMARINETypes.copy(), "gray"));
            LIGHT_BLUE_PRISMARINE.add(iconWithColor(PRISMARINETypes.copy(), "light_blue"));
            MAGENTA_PRISMARINE.add(iconWithColor(PRISMARINETypes.copy(), "magenta"));
            BROWN_PRISMARINE.add(iconWithColor(PRISMARINETypes.copy(), "brown"));
            LIME_PRISMARINE.add(iconWithColor(PRISMARINETypes.copy(), "lime"));
        }
    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }
}