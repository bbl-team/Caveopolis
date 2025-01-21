package com.benbenlaw.caveopolis.data;

import com.benbenlaw.caveopolis.recipe.ColoredCraftingRecipe;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import net.minecraft.advancements.*;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.item.crafting.ShapedRecipePattern;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.ICondition;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ColoredCraftingRecipeBuilder extends ShapedRecipeBuilder {

    public ColoredCraftingRecipeBuilder(RecipeCategory pCategory, ItemLike pResult, int pCount) {
        super(pCategory, pResult, pCount);
    }

    public static ColoredCraftingRecipeBuilder shaped(RecipeCategory pCategory, ItemLike pResult) {
        return shaped(pCategory, pResult, 1);
    }

    public static ColoredCraftingRecipeBuilder shaped(RecipeCategory pCategory, ItemLike pResult, int pCount) {
        return new ColoredCraftingRecipeBuilder(pCategory, pResult, pCount);

    }


    @Override
    public void save(RecipeOutput recipeOutput, ResourceLocation pRecipeId) {

        super.save(new RecipeOutput() {
            @Override
            public void accept(ResourceLocation id, Recipe<?> recipe, @Nullable AdvancementHolder advancement, ICondition... conditions) {
                if (recipe instanceof ShapedRecipe shapedRecipe) {
                    recipeOutput.accept(id, new ColoredCraftingRecipe(shapedRecipe.group, shapedRecipe.pattern, shapedRecipe.result), advancement, conditions);
                }
            }

            @Override
            public Advancement.Builder advancement() {
                return recipeOutput.advancement();
            }
        }, pRecipeId);
    }
}