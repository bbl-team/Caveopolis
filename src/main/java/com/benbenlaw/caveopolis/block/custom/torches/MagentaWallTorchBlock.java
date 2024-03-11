package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.world.level.block.WallTorchBlock;

public class MagentaWallTorchBlock extends WallTorchBlock {
    public MagentaWallTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.MAGENTA_FLAME_PARTICLES.get());
    }
}