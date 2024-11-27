package com.benbenlaw.caveopolis.util;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import net.minecraft.world.item.ItemStack;

import java.util.HashMap;

public class ColorSprayCanMap {

    public static final HashMap<String, ItemStack> COLOR_TO_SPRAY_CAN = new HashMap<>() {{

        put("white", new ItemStack(CaveopolisItems.WHITE_SPRAY_CAN.get()));
        put("orange", new ItemStack(CaveopolisItems.ORANGE_SPRAY_CAN.get()));
        put("magenta", new ItemStack(CaveopolisItems.MAGENTA_SPRAY_CAN.get()));
        put("light_blue", new ItemStack(CaveopolisItems.LIGHT_BLUE_SPRAY_CAN.get()));
        put("yellow", new ItemStack(CaveopolisItems.YELLOW_SPRAY_CAN.get()));
        put("lime", new ItemStack(CaveopolisItems.LIME_SPRAY_CAN.get()));
        put("pink", new ItemStack(CaveopolisItems.PINK_SPRAY_CAN.get()));
        put("gray", new ItemStack(CaveopolisItems.GRAY_SPRAY_CAN.get()));
        put("light_gray", new ItemStack(CaveopolisItems.LIGHT_GRAY_SPRAY_CAN.get()));
        put("cyan", new ItemStack(CaveopolisItems.CYAN_SPRAY_CAN.get()));
        put("purple", new ItemStack(CaveopolisItems.PURPLE_SPRAY_CAN.get()));
        put("blue", new ItemStack(CaveopolisItems.BLUE_SPRAY_CAN.get()));
        put("brown", new ItemStack(CaveopolisItems.BROWN_SPRAY_CAN.get()));
        put("green", new ItemStack(CaveopolisItems.GREEN_SPRAY_CAN.get()));
        put("red", new ItemStack(CaveopolisItems.RED_SPRAY_CAN.get()));
        put("black", new ItemStack(CaveopolisItems.BLACK_SPRAY_CAN.get()));
    }};

    public static ItemStack getSprayCan(String color) {
        return COLOR_TO_SPRAY_CAN.get(color);
    }



}
