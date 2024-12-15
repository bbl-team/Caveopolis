package com.benbenlaw.caveopolis.recipe;

import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.core.block.colored.util.ColorMap;
import com.benbenlaw.core.item.CoreDataComponents;
import com.benbenlaw.core.item.colored.ColoredBlockItem;
import com.benbenlaw.core.item.colored.ColoringItem;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;

import java.util.Objects;


public class LogsToPlanksRecipe extends CustomRecipe {

    private static final String[] COLORS = {
            "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray",
            "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
    };

    public LogsToPlanksRecipe(CraftingBookCategory category) {
        super(category);
    }
    
    @Override
    public boolean matches(CraftingInput craftingInput, Level level) {

        ItemStack coloredLog = ItemStack.EMPTY;

        for (int i = 0; i < craftingInput.size(); i++) {
            ItemStack stack = craftingInput.getItem(i);
            if (!stack.isEmpty()) {
                if (stack.getItem() == CaveopolisItems.COLORED_LOG.get() || stack.getItem() == CaveopolisItems.STRIPPED_COLORED_LOG.get()
                        || stack.getItem() == CaveopolisItems.COLORED_WOOD.get() || stack.getItem() == CaveopolisItems.STRIPPED_COLORED_WOOD.get()) {
                    if (!coloredLog.isEmpty()) {
                        return false;
                    }
                    coloredLog = stack;
                } else {
                    return false;
                }
            }
        }
        return !coloredLog.isEmpty();
    }

    @Override
    public ItemStack assemble(CraftingInput craftingInput, HolderLookup.Provider provider) {
        ItemStack coloredLog = ItemStack.EMPTY;

        for (int i = 0; i < craftingInput.size(); i++) {
            ItemStack stack = craftingInput.getItem(i);
            if (!stack.isEmpty()) {
                if (stack.getItem() instanceof ColoredBlockItem) {
                    if (!coloredLog.isEmpty()) {
                        return ItemStack.EMPTY;
                    }
                    coloredLog = stack.copy();
                }
            }
        }

        if (!coloredLog.isEmpty()) {
            ItemStack coloredPlank = CaveopolisItems.COLORED_PLANKS.toStack();
            boolean isLit = Objects.requireNonNull(coloredLog.get(CoreDataComponents.LIT));
            DyeColor sprayColor = ColorMap.getDyeColor(Objects.requireNonNull(coloredLog.get(CoreDataComponents.COLOR)));
            ItemStack result = applyColorToBlock(coloredPlank, sprayColor);
            result.set(CoreDataComponents.LIT, isLit);
            if (!result.isEmpty()) {
                result.setCount(4);
                return result;
            }
        }

        return ItemStack.EMPTY;
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return true;
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
        return CaveopolisRecipes.LOG_TO_PLANKS_SERIALIZER.get();
    }
}
