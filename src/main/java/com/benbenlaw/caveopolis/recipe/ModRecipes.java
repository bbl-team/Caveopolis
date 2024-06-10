package com.benbenlaw.caveopolis.recipe;

import com.benbenlaw.caveopolis.Caveopolis;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModRecipes {

    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZER =
            DeferredRegister.create(BuiltInRegistries.RECIPE_SERIALIZER, Caveopolis.MOD_ID);
    public static final DeferredRegister<RecipeType<?>> TYPES =
            DeferredRegister.create(BuiltInRegistries.RECIPE_TYPE, Caveopolis.MOD_ID);

    //Scrayer
    public static final Supplier<RecipeSerializer<SprayerRecipe>> SPRAYER_SERIALIZER =
            SERIALIZER.register("sprayer", () -> SprayerRecipe.Serializer.INSTANCE);
    public static final Supplier<RecipeType<SprayerRecipe>> SPRAYER_TYPE =
            TYPES.register("sprayer", () -> SprayerRecipe.Type.INSTANCE);


    public static void register(IEventBus eventBus) {
        SERIALIZER.register(eventBus);
    }
}
