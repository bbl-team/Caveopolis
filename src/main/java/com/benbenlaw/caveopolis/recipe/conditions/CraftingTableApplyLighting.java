package com.benbenlaw.caveopolis.recipe.conditions;

import com.benbenlaw.caveopolis.config.RecipeConfig;
import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemConditionType;
import net.neoforged.neoforge.common.conditions.ICondition;

public class CraftingTableApplyLighting implements ICondition {
    public static final CraftingTableApplyLighting INSTANCE = new CraftingTableApplyLighting();
    public static final MapCodec<CraftingTableApplyLighting> CODEC = MapCodec.unit(INSTANCE);

    @Override
    public boolean test(IContext context) {
        return RecipeConfig.lightingRecipes.get();
    }

    @Override
    public MapCodec<? extends ICondition> codec() {
        return CODEC;
    }
}