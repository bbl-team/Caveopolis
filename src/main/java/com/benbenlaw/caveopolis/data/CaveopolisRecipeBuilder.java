package com.benbenlaw.caveopolis.data;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.CaveopolisBlocks;
import com.benbenlaw.caveopolis.data.recipes.WorktableRecipeBuilder;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.crafting.SizedIngredient;

import java.util.concurrent.CompletableFuture;

public class CaveopolisRecipeBuilder extends RecipeProvider {

    public CaveopolisRecipeBuilder(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void buildRecipes(RecipeOutput consumer) {
        // Array of all 16 colors (replace with the actual color names or values)
        String[] colors = {
                "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray",
                "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
        };

        // Iterate over all the colors
        for (String color : colors) {
            // Create the recipe for each color
            WorktableRecipeBuilder.worktableRecipeBuilder(
                            new SizedIngredient(Ingredient.of(CaveopolisBlocks.COLORED_STONE), 1),
                            iconWithColor(new ItemStack(CaveopolisBlocks.COLORED_STONE.get()), color))
                    .unlockedBy("has_item", has(CaveopolisBlocks.COLORED_STONE))
                    .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "colored_stone_" + color));

            WorktableRecipeBuilder.worktableRecipeBuilder(
                            new SizedIngredient(Ingredient.of(CaveopolisBlocks.COLORED_MOSAIC), 1),
                            iconWithColor(new ItemStack(CaveopolisBlocks.COLORED_MOSAIC.get()), color))
                    .unlockedBy("has_item", has(CaveopolisBlocks.COLORED_MOSAIC))
                    .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "colored_mosaic_" + color));
        }
    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);

        return item;
    }
}
