package com.benbenlaw.caveopolis.data;

import com.benbenlaw.caveopolis.block.ModBlocks;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.crafting.SingleItemRecipe;
import net.minecraft.world.item.crafting.StonecutterRecipe;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        /*

        ShapedRecipeBuilder.shaped(ModBlocks.CYAN_COLORED_STONE_BRICK_WALL.get(), 6).define('E', ModBlocks.CYAN_COLORED_STONE_BRICKS.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CYAN_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.CYAN_COLORED_STONE_WALL.get(), 6).define('E', ModBlocks.CYAN_COLORED_STONE.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CYAN_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.CYAN_COLORED_STONE_BRICK_STAIRS.get(), 4).define('E', ModBlocks.CYAN_COLORED_STONE_BRICKS.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CYAN_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.CYAN_COLORED_STONE_STAIRS.get(), 4).define('E', ModBlocks.CYAN_COLORED_STONE.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CYAN_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.CYAN_COLORED_STONE_BRICK_SLAB.get(), 6).define('E', ModBlocks.CYAN_COLORED_STONE_BRICKS.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CYAN_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.CYAN_COLORED_STONE_SLAB.get(), 6).define('E', ModBlocks.CYAN_COLORED_STONE.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CYAN_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.CYAN_COLORED_STONE_BRICK_WALL.get(), ModBlocks.CYAN_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.CYAN_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.CYAN_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.CYAN_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.CYAN_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.CYAN_COLORED_STONE_WALL.get(), ModBlocks.CYAN_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.CYAN_COLORED_STONE_SLAB.get(), ModBlocks.CYAN_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.CYAN_COLORED_STONE_STAIRS.get(), ModBlocks.CYAN_COLORED_STONE.get(), 1);
        
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.CYAN_COLORED_STONE_BRICKS.get(), ModBlocks.CYAN_COLORED_STONE.get(), 1);
        ShapedRecipeBuilder.shaped(ModBlocks.CYAN_COLORED_STONE_BRICKS.get(), 4).define('E', ModBlocks.CYAN_COLORED_STONE.get()).pattern("EE").pattern("EE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CYAN_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);



        ShapedRecipeBuilder.shaped(ModBlocks.BLUE_COLORED_STONE_BRICK_WALL.get(), 6).define('E', ModBlocks.BLUE_COLORED_STONE_BRICKS.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLUE_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.BLUE_COLORED_STONE_WALL.get(), 6).define('E', ModBlocks.BLUE_COLORED_STONE.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLUE_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.BLUE_COLORED_STONE_BRICK_STAIRS.get(), 4).define('E', ModBlocks.BLUE_COLORED_STONE_BRICKS.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLUE_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.BLUE_COLORED_STONE_STAIRS.get(), 4).define('E', ModBlocks.BLUE_COLORED_STONE.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLUE_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.BLUE_COLORED_STONE_BRICK_SLAB.get(), 6).define('E', ModBlocks.BLUE_COLORED_STONE_BRICKS.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLUE_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.BLUE_COLORED_STONE_SLAB.get(), 6).define('E', ModBlocks.BLUE_COLORED_STONE.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLUE_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.BLUE_COLORED_STONE_BRICK_WALL.get(), ModBlocks.BLUE_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.BLUE_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.BLUE_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.BLUE_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.BLUE_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.BLUE_COLORED_STONE_WALL.get(), ModBlocks.BLUE_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.BLUE_COLORED_STONE_SLAB.get(), ModBlocks.BLUE_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.BLUE_COLORED_STONE_STAIRS.get(), ModBlocks.BLUE_COLORED_STONE.get(), 1);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.BLUE_COLORED_STONE_BRICKS.get(), ModBlocks.BLUE_COLORED_STONE.get(), 1);
        ShapedRecipeBuilder.shaped(ModBlocks.BLUE_COLORED_STONE_BRICKS.get(), 4).define('E', ModBlocks.BLUE_COLORED_STONE.get()).pattern("EE").pattern("EE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLUE_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);




        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_WALL.get(), 6).define('E', ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_BLUE_COLORED_STONE_WALL.get(), 6).define('E', ModBlocks.LIGHT_BLUE_COLORED_STONE.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_BLUE_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_STAIRS.get(), 4).define('E', ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_BLUE_COLORED_STONE_STAIRS.get(), 4).define('E', ModBlocks.LIGHT_BLUE_COLORED_STONE.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_BLUE_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_SLAB.get(), 6).define('E', ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_BLUE_COLORED_STONE_SLAB.get(), 6).define('E', ModBlocks.LIGHT_BLUE_COLORED_STONE.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_BLUE_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_WALL.get(), ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.LIGHT_BLUE_COLORED_STONE_WALL.get(), ModBlocks.LIGHT_BLUE_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.LIGHT_BLUE_COLORED_STONE_SLAB.get(), ModBlocks.LIGHT_BLUE_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.LIGHT_BLUE_COLORED_STONE_STAIRS.get(), ModBlocks.LIGHT_BLUE_COLORED_STONE.get(), 1);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get(), ModBlocks.LIGHT_BLUE_COLORED_STONE.get(), 1);
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get(), 4).define('E', ModBlocks.LIGHT_BLUE_COLORED_STONE.get()).pattern("EE").pattern("EE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_BLUE_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);



        ShapedRecipeBuilder.shaped(ModBlocks.GREEN_COLORED_STONE_BRICK_WALL.get(), 6).define('E', ModBlocks.GREEN_COLORED_STONE_BRICKS.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GREEN_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.GREEN_COLORED_STONE_WALL.get(), 6).define('E', ModBlocks.GREEN_COLORED_STONE.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GREEN_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.GREEN_COLORED_STONE_BRICK_STAIRS.get(), 4).define('E', ModBlocks.GREEN_COLORED_STONE_BRICKS.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GREEN_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.GREEN_COLORED_STONE_STAIRS.get(), 4).define('E', ModBlocks.GREEN_COLORED_STONE.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GREEN_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.GREEN_COLORED_STONE_BRICK_SLAB.get(), 6).define('E', ModBlocks.GREEN_COLORED_STONE_BRICKS.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GREEN_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.GREEN_COLORED_STONE_SLAB.get(), 6).define('E', ModBlocks.GREEN_COLORED_STONE.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GREEN_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.GREEN_COLORED_STONE_BRICK_WALL.get(), ModBlocks.GREEN_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.GREEN_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.GREEN_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.GREEN_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.GREEN_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.GREEN_COLORED_STONE_WALL.get(), ModBlocks.GREEN_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.GREEN_COLORED_STONE_SLAB.get(), ModBlocks.GREEN_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.GREEN_COLORED_STONE_STAIRS.get(), ModBlocks.GREEN_COLORED_STONE.get(), 1);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.GREEN_COLORED_STONE_BRICKS.get(), ModBlocks.GREEN_COLORED_STONE.get(), 1);
        ShapedRecipeBuilder.shaped(ModBlocks.GREEN_COLORED_STONE_BRICKS.get(), 4).define('E', ModBlocks.GREEN_COLORED_STONE.get()).pattern("EE").pattern("EE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GREEN_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);



        ShapedRecipeBuilder.shaped(ModBlocks.YELLOW_COLORED_STONE_BRICK_WALL.get(), 6).define('E', ModBlocks.YELLOW_COLORED_STONE_BRICKS.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.YELLOW_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.YELLOW_COLORED_STONE_WALL.get(), 6).define('E', ModBlocks.YELLOW_COLORED_STONE.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.YELLOW_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.YELLOW_COLORED_STONE_BRICK_STAIRS.get(), 4).define('E', ModBlocks.YELLOW_COLORED_STONE_BRICKS.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.YELLOW_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.YELLOW_COLORED_STONE_STAIRS.get(), 4).define('E', ModBlocks.YELLOW_COLORED_STONE.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.YELLOW_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.YELLOW_COLORED_STONE_BRICK_SLAB.get(), 6).define('E', ModBlocks.YELLOW_COLORED_STONE_BRICKS.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.YELLOW_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.YELLOW_COLORED_STONE_SLAB.get(), 6).define('E', ModBlocks.YELLOW_COLORED_STONE.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.YELLOW_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.YELLOW_COLORED_STONE_BRICK_WALL.get(), ModBlocks.YELLOW_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.YELLOW_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.YELLOW_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.YELLOW_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.YELLOW_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.YELLOW_COLORED_STONE_WALL.get(), ModBlocks.YELLOW_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.YELLOW_COLORED_STONE_SLAB.get(), ModBlocks.YELLOW_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.YELLOW_COLORED_STONE_STAIRS.get(), ModBlocks.YELLOW_COLORED_STONE.get(), 1);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.YELLOW_COLORED_STONE_BRICKS.get(), ModBlocks.YELLOW_COLORED_STONE.get(), 1);
        ShapedRecipeBuilder.shaped(ModBlocks.YELLOW_COLORED_STONE_BRICKS.get(), 4).define('E', ModBlocks.YELLOW_COLORED_STONE.get()).pattern("EE").pattern("EE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.YELLOW_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        
        

        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_COLORED_STONE_BRICK_WALL.get(), 6).define('E', ModBlocks.GRAY_COLORED_STONE_BRICKS.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_COLORED_STONE_WALL.get(), 6).define('E', ModBlocks.GRAY_COLORED_STONE.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_COLORED_STONE_BRICK_STAIRS.get(), 4).define('E', ModBlocks.GRAY_COLORED_STONE_BRICKS.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_COLORED_STONE_STAIRS.get(), 4).define('E', ModBlocks.GRAY_COLORED_STONE.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_COLORED_STONE_BRICK_SLAB.get(), 6).define('E', ModBlocks.GRAY_COLORED_STONE_BRICKS.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_COLORED_STONE_SLAB.get(), 6).define('E', ModBlocks.GRAY_COLORED_STONE.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.GRAY_COLORED_STONE_BRICK_WALL.get(), ModBlocks.GRAY_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.GRAY_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.GRAY_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.GRAY_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.GRAY_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.GRAY_COLORED_STONE_WALL.get(), ModBlocks.GRAY_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.GRAY_COLORED_STONE_SLAB.get(), ModBlocks.GRAY_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.GRAY_COLORED_STONE_STAIRS.get(), ModBlocks.GRAY_COLORED_STONE.get(), 1);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.GRAY_COLORED_STONE_BRICKS.get(), ModBlocks.GRAY_COLORED_STONE.get(), 1);
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_COLORED_STONE_BRICKS.get(), 4).define('E', ModBlocks.GRAY_COLORED_STONE.get()).pattern("EE").pattern("EE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.GRAY_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);



        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_WALL.get(), 6).define('E', ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_GRAY_COLORED_STONE_WALL.get(), 6).define('E', ModBlocks.LIGHT_GRAY_COLORED_STONE.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_GRAY_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_STAIRS.get(), 4).define('E', ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_GRAY_COLORED_STONE_STAIRS.get(), 4).define('E', ModBlocks.LIGHT_GRAY_COLORED_STONE.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_GRAY_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_SLAB.get(), 6).define('E', ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_GRAY_COLORED_STONE_SLAB.get(), 6).define('E', ModBlocks.LIGHT_GRAY_COLORED_STONE.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_GRAY_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_WALL.get(), ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.LIGHT_GRAY_COLORED_STONE_WALL.get(), ModBlocks.LIGHT_GRAY_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.LIGHT_GRAY_COLORED_STONE_SLAB.get(), ModBlocks.LIGHT_GRAY_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.LIGHT_GRAY_COLORED_STONE_STAIRS.get(), ModBlocks.LIGHT_GRAY_COLORED_STONE.get(), 1);


        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get(), ModBlocks.LIGHT_GRAY_COLORED_STONE.get(), 1);
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get(), 4).define('E', ModBlocks.LIGHT_GRAY_COLORED_STONE.get()).pattern("EE").pattern("EE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIGHT_GRAY_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);



        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_COLORED_STONE_BRICK_WALL.get(), 6).define('E', ModBlocks.WHITE_COLORED_STONE_BRICKS.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_COLORED_STONE_WALL.get(), 6).define('E', ModBlocks.WHITE_COLORED_STONE.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_COLORED_STONE_BRICK_STAIRS.get(), 4).define('E', ModBlocks.WHITE_COLORED_STONE_BRICKS.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_COLORED_STONE_STAIRS.get(), 4).define('E', ModBlocks.WHITE_COLORED_STONE.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_COLORED_STONE_BRICK_SLAB.get(), 6).define('E', ModBlocks.WHITE_COLORED_STONE_BRICKS.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_COLORED_STONE_SLAB.get(), 6).define('E', ModBlocks.WHITE_COLORED_STONE.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.WHITE_COLORED_STONE_BRICK_WALL.get(), ModBlocks.WHITE_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.WHITE_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.WHITE_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.WHITE_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.WHITE_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.WHITE_COLORED_STONE_WALL.get(), ModBlocks.WHITE_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.WHITE_COLORED_STONE_SLAB.get(), ModBlocks.WHITE_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.WHITE_COLORED_STONE_STAIRS.get(), ModBlocks.WHITE_COLORED_STONE.get(), 1);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.WHITE_COLORED_STONE_BRICKS.get(), ModBlocks.WHITE_COLORED_STONE.get(), 1);
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_COLORED_STONE_BRICKS.get(), 4).define('E', ModBlocks.WHITE_COLORED_STONE.get()).pattern("EE").pattern("EE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.WHITE_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);



        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_COLORED_STONE_BRICK_WALL.get(), 6).define('E', ModBlocks.ORANGE_COLORED_STONE_BRICKS.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_COLORED_STONE_WALL.get(), 6).define('E', ModBlocks.ORANGE_COLORED_STONE.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_COLORED_STONE_BRICK_STAIRS.get(), 4).define('E', ModBlocks.ORANGE_COLORED_STONE_BRICKS.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_COLORED_STONE_STAIRS.get(), 4).define('E', ModBlocks.ORANGE_COLORED_STONE.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_COLORED_STONE_BRICK_SLAB.get(), 6).define('E', ModBlocks.ORANGE_COLORED_STONE_BRICKS.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_COLORED_STONE_SLAB.get(), 6).define('E', ModBlocks.ORANGE_COLORED_STONE.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.ORANGE_COLORED_STONE_BRICK_WALL.get(), ModBlocks.ORANGE_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.ORANGE_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.ORANGE_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.ORANGE_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.ORANGE_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.ORANGE_COLORED_STONE_WALL.get(), ModBlocks.ORANGE_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.ORANGE_COLORED_STONE_SLAB.get(), ModBlocks.ORANGE_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.ORANGE_COLORED_STONE_STAIRS.get(), ModBlocks.ORANGE_COLORED_STONE.get(), 1);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.ORANGE_COLORED_STONE_BRICKS.get(), ModBlocks.ORANGE_COLORED_STONE.get(), 1);
        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_COLORED_STONE_BRICKS.get(), 4).define('E', ModBlocks.ORANGE_COLORED_STONE.get()).pattern("EE").pattern("EE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORANGE_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);

        

        ShapedRecipeBuilder.shaped(ModBlocks.PINK_COLORED_STONE_BRICK_WALL.get(), 6).define('E', ModBlocks.PINK_COLORED_STONE_BRICKS.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_COLORED_STONE_WALL.get(), 6).define('E', ModBlocks.PINK_COLORED_STONE.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_COLORED_STONE_BRICK_STAIRS.get(), 4).define('E', ModBlocks.PINK_COLORED_STONE_BRICKS.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_COLORED_STONE_STAIRS.get(), 4).define('E', ModBlocks.PINK_COLORED_STONE.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_COLORED_STONE_BRICK_SLAB.get(), 6).define('E', ModBlocks.PINK_COLORED_STONE_BRICKS.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_COLORED_STONE_SLAB.get(), 6).define('E', ModBlocks.PINK_COLORED_STONE.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.PINK_COLORED_STONE_BRICK_WALL.get(), ModBlocks.PINK_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.PINK_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.PINK_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.PINK_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.PINK_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.PINK_COLORED_STONE_WALL.get(), ModBlocks.PINK_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.PINK_COLORED_STONE_SLAB.get(), ModBlocks.PINK_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.PINK_COLORED_STONE_STAIRS.get(), ModBlocks.PINK_COLORED_STONE.get(), 1);
        
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.PINK_COLORED_STONE_BRICKS.get(), ModBlocks.PINK_COLORED_STONE.get(), 1);
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_COLORED_STONE_BRICKS.get(), 4).define('E', ModBlocks.PINK_COLORED_STONE.get()).pattern("EE").pattern("EE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PINK_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);



        ShapedRecipeBuilder.shaped(ModBlocks.LIME_COLORED_STONE_BRICK_WALL.get(), 6).define('E', ModBlocks.LIME_COLORED_STONE_BRICKS.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIME_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIME_COLORED_STONE_WALL.get(), 6).define('E', ModBlocks.LIME_COLORED_STONE.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIME_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIME_COLORED_STONE_BRICK_STAIRS.get(), 4).define('E', ModBlocks.LIME_COLORED_STONE_BRICKS.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIME_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIME_COLORED_STONE_STAIRS.get(), 4).define('E', ModBlocks.LIME_COLORED_STONE.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIME_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIME_COLORED_STONE_BRICK_SLAB.get(), 6).define('E', ModBlocks.LIME_COLORED_STONE_BRICKS.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIME_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIME_COLORED_STONE_SLAB.get(), 6).define('E', ModBlocks.LIME_COLORED_STONE.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIME_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.LIME_COLORED_STONE_BRICK_WALL.get(), ModBlocks.LIME_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.LIME_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.LIME_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.LIME_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.LIME_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.LIME_COLORED_STONE_WALL.get(), ModBlocks.LIME_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.LIME_COLORED_STONE_SLAB.get(), ModBlocks.LIME_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.LIME_COLORED_STONE_STAIRS.get(), ModBlocks.LIME_COLORED_STONE.get(), 1);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.LIME_COLORED_STONE_BRICKS.get(), ModBlocks.LIME_COLORED_STONE.get(), 1);
        ShapedRecipeBuilder.shaped(ModBlocks.LIME_COLORED_STONE_BRICKS.get(), 4).define('E', ModBlocks.LIME_COLORED_STONE.get()).pattern("EE").pattern("EE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.LIME_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);



        ShapedRecipeBuilder.shaped(ModBlocks.MAGENTA_COLORED_STONE_BRICK_WALL.get(), 6).define('E', ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.MAGENTA_COLORED_STONE_WALL.get(), 6).define('E', ModBlocks.MAGENTA_COLORED_STONE.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.MAGENTA_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.MAGENTA_COLORED_STONE_BRICK_STAIRS.get(), 4).define('E', ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.MAGENTA_COLORED_STONE_STAIRS.get(), 4).define('E', ModBlocks.MAGENTA_COLORED_STONE.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.MAGENTA_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.MAGENTA_COLORED_STONE_BRICK_SLAB.get(), 6).define('E', ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.MAGENTA_COLORED_STONE_SLAB.get(), 6).define('E', ModBlocks.MAGENTA_COLORED_STONE.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.MAGENTA_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.MAGENTA_COLORED_STONE_BRICK_WALL.get(), ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.MAGENTA_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.MAGENTA_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.MAGENTA_COLORED_STONE_WALL.get(), ModBlocks.MAGENTA_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.MAGENTA_COLORED_STONE_SLAB.get(), ModBlocks.MAGENTA_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.MAGENTA_COLORED_STONE_STAIRS.get(), ModBlocks.MAGENTA_COLORED_STONE.get(), 1);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get(), ModBlocks.MAGENTA_COLORED_STONE.get(), 1);
        ShapedRecipeBuilder.shaped(ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get(), 4).define('E', ModBlocks.MAGENTA_COLORED_STONE.get()).pattern("EE").pattern("EE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.MAGENTA_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);



        ShapedRecipeBuilder.shaped(ModBlocks.PURPLE_COLORED_STONE_BRICK_WALL.get(), 6).define('E', ModBlocks.PURPLE_COLORED_STONE_BRICKS.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PURPLE_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.PURPLE_COLORED_STONE_WALL.get(), 6).define('E', ModBlocks.PURPLE_COLORED_STONE.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PURPLE_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.PURPLE_COLORED_STONE_BRICK_STAIRS.get(), 4).define('E', ModBlocks.PURPLE_COLORED_STONE_BRICKS.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PURPLE_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.PURPLE_COLORED_STONE_STAIRS.get(), 4).define('E', ModBlocks.PURPLE_COLORED_STONE.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PURPLE_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.PURPLE_COLORED_STONE_BRICK_SLAB.get(), 6).define('E', ModBlocks.PURPLE_COLORED_STONE_BRICKS.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PURPLE_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.PURPLE_COLORED_STONE_SLAB.get(), 6).define('E', ModBlocks.PURPLE_COLORED_STONE.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PURPLE_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.PURPLE_COLORED_STONE_BRICK_WALL.get(), ModBlocks.PURPLE_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.PURPLE_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.PURPLE_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.PURPLE_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.PURPLE_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.PURPLE_COLORED_STONE_WALL.get(), ModBlocks.PURPLE_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.PURPLE_COLORED_STONE_SLAB.get(), ModBlocks.PURPLE_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.PURPLE_COLORED_STONE_STAIRS.get(), ModBlocks.PURPLE_COLORED_STONE.get(), 1);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.PURPLE_COLORED_STONE_BRICKS.get(), ModBlocks.PURPLE_COLORED_STONE.get(), 1);
        ShapedRecipeBuilder.shaped(ModBlocks.PURPLE_COLORED_STONE_BRICKS.get(), 4).define('E', ModBlocks.PURPLE_COLORED_STONE.get()).pattern("EE").pattern("EE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.PURPLE_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);



        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_COLORED_STONE_BRICK_WALL.get(), 6).define('E', ModBlocks.BROWN_COLORED_STONE_BRICKS.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_COLORED_STONE_WALL.get(), 6).define('E', ModBlocks.BROWN_COLORED_STONE.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_COLORED_STONE_BRICK_STAIRS.get(), 4).define('E', ModBlocks.BROWN_COLORED_STONE_BRICKS.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_COLORED_STONE_STAIRS.get(), 4).define('E', ModBlocks.BROWN_COLORED_STONE.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_COLORED_STONE_BRICK_SLAB.get(), 6).define('E', ModBlocks.BROWN_COLORED_STONE_BRICKS.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_COLORED_STONE_SLAB.get(), 6).define('E', ModBlocks.BROWN_COLORED_STONE.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.BROWN_COLORED_STONE_BRICK_WALL.get(), ModBlocks.BROWN_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.BROWN_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.BROWN_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.BROWN_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.BROWN_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.BROWN_COLORED_STONE_WALL.get(), ModBlocks.BROWN_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.BROWN_COLORED_STONE_SLAB.get(), ModBlocks.BROWN_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.BROWN_COLORED_STONE_STAIRS.get(), ModBlocks.BROWN_COLORED_STONE.get(), 1);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.BROWN_COLORED_STONE_BRICKS.get(), ModBlocks.BROWN_COLORED_STONE.get(), 1);
        ShapedRecipeBuilder.shaped(ModBlocks.BROWN_COLORED_STONE_BRICKS.get(), 4).define('E', ModBlocks.BROWN_COLORED_STONE.get()).pattern("EE").pattern("EE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BROWN_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);



        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_COLORED_STONE_BRICK_WALL.get(), 6).define('E', ModBlocks.BLACK_COLORED_STONE_BRICKS.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_COLORED_STONE_WALL.get(), 6).define('E', ModBlocks.BLACK_COLORED_STONE.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_COLORED_STONE_BRICK_STAIRS.get(), 4).define('E', ModBlocks.BLACK_COLORED_STONE_BRICKS.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_COLORED_STONE_STAIRS.get(), 4).define('E', ModBlocks.BLACK_COLORED_STONE.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_COLORED_STONE_BRICK_SLAB.get(), 6).define('E', ModBlocks.BLACK_COLORED_STONE_BRICKS.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_COLORED_STONE_SLAB.get(), 6).define('E', ModBlocks.BLACK_COLORED_STONE.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.BLACK_COLORED_STONE_BRICK_WALL.get(), ModBlocks.BLACK_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.BLACK_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.BLACK_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.BLACK_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.BLACK_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.BLACK_COLORED_STONE_WALL.get(), ModBlocks.BLACK_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.BLACK_COLORED_STONE_SLAB.get(), ModBlocks.BLACK_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.BLACK_COLORED_STONE_STAIRS.get(), ModBlocks.BLACK_COLORED_STONE.get(), 1);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.BLACK_COLORED_STONE_BRICKS.get(), ModBlocks.BLACK_COLORED_STONE.get(), 1);
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_COLORED_STONE_BRICKS.get(), 4).define('E', ModBlocks.BLACK_COLORED_STONE.get()).pattern("EE").pattern("EE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.BLACK_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);

        
        
        ShapedRecipeBuilder.shaped(ModBlocks.RED_COLORED_STONE_BRICK_WALL.get(), 6).define('E', ModBlocks.RED_COLORED_STONE_BRICKS.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.RED_COLORED_STONE_WALL.get(), 6).define('E', ModBlocks.RED_COLORED_STONE.get()).pattern("EEE").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.RED_COLORED_STONE_BRICK_STAIRS.get(), 4).define('E', ModBlocks.RED_COLORED_STONE_BRICKS.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.RED_COLORED_STONE_STAIRS.get(), 4).define('E', ModBlocks.RED_COLORED_STONE.get()).pattern("E  ").pattern("EE ").pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.RED_COLORED_STONE_BRICK_SLAB.get(), 6).define('E', ModBlocks.RED_COLORED_STONE_BRICKS.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_COLORED_STONE_BRICKS.get()).build())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.RED_COLORED_STONE_SLAB.get(), 6).define('E', ModBlocks.RED_COLORED_STONE.get()).pattern("EEE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.RED_COLORED_STONE_BRICK_WALL.get(), ModBlocks.RED_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.RED_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.RED_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.RED_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.RED_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.RED_COLORED_STONE_WALL.get(), ModBlocks.RED_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.RED_COLORED_STONE_SLAB.get(), ModBlocks.RED_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.RED_COLORED_STONE_STAIRS.get(), ModBlocks.RED_COLORED_STONE.get(), 1);

        stonecutterResultFromBase(pFinishedRecipeConsumer, ModBlocks.RED_COLORED_STONE_BRICKS.get(), ModBlocks.RED_COLORED_STONE.get(), 1);
        ShapedRecipeBuilder.shaped(ModBlocks.RED_COLORED_STONE_BRICKS.get(), 4).define('E', ModBlocks.RED_COLORED_STONE.get()).pattern("EE").pattern("EE").unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.RED_COLORED_STONE.get()).build())).save(pFinishedRecipeConsumer);






         */



    }
}
