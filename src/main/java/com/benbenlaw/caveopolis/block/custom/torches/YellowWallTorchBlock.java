package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.world.level.block.WallTorchBlock;

public class YellowWallTorchBlock extends WallTorchBlock {
    public YellowWallTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.YELLOW_FLAME_PARTICLES.get());
    }
}