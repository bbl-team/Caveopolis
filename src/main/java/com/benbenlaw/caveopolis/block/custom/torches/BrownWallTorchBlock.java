package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.world.level.block.WallTorchBlock;

public class BrownWallTorchBlock extends ModWallTorchBlock {
    public BrownWallTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.BROWN_FLAME_PARTICLES::get);
    }
}