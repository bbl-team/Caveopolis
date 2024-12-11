package com.benbenlaw.caveopolis.integrations.jei;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.caveopolis.recipe.WorktableRecipe;
import com.benbenlaw.core.block.colored.ColoredBlock;
import com.benbenlaw.core.block.colored.util.IColored;
import com.benbenlaw.core.item.CoreDataComponents;
import com.benbenlaw.core.item.colored.ColoredItem;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;

public class WorktableRecipeCategory implements IRecipeCategory<WorktableRecipe> {

    public static final ResourceLocation UID = ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "worktable");
    public static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "textures/gui/jei_worktable.png");

    static final RecipeType<WorktableRecipe> RECIPE_TYPE = RecipeType.create(Caveopolis.MOD_ID, "worktable", WorktableRecipe.class);

    private final IDrawable background;
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

    public WorktableRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 70, 19);
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

    @Override
    public void setRecipe(@NotNull IRecipeLayoutBuilder builder, WorktableRecipe recipe, @NotNull IFocusGroup focusGroup) {


        if (Block.byItem(recipe.input().getItems()[0].getItem()) instanceof IColored || recipe.output().getItem() instanceof ColoredItem) {
            String color = recipe.output().get(CoreDataComponents.COLOR);
            ItemStack coloredStack = new ItemStack(recipe.input().getItems()[0].getItem());
            int coloredStackCount = recipe.input().count();
            coloredStack.set(CoreDataComponents.COLOR, color);
            coloredStack.setCount(coloredStackCount);
            builder.addSlot(RecipeIngredientRole.INPUT, 4, 2).addItemStack(coloredStack);
        } else {
            builder.addSlot(RecipeIngredientRole.INPUT, 4, 2).addItemStacks(Arrays.asList(recipe.input().getItems()));
        }

        assert Minecraft.getInstance().level != null;

        if (Block.byItem(recipe.output().getItem()) instanceof IColored || recipe.output().getItem() instanceof ColoredItem) {
            String color = recipe.output().get(CoreDataComponents.COLOR);
            ItemStack coloredStack = new ItemStack(recipe.output().getItem());
            int coloredStackCount = recipe.output().getCount();
            coloredStack.set(CoreDataComponents.COLOR, color);
            coloredStack.set(CoreDataComponents.LIT, false);
            coloredStack.setCount(coloredStackCount);
            builder.addSlot(RecipeIngredientRole.OUTPUT, 51, 2).addItemStack(coloredStack);
        } else {
            builder.addSlot(RecipeIngredientRole.OUTPUT, 51, 2).addItemStack(new ItemStack(recipe.output().getItem(), recipe.output().getCount()));
        }
    }
}
