package com.benbenlaw.caveopolis.data.recipes;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

import java.util.Arrays;

public class ColoredBambooMosaicResults {

    public static final NonNullList<ItemStack> BLUE_BAMBOO_MOSAIC;
    public static final NonNullList<ItemStack> RED_BAMBOO_MOSAIC;
    public static final NonNullList<ItemStack> YELLOW_BAMBOO_MOSAIC;
    public static final NonNullList<ItemStack> GREEN_BAMBOO_MOSAIC;
    public static final NonNullList<ItemStack> ORANGE_BAMBOO_MOSAIC;
    public static final NonNullList<ItemStack> PURPLE_BAMBOO_MOSAIC;
    public static final NonNullList<ItemStack> PINK_BAMBOO_MOSAIC;
    public static final NonNullList<ItemStack> CYAN_BAMBOO_MOSAIC;
    public static final NonNullList<ItemStack> BLACK_BAMBOO_MOSAIC;
    public static final NonNullList<ItemStack> WHITE_BAMBOO_MOSAIC;
    public static final NonNullList<ItemStack> LIGHT_GRAY_BAMBOO_MOSAIC;
    public static final NonNullList<ItemStack> GRAY_BAMBOO_MOSAIC;
    public static final NonNullList<ItemStack> LIGHT_BLUE_BAMBOO_MOSAIC;
    public static final NonNullList<ItemStack> MAGENTA_BAMBOO_MOSAIC;
    public static final NonNullList<ItemStack> BROWN_BAMBOO_MOSAIC;
    public static final NonNullList<ItemStack> LIME_BAMBOO_MOSAIC;


    static {

        BLUE_BAMBOO_MOSAIC = NonNullList.create();
        RED_BAMBOO_MOSAIC = NonNullList.create();
        YELLOW_BAMBOO_MOSAIC = NonNullList.create();
        GREEN_BAMBOO_MOSAIC = NonNullList.create();
        ORANGE_BAMBOO_MOSAIC = NonNullList.create();
        PURPLE_BAMBOO_MOSAIC = NonNullList.create();
        PINK_BAMBOO_MOSAIC = NonNullList.create();
        CYAN_BAMBOO_MOSAIC = NonNullList.create();
        BLACK_BAMBOO_MOSAIC = NonNullList.create();
        WHITE_BAMBOO_MOSAIC = NonNullList.create();
        LIGHT_GRAY_BAMBOO_MOSAIC = NonNullList.create();
        GRAY_BAMBOO_MOSAIC = NonNullList.create();
        LIGHT_BLUE_BAMBOO_MOSAIC = NonNullList.create();
        MAGENTA_BAMBOO_MOSAIC = NonNullList.create();
        BROWN_BAMBOO_MOSAIC = NonNullList.create();
        LIME_BAMBOO_MOSAIC = NonNullList.create();

        for (ItemStack bambooMosaicTypes : Arrays.asList(
                new ItemStack(CaveopolisItems.COLORED_BAMBOO_MOSAIC_SLAB.get(), 2),
                new ItemStack(CaveopolisItems.COLORED_BAMBOO_MOSAIC_STAIRS.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_BAMBOO_MOSAIC_PRESSURE_PLATE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_BAMBOO_MOSAIC_BUTTON.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_BAMBOO_MOSAIC_FENCE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_BAMBOO_MOSAIC_FENCE_GATE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_BAMBOO_MOSAIC_DOOR.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_BAMBOO_MOSAIC_TRAPDOOR.get(), 1)
        ))


        {
            BLUE_BAMBOO_MOSAIC.add(iconWithColor(bambooMosaicTypes.copy(), "blue"));
            RED_BAMBOO_MOSAIC.add(iconWithColor(bambooMosaicTypes.copy(), "red"));
            YELLOW_BAMBOO_MOSAIC.add(iconWithColor(bambooMosaicTypes.copy(), "yellow"));
            GREEN_BAMBOO_MOSAIC.add(iconWithColor(bambooMosaicTypes.copy(), "green"));
            ORANGE_BAMBOO_MOSAIC.add(iconWithColor(bambooMosaicTypes.copy(), "orange"));
            PURPLE_BAMBOO_MOSAIC.add(iconWithColor(bambooMosaicTypes.copy(), "purple"));
            PINK_BAMBOO_MOSAIC.add(iconWithColor(bambooMosaicTypes.copy(), "pink"));
            CYAN_BAMBOO_MOSAIC.add(iconWithColor(bambooMosaicTypes.copy(), "cyan"));
            BLACK_BAMBOO_MOSAIC.add(iconWithColor(bambooMosaicTypes.copy(), "black"));
            WHITE_BAMBOO_MOSAIC.add(iconWithColor(bambooMosaicTypes.copy(), "white"));
            LIGHT_GRAY_BAMBOO_MOSAIC.add(iconWithColor(bambooMosaicTypes.copy(), "light_gray"));
            GRAY_BAMBOO_MOSAIC.add(iconWithColor(bambooMosaicTypes.copy(), "gray"));
            LIGHT_BLUE_BAMBOO_MOSAIC.add(iconWithColor(bambooMosaicTypes.copy(), "light_blue"));
            MAGENTA_BAMBOO_MOSAIC.add(iconWithColor(bambooMosaicTypes.copy(), "magenta"));
            BROWN_BAMBOO_MOSAIC.add(iconWithColor(bambooMosaicTypes.copy(), "brown"));
            LIME_BAMBOO_MOSAIC.add(iconWithColor(bambooMosaicTypes.copy(), "lime"));
        }
    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }
}