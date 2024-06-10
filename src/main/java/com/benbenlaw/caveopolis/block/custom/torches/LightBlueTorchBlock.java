package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;

public class LightBlueTorchBlock extends ModTorchBlock {
    public LightBlueTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.LIGHT_BLUE_FLAME_PARTICLES::get);
    }
}
