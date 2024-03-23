package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.world.level.block.TorchBlock;

public class CyanTorchBlock extends ModTorchBlock {
    public CyanTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.CYAN_FLAME_PARTICLES::get);
    }
}
