package com.benbenlaw.caveopolis.data;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.ModBlocks;
import com.benbenlaw.caveopolis.data.recipes.RecipeProviderModded;
import com.benbenlaw.caveopolis.data.recipes.SprayerRecipeBuilder;
import com.benbenlaw.caveopolis.item.ModItems;
import com.benbenlaw.caveopolis.util.ModTags;
import com.benbenlaw.opolisutilities.OpolisUtilities;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModSprayerRecipeProvider extends RecipeProviderModded {


    private final List<ItemLike> MIXED_STONE_SMELTABLES = List.of(ModItems.RAW_MIXED_STONE.get(), ModBlocks.MIXED_STONE_ORE.get(), ModBlocks.DEEPSLATE_MIXED_STONE_ORE.get());
    private final List<ItemLike> BRIGHT_STONE_SMELTABLES = List.of(ModBlocks.BRIGHT_STONE_ORE.get(), ModBlocks.DEEPSLATE_BRIGHT_STONE_ORE.get());

    public ModSprayerRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void buildRecipes(RecipeOutput pWriter) {


        // ********** Sprayer Recipes ********** //

        // Sprayer Recipe: Stone

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_STONE.get().asItem().getDefaultInstance()).unlockedBy("has_stone", has(ModTags.Items.COLORED_STONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_STONE.get().asItem().getDefaultInstance()).unlockedBy("has_stone", has(ModTags.Items.COLORED_STONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_STONE.get().asItem().getDefaultInstance()).unlockedBy("has_stone", has(ModTags.Items.COLORED_STONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_STONE.get().asItem().getDefaultInstance()).unlockedBy("has_stone", has(ModTags.Items.COLORED_STONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_STONE.get().asItem().getDefaultInstance()).unlockedBy("has_stone", has(ModTags.Items.COLORED_STONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_STONE.get().asItem().getDefaultInstance()).unlockedBy("has_stone", has(ModTags.Items.COLORED_STONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_STONE.get().asItem().getDefaultInstance()).unlockedBy("has_stone", has(ModTags.Items.COLORED_STONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_STONE.get().asItem().getDefaultInstance()).unlockedBy("has_stone", has(ModTags.Items.COLORED_STONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_STONE.get().asItem().getDefaultInstance()).unlockedBy("has_stone", has(ModTags.Items.COLORED_STONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_STONE.get().asItem().getDefaultInstance()).unlockedBy("has_stone", has(ModTags.Items.COLORED_STONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_STONE.get().asItem().getDefaultInstance()).unlockedBy("has_stone", has(ModTags.Items.COLORED_STONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_STONE.get().asItem().getDefaultInstance()).unlockedBy("has_stone", has(ModTags.Items.COLORED_STONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_STONE.get().asItem().getDefaultInstance()).unlockedBy("has_stone", has(ModTags.Items.COLORED_STONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_STONE.get().asItem().getDefaultInstance()).unlockedBy("has_stone", has(ModTags.Items.COLORED_STONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_STONE.get().asItem().getDefaultInstance()).unlockedBy("has_stone", has(ModTags.Items.COLORED_STONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_STONE.get().asItem().getDefaultInstance()).unlockedBy("has_stone", has(ModTags.Items.COLORED_STONE)).save(pWriter);


        // Stone Bricks

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICKS), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_STONE_BRICKS.get().asItem().getDefaultInstance()).unlockedBy("has_stone_bricks", has(ModTags.Items.COLORED_STONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICKS), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get().asItem().getDefaultInstance()).unlockedBy("has_stone_bricks", has(ModTags.Items.COLORED_STONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICKS), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get().asItem().getDefaultInstance()).unlockedBy("has_stone_bricks", has(ModTags.Items.COLORED_STONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICKS), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_STONE_BRICKS.get().asItem().getDefaultInstance()).unlockedBy("has_stone_bricks", has(ModTags.Items.COLORED_STONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICKS), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_STONE_BRICKS.get().asItem().getDefaultInstance()).unlockedBy("has_stone_bricks", has(ModTags.Items.COLORED_STONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICKS), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_STONE_BRICKS.get().asItem().getDefaultInstance()).unlockedBy("has_stone_bricks", has(ModTags.Items.COLORED_STONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICKS), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_STONE_BRICKS.get().asItem().getDefaultInstance()).unlockedBy("has_stone_bricks", has(ModTags.Items.COLORED_STONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICKS), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_STONE_BRICKS.get().asItem().getDefaultInstance()).unlockedBy("has_stone_bricks", has(ModTags.Items.COLORED_STONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICKS), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_STONE_BRICKS.get().asItem().getDefaultInstance()).unlockedBy("has_stone_bricks", has(ModTags.Items.COLORED_STONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICKS), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_STONE_BRICKS.get().asItem().getDefaultInstance()).unlockedBy("has_stone_bricks", has(ModTags.Items.COLORED_STONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICKS), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_STONE_BRICKS.get().asItem().getDefaultInstance()).unlockedBy("has_stone_bricks", has(ModTags.Items.COLORED_STONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICKS), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_STONE_BRICKS.get().asItem().getDefaultInstance()).unlockedBy("has_stone_bricks", has(ModTags.Items.COLORED_STONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICKS), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_STONE_BRICKS.get().asItem().getDefaultInstance()).unlockedBy("has_stone_bricks", has(ModTags.Items.COLORED_STONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICKS), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get().asItem().getDefaultInstance()).unlockedBy("has_stone_bricks", has(ModTags.Items.COLORED_STONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICKS), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_STONE_BRICKS.get().asItem().getDefaultInstance()).unlockedBy("has_stone_bricks", has(ModTags.Items.COLORED_STONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICKS), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_STONE_BRICKS.get().asItem().getDefaultInstance()).unlockedBy("has_stone_bricks", has(ModTags.Items.COLORED_STONE_BRICKS)).save(pWriter);

        //Wool

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.WOOL), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                Blocks.BLUE_WOOL.asItem().getDefaultInstance()).unlockedBy("has_wool", has(ItemTags.WOOL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.WOOL), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                Blocks.LIGHT_BLUE_WOOL.asItem().getDefaultInstance()).unlockedBy("has_wool", has(ItemTags.WOOL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.WOOL), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                Blocks.LIGHT_GRAY_WOOL.asItem().getDefaultInstance()).unlockedBy("has_wool", has(ItemTags.WOOL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.WOOL), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                Blocks.GRAY_WOOL.asItem().getDefaultInstance()).unlockedBy("has_wool", has(ItemTags.WOOL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.WOOL), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                Blocks.YELLOW_WOOL.asItem().getDefaultInstance()).unlockedBy("has_wool", has(ItemTags.WOOL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.WOOL), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                Blocks.ORANGE_WOOL.asItem().getDefaultInstance()).unlockedBy("has_wool", has(ItemTags.WOOL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.WOOL), Ingredient.of(ModItems.RED_SPRAY_CAN),
                Blocks.RED_WOOL.asItem().getDefaultInstance()).unlockedBy("has_wool", has(ItemTags.WOOL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.WOOL), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                Blocks.LIME_WOOL.asItem().getDefaultInstance()).unlockedBy("has_wool", has(ItemTags.WOOL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.WOOL), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                Blocks.GREEN_WOOL.asItem().getDefaultInstance()).unlockedBy("has_wool", has(ItemTags.WOOL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.WOOL), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                Blocks.BROWN_WOOL.asItem().getDefaultInstance()).unlockedBy("has_wool", has(ItemTags.WOOL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.WOOL), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                Blocks.CYAN_WOOL.asItem().getDefaultInstance()).unlockedBy("has_wool", has(ItemTags.WOOL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.WOOL), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                Blocks.PINK_WOOL.asItem().getDefaultInstance()).unlockedBy("has_wool", has(ItemTags.WOOL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.WOOL), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                Blocks.PURPLE_WOOL.asItem().getDefaultInstance()).unlockedBy("has_wool", has(ItemTags.WOOL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.WOOL), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                Blocks.MAGENTA_WOOL.asItem().getDefaultInstance()).unlockedBy("has_wool", has(ItemTags.WOOL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.WOOL), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                Blocks.BLACK_WOOL.asItem().getDefaultInstance()).unlockedBy("has_wool", has(ItemTags.WOOL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.WOOL), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                Blocks.WHITE_WOOL.asItem().getDefaultInstance()).unlockedBy("has_wool", has(ItemTags.WOOL)).save(pWriter);


        //Terracotta

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.TERRACOTTA), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                Blocks.BLUE_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ItemTags.TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.TERRACOTTA), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                Blocks.LIGHT_BLUE_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ItemTags.TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.TERRACOTTA), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                Blocks.LIGHT_GRAY_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ItemTags.TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.TERRACOTTA), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                Blocks.GRAY_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ItemTags.TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.TERRACOTTA), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                Blocks.YELLOW_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ItemTags.TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.TERRACOTTA), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                Blocks.ORANGE_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ItemTags.TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.TERRACOTTA), Ingredient.of(ModItems.RED_SPRAY_CAN),
                Blocks.RED_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ItemTags.TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.TERRACOTTA), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                Blocks.LIME_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ItemTags.TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.TERRACOTTA), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                Blocks.GREEN_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ItemTags.TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.TERRACOTTA), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                Blocks.BROWN_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ItemTags.TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.TERRACOTTA), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                Blocks.CYAN_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ItemTags.TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.TERRACOTTA), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                Blocks.PINK_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ItemTags.TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.TERRACOTTA), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                Blocks.PURPLE_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ItemTags.TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.TERRACOTTA), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                Blocks.MAGENTA_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ItemTags.TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.TERRACOTTA), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                Blocks.BLACK_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ItemTags.TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.TERRACOTTA), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                Blocks.WHITE_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ItemTags.TERRACOTTA)).save(pWriter);

        //Stripped Logs

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_LOGS), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.STRIPPED_BLUE_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_LOGS), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.STRIPPED_LIGHT_BLUE_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_LOGS), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.STRIPPED_LIGHT_GRAY_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_LOGS), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.STRIPPED_GRAY_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_LOGS), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.STRIPPED_YELLOW_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_LOGS), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.STRIPPED_ORANGE_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_LOGS), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.STRIPPED_RED_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_LOGS), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.STRIPPED_LIME_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_LOGS), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.STRIPPED_GREEN_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_LOGS), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.STRIPPED_BROWN_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_LOGS), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.STRIPPED_CYAN_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_LOGS), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.STRIPPED_PINK_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_LOGS), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.STRIPPED_PURPLE_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_LOGS), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.STRIPPED_MAGENTA_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_LOGS), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.STRIPPED_BLACK_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_LOGS), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.STRIPPED_WHITE_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_LOGS)).save(pWriter);

        //Stripped Wood

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_WOODS), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.STRIPPED_BLUE_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_WOODS), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.STRIPPED_LIGHT_BLUE_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_WOODS), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.STRIPPED_LIGHT_GRAY_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_WOODS), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.STRIPPED_GRAY_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_WOODS), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.STRIPPED_YELLOW_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_WOODS), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.STRIPPED_ORANGE_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_WOODS), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.STRIPPED_RED_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_WOODS), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.STRIPPED_LIME_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_WOODS), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.STRIPPED_GREEN_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_WOODS), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.STRIPPED_BROWN_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_WOODS), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.STRIPPED_CYAN_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_WOODS), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.STRIPPED_PINK_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_WOODS), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.STRIPPED_PURPLE_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_WOODS), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.STRIPPED_MAGENTA_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_WOODS), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.STRIPPED_BLACK_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_WOODS), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.STRIPPED_WHITE_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_stripped_logs", has(ModTags.Items.STRIPPED_COLORED_WOODS)).save(pWriter);

        //Skulker Box

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.SHULKER_BOXES), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                Blocks.BLUE_SHULKER_BOX.asItem().getDefaultInstance()).unlockedBy("has_shulker_box", has(ModTags.Items.SHULKER_BOXES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.SHULKER_BOXES), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                Blocks.LIGHT_BLUE_SHULKER_BOX.asItem().getDefaultInstance()).unlockedBy("has_shulker_box", has(ModTags.Items.SHULKER_BOXES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.SHULKER_BOXES), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                Blocks.LIGHT_GRAY_SHULKER_BOX.asItem().getDefaultInstance()).unlockedBy("has_shulker_box", has(ModTags.Items.SHULKER_BOXES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.SHULKER_BOXES), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                Blocks.GRAY_SHULKER_BOX.asItem().getDefaultInstance()).unlockedBy("has_shulker_box", has(ModTags.Items.SHULKER_BOXES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.SHULKER_BOXES), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                Blocks.YELLOW_SHULKER_BOX.asItem().getDefaultInstance()).unlockedBy("has_shulker_box", has(ModTags.Items.SHULKER_BOXES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.SHULKER_BOXES), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                Blocks.ORANGE_SHULKER_BOX.asItem().getDefaultInstance()).unlockedBy("has_shulker_box", has(ModTags.Items.SHULKER_BOXES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.SHULKER_BOXES), Ingredient.of(ModItems.RED_SPRAY_CAN),
                Blocks.RED_SHULKER_BOX.asItem().getDefaultInstance()).unlockedBy("has_shulker_box", has(ModTags.Items.SHULKER_BOXES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.SHULKER_BOXES), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                Blocks.LIME_SHULKER_BOX.asItem().getDefaultInstance()).unlockedBy("has_shulker_box", has(ModTags.Items.SHULKER_BOXES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.SHULKER_BOXES), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                Blocks.GREEN_SHULKER_BOX.asItem().getDefaultInstance()).unlockedBy("has_shulker_box", has(ModTags.Items.SHULKER_BOXES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.SHULKER_BOXES), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                Blocks.BROWN_SHULKER_BOX.asItem().getDefaultInstance()).unlockedBy("has_shulker_box", has(ModTags.Items.SHULKER_BOXES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.SHULKER_BOXES), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                Blocks.CYAN_SHULKER_BOX.asItem().getDefaultInstance()).unlockedBy("has_shulker_box", has(ModTags.Items.SHULKER_BOXES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.SHULKER_BOXES), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                Blocks.PINK_SHULKER_BOX.asItem().getDefaultInstance()).unlockedBy("has_shulker_box", has(ModTags.Items.SHULKER_BOXES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.SHULKER_BOXES), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                Blocks.PURPLE_SHULKER_BOX.asItem().getDefaultInstance()).unlockedBy("has_shulker_box", has(ModTags.Items.SHULKER_BOXES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.SHULKER_BOXES), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                Blocks.MAGENTA_SHULKER_BOX.asItem().getDefaultInstance()).unlockedBy("has_shulker_box", has(ModTags.Items.SHULKER_BOXES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.SHULKER_BOXES), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                Blocks.BLACK_SHULKER_BOX.asItem().getDefaultInstance()).unlockedBy("has_shulker_box", has(ModTags.Items.SHULKER_BOXES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.SHULKER_BOXES), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                Blocks.WHITE_SHULKER_BOX.asItem().getDefaultInstance()).unlockedBy("has_shulker_box", has(ModTags.Items.SHULKER_BOXES)).save(pWriter);


        //Glazed Terracotta

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.GLAZED_TERRACOTTA),
                Ingredient.of(ModItems.BLUE_SPRAY_CAN), Blocks.BLUE_GLAZED_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ModTags.Items.GLAZED_TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.GLAZED_TERRACOTTA),
                Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN), Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ModTags.Items.GLAZED_TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.GLAZED_TERRACOTTA),
                Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN), Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ModTags.Items.GLAZED_TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.GLAZED_TERRACOTTA),
                Ingredient.of(ModItems.GRAY_SPRAY_CAN), Blocks.GRAY_GLAZED_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ModTags.Items.GLAZED_TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.GLAZED_TERRACOTTA),
                Ingredient.of(ModItems.YELLOW_SPRAY_CAN), Blocks.YELLOW_GLAZED_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ModTags.Items.GLAZED_TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.GLAZED_TERRACOTTA),
                Ingredient.of(ModItems.ORANGE_SPRAY_CAN), Blocks.ORANGE_GLAZED_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ModTags.Items.GLAZED_TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.GLAZED_TERRACOTTA),
                Ingredient.of(ModItems.RED_SPRAY_CAN), Blocks.RED_GLAZED_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ModTags.Items.GLAZED_TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.GLAZED_TERRACOTTA),
                Ingredient.of(ModItems.LIME_SPRAY_CAN), Blocks.LIME_GLAZED_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ModTags.Items.GLAZED_TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.GLAZED_TERRACOTTA),
                Ingredient.of(ModItems.GREEN_SPRAY_CAN), Blocks.GREEN_GLAZED_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ModTags.Items.GLAZED_TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.GLAZED_TERRACOTTA),
                Ingredient.of(ModItems.BROWN_SPRAY_CAN), Blocks.BROWN_GLAZED_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ModTags.Items.GLAZED_TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.GLAZED_TERRACOTTA),
                Ingredient.of(ModItems.CYAN_SPRAY_CAN), Blocks.CYAN_GLAZED_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ModTags.Items.GLAZED_TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.GLAZED_TERRACOTTA),
                Ingredient.of(ModItems.PINK_SPRAY_CAN), Blocks.PINK_GLAZED_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ModTags.Items.GLAZED_TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.GLAZED_TERRACOTTA),
                Ingredient.of(ModItems.PURPLE_SPRAY_CAN), Blocks.PURPLE_GLAZED_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ModTags.Items.GLAZED_TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.GLAZED_TERRACOTTA),
                Ingredient.of(ModItems.MAGENTA_SPRAY_CAN), Blocks.MAGENTA_GLAZED_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ModTags.Items.GLAZED_TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.GLAZED_TERRACOTTA),
                Ingredient.of(ModItems.BLACK_SPRAY_CAN), Blocks.BLACK_GLAZED_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ModTags.Items.GLAZED_TERRACOTTA)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.GLAZED_TERRACOTTA),
                Ingredient.of(ModItems.WHITE_SPRAY_CAN), Blocks.WHITE_GLAZED_TERRACOTTA.asItem().getDefaultInstance()).unlockedBy("has_terracotta", has(ModTags.Items.GLAZED_TERRACOTTA)).save(pWriter);

        //Glass Pane

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_PANES), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                Blocks.BLUE_STAINED_GLASS_PANE.asItem().getDefaultInstance()).unlockedBy("has_glass_pane", has(Tags.Items.GLASS_PANES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_PANES), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                Blocks.LIGHT_BLUE_STAINED_GLASS_PANE.asItem().getDefaultInstance()).unlockedBy("has_glass_pane", has(Tags.Items.GLASS_PANES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_PANES), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                Blocks.LIGHT_GRAY_STAINED_GLASS_PANE.asItem().getDefaultInstance()).unlockedBy("has_glass_pane", has(Tags.Items.GLASS_PANES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_PANES), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                Blocks.GRAY_STAINED_GLASS_PANE.asItem().getDefaultInstance()).unlockedBy("has_glass_pane", has(Tags.Items.GLASS_PANES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_PANES), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                Blocks.YELLOW_STAINED_GLASS_PANE.asItem().getDefaultInstance()).unlockedBy("has_glass_pane", has(Tags.Items.GLASS_PANES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_PANES), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                Blocks.ORANGE_STAINED_GLASS_PANE.asItem().getDefaultInstance()).unlockedBy("has_glass_pane", has(Tags.Items.GLASS_PANES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_PANES), Ingredient.of(ModItems.RED_SPRAY_CAN),
                Blocks.RED_STAINED_GLASS_PANE.asItem().getDefaultInstance()).unlockedBy("has_glass_pane", has(Tags.Items.GLASS_PANES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_PANES), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                Blocks.LIME_STAINED_GLASS_PANE.asItem().getDefaultInstance()).unlockedBy("has_glass_pane", has(Tags.Items.GLASS_PANES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_PANES), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                Blocks.GREEN_STAINED_GLASS_PANE.asItem().getDefaultInstance()).unlockedBy("has_glass_pane", has(Tags.Items.GLASS_PANES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_PANES), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                Blocks.BROWN_STAINED_GLASS_PANE.asItem().getDefaultInstance()).unlockedBy("has_glass_pane", has(Tags.Items.GLASS_PANES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_PANES), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                Blocks.CYAN_STAINED_GLASS_PANE.asItem().getDefaultInstance()).unlockedBy("has_glass_pane", has(Tags.Items.GLASS_PANES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_PANES), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                Blocks.PINK_STAINED_GLASS_PANE.asItem().getDefaultInstance()).unlockedBy("has_glass_pane", has(Tags.Items.GLASS_PANES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_PANES), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                Blocks.PURPLE_STAINED_GLASS_PANE.asItem().getDefaultInstance()).unlockedBy("has_glass_pane", has(Tags.Items.GLASS_PANES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_PANES), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                Blocks.MAGENTA_STAINED_GLASS_PANE.asItem().getDefaultInstance()).unlockedBy("has_glass_pane", has(Tags.Items.GLASS_PANES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_PANES), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                Blocks.BLACK_STAINED_GLASS_PANE.asItem().getDefaultInstance()).unlockedBy("has_glass_pane", has(Tags.Items.GLASS_PANES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_PANES), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                Blocks.WHITE_STAINED_GLASS_PANE.asItem().getDefaultInstance()).unlockedBy("has_glass_pane", has(Tags.Items.GLASS_PANES)).save(pWriter);

        //Glass

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_BLOCKS), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                Blocks.BLUE_STAINED_GLASS.asItem().getDefaultInstance()).unlockedBy("has_glass", has(Tags.Items.GLASS_BLOCKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_BLOCKS), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                Blocks.LIGHT_BLUE_STAINED_GLASS.asItem().getDefaultInstance()).unlockedBy("has_glass", has(Tags.Items.GLASS_BLOCKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_BLOCKS), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                Blocks.LIGHT_GRAY_STAINED_GLASS.asItem().getDefaultInstance()).unlockedBy("has_glass", has(Tags.Items.GLASS_BLOCKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_BLOCKS), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                Blocks.GRAY_STAINED_GLASS.asItem().getDefaultInstance()).unlockedBy("has_glass", has(Tags.Items.GLASS_BLOCKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_BLOCKS), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                Blocks.YELLOW_STAINED_GLASS.asItem().getDefaultInstance()).unlockedBy("has_glass", has(Tags.Items.GLASS_BLOCKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_BLOCKS), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                Blocks.ORANGE_STAINED_GLASS.asItem().getDefaultInstance()).unlockedBy("has_glass", has(Tags.Items.GLASS_BLOCKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_BLOCKS), Ingredient.of(ModItems.RED_SPRAY_CAN),
                Blocks.RED_STAINED_GLASS.asItem().getDefaultInstance()).unlockedBy("has_glass", has(Tags.Items.GLASS_BLOCKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_BLOCKS), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                Blocks.LIME_STAINED_GLASS.asItem().getDefaultInstance()).unlockedBy("has_glass", has(Tags.Items.GLASS_BLOCKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_BLOCKS), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                Blocks.GREEN_STAINED_GLASS.asItem().getDefaultInstance()).unlockedBy("has_glass", has(Tags.Items.GLASS_BLOCKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_BLOCKS), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                Blocks.BROWN_STAINED_GLASS.asItem().getDefaultInstance()).unlockedBy("has_glass", has(Tags.Items.GLASS_BLOCKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_BLOCKS), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                Blocks.CYAN_STAINED_GLASS.asItem().getDefaultInstance()).unlockedBy("has_glass", has(Tags.Items.GLASS_BLOCKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_BLOCKS), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                Blocks.PINK_STAINED_GLASS.asItem().getDefaultInstance()).unlockedBy("has_glass", has(Tags.Items.GLASS_BLOCKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_BLOCKS), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                Blocks.PURPLE_STAINED_GLASS.asItem().getDefaultInstance()).unlockedBy("has_glass", has(Tags.Items.GLASS_BLOCKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_BLOCKS), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                Blocks.MAGENTA_STAINED_GLASS.asItem().getDefaultInstance()).unlockedBy("has_glass", has(Tags.Items.GLASS_BLOCKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_BLOCKS), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                Blocks.BLACK_STAINED_GLASS.asItem().getDefaultInstance()).unlockedBy("has_glass", has(Tags.Items.GLASS_BLOCKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_BLOCKS), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                Blocks.WHITE_STAINED_GLASS.asItem().getDefaultInstance()).unlockedBy("has_glass", has(Tags.Items.GLASS_BLOCKS)).save(pWriter);

        //Concrete

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_CONCRETE), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                Blocks.BLUE_CONCRETE.asItem().getDefaultInstance()).unlockedBy("has_concrete", has(ModTags.Items.COLORED_CONCRETE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_CONCRETE), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                Blocks.LIGHT_BLUE_CONCRETE.asItem().getDefaultInstance()).unlockedBy("has_concrete", has(ModTags.Items.COLORED_CONCRETE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_CONCRETE), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                Blocks.LIGHT_GRAY_CONCRETE.asItem().getDefaultInstance()).unlockedBy("has_concrete", has(ModTags.Items.COLORED_CONCRETE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_CONCRETE), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                Blocks.GRAY_CONCRETE.asItem().getDefaultInstance()).unlockedBy("has_concrete", has(ModTags.Items.COLORED_CONCRETE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_CONCRETE), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                Blocks.YELLOW_CONCRETE.asItem().getDefaultInstance()).unlockedBy("has_concrete", has(ModTags.Items.COLORED_CONCRETE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_CONCRETE), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                Blocks.ORANGE_CONCRETE.asItem().getDefaultInstance()).unlockedBy("has_concrete", has(ModTags.Items.COLORED_CONCRETE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_CONCRETE), Ingredient.of(ModItems.RED_SPRAY_CAN),
                Blocks.RED_CONCRETE.asItem().getDefaultInstance()).unlockedBy("has_concrete", has(ModTags.Items.COLORED_CONCRETE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_CONCRETE), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                Blocks.LIME_CONCRETE.asItem().getDefaultInstance()).unlockedBy("has_concrete", has(ModTags.Items.COLORED_CONCRETE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_CONCRETE), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                Blocks.GREEN_CONCRETE.asItem().getDefaultInstance()).unlockedBy("has_concrete", has(ModTags.Items.COLORED_CONCRETE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_CONCRETE), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                Blocks.BROWN_CONCRETE.asItem().getDefaultInstance()).unlockedBy("has_concrete", has(ModTags.Items.COLORED_CONCRETE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_CONCRETE), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                Blocks.CYAN_CONCRETE.asItem().getDefaultInstance()).unlockedBy("has_concrete", has(ModTags.Items.COLORED_CONCRETE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_CONCRETE), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                Blocks.PINK_CONCRETE.asItem().getDefaultInstance()).unlockedBy("has_concrete", has(ModTags.Items.COLORED_CONCRETE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_CONCRETE), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                Blocks.PURPLE_CONCRETE.asItem().getDefaultInstance()).unlockedBy("has_concrete", has(ModTags.Items.COLORED_CONCRETE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_CONCRETE), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                Blocks.MAGENTA_CONCRETE.asItem().getDefaultInstance()).unlockedBy("has_concrete", has(ModTags.Items.COLORED_CONCRETE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_CONCRETE), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                Blocks.BLACK_CONCRETE.asItem().getDefaultInstance()).unlockedBy("has_concrete", has(ModTags.Items.COLORED_CONCRETE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_CONCRETE), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                Blocks.WHITE_CONCRETE.asItem().getDefaultInstance()).unlockedBy("has_concrete", has(ModTags.Items.COLORED_CONCRETE)).save(pWriter);

        //Beds

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BEDS), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                Blocks.BLUE_BED.asItem().getDefaultInstance()).unlockedBy("has_bed", has(ItemTags.BEDS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BEDS), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                Blocks.LIGHT_BLUE_BED.asItem().getDefaultInstance()).unlockedBy("has_bed", has(ItemTags.BEDS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BEDS), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                Blocks.LIGHT_GRAY_BED.asItem().getDefaultInstance()).unlockedBy("has_bed", has(ItemTags.BEDS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BEDS), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                Blocks.GRAY_BED.asItem().getDefaultInstance()).unlockedBy("has_bed", has(ItemTags.BEDS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BEDS), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                Blocks.YELLOW_BED.asItem().getDefaultInstance()).unlockedBy("has_bed", has(ItemTags.BEDS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BEDS), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                Blocks.ORANGE_BED.asItem().getDefaultInstance()).unlockedBy("has_bed", has(ItemTags.BEDS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BEDS), Ingredient.of(ModItems.RED_SPRAY_CAN),
                Blocks.RED_BED.asItem().getDefaultInstance()).unlockedBy("has_bed", has(ItemTags.BEDS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BEDS), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                Blocks.LIME_BED.asItem().getDefaultInstance()).unlockedBy("has_bed", has(ItemTags.BEDS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BEDS), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                Blocks.GREEN_BED.asItem().getDefaultInstance()).unlockedBy("has_bed", has(ItemTags.BEDS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BEDS), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                Blocks.BROWN_BED.asItem().getDefaultInstance()).unlockedBy("has_bed", has(ItemTags.BEDS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BEDS), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                Blocks.CYAN_BED.asItem().getDefaultInstance()).unlockedBy("has_bed", has(ItemTags.BEDS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BEDS), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                Blocks.PINK_BED.asItem().getDefaultInstance()).unlockedBy("has_bed", has(ItemTags.BEDS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BEDS), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                Blocks.PURPLE_BED.asItem().getDefaultInstance()).unlockedBy("has_bed", has(ItemTags.BEDS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BEDS), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                Blocks.MAGENTA_BED.asItem().getDefaultInstance()).unlockedBy("has_bed", has(ItemTags.BEDS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BEDS), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                Blocks.BLACK_BED.asItem().getDefaultInstance()).unlockedBy("has_bed", has(ItemTags.BEDS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BEDS), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                Blocks.WHITE_BED.asItem().getDefaultInstance()).unlockedBy("has_bed", has(ItemTags.BEDS)).save(pWriter);

        //Colored Plank Trapdoor

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_WOODEN_PLANK_TRAPDOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_trapdoor", has(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_TRAPDOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_trapdoor", has(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_TRAPDOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_trapdoor", has(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_WOODEN_PLANK_TRAPDOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_trapdoor", has(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_WOODEN_PLANK_TRAPDOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_trapdoor", has(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_WOODEN_PLANK_TRAPDOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_trapdoor", has(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_WOODEN_PLANK_TRAPDOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_trapdoor", has(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_WOODEN_PLANK_TRAPDOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_trapdoor", has(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_WOODEN_PLANK_TRAPDOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_trapdoor", has(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_WOODEN_PLANK_TRAPDOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_trapdoor", has(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_WOODEN_PLANK_TRAPDOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_trapdoor", has(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_WOODEN_PLANK_TRAPDOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_trapdoor", has(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_WOODEN_PLANK_TRAPDOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_trapdoor", has(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_TRAPDOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_trapdoor", has(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_WOODEN_PLANK_TRAPDOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_trapdoor", has(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_WOODEN_PLANK_TRAPDOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_trapdoor", has(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS)).save(pWriter);

        //Colored Plank Stairs

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_WOODEN_PLANK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_stairs", has(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_stairs", has(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_stairs", has(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_WOODEN_PLANK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_stairs", has(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_WOODEN_PLANK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_stairs", has(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_WOODEN_PLANK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_stairs", has(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_WOODEN_PLANK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_stairs", has(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_WOODEN_PLANK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_stairs", has(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_WOODEN_PLANK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_stairs", has(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_WOODEN_PLANK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_stairs", has(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_WOODEN_PLANK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_stairs", has(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_WOODEN_PLANK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_stairs", has(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_WOODEN_PLANK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_stairs", has(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_stairs", has(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_WOODEN_PLANK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_stairs", has(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_WOODEN_PLANK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_stairs", has(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS)).save(pWriter);

        //Colored Plank Slabs

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_SLABS), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_WOODEN_PLANK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_SLABS), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_SLABS), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_SLABS), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_WOODEN_PLANK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_SLABS), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_WOODEN_PLANK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_SLABS), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_WOODEN_PLANK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_SLABS), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_WOODEN_PLANK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_SLABS), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_WOODEN_PLANK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_SLABS), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_WOODEN_PLANK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_SLABS), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_WOODEN_PLANK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_SLABS), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_WOODEN_PLANK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_SLABS), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_WOODEN_PLANK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_SLABS), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_WOODEN_PLANK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_SLABS), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_SLABS), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_WOODEN_PLANK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_SLABS), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_WOODEN_PLANK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_SLABS)).save(pWriter);


        //Colored Plank Pressure Plate

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_WOODEN_PLANK_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_WOODEN_PLANK_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_WOODEN_PLANK_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_WOODEN_PLANK_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_WOODEN_PLANK_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_WOODEN_PLANK_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_WOODEN_PLANK_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_WOODEN_PLANK_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_WOODEN_PLANK_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES)).save(pWriter);


        //Colored Plank Fence Gate

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_WOODEN_PLANK_FENCE_GATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_FENCE_GATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_FENCE_GATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_WOODEN_PLANK_FENCE_GATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_WOODEN_PLANK_FENCE_GATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_WOODEN_PLANK_FENCE_GATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_WOODEN_PLANK_FENCE_GATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_WOODEN_PLANK_FENCE_GATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_WOODEN_PLANK_FENCE_GATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_WOODEN_PLANK_FENCE_GATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_WOODEN_PLANK_FENCE_GATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_WOODEN_PLANK_FENCE_GATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_WOODEN_PLANK_FENCE_GATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_FENCE_GATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_WOODEN_PLANK_FENCE_GATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_WOODEN_PLANK_FENCE_GATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCE_GATES)).save(pWriter);

        //Colored Plank Fence

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCES), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_WOODEN_PLANK_FENCE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCES), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_FENCE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCES), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_FENCE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCES), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_WOODEN_PLANK_FENCE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCES), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_WOODEN_PLANK_FENCE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCES), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_WOODEN_PLANK_FENCE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCES), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_WOODEN_PLANK_FENCE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCES), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_WOODEN_PLANK_FENCE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCES), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_WOODEN_PLANK_FENCE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCES), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_WOODEN_PLANK_FENCE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCES), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_WOODEN_PLANK_FENCE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCES), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_WOODEN_PLANK_FENCE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCES), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_WOODEN_PLANK_FENCE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCES), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_FENCE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCES), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_WOODEN_PLANK_FENCE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCES), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_WOODEN_PLANK_FENCE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCES)).save(pWriter);


        //Colored Plank Door

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_DOORS), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_WOODEN_PLANK_DOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_DOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_DOORS), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_DOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_DOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_DOORS), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_DOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_DOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_DOORS), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_WOODEN_PLANK_DOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_DOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_DOORS), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_WOODEN_PLANK_DOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_DOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_DOORS), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_WOODEN_PLANK_DOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_DOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_DOORS), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_WOODEN_PLANK_DOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_DOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_DOORS), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_WOODEN_PLANK_DOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_DOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_DOORS), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_WOODEN_PLANK_DOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_DOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_DOORS), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_WOODEN_PLANK_DOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_DOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_DOORS), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_WOODEN_PLANK_DOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_DOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_DOORS), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_WOODEN_PLANK_DOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_DOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_DOORS), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_WOODEN_PLANK_DOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_DOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_DOORS), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_DOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_DOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_DOORS), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_WOODEN_PLANK_DOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_DOORS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_DOORS), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_WOODEN_PLANK_DOOR.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_DOORS)).save(pWriter);

        //Colored Plank Crafting Table

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_WOODEN_PLANK_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_WOODEN_PLANK_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_WOODEN_PLANK_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_WOODEN_PLANK_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_WOODEN_PLANK_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_WOODEN_PLANK_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_WOODEN_PLANK_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_WOODEN_PLANK_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_WOODEN_PLANK_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_WOODEN_PLANK_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_WOODEN_PLANK_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_WOODEN_PLANK_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_WOODEN_PLANK_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES)).save(pWriter);

        //Colored Plank Button

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_WOODEN_PLANK_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_WOODEN_PLANK_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_WOODEN_PLANK_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_WOODEN_PLANK_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_WOODEN_PLANK_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_WOODEN_PLANK_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_WOODEN_PLANK_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_WOODEN_PLANK_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_WOODEN_PLANK_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_WOODEN_PLANK_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_WOODEN_PLANK_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_WOODEN_PLANK_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_WOODEN_PLANK_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS)).save(pWriter);


        //Colored Planks

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANKS), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_WOODEN_PLANKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANKS), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANKS), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANKS), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_WOODEN_PLANKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANKS), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANKS), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANKS), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_WOODEN_PLANKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANKS), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_WOODEN_PLANKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANKS), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_WOODEN_PLANKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANKS), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_WOODEN_PLANKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANKS), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_WOODEN_PLANKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANKS), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_WOODEN_PLANKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANKS), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANKS), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANKS), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_WOODEN_PLANKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANKS), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_WOODEN_PLANKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODEN_PLANKS)).save(pWriter);


        //Colored Wood

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODS), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODS), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODS), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODS), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODS), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODS), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODS), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODS), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODS), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODS), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODS), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODS), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODS), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODS), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODS), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODS), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_WOOD.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_WOODS)).save(pWriter);


        //Colored TORCH

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_TORCHES), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModItems.BLUE_TORCH.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_TORCHES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_TORCHES), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModItems.LIGHT_BLUE_TORCH.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_TORCHES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_TORCHES), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModItems.LIGHT_GRAY_TORCH.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_TORCHES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_TORCHES), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModItems.GRAY_TORCH.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_TORCHES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_TORCHES), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModItems.YELLOW_TORCH.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_TORCHES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_TORCHES), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModItems.ORANGE_TORCH.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_TORCHES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_TORCHES), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModItems.RED_TORCH.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_TORCHES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_TORCHES), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModItems.LIME_TORCH.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_TORCHES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_TORCHES), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModItems.GREEN_TORCH.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_TORCHES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_TORCHES), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModItems.BROWN_TORCH.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_TORCHES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_TORCHES), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModItems.CYAN_TORCH.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_TORCHES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_TORCHES), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModItems.PINK_TORCH.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_TORCHES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_TORCHES), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModItems.PURPLE_TORCH.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_TORCHES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_TORCHES), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModItems.MAGENTA_TORCH.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_TORCHES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_TORCHES), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModItems.BLACK_TORCH.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_TORCHES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_TORCHES), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModItems.WHITE_TORCH.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_TORCHES)).save(pWriter);


        //Colored STONE_WALL

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_WALL), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_STONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_WALL), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_STONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_WALL), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_STONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_WALL), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_STONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_WALL), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_STONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_WALL), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_STONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_WALL), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_STONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_WALL), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_STONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_WALL), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_STONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_WALL), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_STONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_WALL), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_STONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_WALL), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_STONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_WALL), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_STONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_WALL), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_STONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_WALL), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_STONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_WALL), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_STONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_WALL)).save(pWriter);


        //Colored STONE_STAIRS

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_STAIRS), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_STONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_STAIRS), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_STONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_STAIRS), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_STONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_STAIRS), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_STONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_STAIRS), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_STONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_STAIRS), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_STONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_STAIRS), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_STONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_STAIRS), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_STONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_STAIRS), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_STONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_STAIRS), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_STONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_STAIRS), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_STONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_STAIRS), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_STONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_STAIRS), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_STONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_STAIRS), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_STONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_STAIRS), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_STONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_STAIRS), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_STONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_STAIRS)).save(pWriter);


        //Colored STONE_SLAB

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_SLABS), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_STONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_SLABS), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_STONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_SLABS), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_STONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_SLABS), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_STONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_SLABS), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_STONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_SLABS), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_STONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_SLABS), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_STONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_SLABS), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_STONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_SLABS), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_STONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_SLABS), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_STONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_SLABS), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_STONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_SLABS), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_STONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_SLABS), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_STONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_SLABS), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_STONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_SLABS), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_STONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_SLABS), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_STONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_SLABS)).save(pWriter);


        //Colored Stone Pressure Pad

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_PRESSURE_PLATES), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_STONE_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_PRESSURE_PLATES), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_STONE_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_PRESSURE_PLATES), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_STONE_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_PRESSURE_PLATES), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_STONE_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_PRESSURE_PLATES), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_STONE_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_PRESSURE_PLATES), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_STONE_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_PRESSURE_PLATES), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_STONE_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_PRESSURE_PLATES), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_STONE_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_PRESSURE_PLATES), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_STONE_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_PRESSURE_PLATES), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_STONE_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_PRESSURE_PLATES), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_STONE_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_PRESSURE_PLATES), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_STONE_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_PRESSURE_PLATES), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_STONE_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_PRESSURE_PLATES), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_STONE_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_PRESSURE_PLATES), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_STONE_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_PRESSURE_PLATES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_PRESSURE_PLATES), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_STONE_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_PRESSURE_PLATES)).save(pWriter);


        //Colored Stone Crafting Table

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_CRAFTING_TABLES), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_STONE_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_CRAFTING_TABLES), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_STONE_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_CRAFTING_TABLES), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_STONE_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_CRAFTING_TABLES), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_STONE_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_CRAFTING_TABLES), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_STONE_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_CRAFTING_TABLES), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_STONE_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_CRAFTING_TABLES), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_STONE_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_CRAFTING_TABLES), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_STONE_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_CRAFTING_TABLES), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_STONE_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_CRAFTING_TABLES), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_STONE_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_CRAFTING_TABLES), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_STONE_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_CRAFTING_TABLES), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_STONE_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_CRAFTING_TABLES), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_STONE_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_CRAFTING_TABLES), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_STONE_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_CRAFTING_TABLES), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_STONE_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_CRAFTING_TABLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_CRAFTING_TABLES), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_STONE_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_CRAFTING_TABLES)).save(pWriter);


        //Colored Stone Buttons

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BUTTONS), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_STONE_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BUTTONS), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_STONE_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BUTTONS), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_STONE_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BUTTONS), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_STONE_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BUTTONS), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_STONE_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BUTTONS), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_STONE_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BUTTONS), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_STONE_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BUTTONS), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_STONE_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BUTTONS), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_STONE_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BUTTONS), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_STONE_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BUTTONS), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_STONE_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BUTTONS), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_STONE_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BUTTONS), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_STONE_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BUTTONS), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_STONE_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BUTTONS), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_STONE_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BUTTONS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BUTTONS), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_STONE_BUTTON.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BUTTONS)).save(pWriter);


        //Colored Stone Brick Wall

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_WALL), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_STONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_WALL), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_WALL), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_WALL), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_STONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_WALL), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_STONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_WALL), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_STONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_WALL), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_STONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_WALL), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_STONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_WALL), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_STONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_WALL), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_STONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_WALL), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_STONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_WALL), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_STONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_WALL), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_STONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_WALL), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_STONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_WALL), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_STONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_WALL), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_STONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_WALL)).save(pWriter);


        //Colored Stone Brick Stairs

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_STAIRS), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_STONE_BRICK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_STAIRS), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_STAIRS), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_STAIRS), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_STONE_BRICK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_STAIRS), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_STONE_BRICK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_STAIRS), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_STONE_BRICK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_STAIRS), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_STONE_BRICK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_STAIRS), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_STONE_BRICK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_STAIRS), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_STONE_BRICK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_STAIRS), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_STONE_BRICK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_STAIRS), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_STONE_BRICK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_STAIRS), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_STONE_BRICK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_STAIRS), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_STONE_BRICK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_STAIRS), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_STONE_BRICK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_STAIRS), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_STONE_BRICK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_STAIRS), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_STONE_BRICK_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_STAIRS)).save(pWriter);


        //Colored Stone Brick Slab

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_SLABS), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_STONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_SLABS), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_SLABS), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_SLABS), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_STONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_SLABS), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_STONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_SLABS), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_STONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_SLABS), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_STONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_SLABS), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_STONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_SLABS), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_STONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_SLABS), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_STONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_SLABS), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_STONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_SLABS), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_STONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_SLABS), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_STONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_SLABS), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_STONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_SLABS), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_STONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_SLABS), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_STONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_STONE_BRICK_SLABS)).save(pWriter);


        //Colored Signs

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SIGNS), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModItems.BLUE_COLORED_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SIGNS), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModItems.LIGHT_BLUE_COLORED_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SIGNS), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModItems.LIGHT_GRAY_COLORED_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SIGNS), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModItems.GRAY_COLORED_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SIGNS), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModItems.YELLOW_COLORED_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SIGNS), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModItems.ORANGE_COLORED_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SIGNS), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModItems.RED_COLORED_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SIGNS), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModItems.LIME_COLORED_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SIGNS), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModItems.GREEN_COLORED_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SIGNS), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModItems.BROWN_COLORED_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SIGNS), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModItems.CYAN_COLORED_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SIGNS), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModItems.PINK_COLORED_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SIGNS), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModItems.PURPLE_COLORED_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SIGNS), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModItems.MAGENTA_COLORED_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SIGNS), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModItems.BLACK_COLORED_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SIGNS), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModItems.WHITE_COLORED_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SIGNS)).save(pWriter);


        //Colored Saplings

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SAPLINGS), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_SAPLING.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SAPLINGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SAPLINGS), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_SAPLING.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SAPLINGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SAPLINGS), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_SAPLING.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SAPLINGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SAPLINGS), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_SAPLING.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SAPLINGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SAPLINGS), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_SAPLING.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SAPLINGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SAPLINGS), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_SAPLING.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SAPLINGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SAPLINGS), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_SAPLING.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SAPLINGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SAPLINGS), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_SAPLING.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SAPLINGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SAPLINGS), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_SAPLING.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SAPLINGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SAPLINGS), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_SAPLING.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SAPLINGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SAPLINGS), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_SAPLING.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SAPLINGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SAPLINGS), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_SAPLING.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SAPLINGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SAPLINGS), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_SAPLING.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SAPLINGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SAPLINGS), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_SAPLING.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SAPLINGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SAPLINGS), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_SAPLING.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SAPLINGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SAPLINGS), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_SAPLING.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_SAPLINGS)).save(pWriter);


        //Colored Logs

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LOGS), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LOGS), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LOGS), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LOGS), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LOGS), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LOGS), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LOGS), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LOGS), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LOGS), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LOGS), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LOGS), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LOGS), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LOGS), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LOGS), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LOGS), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LOGS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LOGS), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_LOG.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LOGS)).save(pWriter);


        //Colored Leaves

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LEAVES), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_LEAVES.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LEAVES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LEAVES), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_LEAVES.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LEAVES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LEAVES), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_LEAVES.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LEAVES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LEAVES), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_LEAVES.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LEAVES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LEAVES), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_LEAVES.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LEAVES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LEAVES), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_LEAVES.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LEAVES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LEAVES), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_LEAVES.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LEAVES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LEAVES), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_LEAVES.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LEAVES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LEAVES), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_LEAVES.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LEAVES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LEAVES), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_LEAVES.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LEAVES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LEAVES), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_LEAVES.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LEAVES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LEAVES), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_LEAVES.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LEAVES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LEAVES), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_LEAVES.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LEAVES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LEAVES), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_LEAVES.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LEAVES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LEAVES), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_LEAVES.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LEAVES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LEAVES), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_LEAVES.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_LEAVES)).save(pWriter);


        //Colored Hanging Sign

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_HANGING_SIGNS), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModItems.BLUE_COLORED_HANGING_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_HANGING_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_HANGING_SIGNS), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModItems.LIGHT_BLUE_COLORED_HANGING_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_HANGING_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_HANGING_SIGNS), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModItems.LIGHT_GRAY_COLORED_HANGING_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_HANGING_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_HANGING_SIGNS), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModItems.GRAY_COLORED_HANGING_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_HANGING_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_HANGING_SIGNS), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModItems.YELLOW_COLORED_HANGING_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_HANGING_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_HANGING_SIGNS), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModItems.ORANGE_COLORED_HANGING_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_HANGING_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_HANGING_SIGNS), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModItems.RED_COLORED_HANGING_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_HANGING_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_HANGING_SIGNS), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModItems.LIME_COLORED_HANGING_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_HANGING_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_HANGING_SIGNS), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModItems.GREEN_COLORED_HANGING_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_HANGING_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_HANGING_SIGNS), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModItems.BROWN_COLORED_HANGING_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_HANGING_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_HANGING_SIGNS), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModItems.CYAN_COLORED_HANGING_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_HANGING_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_HANGING_SIGNS), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModItems.PINK_COLORED_HANGING_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_HANGING_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_HANGING_SIGNS), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModItems.PURPLE_COLORED_HANGING_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_HANGING_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_HANGING_SIGNS), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModItems.MAGENTA_COLORED_HANGING_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_HANGING_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_HANGING_SIGNS), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModItems.BLACK_COLORED_HANGING_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_HANGING_SIGNS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_HANGING_SIGNS), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModItems.WHITE_COLORED_HANGING_SIGN.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_HANGING_SIGNS)).save(pWriter);


        //Colored Dirt

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_DIRT), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_DIRT.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_DIRT)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_DIRT), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_DIRT.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_DIRT)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_DIRT), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_DIRT.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_DIRT)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_DIRT), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_DIRT.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_DIRT)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_DIRT), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_DIRT.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_DIRT)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_DIRT), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_DIRT.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_DIRT)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_DIRT), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_DIRT.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_DIRT)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_DIRT), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_DIRT.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_DIRT)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_DIRT), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_DIRT.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_DIRT)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_DIRT), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_DIRT.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_DIRT)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_DIRT), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_DIRT.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_DIRT)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_DIRT), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_DIRT.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_DIRT)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_DIRT), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_DIRT.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_DIRT)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_DIRT), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_DIRT.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_DIRT)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_DIRT), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_DIRT.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_DIRT)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_DIRT), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_DIRT.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_DIRT)).save(pWriter);


        //Colored Cobblestone Wall

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_WALL), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_COBBLESTONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_WALL), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_WALL), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_WALL), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_COBBLESTONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_WALL), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_COBBLESTONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_WALL), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_COBBLESTONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_WALL), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_COBBLESTONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_WALL), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_COBBLESTONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_WALL), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_COBBLESTONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_WALL), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_COBBLESTONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_WALL), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_COBBLESTONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_WALL), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_COBBLESTONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_WALL), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_COBBLESTONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_WALL), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_COBBLESTONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_WALL), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_COBBLESTONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_WALL), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_COBBLESTONE_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_WALL)).save(pWriter);


        //Colored Cobblestone Stairs

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_STAIRS), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_COBBLESTONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_STAIRS), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_STAIRS), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_STAIRS), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_COBBLESTONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_STAIRS), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_COBBLESTONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_STAIRS), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_COBBLESTONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_STAIRS), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_COBBLESTONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_STAIRS), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_COBBLESTONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_STAIRS), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_COBBLESTONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_STAIRS), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_COBBLESTONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_STAIRS), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_COBBLESTONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_STAIRS), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_COBBLESTONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_STAIRS), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_COBBLESTONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_STAIRS), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_COBBLESTONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_STAIRS), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_COBBLESTONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_STAIRS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_STAIRS), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_COBBLESTONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_STAIRS)).save(pWriter);


        //Colored Cobblestone Slabs

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_SLABS), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_COBBLESTONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_SLABS), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_SLABS), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_SLABS), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_COBBLESTONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_SLABS), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_COBBLESTONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_SLABS), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_COBBLESTONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_SLABS), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_COBBLESTONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_SLABS), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_COBBLESTONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_SLABS), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_COBBLESTONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_SLABS), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_COBBLESTONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_SLABS), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_COBBLESTONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_SLABS), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_COBBLESTONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_SLABS), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_COBBLESTONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_SLABS), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_COBBLESTONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_SLABS), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_COBBLESTONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_SLABS), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_COBBLESTONE_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_SLABS)).save(pWriter);


        //Colored Cobblestone Brick Wall

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_COBBLESTONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_COBBLESTONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_COBBLESTONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_COBBLESTONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_COBBLESTONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_COBBLESTONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_COBBLESTONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_COBBLESTONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_COBBLESTONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_COBBLESTONE_BRICK_WALL.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_WALL)).save(pWriter);


        //Colored Cobblestone Brick Slabs

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_COBBLESTONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_COBBLESTONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_COBBLESTONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_COBBLESTONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_COBBLESTONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_COBBLESTONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_COBBLESTONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_COBBLESTONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_COBBLESTONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_COBBLESTONE_BRICK_SLAB.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICK_SLABS)).save(pWriter);


        //Colored Cobblestone Bricks

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICKS), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_COBBLESTONE_BRICKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICKS), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICKS), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICKS), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_COBBLESTONE_BRICKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICKS), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICKS), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICKS), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_COBBLESTONE_BRICKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICKS), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_COBBLESTONE_BRICKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICKS), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_COBBLESTONE_BRICKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICKS), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_COBBLESTONE_BRICKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICKS), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_COBBLESTONE_BRICKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICKS), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_COBBLESTONE_BRICKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICKS), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICKS), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICKS), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_COBBLESTONE_BRICKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICKS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE_BRICKS), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_COBBLESTONE_BRICKS.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE_BRICKS)).save(pWriter);


        //Colored Cobblestone

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                ModBlocks.BLUE_COLORED_COBBLESTONE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                ModBlocks.GRAY_COLORED_COBBLESTONE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                ModBlocks.YELLOW_COLORED_COBBLESTONE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                ModBlocks.ORANGE_COLORED_COBBLESTONE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE), Ingredient.of(ModItems.RED_SPRAY_CAN),
                ModBlocks.RED_COLORED_COBBLESTONE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                ModBlocks.LIME_COLORED_COBBLESTONE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                ModBlocks.GREEN_COLORED_COBBLESTONE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                ModBlocks.BROWN_COLORED_COBBLESTONE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                ModBlocks.CYAN_COLORED_COBBLESTONE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                ModBlocks.PINK_COLORED_COBBLESTONE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                ModBlocks.PURPLE_COLORED_COBBLESTONE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                ModBlocks.MAGENTA_COLORED_COBBLESTONE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                ModBlocks.BLACK_COLORED_COBBLESTONE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_COBBLESTONE), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                ModBlocks.WHITE_COLORED_COBBLESTONE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ModTags.Items.COLORED_COBBLESTONE)).save(pWriter);


        //Colored Candles

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.CANDLES), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                Blocks.BLUE_CANDLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.CANDLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.CANDLES), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                Blocks.LIGHT_BLUE_CANDLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.CANDLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.CANDLES), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                Blocks.LIGHT_GRAY_CANDLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.CANDLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.CANDLES), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                Blocks.GRAY_CANDLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.CANDLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.CANDLES), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                Blocks.YELLOW_CANDLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.CANDLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.CANDLES), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                Blocks.ORANGE_CANDLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.CANDLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.CANDLES), Ingredient.of(ModItems.RED_SPRAY_CAN),
                Blocks.RED_CANDLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.CANDLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.CANDLES), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                Blocks.LIME_CANDLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.CANDLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.CANDLES), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                Blocks.GREEN_CANDLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.CANDLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.CANDLES), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                Blocks.BROWN_CANDLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.CANDLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.CANDLES), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                Blocks.CYAN_CANDLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.CANDLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.CANDLES), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                Blocks.PINK_CANDLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.CANDLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.CANDLES), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                Blocks.PURPLE_CANDLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.CANDLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.CANDLES), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                Blocks.MAGENTA_CANDLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.CANDLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.CANDLES), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                Blocks.BLACK_CANDLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.CANDLES)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.CANDLES), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                Blocks.WHITE_CANDLE.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.CANDLES)).save(pWriter);

        //Colored Banners

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BANNERS), Ingredient.of(ModItems.BLUE_SPRAY_CAN),
                Blocks.BLUE_BANNER.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.BANNERS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BANNERS), Ingredient.of(ModItems.LIGHT_BLUE_SPRAY_CAN),
                Blocks.LIGHT_BLUE_BANNER.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.BANNERS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BANNERS), Ingredient.of(ModItems.LIGHT_GRAY_SPRAY_CAN),
                Blocks.LIGHT_GRAY_BANNER.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.BANNERS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BANNERS), Ingredient.of(ModItems.GRAY_SPRAY_CAN),
                Blocks.GRAY_BANNER.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.BANNERS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BANNERS), Ingredient.of(ModItems.YELLOW_SPRAY_CAN),
                Blocks.YELLOW_BANNER.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.BANNERS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BANNERS), Ingredient.of(ModItems.ORANGE_SPRAY_CAN),
                Blocks.ORANGE_BANNER.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.BANNERS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BANNERS), Ingredient.of(ModItems.RED_SPRAY_CAN),
                Blocks.RED_BANNER.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.BANNERS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BANNERS), Ingredient.of(ModItems.LIME_SPRAY_CAN),
                Blocks.LIME_BANNER.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.BANNERS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BANNERS), Ingredient.of(ModItems.GREEN_SPRAY_CAN),
                Blocks.GREEN_BANNER.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.BANNERS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BANNERS), Ingredient.of(ModItems.BROWN_SPRAY_CAN),
                Blocks.BROWN_BANNER.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.BANNERS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BANNERS), Ingredient.of(ModItems.CYAN_SPRAY_CAN),
                Blocks.CYAN_BANNER.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.BANNERS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BANNERS), Ingredient.of(ModItems.PINK_SPRAY_CAN),
                Blocks.PINK_BANNER.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.BANNERS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BANNERS), Ingredient.of(ModItems.PURPLE_SPRAY_CAN),
                Blocks.PURPLE_BANNER.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.BANNERS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BANNERS), Ingredient.of(ModItems.MAGENTA_SPRAY_CAN),
                Blocks.MAGENTA_BANNER.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.BANNERS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BANNERS), Ingredient.of(ModItems.BLACK_SPRAY_CAN),
                Blocks.BLACK_BANNER.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.BANNERS)).save(pWriter);

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BANNERS), Ingredient.of(ModItems.WHITE_SPRAY_CAN),
                Blocks.WHITE_BANNER.asItem().getDefaultInstance()).unlockedBy("has_plank_slabs", has(ItemTags.BANNERS)).save(pWriter);

        // ********** REMOVE COLOR ********** //

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.WOOL), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.WHITE_WOOL.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ItemTags.WOOL)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/wool"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.OAK_TRAPDOOR.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.COLORED_WOODEN_PLANK_TRAPDOORS)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/trapdoor"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANKS), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.OAK_PLANKS.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.COLORED_WOODEN_PLANKS)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/planks"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.OAK_STAIRS.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.COLORED_WOODEN_PLANK_STAIRS)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/stairs"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_SLABS), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.OAK_SLAB.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.COLORED_WOODEN_PLANK_SLABS)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/slab"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_FENCES), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.OAK_FENCE.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.COLORED_WOODEN_PLANK_FENCES)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/fence"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_DOORS), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.OAK_DOOR.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.COLORED_WOODEN_PLANK_DOORS)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/door"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.OAK_BUTTON.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.COLORED_WOODEN_PLANK_BUTTONS)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/button"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.OAK_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.COLORED_WOODEN_PLANK_PRESSURE_PLATES)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/pressure_plate"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SIGNS), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.OAK_SIGN.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.COLORED_SIGNS)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/sign"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODS), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.OAK_WOOD.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.COLORED_WOODS)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/wood"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_LOGS), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.OAK_LOG.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.COLORED_LOGS)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/log"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_WOODS), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.STRIPPED_OAK_WOOD.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.STRIPPED_COLORED_WOODS)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/stripped_wood"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.STRIPPED_COLORED_LOGS), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.STRIPPED_OAK_LOG.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.STRIPPED_COLORED_LOGS)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/stripped_log"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_TORCHES), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.TORCH.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.COLORED_TORCHES)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/torch"));


        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.STONE.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.COLORED_STONE)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/stone"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_STAIRS), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.STONE_STAIRS.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.COLORED_STONE_STAIRS)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/stone_stairs"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_SLABS), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.STONE_SLAB.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.COLORED_STONE_SLABS)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/stone_slab"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BUTTONS), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.STONE_BUTTON.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.COLORED_STONE_BUTTONS)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/stone_button"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_PRESSURE_PLATES), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.STONE_PRESSURE_PLATE.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.COLORED_STONE_PRESSURE_PLATES)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/stone_pressure_plate"));


        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICKS), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.STONE_BRICKS.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.COLORED_STONE_BRICKS)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/stone_bricks"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_BRICK_STAIRS), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.STONE_BRICK_STAIRS.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.COLORED_STONE_BRICK_STAIRS)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/stone_brick_stairs"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.SHULKER_BOXES), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.SHULKER_BOX.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.SHULKER_BOXES)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/shulker_box"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_SAPLINGS), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.OAK_SAPLING.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.COLORED_SAPLINGS)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/saplings"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_PANES), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.GLASS_PANE.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(Tags.Items.GLASS_PANES)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/glass_pane"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(Tags.Items.GLASS_BLOCKS), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.GLASS.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(Tags.Items.GLASS_BLOCKS)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/glass"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_DIRT), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.DIRT.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.COLORED_DIRT)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/dirt"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_CONCRETE), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.WHITE_CONCRETE.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.COLORED_CONCRETE)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/concrete"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.COLORED_WOODEN_PLANK_CRAFTING_TABLES)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/crafting_table"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_STONE_CRAFTING_TABLES), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                ModBlocks.STONE_CRAFTING_TABLE.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.COLORED_STONE_CRAFTING_TABLES)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/stone_crafting_table"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.CANDLES), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.CANDLE.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ItemTags.CANDLES)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/candle"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BEDS), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.WHITE_BED.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ItemTags.BEDS)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/bed"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ModTags.Items.COLORED_APPLES), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Items.APPLE.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ModTags.Items.COLORED_APPLES)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/apples"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.BANNERS), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.WHITE_BANNER.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ItemTags.BANNERS)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/banner"));

        SprayerRecipeBuilder.SprayerRecipeBuilder(Ingredient.of(ItemTags.LEAVES), Ingredient.of(ModItems.SPRAY_CAN_REMOVER),
                Blocks.OAK_LEAVES.asItem().getDefaultInstance()).unlockedBy("spray_can_remover", has(ItemTags.LEAVES)).save(pWriter, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "sprayer/spray_can_remover/leaves"));


    }
}
