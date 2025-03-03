package com.benbenlaw.caveopolis.integrations.jei;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.caveopolis.recipe.ColoredCraftingRecipe;
import com.benbenlaw.caveopolis.recipe.conditions.ColoredFlowersToDye;
import com.benbenlaw.core.item.CoreDataComponents;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.ICraftingGridHelper;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.library.recipes.CraftingExtensionHelper;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.Tags;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

public class ColoredCraftingRecipeCategoryJei implements IRecipeCategory<CraftingRecipe> {

    public static final ResourceLocation UID = ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "colored_crafting");
    public final static ResourceLocation TEXTURE =
            ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "textures/gui/jei_colored_crafting_table.png");
    static final RecipeType<CraftingRecipe> RECIPE_TYPE = RecipeType.create(Caveopolis.MOD_ID, "colored_crafting", CraftingRecipe.class);

    private IDrawable background;
    private final IDrawable icon;
    private final ICraftingGridHelper craftingGridHelper;

    private final CraftingExtensionHelper extendableHelper = new CraftingExtensionHelper();


    @Override
    public @Nullable ResourceLocation getRegistryName(CraftingRecipe recipe) {
        assert Minecraft.getInstance().level != null;
        return Minecraft.getInstance().level.getRecipeManager().getAllRecipesFor(net.minecraft.world.item.crafting.RecipeType.CRAFTING).stream()
                .filter(recipeHolder -> recipeHolder.value().equals(recipe))
                .map(RecipeHolder::id)
                .findFirst()
                .orElse(null);
    }


    public ColoredCraftingRecipeCategoryJei(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 116, 54);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(CaveopolisItems.COLORED_CRAFTING_TABLE.get()));
        this.craftingGridHelper = helper.createCraftingGridHelper();

    }

    @Override
    public RecipeType<CraftingRecipe> getRecipeType() {
        return RECIPE_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("block.caveopolis.colored_crafting_table");
    }

    @Override
    public IDrawable getBackground() {
        return background;
    }

    @Nullable
    @Override
    public IDrawable getIcon() {
        return icon;
    }

    private int backgroundWidth;

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, CraftingRecipe recipe, IFocusGroup focuses) {

        if (recipe instanceof ColoredCraftingRecipe coloredCraftingRecipe) {

            AtomicReference<String> selectedColor = new AtomicReference<>("");

            focuses.getItemStackFocuses(RecipeIngredientRole.INPUT).forEach(focus -> {
                ItemStack focusedItem = focus.getTypedValue().getIngredient();
                selectedColor.set(focusedItem.get(CoreDataComponents.COLOR));
            });

            if (selectedColor.get().isEmpty()) {
                focuses.getItemStackFocuses(RecipeIngredientRole.OUTPUT).forEach(focus -> {
                    ItemStack focusedItem = focus.getTypedValue().getIngredient();
                    selectedColor.set(focusedItem.get(CoreDataComponents.COLOR));
                });
            }

            if (coloredCraftingRecipe.getIngredients().isEmpty()) {
                return;
            }

            int recipeWidth = coloredCraftingRecipe.getWidth();
            int recipeHeight = coloredCraftingRecipe.getHeight();
            int slotSize = 18;

            // Render the input grid based on recipe dimensions
            for (int i = 0; i < recipeHeight; i++) {
                for (int j = 0; j < recipeWidth; j++) {

                    int slotIndex = i * recipeWidth + j;

                    if (slotIndex < coloredCraftingRecipe.getIngredients().size()) {
                        Ingredient ingredient = coloredCraftingRecipe.getIngredients().get(slotIndex);
                        ItemStack[] ingredientItems = ingredient.getItems();

                        List<ItemStack> coloredItems = new ArrayList<>();

                        if (selectedColor.get().isEmpty()) {
                            for (DyeColor color : DyeColor.values()) {
                                for (ItemStack itemStack : ingredientItems) {
                                    ItemStack coloredIngredient = new ItemStack(itemStack.getItem());
                                    iconWithColor(coloredIngredient, color.getName());
                                    coloredItems.add(coloredIngredient);
                                }
                            }
                        } else {
                            for (ItemStack itemStack : ingredientItems) {
                                ItemStack coloredIngredient = new ItemStack(itemStack.getItem());
                                iconWithColor(coloredIngredient, selectedColor.get());
                                coloredItems.add(coloredIngredient);
                            }
                        }

                        builder.addSlot(RecipeIngredientRole.INPUT, j * slotSize + 1, i * slotSize + 1)
                                .addItemStacks(coloredItems);
                    }
                }
            }

            // Render the output slot
            List<ItemStack> coloredOutputItemStacks = new ArrayList<>();
            assert Minecraft.getInstance().level != null;
            int xOffset = 95;
            int yOffset = 19;

            if (selectedColor.get().isEmpty()) {
                for (DyeColor color : DyeColor.values()) {
                    ItemStack coloredItem = new ItemStack(recipe.getResultItem(Minecraft.getInstance().level.registryAccess()).getItem(), recipe.getResultItem(Minecraft.getInstance().level.registryAccess()).getCount());
                    iconWithColor(coloredItem, color.getName());
                    coloredOutputItemStacks.add(coloredItem);
                }
            } else {
                ItemStack coloredItem = new ItemStack(recipe.getResultItem(Minecraft.getInstance().level.registryAccess()).getItem(), recipe.getResultItem(Minecraft.getInstance().level.registryAccess()).getCount());
                iconWithColor(coloredItem, selectedColor.get());
                coloredOutputItemStacks.add(coloredItem);
            }

            builder.addSlot(RecipeIngredientRole.OUTPUT, xOffset, yOffset)
                    .addItemStacks(coloredOutputItemStacks)
                    .addRichTooltipCallback((slotView, tooltip) -> {
                        tooltip.add(Component.translatable("jei.tooltip.any_crafting_table").withStyle(ChatFormatting.GREEN));
                    });

        } else {
            // Vanilla recipe layout (not colored)

            List<Ingredient> ingredients = recipe.getIngredients();
            int gridSize = 3;  // Typically, vanilla crafting is 3x3
            int slotSize = 18;

            int recipeWidth = 3;  // Default to 3x3 grid
            int recipeHeight = 3; // Default to 3x3 grid

            // Adjust for smaller recipes (e.g., 2x2)
            if (ingredients.size() <= 4) {
                recipeWidth = 2;
                recipeHeight = 2;
            } else if (ingredients.size() <= 9) {
                recipeWidth = 3;
                recipeHeight = 3;
            }

            // Render the input grid
            for (int i = 0; i < recipeHeight; i++) {
                for (int j = 0; j < recipeWidth; j++) {

                    int slotIndex = i * recipeWidth + j;

                    if (slotIndex < ingredients.size()) {
                        Ingredient ingredient = ingredients.get(slotIndex);
                        ItemStack[] ingredientItems = ingredient.getItems();

                        List<ItemStack> itemStacks = new ArrayList<>();
                        for (ItemStack itemStack : ingredientItems) {
                            itemStacks.add(itemStack);
                        }

                        builder.addSlot(RecipeIngredientRole.INPUT, j * slotSize + 1, i * slotSize + 1)
                                .addItemStacks(itemStacks);
                    }
                }
            }

            // Render the output slot
            ItemStack outputItem = recipe.getResultItem(Minecraft.getInstance().level.registryAccess());
            builder.addSlot(RecipeIngredientRole.OUTPUT, 95, 19)
                    .addItemStack(outputItem);
        }
    }





    public static ItemLike iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item.getItem();
    }




}