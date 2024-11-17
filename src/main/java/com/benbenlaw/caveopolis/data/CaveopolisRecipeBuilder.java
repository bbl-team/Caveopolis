package com.benbenlaw.caveopolis.data;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.CaveopolisBlocks;
import com.benbenlaw.caveopolis.data.recipes.WorktableRecipeBuilder;
import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.caveopolis.recipe.ColoringRecipe;
import com.benbenlaw.caveopolis.recipe.LightingRecipe;
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
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.crafting.SizedIngredient;

import java.util.concurrent.CompletableFuture;

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

        SpecialRecipeBuilder.special(ColoringRecipe::new).save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "coloring"));
        SpecialRecipeBuilder.special(LightingRecipe::new).save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "lighting"));

        for (String color : colors) {

            //Logs to Planks (This will be added for 1.22 when crafting supports data components)
        //    planksFromLog(consumer, color, "colored_logs", CaveopolisBlocks.COLORED_LOG.get(), CaveopolisBlocks.COLORED_PLANKS.get(), 4);
        //    planksFromLog(consumer, color, "colored_wood",CaveopolisBlocks.COLORED_WOOD.get(), CaveopolisBlocks.COLORED_PLANKS.get(), 4);
        //    planksFromLog(consumer, color, "stripped_colored_logs",CaveopolisBlocks.STRIPPED_COLORED_LOG.get(), CaveopolisBlocks.COLORED_PLANKS.get(), 4);
        //    planksFromLog(consumer, color, "stripped_colored_wood",CaveopolisBlocks.STRIPPED_COLORED_WOOD.get(), CaveopolisBlocks.COLORED_PLANKS.get(), 4);

            //Logs To Planks
            createRecipe(consumer, color, "logs", CaveopolisBlocks.COLORED_PLANKS.get(), 4, CaveopolisBlocks.COLORED_LOG.get(), 1, "planks");
            createRecipe(consumer, color, "wood", CaveopolisBlocks.COLORED_PLANKS.get(), 4, CaveopolisBlocks.COLORED_WOOD.get(), 1, "planks");
            createRecipe(consumer, color, "stripped_logs", CaveopolisBlocks.COLORED_PLANKS.get(), 4, CaveopolisBlocks.STRIPPED_COLORED_LOG.get(), 1, "planks");
            createRecipe(consumer, color, "stripped_wood", CaveopolisBlocks.COLORED_PLANKS.get(), 4, CaveopolisBlocks.STRIPPED_COLORED_WOOD.get(), 1, "planks");

            //Vanilla To Caveopolis
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_POPPY.get(), 1, Items.POPPY, 1, "colored_poppy");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_DANDELION.get(), 1, Items.DANDELION, 1, "colored_dandelion");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_POLISHED_STONE.get(), 1, Items.SMOOTH_STONE, 1, "colored_polished_stone");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_STONE.get(), 1, Items.STONE, 1, "colored_stone");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_STONE_BRICKS.get(), 1, Items.STONE_BRICKS, 1, "colored_stone_bricks");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_BRICKS.get(), 1, Blocks.BRICKS, 1, "colored_bricks");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_COBBLESTONE.get(), 1, Items.COBBLESTONE, 1, "colored_cobblestone");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_COBBLESTONE_BRICKS.get(), 1, Items.COBBLESTONE, 1, "colored_cobblestone_bricks");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_MARBLE.get(), 1, Items.CALCITE, 1, "colored_marble");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_MARBLE_BRICKS.get(), 1, Items.CALCITE, 1, "colored_marble_bricks");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_MOSAIC.get(), 1, Items.STONE, 1, "colored_mosaic");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_CHAOTIC.get(), 1, Items.STONE, 1, "colored_chaotic");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_TRIPLE.get(), 1, Items.STONE, 1, "colored_triple");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_BRAID.get(), 1, Items.STONE, 1, "colored_braid");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_ENCASED.get(), 1, Items.STONE, 1, "colored_encased");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_ROAD.get(), 1, Items.STONE, 1, "colored_road");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_LOG.get(), 1, ItemTags.LOGS, 1, "colored_log");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_WOOD.get(), 1, ItemTags.LOGS, 1, "colored_wood");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.STRIPPED_COLORED_LOG.get(), 1, ItemTags.LOGS, 1, "stripped_colored_log");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.STRIPPED_COLORED_WOOD.get(), 1, ItemTags.LOGS, 1, "stripped_colored_wood");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_PLANKS.get(), 1, ItemTags.PLANKS, 1, "colored_planks");
            createRecipe(consumer, color, "vanilla", CaveopolisBlocks.COLORED_LEAVES.get(), 1, ItemTags.LEAVES, 1, "colored_leaves");

            //Colored Planks
            createRecipe(consumer, color, "planks", CaveopolisBlocks.COLORED_PLANK_STAIRS.get(), 1, CaveopolisBlocks.COLORED_PLANKS.get(), 1, "stairs");
            createRecipe(consumer, color, "planks", CaveopolisBlocks.COLORED_PLANK_SLAB.get(), 2, CaveopolisBlocks.COLORED_PLANKS.get(), 1, "slab");
            createRecipe(consumer, color, "planks", CaveopolisBlocks.COLORED_PLANK_BUTTON.get(), 4, CaveopolisBlocks.COLORED_PLANKS.get(), 1, "button");
            createRecipe(consumer, color, "planks", CaveopolisBlocks.COLORED_PLANK_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_PLANKS.get(), 1, "pressure_plate");
            createRecipe(consumer, color, "planks", CaveopolisBlocks.COLORED_PLANK_DOOR.get(), 1, CaveopolisBlocks.COLORED_PLANKS.get(), 2, "door");
            createRecipe(consumer, color, "planks", CaveopolisBlocks.COLORED_PLANK_TRAPDOOR.get(), 1, CaveopolisBlocks.COLORED_PLANKS.get(), 3, "trapdoor");
            createRecipe(consumer, color, "planks", CaveopolisBlocks.COLORED_PLANK_FENCE.get(), 1, CaveopolisBlocks.COLORED_PLANKS.get(), 1, "fence");
            createRecipe(consumer, color, "planks", CaveopolisBlocks.COLORED_PLANK_FENCE_GATE.get(), 1, CaveopolisBlocks.COLORED_PLANKS.get(), 1, "fence_gate");


            // Colored Stone
            createRecipe(consumer, color, "stone", CaveopolisBlocks.COLORED_STONE_STAIRS.get(), 1, CaveopolisBlocks.COLORED_STONE.get(), 1, "stairs");
            createRecipe(consumer, color, "stone", CaveopolisBlocks.COLORED_STONE_SLAB.get(), 2, CaveopolisBlocks.COLORED_STONE.get(), 1, "slab");
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

            // Colored Polished Stone
            createRecipe(consumer, color, "polished_stone", CaveopolisBlocks.COLORED_POLISHED_STONE_STAIRS.get(), 1, CaveopolisBlocks.COLORED_POLISHED_STONE.get(), 1, "stairs");
            createRecipe(consumer, color, "polished_stone", CaveopolisBlocks.COLORED_POLISHED_STONE_SLAB.get(), 2, CaveopolisBlocks.COLORED_POLISHED_STONE.get(), 1, "slab");
            createRecipe(consumer, color, "polished_stone", CaveopolisBlocks.COLORED_POLISHED_STONE_WALL.get(), 1, CaveopolisBlocks.COLORED_POLISHED_STONE.get(), 1, "wall");
            createRecipe(consumer, color, "polished_stone", CaveopolisBlocks.COLORED_POLISHED_STONE_BUTTON.get(), 4, CaveopolisBlocks.COLORED_POLISHED_STONE.get(), 1, "button");
            createRecipe(consumer, color, "polished_stone", CaveopolisBlocks.COLORED_POLISHED_STONE_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_POLISHED_STONE.get(), 1, "pressure_plate");

            // Colored Stone Brick
            createRecipe(consumer, color, "stone_brick", CaveopolisBlocks.COLORED_STONE_BRICK_STAIRS.get(), 1, CaveopolisBlocks.COLORED_STONE_BRICKS.get(), 1, "stairs");
            createRecipe(consumer, color, "stone_brick", CaveopolisBlocks.COLORED_STONE_BRICK_SLAB.get(), 2, CaveopolisBlocks.COLORED_STONE_BRICKS.get(), 1, "slab");
            createRecipe(consumer, color, "stone_brick", CaveopolisBlocks.COLORED_STONE_BRICK_WALL.get(), 1, CaveopolisBlocks.COLORED_STONE_BRICKS.get(), 1, "wall");
            createRecipe(consumer, color, "stone_brick", CaveopolisBlocks.COLORED_STONE_BRICK_BUTTON.get(), 4, CaveopolisBlocks.COLORED_STONE_BRICKS.get(), 1, "button");
            createRecipe(consumer, color, "stone_brick", CaveopolisBlocks.COLORED_STONE_BRICK_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_STONE_BRICKS.get(), 1, "pressure_plate");

            //Colored Bricks
            createRecipe(consumer, color, "bricks", CaveopolisBlocks.COLORED_BRICK_STAIRS.get(), 1, CaveopolisBlocks.COLORED_BRICKS.get(), 1, "stairs");
            createRecipe(consumer, color, "bricks", CaveopolisBlocks.COLORED_BRICK_SLAB.get(), 2, CaveopolisBlocks.COLORED_BRICKS.get(), 1, "slab");
            createRecipe(consumer, color, "bricks", CaveopolisBlocks.COLORED_BRICK_WALL.get(), 1, CaveopolisBlocks.COLORED_BRICKS.get(), 1, "wall");
            createRecipe(consumer, color, "bricks", CaveopolisBlocks.COLORED_BRICK_BUTTON.get(), 4, CaveopolisBlocks.COLORED_BRICKS.get(), 1, "button");
            createRecipe(consumer, color, "bricks", CaveopolisBlocks.COLORED_BRICK_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_BRICKS.get(), 1, "pressure_plate");

            //Colored Cobblestone
            createRecipe(consumer, color, "cobblestone", CaveopolisBlocks.COLORED_COBBLESTONE_STAIRS.get(), 1, CaveopolisBlocks.COLORED_COBBLESTONE.get(), 1, "stairs");
            createRecipe(consumer, color, "cobblestone", CaveopolisBlocks.COLORED_COBBLESTONE_SLAB.get(), 2, CaveopolisBlocks.COLORED_COBBLESTONE.get(), 1, "slab");
            createRecipe(consumer, color, "cobblestone", CaveopolisBlocks.COLORED_COBBLESTONE_WALL.get(), 1, CaveopolisBlocks.COLORED_COBBLESTONE.get(), 1, "wall");
            createRecipe(consumer, color, "cobblestone", CaveopolisBlocks.COLORED_COBBLESTONE_BUTTON.get(), 4, CaveopolisBlocks.COLORED_COBBLESTONE.get(), 1, "button");
            createRecipe(consumer, color, "cobblestone", CaveopolisBlocks.COLORED_COBBLESTONE_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_COBBLESTONE.get(), 1, "pressure_plate");

            //Colored Cobblestone Bricks
            createRecipe(consumer, color, "cobblestone_bricks", CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_STAIRS.get(), 1, CaveopolisBlocks.COLORED_COBBLESTONE_BRICKS.get(), 1, "stairs");
            createRecipe(consumer, color, "cobblestone_bricks", CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_SLAB.get(), 2, CaveopolisBlocks.COLORED_COBBLESTONE_BRICKS.get(), 1, "slab");
            createRecipe(consumer, color, "cobblestone_bricks", CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_WALL.get(), 1, CaveopolisBlocks.COLORED_COBBLESTONE_BRICKS.get(), 1, "wall");
            createRecipe(consumer, color, "cobblestone_bricks", CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_BUTTON.get(), 4, CaveopolisBlocks.COLORED_COBBLESTONE_BRICKS.get(), 1, "button");
            createRecipe(consumer, color, "cobblestone_bricks", CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_COBBLESTONE_BRICKS.get(), 1, "pressure_plate");

            //Colored Marble
            createRecipe(consumer, color, "marble", CaveopolisBlocks.COLORED_MARBLE_STAIRS.get(), 1, CaveopolisBlocks.COLORED_MARBLE.get(), 1, "stairs");
            createRecipe(consumer, color, "marble", CaveopolisBlocks.COLORED_MARBLE_SLAB.get(), 2, CaveopolisBlocks.COLORED_MARBLE.get(), 1, "slab");
            createRecipe(consumer, color, "marble", CaveopolisBlocks.COLORED_MARBLE_WALL.get(), 1, CaveopolisBlocks.COLORED_MARBLE.get(), 1, "wall");
            createRecipe(consumer, color, "marble", CaveopolisBlocks.COLORED_MARBLE_BUTTON.get(), 4, CaveopolisBlocks.COLORED_MARBLE.get(), 1, "button");
            createRecipe(consumer, color, "marble", CaveopolisBlocks.COLORED_MARBLE_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_MARBLE.get(), 1, "pressure_plate");

            //Colored Marble Bricks
            createRecipe(consumer, color, "marble_bricks", CaveopolisBlocks.COLORED_MARBLE_BRICK_STAIRS.get(), 1, CaveopolisBlocks.COLORED_MARBLE_BRICKS.get(), 1, "stairs");
            createRecipe(consumer, color, "marble_bricks", CaveopolisBlocks.COLORED_MARBLE_BRICK_SLAB.get(), 2, CaveopolisBlocks.COLORED_MARBLE_BRICKS.get(), 1, "slab");
            createRecipe(consumer, color, "marble_bricks", CaveopolisBlocks.COLORED_MARBLE_BRICK_WALL.get(), 1, CaveopolisBlocks.COLORED_MARBLE_BRICKS.get(), 1, "wall");
            createRecipe(consumer, color, "marble_bricks", CaveopolisBlocks.COLORED_MARBLE_BRICK_BUTTON.get(), 4, CaveopolisBlocks.COLORED_MARBLE_BRICKS.get(), 1, "button");
            createRecipe(consumer, color, "marble_bricks", CaveopolisBlocks.COLORED_MARBLE_BRICK_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_MARBLE_BRICKS.get(), 1, "pressure_plate");

            //Colored Mosaic
            createRecipe(consumer, color, "mosaic", CaveopolisBlocks.COLORED_MOSAIC_STAIRS.get(), 1, CaveopolisBlocks.COLORED_MOSAIC.get(), 1, "stairs");
            createRecipe(consumer, color, "mosaic", CaveopolisBlocks.COLORED_MOSAIC_SLAB.get(), 2, CaveopolisBlocks.COLORED_MOSAIC.get(), 1, "slab");
            createRecipe(consumer, color, "mosaic", CaveopolisBlocks.COLORED_MOSAIC_WALL.get(), 1, CaveopolisBlocks.COLORED_MOSAIC.get(), 1, "wall");
            createRecipe(consumer, color, "mosaic", CaveopolisBlocks.COLORED_MOSAIC_BUTTON.get(), 4, CaveopolisBlocks.COLORED_MOSAIC.get(), 1, "button");
            createRecipe(consumer, color, "mosaic", CaveopolisBlocks.COLORED_MOSAIC_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_MOSAIC.get(), 1, "pressure_plate");

            //Colored Chaotic
            createRecipe(consumer, color, "chaotic", CaveopolisBlocks.COLORED_CHAOTIC_STAIRS.get(), 1, CaveopolisBlocks.COLORED_CHAOTIC.get(), 1, "stairs");
            createRecipe(consumer, color, "chaotic", CaveopolisBlocks.COLORED_CHAOTIC_SLAB.get(), 2, CaveopolisBlocks.COLORED_CHAOTIC.get(), 1, "slab");
            createRecipe(consumer, color, "chaotic", CaveopolisBlocks.COLORED_CHAOTIC_WALL.get(), 1, CaveopolisBlocks.COLORED_CHAOTIC.get(), 1, "wall");
            createRecipe(consumer, color, "chaotic", CaveopolisBlocks.COLORED_CHAOTIC_BUTTON.get(), 4, CaveopolisBlocks.COLORED_CHAOTIC.get(), 1, "button");
            createRecipe(consumer, color, "chaotic", CaveopolisBlocks.COLORED_CHAOTIC_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_CHAOTIC.get(), 1, "pressure_plate");

            //Colored Triple
            createRecipe(consumer, color, "triple", CaveopolisBlocks.COLORED_TRIPLE_STAIRS.get(), 1, CaveopolisBlocks.COLORED_TRIPLE.get(), 1, "stairs");
            createRecipe(consumer, color, "triple", CaveopolisBlocks.COLORED_TRIPLE_SLAB.get(), 2, CaveopolisBlocks.COLORED_TRIPLE.get(), 1, "slab");
            createRecipe(consumer, color, "triple", CaveopolisBlocks.COLORED_TRIPLE_WALL.get(), 1, CaveopolisBlocks.COLORED_TRIPLE.get(), 1, "wall");
            createRecipe(consumer, color, "triple", CaveopolisBlocks.COLORED_TRIPLE_BUTTON.get(), 4, CaveopolisBlocks.COLORED_TRIPLE.get(), 1, "button");
            createRecipe(consumer, color, "triple", CaveopolisBlocks.COLORED_TRIPLE_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_TRIPLE.get(), 1, "pressure_plate");

            //Colored Braid
            createRecipe(consumer, color, "braid", CaveopolisBlocks.COLORED_BRAID_STAIRS.get(), 1, CaveopolisBlocks.COLORED_BRAID.get(), 1, "stairs");
            createRecipe(consumer, color, "braid", CaveopolisBlocks.COLORED_BRAID_SLAB.get(), 2, CaveopolisBlocks.COLORED_BRAID.get(), 1, "slab");
            createRecipe(consumer, color, "braid", CaveopolisBlocks.COLORED_BRAID_WALL.get(), 1, CaveopolisBlocks.COLORED_BRAID.get(), 1, "wall");
            createRecipe(consumer, color, "braid", CaveopolisBlocks.COLORED_BRAID_BUTTON.get(), 4, CaveopolisBlocks.COLORED_BRAID.get(), 1, "button");
            createRecipe(consumer, color, "braid", CaveopolisBlocks.COLORED_BRAID_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_BRAID.get(), 1, "pressure_plate");

            //Colored Encased
            createRecipe(consumer, color, "encased", CaveopolisBlocks.COLORED_ENCASED_STAIRS.get(), 1, CaveopolisBlocks.COLORED_ENCASED.get(), 1, "stairs");
            createRecipe(consumer, color, "encased", CaveopolisBlocks.COLORED_ENCASED_SLAB.get(), 2, CaveopolisBlocks.COLORED_ENCASED.get(), 1, "slab");
            createRecipe(consumer, color, "encased", CaveopolisBlocks.COLORED_ENCASED_WALL.get(), 1, CaveopolisBlocks.COLORED_ENCASED.get(), 1, "wall");
            createRecipe(consumer, color, "encased", CaveopolisBlocks.COLORED_ENCASED_BUTTON.get(), 4, CaveopolisBlocks.COLORED_ENCASED.get(), 1, "button");
            createRecipe(consumer, color, "encased", CaveopolisBlocks.COLORED_ENCASED_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_ENCASED.get(), 1, "pressure_plate");

            //Colored Road
            createRecipe(consumer, color, "road", CaveopolisBlocks.COLORED_ROAD_STAIRS.get(), 1, CaveopolisBlocks.COLORED_ROAD.get(), 1, "stairs");
            createRecipe(consumer, color, "road", CaveopolisBlocks.COLORED_ROAD_SLAB.get(), 2, CaveopolisBlocks.COLORED_ROAD.get(), 1, "slab");
            createRecipe(consumer, color, "road", CaveopolisBlocks.COLORED_ROAD_WALL.get(), 1, CaveopolisBlocks.COLORED_ROAD.get(), 1, "wall");
            createRecipe(consumer, color, "road", CaveopolisBlocks.COLORED_ROAD_BUTTON.get(), 4, CaveopolisBlocks.COLORED_ROAD.get(), 1, "button");
            createRecipe(consumer, color, "road", CaveopolisBlocks.COLORED_ROAD_PRESSURE_PLATE.get(), 3, CaveopolisBlocks.COLORED_ROAD.get(), 1, "pressure_plate");
        }

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



    }

    private void createRecipe(RecipeOutput consumer, String color, String blockType, ItemLike output, int outputCount, ItemLike input, int inputCount, String path) {

        ItemLike inputStack = iconWithColor(new ItemStack(input, inputCount), color).getItem();
        SizedIngredient inputIngredient = SizedIngredient.of(inputStack, inputCount);
        WorktableRecipeBuilder.worktableRecipeBuilder(iconWithColor(new ItemStack(output, outputCount), color),
                        inputIngredient)
                .unlockedBy("has_item", has(input))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "worktable/" + blockType + "/" + path + "/" + color));
    }
    private void createRecipe(RecipeOutput consumer, String color, String blockType, ItemLike output, int outputCount, TagKey<Item> input, int inputCount, String path) {

        WorktableRecipeBuilder.worktableRecipeBuilder(iconWithColor(new ItemStack(output, outputCount), color),
                        SizedIngredient.of(input, inputCount))
                .unlockedBy("has_item", has(input))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "worktable/" + blockType + "/" + path + "/" + color));
    }

    private void planksFromLog(RecipeOutput consumer, String color, String blockType, ItemLike output, ItemLike input, int outputCount) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, iconWithColor(new ItemStack(output, outputCount), color).getItem(), outputCount)
                .pattern("L")
                .define('L', iconWithColor(new ItemStack(input), color).getItem())
                .group("planks")
                .unlockedBy("has_log", has(input))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "crafting/" + blockType + "/" + color));
    }

    private static ItemStack iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }
}