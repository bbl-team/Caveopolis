package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.world.level.block.TorchBlock;

public class RedTorchBlock extends ModTorchBlock {
    public RedTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.RED_FLAME_PARTICLES::get);
    }
}
