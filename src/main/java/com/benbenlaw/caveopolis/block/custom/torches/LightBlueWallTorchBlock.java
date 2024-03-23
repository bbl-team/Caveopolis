package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.world.level.block.WallTorchBlock;

public class LightBlueWallTorchBlock extends ModWallTorchBlock {
    public LightBlueWallTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.LIGHT_BLUE_FLAME_PARTICLES::get);
    }
}