package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.world.level.block.TorchBlock;

public class WhiteTorchBlock extends ModTorchBlock {
    public WhiteTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.WHITE_FLAME_PARTICLES::get);
    }
}
