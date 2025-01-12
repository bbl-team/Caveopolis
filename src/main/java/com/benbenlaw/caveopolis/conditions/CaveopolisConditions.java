package com.benbenlaw.caveopolis.conditions;

import com.benbenlaw.caveopolis.Caveopolis;
import com.mojang.serialization.MapCodec;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.conditions.ICondition;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class CaveopolisConditions {

    public static final DeferredRegister<MapCodec<? extends ICondition>> CONDITIONALS =
            DeferredRegister.create(NeoForgeRegistries.Keys.CONDITION_CODECS, Caveopolis.MOD_ID);

    public static final DeferredHolder<MapCodec<? extends ICondition>, MapCodec<RedTreeCondition>> RED_TREE_CONDITION =
            CONDITIONALS.register("red_tree_condition", () -> RedTreeCondition.CODEC);


    public static void register(IEventBus eventBus) {
        CONDITIONALS.register(eventBus);
    }
}
