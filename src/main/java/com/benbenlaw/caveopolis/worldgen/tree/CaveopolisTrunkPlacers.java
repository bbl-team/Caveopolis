package com.benbenlaw.caveopolis.worldgen.tree;

import com.benbenlaw.caveopolis.Caveopolis;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CaveopolisTrunkPlacers {


    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACER =
            DeferredRegister.create(BuiltInRegistries.TRUNK_PLACER_TYPE, Caveopolis.MOD_ID);

    public static final DeferredHolder<TrunkPlacerType<?>, TrunkPlacerType<HugeTrunkPlacer>> HUGE_TRUNK_PLACER =
            TRUNK_PLACER.register("huge_trunk_placer", () -> new TrunkPlacerType<>(HugeTrunkPlacer.CODEC));



    public static void register(IEventBus eventBus) {
        TRUNK_PLACER.register(eventBus);
    }
}
