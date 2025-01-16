package com.benbenlaw.caveopolis.recipe.conditions;

import com.benbenlaw.caveopolis.config.RecipeConfig;
import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemConditionType;
import net.neoforged.neoforge.common.conditions.ICondition;

public class ColoredFlowersToDye implements ICondition {

    public static final ColoredFlowersToDye INSTANCE = new ColoredFlowersToDye();
    public static final MapCodec<ColoredFlowersToDye> CODEC = MapCodec.unit(INSTANCE);

    @Override
    public boolean test(ICondition.IContext context) {
        return RecipeConfig.flowerToDyeRecipes.get();
    }

    @Override
    public MapCodec<? extends ICondition> codec() {
        return CODEC;
    }

}
