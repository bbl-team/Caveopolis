package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.world.level.block.TorchBlock;

public class LimeTorchBlock extends TorchBlock {
    public LimeTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.LIME_FLAME_PARTICLES.get());
    }
}
