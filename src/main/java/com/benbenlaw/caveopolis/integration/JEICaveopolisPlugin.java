package com.benbenlaw.caveopolis.integration;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.ModBlocks;
import com.benbenlaw.caveopolis.recipe.SprayerRecipe;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeManager;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Objects;

@JeiPlugin
public class JEICaveopolisPlugin implements IModPlugin {


    public static RecipeType<SprayerRecipe> SPRAYER =
            new RecipeType<>(SprayerRecipeCategory.UID, SprayerRecipe.class);


    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(Caveopolis.MOD_ID, "jei_plugin");
    }


    @Override
    public void registerRecipeCatalysts(@NotNull IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.SPRAYER.get()), SprayerRecipeCategory.RECIPE_TYPE);

    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new
                SprayerRecipeCategory(registration.getJeiHelpers().getGuiHelper()));


    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();

        List<SprayerRecipe> sprayerRecipes = rm.getAllRecipesFor(SprayerRecipe.Type.INSTANCE);
        registration.addRecipes(SPRAYER, sprayerRecipes);

    }
}