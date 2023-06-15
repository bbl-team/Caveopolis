package com.benbenlaw.caveopolis.world.feature;

import com.benbenlaw.caveopolis.Caveopolis;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> MIXED_STONE_ORE_PLACED_KEY = createKey("mixed_stone_ore_placed");
    public static final ResourceKey<PlacedFeature> BRIGHT_STONE_ORE_PLACED_KEY = createKey("bright_stone_ore_placed");
    public static final ResourceKey<PlacedFeature> MOSSY_STONE_ORE_PLACED_KEY = createKey("mossy_stone_ore_placed");

    public static final ResourceKey<PlacedFeature> COLORED_STONE_PLACED_KEY = createKey("colored_stone_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);


        register(context, MIXED_STONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_MIXED_STONE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-50), VerticalAnchor.absolute(130))));

        register(context, BRIGHT_STONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_BRIGHT_STONE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-50), VerticalAnchor.absolute(130))));

        register(context, MOSSY_STONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_MOSSY_STONE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(16, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.absolute(150))));

        register(context, COLORED_STONE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_COLORED_STONE_KEY),
                ModOrePlacement.commonOrePlacement(1, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.absolute(150))));

    }

    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(Caveopolis.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}


/*

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Caveopolis.MOD_ID);


    public static final RegistryObject<PlacedFeature> MIXED_STONE_ORE_PLACED = PLACED_FEATURES.register("mixed_stone_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.MIXED_STONE_ORE.getHolder().get(),
                    commonOrePlacement(12, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(130)))));

    public static final RegistryObject<PlacedFeature> BRIGHT_STONE_PLACED = PLACED_FEATURES.register("bright_stone_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.BRIGHT_STONE.getHolder().get(),
                    commonOrePlacement(15, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(200)))));

    public static final RegistryObject<PlacedFeature> MOSSY_STONE_PLACED = PLACED_FEATURES.register("mossy_stone_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.MOSSY_STONE.getHolder().get(),
                    commonOrePlacement(12, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(200)))));



    public static final RegistryObject<PlacedFeature> WHITE_COLORED_STONE_PLACED = PLACED_FEATURES.register("white_colored_stone_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.WHITE_COLORED_STONE.getHolder().get(),
                    commonOrePlacement(1, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(200)))));

    public static final RegistryObject<PlacedFeature> RED_COLORED_STONE_PLACED = PLACED_FEATURES.register("red_colored_stone_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.RED_COLORED_STONE.getHolder().get(),
                    commonOrePlacement(1, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(200)))));

    public static final RegistryObject<PlacedFeature> BLUE_COLORED_STONE_PLACED = PLACED_FEATURES.register("blue_colored_stone_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.BLUE_COLORED_STONE.getHolder().get(),
                    commonOrePlacement(1, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(200)))));

    public static final RegistryObject<PlacedFeature> LIGHT_BLUE_COLORED_STONE_PLACED = PLACED_FEATURES.register("light_blue_colored_stone_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.LIGHT_BLUE_COLORED_STONE.getHolder().get(),
                    commonOrePlacement(1, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(200)))));

    public static final RegistryObject<PlacedFeature> YELLOW_COLORED_STONE_PLACED = PLACED_FEATURES.register("yellow_colored_stone_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.YELLOW_COLORED_STONE.getHolder().get(),
                    commonOrePlacement(1, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(200)))));

    public static final RegistryObject<PlacedFeature> GRAY_COLORED_STONE_PLACED = PLACED_FEATURES.register("gray_colored_stone_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.GRAY_COLORED_STONE.getHolder().get(),
                    commonOrePlacement(1, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(200)))));

    public static final RegistryObject<PlacedFeature> LIGHT_GRAY_COLORED_STONE_PLACED = PLACED_FEATURES.register("light_gray_colored_stone_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.LIGHT_GRAY_COLORED_STONE.getHolder().get(),
                    commonOrePlacement(1, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(200)))));

    public static final RegistryObject<PlacedFeature> GREEN_COLORED_STONE_PLACED = PLACED_FEATURES.register("green_colored_stone_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.GREEN_COLORED_STONE.getHolder().get(),
                    commonOrePlacement(1, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(200)))));

    public static final RegistryObject<PlacedFeature> LIME_COLORED_STONE_PLACED = PLACED_FEATURES.register("lime_colored_stone_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.LIME_COLORED_STONE.getHolder().get(),
                    commonOrePlacement(1, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(200)))));

    public static final RegistryObject<PlacedFeature> PURPLE_COLORED_STONE_PLACED = PLACED_FEATURES.register("purple_colored_stone_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.PURPLE_COLORED_STONE.getHolder().get(),
                    commonOrePlacement(1, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(200)))));

    public static final RegistryObject<PlacedFeature> MAGENTA_COLORED_STONE_PLACED = PLACED_FEATURES.register("magenta_colored_stone_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.MAGENTA_COLORED_STONE.getHolder().get(),
                    commonOrePlacement(1, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(200)))));

    public static final RegistryObject<PlacedFeature> PINK_COLORED_STONE_PLACED = PLACED_FEATURES.register("pink_colored_stone_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.PINK_COLORED_STONE.getHolder().get(),
                    commonOrePlacement(1, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(200)))));

    public static final RegistryObject<PlacedFeature> CYAN_COLORED_STONE_PLACED = PLACED_FEATURES.register("cyan_colored_stone_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.CYAN_COLORED_STONE.getHolder().get(),
                    commonOrePlacement(1, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(200)))));

    public static final RegistryObject<PlacedFeature> ORANGE_COLORED_STONE_PLACED = PLACED_FEATURES.register("orange_colored_stone_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ORANGE_COLORED_STONE.getHolder().get(),
                    commonOrePlacement(1, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(200)))));

    public static final RegistryObject<PlacedFeature> BROWN_COLORED_STONE_PLACED = PLACED_FEATURES.register("brown_colored_stone_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.BROWN_COLORED_STONE.getHolder().get(),
                    commonOrePlacement(1, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(200)))));

    public static final RegistryObject<PlacedFeature> BLACK_COLORED_STONE_PLACED = PLACED_FEATURES.register("black_colored_stone_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.BLACK_COLORED_STONE.getHolder().get(),
                    commonOrePlacement(1, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(200)))));




    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }


    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}

 */
