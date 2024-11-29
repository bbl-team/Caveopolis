package com.benbenlaw.caveopolis.recipe;

import com.benbenlaw.caveopolis.util.CaveopolisTags;
import com.benbenlaw.core.block.colored.ColoredFlower;
import com.benbenlaw.core.block.colored.util.ColorMap;
import com.benbenlaw.core.item.CoreDataComponents;
import com.benbenlaw.core.item.colored.ColoredBlockItem;
import com.benbenlaw.core.item.colored.ColoringItem;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import java.util.Objects;


public class FlowerDyeRecipe extends CustomRecipe {

    private static final String[] COLORS = {
            "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray",
            "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
    };

    public FlowerDyeRecipe(CraftingBookCategory category) {
        super(category);
    }

    @Override
    public boolean matches(CraftingInput craftingInput, Level level) {
        ItemStack coloredBlockItem = ItemStack.EMPTY;

        for (int i = 0; i < craftingInput.size(); i++) {
            ItemStack stack = craftingInput.getItem(i);
            if (!stack.isEmpty()) {
                if (Block.byItem(stack.getItem()) instanceof ColoredFlower) {
                    if (!coloredBlockItem.isEmpty()) {
                        return false;
                    }
                    coloredBlockItem = stack;
                } else {
                    return false;
                }
            }
        }

        return !coloredBlockItem.isEmpty();
    }

    @Override
    public ItemStack assemble(CraftingInput craftingInput, HolderLookup.Provider provider) {
        ItemStack coloredBlockItem = ItemStack.EMPTY;

        for (int i = 0; i < craftingInput.size(); i++) {
            ItemStack stack = craftingInput.getItem(i);
            if (!stack.isEmpty()) {
                if (stack.getItem() instanceof ColoredBlockItem) {
                    if (!coloredBlockItem.isEmpty()) {
                        return ItemStack.EMPTY;
                    }
                    coloredBlockItem = stack.copy();
                }
            }
        }

        if (!coloredBlockItem.isEmpty()) {
            DyeColor sprayColor = ColorMap.getDyeColor(Objects.requireNonNull(coloredBlockItem.get(CoreDataComponents.COLOR)));
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
        return width * height >= 1;
    }

    private ItemStack applyColorToBlock(ItemStack stack, DyeColor color) {
        if (Block.byItem(stack.getItem()) instanceof ColoredFlower) {
            String colorString = color.getName();
            if (colorString.equals("white")) {
                return Items.WHITE_DYE.getDefaultInstance();
            }
            if (colorString.equals("orange")) {
                return Items.ORANGE_DYE.getDefaultInstance();
            }
            if (colorString.equals("magenta")) {
                return Items.MAGENTA_DYE.getDefaultInstance();
            }
            if (colorString.equals("light_blue")) {
                return Items.LIGHT_BLUE_DYE.getDefaultInstance();
            }
            if (colorString.equals("yellow")) {
                return Items.YELLOW_DYE.getDefaultInstance();
            }
            if (colorString.equals("lime")) {
                return Items.LIME_DYE.getDefaultInstance();
            }
            if (colorString.equals("pink")) {
                return Items.PINK_DYE.getDefaultInstance();
            }
            if (colorString.equals("gray")) {
                return Items.GRAY_DYE.getDefaultInstance();
            }
            if (colorString.equals("light_gray")) {
                return Items.LIGHT_GRAY_DYE.getDefaultInstance();
            }
            if (colorString.equals("cyan")) {
                return Items.CYAN_DYE.getDefaultInstance();
            }
            if (colorString.equals("purple")) {
                return Items.PURPLE_DYE.getDefaultInstance();
            }
            if (colorString.equals("blue")) {
                return Items.BLUE_DYE.getDefaultInstance();
            }
            if (colorString.equals("brown")) {
                return Items.BROWN_DYE.getDefaultInstance();
            }
            if (colorString.equals("green")) {
                return Items.GREEN_DYE.getDefaultInstance();
            }
            if (colorString.equals("red")) {
                return Items.RED_DYE.getDefaultInstance();
            }
            if (colorString.equals("black")) {
                return Items.BLACK_DYE.getDefaultInstance();
            }
        }
        return ItemStack.EMPTY;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return CaveopolisRecipes.FLOWER_TO_DYE_SERIALIZER.get();
    }
}
