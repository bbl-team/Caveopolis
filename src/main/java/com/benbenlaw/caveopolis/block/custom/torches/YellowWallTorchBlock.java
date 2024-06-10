package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;

public class YellowWallTorchBlock extends ModWallTorchBlock {
    public YellowWallTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.YELLOW_FLAME_PARTICLES::get);
    }
}