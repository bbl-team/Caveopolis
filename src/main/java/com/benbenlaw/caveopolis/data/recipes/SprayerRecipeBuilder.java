package com.benbenlaw.caveopolis.data.recipes;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.recipe.SprayerRecipe;
import com.benbenlaw.opolisutilities.OpolisUtilities;
import com.benbenlaw.opolisutilities.recipe.CatalogueRecipe;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRequirements;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.crafting.SizedIngredient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedHashMap;
import java.util.Map;

public class SprayerRecipeBuilder implements RecipeBuilder {

    protected String group;
    protected Ingredient input;
    protected Ingredient spraycan;
    protected ItemStack output;
    protected final Map<String, Criterion<?>> criteria = new LinkedHashMap<>();

    public SprayerRecipeBuilder(Ingredient input, Ingredient spraycan, ItemStack output) {
        this.input = input;
        this.spraycan = spraycan;
        this.output = output;
    }

    public static SprayerRecipeBuilder SprayerRecipeBuilder(Ingredient input, Ingredient spraycan, ItemStack output) {
        return new SprayerRecipeBuilder(input, spraycan, output);
    }

    @Override
    public @NotNull RecipeBuilder unlockedBy(String name, Criterion<?> criterion) {
        this.criteria.put(name, criterion);
        return this;
    }

    @Override
    public @NotNull RecipeBuilder group(@Nullable String groupName) {
        this.group = groupName;
        return this;
    }

    @Override
    public @NotNull Item getResult() {
        return output.getItem();
    }

    public void save(@NotNull RecipeOutput recipeOutput) {
        this.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/" +
                BuiltInRegistries.ITEM.getKey(this.output.getItem()).getPath()));
    }

    @Override
    public void save(@NotNull RecipeOutput recipeOutput, @NotNull ResourceLocation id) {
        Advancement.Builder builder = Advancement.Builder.advancement()
                .addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(id))
                .rewards(AdvancementRewards.Builder.recipe(id))
                .requirements(AdvancementRequirements.Strategy.OR);
        this.criteria.forEach(builder::addCriterion);
        SprayerRecipe sprayerRecipe = new SprayerRecipe(this.input, this.spraycan, this.output);
        recipeOutput.accept(id, sprayerRecipe, builder.build(id.withPrefix("recipe/sprayer/")));

    }
}
