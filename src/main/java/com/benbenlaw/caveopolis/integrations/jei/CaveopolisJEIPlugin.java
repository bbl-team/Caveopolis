package com.benbenlaw.caveopolis.integrations.jei;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.CaveopolisBlocks;
import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.caveopolis.recipe.CaveopolisRecipes;
import com.benbenlaw.caveopolis.recipe.WorktableRecipe;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.gui.drawable.IDrawableStatic;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.ISubtypeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;

@JeiPlugin
public class CaveopolisJEIPlugin implements IModPlugin {

    public static IDrawableStatic slotDrawable;
    @Override
    public ResourceLocation getPluginUid() {
        return ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "jei_plugin");
    }



    @Override
    public void registerItemSubtypes(ISubtypeRegistration registration) {

        //Crafting Table
        registration.registerSubtypeInterpreter(CaveopolisItems.COLORED_CRAFTING_TABLE.get(), new BlockSubtypeInterpreter());

        //Colored Items
        registration.registerSubtypeInterpreter(CaveopolisItems.COLORED_APPLE.asItem(), new BlockSubtypeInterpreter());

        //Colored Flower
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_POPPY.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_DANDELION.asItem(), new BlockSubtypeInterpreter());

        //Colored Tile
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_TILE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_TILE_STAIRS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_TILE_SLAB.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_TILE_WALL.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_TILE_PRESSURE_PLATE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_TILE_BUTTON.asItem(), new BlockSubtypeInterpreter());

        //Colored Polished Stone
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_POLISHED_STONE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_POLISHED_STONE_STAIRS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_POLISHED_STONE_SLAB.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_POLISHED_STONE_WALL.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_POLISHED_STONE_PRESSURE_PLATE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_POLISHED_STONE_BUTTON.asItem(), new BlockSubtypeInterpreter());

        //Colored Stone
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_STONE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_STONE_STAIRS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_STONE_SLAB.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_STONE_WALL.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_STONE_PRESSURE_PLATE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_STONE_BUTTON.asItem(), new BlockSubtypeInterpreter());

        //Colored Stone Bricks
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_STONE_BRICKS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_STONE_BRICK_STAIRS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_STONE_BRICK_SLAB.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_STONE_BRICK_WALL.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_STONE_BRICK_PRESSURE_PLATE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_STONE_BRICK_BUTTON.asItem(), new BlockSubtypeInterpreter());

        //Colored Bricks
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_BRICKS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_BRICK_STAIRS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_BRICK_SLAB.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_BRICK_WALL.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_BRICK_PRESSURE_PLATE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_BRICK_BUTTON.asItem(), new BlockSubtypeInterpreter());

        //Colored Cobblestone
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_COBBLESTONE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_COBBLESTONE_STAIRS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_COBBLESTONE_SLAB.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_COBBLESTONE_WALL.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_COBBLESTONE_PRESSURE_PLATE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_COBBLESTONE_BUTTON.asItem(), new BlockSubtypeInterpreter());

        //Colored Cobblestone Bricks
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_COBBLESTONE_BRICKS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_STAIRS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_SLAB.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_WALL.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_PRESSURE_PLATE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_COBBLESTONE_BRICK_BUTTON.asItem(), new BlockSubtypeInterpreter());

        //Colored Marble
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_MARBLE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_MARBLE_STAIRS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_MARBLE_SLAB.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_MARBLE_WALL.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_MARBLE_PRESSURE_PLATE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_MARBLE_BUTTON.asItem(), new BlockSubtypeInterpreter());

        //Colored Marble Bricks
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_MARBLE_BRICKS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_MARBLE_BRICK_STAIRS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_MARBLE_BRICK_SLAB.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_MARBLE_BRICK_WALL.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_MARBLE_BRICK_PRESSURE_PLATE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_MARBLE_BRICK_BUTTON.asItem(), new BlockSubtypeInterpreter());

        //Colored Mosaic
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_MOSAIC.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_MOSAIC_STAIRS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_MOSAIC_SLAB.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_MOSAIC_WALL.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_MOSAIC_PRESSURE_PLATE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_MOSAIC_BUTTON.asItem(), new BlockSubtypeInterpreter());

        //Colored Chaotic
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_CHAOTIC.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_CHAOTIC_STAIRS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_CHAOTIC_SLAB.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_CHAOTIC_WALL.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_CHAOTIC_PRESSURE_PLATE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_CHAOTIC_BUTTON.asItem(), new BlockSubtypeInterpreter());

        //Colored Triple
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_TRIPLE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_TRIPLE_STAIRS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_TRIPLE_SLAB.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_TRIPLE_WALL.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_TRIPLE_PRESSURE_PLATE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_TRIPLE_BUTTON.asItem(), new BlockSubtypeInterpreter());

        //Colored Braid
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_BRAID.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_BRAID_STAIRS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_BRAID_SLAB.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_BRAID_WALL.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_BRAID_PRESSURE_PLATE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_BRAID_BUTTON.asItem(), new BlockSubtypeInterpreter());

        //Colored Encased
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_ENCASED.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_ENCASED_STAIRS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_ENCASED_SLAB.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_ENCASED_WALL.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_ENCASED_PRESSURE_PLATE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_ENCASED_BUTTON.asItem(), new BlockSubtypeInterpreter());

        //Colored Road
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_ROAD.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_ROAD_STAIRS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_ROAD_SLAB.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_ROAD_WALL.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_ROAD_PRESSURE_PLATE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_ROAD_BUTTON.asItem(), new BlockSubtypeInterpreter());





        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_PLANKS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_PLANK_SLAB.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_PLANK_STAIRS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_PLANK_PRESSURE_PLATE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_PLANK_BUTTON.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_PLANK_FENCE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_PLANK_FENCE_GATE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_PLANK_DOOR.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_PLANK_TRAPDOOR.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_LOG.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_WOOD.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.STRIPPED_COLORED_LOG.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.STRIPPED_COLORED_WOOD.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_LEAVES.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_SAPLING.asItem(), new BlockSubtypeInterpreter());



        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_DIRT.asItem(), new BlockSubtypeInterpreter());
    }

    public static RecipeType<WorktableRecipe> WORKTABLE_RECIPE =
            new RecipeType<>(WorktableRecipeCategoryJei.UID, WorktableRecipe.class);

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(CaveopolisItems.WORKTABLE.get()), WORKTABLE_RECIPE);
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {

        IGuiHelper guiHelper = registration.getJeiHelpers().getGuiHelper();

        registration.addRecipeCategories(new
                WorktableRecipeCategoryJei(registration.getJeiHelpers().getGuiHelper()));

        slotDrawable = guiHelper.getSlotDrawable();
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        assert Minecraft.getInstance().level != null;
        final var recipeManager = Minecraft.getInstance().level.getRecipeManager();


        registration.addRecipes(WorktableRecipeCategoryJei.RECIPE_TYPE,
                recipeManager.getAllRecipesFor(CaveopolisRecipes.WORKTABLE_TYPE.get()).stream().map(RecipeHolder::value).toList());
    }
}
