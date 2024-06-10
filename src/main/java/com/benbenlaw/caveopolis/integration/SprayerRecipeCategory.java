package com.benbenlaw.caveopolis.integration;

/*
public class SprayerRecipeCategory implements IRecipeCategory<SprayerRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(Caveopolis.MOD_ID, "sprayer");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(Caveopolis.MOD_ID, "textures/gui/sprayer_gui_jei.png");

    static final RecipeType<SprayerRecipe> RECIPE_TYPE = RecipeType.create(Caveopolis.MOD_ID, "sprayer",
            SprayerRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public SprayerRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 120, 19);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.SPRAYER.get()));
    }

    @Override
    public RecipeType<SprayerRecipe> getRecipeType() {
        return JEICaveopolisPlugin.SPRAYER;
    }

    @Override
    public Component getTitle() {
        return Component.literal("Sprayer / Spraying");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, SprayerRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.CATALYST, 12, 2).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 45, 2).addIngredients(recipe.getIngredients().get(1));
        assert Minecraft.getInstance().level != null;
        builder.addSlot(RecipeIngredientRole.OUTPUT, 91, 2).addItemStack(new ItemStack(recipe.getResultItem(Minecraft.getInstance().level.registryAccess()).getItem()));
    }
}

 */