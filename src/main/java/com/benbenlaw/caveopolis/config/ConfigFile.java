package com.benbenlaw.caveopolis.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public final class ConfigFile {

    public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec SPEC;

    public static final ModConfigSpec.ConfigValue<Integer> doesColoredStoneGenerateInWorld;

    static {
        BUILDER.push("Caveopolis Config File");

        doesColoredStoneGenerateInWorld = BUILDER.comment("Should colored stone spawn in world?, default = true, OVERRIDE USING DATA PACK INSTEAD!")
                .define("Spawn Colored Stone", 1);

        BUILDER.pop();
        SPEC = BUILDER.build();

    }
}
