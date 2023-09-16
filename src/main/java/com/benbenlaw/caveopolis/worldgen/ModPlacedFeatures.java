package com.benbenlaw.caveopolis.worldgen;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> BLACK_TREE_PLACED_KEY = registerKey("black_tree_placed");
    public static final ResourceKey<PlacedFeature> BLUE_TREE_PLACED_KEY = registerKey("blue_tree_placed");
    public static final ResourceKey<PlacedFeature> BROWN_TREE_PLACED_KEY = registerKey("brown_tree_placed");
    public static final ResourceKey<PlacedFeature> CYAN_TREE_PLACED_KEY = registerKey("cyan_tree_placed");
    public static final ResourceKey<PlacedFeature> GRAY_TREE_PLACED_KEY = registerKey("gray_tree_placed");
    public static final ResourceKey<PlacedFeature> GREEN_TREE_PLACED_KEY = registerKey("green_tree_placed");
    public static final ResourceKey<PlacedFeature> LIGHT_BLUE_TREE_PLACED_KEY = registerKey("light_blue_tree_placed");
    public static final ResourceKey<PlacedFeature> LIGHT_GRAY_TREE_PLACED_KEY = registerKey("light_gray_tree_placed");
    public static final ResourceKey<PlacedFeature> LIME_TREE_PLACED_KEY = registerKey("lime_tree_placed");
    public static final ResourceKey<PlacedFeature> MAGENTA_TREE_PLACED_KEY = registerKey("magenta_tree_placed");
    public static final ResourceKey<PlacedFeature> ORANGE_TREE_PLACED_KEY = registerKey("orange_tree_placed");
    public static final ResourceKey<PlacedFeature> PINK_TREE_PLACED_KEY = registerKey("pink_tree_placed");
    public static final ResourceKey<PlacedFeature> PURPLE_TREE_PLACED_KEY = registerKey("purple_tree_placed");
    public static final ResourceKey<PlacedFeature> RED_TREE_PLACED_KEY = registerKey("red_tree_placed");
    public static final ResourceKey<PlacedFeature> WHITE_TREE_PLACED_KEY = registerKey("white_tree_placed");
    public static final ResourceKey<PlacedFeature> YELLOW_TREE_PLACED_KEY = registerKey("yellow_tree_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);


        register(context, BLACK_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLACK_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 1.0f, 0),
                        ModBlocks.BLACK_COLORED_SAPLING.get()));

        register(context, BLUE_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLUE_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 1.0f, 0),
                        ModBlocks.BLUE_COLORED_SAPLING.get()));

        register(context, BROWN_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BROWN_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 1.0f, 0),
                        ModBlocks.BROWN_COLORED_SAPLING.get()));

        register(context, CYAN_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CYAN_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0,1.0f, 0),
                        ModBlocks.CYAN_COLORED_SAPLING.get()));

        register(context, GRAY_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GRAY_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 1.0f, 0),
                        ModBlocks.GRAY_COLORED_SAPLING.get()));

        register(context, GREEN_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GREEN_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 1.0f, 0),
                        ModBlocks.GREEN_COLORED_SAPLING.get()));

        register(context, LIGHT_BLUE_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LIGHT_BLUE_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 1.0f, 0),
                        ModBlocks.LIGHT_BLUE_COLORED_SAPLING.get()));

        register(context, LIGHT_GRAY_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LIGHT_GRAY_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 1.0f, 0),
                        ModBlocks.LIGHT_GRAY_COLORED_SAPLING.get()));

        register(context, LIME_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LIME_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 1.0f, 0),
                        ModBlocks.LIME_COLORED_SAPLING.get()));

        register(context, MAGENTA_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MAGENTA_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 1.0f, 0),
                        ModBlocks.MAGENTA_COLORED_SAPLING.get()));

        register(context, ORANGE_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORANGE_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 1.0f, 0),
                        ModBlocks.ORANGE_COLORED_SAPLING.get()));

        register(context, PINK_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 1.0f, 0),
                        ModBlocks.PINK_COLORED_SAPLING.get()));

        register(context, PURPLE_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PURPLE_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 1.0f, 0),
                        ModBlocks.PURPLE_COLORED_SAPLING.get()));

        register(context, RED_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 1.0f, 0),
                        ModBlocks.RED_COLORED_SAPLING.get()));

        register(context, WHITE_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 1.0f, 0),
                        ModBlocks.WHITE_COLORED_SAPLING.get()));

        register(context, YELLOW_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.YELLOW_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 1.0f, 0),
                        ModBlocks.YELLOW_COLORED_SAPLING.get()));


    }




    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(Caveopolis.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }


}

