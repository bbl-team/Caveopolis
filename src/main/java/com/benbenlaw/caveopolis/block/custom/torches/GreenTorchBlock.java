package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;

public class GreenTorchBlock extends ModTorchBlock {
    public GreenTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.GREEN_FLAME_PARTICLES::get);
    }
}
