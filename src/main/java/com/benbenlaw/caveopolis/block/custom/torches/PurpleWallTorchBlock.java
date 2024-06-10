package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;

public class PurpleWallTorchBlock extends ModWallTorchBlock {
    public PurpleWallTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.PURPLE_FLAME_PARTICLES::get);
    }
}