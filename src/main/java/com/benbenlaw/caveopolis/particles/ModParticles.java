package com.benbenlaw.caveopolis.particles;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.opolisutilities.OpolisUtilities;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModParticles {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
            DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, Caveopolis.MOD_ID);



    public static final RegistryObject<SimpleParticleType> BROWN_FLAME_PARTICLES =
            PARTICLE_TYPES.register("brown_flame_particles", () -> new SimpleParticleType(true));

    public static final RegistryObject<SimpleParticleType> BLUE_FLAME_PARTICLES =
            PARTICLE_TYPES.register("blue_flame_particles", () -> new SimpleParticleType(true));
    public static final RegistryObject<SimpleParticleType> BLACK_FLAME_PARTICLES =
            PARTICLE_TYPES.register("black_flame_particles", () -> new SimpleParticleType(true));

    public static final RegistryObject<SimpleParticleType> WHITE_FLAME_PARTICLES =
            PARTICLE_TYPES.register("white_flame_particles", () -> new SimpleParticleType(true));

    public static final RegistryObject<SimpleParticleType> PURPLE_FLAME_PARTICLES =
            PARTICLE_TYPES.register("purple_flame_particles", () -> new SimpleParticleType(true));

    public static final RegistryObject<SimpleParticleType> PINK_FLAME_PARTICLES =
            PARTICLE_TYPES.register("pink_flame_particles", () -> new SimpleParticleType(true));

    public static final RegistryObject<SimpleParticleType> LIGHT_BLUE_FLAME_PARTICLES =
            PARTICLE_TYPES.register("light_blue_flame_particles", () -> new SimpleParticleType(true));

    public static final RegistryObject<SimpleParticleType> MAGENTA_FLAME_PARTICLES =
            PARTICLE_TYPES.register("magenta_flame_particles", () -> new SimpleParticleType(true));

    public static final RegistryObject<SimpleParticleType> LIME_FLAME_PARTICLES =
            PARTICLE_TYPES.register("lime_flame_particles", () -> new SimpleParticleType(true));

    public static final RegistryObject<SimpleParticleType> CYAN_FLAME_PARTICLES =
            PARTICLE_TYPES.register("cyan_flame_particles", () -> new SimpleParticleType(true));

    public static final RegistryObject<SimpleParticleType> GRAY_FLAME_PARTICLES =
            PARTICLE_TYPES.register("gray_flame_particles", () -> new SimpleParticleType(true));


    public static final RegistryObject<SimpleParticleType> GREEN_FLAME_PARTICLES =
            PARTICLE_TYPES.register("green_flame_particles", () -> new SimpleParticleType(true));

    public static final RegistryObject<SimpleParticleType> ORANGE_FLAME_PARTICLES =
            PARTICLE_TYPES.register("orange_flame_particles", () -> new SimpleParticleType(true));

    public static final RegistryObject<SimpleParticleType> RED_FLAME_PARTICLES =
            PARTICLE_TYPES.register("red_flame_particles", () -> new SimpleParticleType(true));

    public static final RegistryObject<SimpleParticleType> YELLOW_FLAME_PARTICLES =
            PARTICLE_TYPES.register("yellow_flame_particles", () -> new SimpleParticleType(true));

    public static final RegistryObject<SimpleParticleType> LIGHT_GRAY_FLAME_PARTICLES =
            PARTICLE_TYPES.register("light_gray_flame_particles", () -> new SimpleParticleType(true));



    public static void register(IEventBus eventBus) {

        PARTICLE_TYPES.register(eventBus);
    }
}
