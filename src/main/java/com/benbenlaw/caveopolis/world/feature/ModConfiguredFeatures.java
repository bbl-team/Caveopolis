package com.benbenlaw.caveopolis.world.feature;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.ModBlocks;
import com.benbenlaw.caveopolis.util.ModTags;
import com.google.common.base.Suppliers;
import net.minecraft.core.Holder;
import net.minecraft.core.NonNullList;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.sql.Array;
import java.util.*;
import java.util.function.Supplier;

public class ModConfiguredFeatures {

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Caveopolis.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_MIXED_STONE_ORE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MIXED_STONE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_MIXED_STONE_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_BRIGHT_STONE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BRIGHT_STONE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_MOSSY_STONE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MOSSY_STONE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_WHITE_COLORED_STONE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.WHITE_COLORED_STONE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_RED_COLORED_STONE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RED_COLORED_STONE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_BLACK_COLORED_STONE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BLACK_COLORED_STONE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.BLACK_COLORED_STONE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_GRAY_COLORED_STONE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.GRAY_COLORED_STONE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.GRAY_COLORED_STONE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_LIGHT_GRAY_COLORED_STONE = Suppliers.memoize(() -> List.of(
           OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.LIGHT_GRAY_COLORED_STONE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.LIGHT_GRAY_COLORED_STONE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_LIGHT_BLUE_COLORED_STONE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.LIGHT_BLUE_COLORED_STONE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_BLUE_COLORED_STONE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BLUE_COLORED_STONE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_PINK_COLORED_STONE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.PINK_COLORED_STONE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_MAGENTA_COLORED_STONE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MAGENTA_COLORED_STONE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ORANGE_COLORED_STONE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ORANGE_COLORED_STONE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_BROWN_COLORED_STONE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BROWN_COLORED_STONE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_LIME_COLORED_STONE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.LIME_COLORED_STONE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_YELLOW_COLORED_STONE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.YELLOW_COLORED_STONE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_PURPLE_COLORED_STONE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.PURPLE_COLORED_STONE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_CYAN_COLORED_STONE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CYAN_COLORED_STONE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_GREEN_COLORED_STONE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.GREEN_COLORED_STONE.get().defaultBlockState())));







    public static final RegistryObject<ConfiguredFeature<?, ?>> MIXED_STONE_ORE = CONFIGURED_FEATURES.register("mixed_stone_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_MIXED_STONE_ORE.get(),8)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> BRIGHT_STONE = CONFIGURED_FEATURES.register("bright_stone",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_BRIGHT_STONE.get(),12)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> MOSSY_STONE = CONFIGURED_FEATURES.register("mossy_stone",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_MOSSY_STONE.get(),20)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> WHITE_COLORED_STONE = CONFIGURED_FEATURES.register("white_colored_stone",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_WHITE_COLORED_STONE.get(),64)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> RED_COLORED_STONE = CONFIGURED_FEATURES.register("red_colored_stone",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_RED_COLORED_STONE.get(),64)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> BLACK_COLORED_STONE = CONFIGURED_FEATURES.register("black_colored_stone",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_BLACK_COLORED_STONE.get(),64)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> GRAY_COLORED_STONE = CONFIGURED_FEATURES.register("gray_colored_stone",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_GRAY_COLORED_STONE.get(),64)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> LIGHT_GRAY_COLORED_STONE = CONFIGURED_FEATURES.register("light_gray_colored_stone",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_LIGHT_GRAY_COLORED_STONE.get(),64)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> LIGHT_BLUE_COLORED_STONE = CONFIGURED_FEATURES.register("light_blue_colored_stone",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_LIGHT_BLUE_COLORED_STONE.get(),64)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> BLUE_COLORED_STONE = CONFIGURED_FEATURES.register("blue_colored_stone",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_BLUE_COLORED_STONE.get(),64)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> PINK_COLORED_STONE = CONFIGURED_FEATURES.register("pink_colored_stone",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_PINK_COLORED_STONE.get(),64)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> MAGENTA_COLORED_STONE = CONFIGURED_FEATURES.register("magenta_colored_stone",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_MAGENTA_COLORED_STONE.get(),64)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> ORANGE_COLORED_STONE = CONFIGURED_FEATURES.register("orange_colored_stone",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORANGE_COLORED_STONE.get(),64)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> BROWN_COLORED_STONE = CONFIGURED_FEATURES.register("brown_colored_stone",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_BROWN_COLORED_STONE.get(),64)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> LIME_COLORED_STONE = CONFIGURED_FEATURES.register("lime_colored_stone",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_LIME_COLORED_STONE.get(),64)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> YELLOW_COLORED_STONE = CONFIGURED_FEATURES.register("yellow_colored_stone",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_YELLOW_COLORED_STONE.get(),64)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> PURPLE_COLORED_STONE = CONFIGURED_FEATURES.register("purple_colored_stone",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_PURPLE_COLORED_STONE.get(),64)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> CYAN_COLORED_STONE = CONFIGURED_FEATURES.register("cyan_colored_stone",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_CYAN_COLORED_STONE.get(),64)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> GREEN_COLORED_STONE = CONFIGURED_FEATURES.register("green_colored_stone",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_GREEN_COLORED_STONE.get(),64)));







    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}
