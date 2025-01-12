package com.benbenlaw.caveopolis.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class RecipeConfig {

    public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec SPEC;
    public static final ModConfigSpec.ConfigValue<Boolean> coloringRecipes;
    public static final ModConfigSpec.ConfigValue<Boolean> flowerToDyeRecipes;
    public static final ModConfigSpec.ConfigValue<Boolean> lightingRecipes;

    static {

        // Caveopolis Configs
        BUILDER.comment("Caveopolis Recipes Config")
                .push("Caveopolis");

        coloringRecipes = BUILDER.comment("If the crafting table can color blocks, default = true")
                .define("Crafting Tables Color Blocks", true);

        flowerToDyeRecipes = BUILDER.comment("If the crafting table can turn caveopolis flowers into dye, default = true")
                .define("Crafting Tables Flower to Dye", true);

        lightingRecipes = BUILDER.comment("If the crafting table can make a caveopolis block lit, default = true")
                .define("Crafting Tables Light Blocks", true);


        BUILDER.pop();

        //LAST
        SPEC = BUILDER.build();

    }

}
