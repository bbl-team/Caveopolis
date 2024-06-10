package com.benbenlaw.caveopolis.particles;

import com.benbenlaw.caveopolis.Caveopolis;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModParticles {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
            DeferredRegister.create(BuiltInRegistries.PARTICLE_TYPE, Caveopolis.MOD_ID);



    public static final DeferredHolder<ParticleType<?>, SimpleParticleType> BROWN_FLAME_PARTICLES =
            PARTICLE_TYPES.register("brown_flame_particles", () -> new SimpleParticleType(true));

    public static final DeferredHolder<ParticleType<?>, SimpleParticleType> BLUE_FLAME_PARTICLES =
            PARTICLE_TYPES.register("blue_flame_particles", () -> new SimpleParticleType(true));
    public static final DeferredHolder<ParticleType<?>, SimpleParticleType> BLACK_FLAME_PARTICLES =
            PARTICLE_TYPES.register("black_flame_particles", () -> new SimpleParticleType(true));

    public static final DeferredHolder<ParticleType<?>, SimpleParticleType> WHITE_FLAME_PARTICLES =
            PARTICLE_TYPES.register("white_flame_particles", () -> new SimpleParticleType(true));

    public static final DeferredHolder<ParticleType<?>, SimpleParticleType> PURPLE_FLAME_PARTICLES =
            PARTICLE_TYPES.register("purple_flame_particles", () -> new SimpleParticleType(true));

    public static final DeferredHolder<ParticleType<?>, SimpleParticleType> PINK_FLAME_PARTICLES =
            PARTICLE_TYPES.register("pink_flame_particles", () -> new SimpleParticleType(true));

    public static final DeferredHolder<ParticleType<?>, SimpleParticleType> LIGHT_BLUE_FLAME_PARTICLES =
            PARTICLE_TYPES.register("light_blue_flame_particles", () -> new SimpleParticleType(true));

    public static final DeferredHolder<ParticleType<?>, SimpleParticleType> MAGENTA_FLAME_PARTICLES =
            PARTICLE_TYPES.register("magenta_flame_particles", () -> new SimpleParticleType(true));

    public static final DeferredHolder<ParticleType<?>, SimpleParticleType> LIME_FLAME_PARTICLES =
            PARTICLE_TYPES.register("lime_flame_particles", () -> new SimpleParticleType(true));

    public static final DeferredHolder<ParticleType<?>, SimpleParticleType> CYAN_FLAME_PARTICLES =
            PARTICLE_TYPES.register("cyan_flame_particles", () -> new SimpleParticleType(true));

    public static final DeferredHolder<ParticleType<?>, SimpleParticleType> GRAY_FLAME_PARTICLES =
            PARTICLE_TYPES.register("gray_flame_particles", () -> new SimpleParticleType(true));


    public static final DeferredHolder<ParticleType<?>, SimpleParticleType> GREEN_FLAME_PARTICLES =
            PARTICLE_TYPES.register("green_flame_particles", () -> new SimpleParticleType(true));

    public static final DeferredHolder<ParticleType<?>, SimpleParticleType> ORANGE_FLAME_PARTICLES =
            PARTICLE_TYPES.register("orange_flame_particles", () -> new SimpleParticleType(true));

    public static final DeferredHolder<ParticleType<?>, SimpleParticleType> RED_FLAME_PARTICLES =
            PARTICLE_TYPES.register("red_flame_particles", () -> new SimpleParticleType(true));

    public static final DeferredHolder<ParticleType<?>, SimpleParticleType> YELLOW_FLAME_PARTICLES =
            PARTICLE_TYPES.register("yellow_flame_particles", () -> new SimpleParticleType(true));

    public static final DeferredHolder<ParticleType<?>, SimpleParticleType> LIGHT_GRAY_FLAME_PARTICLES =
            PARTICLE_TYPES.register("light_gray_flame_particles", () -> new SimpleParticleType(true));



    public static void register(IEventBus eventBus) {

        PARTICLE_TYPES.register(eventBus);
    }
}
