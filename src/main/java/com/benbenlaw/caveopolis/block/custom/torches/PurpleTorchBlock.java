package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.world.level.block.TorchBlock;

public class PurpleTorchBlock extends ModTorchBlock {
    public PurpleTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.PURPLE_FLAME_PARTICLES::get);
    }
}
