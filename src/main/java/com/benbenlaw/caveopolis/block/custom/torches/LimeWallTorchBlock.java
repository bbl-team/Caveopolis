package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;

public class LimeWallTorchBlock extends ModWallTorchBlock {
    public LimeWallTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.LIME_FLAME_PARTICLES::get);
    }
}