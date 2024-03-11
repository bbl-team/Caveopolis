package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.world.level.block.WallTorchBlock;

public class GrayWallTorchBlock extends WallTorchBlock {
    public GrayWallTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.GRAY_FLAME_PARTICLES.get());
    }
}