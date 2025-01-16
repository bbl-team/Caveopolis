package com.benbenlaw.caveopolis.data.recipes;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

import java.util.Arrays;

public class ColoredBambooResults {

    public static final NonNullList<ItemStack> BLUE_BAMBOO;
    public static final NonNullList<ItemStack> RED_BAMBOO;
    public static final NonNullList<ItemStack> YELLOW_BAMBOO;
    public static final NonNullList<ItemStack> GREEN_BAMBOO;
    public static final NonNullList<ItemStack> ORANGE_BAMBOO;
    public static final NonNullList<ItemStack> PURPLE_BAMBOO;
    public static final NonNullList<ItemStack> PINK_BAMBOO;
    public static final NonNullList<ItemStack> CYAN_BAMBOO;
    public static final NonNullList<ItemStack> BLACK_BAMBOO;
    public static final NonNullList<ItemStack> WHITE_BAMBOO;
    public static final NonNullList<ItemStack> LIGHT_GRAY_BAMBOO;
    public static final NonNullList<ItemStack> GRAY_BAMBOO;
    public static final NonNullList<ItemStack> LIGHT_BLUE_BAMBOO;
    public static final NonNullList<ItemStack> MAGENTA_BAMBOO;
    public static final NonNullList<ItemStack> BROWN_BAMBOO;
    public static final NonNullList<ItemStack> LIME_BAMBOO;


    static {

        BLUE_BAMBOO = NonNullList.create();
        RED_BAMBOO = NonNullList.create();
        YELLOW_BAMBOO = NonNullList.create();
        GREEN_BAMBOO = NonNullList.create();
        ORANGE_BAMBOO = NonNullList.create();
        PURPLE_BAMBOO = NonNullList.create();
        PINK_BAMBOO = NonNullList.create();
        CYAN_BAMBOO = NonNullList.create();
        BLACK_BAMBOO = NonNullList.create();
        WHITE_BAMBOO = NonNullList.create();
        LIGHT_GRAY_BAMBOO = NonNullList.create();
        GRAY_BAMBOO = NonNullList.create();
        LIGHT_BLUE_BAMBOO = NonNullList.create();
        MAGENTA_BAMBOO = NonNullList.create();
        BROWN_BAMBOO = NonNullList.create();
        LIME_BAMBOO = NonNullList.create();

        for (ItemStack bambooTypes : Arrays.asList(
                new ItemStack(CaveopolisItems.COLORED_BAMBOO_SLAB.get(), 2),
                new ItemStack(CaveopolisItems.COLORED_BAMBOO_STAIRS.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_BAMBOO_PRESSURE_PLATE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_BAMBOO_BUTTON.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_BAMBOO_FENCE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_BAMBOO_FENCE_GATE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_BAMBOO_DOOR.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_BAMBOO_TRAPDOOR.get(), 1)
        ))


        {
            BLUE_BAMBOO.add(iconWithColor(bambooTypes.copy(), "blue"));
            RED_BAMBOO.add(iconWithColor(bambooTypes.copy(), "red"));
            YELLOW_BAMBOO.add(iconWithColor(bambooTypes.copy(), "yellow"));
            GREEN_BAMBOO.add(iconWithColor(bambooTypes.copy(), "green"));
            ORANGE_BAMBOO.add(iconWithColor(bambooTypes.copy(), "orange"));
            PURPLE_BAMBOO.add(iconWithColor(bambooTypes.copy(), "purple"));
            PINK_BAMBOO.add(iconWithColor(bambooTypes.copy(), "pink"));
            CYAN_BAMBOO.add(iconWithColor(bambooTypes.copy(), "cyan"));
            BLACK_BAMBOO.add(iconWithColor(bambooTypes.copy(), "black"));
            WHITE_BAMBOO.add(iconWithColor(bambooTypes.copy(), "white"));
            LIGHT_GRAY_BAMBOO.add(iconWithColor(bambooTypes.copy(), "light_gray"));
            GRAY_BAMBOO.add(iconWithColor(bambooTypes.copy(), "gray"));
            LIGHT_BLUE_BAMBOO.add(iconWithColor(bambooTypes.copy(), "light_blue"));
            MAGENTA_BAMBOO.add(iconWithColor(bambooTypes.copy(), "magenta"));
            BROWN_BAMBOO.add(iconWithColor(bambooTypes.copy(), "brown"));
            LIME_BAMBOO.add(iconWithColor(bambooTypes.copy(), "lime"));
        }
    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }
}