package com.benbenlaw.caveopolis.block.custom.torches;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.WallTorchBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public class ModWallTorchBlock extends WallTorchBlock {
    private final Supplier<ParticleOptions> particleOptionsSupplier;
    public ModWallTorchBlock(Properties p_57491_, Supplier<ParticleOptions> particleOptionsSupplier) {
        super(p_57491_, ParticleTypes.CLOUD);
        this.particleOptionsSupplier = particleOptionsSupplier;
    }

    public void animateTick(BlockState p_222660_, Level p_222661_, BlockPos p_222662_, RandomSource p_222663_) {
        Direction $$4 = (Direction)p_222660_.getValue(FACING);
        double $$5 = (double)p_222662_.getX() + 0.5;
        double $$6 = (double)p_222662_.getY() + 0.7;
        double $$7 = (double)p_222662_.getZ() + 0.5;
        double $$8 = 0.22;
        double $$9 = 0.27;
        Direction $$10 = $$4.getOpposite();
        p_222661_.addParticle(ParticleTypes.SMOKE, $$5 + 0.27 * (double)$$10.getStepX(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.getStepZ(), 0.0, 0.0, 0.0);
        p_222661_.addParticle(particleOptionsSupplier.get(), $$5 + 0.27 * (double)$$10.getStepX(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.getStepZ(), 0.0, 0.0, 0.0);
    }
}