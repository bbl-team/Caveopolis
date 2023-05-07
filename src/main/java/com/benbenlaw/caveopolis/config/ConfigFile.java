package com.benbenlaw.caveopolis.config;

import net.minecraftforge.common.ForgeConfigSpec;

public final class ConfigFile {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> doesColoredStoneGenerateInWorld;

    static {
        BUILDER.push("Caveopolis Config File");

        doesColoredStoneGenerateInWorld = BUILDER.comment("Should colored stone spawn in world?, default = true")
                .define("Spawn Colored Stone", 1);

        BUILDER.pop();
        SPEC = BUILDER.build();

    }
}
