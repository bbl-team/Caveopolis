package com.benbenlaw.caveopolis.worldgen.tree;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;

public class HugeTrunkPlacer extends TrunkPlacer {

    public static final MapCodec<HugeTrunkPlacer> CODEC = RecordCodecBuilder.mapCodec(instance ->
            trunkPlacerParts(instance).apply(instance, HugeTrunkPlacer::new)
    );

    public HugeTrunkPlacer(int baseHeight, int heightRandA, int heightRandB) {
        super(baseHeight, heightRandA, heightRandB);
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return CaveopolisTrunkPlacers.HUGE_TRUNK_PLACER.get();
    }

    private int stage3Height;
    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader reader, BiConsumer<BlockPos, BlockState> replacer,
                                                            RandomSource random, int height, BlockPos pos, TreeConfiguration config) {
        List<FoliagePlacer.FoliageAttachment> foliageAttachments = new ArrayList<>();

        // Define three stages for the trunk width reduction
        int stage1Height = (int) (height * 0.3);  // The bottom 30% for the widest part
        int stage2Height = (int) (height * 0.6);  // The middle 30% for the second part
        stage3Height = height;               // The last 40% for the narrowest part

        for (int dy = 0; dy < height; dy++) {
            // Stage 1: Widest
            if (dy < stage1Height) {
                // Width for the first stage
                int layerWidth = 3;
                placeLayer(pos, dy, layerWidth, replacer, random, config);
            }
            // Stage 2: Middle
            else if (dy < stage2Height) {
                // Width for the second stage
                int layerWidth = 2;
                placeLayer(pos, dy, layerWidth, replacer, random, config);
            }
            // Stage 3: Narrowest
            else {
                // Width for the third stage
                int layerWidth = 1;
                placeLayer(pos, dy, layerWidth, replacer, random, config);
            }
        }

        foliageAttachments.add(new FoliagePlacer.FoliageAttachment(pos.above(height), 0, false));
        return foliageAttachments;
    }

    private void placeLayer(BlockPos pos, int dy, int layerWidth, BiConsumer<BlockPos, BlockState> replacer,
                            RandomSource random, TreeConfiguration config) {
        boolean isBaseLayer = (dy == 0); // Check if we're on the bottom layer
        boolean isLowerTrunk = (dy < stage3Height * 0.3); // Define "lower trunk" section (e.g., bottom 30%)

        for (int dx = -layerWidth; dx <= layerWidth; dx++) {
            for (int dz = -layerWidth; dz <= layerWidth; dz++) {
                int distanceFromCenter = Math.abs(dx) + Math.abs(dz);
                boolean isCorner = Math.abs(dx) == layerWidth && Math.abs(dz) == layerWidth;

                // Place main trunk blocks in the center and avoid corners
                if (distanceFromCenter <= layerWidth && !(isLowerTrunk && isCorner)) {
                    BlockPos trunkPos = pos.offset(dx, dy, dz);
                    replacer.accept(trunkPos, config.trunkProvider.getState(random, trunkPos));
                }

                // Smoothing edge transitions, applied only above lower trunk
                if (!isBaseLayer && dy < stage3Height && !isLowerTrunk) {
                    // Fill between layers to smooth edges, avoiding corners at the lower trunk
                    if ((isCorner && layerWidth > 1) || distanceFromCenter == layerWidth) {
                        BlockPos transitionPos = pos.offset(dx, dy - 1, dz);
                        replacer.accept(transitionPos, config.trunkProvider.getState(random, transitionPos));
                    }
                }
            }
        }
    }








}
