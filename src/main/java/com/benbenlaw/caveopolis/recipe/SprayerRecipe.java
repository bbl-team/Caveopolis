package com.benbenlaw.caveopolis.recipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public record SprayerRecipe(Ingredient input, Ingredient spraycan, ItemStack output) implements Recipe<SimpleContainer>{

    @Override
    public @NotNull NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> ingredients = NonNullList.createWithCapacity(1);
        ingredients.add(input);
        return ingredients;
    }
    @Override
    public boolean matches(SimpleContainer pContainer, Level pLevel) {
        if (pLevel.isClientSide()) {
            return false;
        }

        if (input.test(pContainer.getItem(2))) {
            return spraycan.test(pContainer.getItem(0));
        }
        return false;
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

    @Override
    public @NotNull ItemStack assemble(@NotNull SimpleContainer container, HolderLookup.@NotNull Provider provider) {
        return output.copy();
    }

    @Override
    public @NotNull ItemStack getResultItem(HolderLookup.Provider provider) {
        return this.output.copy();
    }
    @Override
    public @NotNull RecipeSerializer<?> getSerializer() {
        return SprayerRecipe.Serializer.INSTANCE;
    }

    @Override
    public @NotNull RecipeType<?> getType() {
        return SprayerRecipe.Type.INSTANCE;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    public static class Type implements RecipeType<SprayerRecipe> {
        private Type() { }
        public static final Type INSTANCE = new Type();
    }

    public static class Serializer implements RecipeSerializer<SprayerRecipe> {
        public static final Serializer INSTANCE = new Serializer();

        public final MapCodec<SprayerRecipe> CODEC = RecordCodecBuilder.mapCodec((instance) ->
                instance.group(
                                Ingredient.CODEC_NONEMPTY.fieldOf("input").forGetter(SprayerRecipe::input),
                                Ingredient.CODEC_NONEMPTY.fieldOf("spraycan").forGetter(SprayerRecipe::spraycan),
                                ItemStack.CODEC.fieldOf("output").forGetter(SprayerRecipe::output))
                        .apply(instance, SprayerRecipe::new)
        );

        private final StreamCodec<RegistryFriendlyByteBuf, SprayerRecipe> STREAM_CODEC = StreamCodec.of(
                SprayerRecipe.Serializer::write, SprayerRecipe.Serializer::read);

        @Override
        public @NotNull MapCodec<SprayerRecipe> codec() {
            return CODEC;
        }

        @Override
        public @NotNull StreamCodec<RegistryFriendlyByteBuf, SprayerRecipe> streamCodec() {
            return STREAM_CODEC;
        }

        private static SprayerRecipe read(RegistryFriendlyByteBuf buffer) {
            Ingredient input = Ingredient.CONTENTS_STREAM_CODEC.decode(buffer);
            Ingredient spraycan = Ingredient.CONTENTS_STREAM_CODEC.decode(buffer);
            ItemStack output = ItemStack.STREAM_CODEC.decode(buffer);
            return new SprayerRecipe(input, spraycan, output);
        }

        private static void write(RegistryFriendlyByteBuf buffer, SprayerRecipe recipe) {
            Ingredient.CONTENTS_STREAM_CODEC.encode(buffer, recipe.input);
            Ingredient.CONTENTS_STREAM_CODEC.encode(buffer, recipe.spraycan);
            ItemStack.STREAM_CODEC.encode(buffer, recipe.output);
        }
    }
}