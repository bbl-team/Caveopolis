package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.world.level.block.TorchBlock;

public class MagentaTorchBlock extends ModTorchBlock {
    public MagentaTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.MAGENTA_FLAME_PARTICLES::get);
    }
}
