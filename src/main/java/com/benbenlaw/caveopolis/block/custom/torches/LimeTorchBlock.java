package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;

public class LimeTorchBlock extends ModTorchBlock {
    public LimeTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.LIME_FLAME_PARTICLES::get);
    }
}
