package com.benbenlaw.caveopolis.worldgen;

import com.benbenlaw.caveopolis.Caveopolis;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.PlacementModifierType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CaveopolisWorldGeneration {

    public static final DeferredRegister<Feature<?>> FEATURES =
            DeferredRegister.create(BuiltInRegistries.FEATURE, Caveopolis.MOD_ID);

    public static final DeferredRegister<PlacementModifierType<?>> PLACEMENTS =
            DeferredRegister.create(BuiltInRegistries.PLACEMENT_MODIFIER_TYPE, Caveopolis.MOD_ID);


    // Trees Placement
    public static Supplier<PlacementModifierType<?>> COLORED_TREES_PLACEMENT =
            PLACEMENTS.register("colored_trees_placement",  () -> (PlacementModifierType<PlacementModifier>) () -> PlacementTrees.CODEC);

    //Stones Placement
    public static Supplier<PlacementModifierType<?>> COLORED_STONES_PLACEMENT =
            PLACEMENTS.register("colored_stones_placement",  () -> (PlacementModifierType<PlacementModifier>) () -> PlacementStones.CODEC);


    public static void register(IEventBus eventBus) {

        FEATURES.register(eventBus);
        PLACEMENTS.register(eventBus);
    }

}
