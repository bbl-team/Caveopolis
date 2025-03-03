package com.benbenlaw.caveopolis.integrations.jei;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.caveopolis.recipe.ColoredCraftingRecipe;
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
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
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


        AtomicReference<String> selectedColor = new AtomicReference<>("white");

        focuses.getItemStackFocuses().forEach(focus -> {
            ItemStack clickedItem = focus.getTypedValue().getIngredient();
            selectedColor.set(clickedItem.get(CoreDataComponents.COLOR));
        });

        if (recipe instanceof ColoredCraftingRecipe) {

            int gridSize = 3;
            int slotSize = 18;

            for (int i = 0; i < gridSize; i++) {
                for (int j = 0; j < gridSize; j++) {
                    int slotIndex = i * gridSize + j;

                    if (slotIndex < recipe.getIngredients().size()) {
                        Ingredient ingredient = recipe.getIngredients().get(slotIndex);

                            ItemStack coloredIngredient = new ItemStack(ingredient.getItems()[0].getItem());
                            iconWithColor(coloredIngredient, String.valueOf(selectedColor));

                            builder.addSlot(RecipeIngredientRole.INPUT, j * slotSize + 1, i * slotSize + 1)
                                    .addItemStack(coloredIngredient);

                    }
                }
            }

            List<ItemStack> coloredOutputItemStacks = new ArrayList<>();
            assert Minecraft.getInstance().level != null;
            int xOffset = 95;
            int yOffset = 19;
            for (DyeColor color : DyeColor.values()) {
                ItemStack coloredItem = new ItemStack(recipe.getResultItem(Minecraft.getInstance().level.registryAccess()).getItem());
                iconWithColor(coloredItem, color.getName());
                coloredOutputItemStacks.add(coloredItem);
            }
            builder.addSlot(RecipeIngredientRole.OUTPUT, xOffset, yOffset)
                    .addItemStacks(coloredOutputItemStacks);
        }
    }


    public static ItemLike iconWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item.getItem();
    }




}