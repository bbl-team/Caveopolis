package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.world.level.block.TorchBlock;

public class LightGrayTorchBlock extends ModTorchBlock {
    public LightGrayTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.LIGHT_GRAY_FLAME_PARTICLES::get);
    }
}
