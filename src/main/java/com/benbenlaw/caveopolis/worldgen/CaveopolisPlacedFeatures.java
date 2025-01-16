package com.benbenlaw.caveopolis.worldgen;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.CaveopolisBlocks;
import com.benbenlaw.core.block.colored.ColoredSapling;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class CaveopolisPlacedFeatures {
    public static final ResourceKey<PlacedFeature> BLACK_TREE_PLACED_KEY = registerKey("black_tree_placed");
    public static final ResourceKey<PlacedFeature> RED_TREE_PLACED_KEY = registerKey("red_tree_placed");
    public static final ResourceKey<PlacedFeature> BLUE_TREE_PLACED_KEY = registerKey("blue_tree_placed");
    public static final ResourceKey<PlacedFeature> GREEN_TREE_PLACED_KEY = registerKey("green_tree_placed");
    public static final ResourceKey<PlacedFeature> YELLOW_TREE_PLACED_KEY = registerKey("yellow_tree_placed");
    public static final ResourceKey<PlacedFeature> PURPLE_TREE_PLACED_KEY = registerKey("purple_tree_placed");
    public static final ResourceKey<PlacedFeature> ORANGE_TREE_PLACED_KEY = registerKey("orange_tree_placed");
    public static final ResourceKey<PlacedFeature> WHITE_TREE_PLACED_KEY = registerKey("white_tree_placed");
    public static final ResourceKey<PlacedFeature> BROWN_TREE_PLACED_KEY = registerKey("brown_tree_placed");
    public static final ResourceKey<PlacedFeature> PINK_TREE_PLACED_KEY = registerKey("pink_tree_placed");
    public static final ResourceKey<PlacedFeature> CYAN_TREE_PLACED_KEY = registerKey("cyan_tree_placed");
    public static final ResourceKey<PlacedFeature> LIGHT_GRAY_TREE_PLACED_KEY = registerKey("light_gray_tree_placed");
    public static final ResourceKey<PlacedFeature> LIME_TREE_PLACED_KEY = registerKey("lime_tree_placed");
    public static final ResourceKey<PlacedFeature> MAGENTA_TREE_PLACED_KEY = registerKey("magenta_tree_placed");
    public static final ResourceKey<PlacedFeature> GRAY_TREE_PLACED_KEY = registerKey("gray_tree_placed");
    public static final ResourceKey<PlacedFeature> LIGHT_BLUE_TREE_PLACED_KEY = registerKey("light_blue_tree_placed");

    public static final ResourceKey<PlacedFeature> BLACK_STONE_PLACED_KEY = registerKey("black_stone_placed");
    public static final ResourceKey<PlacedFeature> RED_STONE_PLACED_KEY = registerKey("red_stone_placed");
    public static final ResourceKey<PlacedFeature> BLUE_STONE_PLACED_KEY = registerKey("blue_stone_placed");
    public static final ResourceKey<PlacedFeature> GREEN_STONE_PLACED_KEY = registerKey("green_stone_placed");
    public static final ResourceKey<PlacedFeature> YELLOW_STONE_PLACED_KEY = registerKey("yellow_stone_placed");
    public static final ResourceKey<PlacedFeature> PURPLE_STONE_PLACED_KEY = registerKey("purple_stone_placed");
    public static final ResourceKey<PlacedFeature> ORANGE_STONE_PLACED_KEY = registerKey("orange_stone_placed");
    public static final ResourceKey<PlacedFeature> WHITE_STONE_PLACED_KEY = registerKey("white_stone_placed");
    public static final ResourceKey<PlacedFeature> BROWN_STONE_PLACED_KEY = registerKey("brown_stone_placed");
    public static final ResourceKey<PlacedFeature> PINK_STONE_PLACED_KEY = registerKey("pink_stone_placed");
    public static final ResourceKey<PlacedFeature> CYAN_STONE_PLACED_KEY = registerKey("cyan_stone_placed");
    public static final ResourceKey<PlacedFeature> LIGHT_GRAY_STONE_PLACED_KEY = registerKey("light_gray_stone_placed");
    public static final ResourceKey<PlacedFeature> LIME_STONE_PLACED_KEY = registerKey("lime_stone_placed");
    public static final ResourceKey<PlacedFeature> MAGENTA_STONE_PLACED_KEY = registerKey("magenta_stone_placed");
    public static final ResourceKey<PlacedFeature> GRAY_STONE_PLACED_KEY = registerKey("gray_stone_placed");
    public static final ResourceKey<PlacedFeature> LIGHT_BLUE_STONE_PLACED_KEY = registerKey("light_blue_stone_placed");


    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        //Black Tree
        register(context, BLACK_TREE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.BLACK_TREE_KEY), List.of(
                PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                RarityFilter.onAverageOnceEvery(10),
                CountPlacement.of(1),
                BiomeFilter.biome(),
                SurfaceWaterDepthFilter.forMaxDepth(0),
                InSquarePlacement.spread(),
                PlacementTrees.create(),
                PlacementUtils.filteredByBlockSurvival(
                        CaveopolisBlocks.COLORED_SAPLING.get().defaultBlockState().setValue(ColoredSapling.COLOR, DyeColor.BLACK).getBlock())));

        //Red Tree
        register(context, RED_TREE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.RED_TREE_KEY), List.of(
                PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                RarityFilter.onAverageOnceEvery(20),
                CountPlacement.of(1),
                BiomeFilter.biome(),
                SurfaceWaterDepthFilter.forMaxDepth(0),
                InSquarePlacement.spread(),
                PlacementTrees.create(),
                PlacementUtils.filteredByBlockSurvival(
                        CaveopolisBlocks.COLORED_SAPLING.get().defaultBlockState().setValue(ColoredSapling.COLOR, DyeColor.RED).getBlock())));

        //Blue Tree
        register(context, BLUE_TREE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.BLUE_TREE_KEY), List.of(
                PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                RarityFilter.onAverageOnceEvery(16),
                CountPlacement.of(1),
                BiomeFilter.biome(),
                SurfaceWaterDepthFilter.forMaxDepth(0),
                InSquarePlacement.spread(),
                PlacementTrees.create(),
                PlacementUtils.filteredByBlockSurvival(
                        Blocks.SPRUCE_SAPLING)));

        //Green Tree
        register(context, GREEN_TREE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.GREEN_TREE_KEY), List.of(
                PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                RarityFilter.onAverageOnceEvery(10),
                CountPlacement.of(1),
                BiomeFilter.biome(),
                SurfaceWaterDepthFilter.forMaxDepth(0),
                InSquarePlacement.spread(),
                PlacementTrees.create(),
                PlacementUtils.filteredByBlockSurvival(
                        CaveopolisBlocks.COLORED_SAPLING.get().defaultBlockState().setValue(ColoredSapling.COLOR, DyeColor.GREEN).getBlock())));

        //Yellow Tree
        register(context, YELLOW_TREE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.YELLOW_TREE_KEY), List.of(
                PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                RarityFilter.onAverageOnceEvery(20),
                CountPlacement.of(1),
                BiomeFilter.biome(),
                SurfaceWaterDepthFilter.forMaxDepth(0),
                InSquarePlacement.spread(),
                PlacementTrees.create(),
                PlacementUtils.filteredByBlockSurvival(
                        Blocks.CACTUS)));

        //Purple Tree
        register(context, PURPLE_TREE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.PURPLE_TREE_KEY), List.of(
                PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                RarityFilter.onAverageOnceEvery(12),
                CountPlacement.of(1),
                BiomeFilter.biome(),
                SurfaceWaterDepthFilter.forMaxDepth(0),
                InSquarePlacement.spread(),
                PlacementTrees.create(),
                PlacementUtils.filteredByBlockSurvival(
                        CaveopolisBlocks.COLORED_SAPLING.get().defaultBlockState().setValue(ColoredSapling.COLOR, DyeColor.PURPLE).getBlock())));

        //Orange Tree
        register(context, ORANGE_TREE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.ORANGE_TREE_KEY), List.of(
                PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                RarityFilter.onAverageOnceEvery(12),
                CountPlacement.of(1),
                BiomeFilter.biome(),
                SurfaceWaterDepthFilter.forMaxDepth(0),
                InSquarePlacement.spread(),
                PlacementTrees.create(),
                PlacementUtils.filteredByBlockSurvival(
                        Blocks.DEAD_BUSH)));

        //White Tree
        register(context, WHITE_TREE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.WHITE_TREE_KEY), List.of(
                PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                RarityFilter.onAverageOnceEvery(16),
                CountPlacement.of(1),
                BiomeFilter.biome(),
                SurfaceWaterDepthFilter.forMaxDepth(0),
                InSquarePlacement.spread(),
                PlacementTrees.create(),
                PlacementUtils.filteredByBlockSurvival(
                        CaveopolisBlocks.COLORED_SAPLING.get().defaultBlockState().setValue(ColoredSapling.COLOR, DyeColor.WHITE).getBlock())));

        //Brown Tree
        register(context, BROWN_TREE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.BROWN_TREE_KEY), List.of(
                PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                RarityFilter.onAverageOnceEvery(10),
                CountPlacement.of(1),
                BiomeFilter.biome(),
                SurfaceWaterDepthFilter.forMaxDepth(0),
                InSquarePlacement.spread(),
                PlacementTrees.create(),
                PlacementUtils.filteredByBlockSurvival(
                        CaveopolisBlocks.COLORED_SAPLING.get().defaultBlockState().setValue(ColoredSapling.COLOR, DyeColor.BROWN).getBlock())));

        //Pink Tree
        register(context, PINK_TREE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.PINK_TREE_KEY), List.of(
                PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                RarityFilter.onAverageOnceEvery(12),
                CountPlacement.of(1),
                BiomeFilter.biome(),
                SurfaceWaterDepthFilter.forMaxDepth(0),
                InSquarePlacement.spread(),
                PlacementTrees.create(),
                PlacementUtils.filteredByBlockSurvival(
                        CaveopolisBlocks.COLORED_SAPLING.get().defaultBlockState().setValue(ColoredSapling.COLOR, DyeColor.PINK).getBlock())));

        //Cyan Tree
        register(context, CYAN_TREE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.CYAN_TREE_KEY), List.of(
                PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                RarityFilter.onAverageOnceEvery(10),
                CountPlacement.of(1),
                BiomeFilter.biome(),
                SurfaceWaterDepthFilter.forMaxDepth(0),
                InSquarePlacement.spread(),
                PlacementTrees.create(),
                PlacementUtils.filteredByBlockSurvival(
                        Blocks.SPRUCE_SAPLING)));

        //Light Gray Tree
        register(context, LIGHT_GRAY_TREE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.LIGHT_GRAY_TREE_KEY), List.of(
                PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                RarityFilter.onAverageOnceEvery(12),
                CountPlacement.of(1),
                BiomeFilter.biome(),
                SurfaceWaterDepthFilter.forMaxDepth(0),
                InSquarePlacement.spread(),
                PlacementTrees.create(),
                PlacementUtils.filteredByBlockSurvival(
                        CaveopolisBlocks.COLORED_SAPLING.get().defaultBlockState().setValue(ColoredSapling.COLOR, DyeColor.LIGHT_GRAY).getBlock())));

        //Lime Tree
        register(context, LIME_TREE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.LIME_TREE_KEY), List.of(
                PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                RarityFilter.onAverageOnceEvery(12),
                CountPlacement.of(1),
                BiomeFilter.biome(),
                SurfaceWaterDepthFilter.forMaxDepth(0),
                InSquarePlacement.spread(),
                PlacementTrees.create(),
                PlacementUtils.filteredByBlockSurvival(
                        CaveopolisBlocks.COLORED_SAPLING.get().defaultBlockState().setValue(ColoredSapling.COLOR, DyeColor.LIME).getBlock())));

        //Magenta Tree
        register(context, MAGENTA_TREE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.MAGENTA_TREE_KEY), List.of(
                PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                RarityFilter.onAverageOnceEvery(12),
                CountPlacement.of(1),
                BiomeFilter.biome(),
                SurfaceWaterDepthFilter.forMaxDepth(0),
                InSquarePlacement.spread(),
                PlacementTrees.create(),
                PlacementUtils.filteredByBlockSurvival(
                        CaveopolisBlocks.COLORED_SAPLING.get().defaultBlockState().setValue(ColoredSapling.COLOR, DyeColor.MAGENTA).getBlock())));

        //Gray Tree
        register(context, GRAY_TREE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.GRAY_TREE_KEY), List.of(
                PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                RarityFilter.onAverageOnceEvery(10),
                CountPlacement.of(1),
                BiomeFilter.biome(),
                SurfaceWaterDepthFilter.forMaxDepth(0),
                InSquarePlacement.spread(),
                PlacementTrees.create(),
                PlacementUtils.filteredByBlockSurvival(
                        CaveopolisBlocks.COLORED_SAPLING.get().defaultBlockState().setValue(ColoredSapling.COLOR, DyeColor.GRAY).getBlock())));

        //Light Blue Tree
        register(context, LIGHT_BLUE_TREE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.LIGHT_BLUE_TREE_KEY), List.of(
                PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                RarityFilter.onAverageOnceEvery(16),
                CountPlacement.of(1),
                BiomeFilter.biome(),
                SurfaceWaterDepthFilter.forMaxDepth(0),
                InSquarePlacement.spread(),
                PlacementTrees.create(),
                PlacementUtils.filteredByBlockSurvival(
                       Blocks.SPRUCE_SAPLING)));

        //Black Stone
        register(context, BLACK_STONE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.BLACK_STONE_KEY), List.of(
                CountPlacement.of(1),
                InSquarePlacement.spread(),
                PlacementStones.create(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.absolute(150)),
                BiomeFilter.biome()));

        //Red Stone
        register(context, RED_STONE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.RED_STONE_KEY), List.of(
                CountPlacement.of(1),
                InSquarePlacement.spread(),
                PlacementStones.create(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.absolute(150)),
                BiomeFilter.biome()));

        //Blue Stone
        register(context, BLUE_STONE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.BLUE_STONE_KEY), List.of(
                CountPlacement.of(1),
                InSquarePlacement.spread(),
                PlacementStones.create(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.absolute(150)),
                BiomeFilter.biome()));

        //Green Stone
        register(context, GREEN_STONE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.GREEN_STONE_KEY), List.of(
                CountPlacement.of(1),
                InSquarePlacement.spread(),
                PlacementStones.create(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.absolute(150)),
                BiomeFilter.biome()));

        //Yellow Stone
        register(context, YELLOW_STONE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.YELLOW_STONE_KEY), List.of(
                CountPlacement.of(1),
                InSquarePlacement.spread(),
                PlacementStones.create(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.absolute(150)),
                BiomeFilter.biome()));

        //Purple Stone
        register(context, PURPLE_STONE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.PURPLE_STONE_KEY), List.of(
                CountPlacement.of(1),
                InSquarePlacement.spread(),
                PlacementStones.create(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.absolute(150)),
                BiomeFilter.biome()));

        //Orange Stone
        register(context, ORANGE_STONE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.ORANGE_STONE_KEY), List.of(
                CountPlacement.of(1),
                InSquarePlacement.spread(),
                PlacementStones.create(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.absolute(150)),
                BiomeFilter.biome()));

        //White Stone
        register(context, WHITE_STONE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.WHITE_STONE_KEY), List.of(
                CountPlacement.of(1),
                InSquarePlacement.spread(),
                PlacementStones.create(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.absolute(150)),
                BiomeFilter.biome()));

        //Brown Stone
        register(context, BROWN_STONE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.BROWN_STONE_KEY), List.of(
                CountPlacement.of(1),
                InSquarePlacement.spread(),
                PlacementStones.create(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(10)),
                BiomeFilter.biome()));

        //Pink Stone
        register(context, PINK_STONE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.PINK_STONE_KEY), List.of(
                CountPlacement.of(1),
                InSquarePlacement.spread(),
                PlacementStones.create(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.absolute(150)),
                BiomeFilter.biome()));

        //Cyan Stone
        register(context, CYAN_STONE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.CYAN_STONE_KEY), List.of(
                CountPlacement.of(1),
                InSquarePlacement.spread(),
                PlacementStones.create(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.absolute(150)),
                BiomeFilter.biome()));

        //Light Gray Stone
        register(context, LIGHT_GRAY_STONE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.LIGHT_GRAY_STONE_KEY), List.of(
                CountPlacement.of(1),
                InSquarePlacement.spread(),
                PlacementStones.create(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(10)),
                BiomeFilter.biome()));

        //Lime Stone
        register(context, LIME_STONE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.LIME_STONE_KEY), List.of(
                CountPlacement.of(1),
                InSquarePlacement.spread(),
                PlacementStones.create(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.absolute(150)),
                BiomeFilter.biome()));

        //Magenta Stone
        register(context, MAGENTA_STONE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.MAGENTA_STONE_KEY), List.of(
                CountPlacement.of(1),
                InSquarePlacement.spread(),
                PlacementStones.create(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.absolute(150)),
                BiomeFilter.biome()));

        //Gray Stone
        register(context, GRAY_STONE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.GRAY_STONE_KEY), List.of(
                CountPlacement.of(1),
                InSquarePlacement.spread(),
                PlacementStones.create(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(10)),
                BiomeFilter.biome()));

        //Light Blue Stone
        register(context, LIGHT_BLUE_STONE_PLACED_KEY, configuredFeatures.getOrThrow(CaveopolisConfiguredFeatures.LIGHT_BLUE_STONE_KEY), List.of(
                CountPlacement.of(1),
                InSquarePlacement.spread(),
                PlacementStones.create(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(10)),
                BiomeFilter.biome()));





    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}