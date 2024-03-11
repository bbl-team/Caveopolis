package com.benbenlaw.caveopolis.events;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.particles.ModParticles;
import com.benbenlaw.caveopolis.particles.custom.*;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Caveopolis.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModParticleClintBusEvent {

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void registerParticleFactories(final RegisterParticleProvidersEvent event) {

        Minecraft.getInstance().particleEngine.register(ModParticles.LIGHT_BLUE_FLAME_PARTICLES.get(),
                LightBlueFlameParticles.Provider::new);

        Minecraft.getInstance().particleEngine.register(ModParticles.BLUE_FLAME_PARTICLES.get(),
                BlueFlameParticles.Provider::new);


        Minecraft.getInstance().particleEngine.register(ModParticles.LIGHT_GRAY_FLAME_PARTICLES.get(),
                LightGrayFlameParticles.Provider::new);

        Minecraft.getInstance().particleEngine.register(ModParticles.GRAY_FLAME_PARTICLES.get(),
                GrayFlameParticles.Provider::new);

        Minecraft.getInstance().particleEngine.register(ModParticles.CYAN_FLAME_PARTICLES.get(),
                CyanFlameParticles.Provider::new);

        Minecraft.getInstance().particleEngine.register(ModParticles.BROWN_FLAME_PARTICLES.get(),
                BrownFlameParticles.Provider::new);

        Minecraft.getInstance().particleEngine.register(ModParticles.RED_FLAME_PARTICLES.get(),
                RedFlameParticles.Provider::new);

        Minecraft.getInstance().particleEngine.register(ModParticles.BLACK_FLAME_PARTICLES.get(),
                BlackFlameParticles.Provider::new);

        Minecraft.getInstance().particleEngine.register(ModParticles.PINK_FLAME_PARTICLES.get(),
                PinkFlameParticles.Provider::new);

        Minecraft.getInstance().particleEngine.register(ModParticles.GREEN_FLAME_PARTICLES.get(),
                GreenFlameParticles.Provider::new);

        Minecraft.getInstance().particleEngine.register(ModParticles.LIME_FLAME_PARTICLES.get(),
                LimeFlameParticles.Provider::new);

        Minecraft.getInstance().particleEngine.register(ModParticles.MAGENTA_FLAME_PARTICLES.get(),
                MagentaFlameParticles.Provider::new);

        Minecraft.getInstance().particleEngine.register(ModParticles.ORANGE_FLAME_PARTICLES.get(),
                OrangeFlameParticles.Provider::new);

        Minecraft.getInstance().particleEngine.register(ModParticles.PURPLE_FLAME_PARTICLES.get(),
                PurpleFlameParticles.Provider::new);

        Minecraft.getInstance().particleEngine.register(ModParticles.WHITE_FLAME_PARTICLES.get(),
                WhiteFlameParticles.Provider::new);

        Minecraft.getInstance().particleEngine.register(ModParticles.YELLOW_FLAME_PARTICLES.get(),
                YellowFlameParticles.Provider::new);



    }

}
