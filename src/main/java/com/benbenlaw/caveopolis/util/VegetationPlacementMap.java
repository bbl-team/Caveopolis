package com.benbenlaw.caveopolis.util;

import com.benbenlaw.caveopolis.worldgen.CaveopolisConfiguredFeatures;
import com.benbenlaw.caveopolis.worldgen.tree.CaveopolisTreeGrowers;
import com.benbenlaw.core.block.colored.ColoredGrassBlock;
import com.benbenlaw.core.block.colored.ColoredSapling;
import net.minecraft.world.item.DyeColor;

public class VegetationPlacementMap {
    public void updateVegetationPlacementMap() {

        System.out.println("Updating vegetation placement...");

        ColoredGrassBlock.updateVegetationPlacementMap(DyeColor.BLACK, CaveopolisConfiguredFeatures.BONEMEAL_BLACK_GRASS_KEY);
        ColoredGrassBlock.updateVegetationPlacementMap(DyeColor.RED, CaveopolisConfiguredFeatures.BONEMEAL_RED_GRASS_KEY);
        ColoredGrassBlock.updateVegetationPlacementMap(DyeColor.GREEN, CaveopolisConfiguredFeatures.BONEMEAL_GREEN_GRASS_KEY);
        ColoredGrassBlock.updateVegetationPlacementMap(DyeColor.BROWN, CaveopolisConfiguredFeatures.BONEMEAL_BROWN_GRASS_KEY);
        ColoredGrassBlock.updateVegetationPlacementMap(DyeColor.BLUE, CaveopolisConfiguredFeatures.BONEMEAL_BLUE_GRASS_KEY);
        ColoredGrassBlock.updateVegetationPlacementMap(DyeColor.PURPLE, CaveopolisConfiguredFeatures.BONEMEAL_PURPLE_GRASS_KEY);
        ColoredGrassBlock.updateVegetationPlacementMap(DyeColor.CYAN, CaveopolisConfiguredFeatures.BONEMEAL_CYAN_GRASS_KEY);
        ColoredGrassBlock.updateVegetationPlacementMap(DyeColor.LIGHT_GRAY, CaveopolisConfiguredFeatures.BONEMEAL_LIGHT_GRAY_GRASS_KEY);
        ColoredGrassBlock.updateVegetationPlacementMap(DyeColor.GRAY, CaveopolisConfiguredFeatures.BONEMEAL_GRAY_GRASS_KEY);
        ColoredGrassBlock.updateVegetationPlacementMap(DyeColor.PINK, CaveopolisConfiguredFeatures.BONEMEAL_PINK_GRASS_KEY);
        ColoredGrassBlock.updateVegetationPlacementMap(DyeColor.LIME, CaveopolisConfiguredFeatures.BONEMEAL_LIME_GRASS_KEY);
        ColoredGrassBlock.updateVegetationPlacementMap(DyeColor.YELLOW, CaveopolisConfiguredFeatures.BONEMEAL_YELLOW_GRASS_KEY);
        ColoredGrassBlock.updateVegetationPlacementMap(DyeColor.LIGHT_BLUE, CaveopolisConfiguredFeatures.BONEMEAL_LIGHT_BLUE_GRASS_KEY);
        ColoredGrassBlock.updateVegetationPlacementMap(DyeColor.MAGENTA, CaveopolisConfiguredFeatures.BONEMEAL_MAGENTA_GRASS_KEY);
        ColoredGrassBlock.updateVegetationPlacementMap(DyeColor.ORANGE, CaveopolisConfiguredFeatures.BONEMEAL_ORANGE_GRASS_KEY);
        ColoredGrassBlock.updateVegetationPlacementMap(DyeColor.WHITE, CaveopolisConfiguredFeatures.BONEMEAL_WHITE_GRASS_KEY);


    }
}
