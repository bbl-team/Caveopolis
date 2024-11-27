package com.benbenlaw.caveopolis.worldgen;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.CaveopolisBlocks;
import com.benbenlaw.core.block.colored.ColoredBlock;
import com.benbenlaw.core.block.colored.ColoredLeaves;
import com.benbenlaw.core.block.colored.ColoredLog;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.AcaciaFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.MegaJungleFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.SpruceFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.GiantTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class CaveopolisConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_TREE_KEY = registerKey("black_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_TREE_KEY = registerKey("red_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_TREE_KEY = registerKey("blue_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_TREE_KEY = registerKey("green_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YELLOW_TREE_KEY = registerKey("yellow_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORANGE_TREE_KEY = registerKey("orange_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_TREE_KEY = registerKey("purple_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_TREE_KEY = registerKey("pink_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CYAN_TREE_KEY = registerKey("cyan_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_TREE_KEY = registerKey("white_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BROWN_TREE_KEY = registerKey("brown_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAY_TREE_KEY = registerKey("gray_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIGHT_BLUE_TREE_KEY = registerKey("light_blue_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIME_TREE_KEY = registerKey("lime_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAGENTA_TREE_KEY = registerKey("magenta_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIGHT_GRAY_TREE_KEY = registerKey("light_gray_tree");

    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_STONE_KEY = registerKey("black_stone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_STONE_KEY = registerKey("red_stone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_STONE_KEY = registerKey("blue_stone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_STONE_KEY = registerKey("green_stone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YELLOW_STONE_KEY = registerKey("yellow_stone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORANGE_STONE_KEY = registerKey("orange_stone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_STONE_KEY = registerKey("purple_stone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_STONE_KEY = registerKey("pink_stone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CYAN_STONE_KEY = registerKey("cyan_stone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_STONE_KEY = registerKey("white_stone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BROWN_STONE_KEY = registerKey("brown_stone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAY_STONE_KEY = registerKey("gray_stone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIGHT_BLUE_STONE_KEY = registerKey("light_blue_stone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIME_STONE_KEY = registerKey("lime_stone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAGENTA_STONE_KEY = registerKey("magenta_stone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIGHT_GRAY_STONE_KEY = registerKey("light_gray_stone");


    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

        //Black Tree
        register(context, BLACK_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LOG.get().defaultBlockState().setValue(ColoredLog.COLOR, DyeColor.BLACK).setValue(ColoredLog.LIT, false)),
                new GiantTrunkPlacer(6, 7, 5),
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LEAVES.get().defaultBlockState().setValue(ColoredLeaves.COLOR, DyeColor.BLACK).setValue(ColoredLeaves.LIT, false)),
                new MegaJungleFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .dirt(BlockStateProvider.simple(CaveopolisBlocks.COLORED_DIRT.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.BLACK).setValue(ColoredBlock.LIT, false)))
                .build());

        //Red Tree
        register(context, RED_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LOG.get().defaultBlockState().setValue(ColoredLog.COLOR, DyeColor.RED).setValue(ColoredLog.LIT, false)),
                new StraightTrunkPlacer(7, 5, 7),
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LEAVES.get().defaultBlockState().setValue(ColoredLeaves.COLOR, DyeColor.RED).setValue(ColoredLeaves.LIT, false)),
                new SpruceFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4)),
                new TwoLayersFeatureSize(1, 0, 1))
                .dirt(BlockStateProvider.simple(CaveopolisBlocks.COLORED_DIRT.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.RED).setValue(ColoredBlock.LIT, false)))
                .build());

        //Blue Tree
        register(context, BLUE_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LOG.get().defaultBlockState().setValue(ColoredLog.COLOR, DyeColor.BLUE).setValue(ColoredLog.LIT, false)),
                new StraightTrunkPlacer(7, 5, 7),
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LEAVES.get().defaultBlockState().setValue(ColoredLeaves.COLOR, DyeColor.BLUE).setValue(ColoredLeaves.LIT, false)),
                new SpruceFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4)),
                new TwoLayersFeatureSize(1, 0, 1))
                .dirt(BlockStateProvider.simple(CaveopolisBlocks.COLORED_DIRT.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.BLUE).setValue(ColoredBlock.LIT, false)))
                .build());

        //Light Blue Tree
        register(context, LIGHT_BLUE_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LOG.get().defaultBlockState().setValue(ColoredLog.COLOR, DyeColor.LIGHT_BLUE).setValue(ColoredLog.LIT, false)),
                new StraightTrunkPlacer(7, 5, 7),
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LEAVES.get().defaultBlockState().setValue(ColoredLeaves.COLOR, DyeColor.LIGHT_BLUE).setValue(ColoredLeaves.LIT, false)),
                new SpruceFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4)),
                new TwoLayersFeatureSize(1, 0, 1))
                .dirt(BlockStateProvider.simple(CaveopolisBlocks.COLORED_DIRT.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.LIGHT_BLUE).setValue(ColoredBlock.LIT, false)))
                .build());

        //Cyan Tree
        register(context, CYAN_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LOG.get().defaultBlockState().setValue(ColoredLog.COLOR, DyeColor.CYAN).setValue(ColoredLog.LIT, false)),
                new StraightTrunkPlacer(7, 5, 7),
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LEAVES.get().defaultBlockState().setValue(ColoredLeaves.COLOR, DyeColor.CYAN).setValue(ColoredLeaves.LIT, false)),
                new SpruceFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4)),
                new TwoLayersFeatureSize(1, 0, 1))
                .dirt(BlockStateProvider.simple(CaveopolisBlocks.COLORED_DIRT.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.CYAN).setValue(ColoredBlock.LIT, false)))
                .build());

        //Green Tree
        register(context, GREEN_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LOG.get().defaultBlockState().setValue(ColoredLog.COLOR, DyeColor.GREEN).setValue(ColoredLog.LIT, false)),
                new StraightTrunkPlacer(7, 5, 0),
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LEAVES.get().defaultBlockState().setValue(ColoredLeaves.COLOR, DyeColor.GREEN).setValue(ColoredLeaves.LIT, false)),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .dirt(BlockStateProvider.simple(CaveopolisBlocks.COLORED_DIRT.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.GREEN).setValue(ColoredBlock.LIT, false)))
                .build());

        //Yellow Tree
        register(context, YELLOW_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LOG.get().defaultBlockState().setValue(ColoredLog.COLOR, DyeColor.YELLOW).setValue(ColoredLog.LIT, false)),
                new ForkingTrunkPlacer(7, 3, 3),
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LEAVES.get().defaultBlockState().setValue(ColoredLeaves.COLOR, DyeColor.YELLOW).setValue(ColoredLeaves.LIT, false)),
                new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                new TwoLayersFeatureSize(1, 0, 1))
                .dirt(BlockStateProvider.simple(CaveopolisBlocks.COLORED_DIRT.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.YELLOW).setValue(ColoredBlock.LIT, false)))
                .build());

        //Orange Tree
        register(context, ORANGE_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LOG.get().defaultBlockState().setValue(ColoredLog.COLOR, DyeColor.ORANGE).setValue(ColoredLog.LIT, false)),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LEAVES.get().defaultBlockState().setValue(ColoredLeaves.COLOR, DyeColor.ORANGE).setValue(ColoredLeaves.LIT, false)),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .dirt(BlockStateProvider.simple(CaveopolisBlocks.COLORED_DIRT.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.ORANGE).setValue(ColoredBlock.LIT, false)))
                .build());

        //Purple Tree
        register(context, PURPLE_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LOG.get().defaultBlockState().setValue(ColoredLog.COLOR, DyeColor.PURPLE).setValue(ColoredLog.LIT, false)),
                new StraightTrunkPlacer(8, 4, 0),
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LEAVES.get().defaultBlockState().setValue(ColoredLeaves.COLOR, DyeColor.PURPLE).setValue(ColoredLeaves.LIT, false)),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .dirt(BlockStateProvider.simple(CaveopolisBlocks.COLORED_DIRT.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.PURPLE).setValue(ColoredBlock.LIT, false)))
                .build());

        //Pink Tree
        register(context, PINK_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LOG.get().defaultBlockState().setValue(ColoredLog.COLOR, DyeColor.PINK).setValue(ColoredLog.LIT, false)),
                new ForkingTrunkPlacer(7, 3, 3),
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LEAVES.get().defaultBlockState().setValue(ColoredLeaves.COLOR, DyeColor.PINK).setValue(ColoredLeaves.LIT, false)),
                new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                new TwoLayersFeatureSize(1, 0, 1))
                .dirt(BlockStateProvider.simple(CaveopolisBlocks.COLORED_DIRT.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.PINK).setValue(ColoredBlock.LIT, false)))
                .build());


        //Lime Tree
        register(context, LIME_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LOG.get().defaultBlockState().setValue(ColoredLog.COLOR, DyeColor.LIME).setValue(ColoredLog.LIT, false)),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LEAVES.get().defaultBlockState().setValue(ColoredLeaves.COLOR, DyeColor.LIME).setValue(ColoredLeaves.LIT, false)),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .dirt(BlockStateProvider.simple(CaveopolisBlocks.COLORED_DIRT.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.LIME).setValue(ColoredBlock.LIT, false)))
                .build());

        //Magenta Tree
        register(context, MAGENTA_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LOG.get().defaultBlockState().setValue(ColoredLog.COLOR, DyeColor.MAGENTA).setValue(ColoredLog.LIT, false)),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LEAVES.get().defaultBlockState().setValue(ColoredLeaves.COLOR, DyeColor.MAGENTA).setValue(ColoredLeaves.LIT, false)),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .dirt(BlockStateProvider.simple(CaveopolisBlocks.COLORED_DIRT.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.MAGENTA).setValue(ColoredBlock.LIT, false)))
                .build());

        //Light Gray Tree
        register(context, LIGHT_GRAY_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LOG.get().defaultBlockState().setValue(ColoredLog.COLOR, DyeColor.LIGHT_GRAY).setValue(ColoredLog.LIT, false)),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LEAVES.get().defaultBlockState().setValue(ColoredLeaves.COLOR, DyeColor.LIGHT_GRAY).setValue(ColoredLeaves.LIT, false)),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .dirt(BlockStateProvider.simple(CaveopolisBlocks.COLORED_DIRT.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.LIGHT_GRAY).setValue(ColoredBlock.LIT, false)))
                .build());

        //Gray Tree
        register(context, GRAY_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LOG.get().defaultBlockState().setValue(ColoredLog.COLOR, DyeColor.GRAY).setValue(ColoredLog.LIT, false)),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LEAVES.get().defaultBlockState().setValue(ColoredLeaves.COLOR, DyeColor.GRAY).setValue(ColoredLeaves.LIT, false)),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .dirt(BlockStateProvider.simple(CaveopolisBlocks.COLORED_DIRT.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.GRAY).setValue(ColoredBlock.LIT, false)))
                .build());

        //White Tree
        register(context, WHITE_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LOG.get().defaultBlockState().setValue(ColoredLog.COLOR, DyeColor.WHITE).setValue(ColoredLog.LIT, false)),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LEAVES.get().defaultBlockState().setValue(ColoredLeaves.COLOR, DyeColor.WHITE).setValue(ColoredLeaves.LIT, false)),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .dirt(BlockStateProvider.simple(CaveopolisBlocks.COLORED_DIRT.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.WHITE).setValue(ColoredBlock.LIT, false)))
                .build());

        //Brown Tree
        register(context, BROWN_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LOG.get().defaultBlockState().setValue(ColoredLog.COLOR, DyeColor.BROWN).setValue(ColoredLog.LIT, false)),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.simple(CaveopolisBlocks.COLORED_LEAVES.get().defaultBlockState().setValue(ColoredLeaves.COLOR, DyeColor.BROWN).setValue(ColoredLeaves.LIT, false)),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .dirt(BlockStateProvider.simple(CaveopolisBlocks.COLORED_DIRT.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.BROWN).setValue(ColoredBlock.LIT, false)))
                .build());

        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        //Black Stone
        register(context, BLACK_STONE_KEY, Feature.ORE, new OreConfiguration(deepslateReplaceables,
                CaveopolisBlocks.COLORED_STONE.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.BLACK).setValue(ColoredBlock.LIT, false), 48));

        //Red Stone
        register(context, RED_STONE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables,
                CaveopolisBlocks.COLORED_STONE.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.RED).setValue(ColoredBlock.LIT, false), 48));

        //Blue Stone
        register(context, BLUE_STONE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables,
                CaveopolisBlocks.COLORED_STONE.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.BLUE).setValue(ColoredBlock.LIT, false), 48));

        //Green Stone
        register(context, GREEN_STONE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables,
                CaveopolisBlocks.COLORED_STONE.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.GREEN).setValue(ColoredBlock.LIT, false), 48));

        //Yellow Stone
        register(context, YELLOW_STONE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables,
                CaveopolisBlocks.COLORED_STONE.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.YELLOW).setValue(ColoredBlock.LIT, false), 48));

        //Orange Stone
        register(context, ORANGE_STONE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables,
                CaveopolisBlocks.COLORED_STONE.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.ORANGE).setValue(ColoredBlock.LIT, false), 48));

        //Purple Stone
        register(context, PURPLE_STONE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables,
                CaveopolisBlocks.COLORED_STONE.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.PURPLE).setValue(ColoredBlock.LIT, false), 48));

        //Pink Stone
        register(context, PINK_STONE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables,
                CaveopolisBlocks.COLORED_STONE.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.PINK).setValue(ColoredBlock.LIT, false), 48));

        //Cyan Stone
        register(context, CYAN_STONE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables,
                CaveopolisBlocks.COLORED_STONE.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.CYAN).setValue(ColoredBlock.LIT, false), 48));

        //White Stone
        register(context, WHITE_STONE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables,
                CaveopolisBlocks.COLORED_STONE.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.WHITE).setValue(ColoredBlock.LIT, false), 48));

        //Brown Stone
        register(context, BROWN_STONE_KEY, Feature.ORE, new OreConfiguration(deepslateReplaceables,
                CaveopolisBlocks.COLORED_STONE.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.BROWN).setValue(ColoredBlock.LIT, false), 48));

        //Gray Stone
        register(context, GRAY_STONE_KEY, Feature.ORE, new OreConfiguration(deepslateReplaceables,
                CaveopolisBlocks.COLORED_STONE.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.GRAY).setValue(ColoredBlock.LIT, false), 48));

        //Light Blue Stone
        register(context, LIGHT_BLUE_STONE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables,
                CaveopolisBlocks.COLORED_STONE.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.LIGHT_BLUE).setValue(ColoredBlock.LIT, false), 48));

        //Lime Stone
        register(context, LIME_STONE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables,
                CaveopolisBlocks.COLORED_STONE.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.LIME).setValue(ColoredBlock.LIT, false), 48));

        //Magenta Stone
        register(context, MAGENTA_STONE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables,
                CaveopolisBlocks.COLORED_STONE.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.MAGENTA).setValue(ColoredBlock.LIT, false), 48));

        //Light Gray Stone
        register(context, LIGHT_GRAY_STONE_KEY, Feature.ORE, new OreConfiguration(deepslateReplaceables,
                CaveopolisBlocks.COLORED_STONE.get().defaultBlockState().setValue(ColoredBlock.COLOR, DyeColor.LIGHT_GRAY).setValue(ColoredBlock.LIT, false), 48));

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}