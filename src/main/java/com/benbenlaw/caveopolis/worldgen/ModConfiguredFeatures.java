package com.benbenlaw.caveopolis.worldgen;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_TREE_KEY = registerKey("black");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_TREE_KEY = registerKey("blue");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BROWN_TREE_KEY = registerKey("brown");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CYAN_TREE_KEY = registerKey("cyan");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAY_TREE_KEY = registerKey("gray");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_TREE_KEY = registerKey("green");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIGHT_BLUE_TREE_KEY = registerKey("light_blue");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIGHT_GRAY_TREE_KEY = registerKey("light_gray");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIME_TREE_KEY = registerKey("lime");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAGENTA_TREE_KEY = registerKey("magenta");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORANGE_TREE_KEY = registerKey("orange");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_TREE_KEY = registerKey("pink");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_TREE_KEY = registerKey("purple");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_TREE_KEY = registerKey("red");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_TREE_KEY = registerKey("white");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YELLOW_TREE_KEY = registerKey("yellow");


    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

        register(context, BLACK_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.BLACK_COLORED_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),//heights
                BlockStateProvider.simple(ModBlocks.BLACK_COLORED_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, BLUE_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.BLUE_COLORED_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0), // heights
                BlockStateProvider.simple(ModBlocks.BLUE_COLORED_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, BROWN_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.BROWN_COLORED_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0), // heights
                BlockStateProvider.simple(ModBlocks.BROWN_COLORED_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, CYAN_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CYAN_COLORED_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0), // heights
                BlockStateProvider.simple(ModBlocks.CYAN_COLORED_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, GRAY_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GRAY_COLORED_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0), // heights
                BlockStateProvider.simple(ModBlocks.GRAY_COLORED_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, GREEN_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GREEN_COLORED_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0), // heights
                BlockStateProvider.simple(ModBlocks.GREEN_COLORED_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, LIGHT_BLUE_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.LIGHT_BLUE_COLORED_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0), // heights
                BlockStateProvider.simple(ModBlocks.LIGHT_BLUE_COLORED_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, LIGHT_GRAY_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.LIGHT_GRAY_COLORED_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),// heights
                BlockStateProvider.simple(ModBlocks.LIGHT_GRAY_COLORED_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, LIME_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.LIME_COLORED_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0), // heights
                BlockStateProvider.simple(ModBlocks.LIME_COLORED_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, MAGENTA_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.MAGENTA_COLORED_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0), // heights
                BlockStateProvider.simple(ModBlocks.MAGENTA_COLORED_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, ORANGE_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.ORANGE_COLORED_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0), // heights
                BlockStateProvider.simple(ModBlocks.ORANGE_COLORED_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, PINK_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PINK_COLORED_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0), // heights
                BlockStateProvider.simple(ModBlocks.PINK_COLORED_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, PURPLE_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PURPLE_COLORED_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0), // heights
                BlockStateProvider.simple(ModBlocks.PURPLE_COLORED_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, RED_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.RED_COLORED_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0), // heights
                BlockStateProvider.simple(ModBlocks.RED_COLORED_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, WHITE_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WHITE_COLORED_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0), // heights
                BlockStateProvider.simple(ModBlocks.WHITE_COLORED_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, YELLOW_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.YELLOW_COLORED_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0), // heights
                BlockStateProvider.simple(ModBlocks.YELLOW_COLORED_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());


        //best need leaves iomprovments
        /*
                BlockStateProvider.simple(ModBlocks.YELLOW_COLORED_LOG.get()),
                new StraightTrunkPlacer(3, 1, 3), // heights
                BlockStateProvider.simple(ModBlocks.YELLOW_COLORED_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(2), 5),
                new TwoLayersFeatureSize(1, 0, 2)).build());
        skinny trees

        register(context, YELLOW_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.YELLOW_COLORED_LOG.get()),
                new StraightTrunkPlacer(3, 1, 3), // heights
                BlockStateProvider.simple(ModBlocks.YELLOW_COLORED_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(2), 2),
                new TwoLayersFeatureSize(1, 0, 2)).build());


         */


    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Caveopolis.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}