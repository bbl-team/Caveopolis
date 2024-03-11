package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.world.level.block.WallTorchBlock;

public class RedWallTorchBlock extends WallTorchBlock {
    public RedWallTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.RED_FLAME_PARTICLES.get());
    }
}