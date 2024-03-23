package com.benbenlaw.caveopolis.events.client;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.networking.ModMessages;
import com.benbenlaw.caveopolis.networking.packets.ExampleC2SPacket;
import com.benbenlaw.caveopolis.util.KeyBinding;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ClientEvents {

    @Mod.EventBusSubscriber(modid = Caveopolis.MOD_ID, value = Dist.CLIENT)
    public static class ClientForgeEvents {
        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event) {
       //     if(KeyBinding.MASS_SPRAY.consumeClick()) {
        //        ModMessages.sendToServer(new MassSprayPacket());
       //     }
            if(KeyBinding.MASS_SPRAY.isDown()) {
                ModMessages.sendToServer(new ExampleC2SPacket());
            }

        }
    }

    @Mod.EventBusSubscriber(modid = Caveopolis.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {

        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(KeyBinding.MASS_SPRAY);
        }

    }

}
