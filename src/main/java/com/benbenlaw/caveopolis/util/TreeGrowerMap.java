package com.benbenlaw.caveopolis.util;

import com.benbenlaw.caveopolis.worldgen.tree.CaveopolisTreeGrowers;
import com.benbenlaw.core.block.colored.ColoredSapling;
import net.minecraft.world.item.DyeColor;

public class TreeGrowerMap {

    public void updateTreeGrowerMap() {

        System.out.println("Updating tree grower...");

        ColoredSapling.updateTreeGrowerMap(DyeColor.BLACK, CaveopolisTreeGrowers.BLACK_TREE);
        ColoredSapling.updateTreeGrowerMap(DyeColor.RED, CaveopolisTreeGrowers.RED_TREE);
        ColoredSapling.updateTreeGrowerMap(DyeColor.GREEN, CaveopolisTreeGrowers.GREEN_TREE);
        ColoredSapling.updateTreeGrowerMap(DyeColor.BROWN, CaveopolisTreeGrowers.BROWN_TREE);
        ColoredSapling.updateTreeGrowerMap(DyeColor.BLUE, CaveopolisTreeGrowers.BLUE_TREE);
        ColoredSapling.updateTreeGrowerMap(DyeColor.PURPLE, CaveopolisTreeGrowers.PURPLE_TREE);
        ColoredSapling.updateTreeGrowerMap(DyeColor.CYAN, CaveopolisTreeGrowers.CYAN_TREE);
        ColoredSapling.updateTreeGrowerMap(DyeColor.LIGHT_GRAY, CaveopolisTreeGrowers.LIGHT_GRAY_TREE);
        ColoredSapling.updateTreeGrowerMap(DyeColor.GRAY, CaveopolisTreeGrowers.GRAY_TREE);
        ColoredSapling.updateTreeGrowerMap(DyeColor.PINK, CaveopolisTreeGrowers.PINK_TREE);
        ColoredSapling.updateTreeGrowerMap(DyeColor.LIME, CaveopolisTreeGrowers.LIME_TREE);
        ColoredSapling.updateTreeGrowerMap(DyeColor.YELLOW, CaveopolisTreeGrowers.YELLOW_TREE);
        ColoredSapling.updateTreeGrowerMap(DyeColor.LIGHT_BLUE, CaveopolisTreeGrowers.LIGHT_BLUE_TREE);
        ColoredSapling.updateTreeGrowerMap(DyeColor.MAGENTA, CaveopolisTreeGrowers.MAGENTA_TREE);
        ColoredSapling.updateTreeGrowerMap(DyeColor.ORANGE, CaveopolisTreeGrowers.ORANGE_TREE);
        ColoredSapling.updateTreeGrowerMap(DyeColor.WHITE, CaveopolisTreeGrowers.WHITE_TREE);




    }



}
