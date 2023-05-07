package com.benbenlaw.caveopolis.recipe;

import com.benbenlaw.caveopolis.Caveopolis;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {

    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Caveopolis.MOD_ID);

    public static final RegistryObject<RecipeSerializer<SprayerRecipe>> SPRAYER_SERIALIZER =
            SERIALIZERS.register("sprayer", () -> SprayerRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
