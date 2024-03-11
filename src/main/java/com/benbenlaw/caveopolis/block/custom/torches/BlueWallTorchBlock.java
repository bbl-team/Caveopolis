package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.block.WallTorchBlock;

public class BlueWallTorchBlock extends WallTorchBlock {
    public BlueWallTorchBlock(Properties pProperties) {
        super(pProperties, ParticleTypes.FLAME);
    }
}