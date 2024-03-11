package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.world.level.block.WallTorchBlock;

public class CyanWallTorchBlock extends WallTorchBlock {
    public CyanWallTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.CYAN_FLAME_PARTICLES.get());
    }
}