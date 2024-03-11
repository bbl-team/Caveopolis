package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.world.level.block.WallTorchBlock;

public class PurpleWallTorchBlock extends WallTorchBlock {
    public PurpleWallTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.PURPLE_FLAME_PARTICLES.get());
    }
}