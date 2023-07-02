package com.benbenlaw.caveopolis.data.custom;

import com.google.gson.JsonObject;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;

import javax.annotation.Nullable;
import java.util.function.Consumer;

public class SprayerRecipeBuilder implements RecipeBuilder {
    private final RecipeCategory category;
    private final Item result;
    private final Ingredient ingredient;
    private final Advancement.Builder advancement = Advancement.Builder.recipeAdvancement();
    @Nullable
    private String group;
    private final RecipeSerializer<? extends AbstractCookingRecipe> serializer;

    private SprayerRecipeBuilder(RecipeCategory category, ItemLike result, Ingredient ingredient, RecipeSerializer<? extends AbstractCookingRecipe> serializer) {
        this.category = category;
        this.result = result.asItem();
        this.ingredient = ingredient;
        this.serializer = serializer;
    }

    public static SprayerRecipeBuilder sprayerRecipe(Ingredient ingredient, RecipeCategory category, ItemLike result, RecipeSerializer<? extends AbstractCookingRecipe> serializer) {
        return new SprayerRecipeBuilder(category, result, ingredient, serializer);
    }
    @Override
    public RecipeBuilder unlockedBy(String p_176496_, CriterionTriggerInstance p_176497_) {
        this.advancement.addCriterion(p_176496_, p_176497_);
        return this;
    }

    @Override
    public RecipeBuilder group(@org.jetbrains.annotations.Nullable String p_176495_) {
        this.group = p_176495_;
        return this;
    }

    @Override
    public Item getResult() {
        return this.result;
    }

    private void ensureValid(ResourceLocation p_126266_) {
        if (this.advancement.getCriteria().isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + p_126266_);
        }
    }

    @Override
    public void save(Consumer<FinishedRecipe> p_126263_, ResourceLocation p_126264_) {
        this.ensureValid(p_126264_);
        this.advancement.parent(ROOT_RECIPE_ADVANCEMENT).addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(p_126264_)).rewards(AdvancementRewards.Builder.recipe(p_126264_)).requirements(RequirementsStrategy.OR);
        p_126263_.accept(new SprayerRecipeBuilder.Result(p_126264_, this.group == null ? "" : this.group, this.ingredient, this.result, this.advancement, p_126264_.withPrefix("recipes/" + this.category.getFolderName() + "/"), this.serializer));
    }

    static class Result implements FinishedRecipe {
        private final ResourceLocation id;
        private final String group;
        private final Ingredient ingredient;
        private final Item result;
        private final Advancement.Builder advancement;
        private final ResourceLocation advancementId;
        private final RecipeSerializer<? extends AbstractCookingRecipe> serializer;

        public Result(ResourceLocation id, String group, Ingredient ingredient, Item result, Advancement.Builder p_249151_, ResourceLocation advancementId, RecipeSerializer<? extends AbstractCookingRecipe> serializer) {
            this.id = id;
            this.group = group;
            this.ingredient = ingredient;
            this.result = result;
            this.advancement = p_249151_;
            this.advancementId = advancementId;
            this.serializer = serializer;
        }

        public void serializeRecipeData(JsonObject jsonObject) {
            if (!this.group.isEmpty()) {
                jsonObject.addProperty("group", this.group);
            }

            jsonObject.add("ingredient", this.ingredient.toJson());
            jsonObject.addProperty("result", BuiltInRegistries.ITEM.getKey(this.result).toString());
        }

        public RecipeSerializer<?> getType() {
            return this.serializer;
        }

        public ResourceLocation getId() {
            return this.id;
        }

        @Nullable
        public JsonObject serializeAdvancement() {
            return this.advancement.serializeToJson();
        }

        @Nullable
        public ResourceLocation getAdvancementId() {
            return this.advancementId;
        }
    }
}