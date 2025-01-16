package com.benbenlaw.caveopolis.worldgen;

import com.benbenlaw.caveopolis.config.WorldGenConfig;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.levelgen.WorldgenRandom;
import net.minecraft.world.level.levelgen.placement.PlacementContext;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.PlacementModifierType;

import java.util.stream.Stream;

public class PlacementStones extends PlacementModifier {

    private static final PlacementStones INSTANCE = new PlacementStones();
    public static final MapCodec<PlacementModifier> CODEC = MapCodec.unit(() -> INSTANCE);


    @Override
    public Stream<BlockPos> getPositions(PlacementContext placementContext, RandomSource random, BlockPos pos) {
    //    WorldGenLevel level = placementContext.getLevel();
    //    int chunkX = pos.getX() >> 8;
    //    int chunkZ = pos.getZ() >> 8;
    //    ((WorldgenRandom) random).setDecorationSeed(level.getSeed(), chunkX, chunkZ);
        if (WorldGenConfig.shouldColoredStoneSpawn.get()) {
            return Stream.of(pos);
        } else {
            return Stream.empty();
        }
    }

    public static PlacementStones create() {
        return INSTANCE;
    }

    @Override
    public PlacementModifierType<?> type() {
        return CaveopolisWorldGeneration.COLORED_STONES_PLACEMENT.get();
    }
}
