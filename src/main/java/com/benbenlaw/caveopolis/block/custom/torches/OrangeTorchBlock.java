package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;

public class OrangeTorchBlock extends ModTorchBlock {
    public OrangeTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.ORANGE_FLAME_PARTICLES::get );
    }
}
