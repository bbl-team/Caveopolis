package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;

public class BlackWallTorchBlock extends ModWallTorchBlock {
    public BlackWallTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.BLACK_FLAME_PARTICLES::get);
    }
}