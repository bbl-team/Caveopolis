package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.world.level.block.TorchBlock;

public class GrayTorchBlock extends ModTorchBlock {
    public GrayTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.GRAY_FLAME_PARTICLES::get);
    }
}
