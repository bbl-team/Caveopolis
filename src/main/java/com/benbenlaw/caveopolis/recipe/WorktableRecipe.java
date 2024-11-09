package com.benbenlaw.caveopolis.recipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.common.crafting.SizedIngredient;
import org.jetbrains.annotations.NotNull;

public record WorktableRecipe(SizedIngredient input, ItemStack output) implements Recipe<RecipeInput> {

    @Override
    public @NotNull NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> ingredients = NonNullList.createWithCapacity(1);
        ingredients.add(input.ingredient());
        return ingredients;
    }

    @Override
    public boolean matches(RecipeInput container, @NotNull Level level) {

        if (input.test(container.getItem(0))) {
            return container.getItem(0).getCount() >= this.getIngredientStackCount();
        }
        return false;
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

    @Override
    public @NotNull ItemStack getResultItem(HolderLookup.Provider provider) {
        return this.output.copy();
    }

    @Override
    public @NotNull ItemStack assemble(@NotNull RecipeInput container, HolderLookup.@NotNull Provider provider) {
        return this.output.copy();
    }

    public int getIngredientStackCount() {
        return this.input.count();
    }

    @Override
    public @NotNull RecipeSerializer<?> getSerializer() {
        return WorktableRecipe.Serializer.INSTANCE;
    }

    @Override
    public @NotNull RecipeType<?> getType() {
        return WorktableRecipe.Type.INSTANCE;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    public static class Type implements RecipeType<WorktableRecipe> {
        private Type() {}
        public static final WorktableRecipe.Type INSTANCE = new WorktableRecipe.Type();
    }

    public static class Serializer implements RecipeSerializer<WorktableRecipe> {
        public static final WorktableRecipe.Serializer INSTANCE = new WorktableRecipe.Serializer();

        public final MapCodec<WorktableRecipe> CODEC = RecordCodecBuilder.mapCodec(instance ->
                instance.group(
                        SizedIngredient.FLAT_CODEC.fieldOf("input").forGetter(WorktableRecipe::input),
                        ItemStack.CODEC.fieldOf("output").forGetter(WorktableRecipe::output)
                ).apply(instance, WorktableRecipe::new));

        public static final StreamCodec<RegistryFriendlyByteBuf, WorktableRecipe> STREAM_CODEC = StreamCodec.of(
                WorktableRecipe.Serializer::write, WorktableRecipe.Serializer::read);

        @Override
        public MapCodec<WorktableRecipe> codec() {
            return CODEC;
        }

        @Override
        public StreamCodec<RegistryFriendlyByteBuf, WorktableRecipe> streamCodec() {
            return STREAM_CODEC;
        }

        private static WorktableRecipe read(RegistryFriendlyByteBuf buffer) {
            SizedIngredient input = SizedIngredient.STREAM_CODEC.decode(buffer);
            ItemStack output = ItemStack.STREAM_CODEC.decode(buffer);
            return new WorktableRecipe(input, output);
        }

        private static void write(RegistryFriendlyByteBuf buffer, WorktableRecipe recipe) {
            SizedIngredient.STREAM_CODEC.encode(buffer, recipe.input);
            ItemStack.STREAM_CODEC.encode(buffer, recipe.output);
        }
    }



}
