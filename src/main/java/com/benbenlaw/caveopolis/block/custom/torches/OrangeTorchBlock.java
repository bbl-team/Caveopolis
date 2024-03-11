package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.world.level.block.TorchBlock;

public class OrangeTorchBlock extends TorchBlock {
    public OrangeTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.ORANGE_FLAME_PARTICLES.get());
    }
}
