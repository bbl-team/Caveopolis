package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.world.level.block.TorchBlock;

public class PinkTorchBlock extends TorchBlock {
    public PinkTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.PINK_FLAME_PARTICLES.get());
    }
}
