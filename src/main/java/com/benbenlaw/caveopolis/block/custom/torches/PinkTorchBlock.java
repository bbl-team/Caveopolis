package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.block.TorchBlock;

public class PinkTorchBlock extends ModTorchBlock {
    public PinkTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.PINK_FLAME_PARTICLES::get);
    }
}
