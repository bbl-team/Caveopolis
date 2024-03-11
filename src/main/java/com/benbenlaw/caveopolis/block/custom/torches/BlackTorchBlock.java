package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.world.level.block.TorchBlock;

public class BlackTorchBlock extends TorchBlock {
    public BlackTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.BLACK_FLAME_PARTICLES.get());
    }
}
