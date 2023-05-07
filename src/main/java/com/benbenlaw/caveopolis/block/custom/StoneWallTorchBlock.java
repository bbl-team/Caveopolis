package com.benbenlaw.caveopolis.block.custom;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.block.*;

public class StoneWallTorchBlock extends WallTorchBlock {
    public StoneWallTorchBlock(Properties pProperties) {
        super(pProperties, ParticleTypes.FLAME);
    }

}