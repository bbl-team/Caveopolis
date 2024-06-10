package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;

public class OrangeWallTorchBlock extends ModWallTorchBlock {
    public OrangeWallTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.ORANGE_FLAME_PARTICLES::get);
    }
}