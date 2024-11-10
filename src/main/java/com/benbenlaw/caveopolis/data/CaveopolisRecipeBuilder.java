package com.benbenlaw.caveopolis.data;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.CaveopolisBlocks;
import com.benbenlaw.caveopolis.data.recipes.ColorSprayCanMap;
import com.benbenlaw.caveopolis.data.recipes.WorktableRecipeBuilder;
import com.benbenlaw.caveopolis.recipe.ColoringRecipe;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.BookCloningRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.crafting.SizedIngredient;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class CaveopolisRecipeBuilder extends RecipeProvider {

    public CaveopolisRecipeBuilder(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void buildRecipes(RecipeOutput consumer) {
        String[] colors = {
                "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray",
                "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
        };

        SpecialRecipeBuilder.special(ColoringRecipe::new).save(consumer, "coloring");

        for (String color : colors) {

            //Vanilla To Caveopolis
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_STONE.get(), 1, Tags.Items.STONES, 1, "colored_stone");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_STONE_BRICKS.get(), 1, ItemTags.STONE_BRICKS, 1, "colored_stone_bricks");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_BRICKS.get(), 1, Blocks.BRICKS, 1, "colored_bricks");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_COBBLESTONE.get(), 1, Tags.Items.COBBLESTONES, 1, "colored_cobblestone");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_COBBLESTONE_BRICKS.get(), 1, Tags.Items.COBBLESTONES, 1, "colored_cobblestone_bricks");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_MARBLE.get(), 1, Items.CALCITE, 1, "colored_marble");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_MARBLE_BRICKS.get(), 1, Items.CALCITE, 1, "colored_marble_bricks");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_MOSAIC.get(), 1, Tags.Items.STONES, 1, "colored_mosaic");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_CHAOTIC.get(), 1, Tags.Items.STONES, 1, "colored_chaotic");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_TRIPLE.get(), 1, Tags.Items.STONES, 1, "colored_triple");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_BRAID.get(), 1, Tags.Items.STONES, 1, "colored_braid");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_ENCASED.get(), 1, Tags.Items.STONES, 1, "colored_encased");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_ROAD.get(), 1, Tags.Items.STONES, 1, "colored_road");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_LOG.get(), 1, ItemTags.LOGS, 1, "colored_log");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_WOOD.get(), 1, ItemTags.LOGS, 1, "colored_wood");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.STRIPPED_COLORED_LOG.get(), 1, ItemTags.LOGS, 1, "stripped_colored_log");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.STRIPPED_COLORED_WOOD.get(), 1, ItemTags.LOGS, 1, "stripped_colored_wood");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_PLANKS.get(), 1, ItemTags.PLANKS, 1, "colored_planks");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_LEAVES.get(), 1, ItemTags.LEAVES, 1, "colored_leaves");

            // Colored Stone
            createRecipe(consumer, color, "stone", CaveopolisBlocks.COLORED_STONE_STAIRS.get(), 1, CaveopolisBlocks.COLORED_STONE.get(), 1, "stairs");
            createRecipe(consumer, color, "stone", CaveopolisBlocks.COLORED_STONE_SLAB.get(), 2, CaveopolisBlocks.COLORED_STONE.get(), 2, "slab");
            createRecipe(consumer, color, "stone", CaveopolisBlocks.COLORED_STONE_WALL.get(), 1, CaveopolisBlocks.COLORED_STONE.get(), 1, "wall");
            createRecipe(consumer, color, "stone", CaveopolisBlocks.COLORED_STONE_BUTTON.get(), 4, CaveopolisBlocks.COLORED_STONE.get(), 1, "button");
            createRecipe(consumer, color, "stone", CaveopolisBlocks.COLORED_STONE_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_STONE.get(), 1, "pressure_plate");
            createRecipe(consumer, color, "stone", CaveopolisBlocks.COLORED_STONE_BRICKS.get(), 1, CaveopolisBlocks.COLORED_STONE.get(), 1, "stone_brick");
            createRecipe(consumer, color, "stone", CaveopolisBlocks.COLORED_BRICKS.get(), 1, CaveopolisBlocks.COLORED_STONE.get(), 1, "bricks");
            createRecipe(consumer, color, "stone", CaveopolisBlocks.COLORED_COBBLESTONE.get(), 1, CaveopolisBlocks.COLORED_STONE.get(), 1, "cobblestone");
            createRecipe(consumer, color, "stone", CaveopolisBlocks.COLORED_COBBLESTONE_BRICKS.get(), 1, CaveopolisBlocks.COLORED_STONE.get(), 1, "cobblestone_bricks");
            createRecipe(consumer, color, "stone", CaveopolisBlocks.COLORED_MARBLE.get(), 1, CaveopolisBlocks.COLORED_STONE.get(), 1, "marble");
            createRecipe(consumer, color, "stone", CaveopolisBlocks.COLORED_MARBLE_BRICKS.get(), 1, CaveopolisBlocks.COLORED_STONE.get(), 1, "marble_bricks");
            createRecipe(consumer, color, "stone", CaveopolisBlocks.COLORED_MOSAIC.get(), 1, CaveopolisBlocks.COLORED_STONE.get(), 1, "mosaic");
            createRecipe(consumer, color, "stone", CaveopolisBlocks.COLORED_CHAOTIC.get(), 1, CaveopolisBlocks.COLORED_STONE.get(), 1, "chaotic");
            createRecipe(consumer, color, "stone", CaveopolisBlocks.COLORED_TRIPLE.get(), 1, CaveopolisBlocks.COLORED_STONE.get(), 1, "triple");
            createRecipe(consumer, color, "stone", CaveopolisBlocks.COLORED_BRAID.get(), 1, CaveopolisBlocks.COLORED_STONE.get(), 1, "braid");
            createRecipe(consumer, color, "stone", CaveopolisBlocks.COLORED_ENCASED.get(), 1, CaveopolisBlocks.COLORED_STONE.get(), 1, "encased");
            createRecipe(consumer, color, "stone", CaveopolisBlocks.COLORED_ROAD.get(), 1, CaveopolisBlocks.COLORED_STONE.get(), 1, "road");


            // Colored Stone Brick
            createRecipe(consumer, color, "stone_brick", CaveopolisBlocks.COLORED_STONE_BRICK_STAIRS.get(), 1, CaveopolisBlocks.COLORED_STONE_BRICKS.get(), 1, "stairs");
            createRecipe(consumer, color, "stone_brick", CaveopolisBlocks.COLORED_STONE_BRICK_SLAB.get(), 2, CaveopolisBlocks.COLORED_STONE_BRICKS.get(), 2, "slab");
            createRecipe(consumer, color, "stone_brick", CaveopolisBlocks.COLORED_STONE_BRICK_WALL.get(), 1, CaveopolisBlocks.COLORED_STONE_BRICKS.get(), 1, "wall");
            createRecipe(consumer, color, "stone_brick", CaveopolisBlocks.COLORED_STONE_BRICK_BUTTON.get(), 4, CaveopolisBlocks.COLORED_STONE_BRICKS.get(), 1, "button");
            createRecipe(consumer, color, "stone_brick", CaveopolisBlocks.COLORED_STONE_BRICK_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_STONE_BRICKS.get(), 1, "pressure_plate");

            //Colored Bricks
            createRecipe(consumer, color, "bricks", CaveopolisBlocks.COLORED_BRICK_STAIRS.get(), 1, CaveopolisBlocks.COLORED_BRICKS.get(), 1, "stairs");
            createRecipe(consumer, color, "bricks", CaveopolisBlocks.COLORED_BRICK_SLAB.get(), 2, CaveopolisBlocks.COLORED_BRICKS.get(), 2, "slab");
            createRecipe(consumer, color, "bricks", CaveopolisBlocks.COLORED_BRICK_WALL.get(), 1, CaveopolisBlocks.COLORED_BRICKS.get(), 1, "wall");
            createRecipe(consumer, color, "bricks", CaveopolisBlocks.COLORED_BRICK_BUTTON.get(), 4, CaveopolisBlocks.COLORED_BRICKS.get(), 1, "button");
            createRecipe(consumer, color, "bricks", CaveopolisBlocks.COLORED_BRICK_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_BRICKS.get(), 1, "pressure_plate");

            //Colored Cobblestone
            createRecipe(consumer, color, "cobblestone", CaveopolisBlocks.COLORED_COBBLESTONE_STAIRS.get(), 1, CaveopolisBlocks.COLORED_COBBLESTONE.get(), 1, "stairs");
            createRecipe(consumer, color, "cobblestone", CaveopolisBlocks.COLORED_COBBLESTONE_SLAB.get(), 2, CaveopolisBlocks.COLORED_COBBLESTONE.get(), 2, "slab");
            createRecipe(consumer, color, "cobblestone", CaveopolisBlocks.COLORED_COBBLESTONE_WALL.get(), 1, CaveopolisBlocks.COLORED_COBBLESTONE.get(), 1, "wall");
            createRecipe(consumer, color, "cobblestone", CaveopolisBlocks.COLORED_COBBLESTONE_BUTTON.get(), 4, CaveopolisBlocks.COLORED_COBBLESTONE.get(), 1, "button");
            createRecipe(consumer, color, "cobblestone", CaveopolisBlocks.COLORED_COBBLESTONE_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_COBBLESTONE.get(), 1, "pressure_plate");

            //Colored Cobblestone Bricks
            createRecipe(consumer, color, "cobblestone_bricks", CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_STAIRS.get(), 1, CaveopolisBlocks.COLORED_COBBLESTONE_BRICKS.get(), 1, "stairs");
            createRecipe(consumer, color, "cobblestone_bricks", CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_SLAB.get(), 2, CaveopolisBlocks.COLORED_COBBLESTONE_BRICKS.get(), 2, "slab");
            createRecipe(consumer, color, "cobblestone_bricks", CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_WALL.get(), 1, CaveopolisBlocks.COLORED_COBBLESTONE_BRICKS.get(), 1, "wall");
            createRecipe(consumer, color, "cobblestone_bricks", CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_BUTTON.get(), 4, CaveopolisBlocks.COLORED_COBBLESTONE_BRICKS.get(), 1, "button");
            createRecipe(consumer, color, "cobblestone_bricks", CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_COBBLESTONE_BRICKS.get(), 1, "pressure_plate");

            //Colored Marble
            createRecipe(consumer, color, "marble", CaveopolisBlocks.COLORED_MARBLE_STAIRS.get(), 1, CaveopolisBlocks.COLORED_MARBLE.get(), 1, "stairs");
            createRecipe(consumer, color, "marble", CaveopolisBlocks.COLORED_MARBLE_SLAB.get(), 2, CaveopolisBlocks.COLORED_MARBLE.get(), 2, "slab");
            createRecipe(consumer, color, "marble", CaveopolisBlocks.COLORED_MARBLE_WALL.get(), 1, CaveopolisBlocks.COLORED_MARBLE.get(), 1, "wall");
            createRecipe(consumer, color, "marble", CaveopolisBlocks.COLORED_MARBLE_BUTTON.get(), 4, CaveopolisBlocks.COLORED_MARBLE.get(), 1, "button");
            createRecipe(consumer, color, "marble", CaveopolisBlocks.COLORED_MARBLE_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_MARBLE.get(), 1, "pressure_plate");

            //Colored Marble Bricks
            createRecipe(consumer, color, "marble_bricks", CaveopolisBlocks.COLORED_MARBLE_BRICK_STAIRS.get(), 1, CaveopolisBlocks.COLORED_MARBLE_BRICKS.get(), 1, "stairs");
            createRecipe(consumer, color, "marble_bricks", CaveopolisBlocks.COLORED_MARBLE_BRICK_SLAB.get(), 2, CaveopolisBlocks.COLORED_MARBLE_BRICKS.get(), 2, "slab");
            createRecipe(consumer, color, "marble_bricks", CaveopolisBlocks.COLORED_MARBLE_BRICK_WALL.get(), 1, CaveopolisBlocks.COLORED_MARBLE_BRICKS.get(), 1, "wall");
            createRecipe(consumer, color, "marble_bricks", CaveopolisBlocks.COLORED_MARBLE_BRICK_BUTTON.get(), 4, CaveopolisBlocks.COLORED_MARBLE_BRICKS.get(), 1, "button");
            createRecipe(consumer, color, "marble_bricks", CaveopolisBlocks.COLORED_MARBLE_BRICK_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_MARBLE_BRICKS.get(), 1, "pressure_plate");

            //Colored Mosaic
            createRecipe(consumer, color, "mosaic", CaveopolisBlocks.COLORED_MOSAIC_STAIRS.get(), 1, CaveopolisBlocks.COLORED_MOSAIC.get(), 1, "stairs");
            createRecipe(consumer, color, "mosaic", CaveopolisBlocks.COLORED_MOSAIC_SLAB.get(), 2, CaveopolisBlocks.COLORED_MOSAIC.get(), 2, "slab");
            createRecipe(consumer, color, "mosaic", CaveopolisBlocks.COLORED_MOSAIC_WALL.get(), 1, CaveopolisBlocks.COLORED_MOSAIC.get(), 1, "wall");
            createRecipe(consumer, color, "mosaic", CaveopolisBlocks.COLORED_MOSAIC_BUTTON.get(), 4, CaveopolisBlocks.COLORED_MOSAIC.get(), 1, "button");
            createRecipe(consumer, color, "mosaic", CaveopolisBlocks.COLORED_MOSAIC_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_MOSAIC.get(), 1, "pressure_plate");

            //Colored Chaotic
            createRecipe(consumer, color, "chaotic", CaveopolisBlocks.COLORED_CHAOTIC_STAIRS.get(), 1, CaveopolisBlocks.COLORED_CHAOTIC.get(), 1, "stairs");
            createRecipe(consumer, color, "chaotic", CaveopolisBlocks.COLORED_CHAOTIC_SLAB.get(), 2, CaveopolisBlocks.COLORED_CHAOTIC.get(), 2, "slab");
            createRecipe(consumer, color, "chaotic", CaveopolisBlocks.COLORED_CHAOTIC_WALL.get(), 1, CaveopolisBlocks.COLORED_CHAOTIC.get(), 1, "wall");
            createRecipe(consumer, color, "chaotic", CaveopolisBlocks.COLORED_CHAOTIC_BUTTON.get(), 4, CaveopolisBlocks.COLORED_CHAOTIC.get(), 1, "button");
            createRecipe(consumer, color, "chaotic", CaveopolisBlocks.COLORED_CHAOTIC_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_CHAOTIC.get(), 1, "pressure_plate");

            //Colored Triple
            createRecipe(consumer, color, "triple", CaveopolisBlocks.COLORED_TRIPLE_STAIRS.get(), 1, CaveopolisBlocks.COLORED_TRIPLE.get(), 1, "stairs");
            createRecipe(consumer, color, "triple", CaveopolisBlocks.COLORED_TRIPLE_SLAB.get(), 2, CaveopolisBlocks.COLORED_TRIPLE.get(), 2, "slab");
            createRecipe(consumer, color, "triple", CaveopolisBlocks.COLORED_TRIPLE_WALL.get(), 1, CaveopolisBlocks.COLORED_TRIPLE.get(), 1, "wall");
            createRecipe(consumer, color, "triple", CaveopolisBlocks.COLORED_TRIPLE_BUTTON.get(), 4, CaveopolisBlocks.COLORED_TRIPLE.get(), 1, "button");
            createRecipe(consumer, color, "triple", CaveopolisBlocks.COLORED_TRIPLE_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_TRIPLE.get(), 1, "pressure_plate");

            //Colored Braid
            createRecipe(consumer, color, "braid", CaveopolisBlocks.COLORED_BRAID_STAIRS.get(), 1, CaveopolisBlocks.COLORED_BRAID.get(), 1, "stairs");
            createRecipe(consumer, color, "braid", CaveopolisBlocks.COLORED_BRAID_SLAB.get(), 2, CaveopolisBlocks.COLORED_BRAID.get(), 2, "slab");
            createRecipe(consumer, color, "braid", CaveopolisBlocks.COLORED_BRAID_WALL.get(), 1, CaveopolisBlocks.COLORED_BRAID.get(), 1, "wall");
            createRecipe(consumer, color, "braid", CaveopolisBlocks.COLORED_BRAID_BUTTON.get(), 4, CaveopolisBlocks.COLORED_BRAID.get(), 1, "button");
            createRecipe(consumer, color, "braid", CaveopolisBlocks.COLORED_BRAID_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_BRAID.get(), 1, "pressure_plate");

            //Colored Encased
            createRecipe(consumer, color, "encased", CaveopolisBlocks.COLORED_ENCASED_STAIRS.get(), 1, CaveopolisBlocks.COLORED_ENCASED.get(), 1, "stairs");
            createRecipe(consumer, color, "encased", CaveopolisBlocks.COLORED_ENCASED_SLAB.get(), 2, CaveopolisBlocks.COLORED_ENCASED.get(), 2, "slab");
            createRecipe(consumer, color, "encased", CaveopolisBlocks.COLORED_ENCASED_WALL.get(), 1, CaveopolisBlocks.COLORED_ENCASED.get(), 1, "wall");
            createRecipe(consumer, color, "encased", CaveopolisBlocks.COLORED_ENCASED_BUTTON.get(), 4, CaveopolisBlocks.COLORED_ENCASED.get(), 1, "button");
            createRecipe(consumer, color, "encased", CaveopolisBlocks.COLORED_ENCASED_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_ENCASED.get(), 1, "pressure_plate");

            //Colored Road
            createRecipe(consumer, color, "road", CaveopolisBlocks.COLORED_ROAD_STAIRS.get(), 1, CaveopolisBlocks.COLORED_ROAD.get(), 1, "stairs");
            createRecipe(consumer, color, "road", CaveopolisBlocks.COLORED_ROAD_SLAB.get(), 2, CaveopolisBlocks.COLORED_ROAD.get(), 2, "slab");
            createRecipe(consumer, color, "road", CaveopolisBlocks.COLORED_ROAD_WALL.get(), 1, CaveopolisBlocks.COLORED_ROAD.get(), 1, "wall");
            createRecipe(consumer, color, "road", CaveopolisBlocks.COLORED_ROAD_BUTTON.get(), 4, CaveopolisBlocks.COLORED_ROAD.get(), 1, "button");
            createRecipe(consumer, color, "road", CaveopolisBlocks.COLORED_ROAD_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_ROAD.get(), 1, "pressure_plate");

        }



    }

    private void createRecipe(RecipeOutput consumer, String color, String blockType, ItemLike output, int outputCount, ItemLike input, int inputCount, String path) {

        Ingredient inputIngredient = Ingredient.of(iconWithColor(new ItemStack(input, inputCount), color));
        WorktableRecipeBuilder.worktableRecipeBuilder(iconWithColor(new ItemStack(output, outputCount), color),
                    inputIngredient)
                .unlockedBy("has_item", has(input))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "worktable/" + blockType + "/" + path + "/" + color));
    }
    private void createRecipe(RecipeOutput consumer, String color, String blockType, ItemLike output, int outputCount, TagKey<Item> input, int inputCount, String path) {

        WorktableRecipeBuilder.worktableRecipeBuilder(iconWithColor(new ItemStack(output, outputCount), color),
                        Ingredient.of(input))
                .unlockedBy("has_item", has(input))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "worktable/" + blockType + "/" + path + "/" + color));
    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }
}
