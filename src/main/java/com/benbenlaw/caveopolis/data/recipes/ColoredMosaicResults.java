package com.benbenlaw.caveopolis.data.recipes;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

import java.util.Arrays;

public class ColoredMosaicResults {

    public static final NonNullList<ItemStack> BLUE_MOSAIC;
    public static final NonNullList<ItemStack> RED_MOSAIC;
    public static final NonNullList<ItemStack> YELLOW_MOSAIC;
    public static final NonNullList<ItemStack> GREEN_MOSAIC;
    public static final NonNullList<ItemStack> ORANGE_MOSAIC;
    public static final NonNullList<ItemStack> PURPLE_MOSAIC;
    public static final NonNullList<ItemStack> PINK_MOSAIC;
    public static final NonNullList<ItemStack> CYAN_MOSAIC;
    public static final NonNullList<ItemStack> BLACK_MOSAIC;
    public static final NonNullList<ItemStack> WHITE_MOSAIC;
    public static final NonNullList<ItemStack> LIGHT_GRAY_MOSAIC;
    public static final NonNullList<ItemStack> GRAY_MOSAIC;
    public static final NonNullList<ItemStack> LIGHT_BLUE_MOSAIC;
    public static final NonNullList<ItemStack> MAGENTA_MOSAIC;
    public static final NonNullList<ItemStack> BROWN_MOSAIC;
    public static final NonNullList<ItemStack> LIME_MOSAIC;


    static {

        BLUE_MOSAIC = NonNullList.create();
        RED_MOSAIC = NonNullList.create();
        YELLOW_MOSAIC = NonNullList.create();
        GREEN_MOSAIC = NonNullList.create();
        ORANGE_MOSAIC = NonNullList.create();
        PURPLE_MOSAIC = NonNullList.create();
        PINK_MOSAIC = NonNullList.create();
        CYAN_MOSAIC = NonNullList.create();
        BLACK_MOSAIC = NonNullList.create();
        WHITE_MOSAIC = NonNullList.create();
        LIGHT_GRAY_MOSAIC = NonNullList.create();
        GRAY_MOSAIC = NonNullList.create();
        LIGHT_BLUE_MOSAIC = NonNullList.create();
        MAGENTA_MOSAIC = NonNullList.create();
        BROWN_MOSAIC = NonNullList.create();
        LIME_MOSAIC = NonNullList.create();

        for (ItemStack MOSAICTypes : Arrays.asList(
                new ItemStack(CaveopolisItems.COLORED_MOSAIC_SLAB.get(), 2),
                new ItemStack(CaveopolisItems.COLORED_MOSAIC_STAIRS.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_MOSAIC_WALL.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_MOSAIC_PRESSURE_PLATE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_MOSAIC_BUTTON.get(), 1)
        ))


        {
            BLUE_MOSAIC.add(iconWithColor(MOSAICTypes.copy(), "blue"));
            RED_MOSAIC.add(iconWithColor(MOSAICTypes.copy(), "red"));
            YELLOW_MOSAIC.add(iconWithColor(MOSAICTypes.copy(), "yellow"));
            GREEN_MOSAIC.add(iconWithColor(MOSAICTypes.copy(), "green"));
            ORANGE_MOSAIC.add(iconWithColor(MOSAICTypes.copy(), "orange"));
            PURPLE_MOSAIC.add(iconWithColor(MOSAICTypes.copy(), "purple"));
            PINK_MOSAIC.add(iconWithColor(MOSAICTypes.copy(), "pink"));
            CYAN_MOSAIC.add(iconWithColor(MOSAICTypes.copy(), "cyan"));
            BLACK_MOSAIC.add(iconWithColor(MOSAICTypes.copy(), "black"));
            WHITE_MOSAIC.add(iconWithColor(MOSAICTypes.copy(), "white"));
            LIGHT_GRAY_MOSAIC.add(iconWithColor(MOSAICTypes.copy(), "light_gray"));
            GRAY_MOSAIC.add(iconWithColor(MOSAICTypes.copy(), "gray"));
            LIGHT_BLUE_MOSAIC.add(iconWithColor(MOSAICTypes.copy(), "light_blue"));
            MAGENTA_MOSAIC.add(iconWithColor(MOSAICTypes.copy(), "magenta"));
            BROWN_MOSAIC.add(iconWithColor(MOSAICTypes.copy(), "brown"));
            LIME_MOSAIC.add(iconWithColor(MOSAICTypes.copy(), "lime"));
        }
    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }
}