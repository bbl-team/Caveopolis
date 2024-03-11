package com.benbenlaw.caveopolis.block.custom.torches;

import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.level.block.WallTorchBlock;

public class PinkWallTorchBlock extends WallTorchBlock {
    public PinkWallTorchBlock(Properties pProperties) {
        super(pProperties, new ParticleOptions() {
            @Override
            public ParticleType<?> getType() {
                return ModParticles.PINK_FLAME_PARTICLES.get(); // Your Type
            }

            @Override
            public void writeToNetwork(FriendlyByteBuf pBuffer) {

            }

            @Override
            public String writeToString() {
                return BuiltInRegistries.PARTICLE_TYPE.getKey(getType()).toString();
            }
        });
    }
}
