package com.benbenlaw.caveopolis.recipe;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.block.colored.util.ColorMap;
import com.benbenlaw.core.block.colored.util.IColored;
import com.benbenlaw.core.item.CoreDataComponents;
import com.benbenlaw.core.item.colored.ColoredBlockItem;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;


public class ColoredCraftingRecipe extends ShapedRecipe {

    public ColoredCraftingRecipe(String group, ShapedRecipePattern pattern, ItemStack result) {
        super(group, CraftingBookCategory.MISC, pattern, result.copy(), true);
    }

    @Override
    public ItemStack assemble(CraftingInput craftingInput, HolderLookup.Provider registries) {
        ItemStack resultNoColor = result.copy();
        DyeColor initialColor = null;

        for (int i = 0; i < craftingInput.size(); i++) {
            ItemStack stack = craftingInput.getItem(i);

            if (!stack.isEmpty()) {
                if (stack.has(CoreDataComponents.COLOR)) {
                    DyeColor color = ColorMap.getDyeColor(Objects.requireNonNull(stack.get(CoreDataComponents.COLOR)));

                    if (color != null) {
                        if (initialColor == null) {
                            initialColor = color;
                        } else if (!color.equals(initialColor)) {
                            return ItemStack.EMPTY;
                        }
                    } else {
                        return ItemStack.EMPTY;
                    }
                }
            }
        }
        if (initialColor != null) {
            resultNoColor.set(CoreDataComponents.COLOR, initialColor.toString());
        }
        return resultNoColor;
    }




    @Override
    public RecipeSerializer<?> getSerializer() {
        return CaveopolisRecipes.COLORED_CRAFTING_SERIALIZER.get();
    }

    public static class Serializer implements RecipeSerializer<ColoredCraftingRecipe> {

        private static final MapCodec<ColoredCraftingRecipe> CODEC = RecordCodecBuilder.mapCodec(builder -> builder.group(
                        Codec.STRING.optionalFieldOf("group", "").forGetter(e -> e.group),
                        ShapedRecipePattern.MAP_CODEC.forGetter(e -> e.pattern),
                        ItemStack.STRICT_CODEC.fieldOf("result").forGetter(e -> e.result)
                ).apply(builder, ColoredCraftingRecipe::new)
        );

        private static final StreamCodec<RegistryFriendlyByteBuf, ColoredCraftingRecipe> STREAM_CODEC = StreamCodec.composite(
                ByteBufCodecs.STRING_UTF8, e -> e.group,
                ShapedRecipePattern.STREAM_CODEC, e -> e.pattern,
                ItemStack.STREAM_CODEC, e -> e.result,
                ColoredCraftingRecipe::new
        );

        @Override
        public MapCodec<ColoredCraftingRecipe> codec() {
            return CODEC;
        }

        @Override
        public StreamCodec<RegistryFriendlyByteBuf, ColoredCraftingRecipe> streamCodec() {
            return STREAM_CODEC;
        }
    }
}