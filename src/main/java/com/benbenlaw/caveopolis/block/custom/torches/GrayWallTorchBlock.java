package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;

public class GrayWallTorchBlock extends ModWallTorchBlock {
    public GrayWallTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.GRAY_FLAME_PARTICLES::get);
    }
}