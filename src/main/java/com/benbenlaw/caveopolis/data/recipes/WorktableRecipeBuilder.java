package com.benbenlaw.caveopolis.data.recipes;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.recipe.WorktableRecipe;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRequirements;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.common.crafting.SizedIngredient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WorktableRecipeBuilder implements RecipeBuilder {


    protected String group;
    protected SizedIngredient input;
    protected List<ItemStack> results;
    protected final Map<String, Criterion<?>> criteria = new LinkedHashMap<>();

    public WorktableRecipeBuilder(List<ItemStack> results, SizedIngredient input) {
        this.input = input;
        this.results = results;
    }

    public static WorktableRecipeBuilder worktableRecipeBuilder(List<ItemStack> results, SizedIngredient input) {
        return new WorktableRecipeBuilder(results, input);
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
        return results.getFirst().getItem();
    }

    public void save(@NotNull RecipeOutput recipeOutput) {
        this.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "worktable/"));
    }

    @Override
    public void save(@NotNull RecipeOutput recipeOutput, @NotNull ResourceLocation id) {
        Advancement.Builder builder = Advancement.Builder.advancement()
                .addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(id))
                .rewards(AdvancementRewards.Builder.recipe(id))
                .requirements(AdvancementRequirements.Strategy.OR);
        this.criteria.forEach(builder::addCriterion);
        WorktableRecipe worktableRecipe = new WorktableRecipe(this.input, this.results);
        recipeOutput.accept(id, worktableRecipe, builder.build(id.withPrefix("recipes/worktable/")));

    }
}