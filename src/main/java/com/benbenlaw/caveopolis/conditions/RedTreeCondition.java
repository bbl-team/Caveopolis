package com.benbenlaw.caveopolis.conditions;

import com.benbenlaw.caveopolis.config.WorldGenConfig;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryCodecs;
import net.neoforged.neoforge.common.conditions.ICondition;

public record RedTreeCondition(boolean redTree) implements ICondition {

    public static final MapCodec<RedTreeCondition> CODEC = RecordCodecBuilder.mapCodec(
            builder -> builder.group(
                    Codec.BOOL.fieldOf("red_tree").forGetter(RedTreeCondition::redTree)
            ).apply(builder, RedTreeCondition::new));
    @Override
    public boolean test(IContext context) {
        return WorldGenConfig.shouldRedTreeSpawn.get();
    }

    @Override
    public MapCodec<? extends ICondition> codec() {
        return CODEC;
    }

    @Override
    public String toString() {
        return "Red Tree Condition";
    }
}
