package com.benbenlaw.caveopolis.recipe;

import com.benbenlaw.core.item.ColoredBlockItem;
import com.benbenlaw.core.item.ColoringItem;
import com.benbenlaw.core.item.CoreDataComponents;
import com.benbenlaw.core.item.LightingItem;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;

public class LightingRecipe extends CustomRecipe {

    public LightingRecipe(CraftingBookCategory category) {
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
                } else if (stack.getItem() instanceof LightingItem) {
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
        LightingItem sprayCanItem = null;

        for (int i = 0; i < craftingInput.size(); i++) {
            ItemStack stack = craftingInput.getItem(i);

            if (!stack.isEmpty()) {
                if (stack.getItem() instanceof ColoredBlockItem) {
                    if (!coloredBlockItem.isEmpty()) {
                        return ItemStack.EMPTY;
                    }
                    coloredBlockItem = stack.copy();
                } else if (stack.getItem() instanceof LightingItem) {
                    if (sprayCanItem != null) {
                        return ItemStack.EMPTY;
                    }
                    sprayCanItem = (LightingItem) stack.getItem();
                }
            }
        }

        if (!coloredBlockItem.isEmpty() && sprayCanItem != null) {
            ItemStack result = applyLightToBlock(coloredBlockItem);

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

    private ItemStack applyLightToBlock(ItemStack coloredBlock) {
        if (coloredBlock.getItem() instanceof ColoredBlockItem) {

            if (Boolean.TRUE.equals(coloredBlock.get(CoreDataComponents.LIT))) {
                coloredBlock.set(CoreDataComponents.LIT, false);
            } else {
                coloredBlock.set(CoreDataComponents.LIT, true);
            }
            return coloredBlock;
        }
        return ItemStack.EMPTY;
    }
    @Override
    public RecipeSerializer<?> getSerializer() {
        return CaveopolisRecipes.LIGHTING_SERIALIZER.get();
    }

}