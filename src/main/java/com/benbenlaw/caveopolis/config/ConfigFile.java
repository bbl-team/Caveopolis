package com.benbenlaw.caveopolis.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public final class ConfigFile {

    public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec SPEC;

    public static final ModConfigSpec.ConfigValue<Integer> doesColoredStoneGenerateInWorld;
    public static final ModConfigSpec.ConfigValue<Integer> maxMassBlockState;

    static {
        BUILDER.push("Caveopolis Config File");

        doesColoredStoneGenerateInWorld = BUILDER.comment("Should colored stone spawn in world?, default = true, OVERRIDE USING DATA PACK INSTEAD!")
                .define("Spawn Colored Stone", 1);

        maxMassBlockState = BUILDER.comment("The maximum amount of blocks that can be toggled on/off using the glowstone spray can, default = 128")
                .define("Glowstone Spray Can Range", 128);

        BUILDER.pop();
        SPEC = BUILDER.build();

    }
}
