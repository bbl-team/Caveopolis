package com.benbenlaw.caveopolis.block.custom.torches;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public class ModTorchBlock extends TorchBlock {
    private final Supplier<ParticleOptions> particleOptionsSupplier;
    public ModTorchBlock(Properties p_57491_, Supplier<ParticleOptions> particleOptionsSupplier) {
        super(p_57491_, ParticleTypes.CLOUD);
        this.particleOptionsSupplier = particleOptionsSupplier;
    }

    public void animateTick(BlockState p_222593_, Level p_222594_, BlockPos p_222595_, RandomSource p_222596_) {
        double $$4 = (double)p_222595_.getX() + 0.5;
        double $$5 = (double)p_222595_.getY() + 0.7;
        double $$6 = (double)p_222595_.getZ() + 0.5;
        p_222594_.addParticle(ParticleTypes.SMOKE, $$4, $$5, $$6, 0.0, 0.0, 0.0);
        p_222594_.addParticle(particleOptionsSupplier.get(), $$4, $$5, $$6, 0.0, 0.0, 0.0);
    }
}
