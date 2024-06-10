package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;

public class RedWallTorchBlock extends ModWallTorchBlock {
    public RedWallTorchBlock(Properties pProperties) {
        super(pProperties,  ModParticles.RED_FLAME_PARTICLES::get);
    }
}