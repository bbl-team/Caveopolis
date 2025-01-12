package com.benbenlaw.caveopolis.data.recipes;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

import java.util.Arrays;

public class ColoredDarkPrismarineResults {

    public static final NonNullList<ItemStack> BLUE_DARK_PRISMARINE;
    public static final NonNullList<ItemStack> RED_DARK_PRISMARINE;
    public static final NonNullList<ItemStack> YELLOW_DARK_PRISMARINE;
    public static final NonNullList<ItemStack> GREEN_DARK_PRISMARINE;
    public static final NonNullList<ItemStack> ORANGE_DARK_PRISMARINE;
    public static final NonNullList<ItemStack> PURPLE_DARK_PRISMARINE;
    public static final NonNullList<ItemStack> PINK_DARK_PRISMARINE;
    public static final NonNullList<ItemStack> CYAN_DARK_PRISMARINE;
    public static final NonNullList<ItemStack> BLACK_DARK_PRISMARINE;
    public static final NonNullList<ItemStack> WHITE_DARK_PRISMARINE;
    public static final NonNullList<ItemStack> LIGHT_GRAY_DARK_PRISMARINE;
    public static final NonNullList<ItemStack> GRAY_DARK_PRISMARINE;
    public static final NonNullList<ItemStack> LIGHT_BLUE_DARK_PRISMARINE;
    public static final NonNullList<ItemStack> MAGENTA_DARK_PRISMARINE;
    public static final NonNullList<ItemStack> BROWN_DARK_PRISMARINE;
    public static final NonNullList<ItemStack> LIME_DARK_PRISMARINE;


    static {

        BLUE_DARK_PRISMARINE = NonNullList.create();
        RED_DARK_PRISMARINE = NonNullList.create();
        YELLOW_DARK_PRISMARINE = NonNullList.create();
        GREEN_DARK_PRISMARINE = NonNullList.create();
        ORANGE_DARK_PRISMARINE = NonNullList.create();
        PURPLE_DARK_PRISMARINE = NonNullList.create();
        PINK_DARK_PRISMARINE = NonNullList.create();
        CYAN_DARK_PRISMARINE = NonNullList.create();
        BLACK_DARK_PRISMARINE = NonNullList.create();
        WHITE_DARK_PRISMARINE = NonNullList.create();
        LIGHT_GRAY_DARK_PRISMARINE = NonNullList.create();
        GRAY_DARK_PRISMARINE = NonNullList.create();
        LIGHT_BLUE_DARK_PRISMARINE = NonNullList.create();
        MAGENTA_DARK_PRISMARINE = NonNullList.create();
        BROWN_DARK_PRISMARINE = NonNullList.create();
        LIME_DARK_PRISMARINE = NonNullList.create();

        for (ItemStack DARK_PRISMARINETypes : Arrays.asList(
                new ItemStack(CaveopolisItems.COLORED_DARK_PRISMARINE_SLAB.get(), 2),
                new ItemStack(CaveopolisItems.COLORED_DARK_PRISMARINE_STAIRS.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_DARK_PRISMARINE_WALL.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_DARK_PRISMARINE_PRESSURE_PLATE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_DARK_PRISMARINE_BUTTON.get(), 1)
        ))


        {
            BLUE_DARK_PRISMARINE.add(iconWithColor(DARK_PRISMARINETypes.copy(), "blue"));
            RED_DARK_PRISMARINE.add(iconWithColor(DARK_PRISMARINETypes.copy(), "red"));
            YELLOW_DARK_PRISMARINE.add(iconWithColor(DARK_PRISMARINETypes.copy(), "yellow"));
            GREEN_DARK_PRISMARINE.add(iconWithColor(DARK_PRISMARINETypes.copy(), "green"));
            ORANGE_DARK_PRISMARINE.add(iconWithColor(DARK_PRISMARINETypes.copy(), "orange"));
            PURPLE_DARK_PRISMARINE.add(iconWithColor(DARK_PRISMARINETypes.copy(), "purple"));
            PINK_DARK_PRISMARINE.add(iconWithColor(DARK_PRISMARINETypes.copy(), "pink"));
            CYAN_DARK_PRISMARINE.add(iconWithColor(DARK_PRISMARINETypes.copy(), "cyan"));
            BLACK_DARK_PRISMARINE.add(iconWithColor(DARK_PRISMARINETypes.copy(), "black"));
            WHITE_DARK_PRISMARINE.add(iconWithColor(DARK_PRISMARINETypes.copy(), "white"));
            LIGHT_GRAY_DARK_PRISMARINE.add(iconWithColor(DARK_PRISMARINETypes.copy(), "light_gray"));
            GRAY_DARK_PRISMARINE.add(iconWithColor(DARK_PRISMARINETypes.copy(), "gray"));
            LIGHT_BLUE_DARK_PRISMARINE.add(iconWithColor(DARK_PRISMARINETypes.copy(), "light_blue"));
            MAGENTA_DARK_PRISMARINE.add(iconWithColor(DARK_PRISMARINETypes.copy(), "magenta"));
            BROWN_DARK_PRISMARINE.add(iconWithColor(DARK_PRISMARINETypes.copy(), "brown"));
            LIME_DARK_PRISMARINE.add(iconWithColor(DARK_PRISMARINETypes.copy(), "lime"));
        }
    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }
}