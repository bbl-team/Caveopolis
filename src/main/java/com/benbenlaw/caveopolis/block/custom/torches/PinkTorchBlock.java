package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;

public class PinkTorchBlock extends ModTorchBlock {
    public PinkTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.PINK_FLAME_PARTICLES::get);
    }
}
