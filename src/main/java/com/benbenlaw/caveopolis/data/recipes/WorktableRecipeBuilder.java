package com.benbenlaw.caveopolis.data.recipes;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.recipe.WorktableRecipe;
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
import net.neoforged.neoforge.common.crafting.SizedIngredient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedHashMap;
import java.util.Map;

public class WorktableRecipeBuilder implements RecipeBuilder {


    protected String group;
    protected SizedIngredient input;
    protected ItemStack output;
    protected final Map<String, Criterion<?>> criteria = new LinkedHashMap<>();

    public WorktableRecipeBuilder(ItemStack output, SizedIngredient input) {
        this.input = input;
        this.output = output;
    }

    public static WorktableRecipeBuilder worktableRecipeBuilder(ItemStack output, SizedIngredient input) {
        return new WorktableRecipeBuilder(output, input);
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
        this.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "worktable/" +
                BuiltInRegistries.ITEM.getKey(this.output.getItem()).getPath()));
    }

    @Override
    public void save(@NotNull RecipeOutput recipeOutput, @NotNull ResourceLocation id) {
        Advancement.Builder builder = Advancement.Builder.advancement()
                .addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(id))
                .rewards(AdvancementRewards.Builder.recipe(id))
                .requirements(AdvancementRequirements.Strategy.OR);
        this.criteria.forEach(builder::addCriterion);
        WorktableRecipe catalogueRecipe = new WorktableRecipe(this.input, this.output);
        recipeOutput.accept(id, catalogueRecipe, builder.build(id.withPrefix("recipes/worktable/")));

    }
}