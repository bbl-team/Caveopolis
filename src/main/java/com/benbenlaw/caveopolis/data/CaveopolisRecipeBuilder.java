package com.benbenlaw.caveopolis.data;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.CaveopolisBlocks;
import com.benbenlaw.caveopolis.data.recipes.*;
import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.caveopolis.recipe.conditions.ColoredFlowersToDye;
import com.benbenlaw.caveopolis.recipe.conditions.CraftingTableApplyColor;
import com.benbenlaw.caveopolis.recipe.ColoringRecipe;
import com.benbenlaw.caveopolis.recipe.FlowerDyeRecipe;
import com.benbenlaw.caveopolis.recipe.LightingRecipe;
import com.benbenlaw.caveopolis.recipe.conditions.CraftingTableApplyLighting;
import com.benbenlaw.caveopolis.util.CaveopolisTags;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponentPatch;
import net.minecraft.core.component.DataComponentPredicate;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.ShapedRecipePattern;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.ICondition;
import net.neoforged.neoforge.common.crafting.DataComponentIngredient;
import net.neoforged.neoforge.common.crafting.SizedIngredient;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CaveopolisRecipeBuilder extends RecipeProvider {

    public CaveopolisRecipeBuilder(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    String[] colors = {
            "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray",
            "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
    };



    @Override
    protected void buildRecipes(RecipeOutput consumer) {

        //Crafting Recipes




        //Vanilla To Caveopolis - Bamboo
        WorktableRecipeBuilder.worktableRecipeBuilder(VanillaResults.BAMBOO,
                SizedIngredient.of(Items.BAMBOO_BLOCK.asItem(), 1))
                .unlockedBy("has_item", has(Items.BAMBOO_BLOCK.asItem()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "worktable/vanilla/bamboo"));

        //Vanilla To Caveopolis - Prismarine
        WorktableRecipeBuilder.worktableRecipeBuilder(VanillaResults.PRISMARINE,
                SizedIngredient.of(Items.PRISMARINE.asItem(), 1))
                .unlockedBy("has_item", has(Items.PRISMARINE.asItem()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "worktable/vanilla/prismarine"));

        //Vanilla To Caveopolis - Stone
        WorktableRecipeBuilder.worktableRecipeBuilder(VanillaResults.STONE,
                SizedIngredient.of(Items.STONE.asItem(), 1))
                .unlockedBy("has_item", has(Items.STONE.asItem()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "worktable/vanilla/stone"));

        //Vanilla To Caveopolis - Cobblestone
        WorktableRecipeBuilder.worktableRecipeBuilder(VanillaResults.COBBLESTONE,
                SizedIngredient.of(Items.COBBLESTONE.asItem(), 1))
                .unlockedBy("has_item", has(Items.COBBLESTONE.asItem()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "worktable/vanilla/cobblestone"));

        //Vanilla To Caveopolis - Dirt
        WorktableRecipeBuilder.worktableRecipeBuilder(VanillaResults.DIRT,
                SizedIngredient.of(ItemTags.DIRT, 1))
                .unlockedBy("has_item", has(Items.DIRT.asItem()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "worktable/vanilla/dirt"));

        //Vanilla To Caveopolis - Apple
        WorktableRecipeBuilder.worktableRecipeBuilder(VanillaResults.APPLE,
                SizedIngredient.of(Items.APPLE.asItem(), 1))
                .unlockedBy("has_item", has(Items.APPLE.asItem()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "worktable/vanilla/apple"));

        //Vanilla To Caveopolis - Poppy
        WorktableRecipeBuilder.worktableRecipeBuilder(VanillaResults.POPPY,
                SizedIngredient.of(Items.POPPY.asItem(), 1))
                .unlockedBy("has_item", has(Items.POPPY.asItem()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "worktable/vanilla/poppy"));

        //Vanilla To Caveopolis - Dandelion
        WorktableRecipeBuilder.worktableRecipeBuilder(VanillaResults.DANDELION,
                SizedIngredient.of(Items.DANDELION.asItem(), 1))
                .unlockedBy("has_item", has(Items.DANDELION.asItem()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "worktable/vanilla/dandelion"));

        //Vanilla To Caveopolis - Leaves
        WorktableRecipeBuilder.worktableRecipeBuilder(VanillaResults.LEAVES,
                SizedIngredient.of(ItemTags.LEAVES, 1))
                .unlockedBy("has_item", has(Items.OAK_LEAVES.asItem()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "worktable/vanilla/leaves"));

        //Vanilla To Caveopolis - Sapling
        WorktableRecipeBuilder.worktableRecipeBuilder(VanillaResults.SAPLING,
                SizedIngredient.of(ItemTags.SAPLINGS, 1))
                .unlockedBy("has_item", has(Items.OAK_SAPLING.asItem()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "worktable/vanilla/sapling"));

        //Vanilla To Caveopolis - Logs
        WorktableRecipeBuilder.worktableRecipeBuilder(VanillaResults.LOGS,
                SizedIngredient.of(ItemTags.LOGS, 1))
                .unlockedBy("has_item", has(Items.OAK_LOG.asItem()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "worktable/vanilla/logs"));

        //Vanilla To Caveopolis - Stone Bricks
        WorktableRecipeBuilder.worktableRecipeBuilder(VanillaResults.STONE_BRICKS,
                SizedIngredient.of(Items.STONE_BRICKS.asItem(), 1))
                .unlockedBy("has_item", has(Items.STONE_BRICKS.asItem()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "worktable/vanilla/stone_bricks"));

        //Vanilla To Caveopolis - Bricks
        WorktableRecipeBuilder.worktableRecipeBuilder(VanillaResults.BRICKS,
                SizedIngredient.of(Items.BRICKS.asItem(), 1))
                .unlockedBy("has_item", has(Items.BRICKS.asItem()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "worktable/vanilla/bricks"));

        //Vanilla To Caveopolis - Planks
        WorktableRecipeBuilder.worktableRecipeBuilder(VanillaResults.PLANKS,
                SizedIngredient.of(ItemTags.PLANKS, 1))
                .unlockedBy("has_item", has(Items.OAK_PLANKS.asItem()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "worktable/vanilla/planks"));

        //Caveopolis To Caveopolis - Colored Bamboo
        WorktableRecipeBuilder.worktableRecipeBuilder(VanillaResults.COLORED_BAMBOO,
                        SizedIngredient.of(CaveopolisItems.COLORED_BAMBOO_BLOCK, 1))
                .unlockedBy("has_item", has(CaveopolisItems.COLORED_BAMBOO_BLOCK.asItem()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "worktable/caveopolis/bamboo"));


        //Colored Bamboo
        createWorktableColoringRecipe(consumer, "blue", ColoredBambooResults.BLUE_BAMBOO, CaveopolisItems.COLORED_BAMBOO_PLANKS.get(), "colored_bamboo");
        createWorktableColoringRecipe(consumer, "red", ColoredBambooResults.RED_BAMBOO, CaveopolisItems.COLORED_BAMBOO_PLANKS.get(), "colored_bamboo");
        createWorktableColoringRecipe(consumer, "yellow", ColoredBambooResults.YELLOW_BAMBOO, CaveopolisItems.COLORED_BAMBOO_PLANKS.get(), "colored_bamboo");
        createWorktableColoringRecipe(consumer, "green", ColoredBambooResults.GREEN_BAMBOO, CaveopolisItems.COLORED_BAMBOO_PLANKS.get(), "colored_bamboo");
        createWorktableColoringRecipe(consumer, "orange", ColoredBambooResults.ORANGE_BAMBOO, CaveopolisItems.COLORED_BAMBOO_PLANKS.get(), "colored_bamboo");
        createWorktableColoringRecipe(consumer, "purple", ColoredBambooResults.PURPLE_BAMBOO, CaveopolisItems.COLORED_BAMBOO_PLANKS.get(), "colored_bamboo");
        createWorktableColoringRecipe(consumer, "pink", ColoredBambooResults.PINK_BAMBOO, CaveopolisItems.COLORED_BAMBOO_PLANKS.get(), "colored_bamboo");
        createWorktableColoringRecipe(consumer, "cyan", ColoredBambooResults.CYAN_BAMBOO, CaveopolisItems.COLORED_BAMBOO_PLANKS.get(), "colored_bamboo");
        createWorktableColoringRecipe(consumer, "black", ColoredBambooResults.BLACK_BAMBOO, CaveopolisItems.COLORED_BAMBOO_PLANKS.get(), "colored_bamboo");
        createWorktableColoringRecipe(consumer, "white", ColoredBambooResults.WHITE_BAMBOO, CaveopolisItems.COLORED_BAMBOO_PLANKS.get(), "colored_bamboo");
        createWorktableColoringRecipe(consumer, "light_gray", ColoredBambooResults.LIGHT_GRAY_BAMBOO, CaveopolisItems.COLORED_BAMBOO_PLANKS.get(), "colored_bamboo");
        createWorktableColoringRecipe(consumer, "gray", ColoredBambooResults.GRAY_BAMBOO, CaveopolisItems.COLORED_BAMBOO_PLANKS.get(), "colored_bamboo");
        createWorktableColoringRecipe(consumer, "light_blue", ColoredBambooResults.LIGHT_BLUE_BAMBOO, CaveopolisItems.COLORED_BAMBOO_PLANKS.get(), "colored_bamboo");
        createWorktableColoringRecipe(consumer, "magenta", ColoredBambooResults.MAGENTA_BAMBOO, CaveopolisItems.COLORED_BAMBOO_PLANKS.get(), "colored_bamboo");
        createWorktableColoringRecipe(consumer, "brown", ColoredBambooResults.BROWN_BAMBOO, CaveopolisItems.COLORED_BAMBOO_PLANKS.get(), "colored_bamboo");
        createWorktableColoringRecipe(consumer, "lime", ColoredBambooResults.LIME_BAMBOO, CaveopolisItems.COLORED_BAMBOO_PLANKS.get(), "colored_bamboo");

        //Colored Bamboo Mosaic
        createWorktableColoringRecipe(consumer, "blue", ColoredBambooMosaicResults.BLUE_BAMBOO_MOSAIC, CaveopolisItems.COLORED_BAMBOO_MOSAIC.get(), "colored_bamboo_mosaic");
        createWorktableColoringRecipe(consumer, "red", ColoredBambooMosaicResults.RED_BAMBOO_MOSAIC, CaveopolisItems.COLORED_BAMBOO_MOSAIC.get(), "colored_bamboo_mosaic");
        createWorktableColoringRecipe(consumer, "yellow", ColoredBambooMosaicResults.YELLOW_BAMBOO_MOSAIC, CaveopolisItems.COLORED_BAMBOO_MOSAIC.get(), "colored_bamboo_mosaic");
        createWorktableColoringRecipe(consumer, "green", ColoredBambooMosaicResults.GREEN_BAMBOO_MOSAIC, CaveopolisItems.COLORED_BAMBOO_MOSAIC.get(), "colored_bamboo_mosaic");
        createWorktableColoringRecipe(consumer, "orange", ColoredBambooMosaicResults.ORANGE_BAMBOO_MOSAIC, CaveopolisItems.COLORED_BAMBOO_MOSAIC.get(), "colored_bamboo_mosaic");
        createWorktableColoringRecipe(consumer, "purple", ColoredBambooMosaicResults.PURPLE_BAMBOO_MOSAIC, CaveopolisItems.COLORED_BAMBOO_MOSAIC.get(), "colored_bamboo_mosaic");
        createWorktableColoringRecipe(consumer, "pink", ColoredBambooMosaicResults.PINK_BAMBOO_MOSAIC, CaveopolisItems.COLORED_BAMBOO_MOSAIC.get(), "colored_bamboo_mosaic");
        createWorktableColoringRecipe(consumer, "cyan", ColoredBambooMosaicResults.CYAN_BAMBOO_MOSAIC, CaveopolisItems.COLORED_BAMBOO_MOSAIC.get(), "colored_bamboo_mosaic");
        createWorktableColoringRecipe(consumer, "black", ColoredBambooMosaicResults.BLACK_BAMBOO_MOSAIC, CaveopolisItems.COLORED_BAMBOO_MOSAIC.get(), "colored_bamboo_mosaic");
        createWorktableColoringRecipe(consumer, "white", ColoredBambooMosaicResults.WHITE_BAMBOO_MOSAIC, CaveopolisItems.COLORED_BAMBOO_MOSAIC.get(), "colored_bamboo_mosaic");
        createWorktableColoringRecipe(consumer, "light_gray", ColoredBambooMosaicResults.LIGHT_GRAY_BAMBOO_MOSAIC, CaveopolisItems.COLORED_BAMBOO_MOSAIC.get(), "colored_bamboo_mosaic");
        createWorktableColoringRecipe(consumer, "gray", ColoredBambooMosaicResults.GRAY_BAMBOO_MOSAIC, CaveopolisItems.COLORED_BAMBOO_MOSAIC.get(), "colored_bamboo_mosaic");
        createWorktableColoringRecipe(consumer, "light_blue", ColoredBambooMosaicResults.LIGHT_BLUE_BAMBOO_MOSAIC, CaveopolisItems.COLORED_BAMBOO_MOSAIC.get(), "colored_bamboo_mosaic");
        createWorktableColoringRecipe(consumer, "magenta", ColoredBambooMosaicResults.MAGENTA_BAMBOO_MOSAIC, CaveopolisItems.COLORED_BAMBOO_MOSAIC.get(), "colored_bamboo_mosaic");
        createWorktableColoringRecipe(consumer, "brown", ColoredBambooMosaicResults.BROWN_BAMBOO_MOSAIC, CaveopolisItems.COLORED_BAMBOO_MOSAIC.get(), "colored_bamboo_mosaic");
        createWorktableColoringRecipe(consumer, "lime", ColoredBambooMosaicResults.LIME_BAMBOO_MOSAIC, CaveopolisItems.COLORED_BAMBOO_MOSAIC.get(), "colored_bamboo_mosaic");


        //Colored Cracked Stone Bricks
        createWorktableColoringRecipe(consumer, "blue", ColoredCrackedStoneBricksResults.BLUE_CRACKED_STONE_BRICKS, CaveopolisItems.COLORED_CRACKED_STONE_BRICKS.get(), "colored_cracked_stone_bricks");
        createWorktableColoringRecipe(consumer, "red", ColoredCrackedStoneBricksResults.RED_CRACKED_STONE_BRICKS, CaveopolisItems.COLORED_CRACKED_STONE_BRICKS.get(), "colored_cracked_stone_bricks");
        createWorktableColoringRecipe(consumer, "yellow", ColoredCrackedStoneBricksResults.YELLOW_CRACKED_STONE_BRICKS, CaveopolisItems.COLORED_CRACKED_STONE_BRICKS.get(), "colored_cracked_stone_bricks");
        createWorktableColoringRecipe(consumer, "green", ColoredCrackedStoneBricksResults.GREEN_CRACKED_STONE_BRICKS, CaveopolisItems.COLORED_CRACKED_STONE_BRICKS.get(), "colored_cracked_stone_bricks");
        createWorktableColoringRecipe(consumer, "orange", ColoredCrackedStoneBricksResults.ORANGE_CRACKED_STONE_BRICKS, CaveopolisItems.COLORED_CRACKED_STONE_BRICKS.get(), "colored_cracked_stone_bricks");
        createWorktableColoringRecipe(consumer, "purple", ColoredCrackedStoneBricksResults.PURPLE_CRACKED_STONE_BRICKS, CaveopolisItems.COLORED_CRACKED_STONE_BRICKS.get(), "colored_cracked_stone_bricks");
        createWorktableColoringRecipe(consumer, "pink", ColoredCrackedStoneBricksResults.PINK_CRACKED_STONE_BRICKS, CaveopolisItems.COLORED_CRACKED_STONE_BRICKS.get(), "colored_cracked_stone_bricks");
        createWorktableColoringRecipe(consumer, "cyan", ColoredCrackedStoneBricksResults.CYAN_CRACKED_STONE_BRICKS, CaveopolisItems.COLORED_CRACKED_STONE_BRICKS.get(), "colored_cracked_stone_bricks");
        createWorktableColoringRecipe(consumer, "black", ColoredCrackedStoneBricksResults.BLACK_CRACKED_STONE_BRICKS, CaveopolisItems.COLORED_CRACKED_STONE_BRICKS.get(), "colored_cracked_stone_bricks");
        createWorktableColoringRecipe(consumer, "white", ColoredCrackedStoneBricksResults.WHITE_CRACKED_STONE_BRICKS, CaveopolisItems.COLORED_CRACKED_STONE_BRICKS.get(), "colored_cracked_stone_bricks");
        createWorktableColoringRecipe(consumer, "light_gray", ColoredCrackedStoneBricksResults.LIGHT_GRAY_CRACKED_STONE_BRICKS, CaveopolisItems.COLORED_CRACKED_STONE_BRICKS.get(), "colored_cracked_stone_bricks");
        createWorktableColoringRecipe(consumer, "gray", ColoredCrackedStoneBricksResults.GRAY_CRACKED_STONE_BRICKS, CaveopolisItems.COLORED_CRACKED_STONE_BRICKS.get(), "colored_cracked_stone_bricks");
        createWorktableColoringRecipe(consumer, "light_blue", ColoredCrackedStoneBricksResults.LIGHT_BLUE_CRACKED_STONE_BRICKS, CaveopolisItems.COLORED_CRACKED_STONE_BRICKS.get(), "colored_cracked_stone_bricks");
        createWorktableColoringRecipe(consumer, "magenta", ColoredCrackedStoneBricksResults.MAGENTA_CRACKED_STONE_BRICKS, CaveopolisItems.COLORED_CRACKED_STONE_BRICKS.get(), "colored_cracked_stone_bricks");
        createWorktableColoringRecipe(consumer, "brown", ColoredCrackedStoneBricksResults.BROWN_CRACKED_STONE_BRICKS, CaveopolisItems.COLORED_CRACKED_STONE_BRICKS.get(), "colored_cracked_stone_bricks");
        createWorktableColoringRecipe(consumer, "lime", ColoredCrackedStoneBricksResults.LIME_CRACKED_STONE_BRICKS, CaveopolisItems.COLORED_CRACKED_STONE_BRICKS.get(), "colored_cracked_stone_bricks");

        //Colored Prismarine
        createWorktableColoringRecipe(consumer, "blue", ColoredPrismarineResults.BLUE_PRISMARINE, CaveopolisItems.COLORED_PRISMARINE.get(), "colored_prismarine");
        createWorktableColoringRecipe(consumer, "red", ColoredPrismarineResults.RED_PRISMARINE, CaveopolisItems.COLORED_PRISMARINE.get(), "colored_prismarine");
        createWorktableColoringRecipe(consumer, "yellow", ColoredPrismarineResults.YELLOW_PRISMARINE, CaveopolisItems.COLORED_PRISMARINE.get(), "colored_prismarine");
        createWorktableColoringRecipe(consumer, "green", ColoredPrismarineResults.GREEN_PRISMARINE, CaveopolisItems.COLORED_PRISMARINE.get(), "colored_prismarine");
        createWorktableColoringRecipe(consumer, "orange", ColoredPrismarineResults.ORANGE_PRISMARINE, CaveopolisItems.COLORED_PRISMARINE.get(), "colored_prismarine");
        createWorktableColoringRecipe(consumer, "purple", ColoredPrismarineResults.PURPLE_PRISMARINE, CaveopolisItems.COLORED_PRISMARINE.get(), "colored_prismarine");
        createWorktableColoringRecipe(consumer, "pink", ColoredPrismarineResults.PINK_PRISMARINE, CaveopolisItems.COLORED_PRISMARINE.get(), "colored_prismarine");
        createWorktableColoringRecipe(consumer, "cyan", ColoredPrismarineResults.CYAN_PRISMARINE, CaveopolisItems.COLORED_PRISMARINE.get(), "colored_prismarine");
        createWorktableColoringRecipe(consumer, "black", ColoredPrismarineResults.BLACK_PRISMARINE, CaveopolisItems.COLORED_PRISMARINE.get(), "colored_prismarine");
        createWorktableColoringRecipe(consumer, "white", ColoredPrismarineResults.WHITE_PRISMARINE, CaveopolisItems.COLORED_PRISMARINE.get(), "colored_prismarine");
        createWorktableColoringRecipe(consumer, "light_gray", ColoredPrismarineResults.LIGHT_GRAY_PRISMARINE, CaveopolisItems.COLORED_PRISMARINE.get(), "colored_prismarine");
        createWorktableColoringRecipe(consumer, "gray", ColoredPrismarineResults.GRAY_PRISMARINE, CaveopolisItems.COLORED_PRISMARINE.get(), "colored_prismarine");
        createWorktableColoringRecipe(consumer, "light_blue", ColoredPrismarineResults.LIGHT_BLUE_PRISMARINE, CaveopolisItems.COLORED_PRISMARINE.get(), "colored_prismarine");
        createWorktableColoringRecipe(consumer, "magenta", ColoredPrismarineResults.MAGENTA_PRISMARINE, CaveopolisItems.COLORED_PRISMARINE.get(), "colored_prismarine");
        createWorktableColoringRecipe(consumer, "brown", ColoredPrismarineResults.BROWN_PRISMARINE, CaveopolisItems.COLORED_PRISMARINE.get(), "colored_prismarine");
        createWorktableColoringRecipe(consumer, "lime", ColoredPrismarineResults.LIME_PRISMARINE, CaveopolisItems.COLORED_PRISMARINE.get(), "colored_prismarine");

        //Colored Prismarine Bricks
        createWorktableColoringRecipe(consumer, "blue", ColoredPrismarineBricksResults.BLUE_PRISMARINE_BRICKS, CaveopolisItems.COLORED_PRISMARINE_BRICKS.get(), "colored_prismarine_bricks");
        createWorktableColoringRecipe(consumer, "red", ColoredPrismarineBricksResults.RED_PRISMARINE_BRICKS, CaveopolisItems.COLORED_PRISMARINE_BRICKS.get(), "colored_prismarine_bricks");
        createWorktableColoringRecipe(consumer, "yellow", ColoredPrismarineBricksResults.YELLOW_PRISMARINE_BRICKS, CaveopolisItems.COLORED_PRISMARINE_BRICKS.get(), "colored_prismarine_bricks");
        createWorktableColoringRecipe(consumer, "green", ColoredPrismarineBricksResults.GREEN_PRISMARINE_BRICKS, CaveopolisItems.COLORED_PRISMARINE_BRICKS.get(), "colored_prismarine_bricks");
        createWorktableColoringRecipe(consumer, "orange", ColoredPrismarineBricksResults.ORANGE_PRISMARINE_BRICKS, CaveopolisItems.COLORED_PRISMARINE_BRICKS.get(), "colored_prismarine_bricks");
        createWorktableColoringRecipe(consumer, "purple", ColoredPrismarineBricksResults.PURPLE_PRISMARINE_BRICKS, CaveopolisItems.COLORED_PRISMARINE_BRICKS.get(), "colored_prismarine_bricks");
        createWorktableColoringRecipe(consumer, "pink", ColoredPrismarineBricksResults.PINK_PRISMARINE_BRICKS, CaveopolisItems.COLORED_PRISMARINE_BRICKS.get(), "colored_prismarine_bricks");
        createWorktableColoringRecipe(consumer, "cyan", ColoredPrismarineBricksResults.CYAN_PRISMARINE_BRICKS, CaveopolisItems.COLORED_PRISMARINE_BRICKS.get(), "colored_prismarine_bricks");
        createWorktableColoringRecipe(consumer, "black", ColoredPrismarineBricksResults.BLACK_PRISMARINE_BRICKS, CaveopolisItems.COLORED_PRISMARINE_BRICKS.get(), "colored_prismarine_bricks");
        createWorktableColoringRecipe(consumer, "white", ColoredPrismarineBricksResults.WHITE_PRISMARINE_BRICKS, CaveopolisItems.COLORED_PRISMARINE_BRICKS.get(), "colored_prismarine_bricks");
        createWorktableColoringRecipe(consumer, "light_gray", ColoredPrismarineBricksResults.LIGHT_GRAY_PRISMARINE_BRICKS, CaveopolisItems.COLORED_PRISMARINE_BRICKS.get(), "colored_prismarine_bricks");
        createWorktableColoringRecipe(consumer, "gray", ColoredPrismarineBricksResults.GRAY_PRISMARINE_BRICKS, CaveopolisItems.COLORED_PRISMARINE_BRICKS.get(), "colored_prismarine_bricks");
        createWorktableColoringRecipe(consumer, "light_blue", ColoredPrismarineBricksResults.LIGHT_BLUE_PRISMARINE_BRICKS, CaveopolisItems.COLORED_PRISMARINE_BRICKS.get(), "colored_prismarine_bricks");
        createWorktableColoringRecipe(consumer, "magenta", ColoredPrismarineBricksResults.MAGENTA_PRISMARINE_BRICKS, CaveopolisItems.COLORED_PRISMARINE_BRICKS.get(), "colored_prismarine_bricks");
        createWorktableColoringRecipe(consumer, "brown", ColoredPrismarineBricksResults.BROWN_PRISMARINE_BRICKS, CaveopolisItems.COLORED_PRISMARINE_BRICKS.get(), "colored_prismarine_bricks");
        createWorktableColoringRecipe(consumer, "lime", ColoredPrismarineBricksResults.LIME_PRISMARINE_BRICKS, CaveopolisItems.COLORED_PRISMARINE_BRICKS.get(), "colored_prismarine_bricks");

        //Colored Dark Prismarine
        createWorktableColoringRecipe(consumer, "blue", ColoredDarkPrismarineResults.BLUE_DARK_PRISMARINE, CaveopolisItems.COLORED_DARK_PRISMARINE.get(), "colored_dark_prismarine");
        createWorktableColoringRecipe(consumer, "red", ColoredDarkPrismarineResults.RED_DARK_PRISMARINE, CaveopolisItems.COLORED_DARK_PRISMARINE.get(), "colored_dark_prismarine");
        createWorktableColoringRecipe(consumer, "yellow", ColoredDarkPrismarineResults.YELLOW_DARK_PRISMARINE, CaveopolisItems.COLORED_DARK_PRISMARINE.get(), "colored_dark_prismarine");
        createWorktableColoringRecipe(consumer, "green", ColoredDarkPrismarineResults.GREEN_DARK_PRISMARINE, CaveopolisItems.COLORED_DARK_PRISMARINE.get(), "colored_dark_prismarine");
        createWorktableColoringRecipe(consumer, "orange", ColoredDarkPrismarineResults.ORANGE_DARK_PRISMARINE, CaveopolisItems.COLORED_DARK_PRISMARINE.get(), "colored_dark_prismarine");
        createWorktableColoringRecipe(consumer, "purple", ColoredDarkPrismarineResults.PURPLE_DARK_PRISMARINE, CaveopolisItems.COLORED_DARK_PRISMARINE.get(), "colored_dark_prismarine");
        createWorktableColoringRecipe(consumer, "pink", ColoredDarkPrismarineResults.PINK_DARK_PRISMARINE, CaveopolisItems.COLORED_DARK_PRISMARINE.get(), "colored_dark_prismarine");
        createWorktableColoringRecipe(consumer, "cyan", ColoredDarkPrismarineResults.CYAN_DARK_PRISMARINE, CaveopolisItems.COLORED_DARK_PRISMARINE.get(), "colored_dark_prismarine");
        createWorktableColoringRecipe(consumer, "black", ColoredDarkPrismarineResults.BLACK_DARK_PRISMARINE, CaveopolisItems.COLORED_DARK_PRISMARINE.get(), "colored_dark_prismarine");
        createWorktableColoringRecipe(consumer, "white", ColoredDarkPrismarineResults.WHITE_DARK_PRISMARINE, CaveopolisItems.COLORED_DARK_PRISMARINE.get(), "colored_dark_prismarine");
        createWorktableColoringRecipe(consumer, "light_gray", ColoredDarkPrismarineResults.LIGHT_GRAY_DARK_PRISMARINE, CaveopolisItems.COLORED_DARK_PRISMARINE.get(), "colored_dark_prismarine");
        createWorktableColoringRecipe(consumer, "gray", ColoredDarkPrismarineResults.GRAY_DARK_PRISMARINE, CaveopolisItems.COLORED_DARK_PRISMARINE.get(), "colored_dark_prismarine");
        createWorktableColoringRecipe(consumer, "light_blue", ColoredDarkPrismarineResults.LIGHT_BLUE_DARK_PRISMARINE, CaveopolisItems.COLORED_DARK_PRISMARINE.get(), "colored_dark_prismarine");
        createWorktableColoringRecipe(consumer, "magenta", ColoredDarkPrismarineResults.MAGENTA_DARK_PRISMARINE, CaveopolisItems.COLORED_DARK_PRISMARINE.get(), "colored_dark_prismarine");
        createWorktableColoringRecipe(consumer, "brown", ColoredDarkPrismarineResults.BROWN_DARK_PRISMARINE, CaveopolisItems.COLORED_DARK_PRISMARINE.get(), "colored_dark_prismarine");
        createWorktableColoringRecipe(consumer, "lime", ColoredDarkPrismarineResults.LIME_DARK_PRISMARINE, CaveopolisItems.COLORED_DARK_PRISMARINE.get(), "colored_dark_prismarine");

        //Colored Tile
        createWorktableColoringRecipe(consumer, "blue", ColoredTileResults.BLUE_TILE, CaveopolisItems.COLORED_TILE.get(), "colored_tile");
        createWorktableColoringRecipe(consumer, "red", ColoredTileResults.RED_TILE, CaveopolisItems.COLORED_TILE.get(), "colored_tile");
        createWorktableColoringRecipe(consumer, "yellow", ColoredTileResults.YELLOW_TILE, CaveopolisItems.COLORED_TILE.get(), "colored_tile");
        createWorktableColoringRecipe(consumer, "green", ColoredTileResults.GREEN_TILE, CaveopolisItems.COLORED_TILE.get(), "colored_tile");
        createWorktableColoringRecipe(consumer, "orange", ColoredTileResults.ORANGE_TILE, CaveopolisItems.COLORED_TILE.get(), "colored_tile");
        createWorktableColoringRecipe(consumer, "purple", ColoredTileResults.PURPLE_TILE, CaveopolisItems.COLORED_TILE.get(), "colored_tile");
        createWorktableColoringRecipe(consumer, "pink", ColoredTileResults.PINK_TILE, CaveopolisItems.COLORED_TILE.get(), "colored_tile");
        createWorktableColoringRecipe(consumer, "cyan", ColoredTileResults.CYAN_TILE, CaveopolisItems.COLORED_TILE.get(), "colored_tile");
        createWorktableColoringRecipe(consumer, "black", ColoredTileResults.BLACK_TILE, CaveopolisItems.COLORED_TILE.get(), "colored_tile");
        createWorktableColoringRecipe(consumer, "white", ColoredTileResults.WHITE_TILE, CaveopolisItems.COLORED_TILE.get(), "colored_tile");
        createWorktableColoringRecipe(consumer, "light_gray", ColoredTileResults.LIGHT_GRAY_TILE, CaveopolisItems.COLORED_TILE.get(), "colored_tile");
        createWorktableColoringRecipe(consumer, "gray", ColoredTileResults.GRAY_TILE, CaveopolisItems.COLORED_TILE.get(), "colored_tile");
        createWorktableColoringRecipe(consumer, "light_blue", ColoredTileResults.LIGHT_BLUE_TILE, CaveopolisItems.COLORED_TILE.get(), "colored_tile");
        createWorktableColoringRecipe(consumer, "magenta", ColoredTileResults.MAGENTA_TILE, CaveopolisItems.COLORED_TILE.get(), "colored_tile");
        createWorktableColoringRecipe(consumer, "brown", ColoredTileResults.BROWN_TILE, CaveopolisItems.COLORED_TILE.get(), "colored_tile");
        createWorktableColoringRecipe(consumer, "lime", ColoredTileResults.LIME_TILE, CaveopolisItems.COLORED_TILE.get(), "colored_tile");


        //Colored Stone
        createWorktableColoringRecipe(consumer, "blue", ColoredStoneResults.BLUE_STONE, CaveopolisItems.COLORED_STONE.get(), "colored_stone");
        createWorktableColoringRecipe(consumer, "red", ColoredStoneResults.RED_STONE, CaveopolisItems.COLORED_STONE.get(), "colored_stone");
        createWorktableColoringRecipe(consumer, "yellow", ColoredStoneResults.YELLOW_STONE, CaveopolisItems.COLORED_STONE.get(), "colored_stone");
        createWorktableColoringRecipe(consumer, "green", ColoredStoneResults.GREEN_STONE, CaveopolisItems.COLORED_STONE.get(), "colored_stone");
        createWorktableColoringRecipe(consumer, "orange", ColoredStoneResults.ORANGE_STONE, CaveopolisItems.COLORED_STONE.get(), "colored_stone");
        createWorktableColoringRecipe(consumer, "purple", ColoredStoneResults.PURPLE_STONE, CaveopolisItems.COLORED_STONE.get(), "colored_stone");
        createWorktableColoringRecipe(consumer, "pink", ColoredStoneResults.PINK_STONE, CaveopolisItems.COLORED_STONE.get(), "colored_stone");
        createWorktableColoringRecipe(consumer, "cyan", ColoredStoneResults.CYAN_STONE, CaveopolisItems.COLORED_STONE.get(), "colored_stone");
        createWorktableColoringRecipe(consumer, "black", ColoredStoneResults.BLACK_STONE, CaveopolisItems.COLORED_STONE.get(), "colored_stone");
        createWorktableColoringRecipe(consumer, "white", ColoredStoneResults.WHITE_STONE, CaveopolisItems.COLORED_STONE.get(), "colored_stone");
        createWorktableColoringRecipe(consumer, "light_gray", ColoredStoneResults.LIGHT_GRAY_STONE, CaveopolisItems.COLORED_STONE.get(), "colored_stone");
        createWorktableColoringRecipe(consumer, "gray", ColoredStoneResults.GRAY_STONE, CaveopolisItems.COLORED_STONE.get(), "colored_stone");
        createWorktableColoringRecipe(consumer, "light_blue", ColoredStoneResults.LIGHT_BLUE_STONE, CaveopolisItems.COLORED_STONE.get(), "colored_stone");
        createWorktableColoringRecipe(consumer, "magenta", ColoredStoneResults.MAGENTA_STONE, CaveopolisItems.COLORED_STONE.get(), "colored_stone");
        createWorktableColoringRecipe(consumer, "brown", ColoredStoneResults.BROWN_STONE, CaveopolisItems.COLORED_STONE.get(), "colored_stone");
        createWorktableColoringRecipe(consumer, "lime", ColoredStoneResults.LIME_STONE, CaveopolisItems.COLORED_STONE.get(), "colored_stone");

        //Colored Braid
        createWorktableColoringRecipe(consumer, "blue", ColoredBraidResults.BLUE_BRAID, CaveopolisItems.COLORED_BRAID.get(), "colored_braid");
        createWorktableColoringRecipe(consumer, "red", ColoredBraidResults.RED_BRAID, CaveopolisItems.COLORED_BRAID.get(), "colored_braid");
        createWorktableColoringRecipe(consumer, "yellow", ColoredBraidResults.YELLOW_BRAID, CaveopolisItems.COLORED_BRAID.get(), "colored_braid");
        createWorktableColoringRecipe(consumer, "green", ColoredBraidResults.GREEN_BRAID, CaveopolisItems.COLORED_BRAID.get(), "colored_braid");
        createWorktableColoringRecipe(consumer, "orange", ColoredBraidResults.ORANGE_BRAID, CaveopolisItems.COLORED_BRAID.get(), "colored_braid");
        createWorktableColoringRecipe(consumer, "purple", ColoredBraidResults.PURPLE_BRAID, CaveopolisItems.COLORED_BRAID.get(), "colored_braid");
        createWorktableColoringRecipe(consumer, "pink", ColoredBraidResults.PINK_BRAID, CaveopolisItems.COLORED_BRAID.get(), "colored_braid");
        createWorktableColoringRecipe(consumer, "cyan", ColoredBraidResults.CYAN_BRAID, CaveopolisItems.COLORED_BRAID.get(), "colored_braid");
        createWorktableColoringRecipe(consumer, "black", ColoredBraidResults.BLACK_BRAID, CaveopolisItems.COLORED_BRAID.get(), "colored_braid");
        createWorktableColoringRecipe(consumer, "white", ColoredBraidResults.WHITE_BRAID, CaveopolisItems.COLORED_BRAID.get(), "colored_braid");
        createWorktableColoringRecipe(consumer, "light_gray", ColoredBraidResults.LIGHT_GRAY_BRAID, CaveopolisItems.COLORED_BRAID.get(), "colored_braid");
        createWorktableColoringRecipe(consumer, "gray", ColoredBraidResults.GRAY_BRAID, CaveopolisItems.COLORED_BRAID.get(), "colored_braid");
        createWorktableColoringRecipe(consumer, "light_blue", ColoredBraidResults.LIGHT_BLUE_BRAID, CaveopolisItems.COLORED_BRAID.get(), "colored_braid");
        createWorktableColoringRecipe(consumer, "magenta", ColoredBraidResults.MAGENTA_BRAID, CaveopolisItems.COLORED_BRAID.get(), "colored_braid");
        createWorktableColoringRecipe(consumer, "brown", ColoredBraidResults.BROWN_BRAID, CaveopolisItems.COLORED_BRAID.get(), "colored_braid");
        createWorktableColoringRecipe(consumer, "lime", ColoredBraidResults.LIME_BRAID, CaveopolisItems.COLORED_BRAID.get(), "colored_braid");

        //Colored Triple
        createWorktableColoringRecipe(consumer, "blue", ColoredTripleResults.BLUE_TRIPLE, CaveopolisItems.COLORED_TRIPLE.get(), "colored_triple");
        createWorktableColoringRecipe(consumer, "red", ColoredTripleResults.RED_TRIPLE, CaveopolisItems.COLORED_TRIPLE.get(), "colored_triple");
        createWorktableColoringRecipe(consumer, "yellow", ColoredTripleResults.YELLOW_TRIPLE, CaveopolisItems.COLORED_TRIPLE.get(), "colored_triple");
        createWorktableColoringRecipe(consumer, "green", ColoredTripleResults.GREEN_TRIPLE, CaveopolisItems.COLORED_TRIPLE.get(), "colored_triple");
        createWorktableColoringRecipe(consumer, "orange", ColoredTripleResults.ORANGE_TRIPLE, CaveopolisItems.COLORED_TRIPLE.get(), "colored_triple");
        createWorktableColoringRecipe(consumer, "purple", ColoredTripleResults.PURPLE_TRIPLE, CaveopolisItems.COLORED_TRIPLE.get(), "colored_triple");
        createWorktableColoringRecipe(consumer, "pink", ColoredTripleResults.PINK_TRIPLE, CaveopolisItems.COLORED_TRIPLE.get(), "colored_triple");
        createWorktableColoringRecipe(consumer, "cyan", ColoredTripleResults.CYAN_TRIPLE, CaveopolisItems.COLORED_TRIPLE.get(), "colored_triple");
        createWorktableColoringRecipe(consumer, "black", ColoredTripleResults.BLACK_TRIPLE, CaveopolisItems.COLORED_TRIPLE.get(), "colored_triple");
        createWorktableColoringRecipe(consumer, "white", ColoredTripleResults.WHITE_TRIPLE, CaveopolisItems.COLORED_TRIPLE.get(), "colored_triple");
        createWorktableColoringRecipe(consumer, "light_gray", ColoredTripleResults.LIGHT_GRAY_TRIPLE, CaveopolisItems.COLORED_TRIPLE.get(), "colored_triple");
        createWorktableColoringRecipe(consumer, "gray", ColoredTripleResults.GRAY_TRIPLE, CaveopolisItems.COLORED_TRIPLE.get(), "colored_triple");
        createWorktableColoringRecipe(consumer, "light_blue", ColoredTripleResults.LIGHT_BLUE_TRIPLE, CaveopolisItems.COLORED_TRIPLE.get(), "colored_triple");
        createWorktableColoringRecipe(consumer, "magenta", ColoredTripleResults.MAGENTA_TRIPLE, CaveopolisItems.COLORED_TRIPLE.get(), "colored_triple");
        createWorktableColoringRecipe(consumer, "brown", ColoredTripleResults.BROWN_TRIPLE, CaveopolisItems.COLORED_TRIPLE.get(), "colored_triple");
        createWorktableColoringRecipe(consumer, "lime", ColoredTripleResults.LIME_TRIPLE, CaveopolisItems.COLORED_TRIPLE.get(), "colored_triple");

        //Colored Encased
        createWorktableColoringRecipe(consumer, "blue", ColoredEncasedResults.BLUE_ENCASED, CaveopolisItems.COLORED_ENCASED.get(), "colored_encased");
        createWorktableColoringRecipe(consumer, "red", ColoredEncasedResults.RED_ENCASED, CaveopolisItems.COLORED_ENCASED.get(), "colored_encased");
        createWorktableColoringRecipe(consumer, "yellow", ColoredEncasedResults.YELLOW_ENCASED, CaveopolisItems.COLORED_ENCASED.get(), "colored_encased");
        createWorktableColoringRecipe(consumer, "green", ColoredEncasedResults.GREEN_ENCASED, CaveopolisItems.COLORED_ENCASED.get(), "colored_encased");
        createWorktableColoringRecipe(consumer, "orange", ColoredEncasedResults.ORANGE_ENCASED, CaveopolisItems.COLORED_ENCASED.get(), "colored_encased");
        createWorktableColoringRecipe(consumer, "purple", ColoredEncasedResults.PURPLE_ENCASED, CaveopolisItems.COLORED_ENCASED.get(), "colored_encased");
        createWorktableColoringRecipe(consumer, "pink", ColoredEncasedResults.PINK_ENCASED, CaveopolisItems.COLORED_ENCASED.get(), "colored_encased");
        createWorktableColoringRecipe(consumer, "cyan", ColoredEncasedResults.CYAN_ENCASED, CaveopolisItems.COLORED_ENCASED.get(), "colored_encased");
        createWorktableColoringRecipe(consumer, "black", ColoredEncasedResults.BLACK_ENCASED, CaveopolisItems.COLORED_ENCASED.get(), "colored_encased");
        createWorktableColoringRecipe(consumer, "white", ColoredEncasedResults.WHITE_ENCASED, CaveopolisItems.COLORED_ENCASED.get(), "colored_encased");
        createWorktableColoringRecipe(consumer, "light_gray", ColoredEncasedResults.LIGHT_GRAY_ENCASED, CaveopolisItems.COLORED_ENCASED.get(), "colored_encased");
        createWorktableColoringRecipe(consumer, "gray", ColoredEncasedResults.GRAY_ENCASED, CaveopolisItems.COLORED_ENCASED.get(), "colored_encased");
        createWorktableColoringRecipe(consumer, "light_blue", ColoredEncasedResults.LIGHT_BLUE_ENCASED, CaveopolisItems.COLORED_ENCASED.get(), "colored_encased");
        createWorktableColoringRecipe(consumer, "magenta", ColoredEncasedResults.MAGENTA_ENCASED, CaveopolisItems.COLORED_ENCASED.get(), "colored_encased");
        createWorktableColoringRecipe(consumer, "brown", ColoredEncasedResults.BROWN_ENCASED, CaveopolisItems.COLORED_ENCASED.get(), "colored_encased");
        createWorktableColoringRecipe(consumer, "lime", ColoredEncasedResults.LIME_ENCASED, CaveopolisItems.COLORED_ENCASED.get(), "colored_encased");

        //Colored Road
        createWorktableColoringRecipe(consumer, "blue", ColoredRoadResults.BLUE_ROAD, CaveopolisItems.COLORED_ROAD.get(), "colored_road");
        createWorktableColoringRecipe(consumer, "red", ColoredRoadResults.RED_ROAD, CaveopolisItems.COLORED_ROAD.get(), "colored_road");
        createWorktableColoringRecipe(consumer, "yellow", ColoredRoadResults.YELLOW_ROAD, CaveopolisItems.COLORED_ROAD.get(), "colored_road");
        createWorktableColoringRecipe(consumer, "green", ColoredRoadResults.GREEN_ROAD, CaveopolisItems.COLORED_ROAD.get(), "colored_road");
        createWorktableColoringRecipe(consumer, "orange", ColoredRoadResults.ORANGE_ROAD, CaveopolisItems.COLORED_ROAD.get(), "colored_road");
        createWorktableColoringRecipe(consumer, "purple", ColoredRoadResults.PURPLE_ROAD, CaveopolisItems.COLORED_ROAD.get(), "colored_road");
        createWorktableColoringRecipe(consumer, "pink", ColoredRoadResults.PINK_ROAD, CaveopolisItems.COLORED_ROAD.get(), "colored_road");
        createWorktableColoringRecipe(consumer, "cyan", ColoredRoadResults.CYAN_ROAD, CaveopolisItems.COLORED_ROAD.get(), "colored_road");
        createWorktableColoringRecipe(consumer, "black", ColoredRoadResults.BLACK_ROAD, CaveopolisItems.COLORED_ROAD.get(), "colored_road");
        createWorktableColoringRecipe(consumer, "white", ColoredRoadResults.WHITE_ROAD, CaveopolisItems.COLORED_ROAD.get(), "colored_road");
        createWorktableColoringRecipe(consumer, "light_gray", ColoredRoadResults.LIGHT_GRAY_ROAD, CaveopolisItems.COLORED_ROAD.get(), "colored_road");
        createWorktableColoringRecipe(consumer, "gray", ColoredRoadResults.GRAY_ROAD, CaveopolisItems.COLORED_ROAD.get(), "colored_road");
        createWorktableColoringRecipe(consumer, "light_blue", ColoredRoadResults.LIGHT_BLUE_ROAD, CaveopolisItems.COLORED_ROAD.get(), "colored_road");
        createWorktableColoringRecipe(consumer, "magenta", ColoredRoadResults.MAGENTA_ROAD, CaveopolisItems.COLORED_ROAD.get(), "colored_road");
        createWorktableColoringRecipe(consumer, "brown", ColoredRoadResults.BROWN_ROAD, CaveopolisItems.COLORED_ROAD.get(), "colored_road");
        createWorktableColoringRecipe(consumer, "lime", ColoredRoadResults.LIME_ROAD, CaveopolisItems.COLORED_ROAD.get(), "colored_road");

        //Colored Marble
        createWorktableColoringRecipe(consumer, "blue", ColoredMarbleResults.BLUE_MARBLE, CaveopolisItems.COLORED_MARBLE.get(), "colored_marble");
        createWorktableColoringRecipe(consumer, "red", ColoredMarbleResults.RED_MARBLE, CaveopolisItems.COLORED_MARBLE.get(), "colored_marble");
        createWorktableColoringRecipe(consumer, "yellow", ColoredMarbleResults.YELLOW_MARBLE, CaveopolisItems.COLORED_MARBLE.get(), "colored_marble");
        createWorktableColoringRecipe(consumer, "green", ColoredMarbleResults.GREEN_MARBLE, CaveopolisItems.COLORED_MARBLE.get(), "colored_marble");
        createWorktableColoringRecipe(consumer, "orange", ColoredMarbleResults.ORANGE_MARBLE, CaveopolisItems.COLORED_MARBLE.get(), "colored_marble");
        createWorktableColoringRecipe(consumer, "purple", ColoredMarbleResults.PURPLE_MARBLE, CaveopolisItems.COLORED_MARBLE.get(), "colored_marble");
        createWorktableColoringRecipe(consumer, "pink", ColoredMarbleResults.PINK_MARBLE, CaveopolisItems.COLORED_MARBLE.get(), "colored_marble");
        createWorktableColoringRecipe(consumer, "cyan", ColoredMarbleResults.CYAN_MARBLE, CaveopolisItems.COLORED_MARBLE.get(), "colored_marble");
        createWorktableColoringRecipe(consumer, "black", ColoredMarbleResults.BLACK_MARBLE, CaveopolisItems.COLORED_MARBLE.get(), "colored_marble");
        createWorktableColoringRecipe(consumer, "white", ColoredMarbleResults.WHITE_MARBLE, CaveopolisItems.COLORED_MARBLE.get(), "colored_marble");
        createWorktableColoringRecipe(consumer, "light_gray", ColoredMarbleResults.LIGHT_GRAY_MARBLE, CaveopolisItems.COLORED_MARBLE.get(), "colored_marble");
        createWorktableColoringRecipe(consumer, "gray", ColoredMarbleResults.GRAY_MARBLE, CaveopolisItems.COLORED_MARBLE.get(), "colored_marble");
        createWorktableColoringRecipe(consumer, "light_blue", ColoredMarbleResults.LIGHT_BLUE_MARBLE, CaveopolisItems.COLORED_MARBLE.get(), "colored_marble");
        createWorktableColoringRecipe(consumer, "magenta", ColoredMarbleResults.MAGENTA_MARBLE, CaveopolisItems.COLORED_MARBLE.get(), "colored_marble");
        createWorktableColoringRecipe(consumer, "brown", ColoredMarbleResults.BROWN_MARBLE, CaveopolisItems.COLORED_MARBLE.get(), "colored_marble");
        createWorktableColoringRecipe(consumer, "lime", ColoredMarbleResults.LIME_MARBLE, CaveopolisItems.COLORED_MARBLE.get(), "colored_marble");

        //Colored Mosaic
        createWorktableColoringRecipe(consumer, "blue", ColoredMosaicResults.BLUE_MOSAIC, CaveopolisItems.COLORED_MOSAIC.get(), "colored_mosaic");
        createWorktableColoringRecipe(consumer, "red", ColoredMosaicResults.RED_MOSAIC, CaveopolisItems.COLORED_MOSAIC.get(), "colored_mosaic");
        createWorktableColoringRecipe(consumer, "yellow", ColoredMosaicResults.YELLOW_MOSAIC, CaveopolisItems.COLORED_MOSAIC.get(), "colored_mosaic");
        createWorktableColoringRecipe(consumer, "green", ColoredMosaicResults.GREEN_MOSAIC, CaveopolisItems.COLORED_MOSAIC.get(), "colored_mosaic");
        createWorktableColoringRecipe(consumer, "orange", ColoredMosaicResults.ORANGE_MOSAIC, CaveopolisItems.COLORED_MOSAIC.get(), "colored_mosaic");
        createWorktableColoringRecipe(consumer, "purple", ColoredMosaicResults.PURPLE_MOSAIC, CaveopolisItems.COLORED_MOSAIC.get(), "colored_mosaic");
        createWorktableColoringRecipe(consumer, "pink", ColoredMosaicResults.PINK_MOSAIC, CaveopolisItems.COLORED_MOSAIC.get(), "colored_mosaic");
        createWorktableColoringRecipe(consumer, "cyan", ColoredMosaicResults.CYAN_MOSAIC, CaveopolisItems.COLORED_MOSAIC.get(), "colored_mosaic");
        createWorktableColoringRecipe(consumer, "black", ColoredMosaicResults.BLACK_MOSAIC, CaveopolisItems.COLORED_MOSAIC.get(), "colored_mosaic");
        createWorktableColoringRecipe(consumer, "white", ColoredMosaicResults.WHITE_MOSAIC, CaveopolisItems.COLORED_MOSAIC.get(), "colored_mosaic");
        createWorktableColoringRecipe(consumer, "light_gray", ColoredMosaicResults.LIGHT_GRAY_MOSAIC, CaveopolisItems.COLORED_MOSAIC.get(), "colored_mosaic");
        createWorktableColoringRecipe(consumer, "gray", ColoredMosaicResults.GRAY_MOSAIC, CaveopolisItems.COLORED_MOSAIC.get(), "colored_mosaic");
        createWorktableColoringRecipe(consumer, "light_blue", ColoredMosaicResults.LIGHT_BLUE_MOSAIC, CaveopolisItems.COLORED_MOSAIC.get(), "colored_mosaic");
        createWorktableColoringRecipe(consumer, "magenta", ColoredMosaicResults.MAGENTA_MOSAIC, CaveopolisItems.COLORED_MOSAIC.get(), "colored_mosaic");
        createWorktableColoringRecipe(consumer, "brown", ColoredMosaicResults.BROWN_MOSAIC, CaveopolisItems.COLORED_MOSAIC.get(), "colored_mosaic");
        createWorktableColoringRecipe(consumer, "lime", ColoredMosaicResults.LIME_MOSAIC, CaveopolisItems.COLORED_MOSAIC.get(), "colored_mosaic");

        //Colored Chaotic
        createWorktableColoringRecipe(consumer, "blue", ColoredChaoticResults.BLUE_CHAOTIC, CaveopolisItems.COLORED_CHAOTIC.get(), "colored_chaotic");
        createWorktableColoringRecipe(consumer, "red", ColoredChaoticResults.RED_CHAOTIC, CaveopolisItems.COLORED_CHAOTIC.get(), "colored_chaotic");
        createWorktableColoringRecipe(consumer, "yellow", ColoredChaoticResults.YELLOW_CHAOTIC, CaveopolisItems.COLORED_CHAOTIC.get(), "colored_chaotic");
        createWorktableColoringRecipe(consumer, "green", ColoredChaoticResults.GREEN_CHAOTIC, CaveopolisItems.COLORED_CHAOTIC.get(), "colored_chaotic");
        createWorktableColoringRecipe(consumer, "orange", ColoredChaoticResults.ORANGE_CHAOTIC, CaveopolisItems.COLORED_CHAOTIC.get(), "colored_chaotic");
        createWorktableColoringRecipe(consumer, "purple", ColoredChaoticResults.PURPLE_CHAOTIC, CaveopolisItems.COLORED_CHAOTIC.get(), "colored_chaotic");
        createWorktableColoringRecipe(consumer, "pink", ColoredChaoticResults.PINK_CHAOTIC, CaveopolisItems.COLORED_CHAOTIC.get(), "colored_chaotic");
        createWorktableColoringRecipe(consumer, "cyan", ColoredChaoticResults.CYAN_CHAOTIC, CaveopolisItems.COLORED_CHAOTIC.get(), "colored_chaotic");
        createWorktableColoringRecipe(consumer, "black", ColoredChaoticResults.BLACK_CHAOTIC, CaveopolisItems.COLORED_CHAOTIC.get(), "colored_chaotic");
        createWorktableColoringRecipe(consumer, "white", ColoredChaoticResults.WHITE_CHAOTIC, CaveopolisItems.COLORED_CHAOTIC.get(), "colored_chaotic");
        createWorktableColoringRecipe(consumer, "light_gray", ColoredChaoticResults.LIGHT_GRAY_CHAOTIC, CaveopolisItems.COLORED_CHAOTIC.get(), "colored_chaotic");
        createWorktableColoringRecipe(consumer, "gray", ColoredChaoticResults.GRAY_CHAOTIC, CaveopolisItems.COLORED_CHAOTIC.get(), "colored_chaotic");
        createWorktableColoringRecipe(consumer, "light_blue", ColoredChaoticResults.LIGHT_BLUE_CHAOTIC, CaveopolisItems.COLORED_CHAOTIC.get(), "colored_chaotic");
        createWorktableColoringRecipe(consumer, "magenta", ColoredChaoticResults.MAGENTA_CHAOTIC, CaveopolisItems.COLORED_CHAOTIC.get(), "colored_chaotic");
        createWorktableColoringRecipe(consumer, "brown", ColoredChaoticResults.BROWN_CHAOTIC, CaveopolisItems.COLORED_CHAOTIC.get(), "colored_chaotic");
        createWorktableColoringRecipe(consumer, "lime", ColoredChaoticResults.LIME_CHAOTIC, CaveopolisItems.COLORED_CHAOTIC.get(), "colored_chaotic");

        //Colored Marble Bricks
        createWorktableColoringRecipe(consumer, "blue", ColoredMarbleBricksResults.BLUE_MARBLE_BRICKS, CaveopolisItems.COLORED_MARBLE_BRICKS.get(), "colored_marble_bricks");
        createWorktableColoringRecipe(consumer, "red", ColoredMarbleBricksResults.RED_MARBLE_BRICKS, CaveopolisItems.COLORED_MARBLE_BRICKS.get(), "colored_marble_bricks");
        createWorktableColoringRecipe(consumer, "yellow", ColoredMarbleBricksResults.YELLOW_MARBLE_BRICKS, CaveopolisItems.COLORED_MARBLE_BRICKS.get(), "colored_marble_bricks");
        createWorktableColoringRecipe(consumer, "green", ColoredMarbleBricksResults.GREEN_MARBLE_BRICKS, CaveopolisItems.COLORED_MARBLE_BRICKS.get(), "colored_marble_bricks");
        createWorktableColoringRecipe(consumer, "orange", ColoredMarbleBricksResults.ORANGE_MARBLE_BRICKS, CaveopolisItems.COLORED_MARBLE_BRICKS.get(), "colored_marble_bricks");
        createWorktableColoringRecipe(consumer, "purple", ColoredMarbleBricksResults.PURPLE_MARBLE_BRICKS, CaveopolisItems.COLORED_MARBLE_BRICKS.get(), "colored_marble_bricks");
        createWorktableColoringRecipe(consumer, "pink", ColoredMarbleBricksResults.PINK_MARBLE_BRICKS, CaveopolisItems.COLORED_MARBLE_BRICKS.get(), "colored_marble_bricks");
        createWorktableColoringRecipe(consumer, "cyan", ColoredMarbleBricksResults.CYAN_MARBLE_BRICKS, CaveopolisItems.COLORED_MARBLE_BRICKS.get(), "colored_marble_bricks");
        createWorktableColoringRecipe(consumer, "black", ColoredMarbleBricksResults.BLACK_MARBLE_BRICKS, CaveopolisItems.COLORED_MARBLE_BRICKS.get(), "colored_marble_bricks");
        createWorktableColoringRecipe(consumer, "white", ColoredMarbleBricksResults.WHITE_MARBLE_BRICKS, CaveopolisItems.COLORED_MARBLE_BRICKS.get(), "colored_marble_bricks");
        createWorktableColoringRecipe(consumer, "light_gray", ColoredMarbleBricksResults.LIGHT_GRAY_MARBLE_BRICKS, CaveopolisItems.COLORED_MARBLE_BRICKS.get(), "colored_marble_bricks");
        createWorktableColoringRecipe(consumer, "gray", ColoredMarbleBricksResults.GRAY_MARBLE_BRICKS, CaveopolisItems.COLORED_MARBLE_BRICKS.get(), "colored_marble_bricks");
        createWorktableColoringRecipe(consumer, "light_blue", ColoredMarbleBricksResults.LIGHT_BLUE_MARBLE_BRICKS, CaveopolisItems.COLORED_MARBLE_BRICKS.get(), "colored_marble_bricks");
        createWorktableColoringRecipe(consumer, "magenta", ColoredMarbleBricksResults.MAGENTA_MARBLE_BRICKS, CaveopolisItems.COLORED_MARBLE_BRICKS.get(), "colored_marble_bricks");
        createWorktableColoringRecipe(consumer, "brown", ColoredMarbleBricksResults.BROWN_MARBLE_BRICKS, CaveopolisItems.COLORED_MARBLE_BRICKS.get(), "colored_marble_bricks");
        createWorktableColoringRecipe(consumer, "lime", ColoredMarbleBricksResults.LIME_MARBLE_BRICKS, CaveopolisItems.COLORED_MARBLE_BRICKS.get(), "colored_marble_bricks");

        //Colored Polished Stone
        createWorktableColoringRecipe(consumer, "blue", ColoredPolishedStoneResults.BLUE_POLISHED_STONE, CaveopolisItems.COLORED_POLISHED_STONE.get(), "colored_polished_stone");
        createWorktableColoringRecipe(consumer, "red", ColoredPolishedStoneResults.RED_POLISHED_STONE, CaveopolisItems.COLORED_POLISHED_STONE.get(), "colored_polished_stone");
        createWorktableColoringRecipe(consumer, "yellow", ColoredPolishedStoneResults.YELLOW_POLISHED_STONE, CaveopolisItems.COLORED_POLISHED_STONE.get(), "colored_polished_stone");
        createWorktableColoringRecipe(consumer, "green", ColoredPolishedStoneResults.GREEN_POLISHED_STONE, CaveopolisItems.COLORED_POLISHED_STONE.get(), "colored_polished_stone");
        createWorktableColoringRecipe(consumer, "orange", ColoredPolishedStoneResults.ORANGE_POLISHED_STONE, CaveopolisItems.COLORED_POLISHED_STONE.get(), "colored_polished_stone");
        createWorktableColoringRecipe(consumer, "purple", ColoredPolishedStoneResults.PURPLE_POLISHED_STONE, CaveopolisItems.COLORED_POLISHED_STONE.get(), "colored_polished_stone");
        createWorktableColoringRecipe(consumer, "pink", ColoredPolishedStoneResults.PINK_POLISHED_STONE, CaveopolisItems.COLORED_POLISHED_STONE.get(), "colored_polished_stone");
        createWorktableColoringRecipe(consumer, "cyan", ColoredPolishedStoneResults.CYAN_POLISHED_STONE, CaveopolisItems.COLORED_POLISHED_STONE.get(), "colored_polished_stone");
        createWorktableColoringRecipe(consumer, "black", ColoredPolishedStoneResults.BLACK_POLISHED_STONE, CaveopolisItems.COLORED_POLISHED_STONE.get(), "colored_polished_stone");
        createWorktableColoringRecipe(consumer, "white", ColoredPolishedStoneResults.WHITE_POLISHED_STONE, CaveopolisItems.COLORED_POLISHED_STONE.get(), "colored_polished_stone");
        createWorktableColoringRecipe(consumer, "light_gray", ColoredPolishedStoneResults.LIGHT_GRAY_POLISHED_STONE, CaveopolisItems.COLORED_POLISHED_STONE.get(), "colored_polished_stone");
        createWorktableColoringRecipe(consumer, "gray", ColoredPolishedStoneResults.GRAY_POLISHED_STONE, CaveopolisItems.COLORED_POLISHED_STONE.get(), "colored_polished_stone");
        createWorktableColoringRecipe(consumer, "light_blue", ColoredPolishedStoneResults.LIGHT_BLUE_POLISHED_STONE, CaveopolisItems.COLORED_POLISHED_STONE.get(), "colored_polished_stone");
        createWorktableColoringRecipe(consumer, "magenta", ColoredPolishedStoneResults.MAGENTA_POLISHED_STONE, CaveopolisItems.COLORED_POLISHED_STONE.get(), "colored_polished_stone");
        createWorktableColoringRecipe(consumer, "brown", ColoredPolishedStoneResults.BROWN_POLISHED_STONE, CaveopolisItems.COLORED_POLISHED_STONE.get(), "colored_polished_stone");
        createWorktableColoringRecipe(consumer, "lime", ColoredPolishedStoneResults.LIME_POLISHED_STONE, CaveopolisItems.COLORED_POLISHED_STONE.get(), "colored_polished_stone");

        //Colored Stone Bricks
        createWorktableColoringRecipe(consumer, "blue", ColoredStoneBricksResults.BLUE_STONE_BRICKS, CaveopolisItems.COLORED_STONE_BRICKS.get(), "colored_stone_bricks");
        createWorktableColoringRecipe(consumer, "red", ColoredStoneBricksResults.RED_STONE_BRICKS, CaveopolisItems.COLORED_STONE_BRICKS.get(), "colored_stone_bricks");
        createWorktableColoringRecipe(consumer, "yellow", ColoredStoneBricksResults.YELLOW_STONE_BRICKS, CaveopolisItems.COLORED_STONE_BRICKS.get(), "colored_stone_bricks");
        createWorktableColoringRecipe(consumer, "green", ColoredStoneBricksResults.GREEN_STONE_BRICKS, CaveopolisItems.COLORED_STONE_BRICKS.get(), "colored_stone_bricks");
        createWorktableColoringRecipe(consumer, "orange", ColoredStoneBricksResults.ORANGE_STONE_BRICKS, CaveopolisItems.COLORED_STONE_BRICKS.get(), "colored_stone_bricks");
        createWorktableColoringRecipe(consumer, "purple", ColoredStoneBricksResults.PURPLE_STONE_BRICKS, CaveopolisItems.COLORED_STONE_BRICKS.get(), "colored_stone_bricks");
        createWorktableColoringRecipe(consumer, "pink", ColoredStoneBricksResults.PINK_STONE_BRICKS, CaveopolisItems.COLORED_STONE_BRICKS.get(), "colored_stone_bricks");
        createWorktableColoringRecipe(consumer, "cyan", ColoredStoneBricksResults.CYAN_STONE_BRICKS, CaveopolisItems.COLORED_STONE_BRICKS.get(), "colored_stone_bricks");
        createWorktableColoringRecipe(consumer, "black", ColoredStoneBricksResults.BLACK_STONE_BRICKS, CaveopolisItems.COLORED_STONE_BRICKS.get(), "colored_stone_bricks");
        createWorktableColoringRecipe(consumer, "white", ColoredStoneBricksResults.WHITE_STONE_BRICKS, CaveopolisItems.COLORED_STONE_BRICKS.get(), "colored_stone_bricks");
        createWorktableColoringRecipe(consumer, "light_gray", ColoredStoneBricksResults.LIGHT_GRAY_STONE_BRICKS, CaveopolisItems.COLORED_STONE_BRICKS.get(), "colored_stone_bricks");
        createWorktableColoringRecipe(consumer, "gray", ColoredStoneBricksResults.GRAY_STONE_BRICKS, CaveopolisItems.COLORED_STONE_BRICKS.get(), "colored_stone_bricks");
        createWorktableColoringRecipe(consumer, "light_blue", ColoredStoneBricksResults.LIGHT_BLUE_STONE_BRICKS, CaveopolisItems.COLORED_STONE_BRICKS.get(), "colored_stone_bricks");
        createWorktableColoringRecipe(consumer, "magenta", ColoredStoneBricksResults.MAGENTA_STONE_BRICKS, CaveopolisItems.COLORED_STONE_BRICKS.get(), "colored_stone_bricks");
        createWorktableColoringRecipe(consumer, "brown", ColoredStoneBricksResults.BROWN_STONE_BRICKS, CaveopolisItems.COLORED_STONE_BRICKS.get(), "colored_stone_bricks");
        createWorktableColoringRecipe(consumer, "lime", ColoredStoneBricksResults.LIME_STONE_BRICKS, CaveopolisItems.COLORED_STONE_BRICKS.get(), "colored_stone_bricks");

        //Colored Bricks
        createWorktableColoringRecipe(consumer, "blue", ColoredBricksResults.BLUE_BRICKS, CaveopolisItems.COLORED_BRICKS.get(), "colored_bricks");
        createWorktableColoringRecipe(consumer, "red", ColoredBricksResults.RED_BRICKS, CaveopolisItems.COLORED_BRICKS.get(), "colored_bricks");
        createWorktableColoringRecipe(consumer, "yellow", ColoredBricksResults.YELLOW_BRICKS, CaveopolisItems.COLORED_BRICKS.get(), "colored_bricks");
        createWorktableColoringRecipe(consumer, "green", ColoredBricksResults.GREEN_BRICKS, CaveopolisItems.COLORED_BRICKS.get(), "colored_bricks");
        createWorktableColoringRecipe(consumer, "orange", ColoredBricksResults.ORANGE_BRICKS, CaveopolisItems.COLORED_BRICKS.get(), "colored_bricks");
        createWorktableColoringRecipe(consumer, "purple", ColoredBricksResults.PURPLE_BRICKS, CaveopolisItems.COLORED_BRICKS.get(), "colored_bricks");
        createWorktableColoringRecipe(consumer, "pink", ColoredBricksResults.PINK_BRICKS, CaveopolisItems.COLORED_BRICKS.get(), "colored_bricks");
        createWorktableColoringRecipe(consumer, "cyan", ColoredBricksResults.CYAN_BRICKS, CaveopolisItems.COLORED_BRICKS.get(), "colored_bricks");
        createWorktableColoringRecipe(consumer, "black", ColoredBricksResults.BLACK_BRICKS, CaveopolisItems.COLORED_BRICKS.get(), "colored_bricks");
        createWorktableColoringRecipe(consumer, "white", ColoredBricksResults.WHITE_BRICKS, CaveopolisItems.COLORED_BRICKS.get(), "colored_bricks");
        createWorktableColoringRecipe(consumer, "light_gray", ColoredBricksResults.LIGHT_GRAY_BRICKS, CaveopolisItems.COLORED_BRICKS.get(), "colored_bricks");
        createWorktableColoringRecipe(consumer, "gray", ColoredBricksResults.GRAY_BRICKS, CaveopolisItems.COLORED_BRICKS.get(), "colored_bricks");
        createWorktableColoringRecipe(consumer, "light_blue", ColoredBricksResults.LIGHT_BLUE_BRICKS, CaveopolisItems.COLORED_BRICKS.get(), "colored_bricks");
        createWorktableColoringRecipe(consumer, "magenta", ColoredBricksResults.MAGENTA_BRICKS, CaveopolisItems.COLORED_BRICKS.get(), "colored_bricks");
        createWorktableColoringRecipe(consumer, "brown", ColoredBricksResults.BROWN_BRICKS, CaveopolisItems.COLORED_BRICKS.get(), "colored_bricks");
        createWorktableColoringRecipe(consumer, "lime", ColoredBricksResults.LIME_BRICKS, CaveopolisItems.COLORED_BRICKS.get(), "colored_bricks");

        //Colored Cobblestone
        createWorktableColoringRecipe(consumer, "blue", ColoredCobblestoneResults.BLUE_COBBLESTONE, CaveopolisItems.COLORED_COBBLESTONE.get(), "colored_cobblestone");
        createWorktableColoringRecipe(consumer, "red", ColoredCobblestoneResults.RED_COBBLESTONE, CaveopolisItems.COLORED_COBBLESTONE.get(), "colored_cobblestone");
        createWorktableColoringRecipe(consumer, "yellow", ColoredCobblestoneResults.YELLOW_COBBLESTONE, CaveopolisItems.COLORED_COBBLESTONE.get(), "colored_cobblestone");
        createWorktableColoringRecipe(consumer, "green", ColoredCobblestoneResults.GREEN_COBBLESTONE, CaveopolisItems.COLORED_COBBLESTONE.get(), "colored_cobblestone");
        createWorktableColoringRecipe(consumer, "orange", ColoredCobblestoneResults.ORANGE_COBBLESTONE, CaveopolisItems.COLORED_COBBLESTONE.get(), "colored_cobblestone");
        createWorktableColoringRecipe(consumer, "purple", ColoredCobblestoneResults.PURPLE_COBBLESTONE, CaveopolisItems.COLORED_COBBLESTONE.get(), "colored_cobblestone");
        createWorktableColoringRecipe(consumer, "pink", ColoredCobblestoneResults.PINK_COBBLESTONE, CaveopolisItems.COLORED_COBBLESTONE.get(), "colored_cobblestone");
        createWorktableColoringRecipe(consumer, "cyan", ColoredCobblestoneResults.CYAN_COBBLESTONE, CaveopolisItems.COLORED_COBBLESTONE.get(), "colored_cobblestone");
        createWorktableColoringRecipe(consumer, "black", ColoredCobblestoneResults.BLACK_COBBLESTONE, CaveopolisItems.COLORED_COBBLESTONE.get(), "colored_cobblestone");
        createWorktableColoringRecipe(consumer, "white", ColoredCobblestoneResults.WHITE_COBBLESTONE, CaveopolisItems.COLORED_COBBLESTONE.get(), "colored_cobblestone");
        createWorktableColoringRecipe(consumer, "light_gray", ColoredCobblestoneResults.LIGHT_GRAY_COBBLESTONE, CaveopolisItems.COLORED_COBBLESTONE.get(), "colored_cobblestone");
        createWorktableColoringRecipe(consumer, "gray", ColoredCobblestoneResults.GRAY_COBBLESTONE, CaveopolisItems.COLORED_COBBLESTONE.get(), "colored_cobblestone");
        createWorktableColoringRecipe(consumer, "light_blue", ColoredCobblestoneResults.LIGHT_BLUE_COBBLESTONE, CaveopolisItems.COLORED_COBBLESTONE.get(), "colored_cobblestone");
        createWorktableColoringRecipe(consumer, "magenta", ColoredCobblestoneResults.MAGENTA_COBBLESTONE, CaveopolisItems.COLORED_COBBLESTONE.get(), "colored_cobblestone");
        createWorktableColoringRecipe(consumer, "brown", ColoredCobblestoneResults.BROWN_COBBLESTONE, CaveopolisItems.COLORED_COBBLESTONE.get(), "colored_cobblestone");
        createWorktableColoringRecipe(consumer, "lime", ColoredCobblestoneResults.LIME_COBBLESTONE, CaveopolisItems.COLORED_COBBLESTONE.get(), "colored_cobblestone");

        //Colored Cobblestone Bricks
        createWorktableColoringRecipe(consumer, "blue", ColoredCobblestoneBricksResults.BLUE_COBBLESTONE_BRICKS, CaveopolisItems.COLORED_COBBLESTONE_BRICKS.get(), "colored_cobblestone_bricks");
        createWorktableColoringRecipe(consumer, "red", ColoredCobblestoneBricksResults.RED_COBBLESTONE_BRICKS, CaveopolisItems.COLORED_COBBLESTONE_BRICKS.get(), "colored_cobblestone_bricks");
        createWorktableColoringRecipe(consumer, "yellow", ColoredCobblestoneBricksResults.YELLOW_COBBLESTONE_BRICKS, CaveopolisItems.COLORED_COBBLESTONE_BRICKS.get(), "colored_cobblestone_bricks");
        createWorktableColoringRecipe(consumer, "green", ColoredCobblestoneBricksResults.GREEN_COBBLESTONE_BRICKS, CaveopolisItems.COLORED_COBBLESTONE_BRICKS.get(), "colored_cobblestone_bricks");
        createWorktableColoringRecipe(consumer, "orange", ColoredCobblestoneBricksResults.ORANGE_COBBLESTONE_BRICKS, CaveopolisItems.COLORED_COBBLESTONE_BRICKS.get(), "colored_cobblestone_bricks");
        createWorktableColoringRecipe(consumer, "purple", ColoredCobblestoneBricksResults.PURPLE_COBBLESTONE_BRICKS, CaveopolisItems.COLORED_COBBLESTONE_BRICKS.get(), "colored_cobblestone_bricks");
        createWorktableColoringRecipe(consumer, "pink", ColoredCobblestoneBricksResults.PINK_COBBLESTONE_BRICKS, CaveopolisItems.COLORED_COBBLESTONE_BRICKS.get(), "colored_cobblestone_bricks");
        createWorktableColoringRecipe(consumer, "cyan", ColoredCobblestoneBricksResults.CYAN_COBBLESTONE_BRICKS, CaveopolisItems.COLORED_COBBLESTONE_BRICKS.get(), "colored_cobblestone_bricks");
        createWorktableColoringRecipe(consumer, "black", ColoredCobblestoneBricksResults.BLACK_COBBLESTONE_BRICKS, CaveopolisItems.COLORED_COBBLESTONE_BRICKS.get(), "colored_cobblestone_bricks");
        createWorktableColoringRecipe(consumer, "white", ColoredCobblestoneBricksResults.WHITE_COBBLESTONE_BRICKS, CaveopolisItems.COLORED_COBBLESTONE_BRICKS.get(), "colored_cobblestone_bricks");
        createWorktableColoringRecipe(consumer, "light_gray", ColoredCobblestoneBricksResults.LIGHT_GRAY_COBBLESTONE_BRICKS, CaveopolisItems.COLORED_COBBLESTONE_BRICKS.get(), "colored_cobblestone_bricks");
        createWorktableColoringRecipe(consumer, "gray", ColoredCobblestoneBricksResults.GRAY_COBBLESTONE_BRICKS, CaveopolisItems.COLORED_COBBLESTONE_BRICKS.get(), "colored_cobblestone_bricks");
        createWorktableColoringRecipe(consumer, "light_blue", ColoredCobblestoneBricksResults.LIGHT_BLUE_COBBLESTONE_BRICKS, CaveopolisItems.COLORED_COBBLESTONE_BRICKS.get(), "colored_cobblestone_bricks");
        createWorktableColoringRecipe(consumer, "magenta", ColoredCobblestoneBricksResults.MAGENTA_COBBLESTONE_BRICKS, CaveopolisItems.COLORED_COBBLESTONE_BRICKS.get(), "colored_cobblestone_bricks");
        createWorktableColoringRecipe(consumer, "brown", ColoredCobblestoneBricksResults.BROWN_COBBLESTONE_BRICKS, CaveopolisItems.COLORED_COBBLESTONE_BRICKS.get(), "colored_cobblestone_bricks");
        createWorktableColoringRecipe(consumer, "lime", ColoredCobblestoneBricksResults.LIME_COBBLESTONE_BRICKS, CaveopolisItems.COLORED_COBBLESTONE_BRICKS.get(), "colored_cobblestone_bricks");

        //Colored Planks
        createWorktableColoringRecipe(consumer, "blue", ColoredPlanksResults.BLUE_PLANKS, CaveopolisItems.COLORED_PLANKS.get(), "colored_planks");
        createWorktableColoringRecipe(consumer, "red", ColoredPlanksResults.RED_PLANKS, CaveopolisItems.COLORED_PLANKS.get(), "colored_planks");
        createWorktableColoringRecipe(consumer, "yellow", ColoredPlanksResults.YELLOW_PLANKS, CaveopolisItems.COLORED_PLANKS.get(), "colored_planks");
        createWorktableColoringRecipe(consumer, "green", ColoredPlanksResults.GREEN_PLANKS, CaveopolisItems.COLORED_PLANKS.get(), "colored_planks");
        createWorktableColoringRecipe(consumer, "orange", ColoredPlanksResults.ORANGE_PLANKS, CaveopolisItems.COLORED_PLANKS.get(), "colored_planks");
        createWorktableColoringRecipe(consumer, "purple", ColoredPlanksResults.PURPLE_PLANKS, CaveopolisItems.COLORED_PLANKS.get(), "colored_planks");
        createWorktableColoringRecipe(consumer, "pink", ColoredPlanksResults.PINK_PLANKS, CaveopolisItems.COLORED_PLANKS.get(), "colored_planks");
        createWorktableColoringRecipe(consumer, "cyan", ColoredPlanksResults.CYAN_PLANKS, CaveopolisItems.COLORED_PLANKS.get(), "colored_planks");
        createWorktableColoringRecipe(consumer, "black", ColoredPlanksResults.BLACK_PLANKS, CaveopolisItems.COLORED_PLANKS.get(), "colored_planks");
        createWorktableColoringRecipe(consumer, "white", ColoredPlanksResults.WHITE_PLANKS, CaveopolisItems.COLORED_PLANKS.get(), "colored_planks");
        createWorktableColoringRecipe(consumer, "light_gray", ColoredPlanksResults.LIGHT_GRAY_PLANKS, CaveopolisItems.COLORED_PLANKS.get(), "colored_planks");
        createWorktableColoringRecipe(consumer, "gray", ColoredPlanksResults.GRAY_PLANKS, CaveopolisItems.COLORED_PLANKS.get(), "colored_planks");
        createWorktableColoringRecipe(consumer, "light_blue", ColoredPlanksResults.LIGHT_BLUE_PLANKS, CaveopolisItems.COLORED_PLANKS.get(), "colored_planks");
        createWorktableColoringRecipe(consumer, "magenta", ColoredPlanksResults.MAGENTA_PLANKS, CaveopolisItems.COLORED_PLANKS.get(), "colored_planks");
        createWorktableColoringRecipe(consumer, "brown", ColoredPlanksResults.BROWN_PLANKS, CaveopolisItems.COLORED_PLANKS.get(), "colored_planks");
        createWorktableColoringRecipe(consumer, "lime", ColoredPlanksResults.LIME_PLANKS, CaveopolisItems.COLORED_PLANKS.get(), "colored_planks");





        //Special Recipes - Coloring
        SpecialRecipeBuilder.special(ColoringRecipe::new).save(consumer.withConditions(CraftingTableApplyColor.INSTANCE),
                ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "coloring"));

        //Special Recipes - Lighting
        SpecialRecipeBuilder.special(LightingRecipe::new).save(consumer.withConditions(CraftingTableApplyLighting.INSTANCE),
                ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "lighting"));

        //Special Recipes - Flower Dye
        SpecialRecipeBuilder.special(FlowerDyeRecipe::new).save(consumer.withConditions(ColoredFlowersToDye.INSTANCE),
                ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "flower_to_dye"));

        //Worktable

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, CaveopolisItems.WORKTABLE.get())
                .define('S', Tags.Items.RODS_WOODEN)
                .define('C', Tags.Items.PLAYER_WORKSTATIONS_CRAFTING_TABLES)
                .pattern(" CC")
                .pattern(" SC")
                .pattern("S  ")
                .unlockedBy("has_item", has(Tags.Items.PLAYER_WORKSTATIONS_CRAFTING_TABLES))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "worktable"));

        //Spray Cans

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, CaveopolisItems.BLACK_SPRAY_CAN)
                .define('I', Items.IRON_INGOT)
                .define('G', Tags.Items.DYES_BLACK)
                .pattern(" I ")
                .pattern("IGI")
                .pattern("IGI")
                .unlockedBy("has_item", has(Items.IRON_INGOT))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "spray_cans/black"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, CaveopolisItems.BLUE_SPRAY_CAN)
                .define('I', Items.IRON_INGOT)
                .define('G', Tags.Items.DYES_BLUE)
                .pattern(" I ")
                .pattern("IGI")
                .pattern("IGI")
                .unlockedBy("has_item", has(Items.IRON_INGOT))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "spray_cans/blue"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, CaveopolisItems.BROWN_SPRAY_CAN)
                .define('I', Items.IRON_INGOT)
                .define('G', Tags.Items.DYES_BROWN)
                .pattern(" I ")
                .pattern("IGI")
                .pattern("IGI")
                .unlockedBy("has_item", has(Items.IRON_INGOT))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "spray_cans/brown"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, CaveopolisItems.CYAN_SPRAY_CAN)
                .define('I', Items.IRON_INGOT)
                .define('G', Tags.Items.DYES_CYAN)
                .pattern(" I ")
                .pattern("IGI")
                .pattern("IGI")
                .unlockedBy("has_item", has(Items.IRON_INGOT))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "spray_cans/cyan"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, CaveopolisItems.GRAY_SPRAY_CAN)
                .define('I', Items.IRON_INGOT)
                .define('G', Tags.Items.DYES_GRAY)
                .pattern(" I ")
                .pattern("IGI")
                .pattern("IGI")
                .unlockedBy("has_item", has(Items.IRON_INGOT))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "spray_cans/gray"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, CaveopolisItems.GREEN_SPRAY_CAN)
                .define('I', Items.IRON_INGOT)
                .define('G', Tags.Items.DYES_GREEN)
                .pattern(" I ")
                .pattern("IGI")
                .pattern("IGI")
                .unlockedBy("has_item", has(Items.IRON_INGOT))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "spray_cans/green"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, CaveopolisItems.LIGHT_BLUE_SPRAY_CAN)
                .define('I', Items.IRON_INGOT)
                .define('G', Tags.Items.DYES_LIGHT_BLUE)
                .pattern(" I ")
                .pattern("IGI")
                .pattern("IGI")
                .unlockedBy("has_item", has(Items.IRON_INGOT))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "spray_cans/light_blue"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, CaveopolisItems.LIGHT_GRAY_SPRAY_CAN)
                .define('I', Items.IRON_INGOT)
                .define('G', Tags.Items.DYES_LIGHT_GRAY)
                .pattern(" I ")
                .pattern("IGI")
                .pattern("IGI")
                .unlockedBy("has_item", has(Items.IRON_INGOT))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "spray_cans/light_gray"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, CaveopolisItems.LIME_SPRAY_CAN)
                .define('I', Items.IRON_INGOT)
                .define('G', Tags.Items.DYES_LIME)
                .pattern(" I ")
                .pattern("IGI")
                .pattern("IGI")
                .unlockedBy("has_item", has(Items.IRON_INGOT))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "spray_cans/lime"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, CaveopolisItems.MAGENTA_SPRAY_CAN)
                .define('I', Items.IRON_INGOT)
                .define('G', Tags.Items.DYES_MAGENTA)
                .pattern(" I ")
                .pattern("IGI")
                .pattern("IGI")
                .unlockedBy("has_item", has(Items.IRON_INGOT))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "spray_cans/magenta"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, CaveopolisItems.ORANGE_SPRAY_CAN)
                .define('I', Items.IRON_INGOT)
                .define('G', Tags.Items.DYES_ORANGE)
                .pattern(" I ")
                .pattern("IGI")
                .pattern("IGI")
                .unlockedBy("has_item", has(Items.IRON_INGOT))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "spray_cans/orange"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, CaveopolisItems.PINK_SPRAY_CAN)
                .define('I', Items.IRON_INGOT)
                .define('G', Tags.Items.DYES_PINK)
                .pattern(" I ")
                .pattern("IGI")
                .pattern("IGI")
                .unlockedBy("has_item", has(Items.IRON_INGOT))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "spray_cans/pink"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, CaveopolisItems.PURPLE_SPRAY_CAN)
                .define('I', Items.IRON_INGOT)
                .define('G', Tags.Items.DYES_PURPLE)
                .pattern(" I ")
                .pattern("IGI")
                .pattern("IGI")
                .unlockedBy("has_item", has(Items.IRON_INGOT))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "spray_cans/purple"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, CaveopolisItems.RED_SPRAY_CAN)
                .define('I', Items.IRON_INGOT)
                .define('G', Tags.Items.DYES_RED)
                .pattern(" I ")
                .pattern("IGI")
                .pattern("IGI")
                .unlockedBy("has_item", has(Items.IRON_INGOT))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "spray_cans/red"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, CaveopolisItems.WHITE_SPRAY_CAN)
                .define('I', Items.IRON_INGOT)
                .define('G', Tags.Items.DYES_WHITE)
                .pattern(" I ")
                .pattern("IGI")
                .pattern("IGI")
                .unlockedBy("has_item", has(Items.IRON_INGOT))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "spray_cans/white"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, CaveopolisItems.YELLOW_SPRAY_CAN)
                .define('I', Items.IRON_INGOT)
                .define('G', Tags.Items.DYES_YELLOW)
                .pattern(" I ")
                .pattern("IGI")
                .pattern("IGI")
                .unlockedBy("has_item", has(Items.IRON_INGOT))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "spray_cans/yellow"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, CaveopolisItems.GLOWSTONE_SPRAY_CAN)
                .define('I', Items.IRON_INGOT)
                .define('G', Tags.Items.DUSTS_GLOWSTONE)
                .pattern(" I ")
                .pattern("IGI")
                .pattern("IGI")
                .unlockedBy("has_item", has(Items.IRON_INGOT))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "spray_cans/glowstone"));


        //Colored Crafting - Planks
        ColoredCraftingRecipeBuilder.shaped(RecipeCategory.MISC, CaveopolisItems.COLORED_PLANKS, 4)
                .pattern("S")
                .define('S', CaveopolisTags.Items.COLORED_LOGS)
                .unlockedBy("has_item", has(CaveopolisTags.Items.COLORED_LOGS))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "crafting/colored_planks"));

        //Colored Crafting - Bamboo Planks
        ColoredCraftingRecipeBuilder.shaped(RecipeCategory.MISC, CaveopolisItems.COLORED_BAMBOO_PLANKS, 2)
                .pattern("S")
                .define('S', CaveopolisTags.Items.COLORED_BAMBOO)
                .unlockedBy("has_item", has(CaveopolisTags.Items.COLORED_BAMBOO))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "crafting/colored_bamboo_planks"));

        //Colored Crafting - Planks
        createPlankLikeCraftingRecipes(consumer, CaveopolisItems.COLORED_PLANKS.get(), CaveopolisItems.COLORED_PLANK_STAIRS.get(), CaveopolisItems.COLORED_PLANK_SLAB.get(), CaveopolisItems.COLORED_PLANK_PRESSURE_PLATE.get(), CaveopolisItems.COLORED_PLANK_FENCE.get(), CaveopolisItems.COLORED_PLANK_FENCE_GATE.get(), CaveopolisItems.COLORED_PLANK_DOOR.get(), CaveopolisItems.COLORED_PLANK_TRAPDOOR.get(), CaveopolisItems.COLORED_PLANK_BUTTON.get());
        createPlankLikeCraftingRecipes(consumer, CaveopolisItems.COLORED_BAMBOO_PLANKS, CaveopolisItems.COLORED_BAMBOO_STAIRS, CaveopolisItems.COLORED_BAMBOO_SLAB, CaveopolisItems.COLORED_BAMBOO_PRESSURE_PLATE, CaveopolisItems.COLORED_BAMBOO_FENCE, CaveopolisItems.COLORED_BAMBOO_FENCE_GATE, CaveopolisItems.COLORED_BAMBOO_DOOR, CaveopolisItems.COLORED_BAMBOO_TRAPDOOR, CaveopolisItems.COLORED_BAMBOO_BUTTON);
        createPlankLikeCraftingRecipes(consumer, CaveopolisItems.COLORED_BAMBOO_MOSAIC, CaveopolisItems.COLORED_BAMBOO_MOSAIC_STAIRS, CaveopolisItems.COLORED_BAMBOO_MOSAIC_SLAB, CaveopolisItems.COLORED_BAMBOO_MOSAIC_PRESSURE_PLATE, CaveopolisItems.COLORED_BAMBOO_MOSAIC_FENCE, CaveopolisItems.COLORED_BAMBOO_MOSAIC_FENCE_GATE, CaveopolisItems.COLORED_BAMBOO_MOSAIC_DOOR, CaveopolisItems.COLORED_BAMBOO_MOSAIC_TRAPDOOR, CaveopolisItems.COLORED_BAMBOO_MOSAIC_BUTTON);

        //Colored Crafting - Stones
        createStoneLikeCraftingRecipes(consumer, CaveopolisItems.COLORED_STONE.get(), CaveopolisItems.COLORED_STONE_STAIRS.get(), CaveopolisItems.COLORED_STONE_SLAB.get(), CaveopolisItems.COLORED_STONE_WALL.get(), CaveopolisItems.COLORED_STONE_PRESSURE_PLATE.get(), CaveopolisItems.COLORED_STONE_BUTTON.get());
        createStoneLikeCraftingRecipes(consumer, CaveopolisItems.COLORED_COBBLESTONE.get(), CaveopolisItems.COLORED_COBBLESTONE_STAIRS.get(), CaveopolisItems.COLORED_COBBLESTONE_SLAB.get(), CaveopolisItems.COLORED_COBBLESTONE_WALL.get(), CaveopolisItems.COLORED_COBBLESTONE_PRESSURE_PLATE.get(), CaveopolisItems.COLORED_COBBLESTONE_BUTTON.get());
        createStoneLikeCraftingRecipes(consumer, CaveopolisItems.COLORED_STONE_BRICKS.get(), CaveopolisItems.COLORED_STONE_BRICK_STAIRS.get(), CaveopolisItems.COLORED_STONE_BRICK_SLAB.get(), CaveopolisItems.COLORED_STONE_BRICK_WALL.get(), CaveopolisItems.COLORED_STONE_BRICK_PRESSURE_PLATE.get(), CaveopolisItems.COLORED_STONE_BRICK_BUTTON.get());
        createStoneLikeCraftingRecipes(consumer, CaveopolisItems.COLORED_COBBLESTONE_BRICKS.get(), CaveopolisItems.COLORED_COBBLESTONE_BRICK_STAIRS.get(), CaveopolisItems.COLORED_COBBLESTONE_BRICK_SLAB.get(), CaveopolisItems.COLORED_COBBLESTONE_BRICK_WALL.get(), CaveopolisItems.COLORED_COBBLESTONE_BRICK_PRESSURE_PLATE.get(), CaveopolisItems.COLORED_COBBLESTONE_BRICK_BUTTON.get());
        createStoneLikeCraftingRecipes(consumer, CaveopolisItems.COLORED_CRACKED_STONE_BRICKS, CaveopolisItems.COLORED_CRACKED_STONE_BRICK_STAIRS, CaveopolisItems.COLORED_CRACKED_STONE_BRICK_SLAB, CaveopolisItems.COLORED_CRACKED_STONE_BRICK_WALL, CaveopolisItems.COLORED_CRACKED_STONE_BRICK_PRESSURE_PLATE, CaveopolisItems.COLORED_CRACKED_STONE_BRICK_BUTTON);
        createStoneLikeCraftingRecipes(consumer, CaveopolisItems.COLORED_PRISMARINE, CaveopolisItems.COLORED_PRISMARINE_STAIRS, CaveopolisItems.COLORED_PRISMARINE_SLAB, CaveopolisItems.COLORED_PRISMARINE_WALL, CaveopolisItems.COLORED_PRISMARINE_PRESSURE_PLATE, CaveopolisItems.COLORED_PRISMARINE_BUTTON);
        createStoneLikeCraftingRecipes(consumer, CaveopolisItems.COLORED_PRISMARINE_BRICKS, CaveopolisItems.COLORED_PRISMARINE_BRICK_STAIRS, CaveopolisItems.COLORED_PRISMARINE_BRICK_SLAB, CaveopolisItems.COLORED_PRISMARINE_BRICK_WALL, CaveopolisItems.COLORED_PRISMARINE_BRICK_PRESSURE_PLATE, CaveopolisItems.COLORED_PRISMARINE_BRICK_BUTTON);
        createStoneLikeCraftingRecipes(consumer, CaveopolisItems.COLORED_DARK_PRISMARINE, CaveopolisItems.COLORED_DARK_PRISMARINE_STAIRS, CaveopolisItems.COLORED_DARK_PRISMARINE_SLAB, CaveopolisItems.COLORED_DARK_PRISMARINE_WALL, CaveopolisItems.COLORED_DARK_PRISMARINE_PRESSURE_PLATE, CaveopolisItems.COLORED_DARK_PRISMARINE_BUTTON);
        createStoneLikeCraftingRecipes(consumer, CaveopolisItems.COLORED_TILE, CaveopolisItems.COLORED_TILE_STAIRS, CaveopolisItems.COLORED_TILE_SLAB, CaveopolisItems.COLORED_TILE_WALL, CaveopolisItems.COLORED_TILE_PRESSURE_PLATE, CaveopolisItems.COLORED_TILE_BUTTON);
        createStoneLikeCraftingRecipes(consumer, CaveopolisItems.COLORED_POLISHED_STONE, CaveopolisItems.COLORED_POLISHED_STONE_STAIRS, CaveopolisItems.COLORED_POLISHED_STONE_SLAB, CaveopolisItems.COLORED_POLISHED_STONE_WALL, CaveopolisItems.COLORED_POLISHED_STONE_PRESSURE_PLATE, CaveopolisItems.COLORED_POLISHED_STONE_BUTTON);
        createStoneLikeCraftingRecipes(consumer, CaveopolisItems.COLORED_BRICKS, CaveopolisItems.COLORED_BRICK_STAIRS, CaveopolisItems.COLORED_BRICK_SLAB, CaveopolisItems.COLORED_BRICK_WALL, CaveopolisItems.COLORED_BRICK_PRESSURE_PLATE, CaveopolisItems.COLORED_BRICK_BUTTON);
        createStoneLikeCraftingRecipes(consumer, CaveopolisItems.COLORED_MARBLE, CaveopolisItems.COLORED_MARBLE_STAIRS, CaveopolisItems.COLORED_MARBLE_SLAB, CaveopolisItems.COLORED_MARBLE_WALL, CaveopolisItems.COLORED_MARBLE_PRESSURE_PLATE, CaveopolisItems.COLORED_MARBLE_BUTTON);
        createStoneLikeCraftingRecipes(consumer, CaveopolisItems.COLORED_MARBLE_BRICKS, CaveopolisItems.COLORED_MARBLE_BRICK_STAIRS, CaveopolisItems.COLORED_MARBLE_BRICK_SLAB, CaveopolisItems.COLORED_MARBLE_BRICK_WALL, CaveopolisItems.COLORED_MARBLE_BRICK_PRESSURE_PLATE, CaveopolisItems.COLORED_MARBLE_BRICK_BUTTON);
        createStoneLikeCraftingRecipes(consumer, CaveopolisItems.COLORED_MOSAIC, CaveopolisItems.COLORED_MOSAIC_STAIRS, CaveopolisItems.COLORED_MOSAIC_SLAB, CaveopolisItems.COLORED_MOSAIC_WALL, CaveopolisItems.COLORED_MOSAIC_PRESSURE_PLATE, CaveopolisItems.COLORED_MOSAIC_BUTTON);
        createStoneLikeCraftingRecipes(consumer, CaveopolisItems.COLORED_CHAOTIC, CaveopolisItems.COLORED_CHAOTIC_STAIRS, CaveopolisItems.COLORED_CHAOTIC_SLAB, CaveopolisItems.COLORED_CHAOTIC_WALL, CaveopolisItems.COLORED_CHAOTIC_PRESSURE_PLATE, CaveopolisItems.COLORED_CHAOTIC_BUTTON);
        createStoneLikeCraftingRecipes(consumer, CaveopolisItems.COLORED_TRIPLE, CaveopolisItems.COLORED_TRIPLE_STAIRS, CaveopolisItems.COLORED_TRIPLE_SLAB, CaveopolisItems.COLORED_TRIPLE_WALL, CaveopolisItems.COLORED_TRIPLE_PRESSURE_PLATE, CaveopolisItems.COLORED_TRIPLE_BUTTON);
        createStoneLikeCraftingRecipes(consumer, CaveopolisItems.COLORED_BRAID, CaveopolisItems.COLORED_BRAID_STAIRS, CaveopolisItems.COLORED_BRAID_SLAB, CaveopolisItems.COLORED_BRAID_WALL, CaveopolisItems.COLORED_BRAID_PRESSURE_PLATE, CaveopolisItems.COLORED_BRAID_BUTTON);
        createStoneLikeCraftingRecipes(consumer, CaveopolisItems.COLORED_ENCASED, CaveopolisItems.COLORED_ENCASED_STAIRS, CaveopolisItems.COLORED_ENCASED_SLAB, CaveopolisItems.COLORED_ENCASED_WALL, CaveopolisItems.COLORED_ENCASED_PRESSURE_PLATE, CaveopolisItems.COLORED_ENCASED_BUTTON);
        createStoneLikeCraftingRecipes(consumer, CaveopolisItems.COLORED_ROAD, CaveopolisItems.COLORED_ROAD_STAIRS, CaveopolisItems.COLORED_ROAD_SLAB, CaveopolisItems.COLORED_ROAD_WALL, CaveopolisItems.COLORED_ROAD_PRESSURE_PLATE, CaveopolisItems.COLORED_ROAD_BUTTON);
    }

    public void createStoneLikeCraftingRecipes(RecipeOutput consumer, ItemLike stone, ItemLike stairs, ItemLike slab, ItemLike wall, ItemLike pressure_plate, ItemLike button) {
        createStairsColoringRecipe(consumer, stone, stairs);
        createSlabColoringRecipe(consumer, stone, slab);
        createWallColoringRecipe(consumer, stone, wall);
        createPressurePlateRecipe(consumer, stone, pressure_plate);
        createButtonColoringRecipe(consumer, stone, button);
    }

    public void createPlankLikeCraftingRecipes(RecipeOutput consumer, ItemLike planks, ItemLike stairs, ItemLike slab, ItemLike pressure_plate, ItemLike fence, ItemLike fence_gate, ItemLike door, ItemLike trapdoor, ItemLike button) {
        createStairsColoringRecipe(consumer, planks, stairs);
        createSlabColoringRecipe(consumer, planks, slab);
        createPressurePlateRecipe(consumer, planks, pressure_plate);
        createFenceColoringRecipe(consumer, planks, fence);
        createFenceGateColoringRecipe(consumer, planks, fence_gate);
        createDoorColoringRecipe(consumer, planks, door);
        createTrapdoorColoringRecipe(consumer, planks, trapdoor);
        createButtonColoringRecipe(consumer, planks, button);
    }

    public void createWallColoringRecipe(RecipeOutput consumer, ItemLike input, ItemLike output) {
        String outputPath = BuiltInRegistries.ITEM.getKey(output.asItem()).getPath();
        ColoredCraftingRecipeBuilder.shaped(RecipeCategory.MISC, output, 6)
                .pattern("SSS")
                .pattern("SSS")
                .define('S', input)
                .unlockedBy("has_item", has(input))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "crafting/" + outputPath));
    }

    public void createStairsColoringRecipe(RecipeOutput consumer, ItemLike input, ItemLike output) {
        String outputPath = BuiltInRegistries.ITEM.getKey(output.asItem()).getPath();
        ColoredCraftingRecipeBuilder.shaped(RecipeCategory.MISC, output, 4)
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .define('S', input)
                .unlockedBy("has_item", has(input))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "crafting/" + outputPath));
    }
    public void createSlabColoringRecipe(RecipeOutput consumer, ItemLike input, ItemLike output) {
        String outputPath = BuiltInRegistries.ITEM.getKey(output.asItem()).getPath();
        ColoredCraftingRecipeBuilder.shaped(RecipeCategory.MISC, output, 6)
                .pattern("SSS")
                .define('S', input)
                .unlockedBy("has_item", has(input))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "crafting/" + outputPath));
    }
    public void createPressurePlateRecipe(RecipeOutput consumer, ItemLike input, ItemLike output) {
        String outputPath = BuiltInRegistries.ITEM.getKey(output.asItem()).getPath();
        ColoredCraftingRecipeBuilder.shaped(RecipeCategory.MISC, output, 2)
                .pattern("SS")
                .define('S', input)
                .unlockedBy("has_item", has(input))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "crafting/" + outputPath));
    }
    public void createFenceColoringRecipe(RecipeOutput consumer, ItemLike input, ItemLike output) {
        String outputPath = BuiltInRegistries.ITEM.getKey(output.asItem()).getPath();
        ColoredCraftingRecipeBuilder.shaped(RecipeCategory.MISC, output, 3)
                .pattern("SFS")
                .pattern("SFS")
                .define('S', input)
                .define('F', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_item", has(input))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "crafting/" + outputPath));
    }
    public void createFenceGateColoringRecipe(RecipeOutput consumer, ItemLike input, ItemLike output) {
        String outputPath = BuiltInRegistries.ITEM.getKey(output.asItem()).getPath();
        ColoredCraftingRecipeBuilder.shaped(RecipeCategory.MISC, output, 1)
                .pattern("FSF")
                .pattern("FSF")
                .define('S', input)
                .define('F', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_item", has(input))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "crafting/" + outputPath));
    }
    public void createDoorColoringRecipe(RecipeOutput consumer, ItemLike input, ItemLike output) {
        String outputPath = BuiltInRegistries.ITEM.getKey(output.asItem()).getPath();
        ColoredCraftingRecipeBuilder.shaped(RecipeCategory.MISC, output, 3)
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .define('S', input)
                .unlockedBy("has_item", has(input))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "crafting/" + outputPath));
    }
    public void createTrapdoorColoringRecipe(RecipeOutput consumer, ItemLike input, ItemLike output) {
        String outputPath = BuiltInRegistries.ITEM.getKey(output.asItem()).getPath();
        ColoredCraftingRecipeBuilder.shaped(RecipeCategory.MISC, output, 2)
                .pattern("SSS")
                .pattern("SSS")
                .define('S', input)
                .unlockedBy("has_item", has(input))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "crafting/" + outputPath));
    }
    public void createButtonColoringRecipe(RecipeOutput consumer, ItemLike input, ItemLike output) {
        String outputPath = BuiltInRegistries.ITEM.getKey(output.asItem()).getPath();
        ColoredCraftingRecipeBuilder.shaped(RecipeCategory.MISC, output, 1)
                .pattern("S")
                .define('S', input)
                .unlockedBy("has_item", has(input))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "crafting/" + outputPath));
    }











    public void createWorktableColoringRecipe(RecipeOutput consumer, String color, List resultList, ItemLike ingredient, String type) {
        WorktableRecipeBuilder.worktableRecipeBuilder(resultList,
                        new SizedIngredient(
                                DataComponentIngredient.of(false, DataComponentPredicate.builder()
                                                .expect(CoreDataComponents.COLOR.get(), color).build(),
                                        iconWithColor(ingredient.asItem().getDefaultInstance(), color)), 1))
                .unlockedBy("has_item", has(ingredient))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "worktable/" + type + "/" + color));
    }

    public static ItemLike iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item.getItem();
    }




}