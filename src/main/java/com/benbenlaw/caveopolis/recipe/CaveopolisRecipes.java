package com.benbenlaw.caveopolis.recipe;

import com.benbenlaw.caveopolis.Caveopolis;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SimpleCraftingRecipeSerializer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CaveopolisRecipes {

    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZER =
            DeferredRegister.create(BuiltInRegistries.RECIPE_SERIALIZER, Caveopolis.MOD_ID);
    public static final DeferredRegister<RecipeType<?>> TYPES =
            DeferredRegister.create(BuiltInRegistries.RECIPE_TYPE, Caveopolis.MOD_ID);

    //Worktable

    public static final Supplier<RecipeSerializer<WorktableRecipe>> WORKTABLE_SERIALIZER =
            SERIALIZER.register("worktable", () -> WorktableRecipe.Serializer.INSTANCE);
    public static final Supplier<RecipeType<WorktableRecipe>> WORKTABLE_TYPE =
            TYPES.register("worktable", () -> WorktableRecipe.Type.INSTANCE);

    //Coloring
    public static final Supplier<RecipeSerializer<ColoringRecipe>> COLORING_SERIALIZER =
            SERIALIZER.register("coloring", () -> new SimpleCraftingRecipeSerializer<>(ColoringRecipe::new));

    public static final Supplier<RecipeType<ColoringRecipe>> COLORING_TYPE =
            TYPES.register("coloring", () -> new RecipeType<ColoringRecipe>() {});

    //Lighting
    public static final Supplier<RecipeSerializer<LightingRecipe>> LIGHTING_SERIALIZER =
            SERIALIZER.register("lighting", () -> new SimpleCraftingRecipeSerializer<>(LightingRecipe::new));

    public static final Supplier<RecipeType<LightingRecipe>> LIGHTING_TYPE =
            TYPES.register("lighting", () -> new RecipeType<LightingRecipe>() {});

    //Flower To Dye
    public static final Supplier<RecipeSerializer<FlowerDyeRecipe>> FLOWER_TO_DYE_SERIALIZER =
            SERIALIZER.register("flower_to_dye", () -> new SimpleCraftingRecipeSerializer<>(FlowerDyeRecipe::new));

    public static final Supplier<RecipeType<FlowerDyeRecipe>> FLOWER_TO_DYE_TYPE =
            TYPES.register("flower_to_dye", () -> new RecipeType<FlowerDyeRecipe>() {});

    //Log To Planks
    public static final Supplier<RecipeSerializer<LogsToPlanksRecipe>> LOG_TO_PLANKS_SERIALIZER =
            SERIALIZER.register("log_to_planks", () -> new SimpleCraftingRecipeSerializer<>(LogsToPlanksRecipe::new));

    public static final Supplier<RecipeType<LogsToPlanksRecipe>> LOG_TO_PLANKS_TYPE =
            TYPES.register("log_to_planks", () -> new RecipeType<LogsToPlanksRecipe>() {});

    //Colored Crafting
    public static final Supplier<RecipeSerializer<ColoredCraftingRecipe>> COLORED_CRAFTING_SERIALIZER =
            SERIALIZER.register("colored_crafting", () -> ColoredCraftingRecipe.Serializer.INSTANCE);

    public static final Supplier<RecipeType<ColoredCraftingRecipe>> COLORED_CRAFTING_TYPE =
            TYPES.register("colored_crafting", () -> ColoredCraftingRecipe.Type.INSTANCE);


    /*
    public static final Supplier<RecipeType<ColoringRecipe>> COLORING_TYPE =
            TYPES.register("coloring", () -> ColoringRecipe.Type.INSTANCE);

     */


    public static void register(IEventBus eventBus) {

        System.out.println("Registering Caveopolis Recipes");
        SERIALIZER.register(eventBus);
        TYPES.register(eventBus);
    }
}
