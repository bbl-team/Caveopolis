package com.benbenlaw.caveopolis.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class WorldGenConfig {

    public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec SPEC;
    public static final ModConfigSpec.ConfigValue<Boolean> shouldRedTreeSpawn;
    public static final ModConfigSpec.ConfigValue<Boolean> shouldColoredStoneSpawn;
    public static final ModConfigSpec.ConfigValue<Boolean> shouldColoredTreesSpawn;

    static {

        // Caveopolis Configs
        BUILDER.comment("Caveopolis World Gen Config")
                .push("Caveopolis");

        shouldRedTreeSpawn = BUILDER.comment("If the red tree should spawn in world, default = true")
                .define("Red Tree Spawn", true);

        shouldColoredStoneSpawn = BUILDER.comment("If the colored stone should spawn in world, default = true")
                .define("Colored Stone Spawn", true);

        shouldColoredTreesSpawn = BUILDER.comment("If the colored trees should spawn in world, default = true")
                .define("Colored Trees Spawn", true);



        BUILDER.pop();

        //LAST
        SPEC = BUILDER.build();

    }

}
