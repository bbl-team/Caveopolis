package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;

public class BlackTorchBlock extends ModTorchBlock {
    public BlackTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.BLACK_FLAME_PARTICLES::get);
    }
}
