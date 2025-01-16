package com.benbenlaw.caveopolis.recipe.conditions;

import com.benbenlaw.caveopolis.config.RecipeConfig;
import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemConditionType;
import net.neoforged.neoforge.common.conditions.ICondition;

public class CraftingTableApplyColor implements ICondition {

    public static final CraftingTableApplyColor INSTANCE = new CraftingTableApplyColor();
    public static final MapCodec<CraftingTableApplyColor> CODEC = MapCodec.unit(INSTANCE);

    @Override
    public boolean test(IContext context) {
        return RecipeConfig.coloringRecipes.get();
    }

    @Override
    public MapCodec<? extends ICondition> codec() {
        return CODEC;
    }
}
