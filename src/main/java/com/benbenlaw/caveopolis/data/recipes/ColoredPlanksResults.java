package com.benbenlaw.caveopolis.data.recipes;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

import java.util.Arrays;

public class ColoredPlanksResults {

    public static final NonNullList<ItemStack> BLUE_PLANKS;
    public static final NonNullList<ItemStack> RED_PLANKS;
    public static final NonNullList<ItemStack> YELLOW_PLANKS;
    public static final NonNullList<ItemStack> GREEN_PLANKS;
    public static final NonNullList<ItemStack> ORANGE_PLANKS;
    public static final NonNullList<ItemStack> PURPLE_PLANKS;
    public static final NonNullList<ItemStack> PINK_PLANKS;
    public static final NonNullList<ItemStack> CYAN_PLANKS;
    public static final NonNullList<ItemStack> BLACK_PLANKS;
    public static final NonNullList<ItemStack> WHITE_PLANKS;
    public static final NonNullList<ItemStack> LIGHT_GRAY_PLANKS;
    public static final NonNullList<ItemStack> GRAY_PLANKS;
    public static final NonNullList<ItemStack> LIGHT_BLUE_PLANKS;
    public static final NonNullList<ItemStack> MAGENTA_PLANKS;
    public static final NonNullList<ItemStack> BROWN_PLANKS;
    public static final NonNullList<ItemStack> LIME_PLANKS;


    static {

        BLUE_PLANKS = NonNullList.create();
        RED_PLANKS = NonNullList.create();
        YELLOW_PLANKS = NonNullList.create();
        GREEN_PLANKS = NonNullList.create();
        ORANGE_PLANKS = NonNullList.create();
        PURPLE_PLANKS = NonNullList.create();
        PINK_PLANKS = NonNullList.create();
        CYAN_PLANKS = NonNullList.create();
        BLACK_PLANKS = NonNullList.create();
        WHITE_PLANKS = NonNullList.create();
        LIGHT_GRAY_PLANKS = NonNullList.create();
        GRAY_PLANKS = NonNullList.create();
        LIGHT_BLUE_PLANKS = NonNullList.create();
        MAGENTA_PLANKS = NonNullList.create();
        BROWN_PLANKS = NonNullList.create();
        LIME_PLANKS = NonNullList.create();

        for (ItemStack PLANKSTypes : Arrays.asList(
                new ItemStack(CaveopolisItems.COLORED_PLANK_SLAB.get(), 2),
                new ItemStack(CaveopolisItems.COLORED_PLANK_STAIRS.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_PLANK_PRESSURE_PLATE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_PLANK_BUTTON.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_PLANK_FENCE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_PLANK_FENCE_GATE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_PLANK_DOOR.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_PLANK_TRAPDOOR.get(), 1),

                //Added Bamboo Planks and Bamboo Mosaic
                new ItemStack(CaveopolisItems.COLORED_BAMBOO_BLOCK.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_BAMBOO_MOSAIC.get(), 1)
        ))


        {
            BLUE_PLANKS.add(iconWithColor(PLANKSTypes.copy(), "blue"));
            RED_PLANKS.add(iconWithColor(PLANKSTypes.copy(), "red"));
            YELLOW_PLANKS.add(iconWithColor(PLANKSTypes.copy(), "yellow"));
            GREEN_PLANKS.add(iconWithColor(PLANKSTypes.copy(), "green"));
            ORANGE_PLANKS.add(iconWithColor(PLANKSTypes.copy(), "orange"));
            PURPLE_PLANKS.add(iconWithColor(PLANKSTypes.copy(), "purple"));
            PINK_PLANKS.add(iconWithColor(PLANKSTypes.copy(), "pink"));
            CYAN_PLANKS.add(iconWithColor(PLANKSTypes.copy(), "cyan"));
            BLACK_PLANKS.add(iconWithColor(PLANKSTypes.copy(), "black"));
            WHITE_PLANKS.add(iconWithColor(PLANKSTypes.copy(), "white"));
            LIGHT_GRAY_PLANKS.add(iconWithColor(PLANKSTypes.copy(), "light_gray"));
            GRAY_PLANKS.add(iconWithColor(PLANKSTypes.copy(), "gray"));
            LIGHT_BLUE_PLANKS.add(iconWithColor(PLANKSTypes.copy(), "light_blue"));
            MAGENTA_PLANKS.add(iconWithColor(PLANKSTypes.copy(), "magenta"));
            BROWN_PLANKS.add(iconWithColor(PLANKSTypes.copy(), "brown"));
            LIME_PLANKS.add(iconWithColor(PLANKSTypes.copy(), "lime"));
        }
    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }
}