package com.benbenlaw.caveopolis.util;

import com.benbenlaw.caveopolis.item.ModItems;
import com.benbenlaw.caveopolis.particles.ModParticles;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.world.item.Item;

import java.util.HashMap;
import java.util.Map;

public class SprayCanParticleMappings {

    private  static  final Map<Item, ParticleOptions> sprayCanParticleMappings  = new HashMap<>();

    static {

        sprayCanParticleMappings.put(ModItems.RED_SPRAY_CAN.get(), ModParticles.RED_FLAME_PARTICLES.get());
        sprayCanParticleMappings.put(ModItems.ORANGE_SPRAY_CAN.get(), ModParticles.ORANGE_FLAME_PARTICLES.get());
        sprayCanParticleMappings.put(ModItems.YELLOW_SPRAY_CAN.get(), ModParticles.YELLOW_FLAME_PARTICLES.get());
        sprayCanParticleMappings.put(ModItems.GREEN_SPRAY_CAN.get(), ModParticles.GREEN_FLAME_PARTICLES.get());
        sprayCanParticleMappings.put(ModItems.BLUE_SPRAY_CAN.get(), ModParticles.BLUE_FLAME_PARTICLES.get());
        sprayCanParticleMappings.put(ModItems.PURPLE_SPRAY_CAN.get(), ModParticles.PURPLE_FLAME_PARTICLES.get());
        sprayCanParticleMappings.put(ModItems.BLACK_SPRAY_CAN.get(), ModParticles.BLACK_FLAME_PARTICLES.get());
        sprayCanParticleMappings.put(ModItems.WHITE_SPRAY_CAN.get(), ModParticles.WHITE_FLAME_PARTICLES.get());
        sprayCanParticleMappings.put(ModItems.GRAY_SPRAY_CAN.get(), ModParticles.GRAY_FLAME_PARTICLES.get());
        sprayCanParticleMappings.put(ModItems.LIGHT_GRAY_SPRAY_CAN.get(), ModParticles.LIGHT_GRAY_FLAME_PARTICLES.get());
        sprayCanParticleMappings.put(ModItems.CYAN_SPRAY_CAN.get(), ModParticles.CYAN_FLAME_PARTICLES.get());
        sprayCanParticleMappings.put(ModItems.LIGHT_BLUE_SPRAY_CAN.get(), ModParticles.LIGHT_BLUE_FLAME_PARTICLES.get());
        sprayCanParticleMappings.put(ModItems.PINK_SPRAY_CAN.get(), ModParticles.PINK_FLAME_PARTICLES.get());
        sprayCanParticleMappings.put(ModItems.MAGENTA_SPRAY_CAN.get(), ModParticles.MAGENTA_FLAME_PARTICLES.get());
        sprayCanParticleMappings.put(ModItems.BROWN_SPRAY_CAN.get(), ModParticles.BROWN_FLAME_PARTICLES.get());
        sprayCanParticleMappings.put(ModItems.LIME_SPRAY_CAN.get(), ModParticles.LIME_FLAME_PARTICLES.get());

    }

    public static ParticleOptions getParticleForSprayCan(Item sprayCan) {
        return sprayCanParticleMappings.get(sprayCan);
    }

}
