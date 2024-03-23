package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.block.WallTorchBlock;

public class BlueWallTorchBlock extends ModWallTorchBlock {
    public BlueWallTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.BLUE_FLAME_PARTICLES::get);
    }
}