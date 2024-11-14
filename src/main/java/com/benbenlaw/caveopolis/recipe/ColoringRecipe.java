package com.benbenlaw.caveopolis.recipe;

import com.benbenlaw.core.item.ColoredBlockItem;
import com.benbenlaw.core.item.ColoringItem;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;

public class ColoringRecipe extends CustomRecipe {

    public ColoringRecipe(CraftingBookCategory category) {
        super(category);
    }

    public boolean matches(CraftingInput craftingInput, Level level) {
        ItemStack coloredBlockItem = ItemStack.EMPTY;
        ItemStack sprayCanItem = ItemStack.EMPTY;

        for (int i = 0; i < craftingInput.size(); i++) {
            ItemStack stack = craftingInput.getItem(i);
            if (!stack.isEmpty()) {
                if (stack.getItem() instanceof ColoredBlockItem) {
                    if (!coloredBlockItem.isEmpty()) {
                        return false;
                    }
                    coloredBlockItem = stack;
                } else if (stack.getItem() instanceof ColoringItem) {
                    // Only one ColoringItem can be used
                    if (!sprayCanItem.isEmpty()) {
                        return false;
                    }
                    sprayCanItem = stack;
                } else {
                    return false;
                }
            }
        }

        return !coloredBlockItem.isEmpty() && !sprayCanItem.isEmpty();
    }
    @Override
    public ItemStack assemble(CraftingInput craftingInput, HolderLookup.Provider provider) {
        ItemStack coloredBlockItem = ItemStack.EMPTY;
        ColoringItem sprayCanItem = null;

        for (int i = 0; i < craftingInput.size(); i++) {
            ItemStack stack = craftingInput.getItem(i);

            if (!stack.isEmpty()) {
                if (stack.getItem() instanceof ColoredBlockItem) {
                    if (!coloredBlockItem.isEmpty()) {
                        return ItemStack.EMPTY;
                    }
                    coloredBlockItem = stack.copy();
                } else if (stack.getItem() instanceof ColoringItem) {
                    if (sprayCanItem != null) {
                        return ItemStack.EMPTY;
                    }
                    sprayCanItem = (ColoringItem) stack.getItem();
                }
            }
        }

        if (!coloredBlockItem.isEmpty() && sprayCanItem != null) {
            DyeColor sprayColor = sprayCanItem.getColor();
            ItemStack result = applyColorToBlock(coloredBlockItem, sprayColor);

            if (!result.isEmpty()) {
                result.setCount(1);
                return result;
            }
        }

        return ItemStack.EMPTY;
    }
    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return width * height >= 2;
    }

    private ItemStack applyColorToBlock(ItemStack coloredBlock, DyeColor color) {
        if (coloredBlock.getItem() instanceof ColoredBlockItem) {
            ColoredBlockItem blockItem = (ColoredBlockItem) coloredBlock.getItem();
            String colorString = color.getName();
            coloredBlock.set(CoreDataComponents.COLOR, colorString);

            return coloredBlock;
        }
        return ItemStack.EMPTY;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return CaveopolisRecipes.COLORING_SERIALIZER.get();
    }


}