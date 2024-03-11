package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.world.level.block.WallTorchBlock;

public class PinkWallTorchBlock extends WallTorchBlock {
    public PinkWallTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.PINK_FLAME_PARTICLES.get());
    }
}