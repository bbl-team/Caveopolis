package com.benbenlaw.caveopolis.recipe;

import com.benbenlaw.caveopolis.util.CaveopolisTags;
import com.benbenlaw.core.item.CoreDataComponents;
import com.benbenlaw.core.item.colored.ColoredBlockItem;
import com.benbenlaw.core.item.colored.ColoringItem;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;


public class ColoringRecipe extends CustomRecipe {

    private static final String[] COLORS = {
            "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray",
            "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
    };

    public ColoringRecipe(CraftingBookCategory category) {
        super(category);
    }
    
    @Override
    public boolean matches(CraftingInput craftingInput, Level level) {

        ItemStack coloredBlockItem = ItemStack.EMPTY;
        ItemStack sprayCanItem = ItemStack.EMPTY;

        for (int i = 0; i < craftingInput.size(); i++) {
            ItemStack stack = craftingInput.getItem(i);
            if (!stack.isEmpty()) {
                if (stack.getItem() instanceof ColoredBlockItem && !stack.is(CaveopolisTags.Items.COLORING_BANNED)) {
                    if (!coloredBlockItem.isEmpty()) {
                        return false;
                    }
                    coloredBlockItem = stack;
                } else if (stack.getItem() instanceof ColoringItem) {
                    if (!sprayCanItem.isEmpty()) {
                        return false;
                    }
                    sprayCanItem = stack;
                } else if (containsColor(stack) && !(stack.getItem() instanceof ColoredBlockItem)) {
                    // Handle other colorable blocks
                    if (!coloredBlockItem.isEmpty()) {
                        return false;
                    }
                    coloredBlockItem = stack;
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
                } else if (containsColor(stack)) {
                    if (!coloredBlockItem.isEmpty()) {
                        return ItemStack.EMPTY;
                    }
                    coloredBlockItem = stack.copy();
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

    private ItemStack applyColorToBlock(ItemStack stack, DyeColor color) {
        if (stack.getItem() instanceof ColoredBlockItem) {
            String colorString = color.getName();
            stack.set(CoreDataComponents.COLOR, colorString);
            return stack;
        }

        for (String colorCheck : COLORS) {
            if (stack.getItem().toString().contains(colorCheck) && !(stack.getItem() instanceof ColoredBlockItem)) {
                String resourceLocationString = stack.getItem().toString().replace(colorCheck, color.toString().toLowerCase());
                ResourceLocation resourceLocation;

                try {
                    resourceLocation = ResourceLocation.tryParse(resourceLocationString);
                    if (resourceLocation != null && BuiltInRegistries.ITEM.containsKey(resourceLocation)) {
                        return BuiltInRegistries.ITEM.get(resourceLocation).getDefaultInstance();
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Failed to parse resource location: " + resourceLocationString);
                    return ItemStack.EMPTY;
                }
            }
        }
        return ItemStack.EMPTY;
    }
    private boolean containsColor(ItemStack stack) {
        // Check if the stack contains a colorable block (but not a ColoredBlockItem)
        for (String colorCheck : COLORS) {
            if (stack.getItem().toString().contains(colorCheck) && !(stack.getItem() instanceof ColoringItem)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return CaveopolisRecipes.COLORING_SERIALIZER.get();
    }
}
