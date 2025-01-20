package com.benbenlaw.caveopolis.recipe;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.block.colored.util.ColorMap;
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
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;


public class ColoredCraftingRecipe extends ShapedRecipe {

    private static final String[] COLORS = {
            "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray",
            "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
    };

    private final String group;
    private final ItemStack result;

    public ColoredCraftingRecipe(String group, ShapedRecipePattern pattern, ItemStack result) {
        super(group, CraftingBookCategory.MISC, pattern, result.copy(), true);
        this.group = group;
        this.result = result;
    }

    @Override
    public boolean matches(CraftingInput craftingInput, Level level) {
        System.out.println("Checking matches for ColoredCraftingRecipe...");

        for (int i = 0; i < craftingInput.size(); i++) {
            System.out.println("Slot " + i + ": " + craftingInput.getItem(i));
        }

        boolean matches = super.matches(craftingInput, level);
        System.out.println("Matches: " + matches);
        return matches;
    }
    @Override
    public ItemStack assemble(CraftingInput p_345201_, HolderLookup.Provider p_335688_) {
        return this.getResultItem(p_335688_).copy();
    }

    private ItemStack applyColorToBlock(ItemStack stack, DyeColor color) {
        if (stack.getItem() instanceof ColoredBlockItem) {
            String colorString = color.getName();
            stack.set(CoreDataComponents.COLOR, colorString);
            return stack;
        }

        return ItemStack.EMPTY;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return CaveopolisRecipes.COLORED_CRAFTING_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return ColoredCraftingRecipe.Type.INSTANCE;
    }

    public static class Type implements RecipeType<ColoredCraftingRecipe> {
        private Type() {}
        public static final ColoredCraftingRecipe.Type INSTANCE = new ColoredCraftingRecipe.Type();
    }

    public static class Serializer implements RecipeSerializer<ColoredCraftingRecipe> {
        public static final ColoredCraftingRecipe.Serializer INSTANCE = new ColoredCraftingRecipe.Serializer();

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
