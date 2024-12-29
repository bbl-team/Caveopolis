package com.benbenlaw.caveopolis.data.recipes;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

import java.util.Arrays;

public class ColoredEncasedResults {

    public static final NonNullList<ItemStack> BLUE_ENCASED;
    public static final NonNullList<ItemStack> RED_ENCASED;
    public static final NonNullList<ItemStack> YELLOW_ENCASED;
    public static final NonNullList<ItemStack> GREEN_ENCASED;
    public static final NonNullList<ItemStack> ORANGE_ENCASED;
    public static final NonNullList<ItemStack> PURPLE_ENCASED;
    public static final NonNullList<ItemStack> PINK_ENCASED;
    public static final NonNullList<ItemStack> CYAN_ENCASED;
    public static final NonNullList<ItemStack> BLACK_ENCASED;
    public static final NonNullList<ItemStack> WHITE_ENCASED;
    public static final NonNullList<ItemStack> LIGHT_GRAY_ENCASED;
    public static final NonNullList<ItemStack> GRAY_ENCASED;
    public static final NonNullList<ItemStack> LIGHT_BLUE_ENCASED;
    public static final NonNullList<ItemStack> MAGENTA_ENCASED;
    public static final NonNullList<ItemStack> BROWN_ENCASED;
    public static final NonNullList<ItemStack> LIME_ENCASED;


    static {

        BLUE_ENCASED = NonNullList.create();
        RED_ENCASED = NonNullList.create();
        YELLOW_ENCASED = NonNullList.create();
        GREEN_ENCASED = NonNullList.create();
        ORANGE_ENCASED = NonNullList.create();
        PURPLE_ENCASED = NonNullList.create();
        PINK_ENCASED = NonNullList.create();
        CYAN_ENCASED = NonNullList.create();
        BLACK_ENCASED = NonNullList.create();
        WHITE_ENCASED = NonNullList.create();
        LIGHT_GRAY_ENCASED = NonNullList.create();
        GRAY_ENCASED = NonNullList.create();
        LIGHT_BLUE_ENCASED = NonNullList.create();
        MAGENTA_ENCASED = NonNullList.create();
        BROWN_ENCASED = NonNullList.create();
        LIME_ENCASED = NonNullList.create();

        for (ItemStack ENCASEDTypes : Arrays.asList(
                new ItemStack(CaveopolisItems.COLORED_ENCASED_SLAB.get(), 2),
                new ItemStack(CaveopolisItems.COLORED_ENCASED_STAIRS.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_ENCASED_WALL.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_ENCASED_PRESSURE_PLATE.get(), 1),
                new ItemStack(CaveopolisItems.COLORED_ENCASED_BUTTON.get(), 1)
        ))


        {
            BLUE_ENCASED.add(iconWithColor(ENCASEDTypes.copy(), "blue"));
            RED_ENCASED.add(iconWithColor(ENCASEDTypes.copy(), "red"));
            YELLOW_ENCASED.add(iconWithColor(ENCASEDTypes.copy(), "yellow"));
            GREEN_ENCASED.add(iconWithColor(ENCASEDTypes.copy(), "green"));
            ORANGE_ENCASED.add(iconWithColor(ENCASEDTypes.copy(), "orange"));
            PURPLE_ENCASED.add(iconWithColor(ENCASEDTypes.copy(), "purple"));
            PINK_ENCASED.add(iconWithColor(ENCASEDTypes.copy(), "pink"));
            CYAN_ENCASED.add(iconWithColor(ENCASEDTypes.copy(), "cyan"));
            BLACK_ENCASED.add(iconWithColor(ENCASEDTypes.copy(), "black"));
            WHITE_ENCASED.add(iconWithColor(ENCASEDTypes.copy(), "white"));
            LIGHT_GRAY_ENCASED.add(iconWithColor(ENCASEDTypes.copy(), "light_gray"));
            GRAY_ENCASED.add(iconWithColor(ENCASEDTypes.copy(), "gray"));
            LIGHT_BLUE_ENCASED.add(iconWithColor(ENCASEDTypes.copy(), "light_blue"));
            MAGENTA_ENCASED.add(iconWithColor(ENCASEDTypes.copy(), "magenta"));
            BROWN_ENCASED.add(iconWithColor(ENCASEDTypes.copy(), "brown"));
            LIME_ENCASED.add(iconWithColor(ENCASEDTypes.copy(), "lime"));
        }
    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }
}