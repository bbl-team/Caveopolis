package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;

public class BlueWallTorchBlock extends ModWallTorchBlock {
    public BlueWallTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.BLUE_FLAME_PARTICLES::get);
    }
}