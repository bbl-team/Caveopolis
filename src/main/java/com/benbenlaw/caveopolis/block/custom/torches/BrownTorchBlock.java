package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;

public class BrownTorchBlock extends ModTorchBlock {
    public BrownTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.BROWN_FLAME_PARTICLES::get);
    }
}
