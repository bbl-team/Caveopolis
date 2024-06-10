package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;

public class RedTorchBlock extends ModTorchBlock {
    public RedTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.RED_FLAME_PARTICLES::get);
    }
}
