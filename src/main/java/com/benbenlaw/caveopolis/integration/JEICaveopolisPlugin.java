package com.benbenlaw.caveopolis.integration;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.ModBlocks;
import com.benbenlaw.caveopolis.item.ModItems;
import com.benbenlaw.caveopolis.recipe.SprayerRecipe;
import com.benbenlaw.caveopolis.util.ModTags;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.RecipeTypes;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraftforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

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
        registration.addRecipeCatalyst(new ItemStack(ModItems.SPRAY_CAN_REMOVER.get()), SprayerRecipeCategory.RECIPE_TYPE);
        registration.addRecipeCatalyst(new ItemStack(ModItems.GLOWSTONE_SPRAY_CAN.get()), SprayerRecipeCategory.RECIPE_TYPE);
        registration.addRecipeCatalyst(new ItemStack(ModItems.WHITE_SPRAY_CAN.get()), SprayerRecipeCategory.RECIPE_TYPE);
        registration.addRecipeCatalyst(new ItemStack(ModItems.BLACK_SPRAY_CAN.get()), SprayerRecipeCategory.RECIPE_TYPE);
        registration.addRecipeCatalyst(new ItemStack(ModItems.CYAN_SPRAY_CAN.get()), SprayerRecipeCategory.RECIPE_TYPE);
        registration.addRecipeCatalyst(new ItemStack(ModItems.PURPLE_SPRAY_CAN.get()), SprayerRecipeCategory.RECIPE_TYPE);
        registration.addRecipeCatalyst(new ItemStack(ModItems.MAGENTA_SPRAY_CAN.get()), SprayerRecipeCategory.RECIPE_TYPE);
        registration.addRecipeCatalyst(new ItemStack(ModItems.PINK_SPRAY_CAN.get()), SprayerRecipeCategory.RECIPE_TYPE);
        registration.addRecipeCatalyst(new ItemStack(ModItems.GREEN_SPRAY_CAN.get()), SprayerRecipeCategory.RECIPE_TYPE);
        registration.addRecipeCatalyst(new ItemStack(ModItems.BROWN_SPRAY_CAN.get()), SprayerRecipeCategory.RECIPE_TYPE);
        registration.addRecipeCatalyst(new ItemStack(ModItems.ORANGE_SPRAY_CAN.get()), SprayerRecipeCategory.RECIPE_TYPE);
        registration.addRecipeCatalyst(new ItemStack(ModItems.RED_SPRAY_CAN.get()), SprayerRecipeCategory.RECIPE_TYPE);
        registration.addRecipeCatalyst(new ItemStack(ModItems.YELLOW_SPRAY_CAN.get()), SprayerRecipeCategory.RECIPE_TYPE);
        registration.addRecipeCatalyst(new ItemStack(ModItems.LIME_SPRAY_CAN.get()), SprayerRecipeCategory.RECIPE_TYPE);
        registration.addRecipeCatalyst(new ItemStack(ModItems.GRAY_SPRAY_CAN.get()), SprayerRecipeCategory.RECIPE_TYPE);
        registration.addRecipeCatalyst(new ItemStack(ModItems.LIGHT_GRAY_SPRAY_CAN.get()), SprayerRecipeCategory.RECIPE_TYPE);
        registration.addRecipeCatalyst(new ItemStack(ModItems.LIGHT_BLUE_SPRAY_CAN.get()), SprayerRecipeCategory.RECIPE_TYPE);
        registration.addRecipeCatalyst(new ItemStack(ModItems.BLUE_SPRAY_CAN.get()), SprayerRecipeCategory.RECIPE_TYPE);

        registration.addRecipeCatalyst(new ItemStack(ModBlocks.STONE_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.WHITE_COLORED_STONE_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.WHITE_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.BLACK_COLORED_STONE_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.BLACK_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.CYAN_COLORED_STONE_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.CYAN_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.PURPLE_COLORED_STONE_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.MAGENTA_COLORED_STONE_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.PINK_COLORED_STONE_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.PINK_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.GREEN_COLORED_STONE_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.GREEN_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.BROWN_COLORED_STONE_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.BROWN_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.ORANGE_COLORED_STONE_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.RED_COLORED_STONE_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.RED_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.YELLOW_COLORED_STONE_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.LIME_COLORED_STONE_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.LIME_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.GRAY_COLORED_STONE_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.GRAY_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.LIGHT_GRAY_COLORED_STONE_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.LIGHT_BLUE_COLORED_STONE_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.BLUE_COLORED_STONE_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.BLUE_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get()), RecipeTypes.CRAFTING);


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