package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.world.level.block.WallTorchBlock;

public class BlackWallTorchBlock extends WallTorchBlock {
    public BlackWallTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.BLACK_FLAME_PARTICLES.get());
    }
}