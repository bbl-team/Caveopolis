package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;

public class BlueTorchBlock extends ModTorchBlock {
    public BlueTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.BLUE_FLAME_PARTICLES::get);
    }
}
