package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.world.level.block.TorchBlock;

public class YellowTorchBlock extends ModTorchBlock {
    public YellowTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.YELLOW_FLAME_PARTICLES::get);
    }
}
