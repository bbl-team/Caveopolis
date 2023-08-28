package com.benbenlaw.caveopolis.data;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.ModBlocks;
import com.benbenlaw.caveopolis.data.custom.SprayerRecipeBuilder;
import com.benbenlaw.caveopolis.item.ModItems;
import com.benbenlaw.caveopolis.util.ModTags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    private final List<ItemLike> MIXED_STONE_SMELTABLES = List.of(ModItems.RAW_MIXED_STONE.get(), ModBlocks.MIXED_STONE_ORE.get(), ModBlocks.DEEPSLATE_MIXED_STONE_ORE.get());
    private final List<ItemLike> BRIGHT_STONE_SMELTABLES = List.of(ModBlocks.BRIGHT_STONE_ORE.get(), ModBlocks.DEEPSLATE_BRIGHT_STONE_ORE.get());

    public ModRecipeProvider(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    public CompletableFuture<?> run(CachedOutput p_254020_) {
        return super.run(p_254020_);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        //MISC
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STONE_CRAFTING_TABLE.get())
                .pattern("AA")
                .pattern("AA")
                .define('A', ModTags.Items.COLORED_STONE_BRICKS)
                .unlockedBy("has_colored_stone_bricks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModTags.Items.COLORED_STONE_BRICKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.GREEN_WOOL)
                .pattern("AA")
                .pattern("AA")
                .define('A', ModItems.MOSSY_STRING.get())
                .unlockedBy("has_mossy_string", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.MOSSY_STRING.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STONE_TORCH.get())
                .pattern("A")
                .pattern("B")
                .define('A', ItemTags.COALS)
                .define('B', ModTags.Items.RODS_STONE)
                .unlockedBy("has_stone_rod", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModTags.Items.RODS_STONE).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STONE_STICK.get())
                .pattern("A")
                .pattern("A")
                .define('A', Tags.Items.STONE)
                .unlockedBy("has_stone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Tags.Items.STONE).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MOSSY_STRING.get())
                .pattern("AAA")
                .define('A', Blocks.MOSS_CARPET.asItem())
                .unlockedBy("has_moss", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Blocks.MOSS_CARPET).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.MOSS_BLOCK)
                .pattern("AA")
                .pattern("AA")
                .define('A', ModItems.MOSS_BALL.get())
                .unlockedBy("has_moss_ball", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.MOSS_BALL.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BLACK_SPRAY_CAN.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern("ABA")
                .define('A', ModItems.MIXED_STONE_INGOT.get())
                .define('B', Tags.Items.DYES_BLACK)
                .unlockedBy("has_mixed_stone_ingot", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.MIXED_STONE_INGOT.get()).build()))
                .save(pWriter);

       // ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BLACK_SPRAY_CAN.get()).requires(ModItems.BLACK_SPRAY_CAN.get()).requires(Tags.Items.DYES_BLACK)
       //         .unlockedBy("has_spray_can", inventoryTrigger(ItemPredicate.Builder.item().of(ModTags.Items.SPRAY_CANS).build())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BLUE_SPRAY_CAN.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern("ABA")
                .define('A', ModItems.MIXED_STONE_INGOT.get())
                .define('B', Tags.Items.DYES_BLUE)
                .unlockedBy("has_mixed_stone_ingot", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.MIXED_STONE_INGOT.get()).build()))
                .save(pWriter);

        //  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BLUE_SPRAY_CAN.get()).requires(ModItems.BLUE_SPRAY_CAN.get(), 1).requires(Tags.Items.DYES_BLUE)
        //          .unlockedBy("has_spray_can", inventoryTrigger(ItemPredicate.Builder.item().of(ModTags.Items.SPRAY_CANS).build())).save(pWriter);

          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BROWN_SPRAY_CAN.get())
                  .pattern(" A ")
                  .pattern("ABA")
                  .pattern("ABA")
                  .define('A', ModItems.MIXED_STONE_INGOT.get())
                  .define('B', Tags.Items.DYES_BROWN)
                  .unlockedBy("has_mixed_stone_ingot", inventoryTrigger(ItemPredicate.Builder.item().
                          of(ModItems.MIXED_STONE_INGOT.get()).build()))
                  .save(pWriter);
        //  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BROWN_SPRAY_CAN.get()).requires(ModItems.BROWN_SPRAY_CAN.get(), 1).requires(Tags.Items.DYES_BROWN)
        //          .unlockedBy("has_spray_can", inventoryTrigger(ItemPredicate.Builder.item().of(ModTags.Items.SPRAY_CANS).build())).save(pWriter);

          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MAGENTA_SPRAY_CAN.get())
                  .pattern(" A ")
                  .pattern("ABA")
                  .pattern("ABA")
                  .define('A', ModItems.MIXED_STONE_INGOT.get())
                  .define('B', Tags.Items.DYES_MAGENTA)
                  .unlockedBy("has_mixed_stone_ingot", inventoryTrigger(ItemPredicate.Builder.item().
                          of(ModItems.MIXED_STONE_INGOT.get()).build()))
                  .save(pWriter);
        //  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MAGENTA_SPRAY_CAN.get()).requires(ModItems.MAGENTA_SPRAY_CAN.get(), 1).requires(Tags.Items.DYES_MAGENTA)
        //          .unlockedBy("has_spray_can", inventoryTrigger(ItemPredicate.Builder.item().of(ModTags.Items.SPRAY_CANS).build())).save(pWriter);

          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PURPLE_SPRAY_CAN.get())
                  .pattern(" A ")
                  .pattern("ABA")
                  .pattern("ABA")
                  .define('A', ModItems.MIXED_STONE_INGOT.get())
                  .define('B', Tags.Items.DYES_PURPLE)
                  .unlockedBy("has_mixed_stone_ingot", inventoryTrigger(ItemPredicate.Builder.item().
                          of(ModItems.MIXED_STONE_INGOT.get()).build()))
                  .save(pWriter);
        //  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PURPLE_SPRAY_CAN.get()).requires(ModItems.PURPLE_SPRAY_CAN.get(), 1).requires(Tags.Items.DYES_PURPLE)
        //          .unlockedBy("has_spray_can", inventoryTrigger(ItemPredicate.Builder.item().of(ModTags.Items.SPRAY_CANS).build())).save(pWriter);

          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WHTIE_SPRAY_CAN.get())
                  .pattern(" A ")
                  .pattern("ABA")
                  .pattern("ABA")
                  .define('A', ModItems.MIXED_STONE_INGOT.get())
                  .define('B', Tags.Items.DYES_WHITE)
                  .unlockedBy("has_mixed_stone_ingot", inventoryTrigger(ItemPredicate.Builder.item().
                          of(ModItems.MIXED_STONE_INGOT.get()).build()))
                  .save(pWriter);
         // ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.WHTIE_SPRAY_CAN.get()).requires(ModItems.WHTIE_SPRAY_CAN.get(), 1).requires(Tags.Items.DYES_WHITE)
        //          .unlockedBy("has_spray_can", inventoryTrigger(ItemPredicate.Builder.item().of(ModTags.Items.SPRAY_CANS).build())).save(pWriter);

          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.YELLOW_SPRAY_CAN.get())
                  .pattern(" A ")
                  .pattern("ABA")
                  .pattern("ABA")
                  .define('A', ModItems.MIXED_STONE_INGOT.get())
                  .define('B', Tags.Items.DYES_YELLOW)
                  .unlockedBy("has_mixed_stone_ingot", inventoryTrigger(ItemPredicate.Builder.item().
                          of(ModItems.MIXED_STONE_INGOT.get()).build()))
                  .save(pWriter);
        //  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.YELLOW_SPRAY_CAN.get()).requires(ModItems.YELLOW_SPRAY_CAN.get(), 1).requires(Tags.Items.DYES_YELLOW)
        //          .unlockedBy("has_spray_can", inventoryTrigger(ItemPredicate.Builder.item().of(ModTags.Items.SPRAY_CANS).build())).save(pWriter);

          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LIGHT_GRAY_SPRAY_CAN.get())
                  .pattern(" A ")
                  .pattern("ABA")
                  .pattern("ABA")
                  .define('A', ModItems.MIXED_STONE_INGOT.get())
                  .define('B', Tags.Items.DYES_LIGHT_GRAY)
                  .unlockedBy("has_mixed_stone_ingot", inventoryTrigger(ItemPredicate.Builder.item().
                          of(ModItems.MIXED_STONE_INGOT.get()).build()))
                  .save(pWriter);
        //  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LIGHT_GRAY_SPRAY_CAN.get()).requires(ModItems.LIGHT_GRAY_SPRAY_CAN.get(), 1).requires(Tags.Items.DYES_LIGHT_GRAY)
        //          .unlockedBy("has_spray_can", inventoryTrigger(ItemPredicate.Builder.item().of(ModTags.Items.SPRAY_CANS).build())).save(pWriter);

          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LIGHT_BLUE_SPRAY_CAN.get())
                  .pattern(" A ")
                  .pattern("ABA")
                  .pattern("ABA")
                  .define('A', ModItems.MIXED_STONE_INGOT.get())
                  .define('B', Tags.Items.DYES_LIGHT_BLUE)
                  .unlockedBy("has_mixed_stone_ingot", inventoryTrigger(ItemPredicate.Builder.item().
                          of(ModItems.MIXED_STONE_INGOT.get()).build()))
                  .save(pWriter);
        //  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LIGHT_BLUE_SPRAY_CAN.get()).requires(ModItems.LIGHT_BLUE_SPRAY_CAN.get(), 1).requires(Tags.Items.DYES_LIGHT_BLUE)
         //         .unlockedBy("has_spray_can", inventoryTrigger(ItemPredicate.Builder.item().of(ModTags.Items.SPRAY_CANS).build())).save(pWriter);

          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GRAY_SPRAY_CAN.get())
                  .pattern(" A ")
                  .pattern("ABA")
                  .pattern("ABA")
                  .define('A', ModItems.MIXED_STONE_INGOT.get())
                  .define('B', Tags.Items.DYES_GRAY)
                  .unlockedBy("has_mixed_stone_ingot", inventoryTrigger(ItemPredicate.Builder.item().
                          of(ModItems.MIXED_STONE_INGOT.get()).build()))
                  .save(pWriter);
        //  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GRAY_SPRAY_CAN.get()).requires(ModItems.GRAY_SPRAY_CAN.get(), 1).requires(Tags.Items.DYES_GRAY)
        //          .unlockedBy("has_spray_can", inventoryTrigger(ItemPredicate.Builder.item().of(ModTags.Items.SPRAY_CANS).build())).save(pWriter);

          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PINK_SPRAY_CAN.get())
                  .pattern(" A ")
                  .pattern("ABA")
                  .pattern("ABA")
                  .define('A', ModItems.MIXED_STONE_INGOT.get())
                  .define('B', Tags.Items.DYES_PINK)
                  .unlockedBy("has_mixed_stone_ingot", inventoryTrigger(ItemPredicate.Builder.item().
                          of(ModItems.MIXED_STONE_INGOT.get()).build()))
                  .save(pWriter);
        //  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PINK_SPRAY_CAN.get()).requires(ModItems.PINK_SPRAY_CAN.get(), 1).requires(Tags.Items.DYES_PINK)
        //          .unlockedBy("has_spray_can", inventoryTrigger(ItemPredicate.Builder.item().of(ModTags.Items.SPRAY_CANS).build())).save(pWriter);

          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RED_SPRAY_CAN.get())
                  .pattern(" A ")
                  .pattern("ABA")
                  .pattern("ABA")
                  .define('A', ModItems.MIXED_STONE_INGOT.get())
                  .define('B', Tags.Items.DYES_RED)
                  .unlockedBy("has_mixed_stone_ingot", inventoryTrigger(ItemPredicate.Builder.item().
                          of(ModItems.MIXED_STONE_INGOT.get()).build()))
                  .save(pWriter);
        //  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RED_SPRAY_CAN.get()).requires(ModItems.RED_SPRAY_CAN.get(), 1).requires(Tags.Items.DYES_RED)
        //          .unlockedBy("has_spray_can", inventoryTrigger(ItemPredicate.Builder.item().of(ModTags.Items.SPRAY_CANS).build())).save(pWriter);

          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ORANGE_SPRAY_CAN.get())
                  .pattern(" A ")
                  .pattern("ABA")
                  .pattern("ABA")
                  .define('A', ModItems.MIXED_STONE_INGOT.get())
                  .define('B', Tags.Items.DYES_ORANGE)
                  .unlockedBy("has_mixed_stone_ingot", inventoryTrigger(ItemPredicate.Builder.item().
                          of(ModItems.MIXED_STONE_INGOT.get()).build()))
                  .save(pWriter);
        //  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ORANGE_SPRAY_CAN.get()).requires(ModItems.ORANGE_SPRAY_CAN.get(), 1).requires(Tags.Items.DYES_ORANGE)
        //          .unlockedBy("has_spray_can", inventoryTrigger(ItemPredicate.Builder.item().of(ModTags.Items.SPRAY_CANS).build())).save(pWriter);

          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GREEN_SPRAY_CAN.get())
              .pattern(" A ")
              .pattern("ABA")
              .pattern("ABA")
              .define('A', ModItems.MIXED_STONE_INGOT.get())
              .define('B', Tags.Items.DYES_GREEN)
              .unlockedBy("has_mixed_stone_ingot", inventoryTrigger(ItemPredicate.Builder.item().
                      of(ModItems.MIXED_STONE_INGOT.get()).build()))
              .save(pWriter);
       //  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GREEN_SPRAY_CAN.get()).requires(ModItems.GREEN_SPRAY_CAN.get(), 1).requires(Tags.Items.DYES_GREEN)
        //      .unlockedBy("has_spray_can", inventoryTrigger(ItemPredicate.Builder.item().of(ModTags.Items.SPRAY_CANS).build())).save(pWriter);

          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LIME_SPRAY_CAN.get())
              .pattern(" A ")
              .pattern("ABA")
              .pattern("ABA")
              .define('A', ModItems.MIXED_STONE_INGOT.get())
              .define('B', Tags.Items.DYES_LIME)
              .unlockedBy("has_mixed_stone_ingot", inventoryTrigger(ItemPredicate.Builder.item().
                      of(ModItems.MIXED_STONE_INGOT.get()).build()))
              .save(pWriter);
        //  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LIME_SPRAY_CAN.get()).requires(ModItems.LIME_SPRAY_CAN.get(), 1).requires(Tags.Items.DYES_LIME)
        //      .unlockedBy("has_spray_can", inventoryTrigger(ItemPredicate.Builder.item().of(ModTags.Items.SPRAY_CANS).build())).save(pWriter);

          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CYAN_SPRAY_CAN.get())
              .pattern(" A ")
              .pattern("ABA")
              .pattern("ABA")
              .define('A', ModItems.MIXED_STONE_INGOT.get())
              .define('B', Tags.Items.DYES_CYAN)
              .unlockedBy("has_mixed_stone_ingot", inventoryTrigger(ItemPredicate.Builder.item().
                      of(ModItems.MIXED_STONE_INGOT.get()).build()))
              .save(pWriter);
        //  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CYAN_SPRAY_CAN.get()).requires(ModItems.CYAN_SPRAY_CAN.get(), 1).requires(Tags.Items.DYES_CYAN)
         //     .unlockedBy("has_spray_can", inventoryTrigger(ItemPredicate.Builder.item().of(ModTags.Items.SPRAY_CANS).build())).save(pWriter);

          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GLOWSTONE_SPRAY_CAN.get())
                  .pattern(" A ")
                  .pattern("ABA")
                  .pattern("ABA")
                  .define('A', ModItems.MIXED_STONE_INGOT.get())
                  .define('B', ModTags.Items.BRIGHT_ITEMS)
                  .unlockedBy("has_mixed_stone_ingot", inventoryTrigger(ItemPredicate.Builder.item().
                          of(ModItems.MIXED_STONE_INGOT.get()).build()))
                  .save(pWriter);
        //  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GLOWSTONE_SPRAY_CAN.get()).requires(ModItems.GLOWSTONE_SPRAY_CAN.get(), 1).requires(Tags.Items.DUSTS_GLOWSTONE)
        //        .unlockedBy("has_spray_can", inventoryTrigger(ItemPredicate.Builder.item().of(ModTags.Items.SPRAY_CANS).build())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SPRAY_CAN_REMOVER.get())
                .pattern(" A ")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.MIXED_STONE_INGOT.get())
                .unlockedBy("has_mixed_stone_ingot", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.MIXED_STONE_INGOT.get()).build()))
                .save(pWriter);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MIXED_STONE_INGOT.get()).requires(ModItems.MIXED_STONE_NUGGET.get(), 9)
                .unlockedBy("has_mixed_stone_nugget", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.MIXED_STONE_NUGGET.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MIXED_STONE_NUGGET.get()).requires(ModItems.MIXED_STONE_INGOT.get(), 1)
                .unlockedBy("has_mixed_stone_ingot", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.MIXED_STONE_INGOT.get()).build()))
                .save(pWriter);


        //SMELTING

        oreSmelting(pWriter, MIXED_STONE_SMELTABLES, RecipeCategory.MISC, ModItems.MIXED_STONE_INGOT.get(), 0.25f, 200, "mixed_stone");
        oreBlasting(pWriter, MIXED_STONE_SMELTABLES, RecipeCategory.MISC, ModItems.MIXED_STONE_INGOT.get(), 0.45f, 100, "mixed_stone");

        oreSmelting(pWriter, BRIGHT_STONE_SMELTABLES, RecipeCategory.MISC, ModItems.BRIGHT_SHARD.get(), 0.25f, 200, "bright_stone");
        oreBlasting(pWriter, BRIGHT_STONE_SMELTABLES, RecipeCategory.MISC, ModItems.BRIGHT_SHARD.get(), 0.45f, 100, "bright_stone");

        smeltingResultFromBase(pWriter, ModBlocks.BLUE_COLORED_STONE.get(), ModBlocks.BLUE_COLORED_COBBLESTONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.LIGHT_BLUE_COLORED_STONE.get(), ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.GRAY_COLORED_STONE.get(), ModBlocks.GRAY_COLORED_COBBLESTONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.LIGHT_GRAY_COLORED_STONE.get(), ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.BLACK_COLORED_STONE.get(), ModBlocks.BLACK_COLORED_COBBLESTONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.WHITE_COLORED_STONE.get(), ModBlocks.WHITE_COLORED_COBBLESTONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.GREEN_COLORED_STONE.get(), ModBlocks.GREEN_COLORED_COBBLESTONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.LIME_COLORED_STONE.get(), ModBlocks.LIME_COLORED_COBBLESTONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.BROWN_COLORED_STONE.get(), ModBlocks.BROWN_COLORED_COBBLESTONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.ORANGE_COLORED_STONE.get(), ModBlocks.ORANGE_COLORED_COBBLESTONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.YELLOW_COLORED_STONE.get(), ModBlocks.YELLOW_COLORED_COBBLESTONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.PINK_COLORED_STONE.get(), ModBlocks.PINK_COLORED_COBBLESTONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.MAGENTA_COLORED_STONE.get(), ModBlocks.MAGENTA_COLORED_COBBLESTONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.PURPLE_COLORED_STONE.get(), ModBlocks.PURPLE_COLORED_COBBLESTONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.CYAN_COLORED_STONE.get(), ModBlocks.CYAN_COLORED_COBBLESTONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.RED_COLORED_STONE.get(), ModBlocks.RED_COLORED_COBBLESTONE.get());

        smeltingResultFromBase(pWriter, ModBlocks.BLUE_COLORED_COBBLESTONE.get(), ModBlocks.BLUE_COLORED_STONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE.get(), ModBlocks.LIGHT_BLUE_COLORED_STONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.GRAY_COLORED_COBBLESTONE.get(), ModBlocks.GRAY_COLORED_STONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE.get(), ModBlocks.LIGHT_GRAY_COLORED_STONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.BLACK_COLORED_COBBLESTONE.get(), ModBlocks.BLACK_COLORED_STONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.WHITE_COLORED_COBBLESTONE.get(), ModBlocks.WHITE_COLORED_STONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.GREEN_COLORED_COBBLESTONE.get(), ModBlocks.GREEN_COLORED_STONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.LIME_COLORED_COBBLESTONE.get(), ModBlocks.LIME_COLORED_STONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.BROWN_COLORED_COBBLESTONE.get(), ModBlocks.BROWN_COLORED_STONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.ORANGE_COLORED_COBBLESTONE.get(), ModBlocks.ORANGE_COLORED_STONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.YELLOW_COLORED_COBBLESTONE.get(), ModBlocks.YELLOW_COLORED_STONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.PINK_COLORED_COBBLESTONE.get(), ModBlocks.PINK_COLORED_STONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.MAGENTA_COLORED_COBBLESTONE.get(), ModBlocks.MAGENTA_COLORED_STONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.PURPLE_COLORED_COBBLESTONE.get(), ModBlocks.PURPLE_COLORED_STONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.CYAN_COLORED_COBBLESTONE.get(), ModBlocks.CYAN_COLORED_STONE.get());
        smeltingResultFromBase(pWriter, ModBlocks.RED_COLORED_COBBLESTONE.get(), ModBlocks.RED_COLORED_STONE.get());

        //CYAN COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_STONE_WALL.get(), ModBlocks.CYAN_COLORED_STONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_STONE_BRICK_WALL.get(), ModBlocks.CYAN_COLORED_STONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_STONE_BRICKS.get(), ModBlocks.CYAN_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_STONE_SLAB.get(), ModBlocks.CYAN_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.CYAN_COLORED_STONE_BRICKS.get());

        stairBuilder(ModBlocks.CYAN_COLORED_STONE_STAIRS.get(), Ingredient.of(ModBlocks.CYAN_COLORED_STONE.get()))
                .unlockedBy("CYAN_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.CYAN_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.CYAN_COLORED_STONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.CYAN_COLORED_STONE_BRICKS.get()))
                .unlockedBy("CYAN_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.CYAN_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_STONE_BRICK_WALL.get(), ModBlocks.CYAN_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.CYAN_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.CYAN_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_STONE_WALL.get(), ModBlocks.CYAN_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_STONE_SLAB.get(), ModBlocks.CYAN_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_STONE_STAIRS.get(), ModBlocks.CYAN_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_STONE_BRICKS.get(), ModBlocks.CYAN_COLORED_STONE.get(), 1);

        //LIGHT_BLUE COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_STONE_WALL.get(), ModBlocks.LIGHT_BLUE_COLORED_STONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_WALL.get(), ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get(), ModBlocks.LIGHT_BLUE_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_STONE_SLAB.get(), ModBlocks.LIGHT_BLUE_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get());

        stairBuilder(ModBlocks.LIGHT_BLUE_COLORED_STONE_STAIRS.get(), Ingredient.of(ModBlocks.LIGHT_BLUE_COLORED_STONE.get()))
                .unlockedBy("LIGHT_BLUE_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get()))
                .unlockedBy("LIGHT_BLUE_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_WALL.get(), ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_STONE_WALL.get(), ModBlocks.LIGHT_BLUE_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_STONE_SLAB.get(), ModBlocks.LIGHT_BLUE_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_STONE_STAIRS.get(), ModBlocks.LIGHT_BLUE_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_STONE_BRICKS.get(), ModBlocks.LIGHT_BLUE_COLORED_STONE.get(), 1);

        //BLUE COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_STONE_WALL.get(), ModBlocks.BLUE_COLORED_STONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_STONE_BRICK_WALL.get(), ModBlocks.BLUE_COLORED_STONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_STONE_BRICKS.get(), ModBlocks.BLUE_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_STONE_SLAB.get(), ModBlocks.BLUE_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.BLUE_COLORED_STONE_BRICKS.get());

        stairBuilder(ModBlocks.BLUE_COLORED_STONE_STAIRS.get(), Ingredient.of(ModBlocks.BLUE_COLORED_STONE.get()))
                .unlockedBy("BLUE_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLUE_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.BLUE_COLORED_STONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.BLUE_COLORED_STONE_BRICKS.get()))
                .unlockedBy("BLUE_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLUE_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_STONE_BRICK_WALL.get(), ModBlocks.BLUE_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.BLUE_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.BLUE_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_STONE_WALL.get(), ModBlocks.BLUE_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_STONE_SLAB.get(), ModBlocks.BLUE_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_STONE_STAIRS.get(), ModBlocks.BLUE_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_STONE_BRICKS.get(), ModBlocks.BLUE_COLORED_STONE.get(), 1);

        //BLACK COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_STONE_WALL.get(), ModBlocks.BLACK_COLORED_STONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_STONE_BRICK_WALL.get(), ModBlocks.BLACK_COLORED_STONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_STONE_BRICKS.get(), ModBlocks.BLACK_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_STONE_SLAB.get(), ModBlocks.BLACK_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.BLACK_COLORED_STONE_BRICKS.get());

        stairBuilder(ModBlocks.BLACK_COLORED_STONE_STAIRS.get(), Ingredient.of(ModBlocks.BLACK_COLORED_STONE.get()))
                .unlockedBy("BLACK_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLACK_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.BLACK_COLORED_STONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.BLACK_COLORED_STONE_BRICKS.get()))
                .unlockedBy("BLACK_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLACK_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_STONE_BRICK_WALL.get(), ModBlocks.BLACK_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.BLACK_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.BLACK_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_STONE_WALL.get(), ModBlocks.BLACK_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_STONE_SLAB.get(), ModBlocks.BLACK_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_STONE_STAIRS.get(), ModBlocks.BLACK_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_STONE_BRICKS.get(), ModBlocks.BLACK_COLORED_STONE.get(), 1);

        //YELLOW COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_STONE_WALL.get(), ModBlocks.YELLOW_COLORED_STONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_STONE_BRICK_WALL.get(), ModBlocks.YELLOW_COLORED_STONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_STONE_BRICKS.get(), ModBlocks.YELLOW_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_STONE_SLAB.get(), ModBlocks.YELLOW_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.YELLOW_COLORED_STONE_BRICKS.get());

        stairBuilder(ModBlocks.YELLOW_COLORED_STONE_STAIRS.get(), Ingredient.of(ModBlocks.YELLOW_COLORED_STONE.get()))
                .unlockedBy("YELLOW_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.YELLOW_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.YELLOW_COLORED_STONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.YELLOW_COLORED_STONE_BRICKS.get()))
                .unlockedBy("YELLOW_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.YELLOW_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_STONE_BRICK_WALL.get(), ModBlocks.YELLOW_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.YELLOW_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.YELLOW_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_STONE_WALL.get(), ModBlocks.YELLOW_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_STONE_SLAB.get(), ModBlocks.YELLOW_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_STONE_STAIRS.get(), ModBlocks.YELLOW_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_STONE_BRICKS.get(), ModBlocks.YELLOW_COLORED_STONE.get(), 1);

        //BROWN COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_STONE_WALL.get(), ModBlocks.BROWN_COLORED_STONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_STONE_BRICK_WALL.get(), ModBlocks.BROWN_COLORED_STONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_STONE_BRICKS.get(), ModBlocks.BROWN_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_STONE_SLAB.get(), ModBlocks.BROWN_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.BROWN_COLORED_STONE_BRICKS.get());

        stairBuilder(ModBlocks.BROWN_COLORED_STONE_STAIRS.get(), Ingredient.of(ModBlocks.BROWN_COLORED_STONE.get()))
                .unlockedBy("BROWN_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BROWN_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.BROWN_COLORED_STONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.BROWN_COLORED_STONE_BRICKS.get()))
                .unlockedBy("BROWN_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BROWN_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_STONE_BRICK_WALL.get(), ModBlocks.BROWN_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.BROWN_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.BROWN_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_STONE_WALL.get(), ModBlocks.BROWN_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_STONE_SLAB.get(), ModBlocks.BROWN_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_STONE_STAIRS.get(), ModBlocks.BROWN_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_STONE_BRICKS.get(), ModBlocks.BROWN_COLORED_STONE.get(), 1);

        //GRAY COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_STONE_WALL.get(), ModBlocks.GRAY_COLORED_STONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_STONE_BRICK_WALL.get(), ModBlocks.GRAY_COLORED_STONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_STONE_BRICKS.get(), ModBlocks.GRAY_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_STONE_SLAB.get(), ModBlocks.GRAY_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.GRAY_COLORED_STONE_BRICKS.get());

        stairBuilder(ModBlocks.GRAY_COLORED_STONE_STAIRS.get(), Ingredient.of(ModBlocks.GRAY_COLORED_STONE.get()))
                .unlockedBy("GRAY_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GRAY_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.GRAY_COLORED_STONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.GRAY_COLORED_STONE_BRICKS.get()))
                .unlockedBy("GRAY_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GRAY_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_STONE_BRICK_WALL.get(), ModBlocks.GRAY_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.GRAY_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.GRAY_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_STONE_WALL.get(), ModBlocks.GRAY_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_STONE_SLAB.get(), ModBlocks.GRAY_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_STONE_STAIRS.get(), ModBlocks.GRAY_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_STONE_BRICKS.get(), ModBlocks.GRAY_COLORED_STONE.get(), 1);

        //LIGHT_GRAY COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_STONE_WALL.get(), ModBlocks.LIGHT_GRAY_COLORED_STONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_WALL.get(), ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get(), ModBlocks.LIGHT_GRAY_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_STONE_SLAB.get(), ModBlocks.LIGHT_GRAY_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get());

        stairBuilder(ModBlocks.LIGHT_GRAY_COLORED_STONE_STAIRS.get(), Ingredient.of(ModBlocks.LIGHT_GRAY_COLORED_STONE.get()))
                .unlockedBy("LIGHT_GRAY_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get()))
                .unlockedBy("LIGHT_GRAY_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_WALL.get(), ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_STONE_WALL.get(), ModBlocks.LIGHT_GRAY_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_STONE_SLAB.get(), ModBlocks.LIGHT_GRAY_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_STONE_STAIRS.get(), ModBlocks.LIGHT_GRAY_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_STONE_BRICKS.get(), ModBlocks.LIGHT_GRAY_COLORED_STONE.get(), 1);

        //GREEN COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_STONE_WALL.get(), ModBlocks.GREEN_COLORED_STONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_STONE_BRICK_WALL.get(), ModBlocks.GREEN_COLORED_STONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_STONE_BRICKS.get(), ModBlocks.GREEN_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_STONE_SLAB.get(), ModBlocks.GREEN_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.GREEN_COLORED_STONE_BRICKS.get());

        stairBuilder(ModBlocks.GREEN_COLORED_STONE_STAIRS.get(), Ingredient.of(ModBlocks.GREEN_COLORED_STONE.get()))
                .unlockedBy("GREEN_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GREEN_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.GREEN_COLORED_STONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.GREEN_COLORED_STONE_BRICKS.get()))
                .unlockedBy("GREEN_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GREEN_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_STONE_BRICK_WALL.get(), ModBlocks.GREEN_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.GREEN_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.GREEN_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_STONE_WALL.get(), ModBlocks.GREEN_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_STONE_SLAB.get(), ModBlocks.GREEN_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_STONE_STAIRS.get(), ModBlocks.GREEN_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_STONE_BRICKS.get(), ModBlocks.GREEN_COLORED_STONE.get(), 1);


        //LIME COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_STONE_WALL.get(), ModBlocks.LIME_COLORED_STONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_STONE_BRICK_WALL.get(), ModBlocks.LIME_COLORED_STONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_STONE_BRICKS.get(), ModBlocks.LIME_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_STONE_SLAB.get(), ModBlocks.LIME_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.LIME_COLORED_STONE_BRICKS.get());

        stairBuilder(ModBlocks.LIME_COLORED_STONE_STAIRS.get(), Ingredient.of(ModBlocks.LIME_COLORED_STONE.get()))
                .unlockedBy("LIME_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIME_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.LIME_COLORED_STONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.LIME_COLORED_STONE_BRICKS.get()))
                .unlockedBy("LIME_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIME_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_STONE_BRICK_WALL.get(), ModBlocks.LIME_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.LIME_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.LIME_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_STONE_WALL.get(), ModBlocks.LIME_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_STONE_SLAB.get(), ModBlocks.LIME_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_STONE_STAIRS.get(), ModBlocks.LIME_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_STONE_BRICKS.get(), ModBlocks.LIME_COLORED_STONE.get(), 1);

        //MAGENTA COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_STONE_WALL.get(), ModBlocks.MAGENTA_COLORED_STONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_STONE_BRICK_WALL.get(), ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get(), ModBlocks.MAGENTA_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_STONE_SLAB.get(), ModBlocks.MAGENTA_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get());

        stairBuilder(ModBlocks.MAGENTA_COLORED_STONE_STAIRS.get(), Ingredient.of(ModBlocks.MAGENTA_COLORED_STONE.get()))
                .unlockedBy("MAGENTA_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.MAGENTA_COLORED_STONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get()))
                .unlockedBy("MAGENTA_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_STONE_BRICK_WALL.get(), ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_STONE_WALL.get(), ModBlocks.MAGENTA_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_STONE_SLAB.get(), ModBlocks.MAGENTA_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_STONE_STAIRS.get(), ModBlocks.MAGENTA_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_STONE_BRICKS.get(), ModBlocks.MAGENTA_COLORED_STONE.get(), 1);

        //ORANGE COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_STONE_WALL.get(), ModBlocks.ORANGE_COLORED_STONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_STONE_BRICK_WALL.get(), ModBlocks.ORANGE_COLORED_STONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_STONE_BRICKS.get(), ModBlocks.ORANGE_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_STONE_SLAB.get(), ModBlocks.ORANGE_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.ORANGE_COLORED_STONE_BRICKS.get());

        stairBuilder(ModBlocks.ORANGE_COLORED_STONE_STAIRS.get(), Ingredient.of(ModBlocks.ORANGE_COLORED_STONE.get()))
                .unlockedBy("ORANGE_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ORANGE_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.ORANGE_COLORED_STONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.ORANGE_COLORED_STONE_BRICKS.get()))
                .unlockedBy("ORANGE_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ORANGE_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_STONE_BRICK_WALL.get(), ModBlocks.ORANGE_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.ORANGE_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.ORANGE_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_STONE_WALL.get(), ModBlocks.ORANGE_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_STONE_SLAB.get(), ModBlocks.ORANGE_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_STONE_STAIRS.get(), ModBlocks.ORANGE_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_STONE_BRICKS.get(), ModBlocks.ORANGE_COLORED_STONE.get(), 1);

        //PINK COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_STONE_WALL.get(), ModBlocks.PINK_COLORED_STONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_STONE_BRICK_WALL.get(), ModBlocks.PINK_COLORED_STONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_STONE_BRICKS.get(), ModBlocks.PINK_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_STONE_SLAB.get(), ModBlocks.PINK_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.PINK_COLORED_STONE_BRICKS.get());

        stairBuilder(ModBlocks.PINK_COLORED_STONE_STAIRS.get(), Ingredient.of(ModBlocks.PINK_COLORED_STONE.get()))
                .unlockedBy("PINK_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PINK_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.PINK_COLORED_STONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.PINK_COLORED_STONE_BRICKS.get()))
                .unlockedBy("PINK_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PINK_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_STONE_BRICK_WALL.get(), ModBlocks.PINK_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.PINK_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.PINK_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_STONE_WALL.get(), ModBlocks.PINK_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_STONE_SLAB.get(), ModBlocks.PINK_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_STONE_STAIRS.get(), ModBlocks.PINK_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_STONE_BRICKS.get(), ModBlocks.PINK_COLORED_STONE.get(), 1);

        //WHITE COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_STONE_WALL.get(), ModBlocks.WHITE_COLORED_STONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_STONE_BRICK_WALL.get(), ModBlocks.WHITE_COLORED_STONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_STONE_BRICKS.get(), ModBlocks.WHITE_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_STONE_SLAB.get(), ModBlocks.WHITE_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.WHITE_COLORED_STONE_BRICKS.get());

        stairBuilder(ModBlocks.WHITE_COLORED_STONE_STAIRS.get(), Ingredient.of(ModBlocks.WHITE_COLORED_STONE.get()))
                .unlockedBy("WHITE_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WHITE_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.WHITE_COLORED_STONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.WHITE_COLORED_STONE_BRICKS.get()))
                .unlockedBy("WHITE_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WHITE_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_STONE_BRICK_WALL.get(), ModBlocks.WHITE_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.WHITE_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.WHITE_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_STONE_WALL.get(), ModBlocks.WHITE_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_STONE_SLAB.get(), ModBlocks.WHITE_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_STONE_STAIRS.get(), ModBlocks.WHITE_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_STONE_BRICKS.get(), ModBlocks.WHITE_COLORED_STONE.get(), 1);

        //PURPLE COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_STONE_WALL.get(), ModBlocks.PURPLE_COLORED_STONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_STONE_BRICK_WALL.get(), ModBlocks.PURPLE_COLORED_STONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_STONE_BRICKS.get(), ModBlocks.PURPLE_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_STONE_SLAB.get(), ModBlocks.PURPLE_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.PURPLE_COLORED_STONE_BRICKS.get());

        stairBuilder(ModBlocks.PURPLE_COLORED_STONE_STAIRS.get(), Ingredient.of(ModBlocks.PURPLE_COLORED_STONE.get()))
                .unlockedBy("PURPLE_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PURPLE_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.PURPLE_COLORED_STONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.PURPLE_COLORED_STONE_BRICKS.get()))
                .unlockedBy("PURPLE_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PURPLE_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_STONE_BRICK_WALL.get(), ModBlocks.PURPLE_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.PURPLE_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.PURPLE_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_STONE_WALL.get(), ModBlocks.PURPLE_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_STONE_SLAB.get(), ModBlocks.PURPLE_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_STONE_STAIRS.get(), ModBlocks.PURPLE_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_STONE_BRICKS.get(), ModBlocks.PURPLE_COLORED_STONE.get(), 1);

        //RED COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_STONE_WALL.get(), ModBlocks.RED_COLORED_STONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_STONE_BRICK_WALL.get(), ModBlocks.RED_COLORED_STONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_STONE_BRICKS.get(), ModBlocks.RED_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_STONE_SLAB.get(), ModBlocks.RED_COLORED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.RED_COLORED_STONE_BRICKS.get());

        stairBuilder(ModBlocks.RED_COLORED_STONE_STAIRS.get(), Ingredient.of(ModBlocks.RED_COLORED_STONE.get()))
                .unlockedBy("RED_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.RED_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.RED_COLORED_STONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.RED_COLORED_STONE_BRICKS.get()))
                .unlockedBy("RED_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.RED_COLORED_STONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_STONE_BRICK_WALL.get(), ModBlocks.RED_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_STONE_BRICK_SLAB.get(), ModBlocks.RED_COLORED_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_STONE_BRICK_STAIRS.get(), ModBlocks.RED_COLORED_STONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_STONE_WALL.get(), ModBlocks.RED_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_STONE_SLAB.get(), ModBlocks.RED_COLORED_STONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_STONE_STAIRS.get(), ModBlocks.RED_COLORED_STONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_STONE_BRICKS.get(), ModBlocks.RED_COLORED_STONE.get(), 1);

        //CYAN COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_COBBLESTONE_WALL.get(), ModBlocks.CYAN_COLORED_COBBLESTONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.CYAN_COLORED_COBBLESTONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.CYAN_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.CYAN_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.CYAN_COLORED_COBBLESTONE_BRICKS.get());

        stairBuilder(ModBlocks.CYAN_COLORED_COBBLESTONE_STAIRS.get(), Ingredient.of(ModBlocks.CYAN_COLORED_COBBLESTONE.get()))
                .unlockedBy("CYAN_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.CYAN_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.CYAN_COLORED_COBBLESTONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.CYAN_COLORED_COBBLESTONE_BRICKS.get()))
                .unlockedBy("CYAN_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.CYAN_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.CYAN_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.CYAN_COLORED_COBBLESTONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_COBBLESTONE_BRICK_STAIRS.get(), ModBlocks.CYAN_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_COBBLESTONE_WALL.get(), ModBlocks.CYAN_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.CYAN_COLORED_COBBLESTONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_COBBLESTONE_STAIRS.get(), ModBlocks.CYAN_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.CYAN_COLORED_COBBLESTONE.get(), 1);

        //LIGHT_BLUE COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_WALL.get(), ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICKS.get());

        stairBuilder(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_STAIRS.get(), Ingredient.of(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE.get()))
                .unlockedBy("LIGHT_BLUE_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICKS.get()))
                .unlockedBy("LIGHT_BLUE_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICK_STAIRS.get(), ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_WALL.get(), ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_STAIRS.get(), ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.LIGHT_BLUE_COLORED_COBBLESTONE.get(), 1);

        //BLUE COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_COBBLESTONE_WALL.get(), ModBlocks.BLUE_COLORED_COBBLESTONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.BLUE_COLORED_COBBLESTONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.BLUE_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.BLUE_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.BLUE_COLORED_COBBLESTONE_BRICKS.get());

        stairBuilder(ModBlocks.BLUE_COLORED_COBBLESTONE_STAIRS.get(), Ingredient.of(ModBlocks.BLUE_COLORED_COBBLESTONE.get()))
                .unlockedBy("BLUE_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLUE_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.BLUE_COLORED_COBBLESTONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.BLUE_COLORED_COBBLESTONE_BRICKS.get()))
                .unlockedBy("BLUE_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLUE_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.BLUE_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.BLUE_COLORED_COBBLESTONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_COBBLESTONE_BRICK_STAIRS.get(), ModBlocks.BLUE_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_COBBLESTONE_WALL.get(), ModBlocks.BLUE_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.BLUE_COLORED_COBBLESTONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_COBBLESTONE_STAIRS.get(), ModBlocks.BLUE_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.BLUE_COLORED_COBBLESTONE.get(), 1);

        //BLACK COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_COBBLESTONE_WALL.get(), ModBlocks.BLACK_COLORED_COBBLESTONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.BLACK_COLORED_COBBLESTONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.BLACK_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.BLACK_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.BLACK_COLORED_COBBLESTONE_BRICKS.get());

        stairBuilder(ModBlocks.BLACK_COLORED_COBBLESTONE_STAIRS.get(), Ingredient.of(ModBlocks.BLACK_COLORED_COBBLESTONE.get()))
                .unlockedBy("BLACK_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLACK_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.BLACK_COLORED_COBBLESTONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.BLACK_COLORED_COBBLESTONE_BRICKS.get()))
                .unlockedBy("BLACK_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLACK_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.BLACK_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.BLACK_COLORED_COBBLESTONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_COBBLESTONE_BRICK_STAIRS.get(), ModBlocks.BLACK_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_COBBLESTONE_WALL.get(), ModBlocks.BLACK_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.BLACK_COLORED_COBBLESTONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_COBBLESTONE_STAIRS.get(), ModBlocks.BLACK_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.BLACK_COLORED_COBBLESTONE.get(), 1);

        //YELLOW COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_COBBLESTONE_WALL.get(), ModBlocks.YELLOW_COLORED_COBBLESTONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.YELLOW_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.YELLOW_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICKS.get());

        stairBuilder(ModBlocks.YELLOW_COLORED_COBBLESTONE_STAIRS.get(), Ingredient.of(ModBlocks.YELLOW_COLORED_COBBLESTONE.get()))
                .unlockedBy("YELLOW_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICKS.get()))
                .unlockedBy("YELLOW_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICK_STAIRS.get(), ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_COBBLESTONE_WALL.get(), ModBlocks.YELLOW_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.YELLOW_COLORED_COBBLESTONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_COBBLESTONE_STAIRS.get(), ModBlocks.YELLOW_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.BLACK_COLORED_COBBLESTONE.get(), 1);

        //BROWN COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_COBBLESTONE_WALL.get(), ModBlocks.BROWN_COLORED_COBBLESTONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.BROWN_COLORED_COBBLESTONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.BROWN_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.BROWN_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.BROWN_COLORED_COBBLESTONE_BRICKS.get());

        stairBuilder(ModBlocks.BROWN_COLORED_COBBLESTONE_STAIRS.get(), Ingredient.of(ModBlocks.BROWN_COLORED_COBBLESTONE.get()))
                .unlockedBy("BROWN_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BROWN_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.BROWN_COLORED_COBBLESTONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.BROWN_COLORED_COBBLESTONE_BRICKS.get()))
                .unlockedBy("BROWN_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BROWN_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.BROWN_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.BROWN_COLORED_COBBLESTONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_COBBLESTONE_BRICK_STAIRS.get(), ModBlocks.BROWN_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_COBBLESTONE_WALL.get(), ModBlocks.BROWN_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.BROWN_COLORED_COBBLESTONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_COBBLESTONE_STAIRS.get(), ModBlocks.BROWN_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.BROWN_COLORED_COBBLESTONE.get(), 1);

        //GRAY COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_COBBLESTONE_WALL.get(), ModBlocks.GRAY_COLORED_COBBLESTONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.GRAY_COLORED_COBBLESTONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.GRAY_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.GRAY_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.GRAY_COLORED_COBBLESTONE_BRICKS.get());

        stairBuilder(ModBlocks.GRAY_COLORED_COBBLESTONE_STAIRS.get(), Ingredient.of(ModBlocks.GRAY_COLORED_COBBLESTONE.get()))
                .unlockedBy("GRAY_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GRAY_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.GRAY_COLORED_COBBLESTONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.GRAY_COLORED_COBBLESTONE_BRICKS.get()))
                .unlockedBy("GRAY_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GRAY_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.GRAY_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.GRAY_COLORED_COBBLESTONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_COBBLESTONE_BRICK_STAIRS.get(), ModBlocks.GRAY_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_COBBLESTONE_WALL.get(), ModBlocks.GRAY_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.GRAY_COLORED_COBBLESTONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_COBBLESTONE_STAIRS.get(), ModBlocks.GRAY_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.GRAY_COLORED_COBBLESTONE.get(), 1);

        //LIGHT_GRAY COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_WALL.get(), ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICKS.get());

        stairBuilder(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_STAIRS.get(), Ingredient.of(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE.get()))
                .unlockedBy("LIGHT_GRAY_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICKS.get()))
                .unlockedBy("LIGHT_GRAY_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICK_STAIRS.get(), ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_WALL.get(), ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_STAIRS.get(), ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.LIGHT_GRAY_COLORED_COBBLESTONE.get(), 1);

        //GREEN COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_COBBLESTONE_WALL.get(), ModBlocks.GREEN_COLORED_COBBLESTONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.GREEN_COLORED_COBBLESTONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.GREEN_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.GREEN_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.GREEN_COLORED_COBBLESTONE_BRICKS.get());

        stairBuilder(ModBlocks.GREEN_COLORED_COBBLESTONE_STAIRS.get(), Ingredient.of(ModBlocks.GREEN_COLORED_COBBLESTONE.get()))
                .unlockedBy("GREEN_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GREEN_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.GREEN_COLORED_COBBLESTONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.GREEN_COLORED_COBBLESTONE_BRICKS.get()))
                .unlockedBy("GREEN_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GREEN_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.GREEN_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.GREEN_COLORED_COBBLESTONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_COBBLESTONE_BRICK_STAIRS.get(), ModBlocks.GREEN_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_COBBLESTONE_WALL.get(), ModBlocks.GREEN_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.GREEN_COLORED_COBBLESTONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_COBBLESTONE_STAIRS.get(), ModBlocks.GREEN_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.GREEN_COLORED_COBBLESTONE.get(), 1);


        //LIME COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_COBBLESTONE_WALL.get(), ModBlocks.LIME_COLORED_COBBLESTONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.LIME_COLORED_COBBLESTONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.LIME_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.LIME_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.LIME_COLORED_COBBLESTONE_BRICKS.get());

        stairBuilder(ModBlocks.LIME_COLORED_COBBLESTONE_STAIRS.get(), Ingredient.of(ModBlocks.LIME_COLORED_COBBLESTONE.get()))
                .unlockedBy("LIME_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIME_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.LIME_COLORED_COBBLESTONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.LIME_COLORED_COBBLESTONE_BRICKS.get()))
                .unlockedBy("LIME_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIME_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.LIME_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.LIME_COLORED_COBBLESTONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_COBBLESTONE_BRICK_STAIRS.get(), ModBlocks.LIME_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_COBBLESTONE_WALL.get(), ModBlocks.LIME_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.LIME_COLORED_COBBLESTONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_COBBLESTONE_STAIRS.get(), ModBlocks.LIME_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.LIME_COLORED_COBBLESTONE.get(), 1);

        //MAGENTA COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_COBBLESTONE_WALL.get(), ModBlocks.MAGENTA_COLORED_COBBLESTONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.MAGENTA_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.MAGENTA_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICKS.get());

        stairBuilder(ModBlocks.MAGENTA_COLORED_COBBLESTONE_STAIRS.get(), Ingredient.of(ModBlocks.MAGENTA_COLORED_COBBLESTONE.get()))
                .unlockedBy("MAGENTA_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICKS.get()))
                .unlockedBy("MAGENTA_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICK_STAIRS.get(), ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_COBBLESTONE_WALL.get(), ModBlocks.MAGENTA_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.MAGENTA_COLORED_COBBLESTONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_COBBLESTONE_STAIRS.get(), ModBlocks.MAGENTA_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.MAGENTA_COLORED_COBBLESTONE.get(), 1);

        //ORANGE COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_COBBLESTONE_WALL.get(), ModBlocks.ORANGE_COLORED_COBBLESTONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.ORANGE_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.ORANGE_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICKS.get());

        stairBuilder(ModBlocks.ORANGE_COLORED_COBBLESTONE_STAIRS.get(), Ingredient.of(ModBlocks.ORANGE_COLORED_COBBLESTONE.get()))
                .unlockedBy("ORANGE_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICKS.get()))
                .unlockedBy("ORANGE_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICK_STAIRS.get(), ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_COBBLESTONE_WALL.get(), ModBlocks.ORANGE_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.ORANGE_COLORED_COBBLESTONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_COBBLESTONE_STAIRS.get(), ModBlocks.ORANGE_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.ORANGE_COLORED_COBBLESTONE.get(), 1);

        //PINK COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_COBBLESTONE_WALL.get(), ModBlocks.PINK_COLORED_COBBLESTONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.PINK_COLORED_COBBLESTONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.PINK_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.PINK_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.PINK_COLORED_COBBLESTONE_BRICKS.get());

        stairBuilder(ModBlocks.PINK_COLORED_COBBLESTONE_STAIRS.get(), Ingredient.of(ModBlocks.PINK_COLORED_COBBLESTONE.get()))
                .unlockedBy("PINK_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PINK_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.PINK_COLORED_COBBLESTONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.PINK_COLORED_COBBLESTONE_BRICKS.get()))
                .unlockedBy("PINK_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PINK_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.PINK_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.PINK_COLORED_COBBLESTONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_COBBLESTONE_BRICK_STAIRS.get(), ModBlocks.PINK_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_COBBLESTONE_WALL.get(), ModBlocks.PINK_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.PINK_COLORED_COBBLESTONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_COBBLESTONE_STAIRS.get(), ModBlocks.PINK_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.PINK_COLORED_COBBLESTONE.get(), 1);

        //WHITE COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_COBBLESTONE_WALL.get(), ModBlocks.WHITE_COLORED_COBBLESTONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.WHITE_COLORED_COBBLESTONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.WHITE_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.WHITE_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.WHITE_COLORED_COBBLESTONE_BRICKS.get());

        stairBuilder(ModBlocks.WHITE_COLORED_COBBLESTONE_STAIRS.get(), Ingredient.of(ModBlocks.WHITE_COLORED_COBBLESTONE.get()))
                .unlockedBy("WHITE_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WHITE_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.WHITE_COLORED_COBBLESTONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.WHITE_COLORED_COBBLESTONE_BRICKS.get()))
                .unlockedBy("WHITE_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WHITE_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.WHITE_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.WHITE_COLORED_COBBLESTONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_COBBLESTONE_BRICK_STAIRS.get(), ModBlocks.WHITE_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_COBBLESTONE_WALL.get(), ModBlocks.WHITE_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.WHITE_COLORED_COBBLESTONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_COBBLESTONE_STAIRS.get(), ModBlocks.WHITE_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.WHITE_COLORED_COBBLESTONE.get(), 1);

        //PURPLE COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_COBBLESTONE_WALL.get(), ModBlocks.PURPLE_COLORED_COBBLESTONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.PURPLE_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.PURPLE_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICKS.get());

        stairBuilder(ModBlocks.PURPLE_COLORED_COBBLESTONE_STAIRS.get(), Ingredient.of(ModBlocks.PURPLE_COLORED_COBBLESTONE.get()))
                .unlockedBy("PURPLE_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICKS.get()))
                .unlockedBy("PURPLE_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICK_STAIRS.get(), ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_COBBLESTONE_WALL.get(), ModBlocks.PURPLE_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.PURPLE_COLORED_COBBLESTONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_COBBLESTONE_STAIRS.get(), ModBlocks.PURPLE_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.PURPLE_COLORED_COBBLESTONE.get(), 1);

        //RED COLORED STONE AND STONE BRICKS
        wall(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_COBBLESTONE_WALL.get(), ModBlocks.RED_COLORED_COBBLESTONE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.RED_COLORED_COBBLESTONE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.RED_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.RED_COLORED_COBBLESTONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.RED_COLORED_COBBLESTONE_BRICKS.get());

        stairBuilder(ModBlocks.RED_COLORED_COBBLESTONE_STAIRS.get(), Ingredient.of(ModBlocks.RED_COLORED_COBBLESTONE.get()))
                .unlockedBy("RED_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.RED_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.RED_COLORED_COBBLESTONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.RED_COLORED_COBBLESTONE_BRICKS.get()))
                .unlockedBy("RED_COLORED_COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.RED_COLORED_COBBLESTONE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_COBBLESTONE_BRICK_WALL.get(), ModBlocks.RED_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_COBBLESTONE_BRICK_SLAB.get(), ModBlocks.RED_COLORED_COBBLESTONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_COBBLESTONE_BRICK_STAIRS.get(), ModBlocks.RED_COLORED_COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_COBBLESTONE_WALL.get(), ModBlocks.RED_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_COBBLESTONE_SLAB.get(), ModBlocks.RED_COLORED_COBBLESTONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_COBBLESTONE_STAIRS.get(), ModBlocks.RED_COLORED_COBBLESTONE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_COBBLESTONE_BRICKS.get(), ModBlocks.RED_COLORED_COBBLESTONE.get(), 1);


        //COBBLESTONE BRICKS

        wall(pWriter, RecipeCategory.MISC, ModBlocks.COBBLESTONE_BRICK_WALL.get(), ModBlocks.COBBLESTONE_BRICKS.get());
        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.COBBLESTONE_BRICKS.get(), Blocks.COBBLESTONE);
        slab(pWriter, RecipeCategory.MISC, ModBlocks.COBBLESTONE_BRICK_SLAB.get(), ModBlocks.COBBLESTONE_BRICKS.get());

        stairBuilder(ModBlocks.COBBLESTONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.COBBLESTONE_BRICKS.get()))
                .unlockedBy("COBBLESTONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.COBBLESTONE).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.COBBLESTONE_BRICK_WALL.get(), ModBlocks.COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.COBBLESTONE_BRICK_SLAB.get(), ModBlocks.COBBLESTONE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.COBBLESTONE_BRICK_STAIRS.get(), ModBlocks.COBBLESTONE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.COBBLESTONE_BRICKS.get(), Blocks.COBBLESTONE, 1);
    
        //PLANKS

        stairBuilder(ModBlocks.WHITE_COLORED_WOODEN_PLANK_STAIRS.get(), Ingredient.of(ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("WHITE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_WOODEN_PLANK_STAIRS.get(), ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get(), 1);

        stairBuilder(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_STAIRS.get(), Ingredient.of(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("YELLOW_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_WOODEN_PLANK_STAIRS.get(), ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get(), 1);

        stairBuilder(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_STAIRS.get(), Ingredient.of(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("ORANGE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_WOODEN_PLANK_STAIRS.get(), ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get(), 1);

        stairBuilder(ModBlocks.LIME_COLORED_WOODEN_PLANK_STAIRS.get(), Ingredient.of(ModBlocks.LIME_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("LIME_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIME_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_WOODEN_PLANK_STAIRS.get(), ModBlocks.LIME_COLORED_WOODEN_PLANKS.get(), 1);

        stairBuilder(ModBlocks.GREEN_COLORED_WOODEN_PLANK_STAIRS.get(), Ingredient.of(ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("GREEN_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_WOODEN_PLANK_STAIRS.get(), ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get(), 1);

        stairBuilder(ModBlocks.RED_COLORED_WOODEN_PLANK_STAIRS.get(), Ingredient.of(ModBlocks.RED_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("RED_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.RED_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_WOODEN_PLANK_STAIRS.get(), ModBlocks.RED_COLORED_WOODEN_PLANKS.get(), 1);

        stairBuilder(ModBlocks.CYAN_COLORED_WOODEN_PLANK_STAIRS.get(), Ingredient.of(ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("CYAN_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_WOODEN_PLANK_STAIRS.get(), ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get(), 1);

        stairBuilder(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_STAIRS.get(), Ingredient.of(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("PURPLE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_WOODEN_PLANK_STAIRS.get(), ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get(), 1);

        stairBuilder(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_STAIRS.get(), Ingredient.of(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("MAGENTA_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_STAIRS.get(), ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get(), 1);

        stairBuilder(ModBlocks.PINK_COLORED_WOODEN_PLANK_STAIRS.get(), Ingredient.of(ModBlocks.PINK_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("PINK_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PINK_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_WOODEN_PLANK_STAIRS.get(), ModBlocks.PINK_COLORED_WOODEN_PLANKS.get(), 1);

        stairBuilder(ModBlocks.BLUE_COLORED_WOODEN_PLANK_STAIRS.get(), Ingredient.of(ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("BLUE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_WOODEN_PLANK_STAIRS.get(), ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get(), 1);

        stairBuilder(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_STAIRS.get(), Ingredient.of(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("LIGHT_BLUE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_STAIRS.get(), ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get(), 1);

        stairBuilder(ModBlocks.GRAY_COLORED_WOODEN_PLANK_STAIRS.get(), Ingredient.of(ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("GRAY_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_WOODEN_PLANK_STAIRS.get(), ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get(), 1);

        stairBuilder(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_STAIRS.get(), Ingredient.of(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("LIGHT_GRAY_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_STAIRS.get(), ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get(), 1);

        stairBuilder(ModBlocks.BLACK_COLORED_WOODEN_PLANK_STAIRS.get(), Ingredient.of(ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("BLACK_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_WOODEN_PLANK_STAIRS.get(), ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get(), 1);

        stairBuilder(ModBlocks.BROWN_COLORED_WOODEN_PLANK_STAIRS.get(), Ingredient.of(ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("BROWN_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_WOODEN_PLANK_STAIRS.get(), ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get(), 1);

        //BUITTON WOODEN PRESUUR EPLATES

        buttonBuilder(ModBlocks.WHITE_COLORED_WOODEN_PLANK_BUTTON.get(), Ingredient.of(ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("WHITE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_WOODEN_PLANK_BUTTON.get(), ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get(), 1);

        buttonBuilder(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_BUTTON.get(), Ingredient.of(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("YELLOW_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_WOODEN_PLANK_BUTTON.get(), ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get(), 1);

        buttonBuilder(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_BUTTON.get(), Ingredient.of(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("ORANGE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_WOODEN_PLANK_BUTTON.get(), ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get(), 1);

        buttonBuilder(ModBlocks.LIME_COLORED_WOODEN_PLANK_BUTTON.get(), Ingredient.of(ModBlocks.LIME_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("LIME_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIME_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_WOODEN_PLANK_BUTTON.get(), ModBlocks.LIME_COLORED_WOODEN_PLANKS.get(), 1);

        buttonBuilder(ModBlocks.GREEN_COLORED_WOODEN_PLANK_BUTTON.get(), Ingredient.of(ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("GREEN_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_WOODEN_PLANK_BUTTON.get(), ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get(), 1);

        buttonBuilder(ModBlocks.RED_COLORED_WOODEN_PLANK_BUTTON.get(), Ingredient.of(ModBlocks.RED_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("RED_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.RED_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_WOODEN_PLANK_BUTTON.get(), ModBlocks.RED_COLORED_WOODEN_PLANKS.get(), 1);

        buttonBuilder(ModBlocks.CYAN_COLORED_WOODEN_PLANK_BUTTON.get(), Ingredient.of(ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("CYAN_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_WOODEN_PLANK_BUTTON.get(), ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get(), 1);

        buttonBuilder(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_BUTTON.get(), Ingredient.of(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("PURPLE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_WOODEN_PLANK_BUTTON.get(), ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get(), 1);

        buttonBuilder(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_BUTTON.get(), Ingredient.of(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("MAGENTA_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_BUTTON.get(), ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get(), 1);

        buttonBuilder(ModBlocks.PINK_COLORED_WOODEN_PLANK_BUTTON.get(), Ingredient.of(ModBlocks.PINK_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("PINK_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PINK_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_WOODEN_PLANK_BUTTON.get(), ModBlocks.PINK_COLORED_WOODEN_PLANKS.get(), 1);

        buttonBuilder(ModBlocks.BLUE_COLORED_WOODEN_PLANK_BUTTON.get(), Ingredient.of(ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("BLUE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_WOODEN_PLANK_BUTTON.get(), ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get(), 1);

        buttonBuilder(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_BUTTON.get(), Ingredient.of(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("LIGHT_BLUE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_BUTTON.get(), ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get(), 1);

        buttonBuilder(ModBlocks.GRAY_COLORED_WOODEN_PLANK_BUTTON.get(), Ingredient.of(ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("GRAY_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_WOODEN_PLANK_BUTTON.get(), ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get(), 1);

        buttonBuilder(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_BUTTON.get(), Ingredient.of(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("LIGHT_GRAY_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_BUTTON.get(), ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get(), 1);

        buttonBuilder(ModBlocks.BLACK_COLORED_WOODEN_PLANK_BUTTON.get(), Ingredient.of(ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("BLACK_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_WOODEN_PLANK_BUTTON.get(), ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get(), 1);

        buttonBuilder(ModBlocks.BROWN_COLORED_WOODEN_PLANK_BUTTON.get(), Ingredient.of(ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("BROWN_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_WOODEN_PLANK_BUTTON.get(), ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get(), 1);
        
        //break
        
        buttonBuilder(ModBlocks.WHITE_COLORED_STONE_BUTTON.get(), Ingredient.of(ModBlocks.WHITE_COLORED_STONE.get()))
                .unlockedBy("WHITE_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WHITE_COLORED_STONE.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_STONE_BUTTON.get(), ModBlocks.WHITE_COLORED_STONE.get(), 1);

        buttonBuilder(ModBlocks.YELLOW_COLORED_STONE_BUTTON.get(), Ingredient.of(ModBlocks.YELLOW_COLORED_STONE.get()))
                .unlockedBy("YELLOW_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.YELLOW_COLORED_STONE.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_STONE_BUTTON.get(), ModBlocks.YELLOW_COLORED_STONE.get(), 1);

        buttonBuilder(ModBlocks.ORANGE_COLORED_STONE_BUTTON.get(), Ingredient.of(ModBlocks.ORANGE_COLORED_STONE.get()))
                .unlockedBy("ORANGE_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ORANGE_COLORED_STONE.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_STONE_BUTTON.get(), ModBlocks.ORANGE_COLORED_STONE.get(), 1);

        buttonBuilder(ModBlocks.LIME_COLORED_STONE_BUTTON.get(), Ingredient.of(ModBlocks.LIME_COLORED_STONE.get()))
                .unlockedBy("LIME_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIME_COLORED_STONE.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_STONE_BUTTON.get(), ModBlocks.LIME_COLORED_STONE.get(), 1);

        buttonBuilder(ModBlocks.GREEN_COLORED_STONE_BUTTON.get(), Ingredient.of(ModBlocks.GREEN_COLORED_STONE.get()))
                .unlockedBy("GREEN_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GREEN_COLORED_STONE.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_STONE_BUTTON.get(), ModBlocks.GREEN_COLORED_STONE.get(), 1);

        buttonBuilder(ModBlocks.RED_COLORED_STONE_BUTTON.get(), Ingredient.of(ModBlocks.RED_COLORED_STONE.get()))
                .unlockedBy("RED_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.RED_COLORED_STONE.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_STONE_BUTTON.get(), ModBlocks.RED_COLORED_STONE.get(), 1);

        buttonBuilder(ModBlocks.CYAN_COLORED_STONE_BUTTON.get(), Ingredient.of(ModBlocks.CYAN_COLORED_STONE.get()))
                .unlockedBy("CYAN_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.CYAN_COLORED_STONE.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_STONE_BUTTON.get(), ModBlocks.CYAN_COLORED_STONE.get(), 1);

        buttonBuilder(ModBlocks.PURPLE_COLORED_STONE_BUTTON.get(), Ingredient.of(ModBlocks.PURPLE_COLORED_STONE.get()))
                .unlockedBy("PURPLE_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PURPLE_COLORED_STONE.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_STONE_BUTTON.get(), ModBlocks.PURPLE_COLORED_STONE.get(), 1);

        buttonBuilder(ModBlocks.MAGENTA_COLORED_STONE_BUTTON.get(), Ingredient.of(ModBlocks.MAGENTA_COLORED_STONE.get()))
                .unlockedBy("MAGENTA_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.MAGENTA_COLORED_STONE.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_STONE_BUTTON.get(), ModBlocks.MAGENTA_COLORED_STONE.get(), 1);

        buttonBuilder(ModBlocks.PINK_COLORED_STONE_BUTTON.get(), Ingredient.of(ModBlocks.PINK_COLORED_STONE.get()))
                .unlockedBy("PINK_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PINK_COLORED_STONE.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_STONE_BUTTON.get(), ModBlocks.PINK_COLORED_STONE.get(), 1);

        buttonBuilder(ModBlocks.BLUE_COLORED_STONE_BUTTON.get(), Ingredient.of(ModBlocks.BLUE_COLORED_STONE.get()))
                .unlockedBy("BLUE_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLUE_COLORED_STONE.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_STONE_BUTTON.get(), ModBlocks.BLUE_COLORED_STONE.get(), 1);

        buttonBuilder(ModBlocks.LIGHT_BLUE_COLORED_STONE_BUTTON.get(), Ingredient.of(ModBlocks.LIGHT_BLUE_COLORED_STONE.get()))
                .unlockedBy("LIGHT_BLUE_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_BLUE_COLORED_STONE.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_STONE_BUTTON.get(), ModBlocks.LIGHT_BLUE_COLORED_STONE.get(), 1);

        buttonBuilder(ModBlocks.GRAY_COLORED_STONE_BUTTON.get(), Ingredient.of(ModBlocks.GRAY_COLORED_STONE.get()))
                .unlockedBy("GRAY_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GRAY_COLORED_STONE.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_STONE_BUTTON.get(), ModBlocks.GRAY_COLORED_STONE.get(), 1);

        buttonBuilder(ModBlocks.LIGHT_GRAY_COLORED_STONE_BUTTON.get(), Ingredient.of(ModBlocks.LIGHT_GRAY_COLORED_STONE.get()))
                .unlockedBy("LIGHT_GRAY_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_GRAY_COLORED_STONE.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_STONE_BUTTON.get(), ModBlocks.LIGHT_GRAY_COLORED_STONE.get(), 1);

        buttonBuilder(ModBlocks.BLACK_COLORED_STONE_BUTTON.get(), Ingredient.of(ModBlocks.BLACK_COLORED_STONE.get()))
                .unlockedBy("BLACK_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLACK_COLORED_STONE.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_STONE_BUTTON.get(), ModBlocks.BLACK_COLORED_STONE.get(), 1);

        buttonBuilder(ModBlocks.BROWN_COLORED_STONE_BUTTON.get(), Ingredient.of(ModBlocks.BROWN_COLORED_STONE.get()))
                .unlockedBy("BROWN_COLORED_STONE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BROWN_COLORED_STONE.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_STONE_BUTTON.get(), ModBlocks.BROWN_COLORED_STONE.get(), 1);
        
        //breaj
        
        pressurePlate(pWriter, ModBlocks.BLACK_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get(), 1);
        pressurePlate(pWriter, ModBlocks.PURPLE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get(), 1);
        pressurePlate(pWriter, ModBlocks.PINK_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.PINK_COLORED_WOODEN_PLANKS.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.PINK_COLORED_WOODEN_PLANKS.get(), 1);
        pressurePlate(pWriter, ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get(), 1);
        pressurePlate(pWriter, ModBlocks.RED_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.RED_COLORED_WOODEN_PLANKS.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.RED_COLORED_WOODEN_PLANKS.get(), 1);
        pressurePlate(pWriter, ModBlocks.YELLOW_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get(), 1);
        pressurePlate(pWriter, ModBlocks.ORANGE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get(), 1);
        pressurePlate(pWriter, ModBlocks.GRAY_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get(), 1);
        pressurePlate(pWriter, ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get(), 1);
        pressurePlate(pWriter, ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get(), 1);
        pressurePlate(pWriter, ModBlocks.BLUE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get(), 1);
        pressurePlate(pWriter, ModBlocks.CYAN_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get(), 1);
        pressurePlate(pWriter, ModBlocks.LIME_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.LIME_COLORED_WOODEN_PLANKS.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.LIME_COLORED_WOODEN_PLANKS.get(), 1);
        pressurePlate(pWriter, ModBlocks.GREEN_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get(), 1);
        pressurePlate(pWriter, ModBlocks.BROWN_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get(), 1);
        pressurePlate(pWriter, ModBlocks.WHITE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get(), 1);
        
        //breaj
        
        pressurePlate(pWriter, ModBlocks.BLACK_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.BLACK_COLORED_STONE.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.BLACK_COLORED_STONE.get(), 1);
        pressurePlate(pWriter, ModBlocks.PURPLE_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.PURPLE_COLORED_STONE.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.PURPLE_COLORED_STONE.get(), 1);
        pressurePlate(pWriter, ModBlocks.PINK_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.PINK_COLORED_STONE.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.PINK_COLORED_STONE.get(), 1);
        pressurePlate(pWriter, ModBlocks.MAGENTA_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.MAGENTA_COLORED_STONE.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.MAGENTA_COLORED_STONE.get(), 1);
        pressurePlate(pWriter, ModBlocks.RED_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.RED_COLORED_STONE.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.RED_COLORED_STONE.get(), 1);
        pressurePlate(pWriter, ModBlocks.YELLOW_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.YELLOW_COLORED_STONE.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.YELLOW_COLORED_STONE.get(), 1);
        pressurePlate(pWriter, ModBlocks.ORANGE_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.ORANGE_COLORED_STONE.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.ORANGE_COLORED_STONE.get(), 1);
        pressurePlate(pWriter, ModBlocks.GRAY_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.GRAY_COLORED_STONE.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.GRAY_COLORED_STONE.get(), 1);
        pressurePlate(pWriter, ModBlocks.LIGHT_GRAY_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.LIGHT_GRAY_COLORED_STONE.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.LIGHT_GRAY_COLORED_STONE.get(), 1);
        pressurePlate(pWriter, ModBlocks.LIGHT_BLUE_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.LIGHT_BLUE_COLORED_STONE.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.LIGHT_BLUE_COLORED_STONE.get(), 1);
        pressurePlate(pWriter, ModBlocks.BLUE_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.BLUE_COLORED_STONE.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.BLUE_COLORED_STONE.get(), 1);
        pressurePlate(pWriter, ModBlocks.CYAN_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.CYAN_COLORED_STONE.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.CYAN_COLORED_STONE.get(), 1);
        pressurePlate(pWriter, ModBlocks.LIME_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.LIME_COLORED_STONE.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.LIME_COLORED_STONE.get(), 1);
        pressurePlate(pWriter, ModBlocks.GREEN_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.GREEN_COLORED_STONE.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.GREEN_COLORED_STONE.get(), 1);
        pressurePlate(pWriter, ModBlocks.BROWN_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.BROWN_COLORED_STONE.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.BROWN_COLORED_STONE.get(), 1);
        pressurePlate(pWriter, ModBlocks.WHITE_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.WHITE_COLORED_STONE.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_STONE_PRESSURE_PLATE.get(), ModBlocks.WHITE_COLORED_STONE.get(), 1);

        //fence gate

        fenceBuilder(ModBlocks.WHITE_COLORED_WOODEN_PLANK_FENCE.get(), Ingredient.of(ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("WHITE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_WOODEN_PLANK_FENCE.get(), ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get(), 1);

        fenceBuilder(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_FENCE.get(), Ingredient.of(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("YELLOW_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_WOODEN_PLANK_FENCE.get(), ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get(), 1);

        fenceBuilder(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_FENCE.get(), Ingredient.of(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("ORANGE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_WOODEN_PLANK_FENCE.get(), ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get(), 1);

        fenceBuilder(ModBlocks.LIME_COLORED_WOODEN_PLANK_FENCE.get(), Ingredient.of(ModBlocks.LIME_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("LIME_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIME_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_WOODEN_PLANK_FENCE.get(), ModBlocks.LIME_COLORED_WOODEN_PLANKS.get(), 1);

        fenceBuilder(ModBlocks.GREEN_COLORED_WOODEN_PLANK_FENCE.get(), Ingredient.of(ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("GREEN_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_WOODEN_PLANK_FENCE.get(), ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get(), 1);

        fenceBuilder(ModBlocks.RED_COLORED_WOODEN_PLANK_FENCE.get(), Ingredient.of(ModBlocks.RED_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("RED_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.RED_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_WOODEN_PLANK_FENCE.get(), ModBlocks.RED_COLORED_WOODEN_PLANKS.get(), 1);

        fenceBuilder(ModBlocks.CYAN_COLORED_WOODEN_PLANK_FENCE.get(), Ingredient.of(ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("CYAN_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_WOODEN_PLANK_FENCE.get(), ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get(), 1);

        fenceBuilder(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_FENCE.get(), Ingredient.of(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("PURPLE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_WOODEN_PLANK_FENCE.get(), ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get(), 1);

        fenceBuilder(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_FENCE.get(), Ingredient.of(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("MAGENTA_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_FENCE.get(), ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get(), 1);

        fenceBuilder(ModBlocks.PINK_COLORED_WOODEN_PLANK_FENCE.get(), Ingredient.of(ModBlocks.PINK_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("PINK_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PINK_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_WOODEN_PLANK_FENCE.get(), ModBlocks.PINK_COLORED_WOODEN_PLANKS.get(), 1);

        fenceBuilder(ModBlocks.BLUE_COLORED_WOODEN_PLANK_FENCE.get(), Ingredient.of(ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("BLUE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_WOODEN_PLANK_FENCE.get(), ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get(), 1);

        fenceBuilder(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_FENCE.get(), Ingredient.of(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("LIGHT_BLUE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_FENCE.get(), ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get(), 1);

        fenceBuilder(ModBlocks.GRAY_COLORED_WOODEN_PLANK_FENCE.get(), Ingredient.of(ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("GRAY_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_WOODEN_PLANK_FENCE.get(), ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get(), 1);

        fenceBuilder(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_FENCE.get(), Ingredient.of(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("LIGHT_GRAY_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_FENCE.get(), ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get(), 1);

        fenceBuilder(ModBlocks.BLACK_COLORED_WOODEN_PLANK_FENCE.get(), Ingredient.of(ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("BLACK_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_WOODEN_PLANK_FENCE.get(), ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get(), 1);

        fenceBuilder(ModBlocks.BROWN_COLORED_WOODEN_PLANK_FENCE.get(), Ingredient.of(ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("BROWN_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_WOODEN_PLANK_FENCE.get(), ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get(), 1);
        
        
        fenceGateBuilder(ModBlocks.WHITE_COLORED_WOODEN_PLANK_FENCE_GATE.get(), Ingredient.of(ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("WHITE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_WOODEN_PLANK_FENCE_GATE.get(), ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get(), 1);

        fenceGateBuilder(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_FENCE_GATE.get(), Ingredient.of(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("YELLOW_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_WOODEN_PLANK_FENCE_GATE.get(), ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get(), 1);

        fenceGateBuilder(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_FENCE_GATE.get(), Ingredient.of(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("ORANGE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_WOODEN_PLANK_FENCE_GATE.get(), ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get(), 1);

        fenceGateBuilder(ModBlocks.LIME_COLORED_WOODEN_PLANK_FENCE_GATE.get(), Ingredient.of(ModBlocks.LIME_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("LIME_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIME_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_WOODEN_PLANK_FENCE_GATE.get(), ModBlocks.LIME_COLORED_WOODEN_PLANKS.get(), 1);

        fenceGateBuilder(ModBlocks.GREEN_COLORED_WOODEN_PLANK_FENCE_GATE.get(), Ingredient.of(ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("GREEN_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_WOODEN_PLANK_FENCE_GATE.get(), ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get(), 1);

        fenceGateBuilder(ModBlocks.RED_COLORED_WOODEN_PLANK_FENCE_GATE.get(), Ingredient.of(ModBlocks.RED_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("RED_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.RED_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_WOODEN_PLANK_FENCE_GATE.get(), ModBlocks.RED_COLORED_WOODEN_PLANKS.get(), 1);

        fenceGateBuilder(ModBlocks.CYAN_COLORED_WOODEN_PLANK_FENCE_GATE.get(), Ingredient.of(ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("CYAN_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_WOODEN_PLANK_FENCE_GATE.get(), ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get(), 1);

        fenceGateBuilder(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_FENCE_GATE.get(), Ingredient.of(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("PURPLE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_WOODEN_PLANK_FENCE_GATE.get(), ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get(), 1);

        fenceGateBuilder(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_FENCE_GATE.get(), Ingredient.of(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("MAGENTA_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_FENCE_GATE.get(), ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get(), 1);

        fenceGateBuilder(ModBlocks.PINK_COLORED_WOODEN_PLANK_FENCE_GATE.get(), Ingredient.of(ModBlocks.PINK_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("PINK_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PINK_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_WOODEN_PLANK_FENCE_GATE.get(), ModBlocks.PINK_COLORED_WOODEN_PLANKS.get(), 1);

        fenceGateBuilder(ModBlocks.BLUE_COLORED_WOODEN_PLANK_FENCE_GATE.get(), Ingredient.of(ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("BLUE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_WOODEN_PLANK_FENCE_GATE.get(), ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get(), 1);

        fenceGateBuilder(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_FENCE_GATE.get(), Ingredient.of(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("LIGHT_BLUE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_FENCE_GATE.get(), ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get(), 1);

        fenceGateBuilder(ModBlocks.GRAY_COLORED_WOODEN_PLANK_FENCE_GATE.get(), Ingredient.of(ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("GRAY_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_WOODEN_PLANK_FENCE_GATE.get(), ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get(), 1);

        fenceGateBuilder(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_FENCE_GATE.get(), Ingredient.of(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("LIGHT_GRAY_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_FENCE_GATE.get(), ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get(), 1);

        fenceGateBuilder(ModBlocks.BLACK_COLORED_WOODEN_PLANK_FENCE_GATE.get(), Ingredient.of(ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("BLACK_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_WOODEN_PLANK_FENCE_GATE.get(), ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get(), 1);

        fenceGateBuilder(ModBlocks.BROWN_COLORED_WOODEN_PLANK_FENCE_GATE.get(), Ingredient.of(ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("BROWN_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_WOODEN_PLANK_FENCE_GATE.get(), ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get(), 1);

        //trapdoor


        trapdoorBuilder(ModBlocks.WHITE_COLORED_WOODEN_PLANK_TRAPDOOR.get(), Ingredient.of(ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("WHITE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_WOODEN_PLANK_TRAPDOOR.get(), ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get(), 2);

        trapdoorBuilder(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_TRAPDOOR.get(), Ingredient.of(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("YELLOW_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_WOODEN_PLANK_TRAPDOOR.get(), ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get(), 2);

        trapdoorBuilder(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_TRAPDOOR.get(), Ingredient.of(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("ORANGE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_WOODEN_PLANK_TRAPDOOR.get(), ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get(), 2);

        trapdoorBuilder(ModBlocks.LIME_COLORED_WOODEN_PLANK_TRAPDOOR.get(), Ingredient.of(ModBlocks.LIME_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("LIME_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIME_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_WOODEN_PLANK_TRAPDOOR.get(), ModBlocks.LIME_COLORED_WOODEN_PLANKS.get(), 2);

        trapdoorBuilder(ModBlocks.GREEN_COLORED_WOODEN_PLANK_TRAPDOOR.get(), Ingredient.of(ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("GREEN_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_WOODEN_PLANK_TRAPDOOR.get(), ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get(), 2);

        trapdoorBuilder(ModBlocks.RED_COLORED_WOODEN_PLANK_TRAPDOOR.get(), Ingredient.of(ModBlocks.RED_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("RED_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.RED_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_WOODEN_PLANK_TRAPDOOR.get(), ModBlocks.RED_COLORED_WOODEN_PLANKS.get(), 2);

        trapdoorBuilder(ModBlocks.CYAN_COLORED_WOODEN_PLANK_TRAPDOOR.get(), Ingredient.of(ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("CYAN_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_WOODEN_PLANK_TRAPDOOR.get(), ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get(), 2);

        trapdoorBuilder(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_TRAPDOOR.get(), Ingredient.of(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("PURPLE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_WOODEN_PLANK_TRAPDOOR.get(), ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get(), 2);

        trapdoorBuilder(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_TRAPDOOR.get(), Ingredient.of(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("MAGENTA_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_TRAPDOOR.get(), ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get(), 2);

        trapdoorBuilder(ModBlocks.PINK_COLORED_WOODEN_PLANK_TRAPDOOR.get(), Ingredient.of(ModBlocks.PINK_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("PINK_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PINK_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_WOODEN_PLANK_TRAPDOOR.get(), ModBlocks.PINK_COLORED_WOODEN_PLANKS.get(), 2);

        trapdoorBuilder(ModBlocks.BLUE_COLORED_WOODEN_PLANK_TRAPDOOR.get(), Ingredient.of(ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("BLUE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_WOODEN_PLANK_TRAPDOOR.get(), ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get(), 2);

        trapdoorBuilder(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_TRAPDOOR.get(), Ingredient.of(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("LIGHT_BLUE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_TRAPDOOR.get(), ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get(), 2);

        trapdoorBuilder(ModBlocks.GRAY_COLORED_WOODEN_PLANK_TRAPDOOR.get(), Ingredient.of(ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("GRAY_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_WOODEN_PLANK_TRAPDOOR.get(), ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get(), 2);

        trapdoorBuilder(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_TRAPDOOR.get(), Ingredient.of(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("LIGHT_GRAY_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_TRAPDOOR.get(), ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get(), 2);

        trapdoorBuilder(ModBlocks.BLACK_COLORED_WOODEN_PLANK_TRAPDOOR.get(), Ingredient.of(ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("BLACK_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_WOODEN_PLANK_TRAPDOOR.get(), ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get(), 2);

        trapdoorBuilder(ModBlocks.BROWN_COLORED_WOODEN_PLANK_TRAPDOOR.get(), Ingredient.of(ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("BROWN_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_WOODEN_PLANK_TRAPDOOR.get(), ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get(), 2);

        //door


        doorBuilder(ModBlocks.WHITE_COLORED_WOODEN_PLANK_DOOR.get(), Ingredient.of(ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("WHITE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_WOODEN_PLANK_DOOR.get(), ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get(), 2);

        doorBuilder(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_DOOR.get(), Ingredient.of(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("YELLOW_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_WOODEN_PLANK_DOOR.get(), ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get(), 2);

        doorBuilder(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_DOOR.get(), Ingredient.of(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("ORANGE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_WOODEN_PLANK_DOOR.get(), ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get(), 2);

        doorBuilder(ModBlocks.LIME_COLORED_WOODEN_PLANK_DOOR.get(), Ingredient.of(ModBlocks.LIME_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("LIME_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIME_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_WOODEN_PLANK_DOOR.get(), ModBlocks.LIME_COLORED_WOODEN_PLANKS.get(), 2);

        doorBuilder(ModBlocks.GREEN_COLORED_WOODEN_PLANK_DOOR.get(), Ingredient.of(ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("GREEN_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_WOODEN_PLANK_DOOR.get(), ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get(), 2);

        doorBuilder(ModBlocks.RED_COLORED_WOODEN_PLANK_DOOR.get(), Ingredient.of(ModBlocks.RED_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("RED_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.RED_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_WOODEN_PLANK_DOOR.get(), ModBlocks.RED_COLORED_WOODEN_PLANKS.get(), 2);

        doorBuilder(ModBlocks.CYAN_COLORED_WOODEN_PLANK_DOOR.get(), Ingredient.of(ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("CYAN_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_WOODEN_PLANK_DOOR.get(), ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get(), 2);

        doorBuilder(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_DOOR.get(), Ingredient.of(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("PURPLE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_WOODEN_PLANK_DOOR.get(), ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get(), 2);

        doorBuilder(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_DOOR.get(), Ingredient.of(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("MAGENTA_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_DOOR.get(), ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get(), 2);

        doorBuilder(ModBlocks.PINK_COLORED_WOODEN_PLANK_DOOR.get(), Ingredient.of(ModBlocks.PINK_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("PINK_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PINK_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_WOODEN_PLANK_DOOR.get(), ModBlocks.PINK_COLORED_WOODEN_PLANKS.get(), 2);

        doorBuilder(ModBlocks.BLUE_COLORED_WOODEN_PLANK_DOOR.get(), Ingredient.of(ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("BLUE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_WOODEN_PLANK_DOOR.get(), ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get(), 2);

        doorBuilder(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_DOOR.get(), Ingredient.of(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("LIGHT_BLUE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_DOOR.get(), ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get(), 2);

        doorBuilder(ModBlocks.GRAY_COLORED_WOODEN_PLANK_DOOR.get(), Ingredient.of(ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("GRAY_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_WOODEN_PLANK_DOOR.get(), ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get(), 2);

        doorBuilder(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_DOOR.get(), Ingredient.of(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("LIGHT_GRAY_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_DOOR.get(), ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get(), 2);

        doorBuilder(ModBlocks.BLACK_COLORED_WOODEN_PLANK_DOOR.get(), Ingredient.of(ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("BLACK_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_WOODEN_PLANK_DOOR.get(), ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get(), 2);

        doorBuilder(ModBlocks.BROWN_COLORED_WOODEN_PLANK_DOOR.get(), Ingredient.of(ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("BROWN_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_WOODEN_PLANK_DOOR.get(), ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get(), 2);


        woodFromLogs(pWriter, ModBlocks.BROWN_COLORED_WOOD.get(), ModBlocks.BROWN_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.BLACK_COLORED_WOOD.get(), ModBlocks.BLACK_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.GREEN_COLORED_WOOD.get(), ModBlocks.GREEN_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.LIME_COLORED_WOOD.get(), ModBlocks.LIME_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.CYAN_COLORED_WOOD.get(), ModBlocks.CYAN_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.BLUE_COLORED_WOOD.get(), ModBlocks.BLUE_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.LIGHT_BLUE_COLORED_WOOD.get(), ModBlocks.LIGHT_BLUE_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.LIGHT_GRAY_COLORED_WOOD.get(), ModBlocks.LIGHT_GRAY_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.GRAY_COLORED_WOOD.get(), ModBlocks.GRAY_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.ORANGE_COLORED_WOOD.get(), ModBlocks.ORANGE_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.YELLOW_COLORED_WOOD.get(), ModBlocks.YELLOW_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.RED_COLORED_WOOD.get(), ModBlocks.RED_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.WHITE_COLORED_WOOD.get(), ModBlocks.WHITE_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.PURPLE_COLORED_WOOD.get(), ModBlocks.PURPLE_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.MAGENTA_COLORED_WOOD.get(), ModBlocks.MAGENTA_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.PINK_COLORED_WOOD.get(), ModBlocks.PINK_COLORED_LOG.get());
        
        woodFromLogs(pWriter, ModBlocks.STRIPPED_BROWN_COLORED_WOOD.get(), ModBlocks.STRIPPED_BROWN_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_BLACK_COLORED_WOOD.get(), ModBlocks.STRIPPED_BLACK_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_GREEN_COLORED_WOOD.get(), ModBlocks.STRIPPED_GREEN_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_LIME_COLORED_WOOD.get(), ModBlocks.STRIPPED_LIME_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_CYAN_COLORED_WOOD.get(), ModBlocks.STRIPPED_CYAN_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_BLUE_COLORED_WOOD.get(), ModBlocks.STRIPPED_BLUE_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_LIGHT_BLUE_COLORED_WOOD.get(), ModBlocks.STRIPPED_LIGHT_BLUE_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_LIGHT_GRAY_COLORED_WOOD.get(), ModBlocks.STRIPPED_LIGHT_GRAY_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_GRAY_COLORED_WOOD.get(), ModBlocks.STRIPPED_GRAY_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_ORANGE_COLORED_WOOD.get(), ModBlocks.STRIPPED_ORANGE_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_YELLOW_COLORED_WOOD.get(), ModBlocks.STRIPPED_YELLOW_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_RED_COLORED_WOOD.get(), ModBlocks.STRIPPED_RED_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_WHITE_COLORED_WOOD.get(), ModBlocks.STRIPPED_WHITE_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_PURPLE_COLORED_WOOD.get(), ModBlocks.STRIPPED_PURPLE_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_MAGENTA_COLORED_WOOD.get(), ModBlocks.STRIPPED_MAGENTA_COLORED_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_PINK_COLORED_WOOD.get(), ModBlocks.STRIPPED_PINK_COLORED_LOG.get());
        
        planksFromLogs(pWriter, ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get(), ModTags.Items.BROWN_COLORED_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get(), ModTags.Items.BLACK_COLORED_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get(), ModTags.Items.GREEN_COLORED_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.LIME_COLORED_WOODEN_PLANKS.get(), ModTags.Items.LIME_COLORED_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get(), ModTags.Items.CYAN_COLORED_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get(), ModTags.Items.BLUE_COLORED_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get(), ModTags.Items.LIGHT_BLUE_COLORED_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get(), ModTags.Items.LIGHT_GRAY_COLORED_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get(), ModTags.Items.GRAY_COLORED_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get(), ModTags.Items.ORANGE_COLORED_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get(), ModTags.Items.YELLOW_COLORED_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.RED_COLORED_WOODEN_PLANKS.get(), ModTags.Items.RED_COLORED_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get(), ModTags.Items.WHITE_COLORED_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get(), ModTags.Items.PURPLE_COLORED_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get(), ModTags.Items.MAGENTA_COLORED_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.PINK_COLORED_WOODEN_PLANKS.get(), ModTags.Items.PINK_COLORED_LOGS, 4);

    //SIGN

        signBuilder(ModBlocks.WHITE_COLORED_SIGN.get(), Ingredient.of(ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("WHITE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_SIGN.get(), ModBlocks.WHITE_COLORED_WOODEN_PLANKS.get(), 1);

        signBuilder(ModBlocks.YELLOW_COLORED_SIGN.get(), Ingredient.of(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("YELLOW_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_SIGN.get(), ModBlocks.YELLOW_COLORED_WOODEN_PLANKS.get(), 1);

        signBuilder(ModBlocks.ORANGE_COLORED_SIGN.get(), Ingredient.of(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("ORANGE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_SIGN.get(), ModBlocks.ORANGE_COLORED_WOODEN_PLANKS.get(), 1);

        signBuilder(ModBlocks.LIME_COLORED_SIGN.get(), Ingredient.of(ModBlocks.LIME_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("LIME_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIME_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_SIGN.get(), ModBlocks.LIME_COLORED_WOODEN_PLANKS.get(), 1);

        signBuilder(ModBlocks.GREEN_COLORED_SIGN.get(), Ingredient.of(ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("GREEN_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_SIGN.get(), ModBlocks.GREEN_COLORED_WOODEN_PLANKS.get(), 1);

        signBuilder(ModBlocks.RED_COLORED_SIGN.get(), Ingredient.of(ModBlocks.RED_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("RED_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.RED_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_SIGN.get(), ModBlocks.RED_COLORED_WOODEN_PLANKS.get(), 1);

        signBuilder(ModBlocks.CYAN_COLORED_SIGN.get(), Ingredient.of(ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("CYAN_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_SIGN.get(), ModBlocks.CYAN_COLORED_WOODEN_PLANKS.get(), 1);

        signBuilder(ModBlocks.PURPLE_COLORED_SIGN.get(), Ingredient.of(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("PURPLE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_SIGN.get(), ModBlocks.PURPLE_COLORED_WOODEN_PLANKS.get(), 1);

        signBuilder(ModBlocks.MAGENTA_COLORED_SIGN.get(), Ingredient.of(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("MAGENTA_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_SIGN.get(), ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS.get(), 1);

        signBuilder(ModBlocks.PINK_COLORED_SIGN.get(), Ingredient.of(ModBlocks.PINK_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("PINK_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.PINK_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_SIGN.get(), ModBlocks.PINK_COLORED_WOODEN_PLANKS.get(), 1);

        signBuilder(ModBlocks.BLUE_COLORED_SIGN.get(), Ingredient.of(ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("BLUE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_SIGN.get(), ModBlocks.BLUE_COLORED_WOODEN_PLANKS.get(), 1);

        signBuilder(ModBlocks.LIGHT_BLUE_COLORED_SIGN.get(), Ingredient.of(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("LIGHT_BLUE_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_SIGN.get(), ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS.get(), 1);

        signBuilder(ModBlocks.GRAY_COLORED_SIGN.get(), Ingredient.of(ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("GRAY_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_SIGN.get(), ModBlocks.GRAY_COLORED_WOODEN_PLANKS.get(), 1);

        signBuilder(ModBlocks.LIGHT_GRAY_COLORED_SIGN.get(), Ingredient.of(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("LIGHT_GRAY_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_SIGN.get(), ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS.get(), 1);

        signBuilder(ModBlocks.BLACK_COLORED_SIGN.get(), Ingredient.of(ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("BLACK_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_SIGN.get(), ModBlocks.BLACK_COLORED_WOODEN_PLANKS.get(), 1);

        signBuilder(ModBlocks.BROWN_COLORED_SIGN.get(), Ingredient.of(ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get()))
                .unlockedBy("BROWN_COLORED_WOODEN_PLANK".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get()).build())).save(pWriter);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_SIGN.get(), ModBlocks.BROWN_COLORED_WOODEN_PLANKS.get(), 1);

        //SIGN

        hangingSign(pWriter, ModBlocks.BROWN_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_BROWN_COLORED_LOG.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BROWN_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_BROWN_COLORED_LOG.get(), 1);
        hangingSign(pWriter, ModBlocks.BLACK_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_BLACK_COLORED_LOG.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLACK_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_BLACK_COLORED_LOG.get(), 1);
        hangingSign(pWriter, ModBlocks.GREEN_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_GREEN_COLORED_LOG.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_GREEN_COLORED_LOG.get(), 1);
        hangingSign(pWriter, ModBlocks.LIME_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_LIME_COLORED_LOG.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIME_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_LIME_COLORED_LOG.get(), 1);
        hangingSign(pWriter, ModBlocks.CYAN_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_CYAN_COLORED_LOG.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.CYAN_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_CYAN_COLORED_LOG.get(), 1);
        hangingSign(pWriter, ModBlocks.BLUE_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_BLUE_COLORED_LOG.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.BLUE_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_BLUE_COLORED_LOG.get(), 1);
        hangingSign(pWriter, ModBlocks.LIGHT_BLUE_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_LIGHT_BLUE_COLORED_LOG.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_LIGHT_BLUE_COLORED_LOG.get(), 1);
        hangingSign(pWriter, ModBlocks.LIGHT_GRAY_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_LIGHT_GRAY_COLORED_LOG.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.LIGHT_GRAY_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_LIGHT_GRAY_COLORED_LOG.get(), 1);
        hangingSign(pWriter, ModBlocks.GRAY_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_GRAY_COLORED_LOG.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.GRAY_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_GRAY_COLORED_LOG.get(), 1);
        hangingSign(pWriter, ModBlocks.ORANGE_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_ORANGE_COLORED_LOG.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_ORANGE_COLORED_LOG.get(), 1);
        hangingSign(pWriter, ModBlocks.YELLOW_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_YELLOW_COLORED_LOG.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_YELLOW_COLORED_LOG.get(), 1);
        hangingSign(pWriter, ModBlocks.RED_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_RED_COLORED_LOG.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.RED_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_RED_COLORED_LOG.get(), 1);
        hangingSign(pWriter, ModBlocks.WHITE_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_WHITE_COLORED_LOG.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.WHITE_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_WHITE_COLORED_LOG.get(), 1);
        hangingSign(pWriter, ModBlocks.PURPLE_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_PURPLE_COLORED_LOG.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PURPLE_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_PURPLE_COLORED_LOG.get(), 1);
        hangingSign(pWriter, ModBlocks.MAGENTA_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_MAGENTA_COLORED_LOG.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MAGENTA_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_MAGENTA_COLORED_LOG.get(), 1);
        hangingSign(pWriter, ModBlocks.PINK_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_PINK_COLORED_LOG.get());
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.PINK_COLORED_HANGING_SIGN.get(), ModBlocks.STRIPPED_PINK_COLORED_LOG.get(), 1);
        
        //MARBLE

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MARBLE.get(), 4)
                .pattern("SW")
                .pattern("WS")
                .define('S', Items.STONE)
                .define('W', ModBlocks.WHITE_COLORED_STONE.get())
                .unlockedBy("has_white_stone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WHITE_COLORED_STONE.get()).build()))
                .save(pWriter);

        wall(pWriter, RecipeCategory.MISC, ModBlocks.MARBLE_WALL.get(), ModBlocks.MARBLE.get());
        wall(pWriter, RecipeCategory.MISC, ModBlocks.MARBLE_BRICK_WALL.get(), ModBlocks.MARBLE_BRICKS.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.MARBLE_BRICKS.get(), ModBlocks.MARBLE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.MARBLE_SLAB.get(), ModBlocks.MARBLE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.MARBLE_BRICK_SLAB.get(), ModBlocks.MARBLE_BRICKS.get());

        stairBuilder(ModBlocks.MARBLE_STAIRS.get(), Ingredient.of(ModBlocks.MARBLE.get()))
                .unlockedBy("MARBLE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.MARBLE_BRICKS.get()).build())).save(pWriter);

        stairBuilder(ModBlocks.MARBLE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.MARBLE_BRICKS.get()))
                .unlockedBy("MARBLE".toLowerCase(Locale.ROOT), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.MARBLE_BRICKS.get()).build())).save(pWriter);

        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MARBLE_BRICK_WALL.get(), ModBlocks.MARBLE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MARBLE_BRICK_SLAB.get(), ModBlocks.MARBLE_BRICKS.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MARBLE_BRICK_STAIRS.get(), ModBlocks.MARBLE_BRICKS.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MARBLE_WALL.get(), ModBlocks.MARBLE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MARBLE_SLAB.get(), ModBlocks.MARBLE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MARBLE_STAIRS.get(), ModBlocks.MARBLE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MARBLE_BRICKS.get(), ModBlocks.MARBLE.get(), 1);
        stonecutterResultFromBase(pWriter, RecipeCategory.MISC, ModBlocks.MARBLE.get(), ModBlocks.WHITE_COLORED_STONE.get(), 1);

    }

  // protected static void planksFromLogs(Consumer<FinishedRecipe> finishedRecipeConsumer, ItemLike itemLike, Item itemLike1) {
  //     ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, itemLike, 4).requires(itemLike1).group("planks").unlockedBy("has_log", has(itemLike1)).save(finishedRecipeConsumer);
  // }

    protected static void stonecutterResultFromBase(Consumer<FinishedRecipe> finishedRecipeConsumer, RecipeCategory category, ItemLike itemLike, ItemLike itemLike1, int i) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(itemLike1), category, itemLike, i).unlockedBy(getHasName(itemLike1), has(itemLike1)).save(finishedRecipeConsumer, Caveopolis.MOD_ID + ":" + getConversionRecipeName(itemLike, itemLike1) + "_stonecutting");
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> p_250654_, List<ItemLike> p_250172_, RecipeCategory p_250588_, ItemLike p_251868_, float p_250789_, int p_252144_, String p_251687_) {
        oreCooking(p_250654_, RecipeSerializer.SMELTING_RECIPE, p_250172_, p_250588_, p_251868_, p_250789_, p_252144_, p_251687_, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> p_248775_, List<ItemLike> p_251504_, RecipeCategory p_248846_, ItemLike p_249735_, float p_248783_, int p_250303_, String p_251984_) {
        oreCooking(p_248775_, RecipeSerializer.BLASTING_RECIPE, p_251504_, p_248846_, p_249735_, p_248783_, p_250303_, p_251984_, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> finishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> recipeSerializer,
                                     List<ItemLike> pIngredients, RecipeCategory recipeCategory, ItemLike pResult, float pExperiance, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), recipeCategory, pResult, pExperiance, pCookingTime,
                    recipeSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(finishedRecipeConsumer, Caveopolis.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }

}
