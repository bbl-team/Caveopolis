package com.benbenlaw.caveopolis.worldgen;

import com.benbenlaw.caveopolis.Caveopolis;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class CaveopolisBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_TREE_BLACK = registerKey("add_tree_black");
    public static final ResourceKey<BiomeModifier> ADD_TREE_RED = registerKey("add_tree_red");
    public static final ResourceKey<BiomeModifier> ADD_TREE_GREEN = registerKey("add_tree_green");
    public static final ResourceKey<BiomeModifier> ADD_TREE_BROWN = registerKey("add_tree_brown");
    public static final ResourceKey<BiomeModifier> ADD_TREE_BLUE = registerKey("add_tree_blue");
    public static final ResourceKey<BiomeModifier> ADD_TREE_PURPLE = registerKey("add_tree_purple");
    public static final ResourceKey<BiomeModifier> ADD_TREE_CYAN = registerKey("add_tree_cyan");
    public static final ResourceKey<BiomeModifier> ADD_TREE_LIGHT_GRAY = registerKey("add_tree_light_gray");
    public static final ResourceKey<BiomeModifier> ADD_TREE_GRAY = registerKey("add_tree_gray");
    public static final ResourceKey<BiomeModifier> ADD_TREE_PINK = registerKey("add_tree_pink");
    public static final ResourceKey<BiomeModifier> ADD_TREE_LIME = registerKey("add_tree_lime");
    public static final ResourceKey<BiomeModifier> ADD_TREE_YELLOW = registerKey("add_tree_yellow");
    public static final ResourceKey<BiomeModifier> ADD_TREE_LIGHT_BLUE = registerKey("add_tree_light_blue");
    public static final ResourceKey<BiomeModifier> ADD_TREE_MAGENTA = registerKey("add_tree_magenta");
    public static final ResourceKey<BiomeModifier> ADD_TREE_ORANGE = registerKey("add_tree_orange");
    public static final ResourceKey<BiomeModifier> ADD_TREE_WHITE = registerKey("add_tree_white");

    public static final ResourceKey<BiomeModifier> ADD_STONE_BLACK = registerKey("add_stone_black");
    public static final ResourceKey<BiomeModifier> ADD_STONE_RED = registerKey("add_stone_red");
    public static final ResourceKey<BiomeModifier> ADD_STONE_GREEN = registerKey("add_stone_green");
    public static final ResourceKey<BiomeModifier> ADD_STONE_BROWN = registerKey("add_stone_brown");
    public static final ResourceKey<BiomeModifier> ADD_STONE_BLUE = registerKey("add_stone_blue");
    public static final ResourceKey<BiomeModifier> ADD_STONE_PURPLE = registerKey("add_stone_purple");
    public static final ResourceKey<BiomeModifier> ADD_STONE_CYAN = registerKey("add_stone_cyan");
    public static final ResourceKey<BiomeModifier> ADD_STONE_LIGHT_GRAY = registerKey("add_stone_light_gray");
    public static final ResourceKey<BiomeModifier> ADD_STONE_GRAY = registerKey("add_stone_gray");
    public static final ResourceKey<BiomeModifier> ADD_STONE_PINK = registerKey("add_stone_pink");
    public static final ResourceKey<BiomeModifier> ADD_STONE_LIME = registerKey("add_stone_lime");
    public static final ResourceKey<BiomeModifier> ADD_STONE_YELLOW = registerKey("add_stone_yellow");
    public static final ResourceKey<BiomeModifier> ADD_STONE_LIGHT_BLUE = registerKey("add_stone_light_blue");
    public static final ResourceKey<BiomeModifier> ADD_STONE_MAGENTA = registerKey("add_stone_magenta");
    public static final ResourceKey<BiomeModifier> ADD_STONE_ORANGE = registerKey("add_stone_orange");
    public static final ResourceKey<BiomeModifier> ADD_STONE_WHITE = registerKey("add_stone_white");


    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        //Black Tree
        context.register(ADD_TREE_BLACK, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.DARK_FOREST)),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.BLACK_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        //Red Tree
        context.register(ADD_TREE_RED, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_JUNGLE),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.RED_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        //Green Tree
        context.register(ADD_TREE_GREEN, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_JUNGLE),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.GREEN_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        //Brown Tree
        context.register(ADD_TREE_BROWN, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_SWAMP),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.BROWN_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        //Blue Tree
        context.register(ADD_TREE_BLUE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_SNOWY),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.BLUE_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        //Purple Tree
        context.register(ADD_TREE_PURPLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.PURPLE_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        //Cyan Tree
        context.register(ADD_TREE_CYAN, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_SNOWY),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.CYAN_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        //Light Gray Tree
        context.register(ADD_TREE_LIGHT_GRAY, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_MOUNTAIN),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.LIGHT_GRAY_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        //Gray Tree
        context.register(ADD_TREE_GRAY, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_MOUNTAIN),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.GRAY_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        //Pink Tree
        context.register(ADD_TREE_PINK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.PINK_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        //Lime Tree
        context.register(ADD_TREE_LIME, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_JUNGLE),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.LIME_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        //Yellow Tree
        context.register(ADD_TREE_YELLOW, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_DESERT),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.YELLOW_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        //Light Blue Tree
        context.register(ADD_TREE_LIGHT_BLUE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_SNOWY),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.LIGHT_BLUE_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        //Magenta Tree
        context.register(ADD_TREE_MAGENTA, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.MAGENTA_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        //Orange Tree
        context.register(ADD_TREE_ORANGE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_BADLANDS),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.ORANGE_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        //White Tree
        context.register(ADD_TREE_WHITE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_SNOWY),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.WHITE_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        //Black Stone
        context.register(ADD_STONE_BLACK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.BLACK_STONE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Red Stone
        context.register(ADD_STONE_RED, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.RED_STONE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Green Stone
        context.register(ADD_STONE_GREEN, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.GREEN_STONE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Brown Stone
        context.register(ADD_STONE_BROWN, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.BROWN_STONE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Blue Stone
        context.register(ADD_STONE_BLUE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.BLUE_STONE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Purple Stone
        context.register(ADD_STONE_PURPLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.PURPLE_STONE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Cyan Stone
        context.register(ADD_STONE_CYAN, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.CYAN_STONE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Light Gray Stone
        context.register(ADD_STONE_LIGHT_GRAY, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.LIGHT_GRAY_STONE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Gray Stone
        context.register(ADD_STONE_GRAY, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.GRAY_STONE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Pink Stone
        context.register(ADD_STONE_PINK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.PINK_STONE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Lime Stone
        context.register(ADD_STONE_LIME, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.LIME_STONE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Yellow Stone
        context.register(ADD_STONE_YELLOW, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.YELLOW_STONE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Light Blue Stone
        context.register(ADD_STONE_LIGHT_BLUE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.LIGHT_BLUE_STONE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Magenta Stone
        context.register(ADD_STONE_MAGENTA, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.MAGENTA_STONE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Orange Stone
        context.register(ADD_STONE_ORANGE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.ORANGE_STONE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //White Stone
        context.register(ADD_STONE_WHITE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(CaveopolisPlacedFeatures.WHITE_STONE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));




    }


    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, name));
    }
}