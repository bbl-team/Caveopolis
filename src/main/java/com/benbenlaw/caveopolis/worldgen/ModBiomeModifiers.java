package com.benbenlaw.caveopolis.worldgen;

import com.benbenlaw.caveopolis.Caveopolis;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_TREE_BLACK = registerKey("add_tree_black");
    public static final ResourceKey<BiomeModifier> ADD_TREE_BLUE = registerKey("add_tree_blue");
    public static final ResourceKey<BiomeModifier> ADD_TREE_BROWN = registerKey("add_tree_brown");
    public static final ResourceKey<BiomeModifier> ADD_TREE_CYAN = registerKey("add_tree_cyan");
    public static final ResourceKey<BiomeModifier> ADD_TREE_GRAY = registerKey("add_tree_gray");
    public static final ResourceKey<BiomeModifier> ADD_TREE_GREEN = registerKey("add_tree_green");
    public static final ResourceKey<BiomeModifier> ADD_TREE_LIGHT_BLUE = registerKey("add_tree_light_blue");
    public static final ResourceKey<BiomeModifier> ADD_TREE_LIGHT_GRAY = registerKey("add_tree_light_gray");
    public static final ResourceKey<BiomeModifier> ADD_TREE_LIME = registerKey("add_tree_lime");
    public static final ResourceKey<BiomeModifier> ADD_TREE_MAGENTA = registerKey("add_tree_magenta");
    public static final ResourceKey<BiomeModifier> ADD_TREE_ORANGE = registerKey("add_tree_orange");
    public static final ResourceKey<BiomeModifier> ADD_TREE_PINK = registerKey("add_tree_pink");
    public static final ResourceKey<BiomeModifier> ADD_TREE_PURPLE = registerKey("add_tree_purple");
    public static final ResourceKey<BiomeModifier> ADD_TREE_RED = registerKey("add_tree_red");
    public static final ResourceKey<BiomeModifier> ADD_TREE_WHITE = registerKey("add_tree_white");
    public static final ResourceKey<BiomeModifier> ADD_TREE_YELLOW = registerKey("add_tree_yellow");


    public static void  bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);


        context.register(ADD_TREE_BLACK, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_SWAMP),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.BLACK_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));


        context.register(ADD_TREE_BLUE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_SNOWY),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.BLUE_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_TREE_BROWN, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_SWAMP),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.BROWN_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_TREE_CYAN, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_SNOWY),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.CYAN_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_TREE_GRAY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_MOUNTAIN),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.GRAY_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_TREE_GREEN, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_JUNGLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.GREEN_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_TREE_LIGHT_BLUE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_SNOWY),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.LIGHT_BLUE_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_TREE_LIGHT_GRAY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_MOUNTAIN),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.LIGHT_GRAY_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_TREE_LIME, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_JUNGLE),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.LIME_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_TREE_MAGENTA, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MAGENTA_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_TREE_ORANGE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_SAVANNA),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ORANGE_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_TREE_PINK, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PINK_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_TREE_PURPLE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PURPLE_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_TREE_RED, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_BADLANDS),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.RED_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_TREE_WHITE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_SNOWY),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.WHITE_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_TREE_YELLOW, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_SAVANNA),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.YELLOW_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));



    }



    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(Caveopolis.MOD_ID, name));
    }

}
