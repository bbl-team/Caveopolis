package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;

public class PinkWallTorchBlock extends ModWallTorchBlock {
    public PinkWallTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.PINK_FLAME_PARTICLES::get);
    }
}