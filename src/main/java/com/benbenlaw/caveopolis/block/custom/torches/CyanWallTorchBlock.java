package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;

public class CyanWallTorchBlock extends ModWallTorchBlock {
    public CyanWallTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.CYAN_FLAME_PARTICLES::get);
    }
}