package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.world.level.block.WallTorchBlock;

public class OrangeWallTorchBlock extends WallTorchBlock {
    public OrangeWallTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.ORANGE_FLAME_PARTICLES.get());
    }
}