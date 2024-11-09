package com.benbenlaw.caveopolis.recipe;

import com.benbenlaw.caveopolis.Caveopolis;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
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

    public static void register(IEventBus eventBus) {

        System.out.println("Registering Caveopolis Recipes");
        SERIALIZER.register(eventBus);
        TYPES.register(eventBus);
    }
}
