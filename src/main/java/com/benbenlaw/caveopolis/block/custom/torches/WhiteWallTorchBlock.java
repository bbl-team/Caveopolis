package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.world.level.block.WallTorchBlock;

public class WhiteWallTorchBlock extends ModWallTorchBlock {
    public WhiteWallTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.WHITE_FLAME_PARTICLES::get);
    }
}