package com.benbenlaw.caveopolis.integrations.jei;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.caveopolis.recipe.WorktableRecipe;
import com.benbenlaw.core.block.colored.util.IColored;
import com.benbenlaw.core.item.CoreDataComponents;
import com.benbenlaw.core.item.colored.ColoredBlockItem;
import com.benbenlaw.core.item.colored.ColoredItem;
import com.benbenlaw.core.util.MouseUtil;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.builder.IRecipeSlotBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IRecipeSlotDrawable;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.gui.placement.HorizontalAlignment;
import mezz.jei.api.gui.placement.VerticalAlignment;
import mezz.jei.api.gui.widgets.IRecipeExtrasBuilder;
import mezz.jei.api.gui.widgets.IScrollGridWidget;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.ingredients.ITypedIngredient;
import mezz.jei.api.recipe.IFocus;
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
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static com.benbenlaw.core.util.MouseUtil.isMouseOver;

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
        this.background = helper.createBlankDrawable(160, 92);
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
                    .addItemStack(coloredStack)
                    .setBackground(CaveopolisJEIPlugin.slotDrawable, -1, -1);
        } else {
            builder.addSlot(RecipeIngredientRole.INPUT, 1, 1)
                    .addItemStacks(Arrays.asList(recipe.input().getItems()))
                    .setBackground(CaveopolisJEIPlugin.slotDrawable, -1, -1);
        }

        // Output slots (added normally)
        for (ItemStack result : recipe.getResults()) {
            builder.addSlot(RecipeIngredientRole.OUTPUT, 0, 0) // Position handled in scroll grid
                    .addItemStack(result)
                    .setBackground(CaveopolisJEIPlugin.slotDrawable, -1, -1);
        }
    }

    @Override
    public void createRecipeExtras(IRecipeExtrasBuilder builder, WorktableRecipe recipe, IFocusGroup focusGroup) {
        List<IRecipeSlotDrawable> outputSlots = builder.getRecipeSlots().getSlots(RecipeIngredientRole.OUTPUT);
        IScrollGridWidget scrollGridWidget = builder.addScrollGridWidget(outputSlots, 8, 4); // columns, rows
        scrollGridWidget.setPosition(9, 38, 142, 54, HorizontalAlignment.CENTER, VerticalAlignment.BOTTOM);
    }


    @Override
    public void draw(WorktableRecipe recipe, IRecipeSlotsView recipeSlotsView, GuiGraphics guiGraphics, double mouseX, double mouseY) {

        Minecraft minecraft = Minecraft.getInstance();
        Font font = minecraft.font;

        if (recipe.getResults().size() > 28) {
            int remaining = recipe.getResults().size() - 28;

            guiGraphics.renderItem(CaveopolisItems.WHITE_SPRAY_CAN.get().getDefaultInstance(), 16, 0);
            guiGraphics.renderItem(CaveopolisItems.BLACK_SPRAY_CAN.get().getDefaultInstance(), 24, 0);
            guiGraphics.renderItem(CaveopolisItems.RED_SPRAY_CAN.get().getDefaultInstance(), 32, 0);
            guiGraphics.renderItem(CaveopolisItems.GREEN_SPRAY_CAN.get().getDefaultInstance(), 40, 0);
            guiGraphics.renderItem(CaveopolisItems.BLUE_SPRAY_CAN.get().getDefaultInstance(), 48, 0);
            guiGraphics.renderItem(CaveopolisItems.YELLOW_SPRAY_CAN.get().getDefaultInstance(), 56, 0);
            guiGraphics.renderItem(CaveopolisItems.PURPLE_SPRAY_CAN.get().getDefaultInstance(), 64, 0);
            guiGraphics.renderItem(CaveopolisItems.ORANGE_SPRAY_CAN.get().getDefaultInstance(), 72, 0);
            guiGraphics.renderItem(CaveopolisItems.LIGHT_BLUE_SPRAY_CAN.get().getDefaultInstance(), 80, 0);
            guiGraphics.renderItem(CaveopolisItems.PINK_SPRAY_CAN.get().getDefaultInstance(), 88, 0);
            guiGraphics.renderItem(CaveopolisItems.LIME_SPRAY_CAN.get().getDefaultInstance(), 96, 0);
            guiGraphics.renderItem(CaveopolisItems.CYAN_SPRAY_CAN.get().getDefaultInstance(), 104, 0);
            guiGraphics.renderItem(CaveopolisItems.GRAY_SPRAY_CAN.get().getDefaultInstance(), 112, 0);
            guiGraphics.renderItem(CaveopolisItems.LIGHT_GRAY_SPRAY_CAN.get().getDefaultInstance(), 120, 0);
            guiGraphics.renderItem(CaveopolisItems.MAGENTA_SPRAY_CAN.get().getDefaultInstance(), 128, 0);
            guiGraphics.renderItem(CaveopolisItems.BROWN_SPRAY_CAN.get().getDefaultInstance(), 136, 0);


            if (MouseUtil.isMouseAboveArea((int) mouseX, (int) mouseY, 16, 0, 0, 0, 136, 12)) {
                guiGraphics.renderTooltip(font, Component.translatable("jei.tooltip.spray_cans"), (int) mouseX, (int) mouseY);
            }


        }

        IRecipeCategory.super.draw(recipe, recipeSlotsView, guiGraphics, mouseX, mouseY);
    }

}
