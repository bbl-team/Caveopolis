package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.world.level.block.TorchBlock;

public class BrownTorchBlock extends ModTorchBlock {
    public BrownTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.BROWN_FLAME_PARTICLES::get);
    }
}
