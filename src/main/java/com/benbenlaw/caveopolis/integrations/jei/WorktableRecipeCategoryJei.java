package com.benbenlaw.caveopolis.integrations.jei;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.caveopolis.recipe.WorktableRecipe;
import com.benbenlaw.core.block.colored.util.IColored;
import com.benbenlaw.core.item.CoreDataComponents;
import com.benbenlaw.core.item.colored.ColoredItem;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.util.Arrays;

public class WorktableRecipeCategoryJei implements IRecipeCategory<WorktableRecipe> {

    public static final ResourceLocation UID = ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "worktable");
    static final RecipeType<WorktableRecipe> RECIPE_TYPE = RecipeType.create(Caveopolis.MOD_ID, "worktable", WorktableRecipe.class);

    private IDrawable background;
    private final IDrawable icon;

    @Override
    public @Nullable ResourceLocation getRegistryName(WorktableRecipe recipe) {
        assert Minecraft.getInstance().level != null;
        return Minecraft.getInstance().level.getRecipeManager().getAllRecipesFor(WorktableRecipe.Type.INSTANCE).stream()
                .filter(recipeHolder -> recipeHolder.value().equals(recipe))
                .map(RecipeHolder::id)
                .findFirst()
                .orElse(null);
    }

    public WorktableRecipeCategoryJei(IGuiHelper helper) {
        this.background = helper.createBlankDrawable(144, 92);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(CaveopolisItems.WORKTABLE.get()));
    }

    @Override
    public RecipeType<WorktableRecipe> getRecipeType() {
        return CaveopolisJEIPlugin.WORKTABLE_RECIPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("item.caveopolis.worktable");
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
    public void setRecipe(@NotNull IRecipeLayoutBuilder builder, WorktableRecipe recipe, @NotNull IFocusGroup focusGroup) {

        if (Block.byItem(recipe.input().getItems()[0].getItem()) instanceof IColored || recipe.input().getItems()[0].getItem() instanceof ColoredItem) {
            String color = recipe.getResults().getFirst().get(CoreDataComponents.COLOR);
            ItemStack coloredStack = new ItemStack(recipe.input().getItems()[0].getItem());
            int coloredStackCount = recipe.input().count();
            coloredStack.set(CoreDataComponents.COLOR, color);
            coloredStack.setCount(coloredStackCount);
            coloredStack.set(CoreDataComponents.LIT, false);
            builder.addSlot(RecipeIngredientRole.INPUT, 1, 1)
                    .addItemStack(coloredStack).setBackground(CaveopolisJEIPlugin.slotDrawable, -1, -1);

        } else {
            builder.addSlot(RecipeIngredientRole.INPUT, 1, 1)
                    .addItemStacks(Arrays.asList(recipe.input().getItems())).setBackground(CaveopolisJEIPlugin.slotDrawable, -1, -1);
        }

        int maxColumns = 8;
        int maxRows = 4;
        int maxSlots = maxColumns * maxRows;

        int row = 0;
        int col = 0;
        int visibleCount = 0;
        int totalResults = recipe.getResults().size();

        // Iterate through the results
        for (ItemStack result : recipe.getResults()) {
            if (visibleCount >= maxSlots) {
                break;
            }

            int posX = 1 + col * 18; // 18 is the standard size of a slot
            int posY = 21 + row * 18; // 18 is the standard size of a slot

            builder.addSlot(RecipeIngredientRole.OUTPUT, posX, posY)
                    .addItemStack(result)
                    .setBackground(CaveopolisJEIPlugin.slotDrawable, -1, -1);

            col++;
            if (col >= maxColumns) {
                col = 0;
                row++;
            }

            visibleCount++;
        }
    }

    @Override
    public void draw(WorktableRecipe recipe, IRecipeSlotsView recipeSlotsView, GuiGraphics guiGraphics, double mouseX, double mouseY) {

        Minecraft minecraft = Minecraft.getInstance();
        Font font = minecraft.font;

        if (recipe.getResults().size() > 32) {
            int remaining = recipe.getResults().size() - 32;

            guiGraphics.drawString(font, "Plus " + remaining + " more", 21, 5, Color.GRAY.getRGB(), false);
        }

        IRecipeCategory.super.draw(recipe, recipeSlotsView, guiGraphics, mouseX, mouseY);
    }
}
