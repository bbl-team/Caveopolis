package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;

public class WhiteTorchBlock extends ModTorchBlock {
    public WhiteTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.WHITE_FLAME_PARTICLES::get);
    }
}
