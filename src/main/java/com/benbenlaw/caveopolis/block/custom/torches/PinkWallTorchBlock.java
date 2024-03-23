package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.WallTorchBlock;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class PinkWallTorchBlock extends ModWallTorchBlock {
    public PinkWallTorchBlock(Properties pProperties) {
        super(pProperties, ModParticles.PINK_FLAME_PARTICLES::get);
    }
}