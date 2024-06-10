package com.benbenlaw.caveopolis.event.client;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.networking.ModMessages;
import com.benbenlaw.caveopolis.networking.packets.MassSprayingPacket;
import com.benbenlaw.caveopolis.util.KeyBinding;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.InputEvent;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;

public class ClientEvents {

    @EventBusSubscriber(modid = Caveopolis.MOD_ID ,value = Dist.CLIENT)
    public static class ClientForgeEvents {
        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event) {
       //     if(KeyBinding.MASS_SPRAY.consumeClick()) {
        //        ModMessages.sendToServer(new MassSprayPacket());
       //     }
            if(KeyBinding.MASS_SPRAY.isDown()) {
             //   ModMessages.sendToServer(new MassSprayingPacket());
            }

        }
    }

    @EventBusSubscriber(modid = Caveopolis.MOD_ID, bus = EventBusSubscriber.Bus.MOD ,value = Dist.CLIENT)
    public static class ClientModBusEvents {

        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(KeyBinding.MASS_SPRAY);
        }

    }

}
