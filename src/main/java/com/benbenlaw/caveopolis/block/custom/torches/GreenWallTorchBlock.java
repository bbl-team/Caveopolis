package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;

public class GreenWallTorchBlock extends ModWallTorchBlock {
    public GreenWallTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.GREEN_FLAME_PARTICLES::get);
    }
}