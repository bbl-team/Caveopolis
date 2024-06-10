package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;

public class LightGrayWallTorchBlock extends ModWallTorchBlock {
    public LightGrayWallTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.LIGHT_GRAY_FLAME_PARTICLES::get);
    }
}