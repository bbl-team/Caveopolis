package com.benbenlaw.caveopolis.recipe.conditions;

import com.benbenlaw.caveopolis.Caveopolis;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.storage.loot.predicates.LootItemConditionType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.conditions.ICondition;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class CaveopolisConditions {
    public static final DeferredRegister<MapCodec<? extends ICondition>> CONDITIONALS =
            DeferredRegister.create(NeoForgeRegistries.Keys.CONDITION_CODECS, Caveopolis.MOD_ID);
    public static final DeferredHolder<MapCodec<? extends ICondition>, MapCodec<CraftingTableApplyColor>> CRAFTING_TABLE_APPLY_COLOR =
            CONDITIONALS.register("crafting_table_apply_color", () ->  CraftingTableApplyColor.CODEC);

    public static final DeferredHolder<MapCodec<? extends ICondition>, MapCodec<CraftingTableApplyLighting>> CRAFTING_TABLE_APPLY_LIGHTING =
            CONDITIONALS.register("crafting_table_apply_lighting", () -> CraftingTableApplyLighting.CODEC);

    public static final DeferredHolder<MapCodec<? extends ICondition>, MapCodec<ColoredFlowersToDye>> COLORED_FLOWERS_TO_DYE =
            CONDITIONALS.register("colored_flowers_to_dye", () -> ColoredFlowersToDye.CODEC);


    public static void register(IEventBus eventBus) {
        CONDITIONALS.register(eventBus);
    }}
